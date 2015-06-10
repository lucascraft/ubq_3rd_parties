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

public class UbiquisenseQueryUtils {
	public final static UbiquisenseQueryUtils INSTANCE = new UbiquisenseQueryUtils();
	
	public String createTradeBotsFetch() {
		return "/bots/fetch";
	}
	
	//
	// Trade Bot CRUD
	//
	public String createTradeBotsAdd(String json) {
		return "/bots/add";
	}
	public String createTradeBotsRemove(String json) {
		return "/bots/remove";
	}
	public String createTradeBotsUpdate(String json) {
		return "/bots/update";
	}
	
	//
	// Rules CRUD
	//
	public String createTradeBotRulesAdd(String json) {
		return "/bot/rules/add";
	}
	public String createTradeBotRulesRemove(String json) {
		return "/bot/rules/remove";
	}
	public String createTradeBotRulesUpdate(String json) {
		return "/bot/rules/update";
	}
}
