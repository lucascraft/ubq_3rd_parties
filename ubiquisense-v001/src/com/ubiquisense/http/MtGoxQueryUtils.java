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

package com.ubiquisense.http;


public class MtGoxQueryUtils {
	public final static MtGoxQueryUtils INSTANCE = new MtGoxQueryUtils();
	
	public String createMtGoxMoneyDepthFetch(String btc1, String btc2) {
		return "/2/"+btc1+btc2+"/money/depth/fetch";
	}
	public String createMtGoxMoneyDepthFull(String btc1, String btc2) {
		return "/2/"+btc1+btc2+"/money/depth/full";
	}
	public String createMtV2GoxMoneyInfo(String btc1, String btc2) {
		return "/2/"+btc1+btc2+"/money/info";
	}
	public String createMtGoxMoneyTradesFetch(String btc1, String btc2) {
		return "/2/"+btc1+btc2+"/money/trades/fetch";
	}
	public String createMtGoxV1MoneyInfo(String btc1, String btc2) {
		return "/1/generic/info";
	}
	public String createMtGoxGenericOrders(String btc1, String btc2) {
		return "/1/generic/orders";
	}
	public String createMtGoxWalletHistory(String btc) {
		return "/1/generic/wallet/history";
	}
	public String createMtGoxTicker(String btc1, String btc2) {
		return "/1/"+btc1+btc2+"/money/ticker";
	}
	public String createMtGoxGetPrivateKey(String btc1, String btc2) {
		return "/1/generic/private/idkey";
	}
}
