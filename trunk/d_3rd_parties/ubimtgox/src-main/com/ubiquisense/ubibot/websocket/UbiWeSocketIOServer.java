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

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.ServerHandshake;
import org.java_websocket.handshake.ServerHandshakeBuilder;
import org.java_websocket.server.WebSocketServer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ubiquisense.ubibot.ctx.JsonUtils;

public class UbiWeSocketIOServer extends WebSocketServer {
	
	private HashMap<WebSocket, List<String>> registrations;
	private HashMap<WebSocket, Long> lastSeen;
	
	private LinkedBlockingQueue<String> jsonNotificationsQueue;
	
	class BroadcastThread extends Thread {
		public BroadcastThread() {
			setDaemon(true);
		}
		@Override
		public void run() {
			for (;;) {
				if (!getJsonNotificationsQueue().isEmpty()) {
					JSONObject alerts = new JSONObject();
					try {
						alerts.put("ubiquisense", "/alerts/event");
		
						JSONArray alertsArray = new JSONArray();
						do {
							String msg = getJsonNotificationsQueue().poll();
							if (msg != null) {
								alertsArray.put(new JSONObject(msg));
							}
						} while (getJsonNotificationsQueue().isEmpty());
						alerts.put("events", alertsArray);
						
						for (WebSocket ws : connections()) {
							ws.send("Time : " + System.currentTimeMillis());
							if (registrations.containsKey(ws)) {
								for (String topic : registrations.get(ws)) {
									System.out.println("notifying " + topic + " to " + ws.getRemoteSocketAddress());
									ws.send(alerts.toString());
								}
							}
						}
					} catch (JSONException ex) {
						ex.printStackTrace();
					}
				}
				try {
					Thread.sleep(125);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	class AliveThread extends Thread {
		public AliveThread() {
			setDaemon(true);
		}
		@Override
		public void run() {
			synchronized (connections()) {
				for (WebSocket ws : connections()) {
					ws.send("2::");
				}
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private BroadcastThread broadcastThread;
	private AliveThread aliveThread;
	private boolean verbose;

	public UbiWeSocketIOServer(InetSocketAddress addr, boolean verbose) {
		super(addr);
		this.registrations		= new HashMap<WebSocket, List<String>>();
		this.lastSeen			= new HashMap<WebSocket, Long>();	
		this.broadcastThread	= new BroadcastThread();
		this.aliveThread		= new AliveThread();
		this.verbose = verbose;
		this.jsonNotificationsQueue = new LinkedBlockingQueue<String>();
		broadcastThread.start();
		aliveThread.start();
	}
	public LinkedBlockingQueue<String> getJsonNotificationsQueue() {
		return jsonNotificationsQueue;
	}
	@Override
	public void onClose(WebSocket ws, int code, String msg, boolean status) {
		if (verbose) {
			System.out.println("UbiWeSocketIOServer::onClose " + code + " " + msg + " " + status);
		}
	}
	@Override
	public void onError(WebSocket ws, Exception e) {
		e.printStackTrace();
	}
	@Override
	public void onMessage(WebSocket ws, String msg) {
		System.out.println(msg);
		if (msg != null) {
			if (msg.startsWith("{")) {
				JsonElement e = JsonUtils.INSTANCE.load(msg);
				handleMessage(ws, e);
			} else { // service message
				handleServiceMessage(ws, msg);
			}
		}
	}
	private void handleServiceMessage(WebSocket ws, String msg) {
		if (msg.startsWith("1::")) {
			ws.send("2::");
			connections().add(ws);
		} else if (msg.startsWith("2::")) {
			lastSeen.put(ws, System.currentTimeMillis());
		} else if (msg.startsWith("4::")) {
			onMessage(ws, msg.substring("4::".length()));
		}
	}
	@Override
	public void onOpen(WebSocket ws, ClientHandshake hs) {
		System.out.println("UbiWeSocketIOServer::onOpen " + hs.getResourceDescriptor());
		if (!connections().contains(ws)) {
			connections().add(ws);
		}
	}
	private void handleMessage(WebSocket ws, JsonElement e) {
		if (e != null) {
			if (e instanceof JsonObject) {
				JsonObject obj = (JsonObject) e;
				if (obj.get("op") != null && !obj.get("op").isJsonNull() && obj.get("channel") != null && !obj.get("channel").isJsonNull()) {
					
					String opTzg = obj.get("op").getAsString();
					String chTzg = obj.get("channel").getAsString();
					
					System.out.println("!!! received an " + opTzg + " operation !!!");
					
					if ("subscribe".equals(opTzg)) {
						if (!registrations.containsKey(ws)) {
							registrations.put(ws, new ArrayList<String>());
						}
						if (!registrations.get(ws).contains(chTzg)) {
							registrations.get(ws).add(chTzg);
						}
					} else if ("unsubscribe".equals(opTzg)) {
						if (registrations.containsKey(ws)) {
							String chToRemove = "";
							for (String ch : registrations.get(ws)) {
								if (ch.equals(chTzg)) {
									chToRemove = chTzg;
									break;
								}
							}
							registrations.get(ws).remove(chToRemove);
						}
					} 
				}
			}
		}
	}
	@Override
	public void onMessage(WebSocket conn, ByteBuffer message) {
		super.onMessage(conn, message);
	}
	@Override
	public void onWebsocketHandshakeReceivedAsClient(WebSocket conn, ClientHandshake request, ServerHandshake response) throws InvalidDataException {
		System.out.println("UbiWeSocketIOServer::onWebsocketHandshakeReceivedAsClient");
		super.onWebsocketHandshakeReceivedAsClient(conn, request, response);
	}
	@Override
	protected boolean onConnect(SelectionKey key) {
		return super.onConnect(key);
	}
	@Override
	public ServerHandshakeBuilder onWebsocketHandshakeReceivedAsServer(WebSocket conn, Draft draft, ClientHandshake request) throws InvalidDataException {
		System.out.println("UbiWeSocketIOServer::onWebsocketHandshakeReceivedAsServer");

		ServerHandshakeBuilder handshakeBuilder = super.onWebsocketHandshakeReceivedAsServer(conn, draft, request);
		
		handshakeBuilder.setHttpStatus((short)101);
		handshakeBuilder.setHttpStatusMessage("Switching Protocols");
		
		return handshakeBuilder;
	}
	@Override
	public void onWebsocketHandshakeSentAsClient(WebSocket conn, ClientHandshake request) throws InvalidDataException {
		
		System.out.println("UbiWeSocketIOServer::onWebsocketHandshakeSentAsClient");
		super.onWebsocketHandshakeSentAsClient(conn, request);
	}
	@Override
	public void onWebsocketPing(WebSocket conn, Framedata f) {
		System.out.println("UbiWeSocketIOServer::onWebsocketPing");
		super.onWebsocketPing(conn, f);
		conn.send("2::");
	}
	@Override
	public void onWebsocketPong(WebSocket conn, Framedata f) {
		System.out.println("UbiWeSocketIOServer::onWebsocketPong");
		super.onWebsocketPong(conn, f);
		lastSeen.put(conn, System.currentTimeMillis());
	}
}
