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
import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;

import com.ubiquisense.entity.LineEntity;

public class MAChart extends GridChart {
	private List<LineEntity> lineData;

	private int maxPointNum;

	private int minValue;

	private int maxValue;
	
	ArrayList<HashMap<String, Object>> listItem;

	public MAChart(Context context) {
		super(context);
	}

	public MAChart(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public MAChart(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public void draw(Canvas canvas) {
		super.draw(canvas);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		if (null != this.lineData) {
			drawLines(canvas);
		}
	}
	
	protected void drawLines(Canvas canvas){
		float lineLength = ((super.getWidth() - super.getAxisMarginLeft()-this.getMaxPointNum()) / this.getMaxPointNum())-1;
		float startX;
		
		for (int i = 0; i < lineData.size(); i++) {
			LineEntity line = (LineEntity)lineData.get(i);
			if(line.isDisplay()){
				Paint mPaint = new Paint();
				mPaint.setColor(line.getLineColor());
				mPaint.setAntiAlias(true);
				List<Float> lineData = line.getLineData();
				startX = super.getAxisMarginLeft() + lineLength / 2f;
				PointF ptFirst = null;
				if(lineData !=null){
					for(int j=0 ; j <lineData.size();j++){
						float value = lineData.get(j).floatValue();
						float valueY = (float) ((1f - (value - this.getMinValue())
								/ (this.getMaxValue() - this.getMinValue())) 
								* (super.getHeight() - super.getAxisMarginBottom()));
						
						if (j > 0){
							canvas.drawLine(ptFirst.x,ptFirst.y,startX,valueY,mPaint);
						}
						ptFirst = new PointF(startX , valueY);
						startX = startX + 1 + lineLength;
					}
				}
			}
		}
	}

	public List<LineEntity> getLineData() {
		return lineData;
	}

	public void setLineData(List<LineEntity> lineData) {
		this.lineData = lineData;
	}

	public int getMaxPointNum() {
		return maxPointNum;
	}

	public void setMaxPointNum(int maxPointNum) {
		this.maxPointNum = maxPointNum;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
}
