package era.foss.objecteditor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IInputSelectionProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.nebula.widgets.compositetable.CompositeTable;
import org.eclipse.swt.nebula.widgets.compositetable.IRowContentProvider;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import era.foss.erf.ERF;
import era.foss.erf.EraToolExtension;
import era.foss.erf.ErfPackage;
import era.foss.erf.SpecObject;
import era.foss.erf.ToolExtension;
import era.foss.erf.impl.ErfFactoryImpl;
import era.foss.ui.contrib.NotifyingListSizeProperty;

public class SpecObjectCompositeViewer extends Viewer implements IInputSelectionProvider, IAllowViewerSchemaChange {

    /** selected Spec Objects */
    ISelection selectedSpecObjects;

    /** Master observable referring to the currently selected view */
    IViewerObservableValue viewMaster;

    /** ERF Model */
    ERF erfModel;

    /** ERA specific extensions */
    EraToolExtension toolExtension;

    /** top level composite of this viewer */
    Composite topLevelComposite;

    /** composite table showing the spec objects */
    CompositeTable compositeTable;

    /** Button bar for various buttons (adding elements, selecting views,... */
    Composite buttonBarComposite;

    /** editing Domain */
    EditingDomain editingDomain;

    /** Databinding context for this viewer */
    DataBindingContext dbc;

    /** The current selected SpecObjects */
    protected LinkedHashMap<Integer, SpecObject> selectedSpecObjectMap = new LinkedHashMap<Integer, SpecObject>();

    /** List of selection changed listeners of this viewer */
    List<ISelectionChangedListener> selectionChangedListeners = new LinkedList<ISelectionChangedListener>();

    /**
     * Create a Viewer for the SpecObjects
     */
    public SpecObjectCompositeViewer( Composite parent, AdapterFactoryEditingDomain editingDomain, ERF erfModel ) {
        this.editingDomain = editingDomain;
        this.erfModel = erfModel;
        this.dbc = new DataBindingContext();

        // find Era specific tool extensions
        for( ToolExtension toolExtension : this.erfModel.getToolExtensions() ) {
            if( toolExtension.eClass().getClassifierID() == ErfPackage.ERA_TOOL_EXTENSION ) {
                this.toolExtension = (EraToolExtension)toolExtension;
            }
        }
        assert (this.toolExtension != null);

        doLayout( parent );

        // binding the UI with the model
        binding();

    }

    /**
     * layout the viewer gui elements
     * 
     * @param parent
     */
    void doLayout( Composite parent ) {
        topLevelComposite = new Composite( parent, SWT.NONE );
        topLevelComposite.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        topLevelComposite.setLayout( new GridLayout( 1, false ) );

        // button bar
        createButtonBar();

        createCompositeTable();
    }

    /**
     * Create the composite table
     */
    private void createCompositeTable() {
        // composite table
        this.compositeTable = new CompositeTable( topLevelComposite, SWT.NULL | SWT.NO_SCROLL );
        this.compositeTable.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true, 0, 0 ) );

        SpecObjectViewerRow.setViewMaster( viewMaster );
        SpecObjectViewerRow.setEditingDomain( editingDomain );
        new SpecObjectViewerRow( compositeTable, SWT.NULL );

        compositeTable.setRunTime( true );
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.Viewer#getControl()
     */
    @Override
    public Control getControl() {
        return topLevelComposite;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.Viewer#refresh()
     */
    @Override
    public void refresh() {
        compositeTable.refreshAllRows();
    }

    @Override
    public void recreateViewerSchema() {

        dbc.dispose();
        viewMaster.dispose();

        buttonBarComposite.dispose();
        createButtonBar();

        compositeTable.dispose();
        createCompositeTable();

        binding();

        topLevelComposite.layout();
        // buttonBarComposite.layout();
        // viewerComposite.update();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.Viewer#getInput()
     */
    @Override
    public Object getInput() {
        // TODO implement getInput(..) which stems from IInputProvider
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.Viewer#setInput(java.lang.Object)
     */
    @Override
    public void setInput( Object input ) {
        // TODO implement setInput(..)
    }

    /**
     * A row of the composite table
     */

    /**
     * Create button bar showing:
     * <ul>
     * <li>combo box for the view</li>
     * <li>button for adding new SpecObjects</li>
     * </ul>
     * 
     * 
     * @param viewerComposite the parent composite
     * @return
     */
    private void createButtonBar() {
        buttonBarComposite = new Composite( topLevelComposite, SWT.NONE );
        buttonBarComposite.setLayout( new GridLayout( 2, true ) );
        buttonBarComposite.setLayoutData( new GridData( SWT.FILL, SWT.TOP, true, false, 0, 0 ) );

        /*
         * create combo box showing the availible views
         */
        ComboViewer viewComboViewer = new ComboViewer( buttonBarComposite, SWT.READ_ONLY ) {
            @Override
            protected void doUpdateItem( Widget data, Object element, boolean fullMap ) {
                // memorize the selection before updating the item, as the
                // update routine removes the selection...
                ISelection currentSelection = this.getSelection();
                super.doUpdateItem( data, element, fullMap );
                // set the selection to the previous value
                this.setSelection( currentSelection );
            }
        };
        ObservableListContentProvider contentProvider = new ObservableListContentProvider();
        viewComboViewer.setContentProvider( contentProvider );
        viewComboViewer.setLabelProvider( new ObservableMapLabelProvider(
            EMFProperties.value( ErfPackage.Literals.IDENTIFIABLE__LONG_NAME )
                         .observeDetail( contentProvider.getKnownElements() ) ) );
        IEMFListProperty dataTypeDefinitions = EMFProperties.list( ErfPackage.Literals.ERA_TOOL_EXTENSION__VIEWS );
        IObservableList observableList = dataTypeDefinitions.observe( toolExtension );
        viewComboViewer.setInput( observableList );
        // use first view available
        // TODO: use a dedicated default view if available
        if( toolExtension.getViews().size() > 0 ) {
            viewComboViewer.setSelection( new StructuredSelection( toolExtension.getViews().get( 0 ) ) );
        }
        viewComboViewer.getControl().setLayoutData( new GridData( SWT.LEFT, SWT.CENTER, true, false ) );

        viewMaster = ViewerProperties.singleSelection().observe( viewComboViewer );

        // refresh composite table in case view has been changed
        viewMaster.addChangeListener( new IChangeListener() {

            @Override
            public void handleChange( ChangeEvent event ) {
                dbc.dispose();

                compositeTable.dispose();
                createCompositeTable();

                binding();

                topLevelComposite.layout();
            }
        } );

        /*
         * create add button
         */
        Button addButton = new Button( buttonBarComposite, SWT.NONE );
        addButton.setImage( PlatformUI.getWorkbench().getSharedImages().getImage( ISharedImages.IMG_OBJ_ADD ) );
        addButton.setLayoutData( new GridData( SWT.RIGHT, SWT.CENTER, true, false ) );
        addButton.addSelectionListener( new SelectionAdapter() {
            @Override
            public void widgetSelected( SelectionEvent e ) {
                SpecObjectCompositeViewer.this.createNewSpecObject();
            }
        } );

    }

    /**
     * Bind composite table and rows of composite table to data model. Also handle selection events from the composite
     * table
     */
    private void binding() {

        dbc.bindValue( PojoObservables.observeValue( compositeTable, "numRowsInCollection" ),
                       new NotifyingListSizeProperty().observe( erfModel.getCoreContent().getSpecObjects() ),
                       new UpdateValueStrategy( UpdateValueStrategy.POLICY_NEVER ),
                       new UpdateValueStrategy() );

        compositeTable.addRowContentProvider( new SpecObjectRowContentProvider() );
    }

    /** Delete a SpecObject */
    private void deleteSpecObject( SpecObject specObject ) {
        Command deleteCommand = new DeleteCommand( editingDomain, new StructuredSelection( specObject ).toList() );
        editingDomain.getCommandStack().execute( deleteCommand );

    }

    /** Add a new SpecObject */
    private void createNewSpecObject() {
        EObject newSpecObject = ErfFactoryImpl.eINSTANCE.create( ErfPackage.Literals.SPEC_OBJECT );
        Command cmd = AddCommand.create( editingDomain,
                                         erfModel.getCoreContent(),
                                         ErfPackage.CONTENT__SPEC_OBJECTS,
                                         newSpecObject );
        CommandStack commandStack = editingDomain.getCommandStack();
        commandStack.execute( cmd );
    }

    @Override
    public void addSelectionChangedListener( ISelectionChangedListener listener ) {
        if( selectionChangedListeners.contains( listener ) ) return;
        selectionChangedListeners.add( listener );
    }

    @Override
    public void removeSelectionChangedListener( ISelectionChangedListener listener ) {
        selectionChangedListeners.remove( listener );
    }

    @Override
    public ISelection getSelection() {
        if( selectedSpecObjectMap.size() == 0 ) {
            return StructuredSelection.EMPTY;
        }
        return new StructuredSelection( selectedSpecObjectMap.values().toArray() );
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setSelection( ISelection selection, boolean reveal ) {
        if( selection.isEmpty() ) {
            return;
        }

        // unpack ISelection into SpecObject
        assert (selection instanceof StructuredSelection);

        // remove all Spec Objects
        selectedSpecObjectMap.clear();

        Integer selectedSpecOjectOffset = null;

        // set selectedSpecObject to given one
        for( SpecObject specObject : ((List<SpecObject>)((StructuredSelection)selection).toList()) ) {
            int specOjectOffset = erfModel.getCoreContent().getSpecObjects().indexOf( specObject );
            if( selectedSpecOjectOffset == null ) {
                selectedSpecOjectOffset = specOjectOffset;
            }

            selectedSpecObjectMap.put( specOjectOffset, specObject );
        }

        // if specObject is not yet displayed in the composite table show it in the first row
        if( selectedSpecOjectOffset < compositeTable.getTopRow()
            || selectedSpecOjectOffset > (compositeTable.getTopRow() + compositeTable.getNumRowsVisible()) ) {
            compositeTable.setTopRow( selectedSpecOjectOffset );
            updateRowSelectionStatus( true );
        } else {
            updateRowSelectionStatus( false );
        }

    }

    /**
     * Update the selection status of all rows controls
     */
    private void updateRowSelectionStatus( boolean setFocus ) {
        for( Control control : compositeTable.getRowControls() ) {
            SpecObjectViewerRow row = (SpecObjectViewerRow)control;
            row.setSelected( selectedSpecObjectMap.containsKey( row.getSpecObjectOffset() ), setFocus );
        }
    }

    /**
     * Content Provider for Row in the Composite table
     */
    private class SpecObjectRowContentProvider implements IRowContentProvider {

        /**
         * Keeps a reference of each delete listener for each row, so we can remove a listener when compositetable
         * associate the row to another SpecObject.
         */
        private Map<SpecObjectViewerRow, MouseListener> deleteListenerMap = new HashMap<SpecObjectViewerRow, MouseListener>();

        /**
         * Keeps a reference of each selection listener for each row, so we can remove a listener when compositetable
         * associate the row to another SpecObject.
         */
        private Map<SpecObjectViewerRow, SelectionListener> selectionListenerMap = new HashMap<SpecObjectViewerRow, SelectionListener>();

        /**
         * remove and add selectionlistener bind new SpecObject to Row
         */
        public void refresh( CompositeTable sender, final int currentObjectOffset, Control rowControl ) {

            final SpecObjectViewerRow currentRow = (SpecObjectViewerRow)rowControl;
            final SpecObject currentSpecObject = erfModel.getCoreContent().getSpecObjects().get( currentObjectOffset );

            // unbind
            // currentRow.unbind();

            // remove previous listener if nay
            if( deleteListenerMap.get( currentRow ) != null ) {
                currentRow.getDeleteButton().removeMouseListener( deleteListenerMap.get( currentRow ) );
                currentRow.removeSelectionListener( selectionListenerMap.get( currentRow ) );
            }

            // set offset of the current specObject
            currentRow.setSpecObject( currentSpecObject, currentObjectOffset );

            // bind the new SpecObject
            currentRow.bind( currentSpecObject );

            // in case the specObject is selected set the selected status of the row
            currentRow.setSelected( selectedSpecObjectMap.containsKey( currentObjectOffset ), false );

            // listener for the delete button of the row
            MouseListener deleteListener = new MouseAdapter() {
                @Override
                public void mouseDown( MouseEvent e ) {
                    SpecObjectCompositeViewer.this.deleteSpecObject( currentSpecObject );
                }
            };

            // listener for selection events of a row
            SelectionListener selectionListener = new SelectionAdapter() {
                @Override
                public void widgetSelected( SelectionEvent e ) {
                    // SHIFT is not pressed: set selection to the SpecObject associated with the current row
                    if( (e.stateMask & SWT.SHIFT) == 0
                        || SpecObjectCompositeViewer.this.selectedSpecObjectMap.isEmpty() ) {
                        SpecObjectCompositeViewer.this.selectedSpecObjectMap.clear();
                        SpecObjectCompositeViewer.this.selectedSpecObjectMap.put( currentObjectOffset,
                                                                                  currentSpecObject );
                    }
                    // SHIFT is pressed: add all elements between the selected SpecObject and the SpecObject
                    // associated with the current row
                    else {
                        int selectedSpecObjectOffset = (Integer)selectedSpecObjectMap.keySet().toArray()[0];

                        int objectOffset = Math.min( currentObjectOffset, selectedSpecObjectOffset );
                        int objectEndOffset = Math.max( currentObjectOffset, selectedSpecObjectOffset );
                        while (objectOffset <= objectEndOffset) {
                            SpecObjectCompositeViewer.this.selectedSpecObjectMap.put( objectOffset,
                                                                                      erfModel.getCoreContent()
                                                                                              .getSpecObjects()
                                                                                              .get( objectOffset ) );
                            objectOffset++;
                        }
                    }

                    // Only set the focus in case the event is sent by a composite
                    boolean setFocus = e.widget instanceof Composite;

                    // update the selection status of the row controls
                    SpecObjectCompositeViewer.this.updateRowSelectionStatus( setFocus );
                }
            };

            // add listener to row
            currentRow.getDeleteButton().addMouseListener( deleteListener );
            currentRow.addSelectionListener( selectionListener );

            // keep a reference to the listeners to be able to remove it
            // during the next refresh
            deleteListenerMap.put( currentRow, deleteListener );
            selectionListenerMap.put( currentRow, selectionListener );
        }
    }
}
