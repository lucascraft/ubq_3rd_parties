/*
 *  Authors:
 *      Stjepan Rajko
 *      Arts, Media and Engineering Program
 *      Arizona State University
 *
 *      David Burri
 *      Berner Fachhochschule
 *      Signal and Image Processing Lab, TI Burgdorf
 *
 *  Copyright 2009 David Burri, Arizona Board of Regents.
 *
 *  This file is part of the AME Patterns openFrameworks addon.
 *
 *  The AME Patterns openFrameworks addon is free software: you can redistribute it
 *  and/or modify it under the terms of the GNU General Public License as
 *  published by the Free Software Foundation, either version 3 of the License,
 *  or (at your option) any later version.
 *
 *  The AME Patterns openFrameworks addon is distributed in the hope that it will be
 *  useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with the AME Patterns openFrameworks addon.
 *  If not, see <http://www.gnu.org/licenses/>.
 */

#ifndef OF_PATTERNRECOGNITION
#define OF_PATTERNRECOGNITION

#include <vector>
#include <istream>
#include <ostream>

template<typename Observation, typename Configuration>
class ofPatternRecognition {

public:
    ofPatternRecognition();
    ~ofPatternRecognition();

    void addPatternWithExamples(const std::vector<std::vector<Observation> > &examples, int num_states);
    int match(const Observation &gesture);
    void clear(void);
    int numPatterns() const;
    int lastRecognition() const
    {   return mLastRecognition; }
    int lastRecognitionLength() const;

    void save(std::ostream &stream) const;
    void load(std::istream &stream);
private:
    void *mRecognitionTask;
    int mLastRecognition;

};

#endif
