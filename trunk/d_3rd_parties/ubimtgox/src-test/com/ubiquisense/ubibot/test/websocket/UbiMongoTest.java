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

package com.ubiquisense.ubibot.test.websocket;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClientURI;
import com.mongodb.jee.MongoHolder;

public class UbiMongoTest {
	public final static int DEFAULT_MONGO_DB_PORT = 27017;
	public final static int DEFAULT_MONGO_DB_ADMIN_PORT = 28017;
	

	public final static UbiMongoTest INSTANCE = new UbiMongoTest();
	
	public static void main(String[] args) {
		INSTANCE.connectDefaultMongoDB();
	}
	
	public void connectDefaultMongoDB() {
		try {
			Mongo mongoDB = MongoHolder.connect(new MongoClientURI("mongodb://localhost:" + DEFAULT_MONGO_DB_PORT));
			List<String> dbNames = new ArrayList<String>();
			if (mongoDB != null) {
				for (String dbName : mongoDB.getDatabaseNames()) {
					dbNames.add(dbName);
					System.out.println("DB : " + dbName);
				}
				DB ubiDB = mongoDB.getDB("ubiquisense");
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
