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

package com.ubiquisense;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.ubiquisense.broadcast.IBrodcastListener;
import com.ubiquisense.broadcast.UbiBotsBrodcastReceiver;
import com.ubiquisense.presentation.TradeBotLazyAdapter;

public class BotMainActivity extends Activity {
	private ListView botsView;
	private List<String> uuids;
	
	private Map<String, JSONObject> elements;
	
	private UbiBotsBrodcastReceiver brodcastReceiver;
	private Boolean myReceiverIsRegistered = false;
	
	private static BotMainActivity INSTANCE;
	
	public BotMainActivity() {
		INSTANCE = this;
		uuids = new ArrayList<String>();
		elements = new HashMap<String, JSONObject>();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.bots_main);
		
		botsView = (ListView) findViewById(R.id.botsListView);
		botsView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Bundle objectBundle = new Bundle();
				objectBundle.putString("/bot/details", uuids.get(arg2));
				Intent botIntent = new Intent(INSTANCE, BotDetailActivity.class);
				botIntent.putExtras(objectBundle);
				startActivity(botIntent);
			}
		});

		brodcastReceiver = new UbiBotsBrodcastReceiver();
		brodcastReceiver.addBroadcastListener(new IBrodcastListener() {
			@Override
			public void handleBroadcast(JSONArray json) {
				boolean changed = false;
				runOnUiThread(new Runnable() {
					public void run() {
						Toast.makeText(getApplicationContext(), "update bots list view", Toast.LENGTH_SHORT).show();
					}
				});
				try {
					if (json != null ) {
						List<String> lst = new ArrayList<String>();
						for (int i=0;i<json.length();i++) {
							JSONObject obj = new JSONObject(json.getString(i));
							String uuid = obj.get("uuid").toString();
							
							elements.put(uuid, obj);
							
							lst.add(uuid);
							if (!uuids.contains(uuid)) {
								changed = true;
							}
						}
						if (changed) {
							uuids.addAll(lst);
						}
					}
				} catch (JSONException e) {
					Log.e("bots-broadcast", e.toString());
				}
				if (changed) {
					runOnUiThread(new Runnable() {
						public void run() {
							Toast.makeText(getApplicationContext(), "fetch received", Toast.LENGTH_SHORT).show();
							
							TradeBotLazyAdapter lazyAdapter = new TradeBotLazyAdapter(INSTANCE, elements);
							
							botsView.setAdapter(lazyAdapter);
							botsView.invalidate();
					    }
					});
				}
			}
		});
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		if (myReceiverIsRegistered) {
		    unregisterReceiver(brodcastReceiver);
		    myReceiverIsRegistered = false;
		}
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		if (!myReceiverIsRegistered) {
		    registerReceiver(brodcastReceiver, new IntentFilter("com.ubiquisense.bots.fetch"));
		    myReceiverIsRegistered = true;
		}	
	}
}
