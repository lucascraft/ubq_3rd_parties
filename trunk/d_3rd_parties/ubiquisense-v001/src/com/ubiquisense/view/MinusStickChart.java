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

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;

import com.ubiquisense.entity.StickEntity;

public class MinusStickChart extends StickChart {
	
	public MinusStickChart(Context context) {
		super(context);
	}

	public MinusStickChart(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public MinusStickChart(Context context, AttributeSet attrs) {
		super(context, attrs);
	}


	@Override
	protected void drawSticks(Canvas canvas) {
		float stickWidth = ((super.getWidth() - super.getAxisMarginLeft()) / super.getMaxStickDataNum()) - 6;
		float stickX = super.getAxisMarginLeft() + 3;

		Paint mPaintFill = new Paint();
		mPaintFill.setStyle(Style.FILL);
		mPaintFill.setColor(super.getStickFillColor());
		
		Paint mPaintBorder = new Paint();
		mPaintBorder.setStyle(Style.STROKE);
		mPaintBorder.setStrokeWidth(2);
		mPaintBorder.setColor(super.getStickBorderColor());

		List<StickEntity> data = super.getStickData();
		
		if(null != data){
			for (int i = 0; i < data.size(); i++) {
				StickEntity e = data.get(i);
	
				float highY = (float) ((1f - (e.getHigh() - super.minValue)
						/ (maxValue - minValue)) * (super.getHeight() - super
						.getAxisMarginBottom()) - super.getAxisMarginTop());
				float lowY = (float) ((1f - (e.getLow() - minValue)
						/ (maxValue - minValue)) * (super.getHeight() - super
						.getAxisMarginBottom()) - super.getAxisMarginTop());
	
				canvas.drawRect(stickX, highY, stickX + stickWidth, lowY, mPaintFill);
				canvas.drawRect(stickX, highY, stickX + stickWidth, lowY, mPaintBorder);
				
				stickX = stickX + 6 + stickWidth;
			}
		}
	}
}
