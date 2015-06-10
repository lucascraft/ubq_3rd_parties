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
