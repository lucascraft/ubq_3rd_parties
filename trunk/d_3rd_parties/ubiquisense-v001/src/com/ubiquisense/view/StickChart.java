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

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

import com.ubiquisense.entity.StickEntity;

public class StickChart extends GridChart {
	
	public static final int DEFAULT_LATITUDE_NUM = 4;
	
	public static final int DEFAULT_LONGTITUDE_NUM = 3;
	
	public static final int DEFAULT_STICK_BORDER_COLOR = Color.RED;
	
	public static final int DEFAULT_STICK_FILL_COLOR = Color.RED;

	private int stickBorderColor = DEFAULT_STICK_BORDER_COLOR ;

	private int stickFillColor = DEFAULT_STICK_FILL_COLOR;
	
	private int latitudeNum = DEFAULT_LATITUDE_NUM;
	
	private int longtitudeNum = DEFAULT_LONGTITUDE_NUM;
	
	private List<StickEntity> StickData;
	
	private int maxStickDataNum;

	protected float maxValue;

	protected float minValue;	
	

	public StickChart(Context context) {
		super(context);
	}

	public StickChart(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public StickChart(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	
	@Override
	public void draw(Canvas canvas) {
		super.draw(canvas);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		initAxisY();
		initAxisX();
		super.onDraw(canvas);

		drawSticks(canvas);
	}
	
	
	@Override
	public String getAxisXGraduate(Object value){
		float graduate = Float.valueOf(super.getAxisXGraduate(value));
		int index = (int) Math.floor(graduate*maxStickDataNum);
		
		if(index >= maxStickDataNum){
			index = maxStickDataNum -1;
		}else if(index < 0){
			index = 0;
		}
		
		return String.valueOf(StickData.get(index).getDate());
	}
	
	@Override
	public String getAxisYGraduate(Object value){
		float graduate = Float.valueOf(super.getAxisYGraduate(value));
		return  String.valueOf((int)Math.floor(graduate * (maxValue - minValue) + minValue));
	}
	
	@Override
	public void notifyEvent(GridChart chart) {
		
		CandleStickChart candlechart = (CandleStickChart)chart;
		
		this.maxStickDataNum = candlechart.getMaxCandleSticksNum();
		
		super.setDisplayCrossYOnTouch(false);
		super.notifyEvent(chart);
		super.notifyEventAll(this);
	}
	
	/**
	 * 初始化X轴
	 */
	protected void initAxisX() {
		List<String> TitleX = new ArrayList<String>();
		if(null != StickData){
			float average = maxStickDataNum / longtitudeNum;
			for (int i = 0; i < longtitudeNum; i++) {
				int index = (int) Math.floor(i * average);
				if(index > maxStickDataNum-1){
					index = maxStickDataNum-1;
				}
				TitleX.add(String.valueOf(StickData.get(index).getDate()).substring(4));
			}
			TitleX.add(String.valueOf(StickData.get(maxStickDataNum-1).getDate()).substring(4));
		}
		super.setAxisXTitles(TitleX);
	}
	
	public int getSelectedIndex() {
		if(null == super.getTouchPoint()){
			return 0;
		}
		float graduate = Float.valueOf(super.getAxisXGraduate(super.getTouchPoint().x));
		int index = (int) Math.floor(graduate*maxStickDataNum);
		
		if(index >= maxStickDataNum){
			index = maxStickDataNum -1;
		}else if(index < 0){
			index = 0;
		}
		
		return index;
	}
	
	protected void drawWithFingerMove() {
	}
	
	protected void initAxisY() {
		List<String> TitleY = new ArrayList<String>();
		float average = (int)((maxValue - minValue) / latitudeNum)/100 * 100;;
		for (int i = 0; i < latitudeNum; i++) {
			String value = String.valueOf((int)Math.floor(minValue + i * average));
			if(value.length() < super.getAxisYMaxTitleLength()){
				while(value.length() < super.getAxisYMaxTitleLength()){
					value = new String(" ") + value;
				}
			}
			TitleY.add(value);
		}
		String value = String.valueOf((int)Math.floor(((int)maxValue) / 100 * 100));
		if(value.length() < super.getAxisYMaxTitleLength()){
			while(value.length() < super.getAxisYMaxTitleLength()){
				value = new String(" ") + value;
			}
		}
		TitleY.add(value);

		super.setAxisYTitles(TitleY);
	}

	protected void drawSticks(Canvas canvas) {
		float stickWidth = ((super.getWidth() - super.getAxisMarginLeft()-super.getAxisMarginRight()) / maxStickDataNum) - 1;
		float stickX = super.getAxisMarginLeft() + 1;

		Paint mPaintStick = new Paint();
		mPaintStick.setColor(stickFillColor);

		if(null != StickData){
			
			for (int i = 0; i < StickData.size(); i++) {
				StickEntity ohlc = StickData.get(i);
	
				float highY = (float) ((1f - (ohlc.getHigh() - minValue)
						/ (maxValue - minValue)) * (super.getHeight() - super
						.getAxisMarginBottom()) - super.getAxisMarginTop());
				float lowY = (float) ((1f - (ohlc.getLow() - minValue)
						/ (maxValue - minValue)) * (super.getHeight() - super
						.getAxisMarginBottom()) - super.getAxisMarginTop());
	
				if(stickWidth >= 2f){
					canvas.drawRect(stickX, highY, stickX + stickWidth, lowY, mPaintStick);
				}else{
					canvas.drawLine(stickX, highY, stickX , lowY, mPaintStick);
				}
				
				stickX = stickX + 1 + stickWidth;
			}
		}
	}
	
	public void pushData(StickEntity entity){
		if(null != entity){
			addData(entity);
			super.postInvalidate();
		}
	}
	
	public void addData(StickEntity entity){
		if(null != entity){
			if(null == StickData || 0 == StickData.size() ){
				StickData = new ArrayList<StickEntity>();
				this.maxValue = ((int)entity.getHigh()) / 100 * 100;
			}
			
			this.StickData.add(entity);
			
			if (this.maxValue < entity.getHigh()){
				this.maxValue = 100 + ((int)entity.getHigh()) / 100 * 100;
			}
			
			if(StickData.size() > maxStickDataNum){
				maxStickDataNum = maxStickDataNum +1;
			}
		}
	}
	
	public List<StickEntity> getStickData() {
		return StickData;
	}

	public void setStickData(List<StickEntity> stickData) {
		if(null != StickData){
			StickData.clear();
		}
		for(StickEntity e :stickData){
			addData(e);
		}
	}

	public int getStickFillColor() {
		return stickFillColor;
	}

	public void setStickFillColor(int stickFillColor) {
		this.stickFillColor = stickFillColor;
	}

	public int getLatitudeNum() {
		return latitudeNum;
	}

	public void setLatitudeNum(int latitudeNum) {
		this.latitudeNum = latitudeNum;
	}

	public int getMaxStickDataNum() {
		return maxStickDataNum;
	}

	public void setMaxStickDataNum(int maxStickDataNum) {
		this.maxStickDataNum = maxStickDataNum;
	}

	public float getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(float maxValue) {
		this.maxValue = maxValue;
	}

	public float getMinValue() {
		return minValue;
	}

	public void setMinValue(float minValue) {
		this.minValue = minValue;
	}

	public int getStickBorderColor() {
		return stickBorderColor;
	}

	public void setStickBorderColor(int stickBorderColor) {
		this.stickBorderColor = stickBorderColor;
	}

	public int getLongtitudeNum() {
		return longtitudeNum;
	}

	public void setLongtitudeNum(int longtitudeNum) {
		this.longtitudeNum = longtitudeNum;
	}
}
