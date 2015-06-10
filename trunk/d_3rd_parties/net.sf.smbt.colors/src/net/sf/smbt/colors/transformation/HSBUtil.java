/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

package net.sf.smbt.colors.transformation;

import java.awt.color.ColorSpace;
import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.model.colors.ColorsFactory;
import net.sf.smbt.model.colors.HSB;

public class HSBUtil {
	ColorSpace colorSpace;
	public static HSBUtil INSTANCE = new HSBUtil();
	
	public HSBUtil() {
	}
	
	public HSB init(HSB hsbColor, float[] values) {
		return init(hsbColor, values[0], values[1], values[2]);
	}
	
	public HSB init(HSB hsbColor, float h, float s, float b) {
		hsbColor.setHue(h);
		hsbColor.setSaturation(s);
		hsbColor.setBrightness(b);
		return hsbColor;
	}

	public HSB create(float[] values) {
		return create(values[0], values[1], values[2]);
	}
	
	public HSB create(float h, float s, float b) {
		HSB hsbColor = ColorsFactory.eINSTANCE.createHSB();
		hsbColor.setHue(h);
		hsbColor.setSaturation(s);
		hsbColor.setBrightness(b);
		return hsbColor;
	}
	
	public List<HSB> pulse(int nbStates, HSB startColor, HSB endColor) {
		List<HSB> hsbs1 = fade(nbStates, startColor, endColor);
		List<HSB> hsbs2 = new ArrayList<HSB>();
		while(hsbs1.listIterator().hasPrevious()) {
			hsbs2.add(hsbs1.listIterator().previous());
		}
		List<HSB> hsbs = new ArrayList<HSB>();
		hsbs.addAll(hsbs1);
		hsbs.addAll(hsbs2);
		return hsbs;
	}
	
	
	public List<HSB> fade(int nbStates, HSB startColor, HSB endColor) {
		List<HSB> hsbList = new ArrayList<HSB>();
		
		float hueStep = (startColor.getHue() - endColor.getHue()) / nbStates;
		float satStep = (startColor.getSaturation() - endColor.getSaturation()) / nbStates;
		float brightStep = (startColor.getBrightness() - endColor.getBrightness()) / nbStates;
		
		for (int i=0, max=nbStates; i < max; i++) {
			hsbList.add(
				create(
					startColor.getHue() + i * hueStep,
					startColor.getSaturation() + i * satStep,
					startColor.getBrightness() + i * brightStep
				)
			);
		}
		return hsbList;
	}
}
