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

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class UbiBrodcastBotsRequest extends BroadcastReceiver {
	private List<IBotRequestListener> broadcastListeners;
	
	public void addBroadcastListener(IBotRequestListener l) {
		broadcastListeners.add(l);
	}
	public void removeBroadcastListener(IBotRequestListener l) {
		broadcastListeners.remove(l);
	}
	public UbiBrodcastBotsRequest() {
		broadcastListeners = new ArrayList<IBotRequestListener>();
	}
	@Override
	public void onReceive(Context context, Intent intent) {
		Bundle extras = intent.getExtras();
		if (extras != null && extras.containsKey("/bots/request")) {
			notifyBroadcast();
		}
	}
	private void notifyBroadcast() {
		for (IBotRequestListener l : broadcastListeners) {
			l.handleBroadcast();
		}
	}
}
