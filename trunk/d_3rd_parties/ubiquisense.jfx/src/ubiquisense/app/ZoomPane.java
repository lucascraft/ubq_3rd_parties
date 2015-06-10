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

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class ZoomPane extends BorderPane {
	private ZoomController zoomController;
	private Group contentWrapper;
	
	private double translateXWhenMousePressed, translateYWhenMousePressed;
	private double xWhenMousePressed , yWhenMousePressed;
	
	private static class ZoomController {
		private int deltaCount = 0;
		private final double DEFAULT_ZOOM = 1.0;
		private boolean useAnimation = true;
		
		private DoubleProperty zoomMax   = new SimpleDoubleProperty(10.0);
		private DoubleProperty zoomMin   = new SimpleDoubleProperty(0.1);
		private DoubleProperty zoomDelta = new SimpleDoubleProperty(1.2);
		private DoubleProperty zoom      = new SimpleDoubleProperty( DEFAULT_ZOOM );
		
		public ZoomController() {}
		
		public void zoomIn() {
			double zoomValue = DEFAULT_ZOOM * Math.pow(zoomDelta.get(), deltaCount+1);
			if( zoomValue > zoomMax.get() ) {
				setZoom(zoomMax.get());
				return;
			}
			
			deltaCount++;
			setZoom( zoomValue );
		}
		
		public void zoomOut() {
			double zoomValue = DEFAULT_ZOOM * Math.pow(zoomDelta.get(), deltaCount-1);
			if( zoomValue < zoomMin.get() ) {
				setZoom(zoomMin.get());
				return;
			}
			
			deltaCount--;
			setZoom( zoomValue );
		}
		
		public void setZoom( double zoomValue ) {
			if( useAnimation ) {
				Timeline zoomTimeline = new Timeline();
				zoomTimeline.getKeyFrames().add(
					new KeyFrame(Duration.millis(300), new KeyValue(zoom, zoomValue))
				);
				zoomTimeline.play();
			} else {
				zoom.set(zoomValue);
			}
		}
	}
	
	public ZoomPane(Node content) {
		super();
		
		Rectangle clip = new Rectangle();
		clip.widthProperty().bind(widthProperty());
		clip.heightProperty().bind(heightProperty());
		
		// to adjust layoutBounds when drawingPane's scale changes
		contentWrapper = new Group(content);		
		StackPane.setAlignment(contentWrapper, Pos.CENTER);
		getChildren().add(contentWrapper);
		
		zoomController = new ZoomController();
		
		content.scaleXProperty().bind(zoomController.zoom);
		content.scaleYProperty().bind(zoomController.zoom);
		content.translateXProperty();
		
		hookEvents();
		
		setClip(clip);
	}
	
	private void hookEvents() {
		setOnScroll(new EventHandler<ScrollEvent>() {
			public void handle(ScrollEvent event) {
				if( event.getDeltaY() > 0 ) {
					zoomController.zoomIn();
				} else {
					zoomController.zoomOut();
				}
			}
		});
		
		setOnMousePressed(new EventHandler<MouseEvent>(){
			public void handle(MouseEvent event) {
				if( !event.isMiddleButtonDown() ) return ;
				
				translateXWhenMousePressed = contentWrapper.getTranslateX();
				translateYWhenMousePressed = contentWrapper.getTranslateY();
				
				xWhenMousePressed = event.getX();
				yWhenMousePressed = event.getY();
				
				setCursor(Cursor.MOVE);
				
				event.consume();
			}
		});
		
		setOnMouseReleased(new EventHandler<MouseEvent>(){
			public void handle(MouseEvent event) {
				setCursor(Cursor.DEFAULT);
			}
		});
		
		setOnMouseDragged(new EventHandler<MouseEvent>(){
			public void handle(MouseEvent event) {
				if(!event.isMiddleButtonDown())
					return;
				
				double x = translateXWhenMousePressed +  event.getX() - xWhenMousePressed;
				double y = translateYWhenMousePressed +  event.getY() - yWhenMousePressed;
				
				
				if (event.getButton() == MouseButton.SECONDARY) {
					/*
					Transform xRot = new Rotate(-40, 300, 150, 0, Rotate.X_AXIS); 
					Transform yRot = new Rotate(-5, 300, 150, 0, Rotate.Y_AXIS); 
					Transform zRot = new Rotate(-6, 300, 150, 0, Rotate.Z_AXIS); 
					
					contentWrapper.getTransforms().addAll(xRot, yRot, zRot);
					
					for (Transform t : contentWrapper.getTransforms()) {
						// t.
					}
					Point3D pt3d = new Point3D(
						x / contentWrapper.getBoundsInLocal().getWidth(), 
						y / contentWrapper.getBoundsInLocal().getWidth(), 
						1d
					);
					contentWrapper.setRotationAxis(pt3d);
					*/
				} else if (event.isPrimaryButtonDown()) {
					contentWrapper.setTranslateX( x );
					contentWrapper.setTranslateY( y );
				}
				event.consume();
			}
		});
	}

}
