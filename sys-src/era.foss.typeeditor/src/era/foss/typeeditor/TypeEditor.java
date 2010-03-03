package era.foss.typeeditor;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;

import era.foss.rif.DatatypeDefinition;
import era.foss.rif.RIF;
import era.foss.rif.RIFContent;
import era.foss.rif.RifPackage;
import era.foss.rif.impl.RIFContentImpl;
import era.foss.rif.impl.RifFactoryImpl;
import era.foss.rif.provider.RIFItemProvider;
import era.foss.rif.util.RifAdapterFactory;

/**
 * A simple input dialog for soliciting an input string from the user.
 * <p>
 * This concrete dialog class can be instantiated as is, or further subclassed as required.
 * </p>
 */
public class TypeEditor extends Dialog {

    private EditingDomain editingDomain;
    private AdapterFactory adapterFactory;

    private IStructuredSelection selection;

    private IEditorPart editor;
   
    private HashMap<Integer,String> DataTypeTypes;
    
    

    /**
     * Creates a editor for Datatype, Attributes and Spectypes
     * 
     * @param parentShell parent shell of this dialog
     * @param adapterFactory
     * @param domain
     * 
     */
    public TypeEditor( Shell activeShell, IEditorPart editor ) {
        super( activeShell );
        setShellStyle( getShellStyle() | SWT.RESIZE | SWT.MAX );
        this.editor = editor;
        this.editingDomain = ((IEditingDomainProvider)editor).getEditingDomain();
        this.adapterFactory = ((AdapterFactoryEditingDomain)editingDomain).getAdapterFactory();
        
        //Fill hashMap with supported types
        DataTypeTypes = new HashMap<Integer, String>();
        DataTypeTypes.put(RifPackage.DATATYPE_DEFINITION_INTEGER  , "Integer");
        DataTypeTypes.put(RifPackage.DATATYPE_DEFINITION_STRING , "String");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
     */
    protected void configureShell( Shell shell ) {
        super.configureShell( shell );
        shell.setText( "Type Editor" );
        shell.setMinimumSize( 600, 400 );
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected Control createDialogArea( Composite parent ) {
        Composite composite = (Composite)super.createDialogArea( parent );

        TabFolder typeEditorTabFolder = new TabFolder( composite, SWT.NONE );
        typeEditorTabFolder.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        typeEditorTabFolder.setFont( parent.getFont() );

        /* tab for Datatype editor */
        TabItem dataTypeEditorTab = new TabItem( typeEditorTabFolder, SWT.NONE );
        dataTypeEditorTab.setText( "Datatypes" );
        Control control = createDataTypeEditor( typeEditorTabFolder );
        dataTypeEditorTab.setControl( control );

        /* tab for Attribute editor */
        TabItem attributeEditorTab = new TabItem( typeEditorTabFolder, SWT.NONE );
        attributeEditorTab.setText( "Attributes" );
        Text text2 = new Text( typeEditorTabFolder, SWT.BORDER );
        text2.setText( "Attributes" );
        attributeEditorTab.setControl( text2 );

        /* tab for Spectypes editor */
        TabItem specTypeEditorTab = new TabItem( typeEditorTabFolder, SWT.NONE );
        specTypeEditorTab.setText( "Specification Types" );
        Text text3 = new Text( typeEditorTabFolder, SWT.BORDER );
        text3.setText( "Specification Types" );
        specTypeEditorTab.setControl( text3 );

        applyDialogFont( composite );
        return composite;
    }
    
    public class DatatypesEditingSupport extends EditingSupport {
        private CellEditor cellEditor;
        private int column;

        
        
        public DatatypesEditingSupport(ColumnViewer viewer, int column) {
            super(viewer);
            this.column = column;
            
            // Create the correct editor based on the column index
            switch (column) {
            case 0:
                cellEditor = new TextCellEditor(((TableViewer) viewer).getTable());
                break;
            case 1: 
                cellEditor = new ComboBoxCellEditor( ((TableViewer) viewer).getTable(), DataTypeTypes.values().toArray(new String[DataTypeTypes.size()]));
                break;
            default:
                cellEditor = null;
            }
        }

        @Override
        protected boolean canEdit(Object element) {
            return true;
        }

        @Override
        protected CellEditor getCellEditor(Object element) {
            return this.cellEditor;
        }

        @Override
        protected Object getValue(Object element) {
            DatatypeDefinition dataType = (DatatypeDefinition) element;
            Object retVal = null;
            
            switch (this.column) {
            case 0:
                retVal = dataType.getLongName();
                break;
            case 1:   
                String dataTypeName=DataTypeTypes.get( dataType.getID());
                int index = 0;
                String[] comboItems = ((ComboBoxCellEditor) this.cellEditor).getItems();
                for (index = 0;index < comboItems.length;index++){
                  if (dataTypeName == comboItems[index]){
                      break;
                  }
                }
                retVal = new Integer(index);
                break;
            default:
                break;
            }
            return retVal;
        }



        @Override
        protected void setValue(Object element, Object value) {
            DatatypeDefinition dataType = (DatatypeDefinition) element;

            switch (this.column) {
            case 0:
                dataType.setLongName( (String)value );
                break;
            case 1:
                EList<DatatypeDefinition>  dataTypes = ((RIFContentImpl)editingDomain.getParent( dataType )).getDataTypes();
                
                // Get index of old data type 
                int currentDataTypePos = dataTypes.indexOf( dataType );
                String currentDataTypeLongName = dataType.getLongName();
                // remove old data type  
                dataTypes.remove( currentDataTypePos );
                
                DatatypeDefinition newDataType = null;
                switch((Integer)value)
                {
                    case 0:
                        newDataType = RifFactoryImpl.eINSTANCE.createDatatypeDefinitionInteger();
                        break;
                    case 1:
                        newDataType = RifFactoryImpl.eINSTANCE.createDatatypeDefinitionString();
                        break;
                        
                }              
                dataTypes.add( currentDataTypePos, newDataType);
                newDataType.setLongName( currentDataTypeLongName );
                break;
            default:
                break;
            }
            getViewer().refresh();
        }

    }

    private String getTypeName( DatatypeDefinition dataType ) {
        int classifierID = dataType.eClass().getClassifierID();
        return DataTypeTypes.get(new Integer(classifierID));
    }
    
    

    private Control createDataTypeEditor( Composite parent ) {
        Composite com = new Composite( parent, SWT.NONE );
        com.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        GridLayout gridLayout = new GridLayout( 2, true );
        com.setLayout( gridLayout );


        
        final TableViewer tableViewer = new TableViewer( com );

        // Table layout settings
        final Table table = tableViewer.getTable();
        table.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        table.setHeaderVisible( true );
        table.setLinesVisible( true );

        String[] colTitles = {"Name", "Type"};
        int[] colBounds = {100, 200};
        for( int colNr = 0; colNr < colTitles.length; colNr++ ) {

            TableViewerColumn column = new TableViewerColumn( tableViewer, SWT.NONE );
            column.getColumn().setText( colTitles[colNr] );
            column.getColumn().setWidth( colBounds[colNr] );
            column.getColumn().setResizable( true );
            column.getColumn().setMoveable( true );
            // enable editing support
            column.setEditingSupport(new DatatypesEditingSupport(tableViewer, colNr));


        }

        tableViewer.setColumnProperties( new String[]{"a", "b", "c"} );

        tableViewer.setContentProvider( new DatatypesAdapterFactoryContentProvider( adapterFactory ) );
        tableViewer.setLabelProvider( new DatatypesLabelProvider() );

        tableViewer.addSelectionChangedListener( new ISelectionChangedListener() {
            public void selectionChanged( SelectionChangedEvent event ) {
                IStructuredSelection s = (IStructuredSelection)event.getSelection();

                System.out.println( "Number of items selected is " + s.size() );
                selection = (IStructuredSelection)event.getSelection();
            }

        } );

        tableViewer.addDoubleClickListener( new IDoubleClickListener() {

            @Override
            public void doubleClick( DoubleClickEvent event ) {
                System.out.println( "Double  " + selection.size() );

            }
        } );

        tableViewer.setInput( editingDomain.getResourceSet() );

        //Text text = new Text( com, SWT.BORDER );
        //text.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        //text.setText( "DataTypes" );
        
        
        
        Button addElementButton = new Button(com,SWT.PUSH);
        addElementButton.setSize( 50, 50 );
        addElementButton.setLayoutData( new GridData( SWT.FILL, SWT.TOP, true, false ) );
        addElementButton.setText( "Add" );
        addElementButton.addSelectionListener( new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                XMIResource resource = (XMIResource)editingDomain.getResourceSet()
                .getResource( EditUIUtil.getURI( editor.getEditorInput() ),
                              true );
RIF RIF = (RIF)(resource).getContents().get( 0 );
                EList<DatatypeDefinition>  dataTypes = RIF.getCoreContent().getDataTypes();
                DatatypeDefinition newDataType = RifFactoryImpl.eINSTANCE.createDatatypeDefinitionInteger();
                dataTypes.add( newDataType );
                tableViewer.refresh();
            }
        });
        
        return com;
    }

    public class DatatypesAdapterFactoryContentProvider extends AdapterFactoryContentProvider {
        public DatatypesAdapterFactoryContentProvider( AdapterFactory adapterFactory ) {
            super( adapterFactory );
            /*
             * TODO: At the moment we are not quite sure if we need this. 
             * - Data type editor does not require
             * information of other parts of the model. 
             * 
             * - The Type Editor shall be a modal dialog therefore the data
             * types can't be updated anywhere else
             * 
             * In this special case it might be sufficient to implement @IStructuredContentProvider
             */
            ((IChangeNotifier)adapterFactory).addListener( this );
        }

        public Object[] getElements( Object object ) {

            XMIResource resource = (XMIResource)editingDomain.getResourceSet()
                                                             .getResource( EditUIUtil.getURI( editor.getEditorInput() ),
                                                                           true );
            RIF RIF = (RIF)(resource).getContents().get( 0 );

            Object[] objects;
            try {
                objects = RIF.getCoreContent().getDataTypes().toArray();
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

    }

}

