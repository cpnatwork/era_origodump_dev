package era.foss.typeeditor;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

import era.foss.erf.Identifiable;
import era.foss.erf.ErfPackage;
import era.foss.erf.impl.ErfFactoryImpl;

/**
 * A TableViewer with Add and Delete buttons.
 * <p>
 * Integrates layout and a Composite for the button bar.
 * <p>
 * Actually, this should be a generic UI widget. But now it is not any more. A description field was added, which is
 * bound to the basic {@link Identifiable} element from the ERF model.
 * 
 * @author schorsch
 */
public class AddDeleteTableViewer extends TableViewer {

    /**
     * Composite holding the table, the element description ({@link #descriptionText}) and the button bar (
     * {@link #buttonBar})
     */
    private Composite composite;

    /** Layout for specifying the layout */
    private TableColumnLayout tableColumnLayout;

    /** The description field for the elements in the table */
    Text descriptionText;

    protected Table table;
    protected EditingDomain editingDomain;
    protected Activator typeEditorActivator;

    public void setEditingDomain( EditingDomain editingDomain ) {
        this.editingDomain = editingDomain;
    }

    /**
     * Button bar holding the Add and remove buttons New buttons can be added by the users of this table
     */
    private Composite buttonBar;

    // standard add and remove button
    Button removeElementsButton;
    Button addElementButton;

    // parameters for add Command
    private EObject addCommandOwner;
    private EClass addCommandValueDefaultType;

    private int activeColumn;

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
        super( new Composite( new Composite( parent, SWT.NONE ), SWT.NONE ), style );
        table = this.getTable();
        this.typeEditorActivator = era.foss.typeeditor.Activator.INSTANCE;

        layoutComposite();
        createButtonBar();
        createDescriptionField();
        setupTable();
        triggerColumnSelectedColumn();
    }

    /**
     * Layout the Composites
     */
    private void layoutComposite() {

        // get composite for table column layout
        Composite tableComposite = table.getParent();

        // get composite for buttons and table
        composite = tableComposite.getParent();

        // set column layout of table composite
        tableColumnLayout = new TableColumnLayout();
        tableComposite.setLayout( tableColumnLayout );
        tableComposite.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

        composite.setLayout( new GridLayout( 1, false ) );

    }

    /**
     * Create table
     */
    private void setupTable() {

        // set table attributes
        table.setHeaderVisible( true );
        table.setLinesVisible( true );

        // add key listener
        table.addKeyListener( new KeyListener() {

            public void keyPressed( KeyEvent e ) {
                if( e.character == SWT.DEL ) {
                    removeElements();
                    refresh();
                }
            }

            @Override
            public void keyReleased( KeyEvent e ) {
                /* do nothing */
            }
        } );

        // prepare the activation strategy for setting the behavior when editing table cells
        ColumnViewerEditorActivationStrategy actStrategy = new ColumnViewerEditorActivationStrategy( this ) {
            protected boolean isEditorActivationEvent( ColumnViewerEditorActivationEvent event ) {
                return event.eventType == ColumnViewerEditorActivationEvent.TRAVERSAL
                    || event.eventType == ColumnViewerEditorActivationEvent.MOUSE_DOUBLE_CLICK_SELECTION
                    || event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC;
            }
        };

        // create table viewer editor (*?*)
        TableViewerEditor.create( this, actStrategy, ColumnViewerEditor.TABBING_HORIZONTAL
            | ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
            | ColumnViewerEditor.TABBING_VERTICAL
            | ColumnViewerEditor.KEYBOARD_ACTIVATION );

    }

    /**
     * Create Text widget for displaying the element description
     */
    private void createDescriptionField() {

        // Label for description
        Label descriptionLabel = new Label( composite, SWT.NONE );
        descriptionLabel.setText( typeEditorActivator.getString( "_UI_Description_label" ) + ":" );
        descriptionLabel.setLayoutData( new GridData( SWT.LEFT, SWT.BOTTOM, false, false, 0, 0 ) );

        // Text widget for the general Description attribute of any ERF-Identifiable
        descriptionText = new Text( composite, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL );
        descriptionText.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true, 0, 0 ) );
        descriptionText.setEditable( false );

        // Listener: absorb Text modification into model
        descriptionText.addModifyListener( new ModifyListener() {
            public void modifyText( ModifyEvent e ) {
                if( descriptionText.isEnabled() ) {
                    IStructuredSelection selection = (IStructuredSelection)AddDeleteTableViewer.this.getSelection();
                    assert (selection != null);
                    Identifiable identifiable = (Identifiable)selection.getFirstElement();
                    Command command = SetCommand.create( editingDomain,
                                                         identifiable,
                                                         ErfPackage.eINSTANCE.getIdentifiable_Desc(),
                                                         descriptionText.getText() );
                    editingDomain.getCommandStack().execute( command );
                }
            }

        } );

        // Listener: selection change (left side => update Text widget for newly focused ERF-Identifiable's description)
        this.addSelectionChangedListener( new ISelectionChangedListener() {
            public void selectionChanged( SelectionChangedEvent event ) {

                descriptionText.setEnabled( false );
                descriptionText.setEditable( false );
                IStructuredSelection selection = (IStructuredSelection)event.getSelection();
                if( selection.isEmpty() ) {
                    descriptionText.setText( "" );
                    return;
                }
                Identifiable identifiable = (Identifiable)selection.getFirstElement();
                descriptionText.setText( identifiable.getDesc() );
                descriptionText.setEnabled( true );
                descriptionText.setEditable( true );
                descriptionText.redraw();
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
        EObject addCommandValue = ErfFactoryImpl.eINSTANCE.create( addCommandValueDefaultType );
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
     * 
     * @return column layout assigned to the table
     */
    public TableColumnLayout getTableColumnLayout() {
        return tableColumnLayout;
    }

    /**
     * Get position of column
     * 
     * @param v
     */
    private void triggerColumnSelectedColumn() {
        AddDeleteTableViewer.this.getTable().addMouseListener( new MouseAdapter() {

            public void mouseDown( MouseEvent e ) {
                int x = 0;
                for( int i = 0; i < AddDeleteTableViewer.this.getTable().getColumnCount(); i++ ) {
                    x += AddDeleteTableViewer.this.getTable().getColumn( i ).getWidth();
                    if( e.x <= x ) {
                        activeColumn = i;
                        break;
                    }
                }
            }

        } );
    }

    /**
     * Get column where a mouse down event occured
     * 
     * @return number of active column
     */
    public int getActiveColumn() {
        return activeColumn;
    }

}
