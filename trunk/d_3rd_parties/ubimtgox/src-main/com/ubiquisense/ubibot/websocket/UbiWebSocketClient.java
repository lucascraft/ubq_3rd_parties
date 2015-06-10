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

package com.ubiquisense.ubibot.websocket;

import java.net.URI;

import net.sf.smbt.btc.mtgox.MTGoxCmd;
import net.sf.smbt.btc.mtgox.MtgoxFactory;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_10;
import org.java_websocket.handshake.ServerHandshake;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.ubiquisense.ubibot.ctx.JsonUtils;

public class UbiWebSocketClient {
	
	public final static String IO_CHANNEL_BOTS	= "4::{\"op\": \"subscribe\", \"channel\": \"bots\"}";
	public final static String IO_CHANNEL_SMS	= "4::{\"op\": \"subscribe\", \"channel\": \"sms\"}";

    protected int access_index;
	final ObjectMapper mapper = new ObjectMapper();
	private WebSocketClient websocket;
	private AliveJob aliveJob;
	private int msgRcv = 0;
	@SuppressWarnings("unused")
	private boolean alive = false;
	
	private String url;
	class AliveJob extends Thread {
		private WebSocketClient ws;
		public AliveJob(WebSocketClient websocket) {
			super("socketio job");
			ws = websocket;
		}
		@Override
		public void run() {
			ws.send("2::");
			System.out.println("sending 2::");
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
			System.out.println(arg1);
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
			System.out.println(arg0.getHttpStatusMessage());
		}
	}

	public UbiWebSocketClient() {}
	
    boolean status = false;
	public void connect () {
		try {
			url = "ws://192.168.0.11:8001";
			
			websocket = new WSocket(URI.create(url), new Draft_10());
	        
			System.out.println("Connect ubiquisense Websocket");
			
			status = websocket.connectBlocking();
			
			if (!status) {
				System.out.println("not connected");
			} else {
				System.out.println("connected");
				websocket.send(new String("1::/ubiquisense"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void protocol(String msg) {
		if (msg.equals("1::")) {
			System.out.println(msg);
			System.out.println("sending 1::/ubiquisense back");
			websocket.send("1::/ubiquisense");
		} if (msg.equals("2::")) {
			System.out.println(msg);
			if (aliveJob == null) {
				aliveJob = new AliveJob(websocket);
				aliveJob.start();
				System.out.println("start heartbeating to socket.io");
				alive = true;
			}
			if (status) {
				status = false;
				System.out.println("subscribe to socket.io : bots, sms");
				websocket.send(IO_CHANNEL_BOTS);
				websocket.send(IO_CHANNEL_SMS);
	
				receive("{\"status\":\"dead\", \"ubiquisense\":\"status\"}".getBytes());
			}
		} else if (msg.startsWith("4::/ubiquisense:")) {
			msgRcv++;
			//System.out.println(msg);
			receive(msg.substring("4::/ubiquisense:".length()).getBytes());
			receive("{\"status\":\"alive\", \"ubiquisense\":\"status\"}".getBytes());
			alive = true;
		} else  {
			System.out.println(msg);
		}
	}
	public void receive(byte[] stream) {
		JsonElement o = JsonUtils.INSTANCE.load(new String(stream));
		o.getAsJsonObject().add("ubiquisense", new JsonPrimitive("/channel"));
		
		MTGoxCmd c = MtgoxFactory.eINSTANCE.createMTGoxCmd();
		c.setJsonRcv(o.toString());

		System.out.println(c.getJsonRcv());
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
