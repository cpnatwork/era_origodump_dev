package era.foss.typeeditor;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

import era.foss.rif.impl.RifFactoryImpl;

/**
 * @author schorsch
 *
 */
/**
 * @author schorsch
 *
 */
/**
 * @author schorsch
 * 
 */
public class AddDeleteTableViewer extends TableViewer {

    // The composite containing the table and all its
    // buttons
    private Composite composite;
    private TableColumnLayout tableColumnLayout;


    private Composite tableComposite;
    private Table table;
    private EditingDomain editingDomain;

    public void setEditingDomain( EditingDomain editingDomain ) {
        this.editingDomain = editingDomain;
    }

    // The section above the table containing the button
    private Composite buttonBar;

    // standard add and remove button
    Button removeElementsButton;
    Button addElementButton;

    // parameters for add Command
    private EObject addCommandOwner;
    private EClass addCommandValueDefaultType;

    /**
     * @see TableViewer
     */
    public AddDeleteTableViewer( Composite parent ) {
        this( parent, SWT.NONE );
    }

    /**
     * @see TableViewer
     */
    public AddDeleteTableViewer( Table table ) {
        super( table );
        table = this.getTable();
        composite = table.getParent();
    }

    /**
     * @see TableViewer
     */
    public AddDeleteTableViewer( Composite parent, int style ) {
        // XXX: Looks strange, might be done better
        // XXX: stomach ache
        super( new Composite( new Composite( parent, SWT.NONE ), SWT.NONE ), style );
        table = this.getTable();
        
        // get composite for table column layout
        tableComposite = table.getParent();

        // get composite for buttons and table
        composite= tableComposite.getParent();
        layoutComposite();
    }

    /**
     * layout the Composite
     */
    private void layoutComposite() {
        
        // set column layout of table composite
        tableColumnLayout = new TableColumnLayout();
        tableComposite.setLayout(tableColumnLayout);
        
        // pack button bar and table into parent composite
        composite.setLayout( new GridLayout( 1, false ) );

        createButtonBar();

        table.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        table.setHeaderVisible( true );
        table.setLinesVisible( true );

        table.addKeyListener( new KeyListener() {

            public void keyPressed( KeyEvent e ) {
                if( e.character == SWT.DEL ) {
                    removeElements();
                    refresh();
                }
            }

            @Override
            public void keyReleased( KeyEvent e ) {
                // TODO Auto-generated method stub

            }
        } );
    }

    /**
     * Create a button bar holding the Add and Remove Button
     */
    private void createButtonBar() {

        buttonBar = new Composite( composite, SWT.NONE );
        buttonBar.setLayoutData( new GridData( SWT.LEFT, SWT.BOTTOM, true, false ) );

        buttonBar.setLayout( new RowLayout( SWT.HORIZONTAL ) );

        // Create Add Button
        addElementButton = new Button( buttonBar, SWT.PUSH );
        addElementButton.setLayoutData( new RowData() );
        addElementButton.setText( "Add" );
        addElementButton.addSelectionListener( new SelectionAdapter() {
            public void widgetSelected( SelectionEvent event ) {
                addElement();
                refresh();
            }
        } );

        // Create Delete Button
        removeElementsButton = new Button( buttonBar, SWT.PUSH );
        removeElementsButton.setLayoutData( new RowData() );
        removeElementsButton.setText( "Remove" );
        removeElementsButton.addSelectionListener( new SelectionAdapter() {
            public void widgetSelected( SelectionEvent event ) {
                removeElements();
                refresh();
            }
        } );

    }

    /**
     * Set layout data
     * 
     * @param layoutData
     * @see org.eclipse.swt.widgets.Control#setLayoutData(Object)
     */
    public void setLayoutData( Object layoutData ) {
        composite.setLayoutData( layoutData );
    }

    /**
     * Show add button
     */
    public void showAddButton( boolean enabled ) {
        addElementButton.setEnabled( enabled );
    }

    /**
     * Show delete button
     */
    public void showRemoveButton( boolean enabled ) {
        removeElementsButton.setEnabled( enabled );
    }

    /**
     * Set the information required for adding a new element to the table with {@link #addElement()}
     * 
     * @param addCommandOwner The element the new element is put at
     * @param addCommandValueDefaultType
     */
    public void setAddCommandParameter( EObject addCommandOwner, EClass addCommandValueDefaultType ) {
        this.addCommandOwner = addCommandOwner;
        this.addCommandValueDefaultType = addCommandValueDefaultType;
    }

    /**
     * Add a new element to the list using the EMF Command Stack The information for adding the element has to be
     * specified by calling {@link #setAddCommandParameter(EObject, EReference, EClass)}
     */
    public void addElement() {
        EObject addCommandValue = RifFactoryImpl.eINSTANCE.create( addCommandValueDefaultType );
        Command cmd = AddCommand.create( editingDomain, addCommandOwner, null, addCommandValue );
        BasicCommandStack basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();
        basicCommandStack.execute( cmd );
    }

    /**
     * Remove selected elements from this table
     */
    public void removeElements() {
        if( getSelection().isEmpty() == false ) {
            Command removeCommand = RemoveCommand.create( editingDomain,
                                                          ((IStructuredSelection)getSelection()).toList() );
            editingDomain.getCommandStack().execute( removeCommand );
        }

    }
    
    /**
     * Get the column layout assigned to the table
     * @return column layout assigned to the table
     */
    public TableColumnLayout getTableColumnLayout() {
        return tableColumnLayout;
    }

}
