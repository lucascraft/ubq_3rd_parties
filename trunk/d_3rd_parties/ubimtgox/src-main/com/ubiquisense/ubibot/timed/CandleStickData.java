/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package com.ubiquisense.ubibot.timed;

import java.util.ArrayList;
import java.util.List;


public class CandleStickData {
	
	private List<LinkedFinancialTimedValue> values;
	
	private TimeBounds range;
	
	private float volume;
	
	private float open; 
	private float close;
	
	private float high; 
	private float low; 
	
	private float avg;

	
	public CandleStickData(List<LinkedFinancialTimedValue> values, float avg, float low, float close, float open, float high, float volume, TimeBounds range) {
		this.values = new ArrayList<LinkedFinancialTimedValue>();
		this.values.addAll(values);
		this.avg	= avg;
		this.open 	= open;
		this.low 	= low;
		this.high 	= high;
		this.close 	= close;
		this.range 	= range;
		this.volume = volume;
	}
	public float getVolume() {
		return volume;
	}
	public void setVolume(float volume) {
		this.volume = volume;
	}
	public float getClose() {
		return close;
	}
	public float getHigh() {
		return high;
	}
	public float getLow() {
		return low;
	}
	public float getOpen() {
		return open;
	}
	public TimeBounds getRange() {
		return range;
	}
	public void setClose(float close) {
		this.close = close;
	}
	public void setHigh(float high) {
		this.high = high;
	}
	public void setLow(float low) {
		this.low = low;
	}
	public void setOpen(float open) {
		this.open = open;
	}
	public void setRange(TimeBounds range) {
		this.range = range;
	}
	public List<LinkedFinancialTimedValue> getValues() {
		return values;
	}
	public void setValues(List<LinkedFinancialTimedValue> values) {
		this.values = values;
	}
	public boolean isUp() {
		return close > open;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
}
