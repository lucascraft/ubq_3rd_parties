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

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.ubiquisense.broadcast.IBrodcastListener;
import com.ubiquisense.broadcast.UbiBotsBrodcastReceiver;

public class BotDetailActivity extends Activity {

	private String uuid;
	
	private Map<String, JSONObject> elements;
	
	private UbiBotsBrodcastReceiver brodcastReceiver;
	private Boolean myReceiverIsRegistered = false;
	
	
	public BotDetailActivity() {
		elements = new HashMap<String, JSONObject>();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.bot_triggers);
		
		Intent intent = getIntent();

		if (intent.getExtras() != null && intent.getExtras().containsKey("/bot/details")) {
			uuid = (String) intent.getExtras().get("/bot/details");

			brodcastReceiver = new UbiBotsBrodcastReceiver();
			brodcastReceiver.addBroadcastListener(new IBrodcastListener() {
				@Override
				public void handleBroadcast(JSONArray json) {
					runOnUiThread(new Runnable() {
						public void run() {
							Toast.makeText(getApplicationContext(), "update bots list view", Toast.LENGTH_SHORT).show();
						}
					});
					try {
						if (json != null ) {
							for (int i=0;i<json.length();i++) {
								JSONObject obj = new JSONObject(json.getString(i));
								String id = obj.get("uuid").toString();
								if (id == uuid) {
									JSONArray triggers = obj.getJSONArray("triggers");
									for (int idx=0;idx<triggers.length();idx++) {
										JSONObject trigger = triggers.getJSONObject(idx);
										elements.put("Trigger " + idx, trigger);
									}
								}
							}
						}
					} catch (JSONException e) {
						Log.e("bot-details-broadcast", e.toString());
					}
					/*if (changed) {
						runOnUiThread(new Runnable() {
							public void run() {
								Toast.makeText(getApplicationContext(), "fetch received", Toast.LENGTH_SHORT).show();
								
								TriggerMasterLazyAdapter lazyMasterAdapter = new TriggerMasterLazyAdapter(INSTANCE, elements);
								
								triggersMasterListView.setAdapter(lazyMasterAdapter);
								triggersMasterListView.invalidate();
								
								TriggerMasterLazyAdapter lazyDetailsAdapter = new TriggerMasterLazyAdapter(INSTANCE, elements);
								
								triggersDetailsListView.setAdapter(lazyDetailsAdapter);
								triggersDetailsListView.invalidate();
						    }
						});
					}*/
				}
			});
		}
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
