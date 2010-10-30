package era.foss.objecteditor;

import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;

public class SpecObjectViewerPane extends ViewerPane {

    /** editor where this viewer pane is part of */
    IEditorPart rifEditor;

    public SpecObjectViewerPane( IWorkbenchPage page, IEditorPart rifEditor , Composite parent) {
        super( page, rifEditor );
        this.rifEditor = rifEditor;
        this.createControl( parent );
        ((SpecObjectViewer) this.getViewer()).setup();
    }

    @Override
    public Viewer createViewer( Composite composite ) {
        return new SpecObjectViewer( composite,rifEditor);
    }

}
