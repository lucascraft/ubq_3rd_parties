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

import java.util.Date;
import java.util.List;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonElement;
import com.ubiquisense.broadcast.IBotRequestListener;
import com.ubiquisense.broadcast.UbiBrodcastBotsRequest;
import com.ubiquisense.data.FetchUtils;
import com.ubiquisense.data.Market;
import com.ubiquisense.data.MtGoxDataManager;
import com.ubiquisense.entity.OHLCEntity;
import com.ubiquisense.util.SystemUiHider;
import com.ubiquisense.view.CandleStickChart;
import com.ubiquisense.websocket.IAlertsListener;
import com.ubiquisense.websocket.IBotsListener;
import com.ubiquisense.websocket.IChannelListener;
import com.ubiquisense.websocket.IDepthListener;
import com.ubiquisense.websocket.IFetchListener;
import com.ubiquisense.websocket.WSocketComm;
import com.ubiquisense.websocket.WSocketUbiquisense2;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class UbiFullscreenActivity extends Activity {
	/**
	 * Whether or not the system UI should be auto-hidden after
	 * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
	 */
	private static final boolean AUTO_HIDE = true;

	/**
	 * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
	 * user interaction before hiding the system UI.
	 */
	private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

	/**
	 * If set, will toggle the system UI visibility upon interaction. Otherwise,
	 * will show the system UI visibility upon interaction.
	 */
	private static final boolean TOGGLE_ON_CLICK = true;

	/**
	 * The flags to pass to {@link SystemUiHider#getInstance}.
	 */
	private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;

	/**
	 * The instance of the {@link SystemUiHider} for this activity.
	 */
	private SystemUiHider mSystemUiHider;
	
	private WSocketComm wsMTGox;
	private WSocketUbiquisense2 wsUbiquisense;
	private UbiBrodcastBotsRequest brodcastReceiver;
	private Boolean myReceiverIsRegistered = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_ubi_fullscreen);
		
		brodcastReceiver = new UbiBrodcastBotsRequest();
		brodcastReceiver.addBroadcastListener(new IBotRequestListener() {
			@Override
			public void handleBroadcast() {
				wsMTGox.getUbiquisenseThread().run();
			}
		});

		final View controlsView	= findViewById(R.id.fullscreen_content_controls);
		final View contentView	= findViewById(R.id.fullscreen_content);

		// Set up an instance of SystemUiHider to control the system UI for
		// this activity.
		mSystemUiHider = SystemUiHider.getInstance(this, contentView, HIDER_FLAGS);
		mSystemUiHider.setup();
		mSystemUiHider.setOnVisibilityChangeListener(new SystemUiHider.OnVisibilityChangeListener() {
			// Cached values.
			int mControlsHeight;
			int mShortAnimTime;

			@Override
			@TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
			public void onVisibilityChange(boolean visible) {
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
					// If the ViewPropertyAnimator API is available
					// (Honeycomb MR2 and later), use it to animate the
					// in-layout UI controls at the bottom of the
					// screen.
					if (mControlsHeight == 0) {
						mControlsHeight = controlsView.getHeight();
					}
					if (mShortAnimTime == 0) {
						mShortAnimTime = getResources().getInteger(
						android.R.integer.config_shortAnimTime);
					}
					controlsView.animate().translationY(visible ? 0 : mControlsHeight).setDuration(mShortAnimTime);
				} else {
					// If the ViewPropertyAnimator APIs aren't
					// available, simply show or hide the in-layout UI
					// controls.
					controlsView.setVisibility(visible ? View.VISIBLE : View.GONE);
				}

				if (visible && AUTO_HIDE) {
					// Schedule a hide().
					delayedHide(AUTO_HIDE_DELAY_MILLIS);
				}
			}
		});

		// Set up the user interaction to manually show or hide the system UI.
		contentView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (TOGGLE_ON_CLICK) {
					mSystemUiHider.toggle();
				} else {
					mSystemUiHider.show();
				}
			}
		});

		// Upon interacting with UI controls, delay any scheduled hide()
		// operations to prevent the jarring behavior of controls going away
		// while interacting with the UI.
		findViewById(R.id.bots_button).setOnTouchListener(mDelayHideTouchListener);
		findViewById(R.id.bots_button).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				 Intent navBotIntent = new Intent(v.getContext(), BotMainActivity.class);
	             startActivityForResult(navBotIntent, 0);
			}
		});
		
		findViewById(R.id.charts_button).setOnTouchListener(mDelayHideTouchListener);
		findViewById(R.id.charts_button).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				 Intent navChartsIntent = new Intent(v.getContext(), MarketChartsActivity.class);
	             startActivityForResult(navChartsIntent, 0);
			}
		});

		findViewById(R.id.alerts_button).setOnTouchListener(mDelayHideTouchListener);
		findViewById(R.id.alerts_button).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				 Intent navChartsIntent = new Intent(v.getContext(), AlertsMainActivity.class);
	             startActivityForResult(navChartsIntent, 0);
			}
		});

		findViewById(R.id.settings_button).setOnTouchListener(mDelayHideTouchListener);
		findViewById(R.id.settings_button).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				 Intent navChartsIntent = new Intent(v.getContext(), SettingsMainActivity.class);
	             startActivityForResult(navChartsIntent, 0);
			}
		});

		findViewById(R.id.usb_button).setOnTouchListener(mDelayHideTouchListener);
		findViewById(R.id.usb_button).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				 Intent navChartsIntent = new Intent(v.getContext(), USBMainActivity.class);
	             startActivityForResult(navChartsIntent, 0);
			}
		});

		String addr			= "192.168.0.11";
		String mtgoxWSPort	= "8095";
		String ubiWSPort	= "8001";
		
		wsMTGox = new WSocketComm(
			getApplicationContext(),
			"ws://socketio.mtgox.com/socket.io/1/websocket/",
			"9e1f447e-b377-469f-b2b6-4be488316d7a", 
			"yOXO9npUgFth0FOEVle2dOuas9tbU49dZzK+rXbMHCjrxAMU+eKLn/WoNQXBMw3DOUNSXjqMnZVocIHtszIEYQ==",
			addr + ":" + mtgoxWSPort,
			true
		);
		
		//wsUbiquisense = new WSocketUbiquisense(getApplicationContext(), "ws://"+addr+":"+ubiWSPort, true);
		wsUbiquisense = new WSocketUbiquisense2("ws://"+addr+":"+ubiWSPort);
		wsUbiquisense.connect();
		
		wsMTGox.getMtgoxDataManager().addChannelListener(new IChannelListener() {
			@Override
			public void channelUpdate(MtGoxDataManager data, JsonElement o) {
				try {
					Log.i("channel", "channel event raised");
					final TextView tv = (TextView) findViewById(R.id.textTicker);
					final Market market = data.getMtGox().getMarket();
					final String broker = market.getBroker();
					final float buy	= market.getBuy();
					final float low	= market.getLow();
					final float high	= market.getHigh();
					final float sell	= market.getSell();
					runOnUiThread(new Runnable() {
						public void run() {
					    	 tv.setText("("+ broker + ") low " + low + " | " + high + " high, buy " + buy + " | " + sell + " sell : " + new Date());
					    	 contentView.invalidate();
					    	 controlsView.invalidate();
					    }
					});
				} catch(Exception ex) {
					Log.e("channel-listener", ex.toString());
				}
			}
		});
		wsMTGox.getMtgoxDataManager().addFetchListener(new IFetchListener() {
			@Override
			public void fetchUpdate(MtGoxDataManager data, JsonElement e) {
				try {
					if (!data.getMtGox().getFetchs().isEmpty()) {
						final CandleStickChart chart = (CandleStickChart) findViewById(R.id.candlestickchart);
						List<OHLCEntity> ohlc = FetchUtils.INSTANCE.updateOHLC(chart.getWidth(), chart.getHeight(), data.getMtGox().getFetchs());
						chart.setOHLCData(ohlc);
						runOnUiThread(new Runnable() {
							public void run() {
								Toast.makeText(getApplicationContext(), "Candle Stick Chart Refreshed", Toast.LENGTH_SHORT).show();
								chart.invalidate();
						    }
						});
					}
				} catch(Exception ex) {
					Log.e("fetch-listener", ex.toString());
				}
			}
		});
		wsMTGox.getMtgoxDataManager().addDepthListener(new IDepthListener() {
			@Override
			public void depthUpdate(MtGoxDataManager data, JsonElement e) {
				//boolean doNothing = true;
			}
		});
		wsMTGox.getMtgoxDataManager().addBotsListener(new IBotsListener() {
			@Override
			public void botsUpdate(MtGoxDataManager data, JsonElement e) {
				try {
					runOnUiThread(new Runnable() {
						public void run() {
							Toast.makeText(getApplicationContext(), "/bots/fetch", Toast.LENGTH_SHORT).show();
						}
					});
					Bundle objetbunble = new Bundle();
					objetbunble.putString("/bots/fetch", e.toString());
					Intent intent = new Intent("com.ubiquisense.bots.fetch");
					intent.putExtras(objetbunble);
					sendBroadcast(intent);
				} catch(Exception ex) {
					Log.e("bot-listener", ex.toString());
				}
			}
		});
		wsMTGox.getMtgoxDataManager().addAlertsListener(new IAlertsListener() {
			@Override
			public void alertsUpdate(MtGoxDataManager data, JsonElement e) {
				try {
					runOnUiThread(new Runnable() {
						public void run() {
							Toast.makeText(getApplicationContext(), "/alerts/fetch", Toast.LENGTH_SHORT).show();
						}
					});
					Bundle objetbunble = new Bundle();
					objetbunble.putString("/alerts/fetch", e.toString());
					Intent intent = new Intent("com.ubiquisense.alerts.fetch");
					intent.putExtras(objetbunble);
					sendBroadcast(intent);
				} catch(Exception ex) {
					Log.e("alert-listener", ex.toString());
				}
			}
		});
		wsMTGox.connect();
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		wsMTGox.close();
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		delayedHide(100);
	}

	/**
	 * Touch listener to use for in-layout UI controls to delay hiding the
	 * system UI. This is to prevent the jarring behavior of controls going away
	 * while interacting with activity UI.
	 */
	View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
		@Override
		public boolean onTouch(View view, MotionEvent motionEvent) {
			if (AUTO_HIDE) {
				delayedHide(AUTO_HIDE_DELAY_MILLIS);
			}
			return false;
		}
	};

	Handler mHideHandler = new Handler();
	Runnable mHideRunnable = new Runnable() {
		@Override
		public void run() {
			mSystemUiHider.hide();
		}
	};

	/**
	 * Schedules a call to hide() in [delay] milliseconds, canceling any
	 * previously scheduled calls.
	 */
	private void delayedHide(int delayMillis) {
		mHideHandler.removeCallbacks(mHideRunnable);
		mHideHandler.postDelayed(mHideRunnable, delayMillis);
	}
	
	
	
	
	@Override
	protected void onPause() {
		super.onPause();
		if (!myReceiverIsRegistered) {
		    registerReceiver(brodcastReceiver, new IntentFilter("com.ubiquisense.bots.request"));
		    myReceiverIsRegistered = true;
		}	
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		if (myReceiverIsRegistered) {
		    unregisterReceiver(brodcastReceiver);
		    myReceiverIsRegistered = false;
		}
	}
}
