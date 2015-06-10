/***********************************************************************************
 * Smbt - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package ubiquisense.utils;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javafx.scene.image.Image;
import javafx.scene.media.Media;


public class FXMediaUtils {
	
	public final static FXMediaUtils INSTANCE = new FXMediaUtils();
	
	private Map<String, Image> imagesMap;
	private Map<String, Media> mediaMap;
	
	public FXMediaUtils() {
		imagesMap	= new HashMap<String, Image>();
		mediaMap	= new HashMap<String, Media>();
	}

	private Image loadImage(String filePath) {
		InputStream is = loadStream(filePath);
		if (is != null) {
			return new Image(is);
		}
		return null;
	}
	
	private Media loadMedia(String filePath) {
		try {
		final URL resource = getClass().getResource(filePath);
		return new Media(resource.toString());
		} catch (Exception e) {
			return null;
		}
	}
	
	private InputStream loadStream(String filePath) {
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			URL url = classLoader.getResource(filePath);
			if (url == null) {
				System.err.println("Could not read resource: '" + filePath + "'. Is your file system case sensitive?");
			} else {
				if(!new File(url.getPath()).getCanonicalPath().endsWith(filePath))
					throw new RuntimeException(filePath + ":\n" +
							"The file does not exist exactly as it was named.\n" +
							"The test is likely to cause trouble on the build server.\n" +
							"Is your filesystem case insensitive? Please verify the spelling.");
	
				InputStream resourceAsStream = classLoader.getResourceAsStream(filePath);
				try {
					if (resourceAsStream == null) {
						System.err.println("Could not read resource: '" + filePath + "'. Is your file system case sensitive?");
					} else {
						return resourceAsStream;
					}
				} finally {
					if (resourceAsStream != null)
						resourceAsStream.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
		
	public Media getMedia(String path) {
		if (mediaMap.containsKey(path)) {
			return mediaMap.get(path);
		}
		Media media = null;
		try {
			media = loadMedia(path);
		} catch (Throwable t) {
			//
		}
		if (media != null) {
			mediaMap.put(path, media);
		}
		return media;
	}
	
	public Image getImage(String path) {
		if (imagesMap.containsKey(path)) {
			return imagesMap.get(path);
		}
		Image image = null;
		try {
			image = loadImage("ubiquisense/images/"+path);
		} catch (Throwable t) {
			//
		}
		if (image != null) {
			imagesMap.put(path, image);
		}
		return image;
	}
}
