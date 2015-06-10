/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012,2013 Lucas Bigeardel
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


public enum TimedFact {
	NOW,
	BEFORE,
	AFTER,
	INSTANTS,
	INSTANTS_BEFORE,
	INSTANTS_AFTER,
	TODAY,
	SIX_HOURS,
	PREV_SIX_HOURS,
	NEXT_SIX_HOURS,
	TOMMOROW,
	YESTERDAY,
	THIS_HOUR,
	PAST_HOUR,
	NEXT_HOUR,
	PAST_MINUTE,
	NEXT_MINUTE,
	PAST_THREE_MINUTE,
	NEXT_THREE_MINUTE,
	PAST_FIVE_MINUTE,
	NEXT_FIVE_MINUTE,
	PAST_QUARTER_HOUR,
	NEXT_QUARTER_HOUR,
	PAST_HALF_HOUR,
	NEXT_HALF_HOUR,
	PAST_THREE_HOUR,
	NEXT_THREE_HOUR,
	PAST_FOUR_HOUR,
	NEXT_FOUR_HOUR,
	PAST_SIX_HOUR,
	NEXT_SIX_HOUR,
	THIS_DAY,
	PAST_DAY,
	NEXT_DAY,
	PAST_THREE_DAY,
	NEXT_THREE_DAY,
	PAST_FOUR_DAY,
	NEXT_FOUR_DAY,
	PAST_FIVE_DAY,
	NEXT_FIVE_DAY,
	THIS_WEEK,
	PAST_WEEK,
	NEXT_WEEK,
	PAST_TWO_WEEK,
	NEXT_TWO_WEEK,
	PAST_THREE_WEEK,
	NEXT_THREE_WEEK,
	THIS_MONTH,
	PAST_MONTH,
	NEXT_MONTH,
	PAST_THREE_MONTH,
	NEXT_THREE_MONTH,
	PAST_SIX_MONTH,
	NEXT_SIX_MONTH,
	PAST_NINE_MONTH,
	NEXT_NINE_MONTH,
	THIS_YEAR,
	PAST_YEAR,
	NEXT_YEAR,
	PAST_TWO_YEAR,
	NEXT_TWO_YEAR,
	PAST_THREE_YEAR,
	NEXT_THREE_YEAR,
	PAST_FOUR_YEAR,
	NEXT_FOUR_YEAR,
	PAST_FIVE_YEAR,
	NEXT_FIVE_YEAR,
	ONE_SECOND,
	THIRTY_SECONDS,
	THREE_MINUTES,
	FIVE_MINUTES,
	FIFTEEN_MINUTES,
	THIRTY_MINUTES;
	
	/*
	public static TimeRange getTimeRange(Date origin, TimedFact timedFact) {
		switch (timedFact){
		case NOW:
			return TimeRange.RAW.get(origin);
		case TODAY:
			return TimeRange.ONE_DAY.get(origin);
		case SIX_HOURS:
			return TimeRange.SIX_HOURS.get(origin);
		case PREV_SIX_HOURS:
		case NEXT_SIX_HOURS:
		case TOMMOROW:
		case YESTERDAY:
		case THIS_HOUR:
		case PAST_HOUR:
		case NEXT_HOUR:
		case PAST_MINUTE:
		case NEXT_MINUTE:
		case PAST_THREE_MINUTE:
		case NEXT_THREE_MINUTE:
		case PAST_FIVE_MINUTE:
		case NEXT_FIVE_MINUTE:
		case PAST_QUARTER_HOUR:
		case NEXT_QUARTER_HOUR:
		case PAST_HALF_HOUR:
		case NEXT_HALF_HOUR:
		case PAST_THREE_HOUR:
		case NEXT_THREE_HOUR:
		case PAST_FOUR_HOUR:
		case NEXT_FOUR_HOUR:
		case PAST_SIX_HOUR:
		case NEXT_SIX_HOUR:
		case THIS_DAY:
		case PAST_DAY:
		case NEXT_DAY:
		case PAST_THREE_DAY:
		case NEXT_THREE_DAY:
		case PAST_FOUR_DAY:
		case NEXT_FOUR_DAY:
		case PAST_FIVE_DAY:
		case NEXT_FIVE_DAY:
		case THIS_WEEK:
		case PAST_WEEK:
		case NEXT_WEEK:
		case PAST_TWO_WEEK:
		case NEXT_TWO_WEEK:
		case PAST_THREE_WEEK:
		case NEXT_THREE_WEEK:
		case THIS_MONTH:
		case PAST_MONTH:
		case NEXT_MONTH:
		case PAST_THREE_MONTH:
		case NEXT_THREE_MONTH:
		case PAST_SIX_MONTH:
		case NEXT_SIX_MONTH:
		case PAST_NINE_MONTH:
		case NEXT_NINE_MONTH:
		case THIS_YEAR:
		case PAST_YEAR:
		case NEXT_YEAR:
		case PAST_TWO_YEAR:
		case NEXT_TWO_YEAR:
		case PAST_THREE_YEAR:
		case NEXT_THREE_YEAR:
		case PAST_FOUR_YEAR:
		case NEXT_FOUR_YEAR:
		case PAST_FIVE_YEAR:
		case NEXT_FIVE_YEAR:
		case ONE_SECOND:
		case THIRTY_SECONDS:
		case THREE_MINUTES:
		case FIVE_MINUTES:
		case FIFTEEN_MINUTES:
		case THIRTY_MINUTES:
		default:
			break;
		}
		return TimeRange.RAW;
	}
	 */
}
