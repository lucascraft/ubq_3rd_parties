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
public class TimedValue extends PositionningValue {
	private float v;
	private Date d;
	private float volume;
	public TimedValue(float value, Date date, float volume) {
		v = value;
		d = date;
		this.volume = volume;
	}
	public TimedValue(float value, Date date) {
		this(value, date, 0f);
	}
	public float getVolume() {
		return volume;
	}
	public void setVolume(float volume) { 
		this.volume = volume;
	}
	public float getV() {
		return v;
	}
	public void setV(float v) {
		this.v = v;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
}
