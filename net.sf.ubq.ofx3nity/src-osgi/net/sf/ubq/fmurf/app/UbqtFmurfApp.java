/***********************************************************************************
 * UBQT - A ubiquitous computing utilities framework 
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

package net.sf.ubq.fmurf.app;

import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.xqz.engine.utils.AbstractTTLJob;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class UbqtFmurfApp implements IApplication {
	AbstractTTLJob simulatorJob;
	public Object start(IApplicationContext context) throws Exception {
		CmdPipe tuioEngine = QuanticMojo.INSTANCE.openUdpPipe(
			"tuio1", 
			"tuioSimulator", 
			"localhost:3334", 
			new int[] { 3333 }
		);
		
		simulatorJob = new AbstractTTLJob() {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					schedule(500);
					return Status.OK_STATUS;
				}
			};
		simulatorJob.schedule();

		while (!canFinish());
		
		return new Object();
	}

	boolean canFinish() {
		return ! simulatorJob.isRunning();
	}

	public void stop() {}
}
