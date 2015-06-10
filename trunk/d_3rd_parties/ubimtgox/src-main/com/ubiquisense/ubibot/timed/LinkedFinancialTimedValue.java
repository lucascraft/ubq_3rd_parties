/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

import java.util.Date;

/**
 * Data structure associating a value to a given {@link Date} date.
 * 
 * @author lucas
 *
 */
public class LinkedFinancialTimedValue extends TimedValue {
	public final static int UP = 0, DOWN = 1;
	private int direction;
	private float high, low, open, close;
	private LinkedFinancialTimedValue next, prec;
	public LinkedFinancialTimedValue getNext() {
		return next;
	}
	public LinkedFinancialTimedValue getPrev() {
		return prec; 
	}
	public void setPrec(LinkedFinancialTimedValue prec) {
		this.prec = prec;
	}
	public void setNext(LinkedFinancialTimedValue next) {
		this.next = next;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public int getDirection() {
		return direction;
	}
	public LinkedFinancialTimedValue(float value, Date date, float volume, int direction, LinkedFinancialTimedValue prev, LinkedFinancialTimedValue next) {
		super(value, date, volume);
		setDirection(direction);
		this.prec = prev;
		this.next = next;
	}
	public LinkedFinancialTimedValue(float value, Date date, float volume, int direction, LinkedFinancialTimedValue prev) {
		this(value, date, volume, direction, null, prev);
	}
	public LinkedFinancialTimedValue(float value, Date date, float volume, int direction) {
		this(value, date, volume, direction, null, null);
	}
	public float getHigh() {
		return high;
	}
	public void setHigh(float high) {
		this.high = high;
	}
	public float getLow() {
		return low;
	}
	public void setLow(float low) {
		this.low = low;
	}
	public float getOpen() {
		return open;
	}
	public void setOpen(float open) {
		this.open = open;
	}
	public float getClose() {
		return close;
	}
	public void setClose(float close) {
		this.close = close;
	}
	public LinkedFinancialTimedValue getPrec() {
		return prec;
	}
/*	
	@Override
	public String toString() {
		return "{ \"DateString\": \"1/2/2010\", \"Open\": " + getOpen() + ", \"High\": " + getHigh() + ", \"Low\": " + getLow() + ", \"Close\": " + getClose() + " }";
	}
*/
}
