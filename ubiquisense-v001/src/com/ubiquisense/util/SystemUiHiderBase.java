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

package com.ubiquisense.util;

import android.app.Activity;
import android.view.View;
import android.view.WindowManager;

/**
 * A base implementation of {@link SystemUiHider}. Uses APIs available in all
 * API levels to show and hide the status bar.
 */
public class SystemUiHiderBase extends SystemUiHider {
	/**
	 * Whether or not the system UI is currently visible. This is a cached value
	 * from calls to {@link #hide()} and {@link #show()}.
	 */
	private boolean mVisible = true;

	/**
	 * Constructor not intended to be called by clients. Use
	 * {@link SystemUiHider#getInstance} to obtain an instance.
	 */
	protected SystemUiHiderBase(Activity activity, View anchorView, int flags) {
		super(activity, anchorView, flags);
	}

	@Override
	public void setup() {
		if ((mFlags & FLAG_LAYOUT_IN_SCREEN_OLDER_DEVICES) == 0) {
			mActivity.getWindow().setFlags(
					WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
							| WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
					WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
							| WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
		}
	}

	@Override
	public boolean isVisible() {
		return mVisible;
	}

	@Override
	public void hide() {
		if ((mFlags & FLAG_FULLSCREEN) != 0) {
			mActivity.getWindow().setFlags(
					WindowManager.LayoutParams.FLAG_FULLSCREEN,
					WindowManager.LayoutParams.FLAG_FULLSCREEN);
		}
		mOnVisibilityChangeListener.onVisibilityChange(false);
		mVisible = false;
	}

	@Override
	public void show() {
		if ((mFlags & FLAG_FULLSCREEN) != 0) {
			mActivity.getWindow().setFlags(0,
					WindowManager.LayoutParams.FLAG_FULLSCREEN);
		}
		mOnVisibilityChangeListener.onVisibilityChange(true);
		mVisible = true;
	}
}
