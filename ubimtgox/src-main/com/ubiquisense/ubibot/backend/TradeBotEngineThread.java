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

package com.ubiquisense.ubibot.backend;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.btc.mtgox.server.TradeProcessingUtils;
import net.sf.smbt.btc.utils.BTCResourceUtils;
import net.sf.smbt.trading.TradeBotsConfig;

import com.ubiquisense.ubibot.MtGoxJettyBotServer;
import com.ubiquisense.ubibot.ctx.TradeBotsFacadeCtxHandler;

public class TradeBotEngineThread extends Thread {
	private Map<String, Long> lastModifiedMap;
	private Map<String, TradeBotsConfig> configsMap;
	private MtGoxJettyBotServer server;
	private TradeBotsFacadeCtxHandler botsCtx;
	private TradeProcessingUtils tradeProcessingUtils;

	public TradeBotEngineThread(MtGoxJettyBotServer server, TradeBotsFacadeCtxHandler ctxHandler, TradeProcessingUtils tradeProcessingUtils) {
		this.lastModifiedMap = new HashMap<String, Long>();
		this.configsMap = new HashMap<String, TradeBotsConfig>();
		this.server = server;
		this.botsCtx = ctxHandler;
		this.tradeProcessingUtils = tradeProcessingUtils;
	}
	
	private void checkBots() {
		if (botsCtx !=null) {
			botsCtx.updateBotsConfig(configsMap);
		}
	}
	
	@Override
	public void run() {
		do {
			try {
				//System.out.println("scan now");
				File storageDir = MtGoxJettyBotServer.INSTANCE.getStorageDir();
				if (storageDir != null && storageDir.exists() && storageDir.isDirectory()) {
					for (File f : storageDir.listFiles()) {
						if (f != null && f.isFile() && f.canRead()) {
							if (f.getName().endsWith(".bots")) {
								String canonicalPath = f.getCanonicalPath();
								if (lastModifiedMap.containsKey(canonicalPath)) {
									if (lastModifiedMap.get(canonicalPath) != f.lastModified()) {
										lastModifiedMap.put(canonicalPath, f.lastModified());
										TradeBotsConfig cfg = BTCResourceUtils.INSTANCE.load(canonicalPath);
										configsMap.put(canonicalPath, cfg);
										System.out.println(canonicalPath + " initial load.");
									}
								} else {
									lastModifiedMap.put(canonicalPath, f.lastModified());
									TradeBotsConfig cfg = BTCResourceUtils.INSTANCE.load(canonicalPath);
									configsMap.remove(canonicalPath);
									configsMap.put(canonicalPath, cfg);
									System.out.println(canonicalPath + " reloaded.");
								}
							}
						}
					}
					checkBots();
					tradeProcessingUtils.process(
						server.getMTGoxWebSocketCommunicatorThread().getMtgoxDataManager().getMtGox(), 
						configsMap.values().toArray(new TradeBotsConfig[0])
					);
				}
				//System.out.println("re-scan trade bot configurations");
				yield();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
	}
}
