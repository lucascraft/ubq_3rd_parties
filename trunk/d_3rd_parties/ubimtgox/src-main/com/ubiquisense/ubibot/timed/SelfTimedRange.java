/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012-2013, Lucas Bigeardel
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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SelfTimedRange <T extends TimedValue> {
	private float minValueOverall, maxValueOverall, minValueSampling, maxValueSampling, minVolumeSampling, maxVolumeSampling;
	private Date firstDate, lastDate, oldestSamplingDate, latestSamplingDate;
	private Date timeCursor;
	private SmartSamplingTreeMap<T> timedDatedMap;
	private long scope;
	@SuppressWarnings("deprecation")
	public SelfTimedRange(final long scope, final long timePrecision) {
		this.minValueOverall 	= 0f;
		this.maxValueOverall 	= 0f;
		this.minValueSampling 	= 0f;
		this.maxValueSampling 	= 0f;
		this.minVolumeSampling 	= 0f;
		this.maxVolumeSampling 	= 0f;
		this.scope				= scope;
		this.timeCursor			= new Date();
		this.firstDate			= new Date(-1000, 0, 1);
		this.lastDate			= new Date(0, 0, 1);
		this.oldestSamplingDate	= new Date(-1000, 0, 1);
		this.latestSamplingDate	= new Date(0, 0, 1);
		this.timedDatedMap 		= new SmartSamplingTreeMap<T>(scope, new Comparator<Date>(){
			@Override
			public int compare(Date d1, Date d2) {
				if (d1 != null && d2 != null) {
					return d1.compareTo(d2);
				}
				return 0;
			}
		});
	}
	public long getScope() {
		return scope;
	}
	public void setScope(long scope) {
		this.scope = scope;
		getSampledTimeValues();
	}
	public Date getFirstDate() {
		return firstDate;
	}
	public Date getLastDate() {
		return lastDate;
	}
	public float getMaxValueSampling() {
		return maxValueSampling;
	}
	public float getMinValueSampling() {
		return minValueSampling;
	}
	public float getMaxVolumeSampling() {
		return maxVolumeSampling;
	}
	public float getMinVolumeSampling() {
		return minVolumeSampling;
	}
	public float getMaxValueOverall() {
		return maxValueOverall;
	}
	public float getMinValueOverall() {
		return minValueOverall;
	}
	public Date getOldestSamplingDate() {
		return oldestSamplingDate;
	}
	public Date getLatestSamplingDate() {
		return latestSamplingDate;
	}
	public void setOldestSamplingDate(Date oldestSamplingDate) {
		this.oldestSamplingDate = oldestSamplingDate;
	}
	public void setLatestSamplingDate(Date latestSamplingDate) {
		this.latestSamplingDate = latestSamplingDate;
	}
	public Date getTimeCursor() {
		return timeCursor;
	}
	public void setTimeCursor(Date timeCursor) {
		this.timeCursor = timeCursor;
		getSampledTimeValues();
	}
	public void setTimedValues(List<T> values) {
		for (T v : values) {
			setTimedValue(v);
		}
	}
	public T getTimedValue(Date d) {
		return timedDatedMap.get(d);
	}
	public boolean hasValue(Date d) {
		return timedDatedMap.containsKey(d);
	}
	public void setTimedValue(T value) {
		if (value != null && value.getD() != null) {
			float v	= value.getV();
			Date d	= value.getD();
			if (v < minValueOverall || minValueOverall == 0)	{ minValueOverall	= v; }
			if (v > maxValueOverall)							{ maxValueOverall	= v; }
			if (firstDate.after(d))								{ firstDate			= d; }
			if (lastDate.before(d))								{ lastDate			= d; }
			Calendar limitCal = GregorianCalendar.getInstance();
			limitCal.setTime(lastDate);
			limitCal.add(Calendar.MILLISECOND, (int)-scope);
			firstDate = limitCal.getTime();  
			if (!timedDatedMap.containsKey(d)) {
				timedDatedMap.put(d, value);
			}
		}
	}
	public void clearTimedValues() {
		timedDatedMap.clear();
	}
	public Collection<T> getSampledTimeValues() {
		Collection<T> tValues = new ArrayList<T>();
		 for (Date k : timedDatedMap.sampledKeySet()) {
			T tv = timedDatedMap.get(k);
			if (tv.getVolume() < minVolumeSampling || minVolumeSampling == 0) 	{ minVolumeSampling		= tv.getVolume(); 	}
			if (tv.getVolume() > maxVolumeSampling) 							{ maxVolumeSampling 	= tv.getVolume(); 	}
			if (tv.getV() < minValueSampling || minValueSampling == 0) 			{ minValueSampling 		= tv.getV(); 		}
			if (tv.getV() > maxValueSampling) 									{ maxValueSampling 		= tv.getV(); 		}
			if (tv.getD().before(oldestSamplingDate)) 							{ oldestSamplingDate 	= tv.getD(); 		}	
			if (tv.getD().after(latestSamplingDate)) 							{ latestSamplingDate 	= tv.getD(); 		}
			tValues.add(tv);
		 }
		 return tValues;
	}
	public Collection<T> getTimeValues() {
		 return timedDatedMap.values();
	}
	public Date getLatestDate() {
		if (!timedDatedMap.sampledKeySet().isEmpty()) {
			Date[] dates = timedDatedMap.sampledKeySet().toArray(new Date[0]);
			return dates[0];
		}
		return new Date();
	}
	public Map<TimeBounds, List<T>> getSampledValuesRanges(Date cursor, TimeDuration duration) {
		return getSampledValuesRanges(getTimeSlices(cursor, duration));
	}
	public List<TimeBounds> getTimeSlices(Date cursor, TimeDuration duration) {
		List<TimeBounds> list = new ArrayList<TimeBounds>();
		long step = duration.getDuration();
		int s = timedDatedMap.sampledKeySet().size();
		if (s > 0) {
			Date olderDate	= (Date) timedDatedMap.sampledKeySet().toArray()[s-1];
			Date newerDate 	= (Date) timedDatedMap.sampledKeySet().toArray()[0];
			long older 		= olderDate.before(newerDate) 	? olderDate.getTime() : newerDate.getTime();
			long newer 		= newerDate.after(olderDate) 	? newerDate.getTime() : olderDate.getTime();
			long curTime 	= older;
			while(curTime < newer) {
				list.add(0, TimeRange.getTimeBounds(new Date(curTime), duration));
				curTime += step;
			}
		}
		return list;
	}
	public Map<TimeBounds, List<T>> getSampledValuesRanges(List<TimeBounds> dateRanges) {
		Map<TimeBounds, List<T>> ranges = new HashMap<TimeBounds, List<T>>();
		for(TimeBounds d : dateRanges) {
			ranges.put(d, getSampledTimeValues(d.begins, d.ends));
		}	
		return ranges;
	}
	public List<T> getSampledTimeValues(TimedFact timedFact) {
		Date now 			= getTimeCursor();
		Date start 			= getTimeCursor();
		Date end			= getTimeCursor();
		Calendar calendar	= Calendar.getInstance();
		calendar.setTime(getTimeCursor());
		switch (timedFact) {
			case INSTANTS:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, +5);  
				end = calendar.getTime();
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, -5);  
				start = calendar.getTime();
				break;
			case INSTANTS_BEFORE:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, -5);  
				start = calendar.getTime();
				break;
			case INSTANTS_AFTER:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, +5);  
				end = calendar.getTime();
				break;
			case BEFORE:
				calendar.setTime(now);
				calendar.add(Calendar.YEAR, -10);  
				start = calendar.getTime();
				break; 
			case AFTER:
				calendar.setTime(now);
				calendar.add(Calendar.YEAR, +10);  
				end = calendar.getTime();
				break;
			case PREV_SIX_HOURS:
				calendar.setTime(now);
				calendar.add(Calendar.HOUR, -6);  
				start = calendar.getTime();
				break;
			case NEXT_MINUTE:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, +1);  
				end = calendar.getTime();
				break;
			case PAST_MINUTE:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, -1);  
				start = calendar.getTime();
				break;
			case NEXT_THREE_MINUTE:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, +3);  
				end = calendar.getTime();
				break;
			case PAST_THREE_MINUTE:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, -3);  
				start = calendar.getTime();
				break;
			case NEXT_FIVE_MINUTE:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, +5);  
				end = calendar.getTime();
				break;
			case PAST_FIVE_MINUTE:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, -5);  
				start = calendar.getTime();
				break;
			case NEXT_QUARTER_HOUR:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, +15);  
				end = calendar.getTime();
				break;
			case PAST_QUARTER_HOUR:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, -15);  
				start = calendar.getTime();
				break;
			case NEXT_FOUR_HOUR:
				calendar.setTime(now);
				calendar.add(Calendar.HOUR, +4);  
				end = calendar.getTime();
				break;
			case PAST_FOUR_HOUR:
				calendar.setTime(now);
				calendar.add(Calendar.HOUR, -4);  
				start = calendar.getTime();
				break;
			case NEXT_THREE_DAY:
				calendar.setTime(now);
				calendar.add(Calendar.DAY_OF_MONTH, +3);  
				end = calendar.getTime();
				break;
			case PAST_THREE_DAY:
				calendar.setTime(now);
				calendar.add(Calendar.DAY_OF_MONTH, -3);  
				start = calendar.getTime();
				break;
			case NEXT_HALF_HOUR:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, +30);  
				end = calendar.getTime();
				break;
			case PAST_HALF_HOUR:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, -30);  
				start = calendar.getTime();
				break;
			case NEXT_SIX_HOURS:
				calendar.setTime(now);
				calendar.add(Calendar.HOUR, +6);  
				end = calendar.getTime();
				break;
			case SIX_HOURS:
				calendar.setTime(now);
				calendar.add(Calendar.HOUR, +3);  
				end = calendar.getTime();
				calendar.setTime(now);
				calendar.add(Calendar.HOUR, -3);  
				start = calendar.getTime();
				break;
			case THIS_HOUR:
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, +30);  
				end = calendar.getTime();
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, -30);  
				start = calendar.getTime();
				break;
			case PAST_HOUR:
				calendar.setTime(now);
				calendar.add(Calendar.HOUR, -1);  
				start = calendar.getTime();
				break;
			case NEXT_HOUR:
				calendar.setTime(now);
				calendar.add(Calendar.HOUR, +1);  
				end = calendar.getTime();
				break;
			case THIS_DAY:
				calendar.setTime(now);
				calendar.add(Calendar.HOUR, +12);  
				end = calendar.getTime();
				calendar.setTime(now);
				calendar.add(Calendar.HOUR, -12);  
				start = calendar.getTime();
				break;
			case PAST_DAY:
				calendar.setTime(now);
				calendar.add(Calendar.DAY_OF_YEAR, -1);  
				start = calendar.getTime();
				break;
			case NEXT_DAY:
				calendar.setTime(now);
				calendar.add(Calendar.DAY_OF_YEAR, +1);  
				end = calendar.getTime();
				break;
			case THIS_WEEK:
			case PAST_WEEK:
				calendar.setTime(now);
				calendar.add(Calendar.WEEK_OF_YEAR, -1);  
				start = calendar.getTime();
				break;
			case NEXT_WEEK:
				calendar.setTime(now);
				calendar.add(Calendar.WEEK_OF_YEAR, +1);  
				end = calendar.getTime();
				break;
			case THIS_MONTH:
			case PAST_MONTH:
				calendar.setTime(now);
				calendar.add(Calendar.MONTH, -1);  
				start = calendar.getTime();
				break;
			case NEXT_MONTH:
				calendar.setTime(now);
				calendar.add(Calendar.MONTH, +1);  
				end = calendar.getTime();
				break;
			case THIS_YEAR:
			case PAST_YEAR:
				calendar.setTime(now);
				calendar.add(Calendar.MONTH, -1);  
				start = calendar.getTime();
				break;
			case NEXT_YEAR:
				calendar.setTime(now);
				calendar.add(Calendar.MONTH, +1);  
				end = calendar.getTime();
				break;
			default:
				break;
		}
		return getSampledTimeValues(start, end);
	}
	public synchronized List<T> getSampledTimeValues(Date start, Date end) {
		List<T> values = new ArrayList<T>();
		for (T v : getSampledTimeValues()) {
			if (v.getD().equals(end) || v.getD().equals(start) || (v.getD().before(end) && v.getD().after(start))) {
				values.add(v);
			}
		}
		return values;
	}
	public synchronized List<T> getTimeValues(Date start, Date end) {
		List<T> values = new ArrayList<T>();
		for (T v : getTimeValues()) {
			if (v.getD().equals(end) || v.getD().equals(start) || (v.getD().before(end) && v.getD().after(start))) {
				values.add(v);
			}
		}
		return values;
	}
	public synchronized Map<PositionningValue, Date> getTimeBullets(double w, double h) {
		Map<PositionningValue, Date> bullets 	= new TreeMap<PositionningValue, Date>(
			new Comparator<PositionningValue>() {
				@Override
				public int compare(PositionningValue p1, PositionningValue p2) {
					return (
						p1 != null && 
						p2 != null && 
						p1.getPosition() != null && 
						p2.getPosition() != null
					) ? p2.getPosition().x - p1.getPosition().x : 0;
				}
			}
		);
		Map<Date, PositionningValue> map = getPositions(w, h);
		for (Date d : map.keySet()) {
			bullets.put(map.get(d), d);
		}
		return bullets;
	}
	public synchronized Map<Date, PositionningValue> getPositions(double w, double h){
		return _getPositions(w, h, getSampledTimeValues());
	}
	@SuppressWarnings("deprecation")
	private synchronized Map<Date, PositionningValue> _getPositions(double w, double h, Collection<T> timedValues){
		Map<Date, PositionningValue> points = new TreeMap<Date, PositionningValue>(new Comparator<Date>() {
			@Override
			public int compare(Date d1, Date d2) {
				return (d1 != null && d2 != null) ? d1.compareTo(d2) : 0;
			}
		});
		if (!timedValues.isEmpty()) {
			float hDist = (maxValueSampling - minValueSampling);
			
			float wDist = new Float(getOldestSamplingDate().getTime() - getLatestSamplingDate().getTime());
			for (TimedValue v : timedValues) {
				double vRatio = (v.getV() - minValueSampling) / hDist; 	
				double hRatio = new Float(v.getD().getTime() - getLatestSamplingDate().getTime()) / wDist;
				v.setPosition(new com.ubiquisense.ubibot.timed.Point(w * hRatio, h * vRatio));
				points.put(v.getD(), v);
			}
		}
		return points;
	}
}
