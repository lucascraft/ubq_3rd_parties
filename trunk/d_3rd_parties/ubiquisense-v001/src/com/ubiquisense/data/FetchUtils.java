/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package com.ubiquisense.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ubiquisense.entity.OHLCEntity;
import com.ubiquisense.timed.CandleStickData;
import com.ubiquisense.timed.CandleStickManager;
import com.ubiquisense.timed.LinkedFinancialTimedValue;

public class FetchUtils {
	public final static FetchUtils INSTANCE = new FetchUtils();
	
	public List<OHLCEntity> updateOHLC(int w, int h, List<FetchValue> values) {
		List<OHLCEntity> ohlc 						= new ArrayList<OHLCEntity>();
		List<LinkedFinancialTimedValue> timedValues	= new ArrayList<LinkedFinancialTimedValue>();
		CandleStickManager candleStickManager		= new CandleStickManager(timedValues);
		for (int i=0; i<values.size();i+=1) {
			FetchValue order = values.get(i);
			if (order!=null) {
				Date d = new Date(order.getStamp());
				LinkedFinancialTimedValue v = new LinkedFinancialTimedValue(
					order.getPrice(), 
					d, 
					order.getAmount(), 
					LinkedFinancialTimedValue.UP
				);
				candleStickManager.getTimedRange().setTimedValue(v);
				timedValues.add(v);
				if (i-1>=0 && timedValues.get(i-1) != null && !timedValues.isEmpty()) {
					LinkedFinancialTimedValue p = timedValues.get(i-1);
					v.setPrec(p);
					p.setNext(v);
				}
			}
		}
		candleStickManager.updateCandles(w, h);
		for (CandleStickData csd : candleStickManager.getCandles()) {
			ohlc.add(new OHLCEntity((double)csd.getOpen() ,(double)csd.getHigh(), (double)csd.getLow(), (double)csd.getClose() ,(int)0));
		}
		return ohlc;
	}
}
