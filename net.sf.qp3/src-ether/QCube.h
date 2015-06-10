/*
 * QCube.h
 *
 *  Created on: 23 janv. 2011
 *      Author: lucas
 */

#ifndef QCUBE_H_
#define QCUBE_H_

#include <vector>

namespace qp3 {

enum QFlavor {
	CHIRAL, //     /\/
	TRIPOD, //     /_\.
	ORTHO   //     |_|
};



class QState {
	QFlavor flavor;

};

class QCube {
private:
	std::vector<QState> states;
public:
	QCube();
	virtual ~QCube();
};

}

#endif /* QCUBE_H_ */
