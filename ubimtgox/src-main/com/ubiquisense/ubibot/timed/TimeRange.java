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
import java.util.Date;

public enum TimeRange {
	RAW("raw"),
	ONE_SECOND		("1 second"),
	THIRTY_SECONDS	("30 second"),
	ONE_MINUTE		("1 minute"),
	THREE_MINUTE	("3 minute"),
	FIVE_MINUTES	("5 minutes"),
	FIFTEEN_MINUTES	("15 minutes"),
	THIRTY_MINUTES	("30 minutes"),
	ONE_HOUR		("1 hour"),
	THREE_HOURS		("3 hours"),
	FOUR_HOURS		("4 hours"),
	SIX_HOURS		("6 hours"),
	HALF_DAY		("Half a day"),
	ONE_DAY			("1 day"),
	TWO_DAY			("2 days"),
	THREE_DAY		("3 days"),
	FOUR_DAY		("4 days"),
	FIVE_DAY		("5 days"),
	ONE_WEEK		("1 week"),
	TWO_WEEK		("2 weeks"),
	THREE_WEEK		("3 weeks"),
	THIRTY_DAYS		("30 days"),
	TWO_MONTHS		("2 months"),
	THREE_MONTHS	("3 months"),
	SIX_MONTHS		("6 months"),
	NINE_MONTHS		("9 months"),
	ONE_YEAR		("1 year"),
	TWO_YEAR		("2 years"),
	THREE_YEAR		("3 years"),
	FOUR_YEAR		("4 years"),
	FIVE_YEAR		("5 years"),
	TEN_YEAR		("10 years");
	
	private String literal;
	private Date pivot;
	private TimeRange(String literal) {
		this.literal = literal;
		this.pivot = new Date();
	}
	public String getLiteral() {
		return literal;
	}
	public TimeRange getValue() {
		return this;
	}
	/**
	 * Get range from from now to the past as a duration
	 * @return range {@link Date} from now to past intrinsic time
	 */
	public Date getOrigin() {
		return getOrigin(new Date());
	}
	public Date getEnd() {
		return new Date(
			getOrigin().getTime() +
			getDuration().getDuration()
		);
	}
	/**
	 * Get range from from now to the past as a duration
	 * @return range {@link Date} from now to past intrinsic time
	 */
	public Date getOrigin(Date now) {
		this.pivot = now;
		Calendar c1 = Calendar.getInstance();
		c1.setTime(now);
		switch(this) {
			case FIVE_MINUTES:
				c1.add(Calendar.MINUTE, -5);  
				break;
			case FIFTEEN_MINUTES:
				c1.add(Calendar.MINUTE, -5);  
				break;
			case THIRTY_MINUTES:
				c1.add(Calendar.MINUTE, -30);  
				break;
			case ONE_HOUR:
				c1.add(Calendar.HOUR, -1);  
				break;
			case THREE_HOURS:
				c1.add(Calendar.HOUR, -3);  
				break;
			case SIX_HOURS:
				c1.add(Calendar.HOUR, -6);  
				break;
			case HALF_DAY:
				c1.add(Calendar.HOUR, -12);  
				break;
			case ONE_DAY:
				c1.add(Calendar.DAY_OF_YEAR, -1);  
				break;
			case ONE_WEEK:
				c1.add(Calendar.DAY_OF_YEAR, -7);  
				break;
			case THIRTY_DAYS:
				c1.add(Calendar.DAY_OF_YEAR, -30);  
				break;
			case THREE_MONTHS:
				c1.add(Calendar.MONTH, -3);  
				break;
			case RAW: // 30 secs
				c1.add(Calendar.MINUTE, -5);  
				break;
			case FIVE_DAY:
				c1.add(Calendar.DAY_OF_YEAR, -5);  
				break;
			case TWO_YEAR:
				c1.add(Calendar.YEAR, -2);  
				break;
			case THREE_YEAR:
				c1.add(Calendar.YEAR, -3);  
				break;
			case FOUR_YEAR:
				c1.add(Calendar.YEAR, -4);  
				break;
			case FIVE_YEAR:
				c1.add(Calendar.YEAR, -5);  
				break;
			case FOUR_DAY:
				c1.add(Calendar.DAY_OF_YEAR, -4);  
				break;
			case NINE_MONTHS:
				c1.add(Calendar.MONTH, -9);  
				break;
			case ONE_YEAR:
				c1.add(Calendar.YEAR, -1);  
				break;
			case SIX_MONTHS:
				c1.add(Calendar.MONTH, -6);  
				break;
			case TEN_YEAR:
				c1.add(Calendar.YEAR, -10);  
				break;
			case THREE_DAY:
				c1.add(Calendar.DAY_OF_YEAR, -3);  
				break;
			case THREE_WEEK:
				c1.add(Calendar.WEEK_OF_YEAR, -3);  
				break;
			case TWO_DAY:
				c1.add(Calendar.DAY_OF_YEAR, -2);  
				break;
			case TWO_MONTHS:
				c1.add(Calendar.MONTH, -2);  
				break;
			case TWO_WEEK:
				c1.add(Calendar.WEEK_OF_YEAR, -2);  
				break;


		}
		return new Date(c1.getTimeInMillis());
	}
	public Date getPivot() {
		return pivot;
	}
	
	public TimeRange get(Date origin) {
		pivot = origin;
		return this;
	}
	
	public TimeDuration getDuration() {
		switch(this) {
		case FIFTEEN_MINUTES:
			return TimeDuration.FIFTEEN_MINUTES;
		case FIVE_DAY:
			return TimeDuration.FIVE_DAY;
		case FIVE_MINUTES:
			return TimeDuration.FIVE_MINUTES;
		case FIVE_YEAR:
			return TimeDuration.FIVE_YEAR;
		case FOUR_DAY:
			return TimeDuration.FOUR_DAY;
		case FOUR_HOURS:
			return TimeDuration.FOUR_HOURS;
		case FOUR_YEAR:
			return TimeDuration.FOUR_YEAR;
		case HALF_DAY:
			return TimeDuration.HALF_DAY;
		case NINE_MONTHS:
			return TimeDuration.NINE_MONTHS;
		case ONE_DAY:
			return TimeDuration.ONE_DAY;
		case ONE_HOUR:
			return TimeDuration.ONE_HOUR;
		case ONE_MINUTE:
			return TimeDuration.ONE_MINUTE;
		case ONE_SECOND:
			return TimeDuration.ONE_SECOND;
		case ONE_WEEK:
			return TimeDuration.ONE_WEEK;
		case ONE_YEAR:
			return TimeDuration.ONE_YEAR;
		case SIX_HOURS:
			return TimeDuration.SIX_HOURS;
		case SIX_MONTHS:
			return TimeDuration.SIX_MONTHS;
		case TEN_YEAR:
			return TimeDuration.TEN_YEAR;
		case THIRTY_DAYS:
			return TimeDuration.THIRTY_DAYS;
		case THIRTY_MINUTES:
			return TimeDuration.THIRTY_MINUTES;
		case THIRTY_SECONDS:
			return TimeDuration.THIRTY_SECONDS;
		case THREE_DAY:
			return TimeDuration.THREE_DAY;
		case THREE_HOURS:
			return TimeDuration.THREE_HOURS;
		case THREE_MINUTE:
			return TimeDuration.THIRTY_MINUTES;
		case THREE_MONTHS:
			return TimeDuration.THREE_MONTHS;
		case THREE_WEEK:
			return TimeDuration.THREE_WEEK;
		case THREE_YEAR:
			return TimeDuration.THREE_YEAR;
		case TWO_DAY:
			return TimeDuration.TWO_DAY;
		case TWO_MONTHS:
			return TimeDuration.TWO_MONTHS;
		case TWO_WEEK:
			return TimeDuration.THREE_WEEK;
		case TWO_YEAR:
			return TimeDuration.TWO_YEAR;
		case RAW:
			return TimeDuration.NOW;
		default:
			return TimeDuration.NOW;
		}
	}
	
	public static TimeBounds getTimeBounds(Date origin, long duration) {
		return new TimeBounds(origin, new Date(origin.getTime()+duration));
	}
	
	public static TimeBounds getTimeBounds(Date origin, TimeDuration duration) {
		return new TimeBounds(origin, new Date(origin.getTime()+duration.getDuration()));
	}
}
