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

package com.ubiquisense.entity;

public class TitleValueColorEntity extends TitleValueEntity{
	private int color;
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public TitleValueColorEntity(String title, float value, int color) {
		super(title ,value);
		this.color = color;
	}
	public TitleValueColorEntity() {
		super();
	}
}
