/*
 * NAME: era.foss.typeeditor.SpecTypeForm
 */

package era.foss.typeeditor;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import era.foss.rif.AttributeDefinition;
import era.foss.rif.AttributeDefinitionSimple;
import era.foss.rif.AttributeValueSimple;
import era.foss.rif.DatatypeDefinition;
import era.foss.rif.RifPackage;
import era.foss.rif.SpecType;
import era.foss.rif.impl.RifFactoryImpl;

/**
 * A form for editing the {@link SpecType}.
 * <p>
 * At the moment there exists exactly one {@link SpecType} in an ERA RIF model. The form holds a reference to this
 * single {@link SpecType}.
 * <p>
 * Each {@link SpecType} essentially consists of list of {@link AttributeDefinition}s which have a
 * {@link DatatypeDefinition} as well as an optional defaultValue in form of an {@link AttributeValueSimple}.
 * <p>
 * From the perspective of presentation & editing, the three classes are visually merged into a three-column table.
 * <p>
 * The inner class {@link .AttributesAdapterFactoryContentProvider} is registered to the {@link AddDeleteTableViewer}
 * and extracts all {@link AttributeDefinition}s for a {@link SpecType} from the RIF model -- by the {@link SpecType}'s
 * reference named "specAttributes".
 * <p>
 * The inner class {@link .AttributesLabelProvider} is registered to the {@link AddDeleteTableViewer} and provides the
 * cell values from the {@link AttributeDefinition} element.
 * 
 * @author cpn
 * 
 * @see SpecType
 * @see AttributeDefinition
 * @see AttributeValueSimple
 */
public class SpecTypeForm extends AbstractErfTypesForm {

    // for now the one and only spec type
    private SpecType theOneAndOnlySpecType;

    /**
     * Table viewer holding the attributes of a spec type
     */
    private AddDeleteTableViewer tableViewer;

    public SpecTypeForm( Composite parent, IEditorPart editor ) {
        super( parent, editor, SWT.NONE );

        // check for and eventually initialize the sole SpecType
        // TODO: we could remove this default spectype creation (the new filewizard handles it)
        if( rifModel.getCoreContent().getSpecTypes().size() == 0 ) {
            Command addCommand = AddCommand.create( editingDomain,
                                                    rifModel.getCoreContent(),
                                                    null,
                                                    RifFactoryImpl.eINSTANCE.createSpecType() );
            eraCommandStack.execute( addCommand );
        }
        theOneAndOnlySpecType = (SpecType)rifModel.getCoreContent().getSpecTypes().get( 0 );

        // set-up layout
        GridLayout gridLayout = new GridLayout( 1, true );
        this.setLayout( gridLayout );

        // set up table viewer for attribute definitions
        createTableViewer();

        // Context menu for creating Elements of default values
        createContextMenu();
    }

    /**
     * Provide data for table which contains {@link AttributeDefinition} elements of the {@link SpecType}.
     */
    public class AttributeDefinitionContentProvider extends AdapterFactoryContentProvider {
        public AttributeDefinitionContentProvider( AdapterFactory adapterFactory ) {
            super( adapterFactory );
        }

        // get elements shown in the table viewer holding Attribute defintions
        public Object[] getElements( Object object ) {

            AttributeDefinition[] objects;
            try {
                objects = (AttributeDefinition[])theOneAndOnlySpecType.getSpecAttributes().toArray();
            } catch( NullPointerException e ) {
                objects = new AttributeDefinition[0];
            }
            return objects;
        }

        // handle changes relevant to the table (not the combo box)
        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );

            // SYNCHRONIZE/LISTEN TO CHANGE FROM THE DatytypeDefinitionForm !!

            // CASE: a changed DatatypeDefinition (caused in DatatypeDefinitionForm)
            if( (notification.getNotifier() instanceof DatatypeDefinition)
                && (notification.getEventType() == Notification.SET) ) {
                // refresh the tableViewer (e.g. the name of the datatypye definition has changed => all rows must
                // update)
                super.viewer.refresh();
            }

            // CASE: a plain new available DatatypeDefinition
            // CASE: a type-changed DatatypeDefinition (because ReplaceCommand also triggers ADD as its 2nd step)
            if( (notification.getNewValue() instanceof DatatypeDefinition)
                && (notification.getEventType() == Notification.ADD) ) {
                // refresh the table
                super.viewer.refresh();
            }

            // CASE: a deleted DatatypeDefinition
            // CASE: a type-changed DatatypeDefinition (because ReplaceCommand also triggers REMOVE as its 1st step)
            if( (notification.getOldValue() instanceof DatatypeDefinition)
                && (notification.getEventType() == Notification.REMOVE) ) {
                // refresh the table (probably this is not necessary)
                super.viewer.refresh();
            }

            // SYNCHRONIZE/LISTEN TO CHANGE FROM THE SpecTypeForm ITSELF !!

            // Viewer.refresh()s are triggered by the AddDeleteTableViewer class

            // INFO: REMOVEs are handled by the AddDeleteTableViewer

        }
    }

    /**
     * Provide label for data of table containing SpecTypes
     */
    public class AttributeDefinitionLabelProvider extends LabelProvider implements ITableLabelProvider {

        @Override
        public String getColumnText( Object element, int columnIndex ) {
            AttributeDefinition attribute = (AttributeDefinition)element;
            String retVal = "";
            switch (columnIndex) {
            case 0:
                retVal = attribute.getLongName();
                break;
            case 1:
                DatatypeDefinition type = attribute.getType();
                // special action for "fresh & uninitialized": show nothing
                if( type == null ) break;
                // main action: show long name
                retVal = type.getLongName();
                break;
            case 2:
                /* in case a default value is avaialble show the value of
                 * the default value otherwise show 'n/a'
                 */
                retVal = "n/a";
                assert (attribute instanceof AttributeDefinitionSimple);
                AttributeValueSimple defaultValue = ((AttributeDefinitionSimple)attribute).getDefaultValue();
                if( defaultValue == null ){
                    break;
                }
                retVal = defaultValue.getTheValue();
                break;

            default:
                throw new RuntimeException( "Should not happen" );
            }
            return retVal;
        }

        @Override
        public Image getColumnImage( Object element, int columnIndex ) {
            Image image = null;
            AttributeDefinition attribute = (AttributeDefinition)element;
            if( columnIndex == 2 ) {
                /* show error image in case validation of default value fails */
                AttributeValueSimple value = ((AttributeDefinitionSimple)attribute).getDefaultValue();
                if( value != null ) {
                    Diagnostic diagnostic = Diagnostician.INSTANCE.validate( value );
                    if( diagnostic.getSeverity() == Diagnostic.ERROR ) {
                        image = PlatformUI.getWorkbench()
                                          .getSharedImages()
                                          .getImage( ISharedImages.IMG_OBJS_ERROR_TSK );
                    }
                }
            }
            return image;
        }
        
    }

    /**
     * Content provider for the combo box
     */
    public class DatatypesComboContentProvider extends AdapterFactoryContentProvider {

        public DatatypesComboContentProvider( AdapterFactory adapterFactory, Viewer viewer ) {
            super( adapterFactory );
            this.viewer = viewer;
        }

        // get elements which are show in the combobox
        public Object[] getElements( Object object ) {

            DatatypeDefinition[] dataTypes;
            try {
                dataTypes = (DatatypeDefinition[])rifModel.getCoreContent().getDataTypes().toArray();
            } catch( NullPointerException e ) {
                dataTypes = new DatatypeDefinition[0];
            }
            return dataTypes;
        }

        // handle changes relevant to the combo box (not the table)
        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );

            // SYNCHRONIZE/LISTEN TO CHANGE FROM THE DatytypeDefinitionForm !!

            // CASE: a changed DatatypeDefinition (caused in DatatypeDefinitionForm)
            if( (notification.getNotifier() instanceof DatatypeDefinition)
                && (notification.getEventType() == Notification.SET) ) {
                // refresh this combo box [there is only one instance of the Combo Box (and this, its Content Provider)
                // namely for the column]
                super.viewer.refresh();
            }

            // CASE: a plain new available DatatypeDefinition
            // CASE: a type-changed DatatypeDefinition (because ReplaceCommand also triggers ADD)
            if( (notification.getNewValue() instanceof DatatypeDefinition)
                && (notification.getEventType() == Notification.ADD) ) {
                // refresh the table (probably this is not necessary)
                super.viewer.refresh();
            }

            // CASE: a deleted DatatypeDefinition
            // CASE: a type-changed DatatypeDefinition (because ReplaceCommand also triggers REMOVE)
            if( (notification.getOldValue() instanceof DatatypeDefinition)
                && (notification.getEventType() == Notification.REMOVE) ) {
                // refresh the table (probably this is not necessary)
                super.viewer.refresh();
            }

        }

    }

    /**
     * Label provider for the Combo box
     */
    public class DatatypesComboLabelProvider extends LabelProvider implements IBaseLabelProvider {

        @Override
        public String getText( Object element ) {
            return ((DatatypeDefinition)element).getLongName();
        }
    }

    
    public class CellEditorAttributeValueValidator implements ICellEditorValidator
    {
        @Override
        public String isValid( Object value ) {
            // TODO Auto-generated method stub
            return null;
        }
    }
    
    
    /**
     * Editing support for Table holding the attribute definitions
     * 
     * @param viewer
     * @param column
     */
    public class AttributeDefinitionEditingSupport extends EditingSupport {
        private CellEditor cellEditor;
        private int column;

        public AttributeDefinitionEditingSupport( ColumnViewer viewer, int column ) {
            super( viewer );
            this.column = column;

            // Create the correct editor based on the column index
            switch (column) {
            case 0:
                this.cellEditor = new TextCellEditor( ((TableViewer)viewer).getTable() );
                break;
            case 1:
                ComboBoxViewerCellEditor comboCellEditor = new ComboBoxViewerCellEditor(
                    ((TableViewer)viewer).getTable(),
                    SWT.READ_ONLY );
                comboCellEditor.setContenProvider( new DatatypesComboContentProvider(
                    adapterFactory,
                    comboCellEditor.getViewer() ) );

                comboCellEditor.setLabelProvider( new DatatypesComboLabelProvider() );
                comboCellEditor.setInput( editingDomain.getResourceSet() );
                this.cellEditor = comboCellEditor;
                break;
            case 2:
                this.cellEditor = new TextCellEditor( ((TableViewer)viewer).getTable() );
                this.cellEditor.setValidator( new CellEditorAttributeValueValidator() );
                break;
            default:
                this.cellEditor = null;
            }
        }

        @Override
        protected boolean canEdit( Object element ) {
            boolean retVal = true;

            AttributeDefinition attribute = (AttributeDefinition)element;

            if( (this.column == 2)
                && ((!(attribute instanceof AttributeDefinitionSimple)) || ((AttributeDefinitionSimple)attribute).getDefaultValue() == null) ) {
                retVal = false;
            }
            return retVal;
        }

        @Override
        protected CellEditor getCellEditor( Object element ) {
            return this.cellEditor;
        }

        @Override
        protected Object getValue( Object element ) {
            AttributeDefinition attribute = (AttributeDefinition)element;
            Object retVal = null;

            switch (this.column) {
            case 0:
                retVal = attribute.getLongName();
                break;
            case 1:
                retVal = attribute.getType();
                break;
            case 2:
                retVal = ((AttributeDefinitionSimple)attribute).getDefaultValue().getTheValue();
                break;
            default:
                break;
            }
            return retVal;
        }

        @Override
        protected void setValue( Object element, Object value ) {
            AttributeDefinition attributeDefinition = (AttributeDefinition)element;

            Command cmd = null;
            switch (this.column) {
            case 0:
                // only update data model in case the value has changed
                if( attributeDefinition.getLongName().equals( value ) ) break;
                // set longname to new value (using a command)
                cmd = new SetCommand(
                    editingDomain,
                    attributeDefinition,
                    attributeDefinition.eClass().getEStructuralFeature( RifPackage.ATTRIBUTE_DEFINITION__LONG_NAME ),
                    (String)value );
                eraCommandStack.execute( cmd );
                super.getViewer().update( attributeDefinition, null );
                break;
            case 1:
                assert (value != null);
                cmd = new SetCommand(
                    editingDomain,
                    attributeDefinition,
                    attributeDefinition.eClass().getEStructuralFeature( RifPackage.ATTRIBUTE_DEFINITION__TYPE ),
                    (DatatypeDefinition)value );
                editingDomain.getCommandStack().execute( cmd );
                super.getViewer().update( attributeDefinition, null );
                break;
            case 2:
                // only update data model in case the value has changed
                AttributeValueSimple defaultValue = ((AttributeDefinitionSimple)attributeDefinition).getDefaultValue();
                if( defaultValue.getTheValue().equals( value ) ){
                    break;
                }
                
                // set TheValue of the attribute's DefaultValue to the new value (using a command)
                cmd = new SetCommand(
                    editingDomain,
                    defaultValue,
                    defaultValue.eClass().getEStructuralFeature( RifPackage.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE ),
                    (String)value );
                eraCommandStack.execute( cmd );
                super.getViewer().update( attributeDefinition, null );
                break;
            default:
                break;
            }
        }
       
    }

    /**
     * Create Table viewer showing attributes
     */
    private void createTableViewer() {

        tableViewer = new AddDeleteTableViewer( this, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION );
        tableViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

        tableViewer.setEditingDomain( editingDomain );
        tableViewer.setAddCommandParameter( theOneAndOnlySpecType,
                                            RifFactoryImpl.eINSTANCE.createAttributeDefinitionSimple().eClass() );
        TableColumnLayout columnLayout = tableViewer.getTableColumnLayout();
        String[] colTitles = {
            typeEditorActivator.getString( "_UI_AttributeDefinitionName_label" ),
            typeEditorActivator.getString( "_UI_AttributeDefinitionType_label" ),
            typeEditorActivator.getString( "_UI_AttributeDefinitionDefaultValue_label" )};
        int[] colMinWidth = {100, 100, 100};
        int[] colWeigth = {34, 33, 33};
        boolean[] colResize = {true, true, false};
        for( int colNr = 0; colNr < colTitles.length; colNr++ ) {

            TableViewerColumn column = new TableViewerColumn( tableViewer, SWT.NONE );
            column.getColumn().setText( colTitles[colNr] );
            column.getColumn().setResizable( colResize[colNr] );
            column.getColumn().setMoveable( false );

            columnLayout.setColumnData( column.getColumn(), new ColumnWeightData(
                colWeigth[colNr],
                colMinWidth[colNr] ) );

            column.setEditingSupport( new AttributeDefinitionEditingSupport( tableViewer, colNr ) );
        }

        tableViewer.setContentProvider( new AttributeDefinitionContentProvider( adapterFactory ) );
        tableViewer.setLabelProvider( new AttributeDefinitionLabelProvider() );

        tableViewer.setInput( editingDomain.getResourceSet() );
        tableViewer.addDoubleClickListener( new IDoubleClickListener() {

            @Override
            public void doubleClick( DoubleClickEvent event ) {
                // Check if an element is selected and if we are in the column
                // for the default value
                IStructuredSelection selection = (IStructuredSelection)event.getSelection();
                AttributeDefinitionSimple attributeDef = getAttributeDefForColumn( selection,
                
                                                                                  typeEditorActivator.getString( "_UI_AttributeDefinitionDefaultValue_label" ) );
                
                if(attributeDef != null){
                  addDefaultValue( attributeDef );
                }
            }
        } );

    }

    /**
     * create context menu for -Adding and removing Dafatult values
     */
    private void createContextMenu() {

        // FIXME: provide double click as legitimate insert trigger for adding default values
        // (requires knowledge about which column is affected by click)

        final class DefaultValueAction extends Action {
            /** remove Default value instead of adding */
            private AttributeDefinitionSimple attribute;

            @Override
            public void run() {
                if( attribute.getDefaultValue() == null )
                // add default value (-> empty string)
                {
                    addDefaultValue( attribute );
                } else
                // remove default value
                {
                    removeDefaultValue( attribute );
                }
            }

            public void setAttribute( AttributeDefinitionSimple attribute ) {
                this.attribute = attribute;
                if( attribute.getDefaultValue() == null ) {
                    this.setText( "Add Default Value" );
                } else {
                    this.setText( "Remove Default Value" );
                }
            }
        }

        final DefaultValueAction defaultValueAction = new DefaultValueAction();

        final MenuManager menuMgr = new MenuManager();
        menuMgr.setRemoveAllWhenShown( true );

        menuMgr.addMenuListener( new IMenuListener() {

            /*
             * (non-Javadoc)
             * 
             * @see org.eclipse.jface.action.IMenuListener#menuAboutToShow(org.eclipse.jface.action.IMenuManager)
             */
            public void menuAboutToShow( IMenuManager manager ) {
                IStructuredSelection selection = (IStructuredSelection)tableViewer.getSelection();
                // pass the first element of the row, the attribute definition, to the handler
                AttributeDefinitionSimple attribute = getAttributeDefForColumn( selection,
                                                                                typeEditorActivator.getString( "_UI_AttributeDefinitionDefaultValue_label" ) );
                defaultValueAction.setAttribute( attribute );
                menuMgr.add( defaultValueAction );
            }
        } );
        // register menu at the table viewer
        tableViewer.getControl().setMenu( menuMgr.createContextMenu( tableViewer.getControl() ) );
    }

    /**
     * Add a default value for a simple Attribute Definition
     * 
     * @param attribute Attribute definition for which the default value shall be added
     */
    private void addDefaultValue( AttributeDefinitionSimple attribute ) {
        BasicCommandStack basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();
        if( attribute.getDefaultValue() == null )
        // add default value (-> empty string)
        {
            AttributeValueSimple addCommandValue = RifFactoryImpl.eINSTANCE.createAttributeValueSimple();
            addCommandValue.setTheValue( "" );
            addCommandValue.setDefinition(attribute);
            Command cmd = AddCommand.create( editingDomain,
                                             attribute,
                                             RifPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                                             addCommandValue );
            basicCommandStack.execute( cmd );
            tableViewer.refresh();
        }

    }

    /**
     * remove a default value from a simple attribute definition
     * 
     * @param attribute AttributeDefintion from which the default value shall be removed
     */
    private void removeDefaultValue( AttributeDefinitionSimple attribute ) {
        BasicCommandStack basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();
        Command cmd = RemoveCommand.create( editingDomain, attribute.getDefaultValue() );
        basicCommandStack.execute( cmd );
        tableViewer.refresh();
    }

    /**
     * Get attribute definition in case the column for the default value is selected
     * 
     * @selection the selection of Attributes
     * @param column name of column which has to be selected
     */
    private AttributeDefinitionSimple getAttributeDefForColumn( IStructuredSelection selection, String columnName ) {
        // Check if an element is selected and if we are in the column
        // for the default value
        if( selection.isEmpty()
            || !tableViewer.getTable().getColumn( tableViewer.getActiveColumn() ).getText().equals( columnName ) ) {
            return null;
        }

        // get first attribute definition of selection
        AttributeDefinitionSimple attributeDef = (AttributeDefinitionSimple)selection.getFirstElement();

        // check if the row type is correct (at the moment this is implicitly always true)
        if( !(selection.getFirstElement() instanceof AttributeDefinitionSimple) ) {
            return null;
        }

        return attributeDef;
    }

}
