package era.foss.typeeditor;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IEditorPart;

import era.foss.rif.presentation.EraCommandStack;

/**
 * A simple input dialog for soliciting an input string from the user.
 * <p>
 * This concrete dialog class can be instantiated as is, or further subclassed as required.
 * </p>
 */
public class TypeDialog extends Dialog {

    private IEditorPart editor = null;
    private EditingDomain editingDomain = null;
    // commandStack is required for Ok and Cancel Buttons
    private EraCommandStack eraCommandStack = null;

    /**
     * Creates a editor for Datatype, Attributes and Spectypes
     * 
     * @param parentShell parent shell of this dialog
     * @param adapterFactory
     * @param domain
     * 
     */
    public TypeDialog( Shell activeShell, IEditorPart editor ) {
        super( activeShell );
        setShellStyle( getShellStyle() | SWT.RESIZE | SWT.MAX );

        // set-up context
        this.editor = editor;
        this.editingDomain = ((IEditingDomainProvider)editor).getEditingDomain();
        this.eraCommandStack = (EraCommandStack)editingDomain.getCommandStack();

        // plant an initial checkpoint
        this.eraCommandStack.plantCheckpoint();

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
     */
    protected void configureShell( Shell shell ) {
        super.configureShell( shell );
        shell.setText( "Type Editor" );
        shell.setMinimumSize( 600, 400 );
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected Control createDialogArea( Composite parent ) {
        Composite composite = (Composite)super.createDialogArea( parent );

        TabFolder typeEditorTabFolder = new TabFolder( composite, SWT.NONE );
        typeEditorTabFolder.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

        // Lists for TabItems: Controls and Labels
        Control[] listOfControls = {
            new DataTypesForm( typeEditorTabFolder, this.editor ),
            new AttributesForm( typeEditorTabFolder, this.editor ),
            new SpecificationTypesForm( typeEditorTabFolder, this.editor )};
        String[] listOfTabLabels = {"Datatypes", "Attributes", "Specification Types"};
        TabItem additionalTabItem = null;
        for( int iter = 0; iter < listOfControls.length; ++iter ) {
            additionalTabItem = new TabItem( typeEditorTabFolder, SWT.NONE );
            additionalTabItem.setText( listOfTabLabels[iter] );
            additionalTabItem.setControl( listOfControls[iter] );
        }
        additionalTabItem = null;

        // (font of parent will be applied recursively to the newly added controls!)
        applyDialogFont( composite );

        return composite;
    }

    /**
     * @see org.eclipse.jface.dialogs.Dialog#okPressed()
     * @since 03.03.2010
     */
    protected void okPressed() {
        super.okPressed();
        // the performed commands should not be available for undo after OK.
        eraCommandStack.inhibitUndos();
    }

    /**
     * @see org.eclipse.jface.dialogs.Dialog#cancelPressed()
     * @since 03.03.2010
     */
    protected void cancelPressed() {
        super.cancelPressed();
        // undo the complete CommandStack:
        eraCommandStack.rollback();
    }

}