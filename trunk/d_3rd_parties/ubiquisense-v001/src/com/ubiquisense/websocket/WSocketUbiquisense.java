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

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_10;
import org.java_websocket.handshake.ServerHandshake;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ubiquisense.data.UbiquisenseDataManager;

public class WSocketUbiquisense { 
	
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
	
	private String wsAddr;

	private String url;
	
	private UbiquisenseDataManager ubiquisenseDataManager;
	
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
					Log.i("websocket-ubi", "sending 2::");
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
 
	class WSocket extends WebSocketClient	 {
		public WSocket(URI serverURI, Draft d) {
			super(serverURI, d);
		}
		@Override
		public void onClose(int arg0, String arg1, boolean arg2) {
			Log.i("websocket-ubi", arg1);
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
			Log.i("websocket-ubi", arg0.getHttpStatusMessage());
		}
	}
	
	public final static String IO_ALERTS_CHANNEL = "4::{\"op\": \"subscribe\", \"channel\": \"alerts\"}";
	
	public WSocketUbiquisense(Context ctx, String wsAddr, boolean verbose) {
		this.wsAddr				= wsAddr;
		this.verbose			= verbose;
		this.ctx				= ctx;
		this.ubiquisenseDataManager = new UbiquisenseDataManager();
	}
	
	boolean status = false;
	
	public void connect () {
		try {
			url = wsAddr;
			websocket = new WSocket(URI.create(url), new Draft_10());
			Log.i("websocket-ubi", "Connect Ubiquisense Websocket");
			status = websocket.connectBlocking();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (!status) {
				new Thread("Reconnect") {
					@Override
					public void run() {
						connect();
						Log.i("websocket-ubi", "reconnect");
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
			Log.i("websocket-ubi", msg);
			Log.i("websocket-ubi", "sending 1::/mtgox back");
			websocket.send("1::/mtgox");
		} if (msg.equals("2::")) {
			if (verbose) {
				Log.i("websocket-ubi", msg);
			}
			if (aliveJob == null) {
				aliveJob = new AliveJob(websocket);
				aliveJob.start();
				if (verbose) {
					Log.i("websocket-ubi", "start heartbeating to socket.io");
				}
				alive = true;
			}
			
			if (status) {
				status = false;
				if (verbose) {
					Log.i("websocket-ubi", "subscribe to socket.io : trades, ticker, depth, lag");
				}
				websocket.send(IO_ALERTS_CHANNEL);
	
				receive("{\"status\":\"dead\", \"mtgox\":\"status\"}".getBytes());
			}
		} else if (msg.startsWith("4::/mtgox:")) {
			msgRcv++;
			if (verbose) {
				Log.i("websocket-ubi", "received 4::");
			}
			receive(msg.substring("4::/mtgox:".length()).getBytes());
			receive("{\"status\":\"alive\", \"mtgox\":\"status\"}".getBytes());
			alive = true;
		} else  {
			if (verbose) {
				Log.i("websocket-ubi", msg);
			}
		}
	}

	public void receive(byte[] stream) {
		JSONObject o;
		try {
			String json = new String(stream);
			o = new JSONObject(json);
			o.put("ubiquisense", "/channel");
			if (verbose) {
				Log.i("websocket-ubi", o.toString());
			}
			ubiquisenseDataManager.handleUbiquisenseEvents(o.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
