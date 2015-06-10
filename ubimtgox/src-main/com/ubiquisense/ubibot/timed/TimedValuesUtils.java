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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

public class TimedValuesUtils<T extends TimedValue> {

	public final static TimedValuesUtils<?> INSTANCE = new TimedValuesUtils<TimedValue>();
	
	private SimpleDateFormat 
		ISO_8601_DATE_FORMAT, 
		ISO_8601_SHORT_DATE_FORMAT, 
		ISO_8601_READABLE_DATE_FORMAT; 

	private Random randomizer;
	
	public TimedValuesUtils() {
		randomizer = new Random();
		
		// These date format coming from Cosm/Pachube needs and might be decoraleted later
		
		ISO_8601_READABLE_DATE_FORMAT	= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
		ISO_8601_READABLE_DATE_FORMAT.setLenient(true);
		ISO_8601_READABLE_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+0:00")); // UTC
		
		ISO_8601_DATE_FORMAT		= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'");
		ISO_8601_DATE_FORMAT.setLenient(true);
		ISO_8601_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+0:00")); // UTC
		
		ISO_8601_SHORT_DATE_FORMAT	= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		ISO_8601_SHORT_DATE_FORMAT.setLenient(true);
		ISO_8601_SHORT_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+0:00")); // UTC
	}
	
	public String parseReadable(Date d) {
		return ISO_8601_READABLE_DATE_FORMAT.format(d);
	}
	
	public String parse(Date d) {
		return ISO_8601_DATE_FORMAT.format(d);
	}
	
	public TimedValue createTimedValue(float v) {
		return new TimedValue(v, new Date());
	}
	
	public TimedValue createTimedValue(float v, Date at) {
		return new TimedValue(v, at);
	}
	
	public SelfTimedRange<T> createSelfTimedRange(long scope, long timeDuration) {
		return new SelfTimedRange<T>(scope, timeDuration);
	}
	
	public BoundedTimedRange<T> createBoundedTimedRange() {
		return new BoundedTimedRange<T>();
	}
	
	public BoundedTimedRange<T> createBoundedTimedRange(Date start) {
		return new BoundedTimedRange<T>();
	}
	
	public BoundedTimedRange<T> createBoundedTimedRange(Date start, Date end) {
		return new BoundedTimedRange<T>();
	}
	
	//
	//
	// Utils
	//
	//
	
	
	public List<String> init5YearsSpanDateSamples() {
		List<String> dates = new ArrayList<String>();
		for (Date d : init5YearsSpanDateSamplesAsDates()) {
			dates.add(ISO_8601_DATE_FORMAT.format(d));
		}
		return dates;
	}
	
	//
	// Utils 
	//
	
	public List<Date> init5YearsSpanDateSamplesAsDates() {
		List<Date> dates = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -2);
		cal.add(Calendar.MONTH, -6);
		@SuppressWarnings("unused")
		Date start = new Date(cal.getTime().getTime());
		cal.add(Calendar.YEAR, +5);
		Date end = new Date(cal.getTime().getTime());
		cal.add(Calendar.YEAR, -5);
		// get 5000 samples
		while (cal.getTimeInMillis() < end.getTime()) {
			int quantum = randomizer.nextInt(60000 * 10);
			String date = ISO_8601_DATE_FORMAT.format(cal.getTime());
			System.out.println(date);
			cal.add(Calendar.MILLISECOND, quantum);
			dates.add(cal.getTime());
		}
		return dates;
	}
	
	public List<Date> init2WeeksSpanUltraHighResDateSamplesAsDates() {
		List<Date> dates = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		cal.setTime(new Date());
		cal.add(Calendar.WEEK_OF_YEAR, -1);
		@SuppressWarnings("unused")
		Date start = new Date(cal.getTime().getTime());
		cal.add(Calendar.WEEK_OF_YEAR, +2);
		Date end = new Date(cal.getTime().getTime());
		cal.add(Calendar.WEEK_OF_YEAR, -2);
		// get 5000 samples
		while (cal.getTimeInMillis() < end.getTime()) {
			int quantum = randomizer.nextInt(60000);
			String date = ISO_8601_DATE_FORMAT.format(cal.getTime());
			System.out.println(date);
			cal.add(Calendar.MILLISECOND, quantum);
			dates.add(cal.getTime());
		}
		return dates;
	}
	
	public List<Date> init3MonthsSpanHighResDateSamplesAsDates() {
		List<Date> dates = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		cal.setTime(new Date());
		cal.add(Calendar.MONTH, -1);
		cal.add(Calendar.WEEK_OF_YEAR, -2);
		@SuppressWarnings("unused")
		Date start = new Date(cal.getTime().getTime());
		cal.add(Calendar.MONTH, +3);
		Date end = new Date(cal.getTime().getTime());
		cal.add(Calendar.MONTH, -3);
		// get 5000 samples
		while (cal.getTimeInMillis() < end.getTime()) {
			int quantum = randomizer.nextInt(30000);
			String date = ISO_8601_DATE_FORMAT.format(cal.getTime());
			System.out.println(date);
			cal.add(Calendar.MILLISECOND, quantum);
			dates.add(cal.getTime());
		}
		return dates;
	}
	
	public List<Date> AsDates() { 
		List<Date> dates = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		cal.setTime(new Date());
		cal.add(Calendar.MONTH, -1);
		cal.add(Calendar.WEEK_OF_YEAR, -2);
		@SuppressWarnings("unused")
		Date start = new Date(cal.getTime().getTime());
		cal.add(Calendar.MONTH, +3);
		Date end = new Date(cal.getTime().getTime());
		cal.add(Calendar.MONTH, -3);
		// get 5000 samples
		while (cal.getTimeInMillis() < end.getTime()) {
			int quantum = randomizer.nextInt(30000);
			String date = ISO_8601_DATE_FORMAT.format(cal.getTime());
			System.out.println(date);
			cal.add(Calendar.MILLISECOND, quantum);
			dates.add(cal.getTime());
		}
		return dates;
	}
	
	public List<String> init3MonthsSpanHighResDateSamples() {
		List<String> dates = new ArrayList<String>();
		for (Date d : init3MonthsSpanHighResDateSamplesAsDates()) {
			dates.add(ISO_8601_DATE_FORMAT.format(d));
		}
		return dates;
	}
	
	public List<String> init2WeeksSpanUltraHighResDateSamples() {
		List<String> dates = new ArrayList<String>();
		for (Date d : init2WeeksSpanUltraHighResDateSamplesAsDates()) {
			dates.add(ISO_8601_DATE_FORMAT.format(d));
		}
		return dates;
	}

	public List<TimedValue> init2WeeksSpanUltraHighResTimedValuesSamples() {
		return init2WeeksSpanUltraHighResTimedValuesSamples(1f);
	}
	
	public List<TimedValue> init2WeeksSpanUltraHighResTimedValuesSamples(float amplitude) {
		return randomizeTimeValuesFromDates(init2WeeksSpanUltraHighResDateSamplesAsDates(), amplitude);
	}
	
	public List<TimedValue> randomizeTimeValuesFromDates(List<Date> dates, float amplitude) {
		List<TimedValue> values = new ArrayList<TimedValue>();
		for (Date d : dates) {
			values.add(createTimedValue(amplitude * randomizer.nextFloat(), d));
		}
		return values;
	}
}
