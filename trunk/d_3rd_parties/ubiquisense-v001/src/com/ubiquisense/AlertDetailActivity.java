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
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlertDetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.alert_detail);
		
		Button ok = (Button) findViewById(R.id.okAlertsButtonView);
		ok.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//HttpComm.INSTANCE.send();
			}
		});
		
		Button cancel = (Button) findViewById(R.id.cancelAlertButtonView);
	}
	
}
