package era.foss.rif.presentation;

import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPage;

public class SpecObjectViewerPane extends ViewerPane {

    /** editor where this viewer pane is part of */
    RifEditor rifEditor;

    public SpecObjectViewerPane( IWorkbenchPage page, RifEditor rifEditor , Composite parent) {
        super( page, rifEditor );
        this.rifEditor = rifEditor;
        this.createControl( parent );
        ((SpecObjectViewer) this.getViewer()).setup(); 
    }

    @Override
    public Viewer createViewer( Composite composite ) {
        return new SpecObjectViewer( composite,rifEditor);
    }

    @Override
    public void requestActivation() {
        super.requestActivation();
        rifEditor.setCurrentViewerPane( this );
    }
}
