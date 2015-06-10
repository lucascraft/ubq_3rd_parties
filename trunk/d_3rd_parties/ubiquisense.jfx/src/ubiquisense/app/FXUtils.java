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

package ubiquisense.app;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class FXUtils {
	public final static FXUtils INSTANCE = new FXUtils();
	
/*	public void initFXSequencer(final Sequencer sequencer, final Scene scene, final Group root) {
		final GFXContextMenu cm = new GFXContextMenu(root);
	} */
	
	public void drawFXGrid(Group root) {
		double w2 = 1000;
		double h2 = 1000;
	
		Float d	= new Float(50);
		double dx = 1000; //groovix.getOffset().x;
		double dy = 1000; // groovix.getOffset().y;
		
		for (double l=h2+dy; l>=0;l-=d) {
			Line line = new Line(0, l, 2000, l);
			line.setStroke(new Color(0.5d, 0.5d, 0.5d, 0.5d));
			root.getChildren().add(line);
		}
		
		for (double r=dy; r<=h2;r+=d) {
			double ny = r + 1000;
			Line line = new Line(0, ny, 2000, ny);
			line.setStroke(new Color(0.5d, 0.5d, 0.5d, 0.5d));
			root.getChildren().add(line);
		}
		
		for (double t=w2+dx; t>=0;t-=d) {
			Line line = new Line(t, 0, t, 2000);
			line.setStroke(new Color(0.5d, 0.5d, 0.5d, 0.5d));
			root.getChildren().add(line);
		}
		
		for (double b=dx; b<=w2;b+=d) {
			double nx = b + 1000;
			Line line = new Line(nx, 0, nx, 2000);
			line.setStroke(new Color(0.5d, 0.5d, 0.5d, 0.5d));
			root.getChildren().add(line);
		}
		
		Circle center = new Circle(
			root.getBoundsInLocal().getWidth()/2, 
			root.getBoundsInLocal().getHeight()/2, 
			25, 
			new Color(1d, 0d, 0d, 0.5d)
		);
		root.getChildren().add(center);
	}
}
