/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package com.ubiquisense.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ubiquisense.websocket.IAlertsListener;
import com.ubiquisense.websocket.IBotsListener;
import com.ubiquisense.websocket.IChannelListener;
import com.ubiquisense.websocket.IDepthListener;
import com.ubiquisense.websocket.IFetchListener;

public class MtGoxDataManager {
	private JsonParser parser;
	private List<IChannelListener>	channelListeners;
	private List<IFetchListener>	fetchListeners;
	private List<IDepthListener>	depthListeners;
	private List<IBotsListener>		botListeners;
	private List<IAlertsListener>	alertListeners;

	private MtGox mtGox; 
	public MtGoxDataManager() {
		this.mtGox				= new MtGox();
		this.parser				= new JsonParser(); 
		this.channelListeners	= new ArrayList<IChannelListener>(); 
		this.fetchListeners		= new ArrayList<IFetchListener>();
		this.depthListeners		= new ArrayList<IDepthListener>();
		this.botListeners		= new ArrayList<IBotsListener>();
		this.alertListeners		= new ArrayList<IAlertsListener>();
	}
	public List<IChannelListener> getChannelListeners() {
		return channelListeners;
	}
	public List<IDepthListener> getDepthListeners() {
		return depthListeners;
	}
	public List<IFetchListener> getFetchListeners() {
		return fetchListeners;
	}
	public MtGox getMtGox() {
		return mtGox;
	}
	public void addAlertsListener(IAlertsListener l) {
		alertListeners.add(l);
	}
	public void removeAlertsListener(IBotsListener l) {
		alertListeners.remove(l);
	}
	public void addBotsListener(IBotsListener l) {
		botListeners.add(l);
	}
	public void removeBotsListener(IBotsListener l) {
		botListeners.remove(l);
	}
	public void addChannelListener(IChannelListener l) {
		channelListeners.add(l);
	}
	public void removeChannelListener(IChannelListener l) {
		channelListeners.remove(l);
	}
	public void addFetchListener(IFetchListener l) {
		fetchListeners.add(l);
	}
	public void removeFetchListener(IFetchListener l) {
		fetchListeners.remove(l);
	}
	public void addDepthListener(IDepthListener l) {
		depthListeners.add(l);
	}
	public void removeFetchListener(IDepthListener l) {
		depthListeners.remove(l);
	}
	private void handleOrderFeeback(JsonObject o) {
		String tag = o.getAsJsonObject().get("mtgox").getAsString();

		if (tag.endsWith("/cancel")) {
			JsonObject returnv = (JsonObject) o.getAsJsonObject().get("return");
			String qid = returnv.get("qid").getAsString();
			String oid = returnv.get("oid").getAsString();
			String success = o.getAsJsonObject().get("result").getAsString();

			System.out.println("Cancelling " + oid + " / " + qid + " order == " + success );
			
		} else if (tag.endsWith("/add")) {
			String qid = o.getAsJsonObject().get("return").getAsString();
			
			String success = o.getAsJsonObject().get("result").getAsString();
			
			System.out.println("Adding " + qid + " order == " + success );
		}
	}
	public void handleMtGoxEvents(String jsonRcv) {
		JsonElement o = parser.parse(jsonRcv);
		if (o instanceof JsonObject) {
			JsonObject json = (JsonObject) o;
			try {
				if (o.getAsJsonObject().get("mtgox") != null && !o.getAsJsonObject().get("mtgox").isJsonNull()) {
					String mtgoxTag = o.getAsJsonObject().get("mtgox").getAsString();		
					if (mtgoxTag != null) {
						/*   */if (mtgoxTag.endsWith("/money/ticker")) {
							handleMoneyTicker(json);
						}/* else if (mtgoxTag.endsWith("/generic/wallet/history")) {
							handleWalletHistory(json);
						} else if (mtgoxTag.endsWith("/generic/info")) {
							handleMoneyInfo(json);
						} else if (mtgoxTag.endsWith("/generic/orders")) {
							handleMoneyOrders(json);
						}*/ else if (mtgoxTag.contains("/trades")) {
							handleMoneyTradesFetch(json);
						} else if (mtgoxTag.endsWith("/money/depth/fetch")) {
							handleDepthFetch(json);
						}/* else if (mtgoxTag.endsWith("/money/info")) {
							handleMoneyInfo(json);
						}*/ else if (mtgoxTag.endsWith("/money/depth/full")) {
							handleDepthFull(json);
						} else if (mtgoxTag.endsWith("/private/order/cancel") || mtgoxTag.endsWith("/private/order/add")) {
							handleOrderFeeback(json);
						} else if (mtgoxTag.endsWith("/channel")) { // WebSocket
							handleWebsocketChannel(json);
						}/* else if (mtgoxTag.endsWith("/status")) { // WebSocket
							handleAlive(json);  
						}*/ else if (mtgoxTag.endsWith("/generic/private/idkey")) { // id key
							//handleApiKey(json);
						} else if (mtgoxTag.endsWith("/bots/fetch")) { // id key
							handleBotsFetch(json);
						} else { // id key
							handleOthers(json);
						} if (mtgoxTag.endsWith("/alerts/fetch")) {
							handleAlerts(json);
						}
					}
				} else if (o.getAsJsonObject().get("ubiquisense") != null && !o.getAsJsonObject().get("ubiquisense").isJsonNull()) {
					String ubiquisenseTag = o.getAsJsonObject().get("ubiquisense").getAsString();		
					if (ubiquisenseTag != null) {
						if (ubiquisenseTag != null) {
							/*   */if (ubiquisenseTag.endsWith("/alerts/fetch")) {
								handleAlerts(json);
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	private void handleBotsFetch(JsonObject o) {
		JsonElement data = (JsonElement) o.getAsJsonObject().get("return");
		if (data != null && !data.isJsonNull()) {
			JsonArray bots = data.getAsJsonObject().get("bots").getAsJsonArray();
			/*Iterator<JsonElement> itBots = bots.iterator();
			while (itBots.hasNext()) {
				JsonElement e = itBots.next();
			}*/
			for (IBotsListener l : botListeners) {
				l.botsUpdate(this, bots);
			}
			Log.i("bots-fetch", data.toString());
		}
	}
	String lastTid = "0";
	private void handleMoneyTradesFetch(JsonObject o) {
		JsonElement data = (JsonElement) o.getAsJsonObject().get("data");
		
		if (data.isJsonArray()) {
			JsonArray list = (JsonArray) data.getAsJsonArray();
			Iterator<JsonElement> itFetch = list.iterator();
			int i=0;
			//Date latest = new Date();
			while (itFetch.hasNext()) {
				JsonObject d = (JsonObject) itFetch.next();
				
				Long stamp				= d.get("date").getAsLong()*1000;
				Float price 			= d.get("price").getAsFloat();
				Float amount			= d.get("amount").getAsFloat();
				BigInteger priceInt		= d.get("price_int").getAsBigInteger();
				BigInteger amountInt	= d.get("amount_int").getAsBigInteger();
				String tid 				= d.get("tid").getAsString();
				
				String currencyLiteral 	= d.get("price_currency").getAsString();
				String item 			= d.get("item").getAsString();
				String tradeType 		= d.get("trade_type").getAsString();
				String primary 			= d.get("primary").getAsString();
				String properties 		= d.get("properties").getAsString();

				FetchValue v = new FetchValue(); 
						
				v.setAmount(amount);
				v.setAmountInt(amountInt);
				v.setCurrency(currencyLiteral);
				v.setItem(item);
				v.setPrice(price);
				v.setPriceInt(priceInt);
				v.setPrimary(primary);
				v.setProperties(properties);
				v.setStamp(stamp);
				v.setTid(tid);
				v.setTradeType(tradeType)
				;
				if (!mtGox.getFetchs().contains(v)) {
					mtGox.getFetchs().add(v);
				}
				lastTid = stamp+"";
				i++;
			}
			System.out.println(i + " trades @ " + new Date(Long.parseLong(lastTid)));
		}
		
		for (IFetchListener l : fetchListeners ) {
			l.fetchUpdate(this, o);
		}
	}
	private DepthValue createDepthValue(JsonObject d) {
		Long stamp		= d.get("stamp").getAsLong()*1000;
		Float price 	= d.get("price").getAsFloat();
		Float amount	= d.get("amount").getAsFloat();
		BigInteger priceInt		= d.get("price_int").getAsBigInteger();
		BigInteger amountInt	= d.get("amount_int").getAsBigInteger();
		
		DepthValue v = new DepthValue(); 
		v.setAmount(amount);
		v.setAmountInt(amountInt);
		v.setPrice(price);
		v.setPriceInt(priceInt);
		v.setStamp(stamp);
		return v;
	}
	private void handleOthers(JsonObject o) {
	}
	private void handleAlerts(JsonObject o) {
		for (IAlertsListener l : alertListeners) {
			l.alertsUpdate(this, o);
		}
	}
	private void handleDepthFull(JsonObject o) {
		
		JsonObject data = (JsonObject) o.getAsJsonObject().get("data");
		mtGox.getDepths().clear();
		
		// Asks
		List<DepthValue> _asks = new ArrayList<DepthValue>();
		List<DepthValue> _bids = new ArrayList<DepthValue>();
		
		JsonArray listAsks = (JsonArray) data.get("asks").getAsJsonArray();
		Iterator<JsonElement> itAsksFetch = listAsks.iterator();
		while (itAsksFetch.hasNext()) {
			_asks.add(createDepthValue((JsonObject) itAsksFetch.next()));
		}	
		// Bids
		JsonArray listBids = (JsonArray) data.get("bids").getAsJsonArray();
		Iterator<JsonElement> itBidsFetch = listBids.iterator();
		while (itBidsFetch.hasNext()) {
			_bids.add(createDepthValue((JsonObject) itBidsFetch.next()));
		}
		Collections.reverse(_bids);

		int size = Math.max(_asks.size(), _bids.size());
		for (int i=0;i<size;i++) {
			DepthLine line = new DepthLine();
			if (i<_asks.size()) {
				line.setAsk(_asks.get(i));
			}
			if (i<_bids.size()) {
				line.setBid(_bids.get(i));
			}
			mtGox.getDepths().add(line);
		}
		_asks.clear();
		_bids.clear();
		
		float sumBid = 0, sumAsk = 0;
		for (DepthLine l : mtGox.getDepths()) {
			if (l != null) {
				if (l.getBid()!=null) {
					sumBid += l.getBid().getAmount();
					l.getBid().setSum(sumBid);
				}
				if (l.getAsk() != null) {
					sumAsk += l.getAsk().getAmount();
					l.getAsk().setSum(sumAsk);
				}
			}
		}
		if (!mtGox.getDepths().isEmpty()) {
			mtGox.getDepths().remove(mtGox.getDepths().size()-1);
		}
		
		for (IDepthListener l : depthListeners ) {
			l.depthUpdate(this, o);
		}
	}
	private void handleDepthFetch(JsonObject json) {
		handleDepthFull(json);
	}
	private void handleWebsocketChannel(JsonObject json) {
		JsonElement elem = json.getAsJsonObject().get("channel_name");
		if (elem != null) {
			String channel = json.getAsJsonObject().get("channel_name").getAsString();
			if (channel.equals("ticker.BTCEUR")) {
				JsonObject ticker = (JsonObject) json.getAsJsonObject().get("ticker");
				handleTickerData(ticker);
				for (IChannelListener l : channelListeners) {
					l.channelUpdate(this, ticker);
				}
			} else if (channel.equals("depth.BTCEUR")) {
				JsonObject depth = (JsonObject) json.getAsJsonObject().get("depth");
				
				//int typec	 				= depth.get("type").getAsInt();
				String type 				= depth.get("type_str").getAsString();
				//String item 				= depth.get("item").getAsString();
				//Date date 					= new Date(depth.get("now").getAsLong()*1000);
				float price					= depth.get("price").getAsFloat();
				//BigInteger price_int		= depth.get("price_int").getAsBigInteger();
				BigInteger total_volume_int	= depth.get("total_volume_int").getAsBigInteger();
				//float volume				= depth.get("volume").getAsFloat();
			//	BigInteger volume_int		= depth.get("volume_int").getAsBigInteger();
	
				DepthValue v;
				@SuppressWarnings("unused")
				DepthLine li = null;
				for (DepthLine line : mtGox.getDepths()) {
					if ("ask".equalsIgnoreCase(type)) {
						v = line.getAsk();
					} else { // its a Bid
						v = line.getBid();
					}
					
					if (v != null && v.getPrice() == price) {
						li = line;
						v.setAmountInt(total_volume_int);
						v.setAmount(total_volume_int.floatValue() / 100000000);
						break;
					}
				}
				float sumBid = 0, sumAsk = 0;
				for (DepthLine l : mtGox.getDepths()) {
					if (l != null) {
						if (l.getBid()!=null) {
							sumBid += l.getBid().getAmount();
							l.getBid().setSum(sumBid);
						}
						if (l.getAsk() != null) {
							sumAsk += l.getAsk().getAmount();
							l.getAsk().setSum(sumAsk);
						}
					}
				}
				for (IChannelListener l : channelListeners) {
					l.channelUpdate(this, depth);
				}
			}  else if (channel.equals("trade.BTC")) {
				JsonObject depth = (JsonObject) json.getAsJsonObject().get("trade");
				
//				String tid					= depth.get("tid").getAsString();
//				String primary				= depth.get("primary").getAsString();
//				String type 				= depth.get("type").getAsString();
//				String item 				= depth.get("item").getAsString();
				String trade 				= depth.get("trade_type").getAsString();
				Date date 					= new Date(depth.get("date").getAsLong()*1000);
				float price					= depth.get("price").getAsFloat();
				BigInteger amount_int		= depth.get("amount_int").getAsBigInteger();
				BigInteger price_int		= depth.get("price_int").getAsBigInteger();
				String price_currency		= depth.get("price_currency").getAsString();

				//BtcCurrency currency = BtcCurrency.get(price_currency);
				if (mtGox.getMarket().getCurrency().equals(price_currency)) {
					DepthValue newV =  new DepthValue();
					newV.setAmount(amount_int.floatValue() / 100000000);
					newV.setAmountInt(amount_int);
					newV.setKind(trade);
					newV.setPrice(price);
					newV.setPriceInt(price_int);
					newV.setStamp(date.getTime());
					newV.setCurrency(price_currency);
					mtGox.getSales().add(newV);
				}
				for (IChannelListener l : channelListeners) {
					l.channelUpdate(this, depth);
				}
			}
		} else {
			//JsonObject obj = json.getAsJsonObject();
			//boolean stop = true;
		}
	}
	private void handleTickerData(JsonObject data) {
		if (data != null) {
			JsonObject high			= data.get("high").getAsJsonObject();
			JsonObject low			= data.get("low").getAsJsonObject();
	//		JsonObject avg			= data.get("avg").getAsJsonObject();
//			JsonObject vwap			= data.get("vwap").getAsJsonObject();
			JsonObject vol			= data.get("vol").getAsJsonObject();
			JsonObject last_local 	= data.get("last_local").getAsJsonObject();
			JsonObject last_orig	= data.get("last_orig").getAsJsonObject();
			JsonObject last			= data.get("last").getAsJsonObject();
			JsonObject buy			= data.get("buy").getAsJsonObject();
			JsonObject sell			= data.get("sell").getAsJsonObject();
	//		String now				= data.get("now").getAsString();
			
			CompactValue vHigh 		= getCVal(high); 
			CompactValue vLow 		= getCVal(low); 
			CompactValue vVol 		= getCVal(vol); 
			CompactValue vBuy 		= getCVal(buy); 
			CompactValue vSell 		= getCVal(sell); 
			//CompactValue vAvg 		= getCVal(sell); 
			CompactValue vLastLocal	= getCVal(last_local); 
			CompactValue vLastOrig 	= getCVal(last_orig); 
			CompactValue vLast	 	= getCVal(last); 
			
			mtGox.getMarket().setBroker("MtGOX");
			mtGox.getMarket().setHigh(vHigh.getValue());
			mtGox.getMarket().setLow(vLow.getValue());
			mtGox.getMarket().setBuy(vBuy.getValue());
			mtGox.getMarket().setSell(vSell.getValue());
			mtGox.getMarket().setVolume(vVol.getValue());
			mtGox.getMarket().setLast(vLast.getValue());
			mtGox.getMarket().setLastOrig(vLastOrig.getValue());
			mtGox.getMarket().setLastLocal(vLastLocal.getValue());
			
			Fundamentals f = new Fundamentals();
			f.setBuy(mtGox.getMarket().getBuy());
			f.setLow(mtGox.getMarket().getLow());
			f.setHigh(mtGox.getMarket().getHigh());
			f.setSell(mtGox.getMarket().getSell());
			f.setLast(mtGox.getMarket().getLast());
			
			/*
			List<Fundamentals> last500 = mtGox.getTrend();
			List<Fundamentals> tmp = new ArrayList<Fundamentals>();
			tmp.add(0, f);
			if (last500.size() >= 500) {
				tmp.addAll(last500.subList(1, last500.size()-2));
			} else {
				tmp.addAll(last500);
			}
			mtGox.getTrend().addAll(tmp);
			*/
		}
		
	}
	private void handleMoneyTicker(JsonObject json) {
		JsonObject data = (JsonObject) json.getAsJsonObject().get("data");
		handleTickerData(data);
	}
	private CompactValue getCVal(JsonObject ksonObj) {
		CompactValue v = new CompactValue();
		if (ksonObj instanceof JsonObject) {
			v.setValue(ksonObj.get("value").getAsFloat());
			v.setValue_int(ksonObj.get("value_int").getAsBigInteger());
			v.setCurrency(ksonObj.get("currency").getAsString());
			v.setDisplay(ksonObj.get("display").getAsString());
			v.setDisplay_short(ksonObj.get("display_short").getAsString());
		}
		return v;
	}
}
