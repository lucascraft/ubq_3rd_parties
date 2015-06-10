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

package com.ubiquisense.ubibot.ctx;

import org.eclipse.emf.ecore.EObject;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class JsonUtils {
	public final static JsonUtils INSTANCE = new JsonUtils();
	private JsonParser parser;
	public JsonUtils() {
		parser = new JsonParser();
	}
	public JsonElement load(String jsonString) {
		return parser.parse(jsonString);
	}
	
	
	public String to(String buffer, EObject eObj) {
		if (eObj instanceof EObject) {
			while (eObj.eAllContents().hasNext()) {
				EObject obj = eObj.eAllContents().next();
				buffer += eval(obj);  
				to(buffer, eObj);
			}
			return buffer;
		}
		
		return "{}";
	}
	
	private String eval(EObject eObj) {
		//eObj.eClass().get
		return "{}";
	}
	
}
