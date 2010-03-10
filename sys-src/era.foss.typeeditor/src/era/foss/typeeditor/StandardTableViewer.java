package era.foss.typeeditor;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

import era.foss.rif.impl.RifFactoryImpl;

public class StandardTableViewer extends TableViewer {

    // The composite containing the table and all its
    // buttons
    private Composite composite;
    private Table table;
    private EditingDomain editingDomain;

    public void setEditingDomain( EditingDomain editingDomain ) {
        this.editingDomain = editingDomain;
    }

    // The section above the table containing the button
    private Composite buttonBar;

    // parameters for add Command invloked by the add Button
    private EObject addCommandOwner;
    private EReference addCommandFeature;
    private EClass addCommandValueDefaultType;

    public StandardTableViewer( Composite parent ) {
        this( parent, SWT.NONE );
    }

    public StandardTableViewer( Table table ) {
        super( table );
        table = this.getTable();
        composite = table.getParent();
    }

    public StandardTableViewer( Composite parent, int style ) {
        // XXX: Looks strange, might be done better
        // XXX: stomach ache
        super( new Composite( parent, SWT.NONE ), style );
        table = this.getTable();
        composite = table.getParent();
        layoutComposite();
    }

    private void layoutComposite() {
        // pack button bar and table into parent composite
        composite.setLayout( new RowLayout( SWT.VERTICAL ) );

        layoutButtonBar();

        table.setLayoutData( new RowData() );
        table.setHeaderVisible( true );
        table.setLinesVisible( true );

    }

    private void layoutButtonBar() {

        buttonBar = new Composite( composite, SWT.NONE );
        buttonBar.setLayoutData( new RowData() );

        buttonBar.setLayout( new RowLayout( SWT.HORIZONTAL ) );

        // Create Add Button
        Button addElementButton = new Button( buttonBar, SWT.PUSH );
        addElementButton.setLayoutData( new RowData() );
        addElementButton.setText( "Add" );
        addElementButton.addSelectionListener( new SelectionAdapter() {
            public void widgetSelected( SelectionEvent event ) {
                EObject addCommandValue = RifFactoryImpl.eINSTANCE.create( addCommandValueDefaultType );
                Command cmd = AddCommand.create( editingDomain, addCommandOwner, addCommandFeature, addCommandValue );
                BasicCommandStack basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();
                basicCommandStack.execute( cmd );

                refresh();
            }
        } );

        // Create Delete Button
        Button removeElementsButton = new Button( buttonBar, SWT.PUSH );
        removeElementsButton.setLayoutData( new RowData() );
        removeElementsButton.setText( "Remove" );
        removeElementsButton.addSelectionListener( new SelectionAdapter() {
            public void widgetSelected( SelectionEvent event ) {
                // remove all selected elements
                Command removeCommand = RemoveCommand.create( editingDomain,
                                                              ((IStructuredSelection)getSelection()).toList() );
                editingDomain.getCommandStack().execute( removeCommand );
                refresh();
            }
        } );

    }

    public void setAddCommandParameter( EObject addCommandOwner,
                                        EReference addCommandFeature,
                                        EClass addCommandValueDefaultType ) {
        this.addCommandOwner = addCommandOwner;
        this.addCommandFeature = addCommandFeature;
        this.addCommandValueDefaultType = addCommandValueDefaultType;
    }

    public void setLayoutData( Object layoutData ) {
        composite.setLayoutData( layoutData );
    }

}
