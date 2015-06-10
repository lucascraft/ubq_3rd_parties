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
import android.graphics.Color;
import android.os.Bundle;

import com.ubiquisense.view.CandleStickChart;

public class MarketChartsActivity extends Activity {
	private CandleStickChart candlestickchart;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.charts_main);

		initCandleStickChart();
	}
	
	private void initCandleStickChart() {
        this.candlestickchart = (CandleStickChart)findViewById(R.id.candlestickchart);
        candlestickchart.setAxisXColor(Color.LTGRAY);
        candlestickchart.setAxisYColor(Color.LTGRAY);
        candlestickchart.setLatitudeColor(Color.GRAY);
        candlestickchart.setLongitudeColor(Color.GRAY);
        candlestickchart.setBorderColor(Color.LTGRAY);
        candlestickchart.setLongtitudeFontColor(Color.WHITE);
        candlestickchart.setLatitudeFontColor(Color.WHITE);
        candlestickchart.setAxisMarginRight(1);
        
        candlestickchart.setMaxCandleSticksNum(52);
        candlestickchart.setLatitudeNum(5);
        candlestickchart.setLongtitudeNum(3);
        candlestickchart.setMaxPrice(1000);
        candlestickchart.setMinPrice(200);
        
        candlestickchart.setDisplayAxisXTitle(true);
        candlestickchart.setDisplayAxisYTitle(true);
        candlestickchart.setDisplayLatitude(true);
        candlestickchart.setDisplayLongitude(true);
        candlestickchart.setBackgroudColor(Color.BLACK);
	}
}
