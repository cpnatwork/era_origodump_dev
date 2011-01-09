/*
 * NAME: era.foss.typeeditor.DatatypeDefinitionsForm
 */

package era.foss.typeeditor;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
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
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorPart;

import era.foss.erf.DatatypeDefinition;
import era.foss.erf.Content;
import era.foss.erf.ErfPackage;
import era.foss.erf.impl.ErfFactoryImpl;
import era.foss.erf.provider.ErfEditPlugin;

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
 * extracts all {@link DatatypeDefinition} elements from the ERF model -- by the model reference named "dataTypes".
 * <p>
 * The inner class {@link .DatatypeDefinitionLabelProvider} is registered to the {@link AddDeleteTableViewer} and
 * provides the cell values from the {@link DatatypeDefinition} element.
 * 
 * @author cpn
 * 
 * @see DatatypeDefinition
 */
final public class DatatypeDefinitionsForm extends AbstractErfTypesForm {

    /**
     * Table viewer containing the datatype definitions
     */
    private AddDeleteTableViewer tableViewer;

    public DatatypeDefinitionsForm( Composite parent, IEditorPart editor ) {
        super( parent, editor, SWT.NONE );

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
                    ((TableViewer)viewer).getTable(),
                    SWT.READ_ONLY );
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
                retVal = dataType.eClass();
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
                if( dataType.getLongName().equals( value ) ) break;
                // set longname to new value (using a command)
                Command cmd = new SetCommand(
                    editingDomain,
                    dataType,
                    dataType.eClass().getEStructuralFeature( ErfPackage.DATATYPE_DEFINITION__LONG_NAME ),
                    (String)value );
                eraCommandStack.execute( cmd );
                super.getViewer().update( dataType, null );
                break;
            case 1:
                // the value must always be valid (ensured with ComboBox and SWT.READ_ONLY for the cells)
                assert (value instanceof EClass);
                String dataTypeNameNew = getTypenameForDatatypeDefinition( (EClass)value );
                String dataTypeNameCurrent = getTypenameForDatatypeDefinition( dataType );
                if( dataTypeNameNew.equals( dataTypeNameCurrent ) ) {
                    // the current data type is the same data type selected in the ComboBox
                    // therefore: DO NOTHING
                    break;
                }

                // create new a datatypeDefinition based on the value
                DatatypeDefinition newDataType = (DatatypeDefinition)ErfFactoryImpl.eINSTANCE.create( (EClass)value );

                // copy old data type attributes
                // direct set can be used; no commands required here
                newDataType.setID( dataType.getID() );
                newDataType.setLongName( dataType.getLongName() );
                newDataType.setDesc( dataType.getDesc() );

                // perform the REPLACE with any side-effects
                Command replaceCommand = ReplaceCommand.create( editingDomain,
                                                                erfModel.getCoreContent(),
                                                                erfModel.getCoreContent().eClass()
                                                                              .getEStructuralFeature( ErfPackage.CONTENT__DATA_TYPES ),
                                                                              dataType,
                                                                Collections.singleton( newDataType ) );
                // the ReplaceCommand will result in an REMOVE and ADD notification
                editingDomain.getCommandStack().execute( replaceCommand );
                
                // reset the cellEditor (remember: there is only one object, which handles all cell in its row)
                // because the selected value must not propagate if another row is selected
                ((ComboBoxViewerCellEditor)this.cellEditor).setValue( null );
                ((CCombo)((ComboBoxViewerCellEditor)this.cellEditor).getControl()).clearSelection();

                // refresh the tableViewer for the datatypes
                super.getViewer().refresh();
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
                objects = (DatatypeDefinition[])erfModel.getCoreContent().getDataTypes().toArray();
            } catch( NullPointerException e ) {
                objects = new DatatypeDefinition[0];
            }
            return objects;
        }

        // listen on changes of Datatype definitions
        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );

            if( (notification.getNotifier() instanceof DatatypeDefinition)
                || (notification.getNewValue() instanceof DatatypeDefinition)
                || (notification.getOldValue() instanceof DatatypeDefinition) ) {
                // refresh the table (e.g. the name of the datatypye definition has changed => all rows must update)
                DatatypeDefinitionsForm.this.tableViewer.refresh();
            }
            
            // INFO : REMOVEs are handled by AddDeleteTableViewer
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
                return getTypenameForDatatypeDefinition( dataType );
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

        /**
         * Get list of typenames for the allowed DatatypeDefinition elements which hawe to be show in the combobox
         * 
         * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#getElements(java.lang.Object)
         * @return EClass[] of form (DatatypeDefinition x).eClass()
         */
        @SuppressWarnings("unchecked")
        public Object[] getElements( Object object ) {
            // this input will be ignored; the list is created based on the generally allowed model-structure
            assert (object instanceof DatatypeDefinition);

            // The editing domain provides functionality to extract allowed children
            Content toplevel = erfModel.getCoreContent();
            Collection<CommandParameter> allAllowedDescriptors = (Collection<CommandParameter>)editingDomain.getNewChildDescriptors( toplevel,
                                                                                                                                     null );
            // filter the child descriptors by the base type of DatatypeDefinition
            Collection<EClass> filteredAllowedDescriptors = new LinkedList<EClass>();
            for( CommandParameter descriptor : allAllowedDescriptors )
                if( (descriptor.value instanceof DatatypeDefinition) ) filteredAllowedDescriptors.add( ((DatatypeDefinition)descriptor.value).eClass() );

            // transform Collection into Array
            EClass[] toplevelDatatypeDefinitionNames = new EClass[filteredAllowedDescriptors.size()];
            toplevelDatatypeDefinitionNames = filteredAllowedDescriptors.toArray( toplevelDatatypeDefinitionNames );
            return toplevelDatatypeDefinitionNames;
        }

    }

    /**
     * Label provider for the Combo box
     */
    public class TypesForDatatypeDefinitionComboLabelProvider extends LabelProvider implements IBaseLabelProvider {
        @Override
        public String getText( Object element ) {
            return getTypenameForDatatypeDefinition( (EClass)element );
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
        tableViewer.setAddCommandParameter( erfModel.getCoreContent(),
                                            ErfFactoryImpl.eINSTANCE.createDatatypeDefinitionInteger().eClass() );
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
     * Extracts for any DatatypeDefinition object the name of its type.
     * <p>
     * Gets the text specified in the resource file of the edit plug-in.
     * 
     * @param dataType the DatatypeDefinition object in question
     * @return its type name
     */
    private String getTypenameForDatatypeDefinition( EClass eClass ) {
        String nameFromResource = ErfEditPlugin.INSTANCE.getString( "_UI_" + eClass.getName() + "_type" );
        return (nameFromResource == null) ? eClass.getName() : nameFromResource;
    }

    private String getTypenameForDatatypeDefinition( DatatypeDefinition dataType ) {
        return getTypenameForDatatypeDefinition( dataType.eClass() );
    }

}
