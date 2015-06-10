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

package com.ubiquisense.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import android.content.Context;
import android.util.Log;

import com.ubiquisense.data.MtGoxDataManager;

public class HttpComm {

	public final static HttpComm INSTANCE = new HttpComm();
	
	public InputStream getInputStreamFromUrl(String url) {
		InputStream content = null;
		try {
		    HttpClient httpclient = new DefaultHttpClient();
		    HttpResponse response = httpclient.execute(new HttpGet(url));
		    content = response.getEntity().getContent();
		} catch (Exception e) {
		    Log.i("inputstream", "Network exception", e);
		}
		return content;
	}
	private StringBuilder inputStreamToString(InputStream is) throws IOException {
	    String line = "";
	    StringBuilder total = new StringBuilder();
	    
	    BufferedReader rd = new BufferedReader(new InputStreamReader(is));

	    while ((line = rd.readLine()) != null) { 
	        total.append(line); 
	    }
	    
	    return total;
	}
	public void handle(Context ctx, MtGoxDataManager dataManager, String query, String command) {
		JSONQueryAsyncTask bigCalcul = new JSONQueryAsyncTask(ctx, dataManager, query, command);
		bigCalcul.execute();
	}
	public void send(String query) {
		HttpURLConnection httpc = null;
		try {
			query = query.replace("https", "http");
						    	
			URL url = new URL(query);
			httpc = (HttpURLConnection) url.openConnection();

			httpc.connect();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpc.disconnect();
		}
	}
	public JSONObject getJSON(String query, String command) {
		JSONObject obj = new JSONObject();
		HttpURLConnection httpc = null;
		try {
			query = query.replace("https", "http");
						    	
			URL url = new URL(query);
			httpc = (HttpURLConnection) url.openConnection();

			httpc.connect();
			String result = handleInput(httpc, command);
			obj = new JSONObject(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpc.disconnect();
		}
		return obj;
	}
	private String handleInput(HttpURLConnection httpc, String command) {
		try {
			StringBuilder sb = inputStreamToString(httpc.getInputStream());
			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}
