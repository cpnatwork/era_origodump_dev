/*
 * NAME: era.foss.typeeditor.AbstractTypesForm
 */

package era.foss.typeeditor;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IEditorPart;

import era.foss.rif.RIF;
import era.foss.rif.presentation.EraCommandStack;

/**
 * An abstract form, that contains members and constructor code that is common to all editing forms for ERA types.
 * 
 * @author cpn
 */
public abstract class AbstractTypesForm extends Composite {

    protected IEditorPart editor = null;
    protected EditingDomain editingDomain = null;
    protected Resource rifResource = null;
    protected RIF rifModel = null;
    protected EraCommandStack eraCommandStack = null;
    protected AdapterFactory adapterFactory = null;

    /**
     * Constructs a new instance of this class - defaulting the style to {@link SWT#NONE}.
     * 
     * @param parent a widget which will be the parent of the new instance (cannot be null)
     * @param editor the editor from which the and {@link CommandStack} can be derived
     * 
     * @see #AbstractTypesForm(Composite, IEditorPart, int)
     */
    public AbstractTypesForm( Composite parent, IEditorPart editor ) {
        this( parent, editor, SWT.NONE );
    }

    /**
     * Constructs a new instance of this class given its parent, the editor and a style value describing its behavior
     * and appearance.
     * 
     * @param parent a widget which will be the parent of the new instance (cannot be null)
     * @param editor the editor from which the and {@link CommandStack} can be derived
     * @param style the style of widget to construct
     * 
     * @see SWT#NO_BACKGROUND
     * @see SWT#NO_FOCUS
     * @see SWT#NO_MERGE_PAINTS
     * @see SWT#NO_REDRAW_RESIZE
     * @see SWT#NO_RADIO_GROUP
     * @see SWT#EMBEDDED
     * @see SWT#DOUBLE_BUFFERED
     * @see Widget#getStyle
     */
    public AbstractTypesForm( Composite parent, IEditorPart editor, int style ) {
        super( parent, style );

        // set-up context
        this.editor = editor;
        this.editingDomain = ((IEditingDomainProvider)editor).getEditingDomain();
        this.rifResource = (XMIResource)editingDomain.getResourceSet()
                                                     .getResource( EditUIUtil.getURI( editor.getEditorInput() ), true );
        this.rifModel = (RIF)(rifResource).getContents().get( 0 );

        this.eraCommandStack = (EraCommandStack)editingDomain.getCommandStack();
        this.adapterFactory = ((AdapterFactoryEditingDomain)editingDomain).getAdapterFactory();

        // set-up layout
        this.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        GridLayout gridLayout = new GridLayout( 2, true );
        this.setLayout( gridLayout );

        // allow derived classes to do pre initializations
        this.constructorPreHook();
        // set up left side (= TableViewer)
        TableViewer tableViewer = this.setupLeftSide();
        // set up right side (= types' properties viewer) [need TableViewer]
        this.setupRightSide( tableViewer );
    }

    protected void constructorPreHook(){};
    abstract protected TableViewer setupLeftSide();

    private void setupRightSide( TableViewer tableViewer ) {
        TypePropertiesViewer typePropertiesViewer = new TypePropertiesViewer(
            this,
            this.editor,
            tableViewer,
            SWT.MULTI | SWT.V_SCROLL | SWT.FULL_SELECTION );
        typePropertiesViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
    }

}
