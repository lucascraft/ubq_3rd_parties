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
import java.util.Iterator;

import android.app.Activity;
import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class USBMainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.usb_main);

        UsbManager manager = (UsbManager) getSystemService(Context.USB_SERVICE);
        UsbDeviceConnection connection;
        HashMap<String, UsbDevice> deviceList = manager.getDeviceList();
        Iterator<UsbDevice> deviceIterator = deviceList.values().iterator();
        UsbDevice device = null;
        
        while(deviceIterator.hasNext()){
            device = deviceIterator.next();
            
            final String s = device.getDeviceName();
            final int pid = device.getProductId();
            final int did = device.getDeviceId();
            
            //final int vid = device.getVendorId();
            
            runOnUiThread(new Runnable() {
				public void run() {
					Toast.makeText(getApplicationContext(), s+"\n"+Integer.toString(pid)+"\n"+Integer.toString(did), Toast.LENGTH_SHORT).show();
			    }
			});            
            
            TextView tv = (TextView) findViewById(R.id.usbTextView);
            tv.setText(s+"\n"+Integer.toString(pid)+"\n"+Integer.toString(did));
        }
        //connection = manager.openDevice(device);
        //DataTransfer dt = new DataTransfer(device,connection);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
