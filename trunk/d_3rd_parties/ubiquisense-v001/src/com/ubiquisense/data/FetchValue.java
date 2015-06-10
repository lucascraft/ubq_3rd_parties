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

import java.math.BigInteger;
import java.util.Date;

public class FetchValue {
	
	private Date date;
	private float amount;
	private BigInteger priceInt;
	private String tid;
	private String primary;
	private String properties;
	private String currency;
	private String item;
	private String trade;
	
	public long getStamp() {
		return date.getTime();
	}

	public void setStamp(long value) {
		date = new Date(value);
	}

	public float getPrice() {
		return priceInt.floatValue();
	}

	public void setPrice(float value) {
		priceInt = new BigInteger(""+Float.valueOf(value).intValue());
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float value) {
		amount = value;
	}

	public BigInteger getPriceInt() {
		return priceInt;
	}

	public void setPriceInt(BigInteger value) {
		priceInt = value;
	}

	public BigInteger getAmountInt() {
		return new BigInteger(amount+"");
	}

	public void setAmountInt(BigInteger value) {
		
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String value) {
		tid = value;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String value) {
		currency = value;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String value) {
		item = value;
	}

	public String getTradeType() {
		return trade;
	}

	public void setTradeType(String value) {
		trade = value;
	}

	public String getPrimary() {
		return primary;
	}

	public void setPrimary(String value) {
		primary = value;
	}

	public String getProperties() {
		return properties;
	}

	public void setProperties(String value) {
		this.properties = value;
	}

}
