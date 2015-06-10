/*
 * ether.h
 *
 *  Created on: 7 juil. 2011
 *      Author: lucas
 */

#include <vector>
#include "quantics.hpp"

#ifndef ETHER_H_
#define ETHER_H_

namespace quantics {

	class Ether {
		public:
			Ether();
			virtual ~Ether();
		protected:
		private:
			std::vector<quantics::particles::QParticle*> *standardModelZoo;
	};

}

#endif /* ETHER_H_ */
