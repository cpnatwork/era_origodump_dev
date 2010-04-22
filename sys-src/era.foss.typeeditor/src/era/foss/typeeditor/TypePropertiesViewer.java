/*
 * NAME: era.foss.typeeditor.TypePropertiesForm
 */

package era.foss.typeeditor;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.views.properties.PropertySheetPage;

import era.foss.rif.presentation.EraCommandStack;

/**
 * 
 * @author cpn
 */
public class TypePropertiesViewer extends Composite {

    private EditingDomain editingDomain = null;
    private AdapterFactory adapterFactory = null;
    protected EraCommandStack eraCommandStack = null;

    private IStructuredSelection selection = null;
    private PropertySheetPage propertySheetPage = null;

    /**
     * Constructs a new instance of this class - defaulting the style to {@link SWT#NONE}.
     * 
     * @param parent a widget which will be the parent of the new instance (cannot be null)
     * @param editor the editor from which the and {@link CommandStack} can be derived
     * 
     * @see #AbstractTypesForm(Composite, IEditorPart, int)
     */
    public TypePropertiesViewer( Composite parent, IEditorPart editor, TableViewer modelTableViewer ) {
        this( parent, editor, modelTableViewer, SWT.NONE );
    }

    public TypePropertiesViewer( Composite parent, IEditorPart editor, TableViewer modelTableViewer, int style ) {
        super( parent, style );

        // set-up context
        this.editingDomain = ((IEditingDomainProvider)editor).getEditingDomain();
        this.eraCommandStack = (EraCommandStack)editingDomain.getCommandStack();
        this.adapterFactory = ((AdapterFactoryEditingDomain)editingDomain).getAdapterFactory();

        // readme: http://www.ralfebert.de/rcpbuch/swt_layouts1/
        GridLayout gridLayout = new GridLayout( 2, true );
        this.setLayout( gridLayout );



        propertySheetPage = new PropertySheetPage();
        // XXX: first try to filter was a specialized impl of PropSheetPage ...
//        propertySheetPage = new EraFilteredPropertySheetPage() {
//        };
        Composite propertySheetPageComposite = new Composite( this, SWT.BORDER );
        propertySheetPageComposite.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true, 2, 0 ) );
        propertySheetPageComposite.setLayout( new FillLayout() );
        propertySheetPage.setPropertySourceProvider( new AdapterFactoryContentProvider( adapterFactory ) );
        propertySheetPage.createControl( propertySheetPageComposite);
        
        modelTableViewer.addSelectionChangedListener( new ISelectionChangedListener() {
            public void selectionChanged( SelectionChangedEvent event ) {
                TypePropertiesViewer.this.selection = (IStructuredSelection)event.getSelection();
                if( TypePropertiesViewer.this.selection.isEmpty() ) {
                    // empty the property viewer
                    // FIXME: is this the desired method?
                    propertySheetPage.dispose();
                    return;
                }
                propertySheetPage.selectionChanged( null, TypePropertiesViewer.this.selection );
                propertySheetPage.refresh();
            }
        } );

        /*
         * FIXME: temporarily set "Property Filter Flags" of Identifiable:[ID, desc, long name] or
         * DatatypeDefinitionSimple:[ID, desc, long name] to "org.eclipse.ui.views.properties.expert"
         */
        // Resource rifResource = null;
        // RIF rifModel = null;
        // rifResource = (XMIResource)editingDomain.getResourceSet()
        // .getResource( EditUIUtil.getURI( editor.getEditorInput() ), true );
        // rifModel = (RIF)(rifResource).getContents().get( 0 );
        // RifFactory.eINSTANCE.createDatatypeDefinitionInteger().eClass().eSet( "Property Filter Flags",
        // "org.eclipse.ui.views.properties.expert" );

    }
}
