/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package com.ubiquisense.usb;

import android.hardware.usb.UsbConstants;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;

public class DataTransfer extends Thread {
    UsbDevice device;
    UsbDeviceConnection connection;
    byte data = 1;
    public DataTransfer(UsbDevice device, UsbDeviceConnection connection) {
        device = this.device;
        connection = this.connection;
    }

    @Override
    public void run() {
        super.run();
        UsbInterface usbIf = device.getInterface(0);
        UsbEndpoint end1 = usbIf.getEndpoint(0);

        //UsbRequest ureq = connection.requestWait();
        final Object[] sSendLock = new Object[]{};
        boolean mStop = false;
        byte mData = 0x00;

        if(!connection.claimInterface(usbIf, true))
        {
            return;
        }

        connection.controlTransfer(0x21, 34, 0, 0, null, 0, 0);
        connection.controlTransfer(0x21, 32, 0, 0, new byte[] { (byte) 0x80,
                0x25, 0x00, 0x00, 0x00, 0x00, 0x08 }, 7, 0);
        connection.controlTransfer(0x40, 0x03, 0x4138, 0, null, 0, 0); //Baudrate 9600

        UsbEndpoint epIN = null;
        UsbEndpoint epOUT = null;

        for (int i = 0; i < usbIf.getEndpointCount(); i++) {
            if (usbIf.getEndpoint(i).getType() == UsbConstants.USB_ENDPOINT_XFER_BULK) {
                if (usbIf.getEndpoint(i).getDirection() == UsbConstants.USB_DIR_IN)
                    epIN = usbIf.getEndpoint(i);
                else
                    epOUT = usbIf.getEndpoint(i);
            }
        }

        for (;;) { // This is the main loop for transferring
            synchronized (sSendLock) { //OK, there should be a OUT queue, no guarantee that the byte is sent actually.
                try {
                    sSendLock.wait();
                }
                catch (InterruptedException e) {
                    if (mStop) {
                        return;
                    }
                    e.printStackTrace();
                }
                connection.bulkTransfer(epOUT,new byte[] {data}, 1, 0);
            }
        }
    }

}
