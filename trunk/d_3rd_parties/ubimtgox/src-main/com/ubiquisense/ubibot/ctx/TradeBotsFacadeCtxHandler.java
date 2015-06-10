/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package com.ubiquisense.ubibot.ctx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.mtgox.MTGox;
import net.sf.smbt.btc.mtgox.server.FetchValueAdapterImpl;
import net.sf.smbt.btc.mtgox.server.ITriggerListener;
import net.sf.smbt.btc.mtgox.server.TradeProcessingUtils;
import net.sf.smbt.btc.utils.BTCResourceUtils;
import net.sf.smbt.trading.JsonNotification;
import net.sf.smbt.trading.Order;
import net.sf.smbt.trading.PriceRule;
import net.sf.smbt.trading.Robot;
import net.sf.smbt.trading.TradeBotsConfig;
import net.sf.smbt.trading.TradingFactory;
import net.sf.smbt.trading.TradingRule;
import net.sf.smbt.trading.Trigger;
import net.sf.smbt.trading.TriggerKind;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.ubiquisense.ubibot.websocket.UbiWeSocketIOServer;

public class TradeBotsFacadeCtxHandler extends AbstractHandler {
	public final static String ALERTS_ROBOT_KEY = "ALERTS_ROBOT_KEY";
	public List<String> alertsRobotUUID;
	
	private UbiWeSocketIOServer websocket;
	private Map<String, Robot> robotsMap;
	private TradeBotsConfig localTradeBotConfigs;
	private MTGox mtgox;
	private TradeProcessingUtils tradeProcessingUtils;
	private File storageDir;
	
	public TradeBotsFacadeCtxHandler(UbiWeSocketIOServer websocket, MTGox mtgox, TradeProcessingUtils tradeProcessingUtils, File storageDir) {
		this.mtgox					= mtgox;
		this.localTradeBotConfigs	= TradingFactory.eINSTANCE.createTradeBotsConfig();
		this.storageDir 			= storageDir;
		this.robotsMap				= new HashMap<String, Robot>();
		this.tradeProcessingUtils	= tradeProcessingUtils;
		this.alertsRobotUUID		= new ArrayList<String>();
		this.websocket 				= websocket;
		checkAlertsTradebot();
		initTradeBrodcastListeners();
	}
	public void initTradeBrodcastListeners() {
		tradeProcessingUtils.addTriggerListener(new ITriggerListener() {
			@Override
			public void handle(Trigger t) {
				try {
					String alertsBotFilePath = storageDir.getCanonicalPath() + "/" + ALERTS_ROBOT_KEY + ".bots";
					BTCResourceUtils.INSTANCE.save((TradeBotsConfig)t.eContainer().eContainer(), alertsBotFilePath);
				} catch (IOException e) {
					e.printStackTrace();
				}

				JSONObject alert = buildAlert(t);
				try {
					websocket.getJsonNotificationsQueue().put(alert.toString());
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		});
	}
	public void checkAlertsTradebot() {
		try {
			String alertsBotFilePath = storageDir.getCanonicalPath() + "/" + ALERTS_ROBOT_KEY + ".bots";
			File alertsBotFile = new File(alertsBotFilePath);
			if (!alertsBotFile.exists()) {
				TradeBotsConfig cfg = TradingFactory.eINSTANCE.createTradeBotsConfig();
				Robot alertsRobot = TradingFactory.eINSTANCE.createRobot();
				alertsRobot.setUuid(UUID.randomUUID().toString());
				alertsRobot.setLabel("Default Alerts Robot");
				alertsRobotUUID.add(alertsRobot.getUuid());
				cfg.getBots().add(alertsRobot);
				robotsMap.put(alertsRobot.getUuid(), alertsRobot);
				BTCResourceUtils.INSTANCE.save(cfg, alertsBotFilePath);
			} else {
				TradeBotsConfig cfg = BTCResourceUtils.INSTANCE.load(alertsBotFilePath);
				for (Robot r : cfg.getBots()) {
					if (!robotsMap.containsKey(r.getUuid())) {
						robotsMap.put(r.getUuid(), r);
					}
					if (!alertsRobotUUID.contains(r.getUuid())) {
						alertsRobotUUID.add(r.getUuid());
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void updateBotsConfig(Map<String, TradeBotsConfig> configsMap) {
		for (String k : configsMap.keySet()) {
			TradeBotsConfig cfg = configsMap.get(k);
			if (cfg != null) {
				for (Robot r : cfg.getBots()) {
					if (!robotsMap.containsKey(r.getUuid())) {
						robotsMap.put(r.getUuid(), r);
					}
				}
			}
		}
	}
	
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		if ("/bots/fetch".equals(target)) {
			JsonObject jobj = new JsonObject();
			
			JsonObject bots = new JsonObject();
			JsonArray array = new JsonArray();
			for (String k : robotsMap.keySet()) {
				if (!alertsRobotUUID.contains(k)) {
					Robot r = robotsMap.get(k);
					JsonObject bot = new JsonObject();
					bot.add("uuid", new JsonPrimitive(k));
					bot.add("label", new JsonPrimitive(r.getLabel()));
					try {
						JsonArray triggersArray = new JsonArray();
						for (Trigger t : r.getTriggers()) {
							JsonObject trigger = new JsonObject();
							trigger.add("label", new JsonPrimitive(t.getLabel() == null ? "" : t.getLabel()));
							JsonArray ordersArray = new JsonArray();
							for (Order order : t.getOrders()) {
								JsonObject jOrder = new JsonObject();
								jOrder.add("message", new JsonPrimitive(order.getMessage() == null ? "" : order.getMessage()));
								//jOrder.add("date", new JsonPrimitive(order.getDate() == null ? "" : order.getDate));
								jOrder.add("price_int", new JsonPrimitive(""+order.getPrice_int()));
								jOrder.add("volume", new JsonPrimitive(""+order.getVolume()));
								jOrder.add("currency", new JsonPrimitive(order.getCurrency().getLiteral()));
								jOrder.add("kind", new JsonPrimitive(order.getKind().getLiteral()));
								ordersArray.add(jOrder);
							}
							JsonArray rulesArray = new JsonArray();
							for (TradingRule rule : t.getRules()) {
								JsonObject jRule = new JsonObject();
								jRule.add("compliance", new JsonPrimitive(""+rule.getCompliance()));
								jRule.add("label", new JsonPrimitive(""+rule.getLabel()));
								jRule.add("ratio", new JsonPrimitive(""+rule.getRatio()));
								jRule.add("kind", new JsonPrimitive(rule.getTrigger().getLiteral()));
								ordersArray.add(jRule);
							}
							trigger.add("orders", ordersArray);
							trigger.add("rules", rulesArray);
							
							triggersArray.add(trigger);
						}
						bot.add("triggers", triggersArray);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					array.add(bot);
				}
			}
			bots.add("bots", array);
			jobj.add("return", bots);
			
			response.setContentType("application/json;charset=utf-8");
			response.setStatus(HttpServletResponse.SC_OK);
			baseRequest.setHandled(true);
			response.getWriter().println(jobj.toString());
		} else if ("/bots/clear".equals(target)) {
			localTradeBotConfigs.getBots().clear();	
			response.setContentType("application/json;charset=utf-8");
			response.setStatus(HttpServletResponse.SC_OK);
			baseRequest.setHandled(true);
			response.getWriter().println("{\"result\":\"success\"}");
		} else if ("/bots/create".equals(target)) { // CRud
			Map paramsCreate = request.getParameterMap();
			for (Object k : paramsCreate.keySet()) {
				if (k instanceof String) {
					if (((String)k).equals("uuid")) {
						String[] va = (String[])paramsCreate.get(k);
						Robot bot = tradeProcessingUtils.addBot(localTradeBotConfigs, va[0]);
						if (bot != null) {
							response.setContentType("application/json;charset=utf-8");
							response.setStatus(HttpServletResponse.SC_OK);
							baseRequest.setHandled(true);
							response.getWriter().println("{\"result\":\"success\",\"data\":{\"uuid\":\"" + va[0] + "\"}}");
						} else {
							response.setContentType("application/json;charset=utf-8");
							response.setStatus(HttpServletResponse.SC_OK);
							baseRequest.setHandled(true);
							response.getWriter().println("{\"result\":\"error\",\"data\":{\"uuid\":\"" + va[0] + "\"}}");
						}
					}
				}
			}
		} else if ("/bots/delete".equals(target)) { // cruD
			Map paramsCreate = request.getParameterMap();
			for (Object k : paramsCreate.keySet()) {
				if (k instanceof String) {
					if (((String)k).equals("uuid")) {
						String[] va = (String[])paramsCreate.get(k);
						Robot bot = tradeProcessingUtils.delBot(localTradeBotConfigs, va[0]);
						if (bot != null) {
							response.setContentType("application/json;charset=utf-8");
							response.setStatus(HttpServletResponse.SC_OK);
							baseRequest.setHandled(true);
							response.getWriter().println("{\"result\":\"success\",\"data\":{\"uuid\":\"" + va[0] + "\"}}");
						} else {
							response.setContentType("application/json;charset=utf-8");
							response.setStatus(HttpServletResponse.SC_OK);
							baseRequest.setHandled(true);
							response.getWriter().println("{\"result\":\"error\",\"data\":{\"uuid\":\"" + va[0] + "\"}}");
						}
					}
				}
			}
		} else if ("/bots/update".equals(target)) { // crUd
			
		} else if ("/alerts/register".equals(target)) {
			Map paramsCreate = request.getParameterMap();
			String kind 		= "";
			String direction 	= "";
			float price 		= 0f;
			float tolerance 	= 0;
			for (Object k : paramsCreate.keySet()) {
				if (k instanceof String) {
					String[] va = (String[])paramsCreate.get(k);
					if (((String)k).equals("price")) {
						price = Float.parseFloat(va[0]);
					} else if (((String)k).equals("tolerance")) {
						tolerance = Float.parseFloat(va[0]);
					} else if (((String)k).equals("direction")) {
						direction = "any";
						if (va[0].equalsIgnoreCase("up") || va[0].equalsIgnoreCase("down")) {
							direction = va[0];
						}
					} else if (((String)k).equals("kind")) {
						kind = "any";
						if (va[0].equalsIgnoreCase("bid") || va[0].equalsIgnoreCase("ask")) {
							kind = va[0];
						}
					}
				}
			}
			Trigger t = TradingFactory.eINSTANCE.createTrigger();
			t.setLabel("Trigger");
			JsonNotification n = TradingFactory.eINSTANCE.createJsonNotification();
			String json = "{\"data\":{\"uuid\":\"" + t.getUuid() + "\", \"price\":\"" + price + "\", \"kind\":\"" + kind + "\", \"direction\":\"" + direction + "\", \"tolerance\":\"" + tolerance + "\"}}";
			n.setTarget(json);
			t.getJsonNotifications().add(n);
			PriceRule r = TradingFactory.eINSTANCE.createPriceRule();
			r.setCompliance(1f);
			r.setCurrency(BtcCurrency.EUR);
			r.setLabel("Price Rule " + kind + " @ " + price + " " + BtcCurrency.EUR.getLiteral());
			r.setPercentTolerance(tolerance);
			r.setPrice(price);
			r.setTrigger(TriggerKind.SATISFIES);
			r.setRatio(1f);
			t.getRules().add(r);
			
			robotsMap.get(alertsRobotUUID.get(0)).getTriggers().add(t);
			
			JSONObject obj;
			try {
				obj = new JSONObject(json);
				baseRequest.setHandled(true);
				response.setContentType("application/json;charset=utf-8");
				response.setStatus(HttpServletResponse.SC_OK);
				if (r != null) {
					obj.put("result", "success");

					String alertsBotFilePath = storageDir.getCanonicalPath() + "/" + ALERTS_ROBOT_KEY + ".bots";
					
					TradeBotsConfig alertsCfg = BTCResourceUtils.INSTANCE.load(alertsBotFilePath);
					
					alertsCfg.getBots().get(0).getTriggers().add(t);
					
					BTCResourceUtils.INSTANCE.save(alertsCfg, alertsBotFilePath);

				} else {
					obj.put("result", "error");
				}
				response.getWriter().println(obj.toString());
			} catch (JSONException e) {
				e.printStackTrace();
			}
		} else if ("/alerts/unregister".equals(target)) {
			Map paramsCreate = request.getParameterMap();
			for (Object k : paramsCreate.keySet()) {
				if (k instanceof String) {
					if (((String)k).equals("price")) {
					} else if (((String)k).equals("tolerance")) {
					} else if (((String)k).equals("direction")) {
					} else if (((String)k).equals("kind")) {
					}
				}
			}
		} else if ("/alerts/fetch".equals(target)) {
			try {
				JSONObject jobj = new JSONObject();
	
				JSONObject notifications = new JSONObject();
				JSONArray array = new JSONArray();

				String alertsBotFilePath = storageDir.getCanonicalPath() + "/" + ALERTS_ROBOT_KEY + ".bots";

				TradeBotsConfig alertsCfg = BTCResourceUtils.INSTANCE.load(alertsBotFilePath);

				for (Robot r : alertsCfg.getBots()) {
					for (Trigger t : r.getTriggers()) {
						if (!t.getRules().isEmpty() && (!t.getJsonNotifications().isEmpty() || !t.getMailNotifications().isEmpty() || !t.getSmsNotification().isEmpty())) {
							
							JSONObject alert = buildAlert(t);
							
							array.put(alert);
						}
					}
				}
				notifications.put("notifications", array);
				jobj.put("return", notifications);
				
				response.setContentType("application/json;charset=utf-8");
				response.setStatus(HttpServletResponse.SC_OK);
				baseRequest.setHandled(true);
				response.getWriter().println(jobj);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		} else if ("/bots/configure".equals(target)) {
			if ("application/xml".equals(request.getContentType())) {
				try {
                    receiveTradeBotConfigFile(request,response);
				} catch (Exception e) {
                    System.err.println("------------ERROR---------"+e.getMessage());
                    e.printStackTrace();
				} 				
				baseRequest.setHandled(true);
			}
		} else if ("/wallets/deploy".equals(target)) {
			if ("application/wallet".equals(request.getContentType())) {
				try {
                    receiveWalletsFiles(request,response);
				} catch (Exception e) {
                    System.err.println("------------ERROR---------"+e.getMessage());
                    e.printStackTrace();
				} 				
				baseRequest.setHandled(true);
			}
		}
	}
	private void receiveTradeBotConfigFile(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		InputStream is = req.getInputStream();
		String[] names = req.getParameterMap().get("file");
		
		String storageDirPath = storageDir.getCanonicalPath();
		
		OutputStream os = new FileOutputStream(storageDirPath+ "/" + names[0]);
		byte[] buffer = new byte[4096];
		int bytesRead;
		while ((bytesRead = is.read(buffer)) != -1) {
			os.write(buffer, 0, bytesRead);
		}
		is.close();
		os.close();
	} 
	private void receiveWalletsFiles(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		InputStream is = req.getInputStream();
		String[] names = req.getParameterMap().get("wallet");
		
		String storageDirPath = storageDir.getCanonicalPath();
		
		OutputStream os = new FileOutputStream(storageDirPath+ "/" + names[0]);
		byte[] buffer = new byte[4096];
		int bytesRead;
		while ((bytesRead = is.read(buffer)) != -1) {
			os.write(buffer, 0, bytesRead);
		}
		is.close();
		os.close();
	}
	public TradeBotsConfig getTradeBotsConfig() {
		return localTradeBotConfigs;
	}
	
	public JSONObject buildAlert(Trigger t) {
		JSONObject alert = new JSONObject();
		try {
			alert.put("uuid", t.getUuid());
			JSONArray rulesArray = new JSONArray();
			for (TradingRule rule : t.getRules()) {
				if (rule instanceof PriceRule) {
					PriceRule pr = (PriceRule) rule;
					String compliance = "" + pr.getCompliance();
					String trigger = "" + pr.getTrigger().getLiteral();
					String currency = "" + pr.getCurrency().getLiteral();
					String tolerance = "" + pr.getPercentTolerance();
					String label = "" + pr.getLabel();
					
					JSONObject rulObj = new JSONObject();
					rulObj.put("compliance", compliance);
					rulObj.put("trigger", trigger);
					rulObj.put("currency", currency);
					rulObj.put("tolerance", tolerance);
					rulObj.put("label", label);
					
					rulesArray.put(rulObj);
				} else {
					throw new UnknownError("Rule type unsupported for alerts");
				}
			}
			alert.put("rules", rulesArray);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return alert;
	}
}
