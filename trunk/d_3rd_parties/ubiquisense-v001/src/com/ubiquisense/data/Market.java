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

public class Market {
	private Float buy;
	private Float low;
	private Float high;
	private Float sell;
	private Float last;
	private String currency;
	private String broker;
	private Float volume;
	private Float lastOrig;
	private Float lastLocal;
	public Float getLastLocal() {
		return lastLocal;
	}
	public void setLastLocal(Float lastLocal) {
		this.lastLocal = lastLocal;
	}
	public Float getLastOrig() {
		return lastOrig;
	}
	public void setLastOrig(Float lastOrig) {
		this.lastOrig = lastOrig;
	}
	public Float getVolume() {
		return volume;
	}
	public void setVolume(Float volume) {
		this.volume = volume;
	}
	public String getBroker() {
		return broker;
	}
	public void setBroker(String broker) {
		this.broker = broker;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Float getBuy() {
		return buy;
	}
	public Float getHigh() {
		return high;
	}
	public Float getLast() {
		return last;
	}
	public Float getLow() {
		return low;
	}
	public Float getSell() {
		return sell;
	}
	public void setBuy(Float buy) {
		this.buy = buy;
	}
	public void setHigh(Float high) {
		this.high = high;
	}
	public void setLast(Float last) {
		this.last = last;
	}
	public void setLow(Float low) {
		this.low = low;
	}
	public void setSell(Float sell) {
		this.sell = sell;
	}
}
