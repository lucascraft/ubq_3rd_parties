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

package com.ubiquisense.entity;

import java.util.ArrayList;
import java.util.List;

public class LineEntity {
	
	private List<Float> lineData;
	private String title;
	private int lineColor;
	private boolean display = true;

	public List<Float> getLineData() {
		return lineData;
	}
	public void setLineData(List<Float> lineData) {
		this.lineData = lineData;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLineColor() {
		return lineColor;
	}
	public void setLineColor(int lineColor) {
		this.lineColor = lineColor;
	}
	public boolean isDisplay() {
		return display;
	}
	public void setDisplay(boolean display) {
		this.display = display;
	}
	public LineEntity() {
		super();
	}
	public LineEntity(List<Float> lineData, String title, int lineColor) {
		super();
		this.lineData = lineData;
		this.title = title;
		this.lineColor = lineColor;
	}
	public void put(float value){
		if (null == lineData){
			lineData = new ArrayList<Float>();
		}
		lineData.add(value);
	}
}
