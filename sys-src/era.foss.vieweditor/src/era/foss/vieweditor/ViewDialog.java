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
package era.foss.vieweditor;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.TreeStructureAdvisor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;

import era.foss.erf.ERF;
import era.foss.erf.EraToolExtension;
import era.foss.erf.ErfPackage;
import era.foss.erf.SpecType;
import era.foss.erf.ToolExtension;
import era.foss.objecteditor.EraCommandStack;
import era.foss.objecteditor.IAllowViewerSchemaChange;
import era.foss.typeeditor.AddDeleteTableViewer;
import era.foss.typeeditor.Ui;

/**
 * The topmost UI class of the typeeditor plug-in: representing the overall dialog.
 * <p>
 * Structured by a tab folder for which it instantiates forms for DatatypeDefinitions and SpecificationTypes.
 * <p>
 * Instantiates the {@link EraCommandStack} for handling the OK and Cancel buttons.
 * 
 */
public class ViewDialog extends Dialog {

    /** The editor. */
    private IEditorPart editor = null;

    /** The editing domain. */
    private EditingDomain editingDomain = null;
    // commandStack is required for Ok and Cancel Buttons
    /** The era command stack. */
    private EraCommandStack eraCommandStack = null;

    /** The type editor activator. */
    private Activator viewEditorActivator = null;

    /** the erf model */
    ERF erfModel;

    /**
     * Era Tool extension model object
     */
    private EraToolExtension toolExtension;

    /** UI object for helper methods */
    Ui ui;

    /**
     * Creates a editor for Datatype, Attributes and Spectypes.
     * 
     * @param activeShell the active shell
     * @param editor the editor
     */
    public ViewDialog( Shell activeShell, IEditorPart editor ) {
        super( activeShell );
        setShellStyle( getShellStyle() | SWT.RESIZE | SWT.MAX );

        // set-up context
        this.editor = editor;
        this.editingDomain = ((IEditingDomainProvider)editor).getEditingDomain();
        this.eraCommandStack = (EraCommandStack)editingDomain.getCommandStack();
        this.viewEditorActivator = era.foss.vieweditor.Activator.INSTANCE;

        // plant an initial checkpoint
        this.eraCommandStack.plantCheckpoint();

        // check and fix model
        Resource erfResource = (XMIResource)editingDomain.getResourceSet()
                                                         .getResource( EditUIUtil.getURI( editor.getEditorInput() ),
                                                                       true );
        this.erfModel = (ERF)(erfResource).getContents().get( 0 );

        // find Era specific tool extensions
        for( ToolExtension toolExtension : this.erfModel.getToolExtensions() ) {
            if( toolExtension.eClass().getClassifierID() == ErfPackage.ERA_TOOL_EXTENSION ) {
                this.toolExtension = (EraToolExtension)toolExtension;
            }
        }
        assert (this.toolExtension != null);

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
     */
    protected void configureShell( Shell shell ) {
        super.configureShell( shell );
        shell.setText( viewEditorActivator.getString( "_UI_View_Editor_label" ) );
        shell.setMinimumSize( 800, 400 );
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected Control createDialogArea( Composite parent ) {
        ui = new Ui( editingDomain );
        Composite composite = (Composite)super.createDialogArea( parent );
        composite.addDisposeListener( new DisposeListener() {

            @Override
            public void widgetDisposed( DisposeEvent e ) {
                ViewDialog.this.ui.dispose();

            }
        } );
        composite.setLayout( new GridLayout( 3, true ) );

        createViewTableViewer( composite );
        createViewElementTableViewer( composite );

        // (font of parent will be applied recursively to the newly added controls!)
        applyDialogFont( composite );

        return composite;
    }

    /**
     * Ok pressed.
     * 
     * @see org.eclipse.jface.dialogs.Dialog#okPressed()
     * @since 03.03.2010
     */
    protected void okPressed() {
        super.okPressed();
        // the performed commands should not be available for undo after OK.
        eraCommandStack.inhibitUndos();

        // redraw the SpecObject editor
        if( editor instanceof IViewerProvider ) {
            Viewer viewer = ((IViewerProvider)editor).getViewer();
            if( viewer instanceof IAllowViewerSchemaChange ) {
                ((IAllowViewerSchemaChange)viewer).recreateViewerSchema();
            }
        }
    }

    /**
     * Cancel pressed.
     * 
     * @see org.eclipse.jface.dialogs.Dialog#cancelPressed()
     * @since 03.03.2010
     */
    protected void cancelPressed() {
        super.cancelPressed();
        // undo the complete CommandStack:
        eraCommandStack.rollback();
    }

    /**
     * Creates the table viewer.
     */
    private void createViewTableViewer( Composite composite ) {

        AddDeleteTableViewer tableViewer = new AddDeleteTableViewer( composite, SWT.MULTI
            | SWT.V_SCROLL
            | SWT.BORDER
            | SWT.FULL_SELECTION );
        tableViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        tableViewer.setEditingDomain( editingDomain );
        tableViewer.setAddCommandParameter( toolExtension, ErfPackage.Literals.VIEW );

        ObservableListContentProvider cp = new ObservableListContentProvider();
        tableViewer.setContentProvider( cp );

        TableColumnLayout columnLayout = (TableColumnLayout)tableViewer.getTable().getParent().getLayout();

        // create column with name of the view
        TableViewerColumn nameColumn = new TableViewerColumn( tableViewer, SWT.NONE );
        columnLayout.setColumnData( nameColumn.getColumn(), new ColumnWeightData( 100, 70 ) );
        nameColumn.getColumn().setResizable( false );
        nameColumn.getColumn().setMoveable( false );
        nameColumn.getColumn().setText( Ui.getUiName( ErfPackage.Literals.IDENTIFIABLE__LONG_NAME ) );
        ui.bindColumn( nameColumn, new EStructuralFeature[]{ErfPackage.Literals.IDENTIFIABLE__LONG_NAME} );

        // provide input for the table
        IEMFListProperty viewsProperty = EMFProperties.list( ErfPackage.Literals.ERA_TOOL_EXTENSION__VIEWS );
        tableViewer.setInput( viewsProperty.observe( toolExtension ) );

        // this.master = ViewerProperties.singleSelection().observe( tableViewer );

    }

    /**
     * Creates the table viewer.
     */
    private void createViewElementTableViewer( Composite composite ) {
        CheckboxTreeViewer specTypeTreeViewer = new CheckboxTreeViewer( composite );
        specTypeTreeViewer.getTree().setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

        ObservableListTreeContentProvider cp = new ObservableListTreeContentProvider(
            new ViewElementTreeFactoryImpl(),
            new ViewElementTreeStructureAdvisorImpl() );

        specTypeTreeViewer.setContentProvider( cp );

        IObservableSet set = cp.getKnownElements();
        IObservableMap[] map = new IObservableMap[2];

        map[0] = EMFProperties.value( ErfPackage.Literals.IDENTIFIABLE__LONG_NAME ).observeDetail( set );

        map[1] = EMFProperties.value( ErfPackage.Literals.SPEC_TYPE__SPEC_ATTRIBUTES ).observeDetail( set );

        specTypeTreeViewer.setLabelProvider( new ObservableMapLabelProvider( map ) );

        // provide input for the table
        IEMFListProperty contentSpecTypeListProperty = EMFProperties.list( ErfPackage.Literals.CONTENT__SPEC_TYPES );
        specTypeTreeViewer.setInput( contentSpecTypeListProperty.observe( erfModel.getCoreContent() ) );

    }

    private static class ViewElementTreeFactoryImpl implements IObservableFactory {
        private IEMFListProperty specTypeAttributeListProperty = EMFProperties.list( ErfPackage.Literals.SPEC_TYPE__SPEC_ATTRIBUTES );

        public IObservable createObservable( final Object target ) {
            if( target instanceof IObservableList ) {
                return (IObservable)target;
            } else if( target instanceof SpecType ) {
                return specTypeAttributeListProperty.observe( target );
            }

            return null;
        }
    }

    private static class ViewElementTreeStructureAdvisorImpl extends TreeStructureAdvisor {
        // @Override
        // public Object getParent( Object element ) {
        // if( element instanceof Project ) {
        // return ((Project)element).getParent();
        // }
        //
        // return null;
        // }

        @Override
        public Boolean hasChildren( Object element ) {
            if( element instanceof SpecType && ((SpecType)element).getSpecAttributes().size() > 0 ) {
                return Boolean.TRUE;
            }
            return super.hasChildren( element );
        }
    }

}
