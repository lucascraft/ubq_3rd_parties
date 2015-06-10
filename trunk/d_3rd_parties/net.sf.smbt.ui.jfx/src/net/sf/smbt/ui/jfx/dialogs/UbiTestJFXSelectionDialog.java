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

package net.sf.smbt.ui.jfx.dialogs;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BlendMode;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;

import org.eclipse.swt.widgets.Display;

public class UbiTestJFXSelectionDialog extends UbiJFXSelectionDialog {

	public UbiTestJFXSelectionDialog() {
		super(Display.getDefault().getActiveShell(), "", "");
	}

	@Override
	public Scene createScene() {
		Group root = new Group();
		Scene scene = new Scene(root, 200, 350, Color.BLACK);
		
		Rectangle colors = new Rectangle(scene.getWidth(), scene.getHeight(), new LinearGradient(0f, 1f, 1f, 0f, true, CycleMethod.NO_CYCLE, new Stop[] { new Stop(0, Color.web("#f8bd55")), new Stop(0.14, Color.web("#c0fe56")), new Stop(0.28, Color.web("#5dfbc1")),
		new Stop(0.43, Color.web("#64c2f8")), new Stop(0.57, Color.web("#be4af7")), new Stop(0.71, Color.web("#ed5fc2")), new Stop(0.85, Color.web("#ef504c")), new Stop(1, Color.web("#f2660f")), }));

		Group blendModeGroup = new Group(colors);
		colors.setBlendMode(BlendMode.OVERLAY);
		root.getChildren().add(blendModeGroup);

		Button button = new Button("Hello FX");
		root.getChildren().add(button);
		return scene;
	}
}
