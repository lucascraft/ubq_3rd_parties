package com.ubiquisense.view;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

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

public class GridChart extends View implements IViewConst, ITouchEventNotify,ITouchEventResponse {

	public static final int DEFAULT_BACKGROUD_COLOR = Color.BLACK;

	public static final int DEFAULT_AXIS_X_COLOR = Color.RED;

	public static final int DEFAULT_AXIS_Y_COLOR = Color.RED;

	public static final int DEFAULT_LONGITUDE_COLOR = Color.RED;

	public static final int DEFAULT_LAITUDE_COLOR = Color.RED;

	public static final float DEFAULT_AXIS_MARGIN_LEFT = 42f;

	public static final float DEFAULT_AXIS_MARGIN_BOTTOM = 16f;

	public static final float DEFAULT_AXIS_MARGIN_TOP = 5f;

	public static final float DEFAULT_AXIS_MARGIN_RIGHT = 5f;

	public static final boolean DEFAULT_DISPLAY_LONGTITUDE = Boolean.TRUE;

	public static final boolean DEFAULT_DASH_LONGTITUDE = Boolean.TRUE;

	public static final boolean DEFAULT_DISPLAY_LATITUDE = Boolean.TRUE;

	public static final boolean DEFAULT_DASH_LATITUDE = Boolean.TRUE;

	public static final boolean DEFAULT_DISPLAY_AXIS_X_TITLE = Boolean.TRUE;

	public static final boolean DEFAULT_DISPLAY_AXIS_Y_TITLE = Boolean.TRUE;

	public static final boolean DEFAULT_DISPLAY_BORDER = Boolean.TRUE;

	public static final int DEFAULT_BORDER_COLOR = Color.RED;

	private int DEFAULT_LONGTITUDE_FONT_COLOR = Color.WHITE;

	private int DEFAULT_LONGTITUDE_FONT_SIZE = 12;

	private int DEFAULT_LATITUDE_FONT_COLOR = Color.RED;;

	private int DEFAULT_LATITUDE_FONT_SIZE = 12;

	private int DEFAULT_AXIS_Y_MAX_TITLE_LENGTH = 5;

	public static final PathEffect DEFAULT_DASH_EFFECT = new DashPathEffect(
			new float[] { 3, 3, 3, 3 }, 1);

	public static final boolean DEFAULT_DISPLAY_CROSS_X_ON_TOUCH = true;

	public static final boolean DEFAULT_DISPLAY_CROSS_Y_ON_TOUCH = true;

	private int backgroudColor = DEFAULT_BACKGROUD_COLOR;

	private int axisXColor = DEFAULT_AXIS_X_COLOR;

	private int axisYColor = DEFAULT_AXIS_Y_COLOR;

	private int longitudeColor = DEFAULT_LONGITUDE_COLOR;

	private int latitudeColor = DEFAULT_LAITUDE_COLOR;

	private float axisMarginLeft = DEFAULT_AXIS_MARGIN_LEFT;

	private float axisMarginBottom = DEFAULT_AXIS_MARGIN_BOTTOM;

	private float axisMarginTop = DEFAULT_AXIS_MARGIN_TOP;

	private float axisMarginRight = DEFAULT_AXIS_MARGIN_RIGHT;

	private boolean displayAxisXTitle = DEFAULT_DISPLAY_AXIS_X_TITLE;

	private boolean displayAxisYTitle = DEFAULT_DISPLAY_AXIS_Y_TITLE;

	private boolean displayLongitude = DEFAULT_DISPLAY_LONGTITUDE;

	private boolean dashLongitude = DEFAULT_DASH_LONGTITUDE;

	private boolean displayLatitude = DEFAULT_DISPLAY_LATITUDE;

	private boolean dashLatitude = DEFAULT_DASH_LATITUDE;

	private PathEffect dashEffect = DEFAULT_DASH_EFFECT;

	private boolean displayBorder = DEFAULT_DISPLAY_BORDER;

	private int borderColor = DEFAULT_BORDER_COLOR;

	private int longtitudeFontColor = DEFAULT_LONGTITUDE_FONT_COLOR;

	private int longtitudeFontSize = DEFAULT_LONGTITUDE_FONT_SIZE;

	private int latitudeFontColor = DEFAULT_LATITUDE_FONT_COLOR;

	private int latitudeFontSize = DEFAULT_LATITUDE_FONT_SIZE;

	private List<String> axisXTitles;

	private List<String> axisYTitles;

	private int axisYMaxTitleLength = DEFAULT_AXIS_Y_MAX_TITLE_LENGTH;

	private boolean displayCrossXOnTouch = DEFAULT_DISPLAY_CROSS_X_ON_TOUCH;

	private boolean displayCrossYOnTouch = DEFAULT_DISPLAY_CROSS_Y_ON_TOUCH;

	private float clickPostX = 0f;

	private float clickPostY = 0f;

	private List<ITouchEventResponse> notifyList;
	
	private PointF touchPoint;

	public GridChart(Context context) {
		super(context);
	}

	public GridChart(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public GridChart(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		super.setBackgroundColor(backgroudColor);

		drawXAxis(canvas);
		drawYAxis(canvas);

		if (this.displayBorder) {
			drawBorder(canvas);
		}

		if (displayLongitude || displayAxisXTitle) {
			drawAxisGridX(canvas);
		}
		if (displayLatitude || displayAxisYTitle) {
			drawAxisGridY(canvas);
		}

		if (displayCrossXOnTouch || displayCrossYOnTouch) {
			drawWithFingerClick(canvas);
		}
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

	@Override
	protected void onFocusChanged(boolean gainFocus, int direction,
			Rect previouslyFocusedRect) {
		super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {

		if (event.getY() > 0
				&& event.getY() < super.getBottom() - getAxisMarginBottom()
				&& event.getX() > super.getLeft() + getAxisMarginLeft()
				&& event.getX() < super.getRight()) {

			if (event.getPointerCount() == 1) {
				clickPostX = event.getX();
				clickPostY = event.getY();
				
				PointF point = new PointF(clickPostX,clickPostY);
				touchPoint = point;
				// super.invalidate();
				super.invalidate();

				notifyEventAll(this);

			} else if (event.getPointerCount() == 2) {
			}
		}
		return super.onTouchEvent(event);
	}

	private void drawAlphaTextBox(PointF ptStart, PointF ptEnd, String content,
			int fontSize, Canvas canvas) {

		Paint mPaintBox = new Paint();
		mPaintBox.setColor(Color.BLACK);
		mPaintBox.setAlpha(80);
		

		Paint mPaintBoxLine = new Paint();
		mPaintBoxLine.setColor(Color.CYAN);
		mPaintBoxLine.setAntiAlias(true);

		canvas.drawRoundRect(new RectF(ptStart.x, ptStart.y, ptEnd.x, ptEnd.y),
				20.0f, 20.0f, mPaintBox);

		canvas.drawLine(ptStart.x, ptStart.y, ptStart.x, ptEnd.y,mPaintBoxLine);
		canvas.drawLine(ptStart.x, ptEnd.y, ptEnd.x, ptEnd.y, mPaintBoxLine);
		canvas.drawLine(ptEnd.x, ptEnd.y, ptEnd.x, ptStart.y, mPaintBoxLine);
		canvas.drawLine(ptEnd.x, ptStart.y, ptStart.x, ptStart.y,mPaintBoxLine);

		canvas.drawText(content, ptStart.x, ptEnd.y, mPaintBoxLine);
	}

	public String getAxisXGraduate(Object value) {

		float length = super.getWidth() - axisMarginLeft - 2 * axisMarginRight;
		float valueLength = ((Float) value).floatValue() - axisMarginLeft
				- axisMarginRight;

		return String.valueOf(valueLength / length);
	}

	public String getAxisYGraduate(Object value) {

		float length = super.getHeight() - axisMarginBottom - 2 * axisMarginTop;
		float valueLength = length
				- (((Float) value).floatValue() - axisMarginTop);

		return String.valueOf(valueLength / length);
	}

	/**
	 * 单点击事件
	 */
	protected void drawWithFingerClick(Canvas canvas) {
		Paint mPaint = new Paint();
		mPaint.setColor(Color.CYAN);

		float lineHLength = getWidth() - 2f;
		float lineVLength = getHeight() - 2f;

		if (isDisplayAxisXTitle()) {
			lineVLength = lineVLength - axisMarginBottom;

			if (clickPostX > 0 && clickPostY > 0) {
				if (displayCrossXOnTouch) {
					PointF BoxVS = new PointF(clickPostX - longtitudeFontSize
							* 5f / 2f, lineVLength + 2f);
					PointF BoxVE = new PointF(clickPostX + longtitudeFontSize
							* 5f / 2f, lineVLength + axisMarginBottom - 1f);

					drawAlphaTextBox(BoxVS, BoxVE,
							getAxisXGraduate(clickPostX), longtitudeFontSize,
							canvas);
				}
			}
		}

		if (isDisplayAxisYTitle()) {
			lineHLength = lineHLength - getAxisMarginLeft();

			if (clickPostX > 0 && clickPostY > 0) {
				if (displayCrossYOnTouch) {
					PointF BoxHS = new PointF(1f, clickPostY - latitudeFontSize
							/ 2f);
					PointF BoxHE = new PointF(axisMarginLeft, clickPostY
							+ latitudeFontSize / 2f);

					drawAlphaTextBox(BoxHS, BoxHE,
							getAxisYGraduate(clickPostY), latitudeFontSize,
							canvas);
				}
			}
		}

		if (clickPostX > 0 && clickPostY > 0) {
			if (displayCrossXOnTouch) {
				canvas
						.drawLine(clickPostX, 1f, clickPostX, lineVLength,
								mPaint);
			}

			if (displayCrossYOnTouch) {
				canvas.drawLine(axisMarginLeft, clickPostY, axisMarginLeft
						+ lineHLength, clickPostY, mPaint);
			}
		}
	}

	protected void drawBorder(Canvas canvas) {
		float width = super.getWidth() - 2;
		float height = super.getHeight() - 2;

		Paint mPaint = new Paint();
		mPaint.setColor(borderColor);

		canvas.drawLine(1f, 1f, 1f + width, 1f, mPaint);
		canvas.drawLine(1f + width, 1f, 1f + width, 1f + height, mPaint);
		canvas.drawLine(1f + width, 1f + height, 1f, 1f + height, mPaint);
		canvas.drawLine(1f, 1f + height, 1f, 1f, mPaint);
	}

	protected void drawXAxis(Canvas canvas) {

		float length = super.getWidth();
		float postY = super.getHeight() - axisMarginBottom - 1;

		Paint mPaint = new Paint();
		mPaint.setColor(axisXColor);

		canvas.drawLine(0f, postY, length, postY, mPaint);

	}

	protected void drawYAxis(Canvas canvas) {

		float length = super.getHeight() - axisMarginBottom;
		float postX = axisMarginLeft + 1;

		Paint mPaint = new Paint();
		mPaint.setColor(axisXColor);

		canvas.drawLine(postX, 0f, postX, length, mPaint);
	}

	protected void drawAxisGridX(Canvas canvas) {

		if (null != axisXTitles) {

			int counts = axisXTitles.size();
			float length = super.getHeight() - axisMarginBottom;
			Paint mPaintLine = new Paint();
			mPaintLine.setColor(longitudeColor);
			if (dashLongitude) {
				mPaintLine.setPathEffect(dashEffect);
			}

			Paint mPaintFont = new Paint();
			mPaintFont.setColor(longtitudeFontColor);
			mPaintFont.setTextSize(longtitudeFontSize);
			mPaintFont.setAntiAlias(true);
			if (counts > 1) {
				float postOffset = (super.getWidth() - axisMarginLeft - 2 * axisMarginRight)
						/ (counts - 1);
				float offset = axisMarginLeft + axisMarginRight;
				for (int i = 0; i <= counts; i++) {
					if (displayLongitude) {
						canvas.drawLine(offset + i * postOffset, 0f, offset + i
								* postOffset, length, mPaintLine);
					}
					if (displayAxisXTitle) {
						if (i < counts && i > 0) {
							canvas.drawText(axisXTitles.get(i), offset + i
									* postOffset
									- (axisXTitles.get(i).length())
									* longtitudeFontSize / 2f, super
									.getHeight()
									- axisMarginBottom + longtitudeFontSize,
									mPaintFont);
						} else if (0 == i) {
							canvas.drawText(axisXTitles.get(i),
									this.axisMarginLeft + 2f, super.getHeight()
											- axisMarginBottom
											+ longtitudeFontSize, mPaintFont);
						}
					}
				}
			}
		}
	}

	protected void drawAxisGridY(Canvas canvas) {
		if (null != axisYTitles) {
			int counts = axisYTitles.size();
			float length = super.getWidth() - axisMarginLeft;
			Paint mPaintLine = new Paint();
			mPaintLine.setColor(latitudeColor);
			if (dashLatitude) {
				mPaintLine.setPathEffect(dashEffect);
			}

			Paint mPaintFont = new Paint();
			mPaintFont.setColor(latitudeFontColor);
			mPaintFont.setTextSize(latitudeFontSize);
			mPaintFont.setAntiAlias(true);

			if (counts > 1) {
				float postOffset = (super.getHeight() - axisMarginBottom - 2 * axisMarginTop)
						/ (counts - 1);
				float offset = super.getHeight() - axisMarginBottom
						- axisMarginTop;
				for (int i = 0; i <= counts; i++) {
					if (displayLatitude) {
						canvas.drawLine(axisMarginLeft,
								offset - i * postOffset, axisMarginLeft
										+ length, offset - i * postOffset,
								mPaintLine);
					}
					if (displayAxisYTitle) {
						if (i < counts && i > 0) {
							canvas.drawText(axisYTitles.get(i), 0f, offset - i
									* postOffset + latitudeFontSize / 2f,
									mPaintFont);
						} else if (0 == i) {
							canvas.drawText(axisYTitles.get(i), 0f, super
									.getHeight()
									- this.axisMarginBottom - 2f, mPaintFont);
						}
					}
				}
			}
		}
	}
	
	protected void zoomIn(){
		
	}
	
	protected void zoomOut(){
		
	}

	public void notifyEvent(GridChart chart) {
		PointF point = chart.getTouchPoint();
		if(null != point){
			clickPostX = point.x;
			clickPostY = point.y;
		}
		touchPoint = new PointF(clickPostX , clickPostY);	
		super.invalidate();
	}

	public void addNotify(ITouchEventResponse notify) {
		if (null == notifyList) {
			notifyList = new ArrayList<ITouchEventResponse>();
		}
		notifyList.add(notify);
	}

	public void removeNotify(int i) {
		if (null != notifyList && notifyList.size() > i) {
			notifyList.remove(i);
		}
	}

	public void removeAllNotify() {
		if (null != notifyList) {
			notifyList.clear();
		}
	}

	public void notifyEventAll(GridChart chart) {
		if (null != notifyList) {
			for (int i = 0; i < notifyList.size(); i++) {
				ITouchEventResponse ichart = notifyList.get(i);
				ichart.notifyEvent(chart);
			}
		}
	}

	public int getBackgroudColor() {
		return backgroudColor;
	}

	public void setBackgroudColor(int backgroudColor) {
		this.backgroudColor = backgroudColor;
	}

	public int getAxisXColor() {
		return axisXColor;
	}

	public void setAxisXColor(int axisXColor) {
		this.axisXColor = axisXColor;
	}

	public int getAxisYColor() {
		return axisYColor;
	}

	public void setAxisYColor(int axisYColor) {
		this.axisYColor = axisYColor;
	}

	public int getLongitudeColor() {
		return longitudeColor;
	}

	public void setLongitudeColor(int longitudeColor) {
		this.longitudeColor = longitudeColor;
	}

	public int getLatitudeColor() {
		return latitudeColor;
	}

	public void setLatitudeColor(int latitudeColor) {
		this.latitudeColor = latitudeColor;
	}

	public float getAxisMarginLeft() {
		return axisMarginLeft;
	}

	public void setAxisMarginLeft(float axisMarginLeft) {
		this.axisMarginLeft = axisMarginLeft;

		if (0f == axisMarginLeft) {
			this.displayAxisYTitle = Boolean.FALSE;
		}
	}

	public float getAxisMarginBottom() {
		return axisMarginBottom;
	}

	public void setAxisMarginBottom(float axisMarginBottom) {
		this.axisMarginBottom = axisMarginBottom;

		if (0f == axisMarginBottom) {
			this.displayAxisXTitle = Boolean.FALSE;
		}
	}

	public float getAxisMarginTop() {
		return axisMarginTop;
	}

	public void setAxisMarginTop(float axisMarginTop) {
		this.axisMarginTop = axisMarginTop;
	}

	public float getAxisMarginRight() {
		return axisMarginRight;
	}

	public void setAxisMarginRight(float axisMarginRight) {
		this.axisMarginRight = axisMarginRight;
	}

	public List<String> getAxisXTitles() {
		return axisXTitles;
	}

	public void setAxisXTitles(List<String> axisXTitles) {
		this.axisXTitles = axisXTitles;
	}

	public List<String> getAxisYTitles() {
		return axisYTitles;
	}

	public void setAxisYTitles(List<String> axisYTitles) {
		this.axisYTitles = axisYTitles;
	}

	public boolean isDisplayLongitude() {
		return displayLongitude;
	}

	public void setDisplayLongitude(boolean displayLongitude) {
		this.displayLongitude = displayLongitude;
	}

	public boolean isDashLongitude() {
		return dashLongitude;
	}

	public void setDashLongitude(boolean dashLongitude) {
		this.dashLongitude = dashLongitude;
	}

	public boolean isDisplayLatitude() {
		return displayLatitude;
	}

	public void setDisplayLatitude(boolean displayLatitude) {
		this.displayLatitude = displayLatitude;
	}

	public boolean isDashLatitude() {
		return dashLatitude;
	}

	public void setDashLatitude(boolean dashLatitude) {
		this.dashLatitude = dashLatitude;
	}

	public PathEffect getDashEffect() {
		return dashEffect;
	}

	public void setDashEffect(PathEffect dashEffect) {
		this.dashEffect = dashEffect;
	}

	public boolean isDisplayAxisXTitle() {
		return displayAxisXTitle;
	}

	public void setDisplayAxisXTitle(boolean displayAxisXTitle) {
		this.displayAxisXTitle = displayAxisXTitle;

		if (false == displayAxisXTitle) {
			this.axisMarginBottom = 0;
		}
	}

	public boolean isDisplayAxisYTitle() {
		return displayAxisYTitle;
	}

	public void setDisplayAxisYTitle(boolean displayAxisYTitle) {
		this.displayAxisYTitle = displayAxisYTitle;

		// 如果不显示Y轴刻度,则左边边距为0
		if (false == displayAxisYTitle) {
			this.axisMarginLeft = 0;
		}
	}

	public boolean isDisplayBorder() {
		return displayBorder;
	}

	public void setDisplayBorder(boolean displayBorder) {
		this.displayBorder = displayBorder;
	}

	public int getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(int borderColor) {
		this.borderColor = borderColor;
	}

	public int getLongtitudeFontColor() {
		return longtitudeFontColor;
	}

	public void setLongtitudeFontColor(int longtitudeFontColor) {
		this.longtitudeFontColor = longtitudeFontColor;
	}

	public int getLongtitudeFontSize() {
		return longtitudeFontSize;
	}

	public void setLongtitudeFontSize(int longtitudeFontSize) {
		this.longtitudeFontSize = longtitudeFontSize;
	}

	public int getLatitudeFontColor() {
		return latitudeFontColor;
	}

	public void setLatitudeFontColor(int latitudeFontColor) {
		this.latitudeFontColor = latitudeFontColor;
	}

	public int getLatitudeFontSize() {
		return latitudeFontSize;
	}

	public void setLatitudeFontSize(int latitudeFontSize) {
		this.latitudeFontSize = latitudeFontSize;
	}

	public int getAxisYMaxTitleLength() {
		return axisYMaxTitleLength;
	}

	public void setAxisYMaxTitleLength(int axisYMaxTitleLength) {
		this.axisYMaxTitleLength = axisYMaxTitleLength;
	}

	public boolean isDisplayCrossXOnTouch() {
		return displayCrossXOnTouch;
	}

	public void setDisplayCrossXOnTouch(boolean displayCrossXOnTouch) {
		this.displayCrossXOnTouch = displayCrossXOnTouch;
	}

	public boolean isDisplayCrossYOnTouch() {
		return displayCrossYOnTouch;
	}

	public void setDisplayCrossYOnTouch(boolean displayCrossYOnTouch) {
		this.displayCrossYOnTouch = displayCrossYOnTouch;
	}

	public PointF getTouchPoint() {
		return touchPoint;
	}

	public void setTouchPoint(PointF touchPoint) {
		this.touchPoint = touchPoint;
	}
}
