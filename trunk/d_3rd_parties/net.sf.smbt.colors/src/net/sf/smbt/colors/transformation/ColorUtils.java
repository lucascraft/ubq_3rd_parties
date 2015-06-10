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
import java.awt.color.ICC_ColorSpace;
import java.util.Arrays;
import java.util.List;

import net.sf.smbt.model.colors.ColorsFactory;
import net.sf.smbt.model.colors.HSB;
import net.sf.smbt.model.colors.RGB;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class ColorUtils implements IHSBColor, IRGBColor {
	ColorSpace hsbColorSpace;
	
	public ColorUtils() {
		hsbColorSpace = ICC_ColorSpace.getInstance(ICC_ColorSpace.TYPE_HSV);
	}
	
	public static ColorUtils INSTANCE = new ColorUtils();

	public RGB toRGB(HSB hsb) {
		return null;
	}

	public HSB toHSBColor(RGB rgb) {
		float[] hsbParameters = hsbColorSpace.fromRGB(new float[] { rgb.getRed(), rgb.getGreen(), rgb.getBlue() });
		HSB hsb = ColorsFactory.eINSTANCE.createHSB();
		hsb.setHue(hsbParameters[0]);
		hsb.setSaturation(hsbParameters[1]);
		hsb.setBrightness(hsbParameters[2]);
		return hsb;
	}
	
	public HSB getRed() {
		return getRGBTriplet().get(0);
	}
	
	public HSB getGreen() {
		return getRGBTriplet().get(1);
	}
	
	public HSB getBlue() {
		return getRGBTriplet().get(2);
	}
	
	public List<HSB> getRGBTriplet() {
		HSB red = HSBUtil.INSTANCE.init(ColorsFactory.eINSTANCE.createHSB(), 0.0f, 1.0f, 1.0f);
		HSB green = HSBUtil.INSTANCE.init(ColorsFactory.eINSTANCE.createHSB(), 120.0f, 0.5f, 1.0f);
		HSB blue = HSBUtil.INSTANCE.init(ColorsFactory.eINSTANCE.createHSB(), 240.0f, 1.0f, 0.5f);
		
		return Arrays.asList(new HSB[] { red, green, blue});
	}
	
	public Color getSWTColorFromHSB(HSB hsbColor) {
		org.eclipse.swt.graphics.RGB rgb = new org.eclipse.swt.graphics.RGB(
				hsbColor.getHue(), 
				hsbColor.getSaturation(), 
				hsbColor.getBrightness()
		);
		return new Color(Display.getDefault(), rgb);
	}
}
