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
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;

import com.ubiquisense.entity.TitleValueEntity;

public class SpiderWebChart extends View {

	public static final String DEFAULT_TITLE = "Spider Web Chart";
	
	public static final boolean DEFAULT_DISPLAY_LONGTITUDE = true;

	public static final int DEFAULT_LONGTITUDE_NUM = 5;
	
	public static final int DEFAULT_LONGTITUDE_LENGTH = 80;
	
	public static final int DEFAULT_LONGTITUDE_COLOR = Color.BLACK;
	
	public static final boolean DEFAULT_DISPLAY_LATITUDE = true;

	public static final int DEFAULT_LATITUDE_NUM = 5;
	
	public static final int DEFAULT_LATITUDE_COLOR = Color.BLACK;
	
	public static final Point DEFAULT_POSITION = new Point(0,0);
	
	public static final int DEFAULT_BACKGROUD_COLOR = Color.GRAY;
	
	public static final int[] COLORS = {Color.RED,Color.BLUE,Color.YELLOW};
	

	private List<List<TitleValueEntity>> data;
	
	private String title = DEFAULT_TITLE;

	private Point position = DEFAULT_POSITION;
	
	private boolean displayLongtitude =DEFAULT_DISPLAY_LONGTITUDE;

	private int longtitudeNum = DEFAULT_LONGTITUDE_NUM;
	
	private int longtitudeColor = DEFAULT_LONGTITUDE_COLOR;
	
	private int longtitudeLength = DEFAULT_LONGTITUDE_LENGTH;
	
	private boolean displayLatitude = DEFAULT_DISPLAY_LATITUDE;
	
	private int latitudeNum = DEFAULT_LATITUDE_NUM;
	
	private int latitudeColor = DEFAULT_LATITUDE_COLOR;
	
	private int backgroudColor = DEFAULT_BACKGROUD_COLOR;

	public SpiderWebChart(Context context) {
		super(context);
	}

	public SpiderWebChart(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}


	public SpiderWebChart(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		int rect = super.getHeight();
		
		longtitudeLength = (int)((rect / 2f) * 0.8); 
		
		position = new Point((int)(super.getWidth() / 2f),(int)(super.getHeight() / 2f + 0.2 * longtitudeLength));
		
		drawSpiderWeb(canvas);
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

	protected List<PointF> getWebAxisPoints(float pos) {
		List<PointF> points = new ArrayList<PointF>();
		for (int i = 0; i < longtitudeNum; i++) {
			PointF pt = new PointF();
			float offsetX = (float) (position.x - longtitudeLength * pos
					* Math.sin(i * 2 * Math.PI / longtitudeNum));
			float offsetY = (float) (position.y - longtitudeLength * pos
					* Math.cos(i * 2 * Math.PI / longtitudeNum));
			pt.set(offsetX, offsetY);

			points.add(pt);
		}
		return points;
	}

	protected List<PointF> getDataPoints(List<TitleValueEntity> data) {
		List<PointF> points = new ArrayList<PointF>();
		for (int i = 0; i < longtitudeNum; i++) {
			PointF pt = new PointF();
			float offsetX = (float) (position.x - data.get(i).getValue()
					/ 10f
					* longtitudeLength
					* Math.sin(i * 2 * Math.PI / longtitudeNum));
			float offsetY = (float) (position.y - data.get(i).getValue()
					/ 10f
					* longtitudeLength
					* Math.cos(i * 2 * Math.PI / longtitudeNum));
			pt.set(offsetX, offsetY);

			points.add(pt);
		}
		return points;
	}
	
	
	protected void drawSpiderWeb(Canvas canvas){
		Paint mPaintWebFill =new Paint();
		mPaintWebFill.setColor(Color.GRAY);
		mPaintWebFill.setAntiAlias(true);
		
		Paint mPaintWebBorder =new Paint();
		mPaintWebBorder.setColor(Color.WHITE);
		mPaintWebBorder.setStyle(Style.STROKE);
		mPaintWebBorder.setStrokeWidth(2);
		mPaintWebBorder.setAntiAlias(true);
		
		Paint mPaintWebInnerBorder =new Paint();
		mPaintWebInnerBorder.setColor(Color.LTGRAY);
		mPaintWebInnerBorder.setStyle(Style.STROKE);
		mPaintWebInnerBorder.setAntiAlias(true);
		
		Paint mPaintLine =new Paint();
		mPaintLine.setColor(Color.LTGRAY);
		
		Paint mPaintFont =new Paint();
		mPaintFont.setColor(Color.LTGRAY);
		
		Path mPath = new Path();
		List<PointF> pointList = getWebAxisPoints(1);
		
		if(null != data){
			for (int i = 0; i < pointList.size(); i++) {
				PointF pt = pointList.get(i);
				if (i == 0) {
					mPath.moveTo(pt.x, pt.y);
				} else {
					mPath.lineTo(pt.x, pt.y);
				}
				
				String title = data.get(0).get(i).getTitle();
				float  realx = 0;
				float  realy = 0;
				
				if(pt.x < position.x){
					realx = pt.x - mPaintFont.measureText(title) -5;
				}else if(pt.x > position.x){
					realx  = pt.x + 5;
				}else{
					realx  = pt.x - mPaintFont.measureText(title) / 2;
				}
				
				if(pt.y > position.y){
					realy = pt.y + 10;
				}else if(pt.y < position.y){
					realy = pt.y - 2;
				}else{
					realy = pt.y - 5;
				}
				
				canvas.drawText(title,realx,realy, mPaintFont);
			}
		}
		mPath.close();
		canvas.drawPath(mPath, mPaintWebFill);
		canvas.drawPath(mPath, mPaintWebBorder);
		
		for(int j = 1; j <latitudeNum ;j++){
		
			Path mPathInner = new Path();
			List<PointF> pointListInner = getWebAxisPoints(j * 1f/ latitudeNum);
			
			for (int i = 0; i < pointListInner.size(); i++) {
				PointF pt = pointListInner.get(i);
				if (i == 0) {
					mPathInner.moveTo(pt.x, pt.y);
				} else {
					mPathInner.lineTo(pt.x, pt.y);
				}
			}
			mPathInner.close();
			canvas.drawPath(mPathInner, mPaintWebInnerBorder);
		}
		
		for (int i = 0; i < pointList.size(); i++) {
			PointF pt = pointList.get(i);
			canvas.drawLine(position.x, position.y, pt.x, pt.y, mPaintLine);
		}
	}
	
	protected void drawData(Canvas canvas) {
		if (null != data) {
			for (int j = 0; j < data.size(); j++) {
				List<TitleValueEntity> list = data.get(j);

				Paint mPaintFill = new Paint();
				mPaintFill.setColor(COLORS[j]);
				mPaintFill.setStyle(Style.FILL);
				mPaintFill.setAntiAlias(true);
				mPaintFill.setAlpha(70);
				
				Paint mPaintBorder = new Paint();
				mPaintBorder.setColor(COLORS[j]);
				mPaintBorder.setStyle(Style.STROKE);
				mPaintBorder.setStrokeWidth(2);
				mPaintBorder.setAntiAlias(true);
				
				Paint mPaintFont = new Paint();
				mPaintFont.setColor(Color.WHITE);
				
				Paint mPaintPoint = new Paint();
				mPaintPoint.setColor(COLORS[j]);
				
				Path mPath = new Path();
				
				
				List<PointF> pointList = getDataPoints(list);
				for (int i = 0; i < pointList.size(); i++) {
					PointF pt = pointList.get(i);
					if (i == 0) {
						mPath.moveTo(pt.x, pt.y);
					} else {
						mPath.lineTo(pt.x, pt.y);
					}
					canvas.drawCircle(pt.x, pt.y, 3, mPaintPoint);
				}
				mPath.close();

				canvas.drawPath(mPath, mPaintFill);
				canvas.drawPath(mPath, mPaintBorder);
			}
		}
	}
	
	///////////////Getter Setter////////////////

	public List<List<TitleValueEntity>> getData() {
		return data;
	}

	public void setData(List<List<TitleValueEntity>> data) {
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

	public boolean isDisplayLongtitude() {
		return displayLongtitude;
	}

	public void setDisplayLongtitude(boolean displayLongtitude) {
		this.displayLongtitude = displayLongtitude;
	}

	public int getLongtitudeNum() {
		return longtitudeNum;
	}

	public void setLongtitudeNum(int longtitudeNum) {
		this.longtitudeNum = longtitudeNum;
	}

	public int getLongtitudeColor() {
		return longtitudeColor;
	}

	public void setLongtitudeColor(int longtitudeColor) {
		this.longtitudeColor = longtitudeColor;
	}

	public int getLongtitudeLength() {
		return longtitudeLength;
	}

	public void setLongtitudeLength(int longtitudeLength) {
		this.longtitudeLength = longtitudeLength;
	}

	public boolean isDisplayLatitude() {
		return displayLatitude;
	}

	public void setDisplayLatitude(boolean displayLatitude) {
		this.displayLatitude = displayLatitude;
	}

	public int getLatitudeNum() {
		return latitudeNum;
	}

	public void setLatitudeNum(int latitudeNum) {
		this.latitudeNum = latitudeNum;
	}

	public int getLatitudeColor() {
		return latitudeColor;
	}

	public void setLatitudeColor(int latitudeColor) {
		this.latitudeColor = latitudeColor;
	}

	public int getBackgroudColor() {
		return backgroudColor;
	}

	public void setBackgroudColor(int backgroudColor) {
		this.backgroudColor = backgroudColor;
	}
	
	
}
