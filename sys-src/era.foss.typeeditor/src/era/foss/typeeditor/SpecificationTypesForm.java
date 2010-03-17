/*
 * NAME: era.foss.typeeditor.AttributesForm
 */

package era.foss.typeeditor;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;

import era.foss.rif.impl.RifFactoryImpl;

/**
 * Editor form for manipulating specification types.
 * 
 * @author cpn
 */
public class SpecificationTypesForm extends AbstractTypesForm {

    public SpecificationTypesForm( Composite parent, IEditorPart editor ) {
        super( parent, editor, SWT.NONE );
    }

    /**
     * @see era.foss.typeeditor.AbstractTypesForm#setupLeftSide()
     * @since 17.03.2010
     */
    @Override
    protected TableViewer setupLeftSide() {
        final AddDeleteTableViewer tableViewer = new AddDeleteTableViewer( this, SWT.MULTI
            | SWT.V_SCROLL
            | SWT.BORDER
            | SWT.FULL_SELECTION );
        tableViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

        tableViewer.setEditingDomain( editingDomain );
        tableViewer.setAddCommandParameter( rifModel.getCoreContent(),
                                            RifFactoryImpl.eINSTANCE.createSpecType().eClass() );
        return tableViewer;
    }

}
