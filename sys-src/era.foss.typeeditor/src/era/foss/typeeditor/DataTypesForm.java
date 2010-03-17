/*
 * NAME: era.foss.typeeditor.DataTypesForm
 */

package era.foss.typeeditor;

import java.util.HashMap;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;

import era.foss.rif.DatatypeDefinition;
import era.foss.rif.RIFContent;
import era.foss.rif.RifPackage;
import era.foss.rif.impl.RIFContentImpl;
import era.foss.rif.impl.RifFactoryImpl;

/**
 * Editor form for manipulating data types.
 * 
 * @author cpn
 * 
 * @see DatatypeDefinition
 */
final public class DataTypesForm extends AbstractTypesForm {

    /**
     * Stores the Types of DataType
     */
    private HashMap<Integer, String> supportedTypesOfDataType;

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
                    DataTypesForm.this.supportedTypesOfDataType.values()
                                                               .toArray( new String[supportedTypesOfDataType.size()] ),
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
                String dataTypeName = DataTypesForm.this.supportedTypesOfDataType.get( dataType.eClass()
                                                                                               .getClassifierID() );
                int index = 0;
                String[] comboItems = ((ComboBoxCellEditor)this.cellEditor).getItems();
                for( index = 0; index < comboItems.length; index++ ) {
                    if( dataTypeName == comboItems[index] ) {
                        break;
                    }
                }
                retVal = index;
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

                // if no change is represented (unfortunately this method is called in any case), then do nothing
                if( (Integer)value == 0
                    && dataType.eClass().getClassifierID() == RifPackage.DATATYPE_DEFINITION_INTEGER ) break;
                if( (Integer)value == 1
                    && dataType.eClass().getClassifierID() == RifPackage.DATATYPE_DEFINITION_STRING ) break;

                // TRANSFORM to new type
                DatatypeDefinition newDataType = null;
                switch ((Integer)value) {
                case 0:
                    newDataType = RifFactoryImpl.eINSTANCE.createDatatypeDefinitionInteger();
                    break;
                case 1:
                    newDataType = RifFactoryImpl.eINSTANCE.createDatatypeDefinitionString();
                    break;
                }

                // copy old data type attributes
                newDataType.setLongName( dataType.getLongName() );
                newDataType.setDesc( dataType.getDesc() );

                // Command: remove old data type
                Command removeCommand = RemoveCommand.create( editingDomain, dataType );

                // Get index of old data type (in order to add it at the same position)
                int currentDataTypePos = dataTypes.indexOf( dataType );

                // Command: add new data type
                RIFContent addCommandOwner = rifModel.getCoreContent();
                EReference addCommandFeature = RifPackage.eINSTANCE.getRIFContent_DataTypes();
                DatatypeDefinition addCommandValue = newDataType;
                Command addCommand = AddCommand.create( editingDomain,
                                                        addCommandOwner,
                                                        addCommandFeature,
                                                        addCommandValue,
                                                        currentDataTypePos );

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
            DatatypeDefinition datatype = (DatatypeDefinition)element;
            switch (columnIndex) {
            case 0:
                return datatype.getLongName();
            case 1:
                return getTypeName( datatype );
            default:
                throw new RuntimeException( "Should not happen" );
            }
        }

        @Override
        public Image getColumnImage( Object element, int columnIndex ) {
            return null;
        }

        private String getTypeName( DatatypeDefinition dataType ) {
            int classifierID = dataType.eClass().getClassifierID();
            return DataTypesForm.this.supportedTypesOfDataType.get( new Integer( classifierID ) );
        }
    }

    /**
     * @see era.foss.typeeditor.AbstractTypesForm#constructorPreHook()
     * @since 17.03.2010
     */
    @Override
    protected void constructorPreHook() {
        super.constructorPreHook();
        // Fill hashMap with supported types
        supportedTypesOfDataType = new HashMap<Integer, String>();
        supportedTypesOfDataType.put( RifPackage.DATATYPE_DEFINITION_INTEGER, "Integer" );
        supportedTypesOfDataType.put( RifPackage.DATATYPE_DEFINITION_STRING, "String" );
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

        String[] colTitles = {"Name", "Type"};
        int[] colBounds = {100, 200};
        for( int colNr = 0; colNr < colTitles.length; colNr++ ) {

            TableViewerColumn column = new TableViewerColumn( tableViewer, SWT.NONE );
            column.getColumn().setText( colTitles[colNr] );
            column.getColumn().setWidth( colBounds[colNr] );
            column.getColumn().setResizable( true );
            column.getColumn().setMoveable( true );
            // enable editing support
            column.setEditingSupport( new DatatypesEditingSupport( tableViewer, colNr ) );

        }

        tableViewer.setColumnProperties( new String[]{"a", "b", "c"} );

        tableViewer.setContentProvider( new DatatypesAdapterFactoryContentProvider( adapterFactory ) );
        tableViewer.setLabelProvider( new DatatypesLabelProvider() );

        tableViewer.setInput( editingDomain.getResourceSet() );

        return tableViewer;
    }

}
