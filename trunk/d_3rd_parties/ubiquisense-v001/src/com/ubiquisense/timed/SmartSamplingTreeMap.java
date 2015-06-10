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

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SmartSamplingTreeMap<T extends TimedValue> extends TreeMap<Date, T> {
	/**
	 * UUID
	 */
	private static final long serialVersionUID = -7441182179552872716L;
	
	private long scope;
	public SmartSamplingTreeMap(long scope, Comparator<Date> comparator) {
		super(comparator);
		this.scope = scope;
	}
	public long getScope() {
		return scope;
	}
	public Set<Date> sampledKeySet() {
		Set<Date> keys = new TreeSet<Date>();
		if (!isEmpty()) {
			Date mostRecent = lastKey();
			Calendar limitCal = GregorianCalendar.getInstance();
			limitCal.setTime(mostRecent);
			limitCal.add(Calendar.MILLISECOND, (int) - scope);
			for (Date d : keySet()) {
				if (d.after(limitCal.getTime())  ) {
					keys.add(d);
				}
			}
		}
		return keys;
	}
}
