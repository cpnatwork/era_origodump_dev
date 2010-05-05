/*
 * NAME: era.foss.typeeditor.SpecTypeForm
 */

package era.foss.typeeditor;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.provider.IChangeNotifier;
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
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IBaseLabelProvider;
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

import era.foss.rif.AttributeDefinition;
import era.foss.rif.AttributeDefinitionSimple;
import era.foss.rif.AttributeValue;
import era.foss.rif.AttributeValueSimple;
import era.foss.rif.DatatypeDefinition;
import era.foss.rif.RifPackage;
import era.foss.rif.SpecObject;
import era.foss.rif.SpecType;
import era.foss.rif.impl.RifFactoryImpl;
import era.foss.rif.provider.RifEditPlugin;

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
    private SpecType specType;

    /**
     * Table viewer holding the attributes of a spec type
     */
    private AddDeleteTableViewer tableViewer;

    /** Content provider for {@link #tableViewer} */
    private AttributesContentProvider attributesContentProvider;
    /** Label provider for {@link #tableViewer} */
    private AttributesLabelProvider attributesLabelProvider;

    /**
     * Label Provider for ComboBox in {@link #tableViewer} holding reference to Datatype
     */
    private ComboLabelProvider comboBoxLabelProvider;

    public SpecTypeForm( Composite parent, IEditorPart editor ) {
        super( parent, editor, SWT.NONE );

        // check for and eventually initialize the sole SpecType
        if( rifModel.getCoreContent().getSpecTypes().size() == 0 ) {
            Command addCommand = AddCommand.create( editingDomain,
                                                    rifModel.getCoreContent(),
                                                    null,
                                                    RifFactoryImpl.eINSTANCE.createSpecType() );
            eraCommandStack.execute( addCommand );
        }
        specType = (SpecType)rifModel.getCoreContent().getSpecTypes().get( 0 );

        // set-up layout
        GridLayout gridLayout = new GridLayout( 1, true );
        this.setLayout( gridLayout );

        // set up table viewer for attribute definitions
        createTableViewer();

        // Context menu for creating Elements of default values
        createContextMenu();
    }

    /**
     * Provide data for table containing Attribute definitions of spec types
     */
    public class AttributesContentProvider extends AdapterFactoryContentProvider {
        public AttributesContentProvider( AdapterFactory adapterFactory ) {
            super( adapterFactory );
            ((IChangeNotifier)adapterFactory).addListener( this );
        }

        // get elements shown in the table viewer holding Attribute defintions
        public Object[] getElements( Object object ) {

            AttributeDefinition[] objects;
            try {
                objects = (AttributeDefinition[])specType.getSpecAttributes().toArray();
            } catch( NullPointerException e ) {
                objects = new AttributeDefinition[0];
            }
            return objects;
        }
    }

    /**
     * Provide label for data of table containing SpecTypes
     */
    public class AttributesLabelProvider extends LabelProvider implements ITableLabelProvider {

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
                if( type != null ) {
                    retVal = type.getLongName();
                }
                break;
            case 2:
                retVal = "n/a";
                if( attribute instanceof AttributeDefinitionSimple ) {
                    AttributeValueSimple defaultValue = ((AttributeDefinitionSimple)attribute).getDefaultValue();
                    if( defaultValue != null ) {
                        retVal = defaultValue.getTheValue();
                    }
                }
                break;

            default:
                throw new RuntimeException( "Should not happen" );
            }
            return retVal;
        }

        @Override
        public Image getColumnImage( Object element, int columnIndex ) {
            // no icons (yet)
            return null;
        }
    }

    /**
     * Content provider for the combo box
     */
    public class ComboContentProvider extends AdapterFactoryContentProvider {

        public ComboContentProvider( AdapterFactory adapterFactory, Viewer viewer ) {
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

        // listen on changes of Datatype definitions
        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );
        
            // handle changes of a data type definition
            if( (notification.getNotifier() instanceof DatatypeDefinition)
                || (notification.getNewValue() instanceof DatatypeDefinition)
                || (notification.getOldValue() instanceof DatatypeDefinition) ) {
                viewer.refresh();
                tableViewer.refresh();
            }
            
            // In case a spec type is removed also remove the according values 
            // of the spec objects
            if( (notification.getOldValue() instanceof AttributeDefinition) && (notification.getEventType() == Notification.REMOVE)){
               AttributeDefinition removedAttributeDefinition = (AttributeDefinition) notification.getOldValue();
                LinkedList<AttributeValue> attributeValuesToRemove = new LinkedList<AttributeValue>();
               for (SpecObject specObject : rifModel.getCoreContent().getSpecObjects()){
                   for (AttributeValue attributeValue : specObject.getValues()){
                       if ((attributeValue instanceof AttributeValueSimple) && 
                               (((AttributeValueSimple) attributeValue).getDefinition().getID() == removedAttributeDefinition.getID())){
                            attributeValuesToRemove.add( attributeValue );        
                       }
                   }
               }
               Command removeCommand = RemoveCommand.create( editingDomain,attributeValuesToRemove);
               editingDomain.getCommandStack().execute( removeCommand );
            }
        }
    }

    /**
     * Label provider for the Combo box
     */
    public class ComboLabelProvider extends LabelProvider implements IBaseLabelProvider {

        @Override
        public String getText( Object element ) {
            return ((DatatypeDefinition)element).getLongName();
        }
    }

    /**
     * Editing support for Table holding the attribute definitions
     * 
     * @param viewer
     * @param column
     */
    public class AttributesEditingSupport extends EditingSupport {
        private CellEditor cellEditor;
        private int column;

        public AttributesEditingSupport( ColumnViewer viewer, int column ) {
            super( viewer );
            this.column = column;

            // Create the correct editor based on the column index
            switch (column) {
            case 0:
                this.cellEditor = new TextCellEditor( ((TableViewer)viewer).getTable() );
                break;
            case 1:
                ComboBoxViewerCellEditor comboCellEditor = new ComboBoxViewerCellEditor(
                    ((TableViewer)viewer).getTable() );
                comboCellEditor.setContenProvider( new ComboContentProvider(
                    adapterFactory,
                    comboCellEditor.getViewer() ) );

                comboCellEditor.setLabelProvider( comboBoxLabelProvider );
                comboCellEditor.setInput( editingDomain.getResourceSet() );
                this.cellEditor = comboCellEditor;
                break;
            case 2:
                this.cellEditor = new TextCellEditor( ((TableViewer)viewer).getTable() );
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
            AttributeDefinition attribute = (AttributeDefinition)element;

            switch (this.column) {
            case 0:
                if( !attribute.getLongName().equals( value ) ) {
                    attribute.setLongName( (String)value );
                    getViewer().update( element, null );
                }
                break;
            case 1:
                // Set reference to datatype definition if value has changed
                attribute.setType( (DatatypeDefinition)value );
                getViewer().refresh();
                break;
            case 2:
                AttributeValueSimple DefaultValue = ((AttributeDefinitionSimple)attribute).getDefaultValue();
                if( !DefaultValue.getTheValue().equals( value ) ) {
                    DefaultValue.setTheValue( (String)value );
                    getViewer().update( element, null );
                }
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

        // create provider for table viewer
        attributesContentProvider = new AttributesContentProvider( adapterFactory );
        attributesLabelProvider = new AttributesLabelProvider();

        // create provider for Combo Box of table viewer
        // comboBoxContentProvider = new ComboContentProvider( adapterFactory );
        comboBoxLabelProvider = new ComboLabelProvider();

        // create table viewer
        tableViewer = new AddDeleteTableViewer( this, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION );
        tableViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

        tableViewer.setEditingDomain( editingDomain );
        tableViewer.setAddCommandParameter( specType, RifFactoryImpl.eINSTANCE.createAttributeDefinitionSimple()
                                                                              .eClass() );
        TableColumnLayout columnLayout = tableViewer.getTableColumnLayout();
        String[] colTitles = {"Name", "Datatype", "Default Value"};
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

            column.setEditingSupport( new AttributesEditingSupport( tableViewer, colNr ) );
        }

        tableViewer.setContentProvider( attributesContentProvider );
        tableViewer.setLabelProvider( attributesLabelProvider );

        tableViewer.setInput( editingDomain.getResourceSet() );

    }

    /**
     * create context menu for -Adding and removing Dafatult values
     */
    private void createContextMenu() {
        final class DefaultValueAction extends Action {
            /** remove Default value instead of adding */
            private AttributeDefinitionSimple attribute;

            @Override
            public void run() {
                BasicCommandStack basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();
                Command cmd = null;
                if( attribute.getDefaultValue() == null ) {
                    AttributeValueSimple addCommandValue = RifFactoryImpl.eINSTANCE.createAttributeValueSimple();
                    addCommandValue.setTheValue( "" );
                    cmd = AddCommand.create( editingDomain,
                                             attribute,
                                             RifPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                                             addCommandValue );
                } else {
                    cmd = RemoveCommand.create( editingDomain, attribute.getDefaultValue() );
                }
                basicCommandStack.execute( cmd );
                tableViewer.refresh();
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
                // after a delete there is no selection
                if( selection.isEmpty() ) return;
                // check if the row type is correct (at the moment this is implicitly always true)  
                if( !(selection.getFirstElement() instanceof AttributeDefinitionSimple) ) return;
                // pass the first element of the row, the attribute definition, to the handler
                AttributeDefinitionSimple attribute = (AttributeDefinitionSimple)selection.getFirstElement();
                defaultValueAction.setAttribute( attribute );
                menuMgr.add( defaultValueAction );
            }
        } );
        // register menu at the table viewer
        tableViewer.getControl().setMenu( menuMgr.createContextMenu( tableViewer.getControl() ) );
    }

}
