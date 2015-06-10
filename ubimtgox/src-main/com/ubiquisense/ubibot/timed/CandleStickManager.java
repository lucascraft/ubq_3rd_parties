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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class CandleStickManager {
	private SelfTimedRange<LinkedFinancialTimedValue> timedRange;
	private int CANDLE_WIDTH = 10;
	private List<CandleStickData> candles;

	public CandleStickManager(List<LinkedFinancialTimedValue> values) {
		timedRange	= new SelfTimedRange<LinkedFinancialTimedValue>(TimeDuration.HALF_DAY.getDuration(), TimeDuration.FIFTEEN_MINUTES.getDuration());
		Date now = new Date();
		timedRange.setLatestSamplingDate(now);
		Date oldest = new Date(now.getTime() - TimeDuration.HALF_DAY.getDuration());
		timedRange.setOldestSamplingDate(oldest);
		candles		= new ArrayList<CandleStickData>();
	}
	
	public SelfTimedRange<LinkedFinancialTimedValue> getTimedRange() {
		return timedRange;
	}
	
	private int getNbCandles(int w, int h) {
		return w / CANDLE_WIDTH;
	}

	public void updateCandles(int w, int h) {
		candles.clear();
		int n = getNbCandles(w, h);
		Date first 		= timedRange.getOldestSamplingDate();
		Calendar cursorCal = GregorianCalendar.getInstance();
		cursorCal.setTime(first);
		int timeStep	= (int) timedRange.getScope() / n;
		for (int ic=0;ic<n;ic++) {
			TimeBounds tBound = TimeRange.getTimeBounds(cursorCal.getTime(), timeStep);
			candles.add(createCandle(tBound));
			cursorCal.add(Calendar.MILLISECOND, timeStep);
		}
	} 
	
	public List<CandleStickData> getCandles() {
		return candles;
	}
	
	private CandleStickData createCandle(TimeBounds range) {
		List<LinkedFinancialTimedValue> values = timedRange.getTimeValues(range.begins, range.ends);
		
		float low 		= Float.MAX_VALUE;
		float high 		= Float.MIN_VALUE;
		float close		= 0.0f;
		float open 		= Float.MIN_VALUE;
		float volume 	= 0.0f;
		float sum		= 0.0f;
		for (LinkedFinancialTimedValue v : values) {
			if (Float.MIN_VALUE == open) {
				open = v.getV();
			}
			low 	= low 	> v.getV() ? v.getV() 	: low;
			high 	= high 	< v.getV() ? v.getV() 	: high;
			close 	= v.getV();
			volume 	+= v.getVolume();
			sum 	+= v.getV();
		}
		return new CandleStickData(values, sum/values.size(), low, close, open, high, volume, range);
	}

	public int getNbCandles() {
		return candles.size();
	}
}
