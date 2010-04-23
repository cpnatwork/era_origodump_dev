/*
 * NAME: era.foss.typeeditor.DatatypeDefinitionsForm
 */

package era.foss.typeeditor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;

import era.foss.rif.DatatypeDefinition;
import era.foss.rif.RIFContent;
import era.foss.rif.impl.DatatypeDefinitionImpl;
import era.foss.rif.impl.RifFactoryImpl;
import era.foss.rif.provider.DatatypeDefinitionItemProvider;

/**
 * A form for editing {@link DatatypeDefinition}s.
 * <p>
 * Presents the list of {@link DatatypeDefinition}s in form of an {@link AddDeleteTableViewer}. Each
 * {@link DatatypeDefinition} is presented as row which consists of a user-defined long name and its model-based class
 * name. On row selection the description property of a {@link DatatypeDefinition} can be edited.
 * <p>
 * A properties viewer for any additional {@link DatatypeDefinition} attributes is instantiated.
 * <p>
 * The inner class {@link .DatatypesAdapterFactoryContentProvider} is registered to the {@link AddDeleteTableViewer} and
 * extracts all {@link DatatypeDefinition} elements from the RIF model -- by the model reference named "dataTypes".
 * <p>
 * The inner class {@link .DatatypesLabelProvider} is registered to the {@link AddDeleteTableViewer} and provides the
 * cell values from the {@link DatatypeDefinition} element.
 * 
 * @author cpn
 * 
 * @see DatatypeDefinition
 */
final public class DatatypeDefinitionsForm extends AbstractTypesForm {

    /** Provider for accessing the properties of the EMF Edit plugin */
    private DatatypeDefinitionItemProvider dataTypesProvider;

    /** List holding the names of the DatatypeDefintion supported in the model */
    private ArrayList<String> supportedDataTypeNames;

    /**
     * List holding the EClasses of the DatatypeDefintion supported in the model The entries in list are in the same
     * order as in list {@link supportedDataTypeNames}
     * */
    private List<EClass> supportedDataTypesClasses;

    /**
     * Table viewer containing the datatype definitions
     */
    private AddDeleteTableViewer tableViewer;

    @SuppressWarnings("unchecked")
    public DatatypeDefinitionsForm( Composite parent, IEditorPart editor ) {
        super( parent, editor, SWT.NONE );

        // set-up item provider for DatatypeDefinition items
        // used for accessing information stored in the edit plugin
        dataTypesProvider = new DatatypeDefinitionItemProvider( adapterFactory );

        // Get Information about supported DatatypeDefintions
        // FIXME: replace this by new ComboBox thingies
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
        
        // set-up layout
        GridLayout gridLayout = new GridLayout( 2, true );
        this.setLayout( gridLayout );

        createTableViewer();

        // setup property viewer
        TableElemPropertySheet tableElemPropertySheet = new TableElemPropertySheet(
            this,
            this.editor,
            tableViewer,
            SWT.MULTI | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER );
        tableElemPropertySheet.setLayout( new FillLayout() );
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
                    DatatypeDefinitionsForm.this.supportedDataTypeNames.toArray( new String[supportedDataTypeNames.size()] ),
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
                String dataTypeName = DatatypeDefinitionsForm.this.getDataTypeName( dataType );
                retVal = ((CCombo)this.cellEditor.getControl()).indexOf( dataTypeName );
                break;
            default:
                break;
            }
            return retVal;
        }

        @Override
        protected void setValue( Object element, Object value ) {
            DatatypeDefinition outdatedDataType = (DatatypeDefinition)element;

            switch (this.column) {
            case 0:
                
                // only update data model in case the value has changed
                if (! outdatedDataType.getLongName().equals( value )){
                    outdatedDataType.setLongName( (String)value );
                    getViewer().update( element, null );
                }          
                break;
            case 1:

                String dataTypeNameCurrent = getDataTypeName( outdatedDataType );
                String dataTypeNameNew = ((CCombo)this.cellEditor.getControl()).getItem( (Integer)value );

                if( dataTypeNameNew.equals( dataTypeNameCurrent ) ) {
                    // the current data type is the same data type selected in the ComboBox
                    // therefore: DO NOTHING
                    break;
                }

                // create new datatype
                EClass newDataTypeClass = supportedDataTypesClasses.get( (Integer)value );
                DatatypeDefinition newDataType = (DatatypeDefinition)RifFactoryImpl.eINSTANCE.create( newDataTypeClass );

                // copy old data type attributes
                newDataType.setID( outdatedDataType.getID() );
                newDataType.setLongName( outdatedDataType.getLongName() );
                newDataType.setDesc( outdatedDataType.getDesc() );

                // Remove Command:
                // remove old data type
                Command removeCommand = RemoveCommand.create( editingDomain, outdatedDataType );

                // Add Command:
                // Get index of old data type (in order to add it at the same position)

                // FIXME: Is this assumption really, really true?
                RIFContent dataTypeParent = ((RIFContent)editingDomain.getParent( outdatedDataType ));
                assert (dataTypeParent == rifModel.getCoreContent());
                Command addCommand = AddCommand.create( editingDomain,
                                                        dataTypeParent,
                                                        null,
                                                        newDataType,
                                                        dataTypeParent.eContents().indexOf( outdatedDataType ) );

                // Execute both commands
                eraCommandStack.execute( removeCommand );
                eraCommandStack.execute( addCommand );
                getViewer().refresh();
                break;
            default:
                break;
            }
            
        }
    }

    public class DatatypesAdapterFactoryContentProvider extends AdapterFactoryContentProvider {
        public DatatypesAdapterFactoryContentProvider( AdapterFactory adapterFactory ) {
            super( adapterFactory );
        }

        public Object[] getElements( Object object ) {

            DatatypeDefinition[] objects;
            try {
                objects = (DatatypeDefinition[]) rifModel.getCoreContent().getDataTypes().toArray();
            } catch( NullPointerException e ) {
                objects = new DatatypeDefinition[0];
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

    private void createTableViewer() {

        tableViewer = new AddDeleteTableViewer( this, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION );
        tableViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

        tableViewer.setEditingDomain( editingDomain );
        tableViewer.setAddCommandParameter( rifModel.getCoreContent(),
                                            RifFactoryImpl.eINSTANCE.createDatatypeDefinitionInteger().eClass() );
        TableColumnLayout columnLayout = tableViewer.getTableColumnLayout();
        String[] colTitles = {"Name", "Type"};
        int[] colMinWidth = {100, 50};
        int[] colWeigth = {70, 30};
        boolean[] colResize = {true, false};
        for( int colNr = 0; colNr < colTitles.length; colNr++ ) {

            TableViewerColumn column = new TableViewerColumn( tableViewer, SWT.NONE );
            column.getColumn().setText( colTitles[colNr] );
            column.getColumn().setResizable( colResize[colNr] );
            column.getColumn().setMoveable( false );
            columnLayout.setColumnData( column.getColumn(), new ColumnWeightData(
                colWeigth[colNr],
                colMinWidth[colNr] ) );
            // enable editing support
            column.setEditingSupport( new DatatypesEditingSupport( tableViewer, colNr ) );
        }

        tableViewer.setColumnProperties( new String[]{"a", "b", "c"} );

        tableViewer.setContentProvider( new DatatypesAdapterFactoryContentProvider( adapterFactory ) );
        tableViewer.setLabelProvider( new DatatypesLabelProvider() );

        tableViewer.setInput( editingDomain.getResourceSet() );

    }

    private String getDataTypeName( Object dataType ) {
        // get the text specified in the resource file of the edit plugin
        // for this data type
        return dataTypesProvider.getCreateChildText( dataType, null, dataType, null );
    }
}
