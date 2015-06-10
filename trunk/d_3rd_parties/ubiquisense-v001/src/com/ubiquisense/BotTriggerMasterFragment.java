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

import android.app.Fragment;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.ubiquisense.broadcast.IBrodcastListener;
import com.ubiquisense.broadcast.UbiBotsBrodcastReceiver;
import com.ubiquisense.presentation.TriggerMasterLazyAdapter;

public class BotTriggerMasterFragment extends Fragment {

	private String uuid;
	private ListView triggersMasterListView;
	private Boolean myReceiverIsRegistered = false;
	private UbiBotsBrodcastReceiver brodcastReceiver;
	private Map<String, JSONObject> elements = new HashMap<String, JSONObject>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View contentView = inflater.inflate(R.layout.bot_master, container, false);
		
		Intent intent = getActivity().getIntent();
		
		if (intent.getExtras() != null && intent.getExtras().containsKey("/bot/details")) {
			uuid = (String) intent.getExtras().get("/bot/details");
			
			triggersMasterListView = (ListView) contentView.findViewById(R.id.botMasterListView);
			triggersMasterListView.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
					//
				}
			});
	
			brodcastReceiver = new UbiBotsBrodcastReceiver();
			brodcastReceiver.addBroadcastListener(new IBrodcastListener() {
				@Override
				public void handleBroadcast(JSONArray json) {
					try {
						if (json != null ) {
							for (int i=0;i<json.length();i++) {
								JSONObject obj = new JSONObject(json.getString(i));
								String id = obj.get("uuid").toString();
								if (id.equals(uuid)) {
									JSONArray triggers = obj.getJSONArray("triggers");
									for (int idx=0;idx<triggers.length();idx++) {
										JSONObject trigger = triggers.getJSONObject(idx);
										elements.put("Trigger " + idx, trigger);
									}
								}
							}
						}
					} catch (JSONException e) {
						Log.e("bots-broadcast", e.toString());
					}
								
					TriggerMasterLazyAdapter lazyMasterAdapter = new TriggerMasterLazyAdapter(getActivity(), elements);
								
					triggersMasterListView.setAdapter(lazyMasterAdapter);
					triggersMasterListView.invalidate();
				}
			});
		}

		return contentView;
	}
	
	
	@Override
	public void onPause() {
		super.onPause();
		if (myReceiverIsRegistered) {
		    getActivity().unregisterReceiver(brodcastReceiver);
		    myReceiverIsRegistered = false;
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (!myReceiverIsRegistered) {
		    getActivity().registerReceiver(brodcastReceiver, new IntentFilter("com.ubiquisense.bots.fetch"));
		    myReceiverIsRegistered = true;
		}	
	}

}
