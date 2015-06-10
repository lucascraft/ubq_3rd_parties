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

import java.math.BigInteger;

public class DepthValue {
	private Long stamp;
	private Float price;
	private Float amount;
	private Float sum;
	private BigInteger priceInt;
	private BigInteger amountInt;
	private String kind;
	private String currency;
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Long getStamp() {
		return stamp;
	}
	public void setStamp(Long stamp) {
		this.stamp = stamp;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public BigInteger getPriceInt() {
		return priceInt;
	}
	public void setPriceInt(BigInteger priceInt) {
		this.priceInt = priceInt;
	}
	public BigInteger getAmountInt() {
		return amountInt;
	}
	public void setAmountInt(BigInteger amountInt) {
		this.amountInt = amountInt;
	}
	public Float getSum() {
		return sum;
	}
	public void setSum(Float sum) {
		this.sum = sum;
	}
}
