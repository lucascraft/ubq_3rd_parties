/***********************************************************************************
 * Smbt - A smart ambient utilities framework 
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

package net.sf.smbt.cc2500.livingcolors.handlers;

import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd;
import net.sf.smbt.comm.utils.rxtx.Serial;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

public class LivingColorsQxEventHandler extends AbstractQxEventHandlerImpl {

	public LivingColorsQxEventHandler() {
	}

	@Override
	public void handleQxEvent(Event event) {
		if (event.getCmd() instanceof LivingColorsCmd) {
			if (event.getKind() == EVENT_KIND.TX_DONE) {
				LivingColorsCmd cmd = (LivingColorsCmd) event.getCmd();
				Object obj = event.getQx().getEngine().getPort().getChannel();
				if (obj instanceof Serial) { // to Arduino and A-Block shield w/ cc2500 module
					synchronized (event.getQx().getEngine().getOutputInterpreter()) {
						byte[] frame = event.getQx().getEngine().getOutputInterpreter().cmd2ByteArray(cmd);
						((Serial) obj).write(frame);
					}
				}
			}
		}
	}
}
