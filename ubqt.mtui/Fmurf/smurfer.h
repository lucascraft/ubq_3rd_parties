/*
 *  smurfer.h
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

#ifndef _SMURFER
#define _SMURFER

#include "smuon.h"

enum SmurfStyle {
	ORBIT,
	BLINK,
	PULSE,
	NONE
};

class Smurfer : public Smuon {
protected:
	long speed, delay;
	int range, animation;
	bool active;

public:
	Smurfer() : Smuon() {
		speed = 1000.0;
		delay = 1000.0;
		range = 100;
		active = true;
		animation = NONE;
	}
	int getRange();
	void setRange(int _range);
};





#endif