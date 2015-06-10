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

package com.ubiquisense.view;

import java.util.List;

import android.widget.TextView;

import com.ubiquisense.entity.LineEntity;
import com.ubiquisense.entity.StickEntity;

public class MAStickChartTouchEventAssemble implements ITouchEventResponse {

	private TextView tvMA5;
	private TextView tvMA10;
	private TextView tvMA25;
	private TextView tvV;
	
	
	public void notifyEvent(GridChart chart ,int index) {
		MAStickChart machart = (MAStickChart)chart;
		
		List<StickEntity> stickData = machart.getStickData();
		List<LineEntity> lineData = machart.getLineData();
		
		if(null==stickData||null ==lineData){
			return;
		}
		
		LineEntity ma5 = lineData.get(0);
		LineEntity ma10 = lineData.get(1);
		LineEntity ma25 = lineData.get(2);
		
		if(index >= stickData.size()||index <0){
			return;
			//index = stickData.size() -1;
		}
		
		StickEntity e = stickData.get(index);
		if(null != tvV){
			tvV.setText(String.valueOf((int)(e.getHigh())));
		}
		
		tvMA5.setText(ma5.getTitle() + "=" +String.valueOf((int)ma5.getLineData().get(index).floatValue()));
		tvMA5.setTextColor(ma5.getLineColor());
		tvMA10.setText(ma10.getTitle() + "=" +String.valueOf((int)ma10.getLineData().get(index).floatValue()));
		tvMA10.setTextColor(ma10.getLineColor());
		tvMA25.setText(ma25.getTitle() + "=" +String.valueOf((int)ma25.getLineData().get(index).floatValue()));
		tvMA25.setTextColor(ma25.getLineColor());
	}

	
	public void notifyEvent(GridChart chart) {
		
		MAStickChart machart = (MAStickChart)chart;
		
		int index = machart.getSelectedIndex();
		
		notifyEvent(chart,index);
	}


	public TextView getTvMA5() {
		return tvMA5;
	}


	public void setTvMA5(TextView tvMA5) {
		this.tvMA5 = tvMA5;
	}


	public TextView getTvMA10() {
		return tvMA10;
	}


	public void setTvMA10(TextView tvMA10) {
		this.tvMA10 = tvMA10;
	}


	public TextView getTvMA25() {
		return tvMA25;
	}


	public void setTvMA25(TextView tvMA25) {
		this.tvMA25 = tvMA25;
	}


	public TextView getTvV() {
		return tvV;
	}


	public void setTvV(TextView tvV) {
		this.tvV = tvV;
	}
}
