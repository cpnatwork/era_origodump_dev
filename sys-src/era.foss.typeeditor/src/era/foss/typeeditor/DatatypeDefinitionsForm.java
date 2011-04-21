/**************************************************************************
 * ERA - Eclipse Requirements Analysis
 * ==============================================
 * Copyright (C) 2009-2011 by Georg Blaschke, Christoph P. Neumann
 * and Bernd Haberstumpf (http://era.origo.ethz.ch)
 **************************************************************************
 * Licensed under the Eclipse Public License - v 1.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.eclipse.org/org/documents/epl-v10.html
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **************************************************************************
 * $Id$
 *************************************************************************/

package era.foss.typeeditor;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;

import era.foss.erf.Content;
import era.foss.erf.DatatypeDefinition;
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
 * 
 * @see DatatypeDefinition
 */
final public class DatatypeDefinitionsForm extends AbstractErfTypesForm {

    /** Table viewer containing the datatype definitions. */
    private AddDeleteTableViewer tableViewer;

    /** object for creating and binding ui elements. */
    private Ui ui;

    /**
     * Instantiates a new datatype definitions form.
     * 
     * @param parent the parent
     * @param editor the editor
     */
    public DatatypeDefinitionsForm( Composite parent, IEditorPart editor ) {
        super( parent, editor, SWT.NONE );

        // set-up layout
        GridLayout gridLayout = new GridLayout( 2, true );
        this.setLayout( gridLayout );

        ui = new Ui( editingDomain, erfModel );

        createTableViewer();

        // setup Data type properties viewer
        DetailViewer dataTypeDefinitionDetail = new DetailViewer(
            this,
            SWT.NONE,
            editingDomain,
            ViewerProperties.singleSelection().observe( tableViewer ) );
        dataTypeDefinitionDetail.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

    }

    /**
     * The Class DatatypeDefinitionEditingSupport.
     */
    public class DatatypeDefinitionTypeEditingSupport extends EditingSupport {

        /** The cell editor. */
        private CellEditor cellEditor;

        /**
         * Instantiates a new datatype definition editing support.
         * 
         * @param viewer the viewer
         * @param column the column
         */
        public DatatypeDefinitionTypeEditingSupport( ColumnViewer viewer ) {
            super( viewer );
            ComboBoxViewerCellEditor comboCellEditor = new ComboBoxViewerCellEditor(
                ((TableViewer)viewer).getTable(),
                SWT.READ_ONLY );
            comboCellEditor.setContenProvider( new TypesForDatatypeDefinitionComboContentProvider(
                adapterFactory,
                comboCellEditor.getViewer() ) );

            comboCellEditor.setLabelProvider( new TypesForDatatypeDefinitionComboLabelProvider() );
            comboCellEditor.setInput( editingDomain.getResourceSet() );
            this.cellEditor = comboCellEditor;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.jface.viewers.EditingSupport#canEdit(java.lang.Object)
         */
        @Override
        protected boolean canEdit( Object element ) {
            return true;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.jface.viewers.EditingSupport#getCellEditor(java.lang.Object)
         */
        @Override
        protected CellEditor getCellEditor( Object element ) {
            return this.cellEditor;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.jface.viewers.EditingSupport#getValue(java.lang.Object)
         */
        @Override
        protected Object getValue( Object element ) {
            assert (element instanceof DatatypeDefinition);
            DatatypeDefinition dataType = (DatatypeDefinition)element;
            return dataType.eClass();
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.jface.viewers.EditingSupport#setValue(java.lang.Object, java.lang.Object)
         */
        @Override
        protected void setValue( Object element, Object value ) {
            assert (element instanceof DatatypeDefinition);
            DatatypeDefinition dataType = (DatatypeDefinition)element;

            // the value must always be valid (ensured with ComboBox and SWT.READ_ONLY for the cells)
            assert (value instanceof EClass);
            String dataTypeNameNew = getTypenameForDatatypeDefinition( (EClass)value );
            String dataTypeNameCurrent = getTypenameForDatatypeDefinition( dataType );
            if( dataTypeNameNew.equals( dataTypeNameCurrent ) ) {
                // the current data type is the same data type selected in the ComboBox
                // therefore: DO NOTHING
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
                                                            erfModel.getCoreContent()
                                                                    .eClass()
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

        }
    }

    /**
     * Label Provider for the Type of the Datatype definition
     */
    public class DatatypeDefinitionTypeLabelProvider extends CellLabelProvider {

        @Override
        public void update( ViewerCell cell ) {
            assert (cell.getElement() instanceof DatatypeDefinition);
            DatatypeDefinition dataType = (DatatypeDefinition)cell.getElement();
            cell.setText( getTypenameForDatatypeDefinition( dataType ) );
        }
    }

    /**
     * Content provider for the combo box.
     */
    public class TypesForDatatypeDefinitionComboContentProvider extends AdapterFactoryContentProvider {

        /**
         * Instantiates a new types for datatype definition combo content provider.
         * 
         * @param adapterFactory the adapter factory
         * @param viewer the viewer
         */
        public TypesForDatatypeDefinitionComboContentProvider( AdapterFactory adapterFactory, Viewer viewer ) {
            super( adapterFactory );
            this.viewer = viewer;
        }

        /**
         * Get list of typenames for the allowed DatatypeDefinition elements which hawe to be show in the combobox.
         * 
         * @param object the object
         * @return EClass[] of form (DatatypeDefinition x).eClass()
         * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#getElements(java.lang.Object)
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
     * Label provider for the Combo box.
     */
    public class TypesForDatatypeDefinitionComboLabelProvider extends LabelProvider implements IBaseLabelProvider {

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
         */
        @Override
        public String getText( Object element ) {
            return getTypenameForDatatypeDefinition( (EClass)element );
        }
    }

    /**
     * Creates the table viewer.
     */
    private void createTableViewer() {

        tableViewer = new AddDeleteTableViewer( this, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION );
        tableViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        tableViewer.setEditingDomain( editingDomain );
        tableViewer.setAddCommandParameter( erfModel.getCoreContent(),
                                            ErfFactoryImpl.eINSTANCE.createDatatypeDefinitionInteger().eClass() );

        ObservableListContentProvider cp = new ObservableListContentProvider();
        tableViewer.setContentProvider( cp );

        TableColumnLayout columnLayout = (TableColumnLayout)tableViewer.getTable().getParent().getLayout();

        // create column with name of the datatype
        TableViewerColumn columnName = new TableViewerColumn( tableViewer, SWT.NONE );
        columnLayout.setColumnData( columnName.getColumn(), new ColumnWeightData( 100, 70 ) );
        columnName.getColumn().setResizable( true );
        columnName.getColumn().setMoveable( false );
        columnName.getColumn().setText( Ui.getUiName( ErfPackage.Literals.IDENTIFIABLE__LONG_NAME ) );
        EStructuralFeature[] structuralFeature = {ErfPackage.Literals.IDENTIFIABLE__LONG_NAME};
        ui.bindColumn( columnName, structuralFeature );

        // create column with type of the datatype
        TableViewerColumn columnType = new TableViewerColumn( tableViewer, SWT.NONE );
        columnLayout.setColumnData( columnType.getColumn(), new ColumnWeightData( 70, 30 ) );
        columnType.getColumn().setResizable( false );
        columnType.getColumn().setMoveable( false );
        columnType.setEditingSupport( new DatatypeDefinitionTypeEditingSupport( tableViewer ) );
        columnType.setLabelProvider( new DatatypeDefinitionTypeLabelProvider() );
        columnType.getColumn().setText( typeEditorActivator.getString( "_UI_DataTypeDefinitionType_label" ) );

        // provide input for the table
        IEMFListProperty dataTypeProperty = EMFProperties.list( ErfPackage.Literals.CONTENT__DATA_TYPES );
        tableViewer.setInput( dataTypeProperty.observe( erfModel.getCoreContent() ) );

    }

    /**
     * Extracts for any DatatypeDefinition object the name of its type.
     * <p>
     * Gets the text specified in the resource file of the edit plug-in.
     * 
     * @param eClass the e class
     * @return its type name
     */
    private String getTypenameForDatatypeDefinition( EClass eClass ) {
        String nameFromResource = ErfEditPlugin.INSTANCE.getString( "_UI_" + eClass.getName() + "_type" );
        return (nameFromResource == null) ? eClass.getName() : nameFromResource;
    }

    /**
     * Gets the typename for datatype definition.
     * 
     * @param dataType the data type
     * @return the typename for datatype definition
     */
    private String getTypenameForDatatypeDefinition( DatatypeDefinition dataType ) {
        return getTypenameForDatatypeDefinition( dataType.eClass() );
    }

}
