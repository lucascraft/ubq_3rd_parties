/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.colors.transformation;

import java.util.List;
import java.util.ListIterator;

public class CircularIterator<E> implements ListIterator<E> {
	private volatile List<E> localList;
	private volatile int index = 0;
	
	public CircularIterator(List<E> list) {
		localList = list;
	}
	public void add(E o) {
		synchronized (localList) {
			localList.add(o);
		}
	}
	public boolean hasNext() {
		return true;
	}
	public boolean hasPrevious() {
		return true;
	}
	public E next() {
		return localList.get(nextIndex());
	}
	public int nextIndex() {
		synchronized (localList) {
			index = index >= localList.size() ? 0 : index++;
		}
		return index;
	}
	public E previous() {
		return localList.get(previousIndex());
	}
	public int previousIndex() {
		synchronized (localList) {
			index = index <= 0 ? localList.size()-1 : index--;
		}
		return index;
	}
	public void remove() {
		synchronized (localList) {
			localList.remove(index);
		}
	}
	public void set(E o) {
		synchronized (localList) {
			localList.set(index, o);
		}
	}
}
