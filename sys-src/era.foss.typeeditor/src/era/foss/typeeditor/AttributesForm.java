/*
 * NAME: era.foss.typeeditor.AttributesForm
 */

package era.foss.typeeditor;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
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
import org.eclipse.jface.viewers.IStructuredContentProvider;
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
import era.foss.rif.DatatypeDefinition;
import era.foss.rif.SpecType;
import era.foss.rif.impl.RifFactoryImpl;

/**
 * Editor form for manipulating attributes.
 * 
 * @author cpn
 */
public class AttributesForm extends AbstractTypesForm {

    // for now the one and only spec type
    private SpecType specType;

    /**
     * Table viewer holding the attributes of a spec type
     */
    private AddDeleteTableViewer tableViewer;

    public AttributesForm( Composite parent, IEditorPart editor ) {
        super( parent, editor, SWT.NONE );

        // set-up layout
        GridLayout gridLayout = new GridLayout( 2, true );
        this.setLayout( gridLayout );

        createTableViewer();
    }

    /**
     * @see era.foss.typeeditor.AbstractTypesForm#constructorPreHook()
     * @since 17.03.2010
     */
    @Override
    protected void constructorPreHook() {
        super.constructorPreHook();
        if( rifModel.getCoreContent().getSpecTypes().size() == 0 ) {
            Command addCommand = AddCommand.create( editingDomain,
                                                    rifModel.getCoreContent(),
                                                    null,
                                                    RifFactoryImpl.eINSTANCE.createSpecType() );
            eraCommandStack.execute( addCommand );
        }
        specType = (SpecType)rifModel.getCoreContent().getSpecTypes().get( 0 );
    }

    /**
     * Provide data for table containing SpecTypes
     */
    public class AttributesAdapterFactoryContentProvider extends AdapterFactoryContentProvider {
        public AttributesAdapterFactoryContentProvider( AdapterFactory adapterFactory ) {
            super( adapterFactory );
            ((IChangeNotifier)adapterFactory).addListener( this );
        }

        public Object[] getElements( Object object ) {

            Object[] objects;
            try {
                objects = specType.getSpecAttributes().toArray();
            } catch( NullPointerException e ) {
                objects = new Object[0];
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

            switch (columnIndex) {
            case 0:
                return attribute.getLongName();
            case 1:
                DatatypeDefinition type = attribute.getType();
                if( type == null ) {
                    return "";
                } else {
                    return type.getLongName();
                }

            default:
                throw new RuntimeException( "Should not happen" );
            }
        }

        @Override
        public Image getColumnImage( Object element, int columnIndex ) {
            return null;
        }
    }

    public class AttributesEditingSupport extends EditingSupport {
        private CellEditor cellEditor;
        private int column;

        /**
         * Content provider for the combo box
         * 
         * @author schorsch
         * 
         */
        public class ComboContentProvider implements IStructuredContentProvider {

            @Override
            public Object[] getElements( Object inputElement ) {
                Object[] objects;
                try {
                    objects = rifModel.getCoreContent().getDataTypes().toArray();
                } catch( NullPointerException e ) {
                    objects = new Object[0];
                }
                return objects;
            }

            @Override
            public void dispose() {
            }

            @Override
            public void inputChanged( Viewer viewer, Object oldInput, Object newInput ) {
            }
        }

        /** Label provider for the Combo box */
        public class ComboLabelProvider  extends LabelProvider implements IBaseLabelProvider {
       
        }

        public AttributesEditingSupport( ColumnViewer viewer, int column ) {
            super( viewer );
            this.column = column;

            // Create the correct editor based on the column index
            switch (column) {
            case 0:
                cellEditor = new TextCellEditor( ((TableViewer)viewer).getTable() );
                break;
            case 1:
                ComboBoxViewerCellEditor comboCellEditor = new ComboBoxViewerCellEditor(
                    ((TableViewer)viewer).getTable() );
                comboCellEditor.setContenProvider( new ComboContentProvider() );
                comboCellEditor.setLabelProvider( new ComboLabelProvider() );
                // comboCellEditor.setInput( input );

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
            AttributeDefinition attribute = (AttributeDefinition)element;
            Object retVal = null;

            switch (this.column) {
            case 0:
                retVal = attribute.getLongName();
                break;
            case 1:
                // TODO: return name of
                retVal = null;
                break;
            default:
                break;
            }
            return retVal;
        }

        @Override
        protected void setValue( Object element, Object value ) {
            AttributeDefinition outdatedAttribute = (AttributeDefinition)element;

            switch (this.column) {
            case 0:
                outdatedAttribute.setLongName( (String)value );
                getViewer().update( element, null );
                break;
            case 1:
                // TODO: Set refernce to selected data type
                break;
            default:
                break;
            }
            getViewer().refresh();
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
        String[] colTitles = {"Name", "Datatype"};
        int[] colMinWidth = {100, 100};
        int[] colWeigth = {50, 50};
        boolean[] colResize = {true, false};
        for( int colNr = 0; colNr < colTitles.length; colNr++ ) {

            TableViewerColumn column = new TableViewerColumn( tableViewer, SWT.NONE );
            column.getColumn().setText( colTitles[colNr] );
            column.getColumn().setResizable( colResize[colNr] );
            column.getColumn().setMoveable( false );
            columnLayout.setColumnData( column.getColumn(), new ColumnWeightData(
                colWeigth[colNr],
                colMinWidth[colNr] ) );

            // column.setEditingSupport( new AttributesEditingSupport( tableViewer, colNr ) );
        }

        tableViewer.setContentProvider( new AttributesAdapterFactoryContentProvider( adapterFactory ) );
        tableViewer.setLabelProvider( new AttributesLabelProvider() );

        tableViewer.setInput( editingDomain.getResourceSet() );
    }

}
