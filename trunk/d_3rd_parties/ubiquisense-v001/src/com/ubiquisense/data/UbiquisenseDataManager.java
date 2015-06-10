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

package com.ubiquisense.data;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class UbiquisenseDataManager {
	private JsonParser parser;

	public UbiquisenseDataManager() {
		this.parser				= new JsonParser(); 
	}
	public void handleUbiquisenseEvents(String jsonRcv) {
		JsonElement o = parser.parse(jsonRcv);
		if (o instanceof JsonObject) {
			JsonObject json = (JsonObject) o;
			try {
				if (o.getAsJsonObject().get("ubiquisense") != null && !o.getAsJsonObject().get("ubiquisense").isJsonNull()) {
					String ubiquisenseTag = o.getAsJsonObject().get("ubiquisense").getAsString();		
					if (ubiquisenseTag != null) {
						/*   */if (ubiquisenseTag.endsWith("/alerts/event")) {
							handleAlertNotification(json);
						} else { // id key
							handleOthers(json);
						} 
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	private void handleOthers(JsonObject o) {
	}
	private void handleAlertNotification(JsonObject json) {
		JsonObject data = (JsonObject) json.getAsJsonObject().get("data");
		
	}
}
