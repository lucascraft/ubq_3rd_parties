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

package com.ubiquisense.ubibot;

import net.sf.smbt.btc.BtcCurrency;
import net.sf.smbt.btc.mtgox.MTGoxCmd;
import net.sf.smbt.btc.mtgox.MTGoxDataManager;
import net.sf.smbt.btc.mtgox.MTGoxUtils;

public class MTGoxRequestUtils {
	private String apiKey;
	private String secretKey;
	private MTGoxDataManager mtGoxDataManager;
	
	public MTGoxRequestUtils(MTGoxDataManager mtGoxDataManager, String apiKey, String secretKey) {
		this.apiKey = apiKey;
		this.secretKey = secretKey;
		this.mtGoxDataManager = mtGoxDataManager;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public String getSecretKey() {
		return secretKey;
	}
	private BtcCurrency getCurrency() {
		BtcCurrency currency = mtGoxDataManager.getMtGox().getMarket().getCurrency();
		return currency == null ? BtcCurrency.EUR : currency;
	}
	public MTGoxCmd getMoneyDepthFetch() {
		return (MTGoxCmd) MTGoxUtils.INSTANCE.createMtGoxMoneyDepthFetch(BtcCurrency.BTC, getCurrency(), apiKey, secretKey);
	}
	public MTGoxCmd getTicker() {
		return (MTGoxCmd) MTGoxUtils.INSTANCE.createMtGoxTicker(BtcCurrency.BTC, getCurrency(), apiKey, secretKey);
	}
	public MTGoxCmd getPrivateApiKey() {
		return (MTGoxCmd) MTGoxUtils.INSTANCE.createMtGoxGetPrivateKey(BtcCurrency.BTC, getCurrency(), apiKey, secretKey);
	}
	public MTGoxCmd getWalletHistory() {
		return (MTGoxCmd) MTGoxUtils.INSTANCE.createMtGoxWalletHistory(getCurrency(), apiKey, secretKey);
	}
	public MTGoxCmd getMoneyOrders() {
		return (MTGoxCmd) MTGoxUtils.INSTANCE.createMtGoxGenericOrders(BtcCurrency.BTC, getCurrency(), apiKey, secretKey);
	}
	public MTGoxCmd getMoneyInfo() {
		return (MTGoxCmd) MTGoxUtils.INSTANCE.createMtGoxV1MoneyInfo(BtcCurrency.BTC, getCurrency(), apiKey, secretKey);
	}
	public MTGoxCmd getDepthFull() {
		return (MTGoxCmd) MTGoxUtils.INSTANCE.createMtGoxMoneyDepthFull(BtcCurrency.BTC, getCurrency(), apiKey, secretKey);
	}
	public MTGoxCmd getMoneyTradesFetch(String tid) {
		return (MTGoxCmd) MTGoxUtils.INSTANCE.createMtGoxMoneyTradesFetch(BtcCurrency.BTC, getCurrency(), tid, apiKey, secretKey);
	}
	public MTGoxCmd addOrder(String type, float amount, float price) {
		return (MTGoxCmd) MTGoxUtils.INSTANCE.createMtGoxAddOrder(BtcCurrency.BTC, getCurrency(), type, amount, price, apiKey, secretKey);
	}
	public MTGoxCmd cancelOrder(String oid) {
		return (MTGoxCmd) MTGoxUtils.INSTANCE.createMtGoxCancelOrder(BtcCurrency.BTC, getCurrency(), oid, apiKey, secretKey);
	}
	public MTGoxCmd getBitcoinAddr() {
		return (MTGoxCmd) MTGoxUtils.INSTANCE.createMtGoxBitcoinAddr(apiKey, secretKey);
	}
}
