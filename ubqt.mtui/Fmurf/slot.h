/*
 *  smurf.h
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

#ifndef _SLOT
#define _SLOT

#include "smurfer.h"
#include "ofxTuio.h"

enum SlotPosition {
	_A=0, _B=23, _C=45, _D=67, _E=90, _F=112,
	_G=135, _H=158, _I=180, _J=202, _K=225, _L=248,
	_M=270, _N=292, _O=315, _P=338
};

enum SlotKind {
	PUSH,
	TOGGLE
};

enum SlotVisual {
	SLOT_VISUAL_BOX,
	SLOT_VISUAL_ROUND,
	SLOT_VISUAL_TRIANGLE
};

class Slot : public Smurfer {
private:
	ofxOscMessage* oscMsg;
	SlotPosition position;
	SlotKind kind;
	SlotVisual visual;
	bool tic;
public:
	Slot(SlotPosition _position);
	Slot(SlotPosition _position, SlotKind _kind);
	Slot(SlotPosition _position, SlotKind _kind, SlotVisual _visual) : Smurfer() {
		tuio = new ofxTuioContainer(_position, 0.0, 0.0);
		oscMsg = new ofxOscMessage();
		position = _position;
		kind = _kind;
		visual = _visual;
		setRadius(10);
	}
	
	SlotKind getKind();
	SlotVisual getVisual();
	SlotPosition getPosition();
	
	ofxOscMessage* getOscMessage();
	void setOscMessage(ofxOscMessage* _msg);
	string getLabelFromSlotPosition();
	int getOrderFromSlotPosition();
	
	void setTic(bool _tic);
	bool isTic();
	
	void draw();
};

#endif

