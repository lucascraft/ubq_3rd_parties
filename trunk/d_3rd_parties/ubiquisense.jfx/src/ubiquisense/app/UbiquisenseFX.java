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

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToolBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioSpectrumListener;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import jfxtras.labs.scene.control.gauge.ColorDef;
import jfxtras.labs.scene.control.gauge.Gauge;
import jfxtras.labs.scene.control.gauge.GaugeBuilder;
import jfxtras.labs.scene.control.gauge.LcdDesign;
import jfxtras.labs.scene.control.gauge.Marker;
import jfxtras.labs.scene.control.gauge.Section;
import jfxtras.labs.scene.control.gauge.SixteenSegment;
import jfxtras.labs.scene.control.gauge.SixteenSegmentBuilder;
import ubiquisense.utils.FXMediaUtils;

public class UbiquisenseFX extends Application {
		private ZoomPane	pane;
		private ToolBar 	toolBar;
		private Group 		topNode;
		private ScrollPane	scrollPane;
		private double		mouseX = 0;
		private double		mouseY = 0;
		
		@Override
		public void start(Stage primaryStage) throws Exception {
			Media media = FXMediaUtils.INSTANCE.getMedia("/ubiquisense/video/20051210-w50s.flv");
			
		     // Create the player and set to play automatically.
		     MediaPlayer mediaPlayer = new MediaPlayer(media);
		     mediaPlayer.setAutoPlay(true);
		     mediaPlayer.setCycleCount(Integer.MAX_VALUE);
		     
		     mediaPlayer.setAudioSpectrumListener(new AudioSpectrumListener() {
				@Override
				public void spectrumDataUpdate(double timestamp, double duration, float[] magnitudes, float[] phases) {
				}
			});

		    // Create the view and add it to the Scene.
		    MediaView mediaView = new MediaView(mediaPlayer);
		    mediaView.setFitWidth(320);
		    mediaView.setFitHeight(240);
		    mediaView.setLayoutX(500);
		    mediaView.setLayoutY(500);
		    
		    


		    GaugeBuilder builder = GaugeBuilder.create(GaugeBuilder.GaugeType.RADIAL);
		    
		    Gauge lcd = builder.frameDesign(Gauge.FrameDesign.STEEL)
                           .backgroundDesign(Gauge.BackgroundDesign.DARK_GRAY)
                           .lcdDesign(LcdDesign.STANDARD_GREEN)
                           .lcdDecimals(2)
                           .lcdValueFont(Gauge.LcdFont.LCD)
                           .pointerType(Gauge.PointerType.TYPE14)
                           .valueColor(ColorDef.RED)
                           .knobDesign(Gauge.KnobDesign.METAL)
                           .knobColor(Gauge.KnobColor.SILVER)
                           .sections(new Section[] {
                               new Section(0, 37, Color.LIME),
                               new Section(37, 60, Color.YELLOW),
                               new Section(60, 75, Color.ORANGE)})
                           .areas(new Section[] {new Section(75, 100, Color.RED)})
                           .areasVisible(true)
                           .markers(new Marker[] {
                               new Marker(30, Color.MAGENTA),
                               new Marker(75, Color.AQUAMARINE)})
                           .markersVisible(true)
                           .threshold(40)
                           .thresholdVisible(true)
                           .glowVisible(true)
                           .glowOn(true)
                           .trendVisible(true)
                           .trend(Gauge.Trend.UP)
                           .userLedVisible(true)
                           .bargraph(true)
                           .title("Temperature")
                           .unit("°C")
                           .build();

		    lcd.setLayoutX(750);
		    lcd.setLayoutY(750);
		    
		    
		    SixteenSegment sixteenSegments = SixteenSegmentBuilder.create()
		    		.plainColor(true)
		    		.color(Color.ALICEBLUE)
		    		.dotOn(true)
		    		.character("azerty")
		    		.build();
		    sixteenSegments.setLayoutX(400);
		    sixteenSegments.setLayoutY(400);

		    StackPane.setAlignment(mediaView, Pos.CENTER); 
		     
		    
		    
			topNode = new Group();
			FXUtils.INSTANCE.drawFXGrid(topNode);
			topNode.getChildren().add(mediaView);
			topNode.getChildren().add(lcd);

			pane = new ZoomPane(topNode);
			
			
			pane.setMaxSize(10000, 10000);
			pane.setMinSize(10000, 10000);
			pane.setManaged(false);
			
			scrollPane	= new ScrollPane();
			scrollPane.setPannable(true);
			scrollPane.setContent(pane);
			BorderPane bottomPane = new BorderPane();
			bottomPane.setId("background");

	        toolBar = new ToolBar();
	        bottomPane.setTop(toolBar);

	        Region spacer = new Region();
	        spacer.getStyleClass().setAll("spacer");

	        HBox buttonBar = new HBox();
	        buttonBar.getStyleClass().setAll("segmented-button-bar");
	        
	        Button circleButton		= new Button("Circle");
	        circleButton.getStyleClass().addAll("first");
	        Button segmentsButton	= new Button("Segment");
	        Button triggerButton	= new Button("Trigger");
	        Button cueButton		= new Button("Cue");
	        Button listenerButton	= new Button("Listener");
	        listenerButton.getStyleClass().addAll("last", "capsule");
	        
	        buttonBar.getChildren().addAll(circleButton, segmentsButton, triggerButton, cueButton, listenerButton);
	        toolBar.getItems().addAll(spacer, buttonBar);

			VBox box = new VBox();
			box.getChildren().add(bottomPane);
			box.getChildren().add(scrollPane);
			
			Scene scene = new Scene(box, 2500, 2500);
			scene.getStylesheets().add(getClass().getResource("/ubiquisense/css/segmented.css").toExternalForm());
			
			scrollPane.prefHeightProperty().bind(scene.widthProperty().subtract(toolBar.getHeight()));
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			scrollPane.setHvalue(0 /* scrollPane.getHmax() */);
			scrollPane.setVvalue(0 /* scrollPane.getVmax() */);
			scrollPane.setHmin(-5000);
			scrollPane.setVmin(-5000);
			scrollPane.setHmax(+5000);
			scrollPane.setVmax(+5000);

			pane.setOnMousePressed(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					System.out.println("jfx mouse pressed "+ event.getSceneX() + "," + event.getSceneY());

					mouseX = event.getSceneX();
					mouseY = event.getSceneY();
				}
			});
			pane.setOnMouseDragged(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					double x = event.getSceneX() - mouseX;
					double y = event.getSceneY() - mouseY;
					
					System.out.println("jfx mouse dragged "+ x + "," + y);
					
					pane.setTranslateX(x);
					pane.setTranslateY(y);
					
					mouseX = event.getSceneX();
					mouseY = event.getSceneY();
				}
			});
		}
		
		public static void main(String[] args) {
			launch(args);
		}
}
