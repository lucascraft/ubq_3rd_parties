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

package com.ubiquisense.broadcast;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class UbiAlertsBrodcastReceiver extends BroadcastReceiver {
	private List<IBrodcastListener> broadcastListeners;
	
	public void addBroadcastListener(IBrodcastListener l) {
		broadcastListeners.add(l);
	}
	public void removeBroadcastListener(IBrodcastListener l) {
		broadcastListeners.remove(l);
	}
	public UbiAlertsBrodcastReceiver() {
		broadcastListeners = new ArrayList<IBrodcastListener>();
	}
	@Override
	public void onReceive(Context context, Intent intent) {
		Bundle extras = intent.getExtras();
		if (extras != null && extras.containsKey("/alerts/fetch")) {
			String json = (String) extras.get("/alerts/fetch");
			try {
				notify(new JSONArray(json));
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
	}
	private void notify(JSONArray json) {
		for (IBrodcastListener l : broadcastListeners) {
			if (json instanceof JSONArray) {
				l.handleBroadcast((JSONArray)json);
			}
		}
	}
}
