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

package net.sf.smbt.ui.jfx.views;

import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.util.Duration;
import net.sf.smbt.ui.jfx.dialogs.UbiTestJFXSelectionDialog;
import at.bestsolution.efxclipse.runtime.workbench3.FXViewPart;

public class MyViewPart extends FXViewPart {
	Random randomizer;
	public MyViewPart() {
		randomizer = new Random();
	}
	@Override
	protected Scene createFxScene() {
		Group root = new Group();
		Scene scene = new Scene(root, 800, 600, Color.BLACK);
		
		Rectangle colors = new Rectangle(scene.getWidth(), scene.getHeight(), new LinearGradient(0f, 1f, 1f, 0f, true, CycleMethod.NO_CYCLE, new Stop[] { new Stop(0, Color.web("#f8bd55")), new Stop(0.14, Color.web("#c0fe56")), new Stop(0.28, Color.web("#5dfbc1")),
		new Stop(0.43, Color.web("#64c2f8")), new Stop(0.57, Color.web("#be4af7")), new Stop(0.71, Color.web("#ed5fc2")), new Stop(0.85, Color.web("#ef504c")), new Stop(1, Color.web("#f2660f")), }));

		Group circles = new Group();
		for (int i = 0; i < 30; i++) {
		Circle circle = new Circle(150, Color.web("white", 0.05));
		circle.setStrokeType(StrokeType.OUTSIDE);
		circle.setStroke(Color.web("white", 0.16));
		circle.setStrokeWidth(4);
		circles.getChildren().add(circle);
		}
		circles.setEffect(new BoxBlur(10, 10, 3));

		Group blendModeGroup = new Group(new Group(new Rectangle(scene.getWidth(), scene.getHeight(), Color.BLACK), circles), colors);
		colors.setBlendMode(BlendMode.OVERLAY);
		root.getChildren().add(blendModeGroup);

		Timeline timeline = new Timeline();
		for (Node circle : circles.getChildren()) {
		timeline.getKeyFrames().addAll(new KeyFrame(Duration.ZERO, // set
		// start
		// position
		// at 0
		new KeyValue(circle.translateXProperty(), randomizer.nextFloat() * 800), new KeyValue(circle.translateYProperty(), randomizer.nextFloat() * 600)), new KeyFrame(new Duration(Duration.INDEFINITE.toMillis()), // set
		// end
		// position
		// at
		// 40s
		new KeyValue(circle.translateXProperty(), randomizer.nextFloat() * 800), new KeyValue(circle.translateYProperty(), randomizer.nextFloat() * 600)));
		}
		// play 40s of animation
		timeline.play();
		
		final Button button = new Button("Hello FX");
		button.addEventHandler(MouseEvent.MOUSE_CLICKED, 
			new javafx.event.EventHandler<MouseEvent>() {
			    @Override public void handle(MouseEvent e) {
			        UbiTestJFXSelectionDialog dlg = new UbiTestJFXSelectionDialog();
			        dlg.open();
			    }
			}
		);	
		button.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
		
		root.getChildren().add(button);
		
	
		return scene;
	}

	@Override
	protected void setFxFocus() {
		
	}
}