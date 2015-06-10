/*
 * quantics.cpp
 *
 *  Created on: 7 juil. 2011
 *      Author: lucas
 */

#include "quantics.hpp"

using namespace quantics::particles;

//
// QParticle
//

quantics::particles::QParticle::QParticle (Charge _charge, Spin _spin, ParticleKind _kind) {
	charge	= _charge;
	spin	= _spin;
	kind	= _kind;
}


//
// Quark
//

quantics::particles::Quark::Quark(Charge _charge, Spin _spin, ParticleKind _kind, Color _color) : QParticle(_charge, _spin, _kind) {
	color = _color;
}



