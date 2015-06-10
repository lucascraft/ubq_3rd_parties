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

package com.ubiquisense.websocket;

import java.net.URI;
import java.util.Date;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_10;
import org.java_websocket.handshake.ServerHandshake;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonElement;
import com.ubiquisense.data.MtGoxDataManager;
import com.ubiquisense.http.HttpComm;
import com.ubiquisense.http.MtGoxQueryUtils;


public class WSocketComm { 
    private byte[] data;
    protected int access_index;
	final ObjectMapper mapper = new ObjectMapper();
	private WebSocketClient websocket;
	private AliveJob aliveJob;
	private int msgRcv = 0;
	private String privateKey="";
	private boolean alive = false;
	private boolean verbose = true;
	private Context ctx;
	
	private MtGoxDataManager mtgoxDataManager;
	
	private MtGoxUpdaterThread mtgoxThread;
	private UbiquisenseUpdaterThread ubiquisenseThread;
	
	private String wsAddr;
	private String ubiServerAddr;

	private String url;
	class AliveJob extends Thread {
		private WebSocketClient ws;
		public AliveJob(WebSocketClient websocket) {
			super("socketio job");
			ws = websocket;
		}
		@Override
		public void run() {
			do {
				ws.send("2::");
				if (verbose) {
					Log.i("websocket", "sending 2::");
				}
				msgRcv = msgRcv > 0 ? 0 : msgRcv-1;
				if (msgRcv <= -4) {
					alive = false;
					connect();
				}
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} while (true);
		}
	}

	
	class MtGoxUpdaterThread extends Thread {
		public void run() {
			do {
				try {
					String moneyTradesFetch = MtGoxQueryUtils.INSTANCE.createMtGoxMoneyTradesFetch("BTC", "EUR");
					HttpComm.INSTANCE.handle(ctx, mtgoxDataManager, "http://data.mtgox.com/api" + moneyTradesFetch, "/trades");
					Log.i("websocket", "http://data.mtgox.com/api" + moneyTradesFetch);
					try {
						sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					String moneyDepthFullQuery = MtGoxQueryUtils.INSTANCE.createMtGoxMoneyDepthFull("BTC", "EUR");
					HttpComm.INSTANCE.handle(ctx, mtgoxDataManager, "http://data.mtgox.com/api" + moneyDepthFullQuery, "/money/depth/full");
					Log.i("websocket", "http://data.mtgox.com/api" + moneyDepthFullQuery);
					try {
						sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					String moneyDepthFetch = MtGoxQueryUtils.INSTANCE.createMtGoxMoneyDepthFetch("BTC", "EUR"); 
					HttpComm.INSTANCE.handle(ctx, mtgoxDataManager, "http://data.mtgox.com/api" + moneyDepthFetch, "/money/depth/fetch");
					Log.i("websocket", "http://data.mtgox.com/api" + moneyDepthFetch);
					try {
						sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Log.i("websocket", "restart updater thread");
					for (IDepthListener l : mtgoxDataManager.getDepthListeners()) {
						l.depthUpdate(mtgoxDataManager, new JsonElement() {});
					}
					for (IFetchListener l : mtgoxDataManager.getFetchListeners()) {
						l.fetchUpdate(mtgoxDataManager, new JsonElement() {});
					}
				} catch (Exception e) {
					Log.e("mtgox-thread", e.toString());
				}
			} while (true);
		};
	}
	
	class UbiquisenseUpdaterThread extends Thread {
		public void run() {
			do {
				try {
					HttpComm.INSTANCE.handle(ctx, mtgoxDataManager, "http://" + ubiServerAddr + "/bots/fetch", "/bots/fetch");
					Log.i("ubiserver", ubiServerAddr + "/bots/fetch");
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					HttpComm.INSTANCE.handle(ctx, mtgoxDataManager, "http://" + ubiServerAddr + "/alerts/fetch", "/alerts/fetch");
					Log.i("ubiserver", ubiServerAddr + "/alerts/fetch");
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} catch (Exception e) {
					Log.e("ubiqui-thread", e.toString());
				}
			} while (true);
		};
	}
 
	class WSocket extends WebSocketClient	 {
		public WSocket(URI serverURI, Draft d) {
			super(serverURI, d);
		}
		@Override
		public void onClose(int arg0, String arg1, boolean arg2) {
			Log.i("websocket", arg1);
		}
		@Override
		public void onError(Exception err) {
			err.printStackTrace();
		}
		@Override
		public void onMessage(String msg) {
			if (msg!=null) {
				if(!msg.contains("::")) {
					receive(msg.getBytes());
				} else {
					// do the harlem shake
					if (websocket != null) {
						protocol(msg);
					}
				}
			}
		}
		@Override
		public void onOpen(ServerHandshake arg0) {
			Log.i("websocket", arg0.getHttpStatusMessage());
		}
	}
	
	public final static String IO_CHANNEL_DEPTH		= "4::{\"op\": \"subscribe\", \"channel\": \"057bdc6b-9f9c-44e4-bc1a-363e4443ce87\"}";
	public final static String IO_CHANNEL_TICKER	= "4::{\"op\": \"subscribe\", \"channel\": \"0bb6da8b-f6c6-4ecf-8f0d-a544ad948c15\"}";
	public final static String IO_CHANNEL_TRADES	= "4::{\"op\": \"subscribe\", \"channel\": \"dbf1dee9-4f2e-4a08-8cb7-748919a71b21\"}";
	public final static String IO_CHANNEL_LAG		= "4::{\"op\": \"subscribe\", \"channel\": \"85174711-be64-4de1-b783-0628995d7914\"}";
	
	public final static String IO_CALL				= "4::{\"op\": \"call\"}";

	public WSocketComm(Context ctx, String wsAddr, String apiKey, String secretKey, String ubiServerAddr, boolean verbose) {
		this.wsAddr				= wsAddr;
		this.verbose			= verbose;
		
		this.mtgoxDataManager 	= new MtGoxDataManager();
		
		this.ctx				= ctx;
		this.ubiServerAddr 		= ubiServerAddr;
		
		mtgoxThread 			= new MtGoxUpdaterThread();
		ubiquisenseThread 		= new UbiquisenseUpdaterThread();
		
		mtgoxThread.start();
		ubiquisenseThread.start();
	}
	
	public MtGoxDataManager getMtgoxDataManager() {
		return mtgoxDataManager;
	}
	
	public Thread getMtGoxThread() {
		return mtgoxThread;
	}
	
	public Thread getUbiquisenseThread() {
		return ubiquisenseThread;
	}
	
	boolean status = false;
	
	public void connect () {
		try {
			url = wsAddr + new Date().getTime()+"/?Currency=EUR";
			websocket = new WSocket(URI.create(url), new Draft_10());
			Log.i("websocket", "Connect Websocket");
			status = websocket.connectBlocking();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (!status) {
				new Thread("Reconnect") {
					@Override
					public void run() {
						connect();
						Log.i("websocket", "reconnect");
						receive("{\"status\":\"dead\", \"mtgox\":\"status\"}".getBytes());
						try {
							sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						run();
					}
				}.start();
			}
		}
	}
	private void protocol(String msg) {
		if (msg.equals("1::")) {
			Log.i("websocket", msg);
			Log.i("websocket", "sending 1::/mtgox back");
			websocket.send("1::/mtgox");
		} if (msg.equals("2::")) {
			if (verbose) {
				Log.i("websocket", msg);
			}
			if (aliveJob == null) {
				aliveJob = new AliveJob(websocket);
				aliveJob.start();
				if (verbose) {
					Log.i("websocket", "start heartbeating to socket.io");
				}
				alive = true;
			}
			
			if (status) {
				status = false;
				if (verbose) {
					Log.i("websocket", "subscribe to socket.io : trades, ticker, depth, lag");
				}
				websocket.send(IO_CHANNEL_TICKER);
				websocket.send(IO_CHANNEL_DEPTH);
				websocket.send(IO_CHANNEL_TRADES);
				websocket.send(IO_CHANNEL_LAG);
	
				receive("{\"status\":\"dead\", \"mtgox\":\"status\"}".getBytes());
			}
		} else if (msg.startsWith("4::/mtgox:")) {
			msgRcv++;
			if (verbose) {
				Log.i("websocket", "received 4::");
			}
			receive(msg.substring("4::/mtgox:".length()).getBytes());
			receive("{\"status\":\"alive\", \"mtgox\":\"status\"}".getBytes());
			alive = true;
		} else  {
			if (verbose) {
				Log.i("websocket", msg);
			}
		}
	}

	public void receive(byte[] stream) {
		JSONObject o;
		try {
			String json = new String(stream);
			o = new JSONObject(json);
			o.put("mtgox", "/channel");
			if (verbose) {
				Log.i("websocket", o.toString());
			}
			mtgoxDataManager.handleMtGoxEvents(o.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	public void close() {
	//	aliveJob.stop();
	//	websocket.close();
	}
}
