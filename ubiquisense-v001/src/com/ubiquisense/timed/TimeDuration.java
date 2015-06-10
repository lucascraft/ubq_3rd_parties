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

public enum TimeDuration {
	NOW				("now"),
	ONE_SECOND		("1 second"),
	THIRTY_SECONDS	("30 seconds"),
	ONE_MINUTE		("1 minutes"),
	THREE_MINUTES	("3 minutes"),
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
	private TimeDuration(String literal) {
		this.literal = literal;
	}
	public String getLiteral() {
		return literal;
	}
	public TimeDuration getValue() {
		return this;
	}
	/**
	 * Get range from from now to the past as a duration
	 * @return range {@link Date} from now to past intrinsic time
	 */
	public long getDuration() {
		switch(this) {
			case NOW:
				return 0;
			case ONE_SECOND:
				return 1000l;
			case THIRTY_SECONDS:
				return ONE_SECOND.getDuration() 	* 30;
			case ONE_MINUTE:
				return ONE_SECOND.getDuration() 	* 60;
			case THREE_MINUTES:
				return ONE_MINUTE.getDuration() 	* 3;
			case FIVE_MINUTES:
				return ONE_MINUTE.getDuration() 	* 5;
			case FIFTEEN_MINUTES:
				return ONE_MINUTE.getDuration() 	* 15;
			case THIRTY_MINUTES:
				return ONE_MINUTE.getDuration() 	* 30;
			case ONE_HOUR:
				return ONE_MINUTE.getDuration() 	* 60;
			case THREE_HOURS:
				return ONE_HOUR.getDuration() 		* 3;
			case FOUR_HOURS:
				return ONE_HOUR.getDuration() 		* 4;
			case SIX_HOURS:
				return ONE_HOUR.getDuration() 		* 6;
			case HALF_DAY:
				return ONE_HOUR.getDuration() 		* 12;
			case ONE_DAY:
				return ONE_HOUR.getDuration() 		* 24;
			case ONE_WEEK:
				return ONE_DAY.getDuration() 		* 7;
			case THIRTY_DAYS:
				return ONE_DAY.getDuration() 		* 30;
			case THREE_MONTHS:
				return THIRTY_DAYS.getDuration() 	* 3;
			case FIVE_DAY:
				return ONE_DAY.getDuration() 		* 5;
			case TWO_YEAR:
				return ONE_YEAR.getDuration() 		* 2;
			case THREE_YEAR:
				return ONE_YEAR.getDuration() 		* 3;
			case FOUR_YEAR:
				return ONE_YEAR.getDuration() 		* 4;
			case FIVE_YEAR:
				return ONE_YEAR.getDuration() 		* 5;
			case FOUR_DAY:
				return ONE_DAY.getDuration() 		* 4;
			case NINE_MONTHS:
				return THIRTY_DAYS.getDuration() 	* 9;
			case ONE_YEAR:
				return ONE_DAY.getDuration() 		* 365;
			case SIX_MONTHS:
				return ONE_YEAR.getDuration() 		/ 2;
			case TEN_YEAR:
				return ONE_YEAR.getDuration() 		* 10;
			case THREE_DAY:
				return ONE_DAY.getDuration() 		* 3;
			case THREE_WEEK:
				return ONE_WEEK.getDuration() 		* 3;
			case TWO_DAY:
				return ONE_DAY.getDuration() 		* 2;
			case TWO_MONTHS:
				return THIRTY_DAYS.getDuration() 	* 2;
			case TWO_WEEK:
				return ONE_WEEK.getDuration() 		* 2;
		}
		return 0;
	}
}
