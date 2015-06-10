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


public class BoundedTimedRange <T extends TimedValue> {
	private Date start, end;
	private SelfTimedRange<T> timeInfo;
	public BoundedTimedRange() {
		this(new Date(), new Date());
	}	
	public BoundedTimedRange(Date starDate) {
		this(starDate, new Date());
	}	
	public BoundedTimedRange(Date starDate, Date endDate) {
		timeInfo 	= new SelfTimedRange<T>(TimeDuration.ONE_DAY.getDuration(), TimeDuration.THREE_MINUTES.getDuration());
		start 		= starDate;
		end			= endDate;
	}
	public SelfTimedRange<T> getTimeInfo() {
		return timeInfo;
	}
	public void setTimeInfo(SelfTimedRange<T> timeInfo) {
		this.timeInfo = timeInfo;
	}
	public Date getEnd() {
		return end;
	}
	public Date getStart() {
		return start;
	} 
}
