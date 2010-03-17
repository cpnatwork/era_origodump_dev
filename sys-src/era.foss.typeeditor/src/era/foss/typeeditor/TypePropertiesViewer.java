/*
 * NAME: era.foss.typeeditor.TypePropertiesForm
 */

package era.foss.typeeditor;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.views.properties.PropertySheetPage;

import era.foss.rif.Identifiable;
import era.foss.rif.RifPackage;
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

    private Text descriptionText = null;
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

        GridLayout gridLayout = new GridLayout( 1, true );
        this.setLayout( gridLayout );

        descriptionText = new Text( this, SWT.BORDER );
        descriptionText.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        descriptionText.setEditable( false );

        descriptionText.addModifyListener( new ModifyListener() {
            @Override
            public void modifyText( ModifyEvent e ) {
                assert (TypePropertiesViewer.this.selection != null);
                Identifiable identifiable = (Identifiable)TypePropertiesViewer.this.selection.getFirstElement();
                Command command = SetCommand.create( editingDomain,
                                                     identifiable,
                                                     RifPackage.eINSTANCE.getIdentifiable_Desc(),
                                                     descriptionText.getText() );
                TypePropertiesViewer.this.eraCommandStack.execute( command );
            }
        } );

        modelTableViewer.addSelectionChangedListener( new ISelectionChangedListener() {
            public void selectionChanged( SelectionChangedEvent event ) {
                TypePropertiesViewer.this.selection = (IStructuredSelection)event.getSelection();
                if( TypePropertiesViewer.this.selection.isEmpty() ) {
                    descriptionText.setText( "" );
                    descriptionText.setEditable( false );
                    return;
                }
                Identifiable identifiable = (Identifiable)TypePropertiesViewer.this.selection.getFirstElement();
                descriptionText.setText( identifiable.getDesc() );
                descriptionText.setEditable( true );
                descriptionText.redraw();
            }
        } );

        // FIXME: How to integrate the PropertySheetPage into the Composite structure?
        propertySheetPage = new PropertySheetPage() {
        };
        propertySheetPage.setPropertySourceProvider( new AdapterFactoryContentProvider( adapterFactory ) );

    }

}
