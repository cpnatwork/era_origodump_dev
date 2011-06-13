/**************************************************************************
 * ERA - Eclipse Requirements Analysis
 * ==============================================
 * Copyright (C) 2009-2011 by Georg Blaschke, Christoph P. Neumann
 * and Bernd Haberstumpf (http://era.origo.ethz.ch)
 **************************************************************************
 * Licensed under the Eclipse Public License - v 1.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.eclipse.org/org/documents/epl-v10.html
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **************************************************************************
 * $Id$
 *************************************************************************/
package era.foss.typeeditor;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
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

import era.foss.erf.ErfPackage;
import era.foss.erf.Identifiable;
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

    /** The description field for the elements in the table. */
    Text descriptionText;

    /** The table. */
    protected Table table;

    /** The editing domain. */
    protected EditingDomain editingDomain;

    /** The type editor activator. */
    protected Activator typeEditorActivator;

    /**
     * Sets the editing domain.
     * 
     * @param editingDomain the new editing domain
     */
    public void setEditingDomain( EditingDomain editingDomain ) {
        this.editingDomain = editingDomain;
    }

    /** Button bar holding the Add and remove buttons New buttons can be added by the users of this table. */
    private Composite buttonBar;

    // standard add and remove button
    /** The remove elements button. */
    Button removeElementsButton;

    /** The add element button. */
    Button addElementButton;

    // parameters for add Command
    /** The add command owner. */
    private EObject addCommandOwner;

    /** The add command value default type. */
    private EClass addCommandValueDefaultType;

    /** The active column. */
    private int activeColumn;

    //
    /** The data bind context. */
    private DataBindingContext dataBindContext;

    /** The master. */
    private IObservableValue master;

    /**
     * Instantiates a new adds the delete table viewer.
     * 
     * @param parent the parent
     * @see TableViewer
     */
    public AddDeleteTableViewer( Composite parent ) {
        this( parent, SWT.NONE );
    }

    /**
     * Instantiates a new adds the delete table viewer.
     * 
     * @param table the table
     * @see TableViewer
     */
    public AddDeleteTableViewer( Table table ) {
        super( table );
        table = this.getTable();
        composite = table.getParent();
    }

    /**
     * Instantiates a new adds the delete table viewer.
     * 
     * @param parent the parent
     * @param style the style
     * @see TableViewer
     */
    public AddDeleteTableViewer( Composite parent, int style ) {
        super( new Composite( new Composite( parent, SWT.NONE ), SWT.NONE ), style );
        table = this.getTable();
        this.typeEditorActivator = era.foss.typeeditor.Activator.INSTANCE;

        layoutComposite();
        createButtonBar();
        setupTable();
        createDescriptionField();
        triggerColumnSelectedColumn();

        parent.addDisposeListener( new DisposeListener() {

            @Override
            public void widgetDisposed( DisposeEvent e ) {
                AddDeleteTableViewer.this.dispose();
            }
        } );
    }

    /**
     * Dispose observable to avoid listener leaking.
     */
    protected void dispose() {
        master.dispose();
        if( dataBindContext != null ) {
            dataBindContext.dispose();
        }
    }

    /**
     * Layout the Composites.
     */
    private void layoutComposite() {

        // get composite for table column layout
        Composite tableComposite = table.getParent();

        // get composite for buttons and table
        composite = tableComposite.getParent();

        // set column layout of table composite
        tableComposite.setLayout( new TableColumnLayout() );
        GridData gridData = new GridData( SWT.FILL, SWT.FILL, true, true );
        // always show a mimimum of 5 rows
        gridData.minimumHeight = table.getItemHeight() * 5 + 5;
        tableComposite.setLayoutData( gridData );
        GridLayout gridLayout = new GridLayout( 1, true );
        composite.setLayout( gridLayout );

    }

    /**
     * Create table.
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

        // define strategy how table cells are traversed and activated with the keyboard
        TableViewerEditor.create( this, actStrategy, ColumnViewerEditor.TABBING_HORIZONTAL
            | ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
            | ColumnViewerEditor.TABBING_VERTICAL
            | ColumnViewerEditor.KEYBOARD_ACTIVATION );

    }

    /**
     * Create Text widget for displaying the element description.
     */
    private void createDescriptionField() {

        // Label for description
        Label descriptionLabel = new Label( composite, SWT.NONE );
        descriptionLabel.setText( typeEditorActivator.getString( "_UI_Description_label" ) + ":" );
        descriptionLabel.setLayoutData( new GridData( SWT.LEFT, SWT.BOTTOM, false, false ) );

        // Text widget for the general Description attribute of any ERF-Identifiable
        descriptionText = new Text( composite, SWT.BORDER | SWT.MULTI | SWT.WRAP );

        GridData gridData = new GridData( SWT.FILL, SWT.FILL, true, true );
        // always show a mimimum of 2 lines of Text
        gridData.minimumHeight = descriptionText.getLineHeight() * 2 + 10;
        descriptionText.setLayoutData( gridData );
        descriptionText.setEnabled( false );

        // bind values
        master = ViewerProperties.singleSelection().observe( this );

        /*
         * We only need the listener as the F****** data binding can't handle null pointer as value of the master object
         * at the time the various listeners are created. Maybe this has something to do with the fact that the data
         * binding stuff automatically creates common converters (e.g. int -> string,...) but on the other hand... EMF
         * knows everything and especially the type...
         * 
         * However a null pointer is OK once a data binding has been created where the value of the master object is not
         * null.
         * 
         * This is major crap...
         */
        master.addChangeListener( new IChangeListener() {
            @Override
            public void handleChange( ChangeEvent event ) {
                /*
                 * create data binding as soon the master observable points to an object
                 */
                if( master.getValue() == null ) {
                    descriptionText.setEnabled( false );
                } else {
                    descriptionText.setEnabled( true );
                    if( dataBindContext == null ) {
                        dataBindContext = new DataBindingContext();
                        dataBindContext.bindValue( WidgetProperties.text( SWT.Modify )
                                                                   .observeDelayed( 400, descriptionText ),
                                                   EMFEditProperties.value( editingDomain,
                                                                            ErfPackage.Literals.IDENTIFIABLE__DESC )
                                                                    .observeDetail( master ) );
                    }
                }
            }
        } );
    }

    /**
     * Create a button bar holding the Add and Remove Button.
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
                AddDeleteTableViewer.this.addElement();
                AddDeleteTableViewer.this.refresh();
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
     * Set layout data.
     * 
     * @param layoutData the new layout data
     * @see org.eclipse.swt.widgets.Control#setLayoutData(Object)
     */
    public void setLayoutData( Object layoutData ) {
        composite.setLayoutData( layoutData );
    }

    /**
     * Show add button.
     * 
     * @param enabled the enabled
     */
    public void showAddButton( boolean enabled ) {
        addElementButton.setEnabled( enabled );
    }

    /**
     * Show delete button.
     * 
     * @param enabled the enabled
     */
    public void showRemoveButton( boolean enabled ) {
        removeElementsButton.setEnabled( enabled );
    }

    /**
     * Set the information required for adding a new element to the table with {@link #addElement()}.
     * 
     * @param addCommandOwner The element the new element is put at
     * @param addCommandValueDefaultType the add command value default type
     */
    public void setAddCommandParameter( EObject addCommandOwner, EClass addCommandValueDefaultType ) {
        this.addCommandOwner = addCommandOwner;
        this.addCommandValueDefaultType = addCommandValueDefaultType;
    }

    /**
     * Add a new element to the list using the EMF Command Stack The information for adding the element has to be
     * specified by calling {@link #setAddCommandParameter(EObject, EReference, EClass)}.
     */
    public void addElement() {
        EObject addCommandValue = ErfFactoryImpl.eINSTANCE.create( addCommandValueDefaultType );
        Command cmd = AddCommand.create( editingDomain, addCommandOwner, null, addCommandValue );
        BasicCommandStack basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();
        basicCommandStack.execute( cmd );
    }

    /**
     * Remove selected elements from this table.
     * 
     * Use a {@link DeleteCommand}, instead of a {@link REmoveCommand} as the first one also deletes references to the
     * removed objects
     */
    public void removeElements() {
        if( getSelection().isEmpty() == false ) {
            DeleteCommand deleteCommand = (DeleteCommand)DeleteCommand.create( editingDomain,
                                                                               ((IStructuredSelection)getSelection()).toList() );
            editingDomain.getCommandStack().execute( deleteCommand );
        }

    }

    /**
     * Get position of column.
     * 
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
     * Get column where a mouse down event occured.
     * 
     * @return number of active column
     */
    public int getActiveColumn() {
        return activeColumn;
    }

}
