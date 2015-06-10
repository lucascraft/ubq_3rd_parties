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
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.ubiquisense.broadcast.IBrodcastListener;
import com.ubiquisense.broadcast.UbiAlertsBrodcastReceiver;
import com.ubiquisense.presentation.AlertsLazyAdapter;

public class AlertsMainActivity extends Activity {
	public static AlertsMainActivity INSTANCE;
	
	private UbiAlertsBrodcastReceiver brodcastReceiver;
	private Boolean myReceiverIsRegistered = false;

	private List<String> uuids;
	private Map<String, JSONObject> elements;
	
	public AlertsMainActivity() {
		INSTANCE = this;
		uuids = new ArrayList<String>();
		elements = new HashMap<String, JSONObject>();

	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.alerts_main);

		final ListView alertsListView = (ListView) findViewById(R.id.alertsListView);
		
		brodcastReceiver = new UbiAlertsBrodcastReceiver();
		brodcastReceiver.addBroadcastListener(new IBrodcastListener() {
			@Override
			public void handleBroadcast(JSONArray json) {
				boolean changed = false;
				runOnUiThread(new Runnable() {
					public void run() {
						Toast.makeText(getApplicationContext(), "update alerts list view", Toast.LENGTH_SHORT).show();
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
							
							AlertsLazyAdapter lazyAdapter = new AlertsLazyAdapter(INSTANCE, elements);
							
							alertsListView.setAdapter(lazyAdapter);
							alertsListView.invalidate();
					    }
					});
				}
			}
		});

		

		Button addAlertButton = (Button) findViewById(R.id.addAlertsButtonView);
		addAlertButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Bundle objectBundle = new Bundle();
				objectBundle.putString("/alert/uuid", UUID.randomUUID().toString());
				Intent botIntent = new Intent(INSTANCE, AlertDetailActivity.class);
				botIntent.putExtras(objectBundle);
				startActivityForResult(botIntent, 0);
			}
		});
		

		Button delAlertButton = (Button) findViewById(R.id.deleteAlertsButtonView);
		delAlertButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//al
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
		    registerReceiver(brodcastReceiver, new IntentFilter("com.ubiquisense.alerts.fetch"));
		    myReceiverIsRegistered = true;
		}	
	}
}
