/*
 * electron-volt.hpp
 *
 *  Created on: 10 juil. 2011
 *      Author: lucas
 */

#ifndef ELECTRON_VOLT_HPP_
#define ELECTRON_VOLT_HPP_

#include <boost/units/derived_dimension.hpp>
#include <boost/units/physical_dimensions/length.hpp>
#include <boost/units/physical_dimensions/mass.hpp>
#include <boost/units/physical_dimensions/time.hpp>


namespace boost {

namespace units {


/*
Meaning of 	eV

Unit	eV
xpUnit	electron-Volt

SI_unit	1.60218×10-19J (kg.m+2.s-2)

Dim	M+1L+2T-2
 */

/// derived dimension for electron-volt : M L^2 T^-2
typedef derived_dimension<
	mass_base_dimension, 1,
	length_base_dimension,2,
    time_base_dimension,-2
>::type ev_dimension;

} // namespace units

} // namespace boost



namespace boost {

namespace units {

namespace si {

typedef unit<ev_dimension, si::system> ev;

BOOST_UNITS_STATIC_CONSTANT(eV, ev);

} // namespace si

} // namespace units

} // namespace boost

namespace boost {

namespace units {

namespace si {

namespace constants {

namespace codata {

//
// Quarks
//

// UP quark mass
BOOST_UNITS_PHYSICAL_CONSTANT(u_quark_mass, quantity<ev>, (2400000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// CHARM quark mass
BOOST_UNITS_PHYSICAL_CONSTANT(c_quark_mass, quantity<ev>, (1270000000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// TOP quark mass
BOOST_UNITS_PHYSICAL_CONSTANT(t_quark_mass, quantity<ev>, (171200000000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// BOTTOM quark mass
BOOST_UNITS_PHYSICAL_CONSTANT(b_quark_mass, quantity<ev>, (4200000000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// DOWN quark mass
BOOST_UNITS_PHYSICAL_CONSTANT(d_quark_mass, quantity<ev>, (4800000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// STRANGE quark mass
BOOST_UNITS_PHYSICAL_CONSTANT(s_quark_mass, quantity<ev>, (104000000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);

//
// Leptons
//

// ELECTRON NEUTRINO lepton mass
BOOST_UNITS_PHYSICAL_CONSTANT(e_neutrino_mass, quantity<ev>, 2.2*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// MUON NEUTRINO lepton mass
BOOST_UNITS_PHYSICAL_CONSTANT(m_neutrino_mass, quantity<ev>, (170000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// TAU NEUTRINO lepton mass
BOOST_UNITS_PHYSICAL_CONSTANT(t_neutrino_mass, quantity<ev>, (15500000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// ELECTRON lepton mass
BOOST_UNITS_PHYSICAL_CONSTANT(electron_mass, quantity<ev>, (551000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// MUON lepton mass
BOOST_UNITS_PHYSICAL_CONSTANT(muon_mass, quantity<ev>, (105000000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// TAU lepton mass
BOOST_UNITS_PHYSICAL_CONSTANT(tau_mass, quantity<ev>, (1777000000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);

//
// Bosons
//

// PHOTON boson mass
BOOST_UNITS_PHYSICAL_CONSTANT(photon_mass, quantity<ev>, 0.0*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// GLUON boson mass
BOOST_UNITS_PHYSICAL_CONSTANT(gluon_mass, quantity<ev>, 0.0*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// Z weak boson mass
BOOST_UNITS_PHYSICAL_CONSTANT(z_weak_force_mass, quantity<ev>, (91200000000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);
// W weak boson mass
BOOST_UNITS_PHYSICAL_CONSTANT(w_weak_force_mass, quantity<ev>, (80400000000.0)*kilogram*meters*meters/seconds/seconds, 0.0*kilogram*meters*meters/seconds/seconds);



} // codata
} // constants
} // si
} // units
} // boost



#endif /* ELECTRON_VOLT_HPP_ */



