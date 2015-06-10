/*
 * Ether.cpp
 *
 *  Created on: 7 juil. 2011
 *      Author: lucas
 */
#include "Ether.h"

#include <boost/units/systems/si/codata/universal_constants.hpp>




quantics::Ether::Ether() {
	standardModelZoo = new std::vector<quantics::particles::QParticle*>();
/*
	quantics::Quark* upQuark = new quantics::Quark(
		cst::u_quark_mass.value(),
		quantics::CHARGE_MINUS_ONE,
		quantics::SPIN_MINUS_ONE,
		quantics::UP
	);

	quantics::Quark* downQuark = new quantics::Quark(
		cst::d_quark_mass.value(),
		quantics::CHARGE_MINUS_ONE,
		quantics::SPIN_MINUS_ONE,
		quantics::DOWN
	);

	quantics::Quark* topQuark = new quantics::Quark(
		cst::t_quark_mass.value(),
		quantics::CHARGE_MINUS_ONE,
		quantics::SPIN_MINUS_ONE,
		quantics::TOP
	);

	quantics::Quark* bottomQuark = new quantics::Quark(
		cst::b_quark_mass.value(),
		quantics::CHARGE_MINUS_ONE,
		quantics::SPIN_MINUS_ONE,
		quantics::BOTTOM
	);

	quantics::Quark* strangeQuark = new quantics::Quark(
		cst::s_quark_mass.value(),
		quantics::CHARGE_MINUS_ONE,
		quantics::SPIN_MINUS_ONE,
		quantics::STRANGE
	);

	quantics::Quark* charmQuark = new quantics::Quark(
		cst::c_quark_mass.value(),
		quantics::CHARGE_MINUS_ONE,
		quantics::SPIN_MINUS_ONE,
		quantics::CHARM
	);


	standardModelZoo->push_back(upQuark);
	standardModelZoo->push_back(downQuark);
	standardModelZoo->push_back(topQuark);
	standardModelZoo->push_back(bottomQuark);
	standardModelZoo->push_back(strangeQuark);
	standardModelZoo->push_back(charmQuark);
	*/
}

quantics::Ether::~Ether() {
	delete standardModelZoo;
}

