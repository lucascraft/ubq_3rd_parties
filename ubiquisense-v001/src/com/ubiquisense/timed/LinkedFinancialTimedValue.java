/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
 * 
 * The library is released under:
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

package com.ubiquisense.timed;

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
}
