/*
 * NAME: era.foss.typeeditor.AttributesForm
 */

package era.foss.typeeditor;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;

import era.foss.rif.AttributeDefinition;
import era.foss.rif.AttributeDefinitionSimple;
import era.foss.rif.AttributeValueSimple;
import era.foss.rif.DatatypeDefinition;
import era.foss.rif.SpecType;
import era.foss.rif.impl.DatatypeDefinitionImpl;
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
public class AttributesForm extends AbstractTypesForm {

    // for now the one and only spec type
    private SpecType specType;

    /** Content Provider for ComboBox holding reference to Datatype */
    private ComboContentProvider comboBoxContentProvider;
    /** Label Provider for ComboBox holding reference to Datatype */
    private ComboLabelProvider comboBoxLabelProvider;

    /**
     * Table viewer holding the attributes of a spec type
     */
    private AddDeleteTableViewer tableViewer;

    public AttributesForm( Composite parent, IEditorPart editor ) {
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
        
        // wire the ComboBox structure
        comboBoxContentProvider = new ComboContentProvider( adapterFactory );
        comboBoxLabelProvider = new ComboLabelProvider();

        // set-up layout
        GridLayout gridLayout = new GridLayout( 1, true );
        this.setLayout( gridLayout );

        createTableViewer();
    }

    /**
     * Provide data for table containing Attribute definitions of spec types
     */
    public class AttributesAdapterFactoryContentProvider extends AdapterFactoryContentProvider {
        public AttributesAdapterFactoryContentProvider( AdapterFactory adapterFactory ) {
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
            // TODO Auto-generated method stub
            return null;
        }
    }

    /**
     * Content provider for the combo box
     */
    public class ComboContentProvider extends AdapterFactoryContentProvider {
        public ComboContentProvider( AdapterFactory adapterFactory ) {
            super( adapterFactory );
        }

        // get elements which are show in the combobox
        public Object[] getElements( Object object ) {

            Object[] objects;
            try {
                objects = rifModel.getCoreContent().getDataTypes().toArray();
            } catch( NullPointerException e ) {
                objects = new Object[0];
            }
            return objects;
        }

        // listen on changes of Datatype definitions
        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );
            /*
             * XXX: Maybe there is a way to create an adapter factory which only adapts to Datatype Defintions. This way
             * we won't have to filter all the other events here
             */
            if( (notification.getNotifier() instanceof DatatypeDefinitionImpl) ) {
                tableViewer.refresh();
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
                comboCellEditor.setContenProvider( comboBoxContentProvider );
                comboCellEditor.setLabelProvider( comboBoxLabelProvider );
                comboCellEditor.setInput( editingDomain.getResourceSet() );
                this.cellEditor = comboCellEditor;
                break;
            default:
                this.cellEditor = null;
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
            AttributeDefinition attribute = (AttributeDefinition)element;
            Object retVal = null;

            switch (this.column) {
            case 0:
                retVal = attribute.getLongName();
                break;
            case 1:
                retVal = attribute.getType();
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

        tableViewer.setContentProvider( new AttributesAdapterFactoryContentProvider( adapterFactory ) );
        tableViewer.setLabelProvider( new AttributesLabelProvider() );

        tableViewer.setInput( editingDomain.getResourceSet() );
    }

}
