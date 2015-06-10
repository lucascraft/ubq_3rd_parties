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
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.ubiquisense.entity.TitleValueColorEntity;

public class PieChart extends View {

	public static final String DEFAULT_TITLE = "Pie Chart";
	
	public static final boolean DEFAULT_DISPLAY_RADIUS = true;
	
	public static final int DEFAULT_RADIUS_LENGTH = 80;
	
	public static final int DEFAULT_RADIUS_COLOR = Color.WHITE;
	
	public static final int DEFAULT_CIRCLE_BORDER_COLOR = Color.WHITE;
	
	public static final Point DEFAULT_POSITION = new Point(0,0);
	
	private List<TitleValueColorEntity> data;
	
	private String title = DEFAULT_TITLE;

	private Point position = DEFAULT_POSITION;
	
	private int radiusLength = DEFAULT_RADIUS_LENGTH;
	
	private int radiusColor = DEFAULT_RADIUS_COLOR;
	
	private int circleBorderColor = DEFAULT_CIRCLE_BORDER_COLOR;
	
	private boolean displayRadius = DEFAULT_DISPLAY_RADIUS;
	

	public PieChart(Context context) {
		super(context);
	}

	public PieChart(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}


	public PieChart(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		int rect = super.getWidth() > super.getHeight()? super.getHeight(): super.getWidth();
		
		radiusLength = (int)((rect / 2f) * 0.90); 
		
		position = new Point((int)(getWidth() / 2f),(int)(getHeight() / 2f));
		
		drawCircle(canvas);
		
		drawData(canvas);
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		setMeasuredDimension(measureWidth(widthMeasureSpec),
				measureHeight(heightMeasureSpec));
	}

	private int measureWidth(int measureSpec) {
		int result = 0;
		int specMode = MeasureSpec.getMode(measureSpec);
		int specSize = MeasureSpec.getSize(measureSpec);

		if (specMode == MeasureSpec.EXACTLY) {
			result = specSize;
		} else if (specMode == MeasureSpec.AT_MOST) {
			result = Math.min(result, specSize);
		}
		return result;
	}

	private int measureHeight(int measureSpec) {
		int result = 0;
		int specMode = MeasureSpec.getMode(measureSpec);
		int specSize = MeasureSpec.getSize(measureSpec);

		if (specMode == MeasureSpec.EXACTLY) {
			result = specSize;
		} else if (specMode == MeasureSpec.AT_MOST) {
			result = Math.min(result, specSize);
		}
		return result;
	}

	protected void drawCircle(Canvas canvas){
	
		Paint mPaintCircleBorder =new Paint();
		mPaintCircleBorder.setColor(Color.WHITE);
		mPaintCircleBorder.setStyle(Style.STROKE);
		mPaintCircleBorder.setStrokeWidth(2);
		mPaintCircleBorder.setAntiAlias(true);
		
		canvas.drawCircle(position.x, position.y, radiusLength, mPaintCircleBorder);
	}
	
	protected void drawData(Canvas canvas) {
		if (null != data) {
			
			float sum = 0;
			for (int i = 0; i < data.size(); i++) {
				sum = sum + data.get(i).getValue();
			}
			
			Paint mPaintFill = new Paint();
			mPaintFill.setStyle(Style.FILL);
			mPaintFill.setAntiAlias(true);
			
			Paint mPaintBorder = new Paint();
			mPaintBorder.setStyle(Style.STROKE);
			mPaintBorder.setColor(radiusColor);
			mPaintBorder.setAntiAlias(true);
			
			int offset = -90;
			for (int j = 0; j < data.size(); j++) {
				TitleValueColorEntity e = data.get(j);
				mPaintFill.setColor(e.getColor());

				RectF oval = new RectF(position.x - radiusLength,
									   position.y - radiusLength,
									   position.x + radiusLength,
									   position.y + radiusLength);
				int sweep = Math.round(e.getValue() / sum * 360f);
				canvas.drawArc(oval, offset, sweep, true, mPaintFill);
				canvas.drawArc(oval, offset, sweep, true, mPaintBorder);
				offset = offset + sweep;
			}
			
			float sumvalue = 0f;
			for (int k = 0; k < data.size(); k++) {
				TitleValueColorEntity e = data.get(k);
				float value = e.getValue();
				sumvalue = sumvalue + value;
				float rate = (sumvalue - value /2)/ sum ;
				mPaintFill.setColor(Color.BLUE);
				
				float percentage = (int)( value / sum * 10000) / 100f;
				
				float offsetX = (float) (position.x - radiusLength * 0.5 * Math.sin(rate * -2 * Math.PI ));
				float offsetY = (float) (position.y - radiusLength * 0.5 * Math.cos(rate * -2 * Math.PI ));
				
				
				Paint mPaintFont =new Paint();
				mPaintFont.setColor(Color.LTGRAY);
				
				String title =e.getTitle();
				float  realx = 0;
				float  realy = 0;
				
				if(offsetX < position.x){
					realx = offsetX - mPaintFont.measureText(title) -5;
				}else if(offsetX > position.x){
					realx  = offsetX + 5;
				}
				
				if(offsetY > position.y){
					if(value / sum < 0.2f){
						realy = offsetY + 10;
					}else{
						realy = offsetY + 5;
					}
				}else if(offsetY < position.y){
					if(value / sum < 0.2f){
						realy = offsetY - 10;
					}else{
						realy = offsetY + 5;
					}
				}
				
								
				canvas.drawText(title ,realx , realy ,mPaintFont );
				
				canvas.drawText(String.valueOf(percentage)+ "%",realx,realy+12, mPaintFont);
				
			}
		}
	}

	public List<TitleValueColorEntity> getData() {
		return data;
	}

	public void setData(List<TitleValueColorEntity> data) {
		this.data = data;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public int getRadiusLength() {
		return radiusLength;
	}

	public void setRadiusLength(int radiusLength) {
		this.radiusLength = radiusLength;
	}

	public int getRadiusColor() {
		return radiusColor;
	}

	public void setRadiusColor(int radiusColor) {
		this.radiusColor = radiusColor;
	}

	public int getCircleBorderColor() {
		return circleBorderColor;
	}

	public void setCircleBorderColor(int circleBorderColor) {
		this.circleBorderColor = circleBorderColor;
	}

	public boolean isDisplayRadius() {
		return displayRadius;
	}

	public void setDisplayRadius(boolean displayRadius) {
		this.displayRadius = displayRadius;
	}

}
