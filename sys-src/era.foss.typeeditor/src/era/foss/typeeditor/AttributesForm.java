/*
 * NAME: era.foss.typeeditor.AttributesForm
 */

package era.foss.typeeditor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;

/**
 * Editor form for manipulating attributes.
 * 
 * @author cpn
 */
public class AttributesForm extends AbstractTypesForm {

    public AttributesForm( Composite parent, IEditorPart editor ) {
        super( parent, editor, SWT.NONE );
    }

}
