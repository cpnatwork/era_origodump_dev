package era.foss.typeeditor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
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

    private Control createDataTypeEditor( Composite parent ) {
        Composite com = new Composite( parent, SWT.NONE );
        com.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        GridLayout gridLayout = new GridLayout( 2, true );
        com.setLayout( gridLayout );

        TableViewer tableViewer = new TableViewer( com );

        // Table layout settings
        final Table table = tableViewer.getTable();
        table.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        table.setHeaderVisible( true );
        table.setLinesVisible( true );

        String[] titles = {"ID", "Name", "Desc"};
        int[] bounds = {50, 100, 200};
        for( int i = 0; i < titles.length; i++ ) {

            TableViewerColumn column = new TableViewerColumn( tableViewer, SWT.NONE );
            column.getColumn().setText( titles[i] );
            column.getColumn().setWidth( bounds[i] );
            column.getColumn().setResizable( true );
            column.getColumn().setMoveable( true );
            // TODO: Add editing domain
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

        Text text = new Text( com, SWT.BORDER );
        text.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        text.setText( "DataTypes" );
        return com;
    }

    public class DatatypesAdapterFactoryContentProvider extends AdapterFactoryContentProvider {
        public DatatypesAdapterFactoryContentProvider( AdapterFactory adapterFactory ) {
            super( adapterFactory );
            /*
             * TODO: At the moment we are not quite sure if we need this. - Data type editor does not require
             * information of other parts of the model. - The Type Editor shall be a modal dialog therefore the data
             * types can't be updated anywhere else
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
                return datatype.getID();
            case 1:
                return datatype.getLongName();
            case 2:
                return datatype.getDesc();
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

// import org.eclipse.jface.dialogs.Dialog;
// import org.eclipse.swt.SWT;
// import org.eclipse.swt.graphics.Point;
// import org.eclipse.swt.layout.FillLayout;
// import org.eclipse.swt.layout.FormLayout;
// import org.eclipse.swt.layout.GridData;
// import org.eclipse.swt.layout.GridLayout;
// import org.eclipse.swt.widgets.Composite;
// import org.eclipse.swt.widgets.Control;
// import org.eclipse.swt.widgets.Label;
// import org.eclipse.swt.widgets.Shell;
// import org.eclipse.swt.widgets.TabFolder;
// import org.eclipse.swt.widgets.TabItem;
// import org.eclipse.swt.widgets.Text;
//
// public class TypeEditor extends Dialog {
//
// protected TypeEditor(Shell parentShell) {
// super(parentShell);
// }
//
// @Override
// protected void configureShell(Shell shell) {
// this.setShellStyle( SWT.DIALOG_TRIM | SWT.RESIZE | SWT.MAX );
// super.configureShell(shell);
// shell.setText("Type Editor"); // Dialog-Titel setzen
//		
// FormLayout formLayout = new FormLayout ();
// formLayout.marginWidth = 10;
// formLayout.marginHeight = 10;
// formLayout.spacing = 10;
// setLayout (formLayout);
//
//		
// shell.setSize(450, 250);
// }
//	
//
// protected Control createDialogArea(Composite parent) {
//
// Composite composite = (Composite) super.createDialogArea(parent);
//		
//		
//        
// /* The editor for Datatypes, Attributes and SpecTypes
// * are shown in different tabs.
// */
// TabFolder typeEditorTabFolder= new TabFolder( parent, SWT.BORDER );
//		
//		
// /* tab for Datatype editor */
// TabItem dataTypeEditorTab = new TabItem(typeEditorTabFolder, SWT.NULL);
// dataTypeEditorTab.setText("Datatypes");
// Text text = new Text(typeEditorTabFolder, SWT.BORDER);
// text.setText("DataTypes");
// dataTypeEditorTab.setControl(text);
//		
// /* tab for Attribute editor */
// TabItem attributeEditorTab = new TabItem(typeEditorTabFolder, SWT.NULL);
// attributeEditorTab.setText("Attributes");
// Text text2 = new Text(typeEditorTabFolder, SWT.BORDER);
// text.setText("Attributes");
// dataTypeEditorTab.setControl(text2);
//        
// /* tab for Spectypes editor */
// TabItem specTypeEditorTab = new TabItem(typeEditorTabFolder, SWT.NULL);
// specTypeEditorTab.setText("Specification Types");
// Text text3 = new Text(typeEditorTabFolder, SWT.BORDER);
// text.setText("Specification Types");
// dataTypeEditorTab.setControl(text3);
//        
// typeEditorTabFolder.setSize(500 , 300 );
//
//        
//        
// /*composite.setLayout(new GridLayout(1, false));
//
// label = new Label(composite, SWT.FLAT);
// GridData gdl = new GridData();
// gdl.grabExcessHorizontalSpace = true;
// label.setLayoutData(gdl);
// label.setText("Ihre Eingabe: ");
//
// text = new Text(composite, SWT.FLAT | SWT.BORDER);
// GridData gdt = new GridData();
// gdt.grabExcessHorizontalSpace = true;
// text.setLayoutData(gdt);*/
//
// return composite;
// }
//
// @Override
// public void okPressed() {
// close();
// }
// }
