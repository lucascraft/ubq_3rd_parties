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

package com.ubiquisense.data;

import java.util.ArrayList;
import java.util.List;

public class MtGox {
	private Market market;
	private List<DepthLine> depths;
	private List<FetchValue> fetchs;
	private List<DepthValue> sales;
	private List<Fundamentals> trend;
	public MtGox() {
		market = new Market();
		market.setCurrency("EUR");
		market.setBroker("MtGox");
		market.setBuy(0f);
		market.setLow(0f);
		market.setHigh(0f);
		market.setSell(0f);
		market.setVolume(0f);
		market.setLastLocal(0f);
		market.setLastOrig(0f);
		
		depths = new ArrayList<DepthLine>();
		fetchs = new ArrayList<FetchValue>();
		sales = new ArrayList<DepthValue>();
		trend = new ArrayList<Fundamentals>();
	}
	public List<Fundamentals> getTrend() {
		return trend;
	}
	public List<DepthValue> getSales() {
		return sales;
	}
	public List<DepthLine> getDepths() {
		return depths;
	}
	public List<FetchValue> getFetchs() {
		return fetchs;
	}
	public Market getMarket() {
		return market;
	}
	public void setMarket(Market market) {
		this.market = market;
	}
}
