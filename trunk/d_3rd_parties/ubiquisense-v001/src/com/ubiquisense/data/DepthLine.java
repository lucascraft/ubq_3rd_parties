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

public class DepthLine {
	DepthValue ask, bid;
	
	public DepthLine() {}

	public void setAsk(DepthValue ask) {
		this.ask = ask;
	}
	public void setBid(DepthValue bid) {
		this.bid = bid;
	}
	public DepthValue getAsk() {
		return ask;
	}
	public DepthValue getBid() {
		return bid;
	}
}
