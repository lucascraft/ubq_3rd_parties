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

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.os.AsyncTask;

import com.ubiquisense.data.MtGoxDataManager;

public class JSONQueryAsyncTask extends AsyncTask<Void, Integer, Void> {
	private MtGoxDataManager dataManager;
	private String query;
	private String command;
	public JSONQueryAsyncTask(Context ctx, MtGoxDataManager dataManager, String query, String command) {
		this.dataManager 	= dataManager;
		this.query 			= query;
		this.command 		= command;
	}
	@Override
	protected Void doInBackground(Void... arg0) {
		JSONObject obj = HttpComm.INSTANCE.getJSON(query, command);
		try {
			obj.put("mtgox", command);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		dataManager.handleMtGoxEvents(obj.toString());
		return null;
	}
}