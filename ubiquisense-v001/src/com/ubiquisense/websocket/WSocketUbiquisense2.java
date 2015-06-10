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

import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.ubiquisense.data.UbiquisenseDataManager;

public class WSocketUbiquisense2 { 
	
	
	public final static String IO_CHANNEL_BOTS	= "4::{\"op\": \"subscribe\", \"channel\": \"bots\"}";
	public final static String IO_CHANNEL_SMS	= "4::{\"op\": \"subscribe\", \"channel\": \"sms\"}";

    protected int access_index;
	final ObjectMapper mapper = new ObjectMapper();
	private WebSocketClient websocket;
	private AliveJob aliveJob;
	private int msgRcv = 0;
	@SuppressWarnings("unused")
	private boolean alive = false;
	private JsonParser parser;
	
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
			ws.send("2::");
			Log.i("websocket-ubi", "sending 2::");
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
			run();
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
				if(msg.startsWith("{")) {
					receive(msg.getBytes());
				} else {
					// do harlem shake
					if (websocket != null && msg.contains("::")) {
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

	public WSocketUbiquisense2(String url) {
		parser = new JsonParser();
		this.url = url;
		this.ubiquisenseDataManager = new UbiquisenseDataManager();
	}

    boolean status = false;
	public void connect () {
		try {
			
			websocket = new WSocket(URI.create(url), new Draft_10());
	        
			Log.i("websocket-ubi", "Connect ubiquisense Websocket");
			
			status = websocket.connectBlocking();
			
			if (!status) {
				Log.i("websocket-ubi", "not connected");
			} else {
				Log.i("websocket-ubi", "connected");
				websocket.send(new String("1::/ubiquisense"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void protocol(String msg) {
		if (msg.equals("1::")) {
			Log.i("websocket-ubi", msg);
			Log.i("websocket-ubi", "sending 1::/ubiquisense back");
			websocket.send("1::/ubiquisense");
		} if (msg.equals("2::")) {
			Log.i("websocket-ubi", msg);
			if (aliveJob == null) {
				aliveJob = new AliveJob(websocket);
				aliveJob.start();
				Log.i("websocket-ubi", "start heartbeating to socket.io");
				alive = true;
			}
			if (status) {
				status = false;
				Log.i("websocket-ubi", "subscribe to socket.io : bots, sms");
				websocket.send(IO_CHANNEL_BOTS);
				websocket.send(IO_CHANNEL_SMS);
	
				receive("{\"status\":\"dead\", \"ubiquisense\":\"status\"}".getBytes());
			}
		} else if (msg.startsWith("4::/ubiquisense:")) {
			msgRcv++;
			receive(msg.substring("4::/ubiquisense:".length()).getBytes());
			receive("{\"status\":\"alive\", \"ubiquisense\":\"status\"}".getBytes());
			alive = true;
		} else  {
			Log.i("websocket-ubi", msg);
		}
	}
	public void receive(byte[] stream) {
		JsonElement o = parser.parse(new String(stream));
		o.getAsJsonObject().add("ubiquisense", new JsonPrimitive("/channel"));
		Log.i("websocket-ubi", o.getAsString());
		ubiquisenseDataManager.handleUbiquisenseEvents(o.toString());
	}
	public void close() {
		if (websocket != null) {
			try {
				websocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
