package era.foss.ui.contrib;

import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.widgets.Composite;

/**
 * Decorator for ComboBoxViewerCellEditor providing an ISelectionProvider interface
 */
public class ComboBoxViewerCellEditorSp extends ComboBoxViewerCellEditor implements ISelectionProvider
{
    /**
     * {@link ComboBoxViewerCellEditor#ComboBoxViewerCellEditor(Composite)}
     */
    public ComboBoxViewerCellEditorSp( Composite parent ) {
        super( parent );
    }
    /**
     * {@link ComboBoxViewerCellEditor#ComboBoxViewerCellEditor(Composite, int)}
     */
    public ComboBoxViewerCellEditorSp( Composite parent,int style ) {
        super( parent,style );
    }      
    /**
     * {@link ISelectionProvider#addSelectionChangedListener(ISelectionChangedListener)}
     */
    @Override
    public void addSelectionChangedListener( ISelectionChangedListener listener ) {
        getViewer().addSelectionChangedListener( listener );       
    }
    /**
     * {@link ISelectionProvider#getSelection()}
     */
    @Override
    public ISelection getSelection() {
        return getViewer().getSelection();
    }
    /**
     * {@link ISelectionProvider#removeSelectionChangedListener(ISelectionChangedListener)}
     */
    @Override
    public void removeSelectionChangedListener( ISelectionChangedListener listener ) {
        getViewer().removeSelectionChangedListener( listener );         
    }
    /**
     * {@link ISelectionProvider#setSelection(ISelection)}
     */
    @Override
    public void setSelection( ISelection selection ) {
        getViewer().setSelection( selection );
    }    
}
