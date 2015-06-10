/*
 *  fmftypes.h
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

#ifndef _FMF_TYPES
#define _FMF_TYPES

#include "smurf.h"

class FMFOscillator : public Smurf {
public:
	FMFOscillator(ofxTuioObject *_tuioObj, SmurfKind _kind) : Smurf(_tuioObj, kind) {
		setNature("OSCILLATOR");
	}
	
	void draw() {
		Smurf::draw();
	}
};

class FMFSqrOsc : public FMFOscillator {
public:
	FMFSqrOsc(ofxTuioObject *_tuioObj, SmurfKind _kind) : FMFOscillator(_tuioObj, kind) {
		setNature("SQR_OSC");
	}
	
	void draw() {
		FMFOscillator::draw();
	}
};

class FMFSinOsc : public FMFOscillator {
public:
	FMFSinOsc(ofxTuioObject *_tuioObj, SmurfKind _kind) : FMFOscillator(_tuioObj, kind) {
		setNature("SIN_OSC");
	}
	
	void draw() {
		FMFOscillator::draw();
	}
};

class FMFTriangleOsc : public FMFOscillator {
public:
	FMFTriangleOsc(ofxTuioObject *_tuioObj, SmurfKind _kind) : FMFOscillator(_tuioObj, kind) {
		setNature("TRIANGLE_OSC");
	}
	
	void draw() {
		FMFOscillator::draw();
	}
};

class FMFSawtoothOsc : public FMFOscillator {
public:
	FMFSawtoothOsc(ofxTuioObject *_tuioObj, SmurfKind _kind) : FMFOscillator(_tuioObj, kind) {
		setNature("SAWTOOTH_OSC");
	}
	
	void draw() {
		FMFOscillator::draw();
	}
};

class FMFPulseOsc : public FMFOscillator {
public:
	FMFPulseOsc(ofxTuioObject *_tuioObj, SmurfKind _kind) : FMFOscillator(_tuioObj, kind) {
		setNature("PULSE_OSC");
	}
	
	void draw() {
		FMFOscillator::draw();
	}
};


class FMFPhasor : public Smurf {
public:
	FMFPhasor(ofxTuioObject *_tuioObj, SmurfKind _kind) : Smurf(_tuioObj, kind) {
		setNature("PHASOR");
	}	

	void draw() {
		Smurf::draw();
	}
};

class FMFAdd : public Smurf {
public:
	FMFAdd(ofxTuioObject *_tuioObj, SmurfKind _kind) : Smurf(_tuioObj, kind) {
		setNature("ADD");
	}	
	
	void draw() {
		Smurf::draw();
	}
};

class FMFMultiply : public Smurf {
public:
	FMFMultiply(ofxTuioObject *_tuioObj, SmurfKind _kind) : Smurf(_tuioObj, kind) {
		setNature("MULTIPLY");
	}	
	
	void draw() {
		Smurf::draw();
	}
};

class FMFDac : public Smurf {
public:
	FMFDac(ofxTuioObject *_tuioObj, SmurfKind _kind) : Smurf(_tuioObj, kind) {
		setNature("DAC");
	}	
	
	void draw() {
		Smurf::draw();
	}
};

class FMFSequencer : public Smurf {
public:
	FMFSequencer(ofxTuioObject *_tuioObj, SmurfKind _kind) : Smurf(_tuioObj, kind) {
		ofxOscMessage *msg0 = new ofxOscMessage();
		msg0->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/0");
		msg0->addIntArg(0);
		msg0->addFloatArg(_tuioObj->getX());
		msg0->addFloatArg(_tuioObj->getY());
		msg0->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_A, TOGGLE, SLOT_VISUAL_BOX, msg0);
		
		ofxOscMessage *msg1 = new ofxOscMessage();
		msg1->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/1");
		msg1->addIntArg(1);
		msg1->addFloatArg(_tuioObj->getX());
		msg1->addFloatArg(_tuioObj->getY());
		msg1->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_B, TOGGLE, SLOT_VISUAL_BOX, msg1);
		
		ofxOscMessage *msg2 = new ofxOscMessage();
		msg2->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/2");
		msg2->addIntArg(2);
		msg2->addFloatArg(_tuioObj->getX());
		msg2->addFloatArg(_tuioObj->getY());
		msg2->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_C, TOGGLE, SLOT_VISUAL_BOX, msg2);
		
		ofxOscMessage *msg3 = new ofxOscMessage();
		msg3->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/3");
		msg3->addIntArg(3);
		msg3->addFloatArg(_tuioObj->getX());
		msg3->addFloatArg(_tuioObj->getY());
		msg3->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_D, TOGGLE, SLOT_VISUAL_BOX, msg3);
		
		ofxOscMessage *msg4 = new ofxOscMessage();
		msg4->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/4");
		msg4->addIntArg(4);
		msg4->addFloatArg(_tuioObj->getX());
		msg4->addFloatArg(_tuioObj->getY());
		msg4->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_E, TOGGLE, SLOT_VISUAL_BOX, msg4);
		
		ofxOscMessage *msg5 = new ofxOscMessage();
		msg5->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/5");
		msg5->addIntArg(5);
		msg5->addFloatArg(_tuioObj->getX());
		msg5->addFloatArg(_tuioObj->getY());
		msg5->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_F, TOGGLE, SLOT_VISUAL_BOX, msg5);
		
		ofxOscMessage *msg6 = new ofxOscMessage();
		msg6->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/6");
		msg6->addIntArg(6);
		msg6->addFloatArg(_tuioObj->getX());
		msg6->addFloatArg(_tuioObj->getY());
		msg6->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_G, TOGGLE, SLOT_VISUAL_BOX, msg6);
		
		ofxOscMessage *msg7 = new ofxOscMessage();
		msg7->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/7");
		msg7->addIntArg(7);
		msg7->addFloatArg(_tuioObj->getX());
		msg7->addFloatArg(_tuioObj->getY());
		msg7->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_H, TOGGLE, SLOT_VISUAL_BOX, msg7);
		
		ofxOscMessage *msg8 = new ofxOscMessage();
		msg8->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/8");
		msg8->addIntArg(8);
		msg8->addFloatArg(_tuioObj->getX());
		msg8->addFloatArg(_tuioObj->getY());
		msg8->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_I, TOGGLE, SLOT_VISUAL_BOX, msg8);
		
		ofxOscMessage *msg9 = new ofxOscMessage();
		msg9->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/9");
		msg9->addIntArg(9);
		msg9->addFloatArg(_tuioObj->getX());
		msg9->addFloatArg(_tuioObj->getY());
		msg9->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_J, TOGGLE, SLOT_VISUAL_BOX, msg9);
		
		ofxOscMessage *msg10 = new ofxOscMessage();
		msg10->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/10");
		msg10->addIntArg(10);
		msg10->addFloatArg(_tuioObj->getX());
		msg10->addFloatArg(_tuioObj->getY());
		msg10->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_K, TOGGLE, SLOT_VISUAL_BOX, msg10);
		
		ofxOscMessage *msg11 = new ofxOscMessage();
		msg11->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/11");
		msg11->addIntArg(11);
		msg11->addFloatArg(_tuioObj->getX());
		msg11->addFloatArg(_tuioObj->getY());
		msg11->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_L, TOGGLE, SLOT_VISUAL_BOX, msg11);
		
		ofxOscMessage *msg12 = new ofxOscMessage();
		msg12->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/12");
		msg12->addIntArg(12);
		msg12->addFloatArg(_tuioObj->getX());
		msg12->addFloatArg(_tuioObj->getY());
		msg12->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_M, TOGGLE, SLOT_VISUAL_BOX, msg12);
		
		ofxOscMessage *msg13 = new ofxOscMessage();
		msg13->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/13");
		msg13->addIntArg(13);
		msg13->addFloatArg(_tuioObj->getX());
		msg13->addFloatArg(_tuioObj->getY());
		msg13->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_N, TOGGLE, SLOT_VISUAL_BOX, msg13);
		
		ofxOscMessage *msg14 = new ofxOscMessage();
		msg14->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/14");
		msg14->addIntArg(14);
		msg14->addFloatArg(_tuioObj->getX());
		msg14->addFloatArg(_tuioObj->getY());
		msg14->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_O, TOGGLE, SLOT_VISUAL_BOX, msg14);
		
		ofxOscMessage *msg15 = new ofxOscMessage();
		msg15->setAddress("/smurf/fid/" + ofToString(_tuioObj->getFiducialId()) + "/tic/15");
		msg15->addIntArg(15);
		msg15->addFloatArg(_tuioObj->getX());
		msg15->addFloatArg(_tuioObj->getY());
		msg15->addFloatArg(_tuioObj->getAngleDegrees());
		
		setSlot(_P, TOGGLE, SLOT_VISUAL_BOX, msg15);
		
		setNature("SEQUENCER");
	}	
	
	void draw() {
		Smurf::draw();
	}
};

class FMFTempo : public Smurf {
public:
	FMFTempo(ofxTuioObject *_tuioObj, SmurfKind _kind) : Smurf(_tuioObj, _kind) {
		setNature("TEMPO");
	}	
	
	void draw() {
		Smurf::draw();
	}
};

class FMFSampler : public Smurf {
public:
	FMFSampler(ofxTuioObject *_tuioObj, SmurfKind _kind) : Smurf(_tuioObj, _kind) {
		setNature("SAMPLER");
	}	
	
	void draw() {
		Smurf::draw();
	}
};

#endif