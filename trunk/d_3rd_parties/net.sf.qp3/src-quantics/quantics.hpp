/*
 * quantics.hpp
 *
 *  Created on: 7 juil. 2011
 *      Author: lucas
 */

#pragma once


#include <boost/units/static_constant.hpp>

#include <boost/units/systems/si/capacitance.hpp>
#include <boost/units/systems/si/current.hpp>
#include <boost/units/systems/si/energy.hpp>
#include <boost/units/systems/si/force.hpp>
#include <boost/units/systems/si/length.hpp>
#include <boost/units/systems/si/mass.hpp>
#include <boost/units/systems/si/resistance.hpp>
#include <boost/units/systems/si/temperature.hpp>
#include <boost/units/systems/si/time.hpp>
#include <boost/units/systems/si/velocity.hpp>
#include <boost/units/systems/si/volume.hpp>
#include <boost/units/systems/si/codata/typedefs.hpp>


#include <boost/units/systems/detail/constants.hpp>
#include <boost/units/systems/si/base.hpp>
#include <electron-volt.hpp>

#ifndef QUANTICS_HPP_
#define QUANTICS_HPP_



namespace quantics {
namespace particles {
	enum Spin {
		SPIN_MINUS_FOUR_THIRD,     // -4/3
		SPIN_MINUS_ONE,            // -1
		SPIN_MINUS_TWO_THIRD,      // -2/3
		SPIN_MINUS_ONE_AND_A_HALF, // -1/2
		SPIN_MINUS_ONE_THIRD,      // -1/3
		SPIN_ZERO,                 //  0
		SPIN_PLUS_ONE_THIRD,       // +1/3
		SPIN_PLUS_ONE_AND_A_HALF,  // +1/2
		SPIN_PLUS_TWO_THIRD,       // +2/3
		SPIN_PLUS_ONE,             // +1
		SPIN_PLUS_FOUR_THIRD       // +4/3
	};


	enum Charge {
		CHARGE_MINUS_FOUR_THIRD,     // -4/3
		CHARGE_MINUS_ONE,            // -1
		CHARGE_MINUS_TWO_THIRD,      // -2/3
		CHARGE_MINUS_ONE_AND_A_HALF, // -1/2
		CHARGE_MINUS_ONE_THIRD,      // -1/3
		CHARGE_ZERO,                 // 0
		CHARGE_PLUS_ONE_THIRD,       // +1/3
		CHARGE_PLUS_ONE_AND_A_HALF,  // +1/2
		CHARGE_PLUS_TWO_THIRD,       // +2/3
		CHARGE_PLUS_ONE ,            // +1
		CHARGE_PLUS_FOUR_THIRD       // +4/3
	};

	enum Color {
		RED,
		GREEN,
		BLUE,
		ANTI_RED,
		ANTI_GREEN,
		ANTI_BLUE
	};

	enum ParticleKind {
		//QUARKS
		UP,
		CHARM,
		TOP,
		DOWN,
		STRANGE,
		BOTTOM,
		// BOSONS
		PHOTON,
		GLUON,
		Z_WEAK_FORCE,
		W_WEAK_FORCE,
		// LEPTONS
		ELECTRON_NEUTRINO,
		MUON_NEUTRINO,
		TAU_NEUTRINO,
		ELECTRON,
		MUON,
		TAU
	};

	class QParticle {
		public:
			QParticle (Charge _charge, Spin _spin, ParticleKind _kind);
			virtual ~QParticle();
		private:
			Spin spin;
			Charge charge;
			ParticleKind kind;
	};


	class Quark : public QParticle {
		public:
			Quark(Charge _charge, Spin _spin, ParticleKind _kind, Color _color);
			virtual ~Quark();
		private:
			Color color;
	};

/*
	class Lepton : public QParticle {
		public:
			Lepton(bu::quantity<si::ev>* _mass, Charge _charge, Spin _spin, ParticleKind _kind) : QParticle(_mass, _charge, _spin, _kind) {

			}
	};

	class Boson : public QParticle {
		public:
			Boson(bu::quantity<si::ev>* _mass, Charge _charge, Spin _spin, ParticleKind _kind) : QParticle(_mass, _charge, _spin, _kind) {

			}
	};
*/

} // particles
} // quantics
#endif /* QUANTICS_HPP_ */
