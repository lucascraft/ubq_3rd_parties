/***********************************************************************************
 * Smbt - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.jfx.dialogs;

import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionDialog;

public abstract class UbiJFXSelectionDialog extends SelectionDialog {
	public UbiJFXSelectionDialog(Shell parentShell, String shellTitle, String shellMessage) {
		super(parentShell);
	    setTitle(shellTitle);
	    setMessage(shellMessage);
	}
	
    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
    	parent.setLayout(GridLayoutFactory.fillDefaults().create());
    	parent.setLayoutData(GridDataFactory.fillDefaults().create());
    	
        Composite composite = (Composite) super.createDialogArea(parent);
        composite.setLayout(GridLayoutFactory.fillDefaults().create());
        composite.setLayoutData(GridDataFactory.fillDefaults().create());
        
        // Create label
        createMessageArea(composite);

        FXCanvas fxCanvas = new FXCanvas(composite, SWT.NONE) {
        	public Point computeSize(int wHint, int hHint, boolean changed) {
                getScene().getWindow().sizeToScene();
                int width = (int) getScene().getWidth();
                int height = (int) getScene().getHeight();
                return new Point(width, height);
            }
        };
        fxCanvas.setLayout(GridLayoutFactory.fillDefaults().create());
        fxCanvas.setLayoutData(GridDataFactory.fillDefaults().create());

        
        fxCanvas.setScene(createScene());
        
        parent.layout(true);
        parent.pack(true);
        
        return composite;
    }
    
    public abstract Scene createScene();

}
