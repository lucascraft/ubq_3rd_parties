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

package com.ubiquisense.ubibot.test.websocket;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class UbiHttpClientTest {
	
	public final static UbiHttpClientTest INSTANCE = new UbiHttpClientTest();
	
	public void postBotsScript(String jsonScript) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost("http://localhost:8090/bots/script");
		post.setHeader("Content-type", "application/json");
		post.setEntity(new StringEntity(jsonScript));
		
		HttpResponse response = new DefaultHttpClient().execute(post);

		for (Header h : response.getAllHeaders()) {
			System.out.println(h.toString());
		}
	}
	
	public void getBotsScript() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet("http://localhost:8090/notifications/fetch");
		get.setHeader("Content-type", "application/text");
		
		HttpResponse response = new DefaultHttpClient().execute(get);

		for (Header h : response.getAllHeaders()) {
			System.out.println(h.toString());
		}
	}
	
	public static void main(String[] args) {
		try {
			//INSTANCE.postBotsScript("{}");
			INSTANCE.getBotsScript();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
