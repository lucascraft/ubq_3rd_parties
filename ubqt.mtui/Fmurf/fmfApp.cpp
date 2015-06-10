/*
 *  fmfApp.cpp 
 *
 *  openFrameworks
 *
 *  Created by lucas bigeardel on 16/02/10.
 *  Copyright Lucas Bigeardel 2010. All rights reserved.
 *  This file is part of Fmurf.
 *
 *  Fmurf is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Fmurf is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Fmurf.  If not, see <http://www.gnu.org/licenses/>
 *
 */

#include "stdio.h"
#include "Poco/Delegate.h"
#include "Poco/Timestamp.h"
//#include "swave.h"
#include "smuon.h"
#include "smurfbrain.h"
#include "smurfloor.h"
#include "fmfApp.h"

//#include "Particle.h"
//#include "MSAUtils.h"
//#include "ParticleSystem.h"
#include "Vector.h"




#pragma mark Custom methods

/*
void fadeToColor(float r, float g, float b, float speed) {
	glEnable(GL_BLEND);
    glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    glColor4f(r, g, b, speed);
    glBegin(GL_QUADS);
    glVertex2f(0, 0);
    glVertex2f(myApp->window.width, 0);
    glVertex2f(myApp->window.width, myApp->window.height);
    glVertex2f(0, myApp->window.height);
    glEnd();
}


// add force and dye to fluid, and create particles
void fmfApp::addToFluid(float posX, float posY, float velX, float velY, bool addColor, bool addForce ) {
    float speed = velX * velX  + velY * velY * getWindowAspectRatio() * getWindowAspectRatio();    // balance the x and y components of speed with the screen aspect ratio
    if(speed > 0) {
		posX = constrain(posX, -0.25f, 1.0f);
		posY = constrain(posY, -0.25f, 1.0f);
		
        const float colorMult = 100;
        const float velocityMult = 100;
		
        int index = fluidSolver.getIndexForPos(Vec2f(posX, posY));
		
		if(addColor) {
			Color drawColor( CM_HSV, ( getElapsedFrames() % 360 ) / 360.0f, 0.9f, 0.9f );
			
			fluidSolver.addColorAtIndex(index, drawColor * colorMult);
			
			if( drawParticles )
				particleSystem.addParticles( Vec2f(posX, posY) * Vec2f( getWindowSize() ), 10 );
		}
		
		if(addForce)
			fluidSolver.addForceAtIndex(index, Vec2f(velX, velY) * velocityMult);
		
    }
}
*/


#pragma mark App callbacks



//--------------------------------------------------------------
void fmfApp::setup(){
	
	ofEnableSmoothing(); 
	
	smurfFloor	= new Smurfloor(60, 5);
	smurfCfg	= new SmurfCfg();
	sender		= new ofxOscSender();
	receiver	= new ofxOscReceiver();
	synthUtils	= new FMFUtils();
	tuio		= new myTuioClient();
	
//	font = new ofTrueTypeFont();
//	font->loadFont("ARCADE_R.ttf", 16);


	ofAddListener(tuio->objectAdded,smurfFloor->brain,&SmurfBrain::objectAdded);
	ofAddListener(tuio->objectRemoved,smurfFloor->brain,&SmurfBrain::objectRemoved);
	ofAddListener(tuio->objectUpdated,smurfFloor->brain,&SmurfBrain::objectUpdated);
	ofAddListener(tuio->cursorAdded,smurfFloor->brain,&SmurfBrain::tuioAdded);
	ofAddListener(tuio->cursorRemoved,smurfFloor->brain,&SmurfBrain::tuioRemoved);
	ofAddListener(tuio->cursorUpdated,smurfFloor->brain,&SmurfBrain::tuioUpdated);
		
	tuio->start(smurfCfg->getTuioPort());
	
	// Init GUI
//	fluidSolver.setDeltaT(FLUID_DEFAULT_DT);
	
//	gui.addSlider("fluidCellsX", fluidCellsX, 20, 400);
//	gui.addButton("resizeFluid", resizeFluid);
//	gui.addSlider("fs.viscocity", fluidSolver.viscocity, 0.0, 0.0001f, 0.5); 
//	gui.addSlider("fs.colorDiffusion", fluidSolver.colorDiffusion, 0.0, 0.1, 0.5); 
//	gui.addSlider("fs.fadeSpeed", fluidSolver.fadeSpeed, 0.0, .03, 0.5); 
//	gui.addSlider("fs.solverIterations", fluidSolver.solverIterations, 1, 20); 
//	gui.addSlider("fd.drawMode", fluidDrawer.drawMode, 0, FLUID_DRAW_MODE_COUNT-1); 
//	gui.addToggle("fs.doRGB", fluidSolver.doRGB); 
//	gui.addToggle("fs.doVorticityConfinement", fluidSolver.doVorticityConfinement); 
//	gui.addToggle("drawFluid", drawFluid); 
//	gui.addToggle("drawParticles", drawParticles); 
//	gui.addToggle("renderUsingVA", renderUsingVA); 
//	gui.addToggle("fs.wrapX", fluidSolver.wrap_x); 
//	gui.addToggle("fs.wrapY", fluidSolver.wrap_y); 
//	gui.setAutoSave(true);
//	gui.loadFromXML();	
	
	
	ofSetLogLevel(OF_LOG_VERBOSE);
	
	ofBackground(0x0A, 0x64, 0xA4);

	ofSetVerticalSync(false);
	
	windowResized(ofGetWidth(), ofGetHeight());		// force this at start (cos I don't think it is called)
	
	
	
	//---------------------------------------------------
	
	sender->setup(
		smurfCfg->getOscSendAddress(), 
		smurfCfg->getOscSendPort()
	);
	receiver->setup(
		smurfCfg->getOscReceivePort()
	);
	
	// Use config file at some point here
	// BPM is set to 60
	smurfFloor->setOscSender(sender);
	smurfFloor->setOscReceiver(receiver);
	smurfFloor->setSmurfCfg(smurfCfg);

	//smurfFloor->brain->loadGestures();
	
	
	// create a DAC
	DAC = synthUtils->createDAC(-440.0);
	
	smurfFloor->brain->getSmurfs()->push_back(DAC);
}

void fmfApp::handleAnchorsUpdate(SConnection *_connection) {
	if (_connection == NULL) return;
	
	if (_connection->fromAnchor() != NULL && _connection->toAnchor() != NULL) {
		
		SmurfAnchor *fromAnchor = _connection->fromAnchor();
		
		if (fromAnchor == NULL) return;
		
		float fSid = fromAnchor->getOwnerSid();
		
		if (fSid == -FLT_MAX) return;
	
		Smurf *from = smurfFloor->brain->findSmurf(fSid);
		
		if (from == NULL || from->getTuio() == NULL) return;
		
		ofxTuioPoint *fromPt = new ofxTuioPoint(
			from->getTuio()->getPosition().getX(), 
			from->getTuio()->getPosition().getY()
		);
		
		
		SmurfAnchor *toAnchor = _connection->toAnchor();
		
		if (toAnchor == NULL) return;

		float tSid = toAnchor->getOwnerSid();
		
		if (tSid == -FLT_MAX) return;
		
		Smurf *to = smurfFloor->brain->findSmurf(tSid);

		if (to == NULL || to->getTuio() == NULL) return;

		ofxTuioPoint *toPt = new ofxTuioPoint(
			to->getTuio()->getPosition().getX(),
			to->getTuio()->getPosition().getY()
		);
		

		float angle = PI-fromPt->getAngle(toPt);
	
		((ofxTuioObject*)fromAnchor->getTuio())->update(
			fromPt->getX()+cosf(angle)*((from->getRadius()+1)/ofGetWidth()), 
			fromPt->getY()+sinf(angle)*((from->getRadius()+1)/ofGetHeight()), 
			((ofxTuioObject*)fromAnchor->getTuio())->getAngle(), 
			fromAnchor->getTuio()->getXSpeed(), 
			fromAnchor->getTuio()->getYSpeed(), 
			0.0f, 
			fromAnchor->getTuio()->getMotionSpeed(), 
			fromAnchor->getTuio()->getMotionAccel()
		);
	
		((ofxTuioObject*)toAnchor->getTuio())->update(
			toPt->getX()-cosf(angle)*((to->getRadius()+1)/ofGetWidth()), 
			toPt->getY()-sinf(angle)*((to->getRadius()+1)/ofGetHeight()), 
			((ofxTuioObject*)toAnchor->getTuio())->getAngle(), 
			toAnchor->getTuio()->getXSpeed(), 
			toAnchor->getTuio()->getYSpeed(), 
			0.0f, 
			toAnchor->getTuio()->getMotionSpeed(), 
			toAnchor->getTuio()->getMotionAccel()
		);
	
		delete fromPt;
		delete toPt;
	}
}

//--------------------------------------------------------------
void fmfApp::update(){
	ofBackground(0x0A, 0x64, 0xA4);
	
	smurfFloor->think();

	tuio->getMessage();
	
	///------------------------------------------------------
	
	windowResized(ofGetWidth(), ofGetHeight());		// force this at start (cos I don't think it is called)
	
	for (int i=0; i<smurfFloor->brain->getConnections()->size(); i++ ) {
		SConnection *connection = smurfFloor->brain->getConnections()->at(i);
		if (connection != NULL) {
			handleAnchorsUpdate(connection);
		}
	}

/*
	for (int i=0; i<smurfFloor->waves->size(); i++ ) {
		SWave* w = smurfFloor->waves->at(i);
			
		if (w->getFid() != -1) {
			for (float cc=0.0;cc<15.0;cc++) {
				float vx = ofRandom(-tuioStationaryForce, tuioStationaryForce);
				float vy = ofRandom(-tuioStationaryForce, tuioStationaryForce);
			
				float x = (w->getX() + cosf(ofDegToRad(cc*24.0))*w->getRadius())/ofGetWidth();
				float y = (w->getY() + sinf(ofDegToRad(cc*24.0))*w->getRadius())/ofGetHeight();
			
				if (w->getRadius() < 20 ) {
					addToFluid(
						   x,
						   y,
						   0.003,
						   0.003,
						   true
						   );
				
				}
			}
			
		}


		Smurf *s = smurfFloor->brain->findSmurf(w->getFid());
		if (s != NULL && ((ofxTuioObject*)s)->getFiducialId() != -440 && w->getRadius() > DAC->getTuio()->getPosition().getDistance(&s->getTuio()->getPosition())) {
			if (w->getFid() != ((ofxTuioObject*)s)->getFiducialId()) {
			    addToFluid(
					s->getTuio()->getX()*ofGetWidth(),
					s->getTuio()->getY()*ofGetHeight(),
					0.003,
					0.003,
					true
				);			
			}
		}
	}
		
*/
	//fluidSolver.update();
	
	// save old mouse position (openFrameworks doesn't do this automatically like processing does)
	//pmouseX = mouseX;
	//pmouseY = mouseY;
	
}

//--------------------------------------------------------------
void fmfApp::draw(){
	ofNoFill();

//	
//	//-------------------------------
//
	

	ofSetBackgroundAuto(true);

		
	drawWaves();
	drawConnections();
	drawSmurfs();
	//drawWindows();
	drawFingers();
		
//	gui.draw();
	
	if (smurfFloor->isVerbose()) {
		ofPushMatrix();
		ofSetColor(255, 255, 255);
		
		ofDrawBitmapString(
						   "BPM     : " + 
						   ofToString((int)smurfFloor->getBPM()), 
						   15, 45
		);

		ofDrawBitmapString(
						   "OSC out : " + 
						   smurfCfg->getOscSendAddress() + 
						   ":" + 
						   ofToString((int)smurfCfg->getOscSendPort()),
						   15, 60
		);
		
		ofDrawBitmapString(
						   "OSC in  : " + 
						   ofToString((int)smurfCfg->getOscReceivePort()), 
						   15, 75
		);
		
		ofDrawBitmapString(
						   "TUIO    : " + 
						   ofToString((int)smurfCfg->getTuioPort()), 
						   15, 90
		);
		
//		ofDrawBitmapString("      q : quicken the beat", 15, 105);
//		ofDrawBitmapString("      s : slow down the beat", 15, 120);
		ofDrawBitmapString("      f : toggle fullscreen", 15, 135);
//		ofDrawBitmapString("  space : ui menu", 15, 150);
		ofDrawBitmapString("    esc : quit", 15, 165);
		
#ifdef TARGET_OS_MAC
//		string gestMode = smurfFloor->isGesture()?"ON":"OFF";
//		ofDrawBitmapString("      g : toggle gesture mode (" + gestMode + ")", 15, 180);
#endif
		ofDrawBitmapString("      h : toggle this help menu", 15, 195);

		string connMode = smurfFloor->isConnectionModeOn()?"ON":"OFF";
		ofDrawBitmapString("      c : toggle connections mode(" + connMode + ")", 15, 210);
//		ofDrawBitmapString("      x : quicken the wave", 15, 225);
//		ofDrawBitmapString("      w : slow down the wave", 15, 240);

#ifdef TARGET_OS_MAC
//		ofDrawBitmapString("Gesture : " + smurfFloor->brain->getGestures()->getLatestGestureLabel(), 15, 255);
#endif
		
//		float fps = ofGetFrameRate();
//		
//		ofDrawBitmapString("FPS : " + (int)fps, 5, 65);

		ofPopMatrix();

	}
}


void fmfApp::windowResized(int w, int h) {
	window.width		= w;
	window.height		= h;	
	window.invHeight	= 1.0f/h;
	window.aspectRatio	= w * window.invHeight;
	window.aspectRatio2 = window.aspectRatio * window.aspectRatio;	
}

//--------------------------------------------------------------


void fmfApp::smurfCollisionComputation(SWave *wave) {
}

//
//--------------------------------------------------------------
//
void fmfApp::drawWaves() {
	vector<SWave*> *tmpWaves = new vector<SWave *>();
	for (int i=0; i<smurfFloor->waves->size(); i++ ) {
		SWave* w = smurfFloor->waves->at(i);
	
		w->setRadius(w->getRadius()+smurfFloor->getBPM()/40+smurfFloor->getWaveSpeed()/5);
	
		if (w->getFid() == -1) {
			w->draw();		
		}
		
		if (w->getRadius() > w->getRange()) {
			smurfFloor->waves->erase(smurfFloor->waves->begin()+i);
		} else {
			for (int i=0; i<smurfFloor->brain->getSmurfs()->size(); i++ ) {
				Smurf* s = smurfFloor->brain->getSmurfs()->at(i);
				if (s != NULL) {
					ofxTuioObject *blob = (ofxTuioObject*) s->getTuio();
				
					if (dynamic_cast<SmurfAnchor*>(s) == NULL) {

						float dist = ofDist(blob->getX()*ofGetWidth(), blob->getY()*ofGetHeight(), w->getX(), w->getY());
						if (w->getFid() != blob->getFiducialId() && dist  < w->getRadius()) {
							if (s->getLastWaveUid() < w->getUid()) {
								s->setLastWaveUid(w->getUid());
												
								int id = smurfFloor->getNextWaveUid();
							
								s->onBeat(sender, w);
								//if (blob->getFiducialId()==-440) {
									tmpWaves->push_back(
										new SWave(
											blob->getFiducialId(), // emmiter
											id, // uid
										    blob->getX()*ofGetWidth(), // x pos
										    blob->getY()*ofGetHeight(), // y pos
											w->getFid()==-1?1500:25
									    )
								    );
								//}
							}
						}
					}
				}
			}
		}
	}	
	for (int i=0; i<tmpWaves->size(); i++ ) {
		smurfFloor->waves->push_back(tmpWaves->at(i));
	}
	delete tmpWaves;
}

/*
void fmfApp::drawWindows() {
	for (int i=0; i<smurfFloor->brain->getUIManager()->getWindows()->size(); i++ ) {
		SWindow *w = smurfFloor->brain->getUIManager()->getWindows()->at(i);
		if (w != NULL) {
			w->draw(font);
		}
	}	
}
*/

void fmfApp::drawSmurfs() {
	for (int i=0; i<smurfFloor->brain->getSmurfs()->size(); i++ ) {
		Smurf *smurf = smurfFloor->brain->getSmurfs()->at(i);
/*		if(smurf->tic() == 1 && smurf->getKind() != SMURF_KIND_ANCHOR && smurf->getKind() != SMURF_KIND_HANDLE) {
			smurf->onTic(smurfFloor->brain->getOscSender());
		} */
		if (dynamic_cast<SmurfAnchor*>(smurf) != NULL) {
			//smurf->draw();
		} else {
			smurf->draw(/*font*/);
		}
	}	
}

void fmfApp::drawConnections() {
	vector<SConnection*> *connections = smurfFloor->brain->getConnections();
	for (vector<SConnection*>::iterator it=connections->begin();it != connections->end(); it++) {
		SConnection *connection = *it;
		Smurf * from = smurfFloor->brain->findSmurf(connection->fromSID());
		Smurf * to = smurfFloor->brain->findSmurf(connection->toSID());
		if (from != NULL && to != NULL) {
			if (from->getTuio() != NULL && to->getTuio() != NULL) {
				if (from->getLiveData() != NULL) {
					connection->draw(from->getLiveData());
				}
			}
		}
	}	
}

void fmfApp::drawFingers() {
	for (int i=0; i<smurfFloor->brain->getFingers()->size(); i++ ) {
		SmurFinger* f = smurfFloor->brain->getFingers()->at(i);
		ofxTuioCursor *blob = (ofxTuioCursor *) f->getTuio();
		
		ofPushMatrix();
			ofSetColor(0x35, 0xD6, 0x99, 125);
			ofFill();

			ofEllipse(
				blob->getX()*ofGetWidth(), 
				blob->getY()*ofGetHeight(), 
				10.0, 
				10.0
			);
		
//			ofSetLineWidth(3);
//
//			ofStyle oldStyle = ofGetStyle();
//		
//			ofStyle ofStyla = ofStyle();
//			ofStyla.lineWidth			= 3.0;
//			ofStyla.circleResolution	= 500;
//			ofStyla.smoothing			= true;
//			ofStyla.blending			= true;
//		
//			ofSetStyle(ofStyla);
//		
//		
//		
//		
//		
//		
//		
//			delete &ofStyla;
//		
//			ofSetStyle(oldStyle);
		
//			if (smurfFloor->isGesture()) {
//				for (int j=0; j<f->getPoints()->size(); j++) {
//					ofxTuioPoint pt = f->getPoints()->at(j);
//					ofRect(pt.getX()*ofGetWidth()-1, pt.getY()*ofGetHeight()-1, 2, 2);
//				}
//			}
		ofPopMatrix();
	}	
}



//--------------------------------------------------------------


#pragma mark Input callbacks

//--------------------------------------------------------------
void fmfApp::keyPressed  (int key){ 
    switch(key) {
//		case ' ':
//			gui.toggleDraw();	
//			glClear(GL_COLOR_BUFFER_BIT);
//			break;			
		case 'f':
			ofToggleFullscreen();
			break;
		case 'p':
			static char fileNameStr[255];
			sprintf(fileNameStr, "output_%0.4i.png", ofGetFrameNum());
			static ofImage imgScreen;
			imgScreen.grabScreen(0, 0, ofGetWidth(), ofGetHeight());
			printf("Saving file: %s\n", fileNameStr);
			imgScreen.saveImage(fileNameStr);
			break;
//		case 'q':
//			if (smurfFloor->getBPM() <= 295) {
//				// really quicken the beat
//				// In my case just got the griffin knob linked to this
//				smurfFloor->setBPM(smurfFloor->getBPM()+5);
//			}
//			break;
//		case 's':
//			if (smurfFloor->getBPM() > 5 ) {
//				// really slow down the beat
//				// In my case just got the griffin knob linked to this
//				smurfFloor->setBPM(smurfFloor->getBPM()-5);
//			}
//			break;
		case 'a':
			if (smurfFloor->getBPM() <= 299) {
				// quicken the beat
				// In my case just got the griffin knob linked to this
				smurfFloor->setBPM(smurfFloor->getBPM()+1);
			}
			break;
		case 'z':
			if (smurfFloor->getBPM() > 1) {
				// slow down the beat
				// In my case just got the griffin knob linked to this
				smurfFloor->setBPM(smurfFloor->getBPM()-1);
			}
			break;
		case 'h': // help
			smurfFloor->setVerbose(smurfFloor->isVerbose()?false:true);
			break;
#ifdef TARGET_OS_MAC
//		case 'g': // gesture
//			smurfFloor->toggleGesture();
//			break;
#endif
		case 'c': // gesture
			smurfFloor->toggleConnectionMode();
			break;
//		case 'w': // wave
//			if (smurfFloor->getWaveSpeed() > 1) {
//				smurfFloor->setWaveSpeed(smurfFloor->getWaveSpeed()-1);
//			}
//			break;
//		case 'x': // wave
//			if (smurfFloor->getWaveSpeed() <= 20) {
//				smurfFloor->setWaveSpeed(smurfFloor->getWaveSpeed()+1);
//			}
//			break;
    }
}

//--------------------------------------------------------------
void fmfApp::keyReleased(int key){

}

//--------------------------------------------------------------
void fmfApp::mouseMoved(int x, int y ){
//	  float mouseNormX = x * window.invWidth;
//    float mouseNormY = y * window.invHeight;
//    float mouseVelX = (x - pmouseX) * window.invWidth;
//    float mouseVelY = (y - pmouseY) * window.invHeight;
}

void fmfApp::mouseDragged(int x, int y, int button) {
//	  float mouseNormX = x * window.invWidth;
//    float mouseNormY = y * window.invHeight;
//    float mouseVelX = (x - pmouseX) * window.invWidth;
//    float mouseVelY = (y - pmouseY) * window.invHeight;
}

//--------------------------------------------------------------
void fmfApp::mousePressed(int x, int y, int button){

}

//--------------------------------------------------------------
void fmfApp::mouseReleased(int x, int y, int button){

}



