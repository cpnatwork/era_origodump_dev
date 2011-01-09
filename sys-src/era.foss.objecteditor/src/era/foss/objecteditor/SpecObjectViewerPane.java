/**
 * <copyright>
 *
 * Copyright (c) 2010 'Three Good Friends' (3GF).
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Georg Blaschke 
 *   Christoph P. Neumann  
 *   Bernd Haberstumpf
 *
 * </copyright>
 *
 * $Id$
 */
package era.foss.objecteditor;

import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;

public class SpecObjectViewerPane extends ViewerPane {

    /** editor where this viewer pane is part of */
    IEditorPart erfEditor;

    public SpecObjectViewerPane( IWorkbenchPage page, IEditorPart erfEditor , Composite parent) {
        super( page, erfEditor );
        this.erfEditor = erfEditor;
        this.createControl( parent );
        ((SpecObjectViewer) this.getViewer()).setup();
    }

    @Override
    public Viewer createViewer( Composite composite ) {
        return new SpecObjectViewer( composite,erfEditor);
    }

}
