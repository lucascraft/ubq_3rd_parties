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

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class SplashActivity extends Activity {
	MediaPlayer player;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.splash_intro);
		
		player = MediaPlayer.create(this, R.raw.jungle01);
		player.start();
		
		Thread t = new Thread() {
			@Override
			public void run() {
				try {
					sleep(3500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent mainIntent = new  Intent("com.ubiquisense.SPLASHINTRO");
					startActivity(mainIntent);
				} 
			} 
		};
		t.start();
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		player.release();
		finish();
	}
}
