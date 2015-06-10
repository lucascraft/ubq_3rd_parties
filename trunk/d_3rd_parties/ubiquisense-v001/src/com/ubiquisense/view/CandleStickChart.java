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
import android.util.FloatMath;
import android.util.Log;
import android.view.MotionEvent;

import com.ubiquisense.entity.OHLCEntity;


public class CandleStickChart extends GridChart {
	
	public static final int DEFAULT_LATITUDE_NUM = 4;
	public static final int DEFAULT_LONGTITUDE_NUM = 3;
	public static final int DEFAULT_POSITIVE_STICK_BORDER_COLOR = Color.GREEN;
	public static final int DEFAULT_POSITIVE_STICK_FILL_COLOR = Color.GREEN;
	public static final int DEFAULT_NEGATIVE_STICK_BORDER_COLOR = Color.RED;
	public static final int DEFAULT_NEGATIVE_STICK_FILL_COLOR = Color.RED;
	public static final int DEFAULT_CROSS_STICK_COLOR = DEFAULT_POSITIVE_STICK_BORDER_COLOR;

	private int positiveStickBorderColor = DEFAULT_POSITIVE_STICK_BORDER_COLOR ;

	private int positiveStickFillColor = DEFAULT_POSITIVE_STICK_FILL_COLOR;

	private int negativeStickBorderColor = DEFAULT_NEGATIVE_STICK_BORDER_COLOR;

	private int negativeStickFillColor = DEFAULT_NEGATIVE_STICK_FILL_COLOR;

	private int crossStickColor = DEFAULT_CROSS_STICK_COLOR;
	
	private int latitudeNum = DEFAULT_LATITUDE_NUM;
	
	private int longtitudeNum = DEFAULT_LONGTITUDE_NUM;
	
	private List<OHLCEntity> OHLCData;
	
	private int maxCandleSticksNum;

	private float maxPrice = 0;
	private float minPrice = 0;	
	
	public CandleStickChart(Context context) {
		super(context);
	}
	public CandleStickChart(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	public CandleStickChart(Context context, AttributeSet attrs) {
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

		drawCandleSticks(canvas);
	}

	@Override
	public String getAxisXGraduate(Object value){
		float graduate = Float.valueOf(super.getAxisXGraduate(value));
		int index = (int) Math.floor(graduate*maxCandleSticksNum);
		
		if(index >= maxCandleSticksNum){
			index = maxCandleSticksNum -1;
		}else if(index < 0){
			index = 0;
		}
		
		return String.valueOf(OHLCData.get(index).getDate());
	}
	
	public int getSelectedIndex() {
		if(null == super.getTouchPoint()){
			return 0;
		}
		float graduate = Float.valueOf(super.getAxisXGraduate(super.getTouchPoint().x));
		int index = (int) Math.floor(graduate*maxCandleSticksNum);
		
		if(index >= maxCandleSticksNum){
			index = maxCandleSticksNum -1;
		}else if(index < 0){
			index = 0;
		}
		
		return index;
	}
	
	@Override
	public String getAxisYGraduate(Object value){
		float graduate = Float.valueOf(super.getAxisYGraduate(value));
		return  String.valueOf((int)Math.floor(graduate * (maxPrice - minPrice) + minPrice));
	}
	
	protected void drawWithFingerMove() {
	}
	
	protected void initAxisX() {
		List<String> TitleX = new ArrayList<String>();
		try {
			if(null != OHLCData && !OHLCData.isEmpty() && longtitudeNum != 0){
				float average = maxCandleSticksNum / longtitudeNum;
				for (int i = 0; i < longtitudeNum; i++) {
					int index = (int) Math.floor(i * average);
					if(index > maxCandleSticksNum-1){
						index = maxCandleSticksNum-1;
					}
					if (OHLCData.size()-1>index) {
						String v = String.valueOf(OHLCData.get(index).getDate());
						if (v !=null && v.length()>4) {
							TitleX.add(v.substring(4));
						}
					}
				}
				if (OHLCData.size()-1>maxCandleSticksNum-1) {
					String v = String.valueOf(OHLCData.get(maxCandleSticksNum-1).getDate());
					if (v !=null && v.length()>4) {
						TitleX.add(v.substring(4));
					}
				}
			}
		} catch (Exception ex) {
			Log.e("init-axis-x", ex.toString());
		}
		super.setAxisXTitles(TitleX);
	}
	protected void initAxisY() {
		List<String> TitleY = new ArrayList<String>();
		try {
			if (latitudeNum != 0) {
				float average = (int)((maxPrice - minPrice) / latitudeNum)/10 * 10;
				for (int i = 0; i < latitudeNum; i++) {
					String value = String.valueOf((int)Math.floor(minPrice + i * average));
					if(value.length() < super.getAxisYMaxTitleLength()){
						while(value.length() < super.getAxisYMaxTitleLength()){
							value = new String(" ") + value;
						}
					}
					TitleY.add(value);
				}
			}
			String value = String.valueOf((int)Math.floor(((int)maxPrice) / 10 * 10));
			if(value.length() < super.getAxisYMaxTitleLength()){
				while(value.length() < super.getAxisYMaxTitleLength()){
					value = new String(" ") + value;
				}
			}
			TitleY.add(value);
		} catch (Exception ex) {
			Log.e("init-axis-y", ex.toString());
		}
		super.setAxisYTitles(TitleY);
	}
	protected void drawCandleSticks(Canvas canvas) {
		try {
			if (maxCandleSticksNum != 0) {
				float stickWidth = ((super.getWidth() - super.getAxisMarginLeft()-super.getAxisMarginRight()) / maxCandleSticksNum) - 1;
				float stickX = super.getAxisMarginLeft() + 1;
		
				Paint mPaintPositive = new Paint();
				mPaintPositive.setColor(positiveStickFillColor);
		
				Paint mPaintNegative = new Paint();
				mPaintNegative.setColor(negativeStickFillColor);
				
				Paint mPaintCross = new Paint();
				mPaintCross.setColor(crossStickColor);
		
				if(null !=  OHLCData){
					float dPrice = maxPrice - minPrice;
					if (dPrice>0) {
						for (int i = 0; i < OHLCData.size(); i++) {
							OHLCEntity ohlc = OHLCData.get(i);
							float openY = (float) ((1f - (ohlc.getOpen() - minPrice)
									/ dPrice) * (super.getHeight() - super
									.getAxisMarginBottom()) - super.getAxisMarginTop());
							float highY = (float) ((1f - (ohlc.getHigh() - minPrice)
									/ dPrice) * (super.getHeight() - super
									.getAxisMarginBottom()) - super.getAxisMarginTop());
							float lowY = (float) ((1f - (ohlc.getLow() - minPrice)
									/ dPrice) * (super.getHeight() - super
									.getAxisMarginBottom()) - super.getAxisMarginTop());
							float closeY = (float) ((1f - (ohlc.getClose() - minPrice)
									/ dPrice) * (super.getHeight() - super
									.getAxisMarginBottom()) - super.getAxisMarginTop());
				
							if (ohlc.getOpen() < ohlc.getClose()) {
								if(stickWidth >= 2f){
									canvas.drawRect(stickX, closeY, stickX + stickWidth, openY,
											mPaintPositive);
								}
								canvas.drawLine(stickX + stickWidth / 2f, highY, stickX
										+ stickWidth / 2f, lowY, mPaintPositive);
							} else if (ohlc.getOpen() > ohlc.getClose()) {
								if(stickWidth >= 2f){
									canvas.drawRect(stickX, openY, stickX + stickWidth, closeY,
											mPaintNegative);
								}
								canvas.drawLine(stickX + stickWidth / 2f, highY, stickX
										+ stickWidth / 2f, lowY, mPaintNegative);
							} else {
								if(stickWidth >= 2f){
									canvas.drawLine(stickX, closeY, stickX + stickWidth, openY,
											mPaintCross);
								}
								canvas.drawLine(stickX + stickWidth / 2f, highY, stickX
										+ stickWidth / 2f, lowY, mPaintCross);
							}
							stickX = stickX + 1 + stickWidth;
						}
					}
				}
			}
		} catch (Exception ex) {
			Log.e("drawCandleSticks", ex.toString());
		}
	}
	public void pushData(OHLCEntity entity){
		if(null != entity){
			addData(entity);
			super.postInvalidate();
		}
	}
	public void addData(OHLCEntity entity){
		if(null != entity){
			if(null == OHLCData || 0==OHLCData.size()){
				OHLCData = new ArrayList<OHLCEntity>();
				this.minPrice = ((int)entity.getLow()) / 10 * 10;
				this.maxPrice = ((int)entity.getHigh()) / 10 * 10;
			}
			
			this.OHLCData.add(entity);
			
			if (this.minPrice > entity.getLow()){
				this.minPrice = ((int)entity.getLow()) / 10 * 10;
			}
			
			if (this.maxPrice < entity.getHigh()){
				this.maxPrice = 10 + ((int)entity.getHigh()) / 10 * 10;
			}
			
			if(OHLCData.size() > maxCandleSticksNum){
				maxCandleSticksNum = maxCandleSticksNum +1;
			}
		}
	}
	public List<OHLCEntity> getOHLCData() {
		return OHLCData;
	}
	public void setOHLCData(List<OHLCEntity> data) {
		if(null != OHLCData){
			OHLCData.clear();
		}
		for(OHLCEntity e :data){
			addData(e);
		}
	}
	public int getPositiveStickBorderColor() {
		return positiveStickBorderColor;
	}
	public void setPositiveStickBorderColor(int positiveStickBorderColor) {
		this.positiveStickBorderColor = positiveStickBorderColor;
	}
	public int getPositiveStickFillColor() {
		return positiveStickFillColor;
	}
	public void setPositiveStickFillColor(int positiveStickFillColor) {
		this.positiveStickFillColor = positiveStickFillColor;
	}
	public int getNegativeStickBorderColor() {
		return negativeStickBorderColor;
	}
	public void setNegativeStickBorderColor(int negativeStickBorderColor) {
		this.negativeStickBorderColor = negativeStickBorderColor;
	}
	public int getNegativeStickFillColor() {
		return negativeStickFillColor;
	}
	public void setNegativeStickFillColor(int negativeStickFillColor) {
		this.negativeStickFillColor = negativeStickFillColor;
	}
	public int getCrossStickColor() {
		return crossStickColor;
	}
	public void setCrossStickColor(int crossStickColor) {
		this.crossStickColor = crossStickColor;
	}
	public int getLatitudeNum() {
		return latitudeNum;
	}
	public void setLatitudeNum(int latitudeNum) {
		this.latitudeNum = latitudeNum;
	}
	public int getMaxCandleSticksNum() {
		return maxCandleSticksNum;
	}
	public void setMaxCandleSticksNum(int maxCandleSticksNum) {
		this.maxCandleSticksNum = maxCandleSticksNum;
	}
	public float getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(float maxPrice) {
		this.maxPrice = maxPrice;
	}
	public float getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(float minPrice) {
		this.minPrice = minPrice;
	}

	public int getLongtitudeNum() {
		return longtitudeNum;
	}
	public void setLongtitudeNum(int longtitudeNum) {
		this.longtitudeNum = longtitudeNum;
	}
	
	private final int NONE = 0;
	private final int ZOOM = 1;
	private final int DOWN = 2;
	
	private float olddistance = 0f;
	private float newdistance = 0f;
	
	private int TOUCH_MODE;
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		final float MIN_LENGTH = (super.getWidth()/40)<5?5:(super.getWidth()/50);
		switch (event.getAction() & MotionEvent.ACTION_MASK) {
			case MotionEvent.ACTION_DOWN:
				TOUCH_MODE = DOWN;
				break;
			case MotionEvent.ACTION_UP:
			case MotionEvent.ACTION_POINTER_UP:
				TOUCH_MODE = NONE;
				return super.onTouchEvent(event);
			case MotionEvent.ACTION_POINTER_DOWN:
				olddistance = spacing(event);
				if (olddistance > MIN_LENGTH) {
					TOUCH_MODE = ZOOM;
				}
				break;
			case MotionEvent.ACTION_MOVE:
				if(TOUCH_MODE == ZOOM){
					newdistance = spacing(event);
					if (newdistance > MIN_LENGTH && Math.abs(newdistance - olddistance) > MIN_LENGTH) {
						if(newdistance > olddistance){
							zoomIn();
						}else{
							zoomOut();
						}
						olddistance = newdistance;
						super.postInvalidate();
						super.notifyEventAll(this);
					}
				}
				break;
		}
		return true;
	}
	protected void zoomIn(){
		if(maxCandleSticksNum > 10){
			maxCandleSticksNum = maxCandleSticksNum -3;
		}
	}
	protected void zoomOut(){
		if(maxCandleSticksNum < OHLCData.size()-1){
			maxCandleSticksNum = maxCandleSticksNum +3;
		}
	}
	private float spacing(MotionEvent event) {
		float x = event.getX(0) - event.getX(1);
		float y = event.getY(0) - event.getY(1);
		return FloatMath.sqrt(x * x + y * y);
	} 
}
