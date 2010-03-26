/*
 * NAME: era.foss.typeeditor.DataTypesForm
 */

package era.foss.typeeditor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;

import era.foss.rif.DatatypeDefinition;
import era.foss.rif.impl.DatatypeDefinitionImpl;
import era.foss.rif.impl.RIFContentImpl;
import era.foss.rif.impl.RifFactoryImpl;
import era.foss.rif.provider.DatatypeDefinitionItemProvider;

/**
 * Editor form for manipulating data types.
 * 
 * @author cpn
 * 
 * @see DatatypeDefinition
 */
final public class DataTypesForm extends AbstractTypesForm {

    /** Provider for accessing the properties of the EMF Edit plugin */
    private DatatypeDefinitionItemProvider dataTypesProvider;

    /** List holding the names of the DatatypeDefintion supported in the model */ 
    private ArrayList<String> supportedDataTypeNames;

    /** List holding the EClasses of the DatatypeDefintion supported in the model 
     *  The entries in list are in the same order as in list {@link supportedDataTypeNames}
     * */ 
    private List<EClass> supportedDataTypesClasses;

    public DataTypesForm( Composite parent, IEditorPart editor ) {
        super( parent, editor, SWT.NONE );

    }

    public class DatatypesEditingSupport extends EditingSupport {
        private CellEditor cellEditor;
        private int column;

        public DatatypesEditingSupport( ColumnViewer viewer, int column ) {
            super( viewer );
            this.column = column;

            // Create the correct editor based on the column index
            switch (column) {
            case 0:
                cellEditor = new TextCellEditor( ((TableViewer)viewer).getTable() );
                break;
            case 1:
                cellEditor = new ComboBoxCellEditor(
                    ((TableViewer)viewer).getTable(),
                    DataTypesForm.this.supportedDataTypeNames.toArray( new String[supportedDataTypeNames.size()] ),
                    SWT.READ_ONLY );

                break;
            default:
                cellEditor = null;
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
            DatatypeDefinition dataType = (DatatypeDefinition)element;
            Object retVal = null;

            switch (this.column) {
            case 0:
                retVal = dataType.getLongName();
                break;
            case 1:
                String dataTypeName = DataTypesForm.this.getDataTypeName( dataType );
                retVal = ((CCombo)this.cellEditor.getControl()).indexOf( dataTypeName );
                break;
            default:
                break;
            }
            return retVal;
        }

        @Override
        protected void setValue( Object element, Object value ) {
            DatatypeDefinition dataType = (DatatypeDefinition)element;

            switch (this.column) {
            case 0:
                dataType.setLongName( (String)value );
                getViewer().update( element, null );
                break;
            case 1:
                EList<DatatypeDefinition> dataTypes = ((RIFContentImpl)editingDomain.getParent( dataType )).getDataTypes();

                String dataTypeNameCurrent = getDataTypeName( dataType );
                String dataTypeNameNew = ((CCombo)this.cellEditor.getControl()).getItem( (Integer)value );

                if( dataTypeNameNew == dataTypeNameCurrent ) {
                    // the current data type is the same data type selected in the ComboBox
                    // therefore: DO NOTHING
                    break;
                }

                // create new datatype
                EClass newDataTypeClass = supportedDataTypesClasses.get( (Integer)value );
                DatatypeDefinition newDataType = (DatatypeDefinition)RifFactoryImpl.eINSTANCE.create( newDataTypeClass );

                // copy old data type attributes
                newDataType.setID( dataType.getID() );
                newDataType.setLongName( dataType.getLongName() );
                newDataType.setDesc( dataType.getDesc() );

                
                // Remove Command:
                // remove old data type
                Command removeCommand = RemoveCommand.create( editingDomain, dataType );

                // Add Command:
                // Get index of old data type (in order to add it at the same position)
                int index = dataTypes.indexOf( dataType );
                Command addCommand = AddCommand.create( editingDomain,
                                                        rifModel.getCoreContent(),
                                                        null,
                                                        newDataType,
                                                        index );

                // Execute both commands
                eraCommandStack.execute( removeCommand );
                eraCommandStack.execute( addCommand );

                break;
            default:
                break;
            }
            getViewer().refresh();
        }
    }

    public class DatatypesAdapterFactoryContentProvider extends AdapterFactoryContentProvider {
        public DatatypesAdapterFactoryContentProvider( AdapterFactory adapterFactory ) {
            super( adapterFactory );
            /*
             * TODO: At the moment we are not quite sure if we need this. - Data type editor does not require
             * information of other parts of the model.
             * 
             * - The Type Editor shall be a modal dialog therefore the data types can't be updated anywhere else
             * 
             * In this special case it might be sufficient to implement @IStructuredContentProvider
             */
            ((IChangeNotifier)adapterFactory).addListener( this );
        }

        public Object[] getElements( Object object ) {

            Object[] objects;
            try {
                objects = rifModel.getCoreContent().getDataTypes().toArray();
            } catch( NullPointerException e ) {
                objects = new Object[0];
            }
            return objects;
        }
    }

    public class DatatypesLabelProvider extends LabelProvider implements ITableLabelProvider {

        @Override
        public String getColumnText( Object element, int columnIndex ) {
            DatatypeDefinition dataType = (DatatypeDefinition)element;

            switch (columnIndex) {
            case 0:
                return dataType.getLongName();
            case 1:
                return getDataTypeName( dataType );
            default:
                throw new RuntimeException( "Should not happen" );
            }
        }

        @Override
        public Image getColumnImage( Object element, int columnIndex ) {
            return null;
        }
    }

    /**
     * @see era.foss.typeeditor.AbstractTypesForm#constructorPreHook()
     * @since 17.03.2010
     */
    @SuppressWarnings("unchecked")
    @Override
    protected void constructorPreHook() {
        super.constructorPreHook();

        // Setup item provider for DatatypeDefinition items
        // used for accessing information stored in the edit plugin
        dataTypesProvider = new DatatypeDefinitionItemProvider( adapterFactory );

        // Get Information about supported DatatypeDefintions
        supportedDataTypesClasses = new ArrayList<EClass>();
        supportedDataTypeNames = new ArrayList<String>();
        Collection<CommandParameter> descriptors = (Collection<CommandParameter>)editingDomain.getNewChildDescriptors( rifModel.getCoreContent(),
                                                                                                                       null );
        for( CommandParameter descriptor : descriptors ) {
            if( descriptor.value instanceof DatatypeDefinitionImpl ) {
                DatatypeDefinitionImpl dataType = (DatatypeDefinitionImpl)descriptor.value;
                supportedDataTypesClasses.add( dataType.eClass() );
                supportedDataTypeNames.add( getDataTypeName( dataType ) );
            }
        }
    }

    /**
     * @see era.foss.typeeditor.AbstractTypesForm#setupLeftSide()
     * @since 17.03.2010
     */
    @Override
    protected TableViewer setupLeftSide() {

        final AddDeleteTableViewer tableViewer = new AddDeleteTableViewer( this, SWT.MULTI
            | SWT.V_SCROLL
            | SWT.BORDER
            | SWT.FULL_SELECTION );
        tableViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

        tableViewer.setEditingDomain( editingDomain );
        tableViewer.setAddCommandParameter( rifModel.getCoreContent(),
                                            RifFactoryImpl.eINSTANCE.createDatatypeDefinitionInteger().eClass() );
        //TableColumnLayout tl= new TableColumnLayout();
        //tableViewer.getTable().setLayout( tl );
        String[] colTitles = {"Name", "Type"};
        int[] colMinWidth = {200, 100};
        int[] colWeigth = {70, 30};
        boolean[] colResize = {true, false};
        for( int colNr = 0; colNr < colTitles.length; colNr++ ) {

            TableViewerColumn column = new TableViewerColumn( tableViewer, SWT.NONE );
            column.getColumn().setText( colTitles[colNr] );
            column.getColumn().setWidth( colMinWidth[colNr] );
            column.getColumn().setResizable( colResize[colNr]);
            column.getColumn().setMoveable( false );
            //tl.setColumnData(column.getColumn(), new ColumnWeightData(colWeigth[colNr], colBounds[colNr]));
            // enable editing support
            column.setEditingSupport( new DatatypesEditingSupport( tableViewer, colNr ) );
        }

        tableViewer.setColumnProperties( new String[]{"a", "b", "c"} );

        tableViewer.setContentProvider( new DatatypesAdapterFactoryContentProvider( adapterFactory ) );
        tableViewer.setLabelProvider( new DatatypesLabelProvider() );

        tableViewer.setInput( editingDomain.getResourceSet() );

        return tableViewer;
    }

    private String getDataTypeName( Object dataType ) {
        // get the text specified in the resource file of the edit plugin
        // for this data type
        return dataTypesProvider.getCreateChildText( dataType, null, dataType, null );
    }
}
