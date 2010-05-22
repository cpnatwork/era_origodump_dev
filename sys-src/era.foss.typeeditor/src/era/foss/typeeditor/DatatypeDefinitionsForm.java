/*
 * NAME: era.foss.typeeditor.DatatypeDefinitionsForm
 */

package era.foss.typeeditor;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorPart;

import era.foss.rif.DatatypeDefinition;
import era.foss.rif.RIFContent;
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
 * The inner class {@link .DatatypeDefinitionContentProvider} is registered to the {@link AddDeleteTableViewer} and
 * extracts all {@link DatatypeDefinition} elements from the RIF model -- by the model reference named "dataTypes".
 * <p>
 * The inner class {@link .DatatypeDefinitionLabelProvider} is registered to the {@link AddDeleteTableViewer} and
 * provides the cell values from the {@link DatatypeDefinition} element.
 * 
 * @author cpn
 * 
 * @see DatatypeDefinition
 */
final public class DatatypeDefinitionsForm extends AbstractErfTypesForm {

    /** Provider for accessing the properties of the EMF Edit plugin */
    private DatatypeDefinitionItemProvider dataTypesProvider;

    /**
     * Table viewer containing the datatype definitions
     */
    private AddDeleteTableViewer tableViewer;

    public DatatypeDefinitionsForm( Composite parent, IEditorPart editor ) {
        super( parent, editor, SWT.NONE );

        // set-up item provider for DatatypeDefinition items
        // used for accessing information stored in the edit plugin
        dataTypesProvider = new DatatypeDefinitionItemProvider( adapterFactory );

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

    public class DatatypeDefinitionEditingSupport extends EditingSupport {
        private CellEditor cellEditor;
        private int column;

        public DatatypeDefinitionEditingSupport( ColumnViewer viewer, int column ) {
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
                comboCellEditor.setContenProvider( new TypesForDatatypeDefinitionComboContentProvider(
                    adapterFactory,
                    comboCellEditor.getViewer() ) );

                comboCellEditor.setLabelProvider( new TypesForDatatypeDefinitionComboLabelProvider() );
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
            DatatypeDefinition dataType = (DatatypeDefinition)element;
            Object retVal = null;

            switch (this.column) {
            case 0:
                retVal = dataType.getLongName();
                break;
            case 1:
                // FIXME: cpn@schorsch: H�h??
                // String dataTypeName = DatatypeDefinitionsForm.this.getDataTypeName( dataType );
                // retVal = ((CCombo)this.cellEditor.getControl()).indexOf( dataTypeName );
                retVal = element;
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

                // only update data model in case the value has changed
                if( !dataType.getLongName().equals( value ) ) {
                    dataType.setLongName( (String)value );
                    getViewer().update( element, null );
                }
                break;
            case 1:

                DatatypeDefinition newDataType = (DatatypeDefinition)value;

                String dataTypeNameCurrent = getNameOfTypeForDatatypeDefinition( dataType );
                // String dataTypeNameNew = ((CCombo)this.cellEditor.getControl()).getItem( (Integer)value );
                String dataTypeNameNew = getNameOfTypeForDatatypeDefinition( newDataType );

                if( dataTypeNameNew.equals( dataTypeNameCurrent ) ) {
                    // the current data type is the same data type selected in the ComboBox
                    // therefore: DO NOTHING
                    break;
                }

                // create new datatype
                // EClass newDataTypeClass = supportedDataTypesClasses.get( (Integer)value );
                // DatatypeDefinition newDataType = (DatatypeDefinition)RifFactoryImpl.eINSTANCE.create( value );

                // copy old data type attributes
                newDataType.setID( dataType.getID() );
                newDataType.setLongName( dataType.getLongName() );
                newDataType.setDesc( dataType.getDesc() );

                // Remove Command:
                // remove old data type
                Command removeCommand = RemoveCommand.create( editingDomain, dataType );

                // Add Command:
                // Get index of old data type (in order to add it at the same position)
                RIFContent dataTypeParent = ((RIFContent)editingDomain.getParent( dataType ));
                assert (dataTypeParent == rifModel.getCoreContent());
                Command addCommand = AddCommand.create( editingDomain,
                                                        dataTypeParent,
                                                        null,
                                                        newDataType,
                                                        dataTypeParent.eContents().indexOf( dataType ) );

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

    public class DatatypeDefinitionContentProvider extends AdapterFactoryContentProvider {
        public DatatypeDefinitionContentProvider( AdapterFactory adapterFactory ) {
            super( adapterFactory );
        }

        public Object[] getElements( Object object ) {

            DatatypeDefinition[] objects;
            try {
                objects = (DatatypeDefinition[])rifModel.getCoreContent().getDataTypes().toArray();
            } catch( NullPointerException e ) {
                objects = new DatatypeDefinition[0];
            }
            return objects;
        }
    }

    public class DatatypeDefinitionLabelProvider extends LabelProvider implements ITableLabelProvider {

        @Override
        public String getColumnText( Object element, int columnIndex ) {
            DatatypeDefinition dataType = (DatatypeDefinition)element;

            switch (columnIndex) {
            case 0:
                return dataType.getLongName();
            case 1:
                return getNameOfTypeForDatatypeDefinition( dataType );
            default:
                throw new RuntimeException( "Should not happen" );
            }
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
    public class TypesForDatatypeDefinitionComboContentProvider extends AdapterFactoryContentProvider {

        public TypesForDatatypeDefinitionComboContentProvider( AdapterFactory adapterFactory, Viewer viewer ) {
            super( adapterFactory );
            this.viewer = viewer;
        }

        // get elements which are show in the combobox
        @SuppressWarnings("unchecked")
        public Object[] getElements( Object object ) {

            DatatypeDefinition[] typesForDatatypeDefinition = null;
            try {
                /*
                 * Extract the types which are available as foundation for defining an own DatatypeDefinition from the
                 * structure of the RIF model
                 */
                Collection<CommandParameter> descriptors = (Collection<CommandParameter>)editingDomain.getNewChildDescriptors( rifModel.getCoreContent(),
                                                                                                                               null );
                LinkedList<DatatypeDefinition> typesForDatatypeDefinitionList = new LinkedList<DatatypeDefinition>();
                for( CommandParameter descriptor : descriptors ) {
                    if( !(descriptor.value instanceof DatatypeDefinition) ) continue;
                    DatatypeDefinition typeofDatatypeDefinition = (DatatypeDefinition)descriptor.value;
                    typesForDatatypeDefinitionList.add( typeofDatatypeDefinition );
                }
                typesForDatatypeDefinition = new DatatypeDefinition[typesForDatatypeDefinitionList.size()];
                typesForDatatypeDefinition = typesForDatatypeDefinitionList.toArray( typesForDatatypeDefinition );
            } catch( NullPointerException e ) {
                typesForDatatypeDefinition = new DatatypeDefinition[0];
            }
            return typesForDatatypeDefinition;
        }

    }

    /**
     * Label provider for the Combo box
     */
    public class TypesForDatatypeDefinitionComboLabelProvider extends LabelProvider implements IBaseLabelProvider {

        @Override
        public String getText( Object element ) {
            assert (element instanceof DatatypeDefinition);
            return getNameOfTypeForDatatypeDefinition( (DatatypeDefinition)element );
        }
    }

    private void createTableViewer() {

        
        // Label for table
        Label descriptionLabel = new Label( this, SWT.NONE );
        descriptionLabel.setText( typeEditorActivator.getString( "_UI_DataTypeDefinitionTable_label" ) + ":" );
        descriptionLabel.setLayoutData( new GridData( SWT.LEFT, SWT.BOTTOM, true, false, 2, 0 ) );
        
        
        tableViewer = new AddDeleteTableViewer( this, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION );
        tableViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        tableViewer.setEditingDomain( editingDomain );
        tableViewer.setAddCommandParameter( rifModel.getCoreContent(),
                                            RifFactoryImpl.eINSTANCE.createDatatypeDefinitionInteger().eClass() );
        TableColumnLayout columnLayout = tableViewer.getTableColumnLayout();
        String[] colTitles = {
            typeEditorActivator.getString( "_UI_DataTypeDefinitionName_label" ),
            typeEditorActivator.getString( "_UI_DataTypeDefinitionType_label" )};
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

            column.setEditingSupport( new DatatypeDefinitionEditingSupport( tableViewer, colNr ) );
        }

        tableViewer.setContentProvider( new DatatypeDefinitionContentProvider( adapterFactory ) );
        tableViewer.setLabelProvider( new DatatypeDefinitionLabelProvider() );

        tableViewer.setInput( editingDomain.getResourceSet() );

    }

    /**
     * Extracts for any DatatypeDefinition object the name of its type
     * 
     * @param dataType the DatatypeDefinition object in question
     * @return its type name
     */
    private String getNameOfTypeForDatatypeDefinition( DatatypeDefinition dataType ) {
        // get the text specified in the resource file of the edit plugin
        // for this data type
        return dataTypesProvider.getCreateChildText( dataType, null, dataType, null );
    }
}