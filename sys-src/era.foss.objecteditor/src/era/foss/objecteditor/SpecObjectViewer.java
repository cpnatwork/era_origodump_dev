/**
 * <copyright>
 *
 * Copyright (c) 2010 'Three Good Friends' (3GF).
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Georg Blaschke 
 *   Christoph P. Neumann  
 *   Bernd Haberstumpf
 *
 * </copyright>
 *
 * $Id$
 */
package era.foss.objecteditor;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TableViewerEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import era.foss.rif.AttributeDefinition;
import era.foss.rif.AttributeDefinitionSimple;
import era.foss.rif.AttributeValue;
import era.foss.rif.AttributeValueSimple;
import era.foss.rif.RIF;
import era.foss.rif.RifPackage;
import era.foss.rif.SpecObject;
import era.foss.rif.SpecType;
import era.foss.rif.impl.RifFactoryImpl;
import era.foss.ui.contrib.IActiveColumn;
import era.foss.ui.contrib.TableViewerExtensions;


//SuppressWarnings("restriction")
public class SpecObjectViewer extends TableViewer implements IActiveColumn {

    final static String SPEC_ATTRIBUTE_COLUMN_DATA = "Spec Attribute";

    protected AdapterFactoryEditingDomain editingDomain = null;
    protected Resource rifResource = null;
    protected RIF rifModel = null;
    protected EraCommandStack eraCommandStack = null;
    protected AdapterFactory adapterFactory = null;
    


    protected int activeColumn;

    public SpecObjectViewer( Composite parent, IEditorPart rifObjectEditor ) {
        super( parent, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION );
        // CPN: use casts to avoid direct dependencies to the generated Rif*Editor class(es)
        this.editingDomain = (AdapterFactoryEditingDomain) ((IEditingDomainProvider)rifObjectEditor).getEditingDomain();
        this.adapterFactory = ((IAdapterFactoryProvider)rifObjectEditor).getAdapterFactory();
        this.rifResource = (XMIResource)editingDomain.getResourceSet()
                                                     .getResource( EditUIUtil.getURI( rifObjectEditor.getEditorInput() ),
                                                                   true );
        this.rifModel = (RIF)(rifResource).getContents().get( 0 );
    }
   
    
    private void setupTableViewer() {

        Table table = this.getTable();
        TableLayout layout = new TableLayout();
        table.setLayout( layout );
        table.setHeaderVisible( true );
        table.setLinesVisible( true );

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

        // create columns
        create_columns();

        this.setContentProvider( new SpecObjectContentProvider( this.adapterFactory ) );

        // TODO: Is this really the right place to adapt ALL elements ???
        rifModel.getCoreContent().eAdapters().add( new ViewerRefreshEContentAdapter() );

        //enable tooltips
        ColumnViewerToolTipSupport.enableFor(this,ToolTip.NO_RECREATE);
        
        // create context menu
        createContextMenu();
        
        //add key press listeners
        addKeyListerner();
        
        // add detection for active column
        TableViewerExtensions.addActiveColumnDetection( this );
            
        this.setInput( rifModel.getCoreContent().getSpecObjects() );
    }




    /**
     * Recreate columns for the spec Object viewer
     */
    public void recreate_columns() {
        for( TableColumn column : this.getTable().getColumns() ) {
            column.dispose();
        }
        this.create_columns();
        this.refresh();
    }
    
    /**
     * Create columns for the spec Object viewer
     */
    private void create_columns() {
        
    	// in case we don't have a spec type don't create columns
    	if (rifModel.getCoreContent().getSpecTypes().isEmpty())
    	{
    		return;
    	}
    	
    	// get attributes for the spec object
        // Remark: currently we only have one specType
        SpecType specType = rifModel.getCoreContent().getSpecTypes().get( 0 );
        EList<AttributeDefinition> specAttributeList = specType.getSpecAttributes();

        for( AttributeDefinition attribute : specAttributeList ) {
            TableViewerColumn column = new TableViewerColumn( this, SWT.NONE );
            column.getColumn().setText( attribute.getLongName() );
            column.getColumn().setResizable( true );
            column.getColumn().setMoveable( true );
            column.getColumn().setWidth( 100 );
            column.getColumn().setData( SPEC_ATTRIBUTE_COLUMN_DATA, attribute );
            column.setEditingSupport( new SpecObjectEditingSupport( this, attribute ) );
            column.setLabelProvider( new SpecObjectLabelProvider( attribute ) );
        }

    }
    
    private void createContextMenu() {

        
        /**
         * Action for removing a value from a spec object
         * 
         * From the point of the user this will be seen as
         * setting a value to it respective default value 
         */
        final class RemoveValueAction extends Action {
            
            // data already computed before adding the action to the menu
            private IStructuredSelection selection;
            private AttributeDefinition attributeDefinition;
            
            public RemoveValueAction(IStructuredSelection selection, AttributeDefinition attributeDefinition)
            {
               this.setText( "Restore default value" );
               this.setImageDescriptor( era.foss.ui.contrib.Activator.getViewImageDescriptor("elcl16/defaults_ps.gif"));
               this.selection = selection;
               this.attributeDefinition = attributeDefinition;

            }

            @Override
            public void run() {
                // remove attribute values of all spec object in selection
                for( Object specObject : selection.toArray() ) {
                    AttributeValue value = SpecObjectViewer.this.getSpecObjectValue( (SpecObject)specObject, attributeDefinition );
                    if ( value != null){
                        SpecObjectViewer.this.removeAttributeValue( value );
                    }
                }
            }
        }
        
        /**
         * Action for creating a new specObject
         */
        final class AddElementAction extends Action {
            
            // data already computed before adding the action to the menu
            private IStructuredSelection selection;
 
            public AddElementAction( IStructuredSelection selection ) {
                this.setText( "Add new object" );
                this.selection = selection;
                this.setImageDescriptor( PlatformUI.getWorkbench()
                                                   .getSharedImages()
                                                   .getImageDescriptor( ISharedImages.IMG_OBJ_ADD ) );
            }

            @Override
            public void run() {
               SpecObjectViewer.this.addSpecObectElement(selection);
            }
        }
        
        /**
         * Action for removing specObjects
         */
        final class RemoveElementAction extends Action {
            
            // data already computed before adding the action to the menu
            private IStructuredSelection selection;
            
            public RemoveElementAction( IStructuredSelection selection){
               this.setText( "Remove elements" );
               this.setImageDescriptor( PlatformUI.getWorkbench()
                                        .getSharedImages()
                                        .getImageDescriptor( ISharedImages.IMG_TOOL_DELETE ) );
               this.selection = selection;
            }
            @Override
            public void run() {
               SpecObjectViewer.this.removeSpecObjectElements(selection);
            }
        }

        final MenuManager menuMgr = new MenuManager();
        menuMgr.setRemoveAllWhenShown( true );

        menuMgr.addMenuListener( new IMenuListener() {
            /*
             * (non-Javadoc)
             * 
             * @see org.eclipse.jface.action.IMenuListener#menuAboutToShow(org.eclipse.jface.action.IMenuManager)
             */
            public void menuAboutToShow( IMenuManager manager ) {
               
                // get selected elements
                IStructuredSelection selection = (IStructuredSelection)SpecObjectViewer.this.getSelection();
                
                // action for adding new elements
                // selection might be empty (element is appeneded then)
                menuMgr.add( new AddElementAction(selection) );
                
                if (selection.isEmpty()){
                    return;
                }
                
                // remove element action
                menuMgr.add( new RemoveElementAction(selection) );
                
                //
                // Context menu entry for setting to default value
                //
                
                // get current column
                int columnIndex = getActiveColumn();
                // get attribute definition shown in this column
                AttributeDefinition attributeDefinition = (AttributeDefinition)SpecObjectViewer.this.getColumnViewerOwner( columnIndex ).getData( SPEC_ATTRIBUTE_COLUMN_DATA );
                
                // remove show menu only if first element of selection has a value
                SpecObject specObject = (SpecObject) selection.getFirstElement();
                AttributeValue value = SpecObjectViewer.this.getSpecObjectValue(specObject, attributeDefinition );
                if (value != null){
                    menuMgr.add( new RemoveValueAction(selection,attributeDefinition) );
                }
                
            }
        } );
        // register menu at the table viewer
        SpecObjectViewer.this.getControl().setMenu( menuMgr.createContextMenu( SpecObjectViewer.this.getControl() ) );
    }
    
    
    private void addKeyListerner() {
        // add key listener
        this.getTable().addKeyListener( new KeyListener() {

            public void keyPressed( KeyEvent e ) {
                if( e.character == SWT.DEL ) {
                    SpecObjectViewer.this.removeSpecObjectElements( (IStructuredSelection) SpecObjectViewer.this.getSelection());
                }
                else if( e.stateMask == SWT.CTRL  &&  (e.character == SWT.LF || e.character == SWT.CR)) {
                    SpecObjectViewer.this.addSpecObectElement( (IStructuredSelection) SpecObjectViewer.this.getSelection() );
                }
            }

            @Override
            public void keyReleased( KeyEvent e ) {
                /* do nothing */
            }
        } );

    }

    /**
     * Remove selected spec objects
     * @param selection 
     */
    private void removeSpecObjectElements( IStructuredSelection selection ) {
        Command removeCommand = RemoveCommand.create( editingDomain, selection.toList() );
        editingDomain.getCommandStack().execute( removeCommand );
        this.refresh();
    }


    /**
     * Add spec object
     */
    private void addSpecObectElement(IStructuredSelection selection) {
        SpecObject newSpecObject = RifFactoryImpl.eINSTANCE.createSpecObject();
        
        // Currently we only have one spec type
        newSpecObject.setType( rifModel.getCoreContent().getSpecTypes().get( 0 ) );
        Command cmd = AddCommand.create( editingDomain, rifModel.getCoreContent(), null, newSpecObject );   
        BasicCommandStack basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();
        basicCommandStack.execute( cmd );
        this.refresh();
    }

    /**
     * Provide data for table containing spec objects
     */
    public class SpecObjectContentProvider extends AdapterFactoryContentProvider {

        public SpecObjectContentProvider( AdapterFactory adapterFactory ) {
            super( adapterFactory );
        }

        // get elements shown in the table viewer holding S
        public Object[] getElements( Object object ) {

            SpecObject[] objects;
            try {
                objects = (SpecObject[])rifModel.getCoreContent().getSpecObjects().toArray();
            } catch( NullPointerException e ) {
                objects = new SpecObject[0];
            }
            return objects;
        }
        
        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );

//            PopupFactory factory = PopupFactory.getSharedInstance();
//            JTextArea jtext = new JTextArea();
//            jtext.append( this.getClass().getCanonicalName()+ ": \n" );
//            jtext.append( notification.toString() );
//            Popup popup = factory.getPopup(null, jtext , 0, 0);
//            popup.show();
//            popup.hide();
            
            System.out.println("== " + this.getClass().getCanonicalName());
            System.out.println(notification.toString() );
//            
//            handleInstanceLevel( notification );
//            handleTypeLevel( notification );
        }

    }

    /**
     * An Adapter that triggers viewer refreshs.
     * <p>
     * It is derived from EContentAdapter that auto-adapts all new objects
     * 
     * @author cpn
     */
    public class ViewerRefreshEContentAdapter extends EContentAdapter {
        
       
         

        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );

            // We need the ViewerRefreshEContentAdapter (VRCA) because 
            // the SpecObjectContentProvider (SOCP) will only be notified based on
            // ViewerNotifications. These are wrappers around the original Notification.
            // Yet, more important, they will only be fired if the EObject has already
            // been selected in the Viewer once (the ItemProvider will only then be 
            // adapted to the EObject. 
            
            System.out.println("== " + this.getClass().getCanonicalName());
            System.out.println(notification.toString() );
        }
    }
    
    
    

    /**
     * Provide label for data of table containing SpecTypes
     */
    public class SpecObjectLabelProvider extends ColumnLabelProvider {

        private Color ColorDefaultValueBg = null;
        /**
         * The attribute definition for this label provider * Required for getting the defatult value in case no value is
         * defined
         */
        private AttributeDefinition attributeDefinition;
        
        public SpecObjectLabelProvider( AttributeDefinition attributeDefinition ) {
            this.attributeDefinition = attributeDefinition;
            ColorDefaultValueBg = new Color (Display.getCurrent (), 140, 170, 210);
        }


        @Override
        public void dispose()
        {
            ColorDefaultValueBg.dispose();
            super.dispose();
        }
        
        /**
         * get the attribute definition for this column
         * 
         * @return
         */
        public AttributeDefinition getAttributeDefinition() {
            return attributeDefinition;
        }
        
        public Image getImage(AttributeValue value, Diagnostic diagnostic)
        {
            Image image = null;
            
            /* show error image in case validation of value fails */
            if( diagnostic != null && diagnostic.getSeverity() == Diagnostic.ERROR ) {
                image = PlatformUI.getWorkbench().getSharedImages().getImage( ISharedImages.IMG_OBJS_ERROR_TSK );
            }
            return image;
        }
        
        @Override
        public String getToolTipText(Object element)
        {
            String text = null;
            /* show */
            AttributeValue value = SpecObjectViewer.this.getSpecObjectValue( (SpecObject) element, attributeDefinition );
            if (value != null){
                Diagnostic diagnostic = Diagnostician.INSTANCE.validate( value );
                if(diagnostic.getSeverity() == Diagnostic.ERROR ) {
                    text = diagnostic.getChildren().get(0).getMessage();
                }
            }
            return text;
        }

        @Override
        /**
         * Show tooltip if validation fails
         */
        public Image getToolTipImage(Object element)
        {
            Image image = null;
            
            AttributeValue value = SpecObjectViewer.this.getSpecObjectValue( (SpecObject) element, attributeDefinition );
            
            /* show error image in case validation of value fails */
            if (value != null){
                Diagnostic diagnostic = Diagnostician.INSTANCE.validate(value );
                if(diagnostic.getSeverity() == Diagnostic.ERROR ) {
                    image = PlatformUI.getWorkbench().getSharedImages().getImage( ISharedImages.IMG_OBJS_ERROR_TSK );
                }
            }
            return image;
        }
        
        
        /** show different background color if value is 
         * has default value (i.e. it is not present)
         */
        public Color getBackground(AttributeValue value){
            Color backgroundColor = null;
            if( value == null ) {
                backgroundColor = ColorDefaultValueBg;
            }
            return backgroundColor;
        }
        
        @Override
        public void update(ViewerCell cell) {
            SpecObject specObject = (SpecObject) cell.getElement();
            AttributeValue value = SpecObjectViewer.this.getSpecObjectValue( specObject, attributeDefinition );
            
            Diagnostic diagnostic = null;
            if (value != null){
                diagnostic = Diagnostician.INSTANCE.validate( value );
            }
            
            cell.setText(SpecObjectViewer.this.getSpecObjectValueString( value, attributeDefinition ));
            cell.setImage(getImage(value,diagnostic));
            cell.setBackground(getBackground(value));
        }

    }

    /**
     * Editing support for Table holding the attribute definitions
     * 
     * @param viewer
     * @param column
     */
    public class SpecObjectEditingSupport extends EditingSupport {
        private CellEditor cellEditor;
        private BasicCommandStack basicCommandStack;

        /** Attribute defintion shown in this column */
        AttributeDefinition attributeDefinition;

        public SpecObjectEditingSupport( ColumnViewer viewer, AttributeDefinition attributeDefinition ) {
            super( viewer );
            this.attributeDefinition = attributeDefinition;
            basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();

            // create cell editor according to AttributeDefinition types
            if( attributeDefinition instanceof AttributeDefinitionSimple ) {
                this.cellEditor = new TextCellEditor( ((TableViewer)viewer).getTable() );
            }
        }

        @Override
        protected boolean canEdit( Object element ) {
            return true;
        }

        @Override
        protected CellEditor getCellEditor( Object element ) {
            return this.cellEditor;
        }

        @Override
        protected Object getValue( Object element ) {
            SpecObject specObject = (SpecObject)element;
            AttributeValue value = SpecObjectViewer.this.getSpecObjectValue( specObject, attributeDefinition );
            return SpecObjectViewer.this.getSpecObjectValueString(value,attributeDefinition);
        }

        @Override
        protected void setValue( Object element, Object value ) {
            SpecObject specObject = (SpecObject)element;

            if( attributeDefinition instanceof AttributeDefinitionSimple ) {
                setValueAttributeDefintionSimple( specObject, value );
            }

        }

        private void setValueAttributeDefintionSimple( SpecObject specObject, Object editorValue ) {

            AttributeDefinitionSimple attributeDefinition = (AttributeDefinitionSimple)this.attributeDefinition;
            AttributeValueSimple attributeValue = null;

            // check if the spec object provides a value for this column/attribute
            for( AttributeValue attributeValueIter : specObject.getValues() ) {
                if( attributeValueIter instanceof AttributeValueSimple ) {
                    if( attributeDefinition.equals( ((AttributeValueSimple)attributeValueIter).getDefinition() ) ) {
                        attributeValue = (AttributeValueSimple)attributeValueIter;
                    }
                }
            }

            // SpecObject has no Attribute Value for this Attribute Definition
            if( attributeValue == null ) {
                // create an Attribute Value
                attributeValue = RifFactoryImpl.eINSTANCE.createAttributeValueSimple();

                // set reference to the respecitive Attribute Definition
                attributeValue.setDefinition( attributeDefinition );
                // set value of attribute definition
                attributeValue.setTheValue( (String)editorValue );

                // create new Attribute value in the model
                Command cmd = AddCommand.create( editingDomain,
                                                 specObject,
                                                 RifPackage.SPEC_OBJECT__VALUES,
                                                 attributeValue );
                basicCommandStack.execute( cmd );
                SpecObjectViewer.this.update( specObject, null );

            }

            // don't update the model
            // if the value is identical to current value of the spec object
            else if( editorValue == attributeValue.getTheValue() ) {
                return;
            } 
            
            // The value in the editor and the model differ: set value in the model
            else
            {
                // The set command does not work when the object is created via the
                // create() method. Reason: Due to a bug the 'feature Id' is not passed
                // to the command. Therefore the execution fails.
                Command cmd = new SetCommand(
                    editingDomain,
                    attributeValue,
                    attributeValue.eClass().getEStructuralFeature( RifPackage.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE ),
                    editorValue );

                basicCommandStack.execute( cmd );
                SpecObjectViewer.this.update( specObject, null );
            }
        }
    }

    // Helper for using the SpecObjectViewer from its viewer pane
    public void setup() {
        setupTableViewer();
    }

    /**
     * get the string representation of a spec object for a certain attribute Definition
     * 
     * in case no attribute value has been set search for the default
     * value given for the attribute definition
     * 
     * in case no default value is specified return the empty string 
     * 
     * @param specObject of which the attribute value is taken
     * @param attributeDefinition of which the value is taken
     * @return String holding the value of spec object
     */
    private String getSpecObjectValueString( AttributeValue value, AttributeDefinition attributeDefinition ) {

        // return an empty string in case we find no value nor default value
        String valueString = "";

        // Handle simple attribute values
        if( attributeDefinition instanceof AttributeDefinitionSimple ) {
            // get attribute value according to the attribute definition

            // if value is not set try to use default value (if available)
            if( value == null ) {
                value = ((AttributeDefinitionSimple)attributeDefinition).getDefaultValue();
            }

            // get string if value object is defined
            if( value != null ) {
                valueString = ((AttributeValueSimple)value).getTheValue();
            }
        }

        return valueString;
    }
    
    /**
     * Find the attribte value object of SpecObject for a certain attribute definition
     * 
     * @param specObject
     * @param attributeDefinition
     * @return <ul><li>attribute value</li><li><code>null</code> in case on attribute value has been found</li>
     */
    private AttributeValue getSpecObjectValue( SpecObject specObject, AttributeDefinition attributeDefinition ) {

        AttributeValue value = null;
        // check if the spec object provides a value for this column/attribute
        for( AttributeValue valueIter : specObject.getValues() ) {
            if( valueIter instanceof AttributeValueSimple ) {
                if( attributeDefinition.equals( ((AttributeValueSimple)valueIter).getDefinition() ) ) {
                    value = valueIter;
                }
            }
        }
        return value;
    }
    
    /**
     * remove attribute value of spec object
     * 
     * @param value object to be removed
     */
    private void removeAttributeValue( AttributeValue value ) {
        BasicCommandStack basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();
        Command cmd = RemoveCommand.create( editingDomain, value );
        basicCommandStack.execute( cmd );
    }
    
    

    
    /**
     * Get column where a mouse down event occured
     * 
     * @return number of active column
     */
    public int getActiveColumn() {
        return activeColumn;
    }
    
    /**
     * Set active column
     */
    public void setActiveColumn(int activeColumn) {
       this.activeColumn = activeColumn;
    }

}
