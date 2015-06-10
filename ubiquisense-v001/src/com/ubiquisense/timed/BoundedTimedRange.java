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
