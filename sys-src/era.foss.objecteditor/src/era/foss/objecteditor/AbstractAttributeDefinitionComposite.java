package era.foss.objecteditor;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import era.foss.erf.AttributeValue;
import era.foss.erf.SpecObject;
import era.foss.erf.ViewElement;

public abstract class AbstractAttributeDefinitionComposite extends Composite {

    /** color for default values */
    final static int COLOR_DEFAULT_VALUE = SWT.COLOR_INFO_BACKGROUND;

    /** The view element to show which refers to a AttributeDefifinition */
    final ViewElement viewElement;

    /** Create one data binding context for all Elements */
    static final DataBindingContext dbc = new DataBindingContext();

    /** binding of the GUI element to the model element */
    Binding binding;

    public AbstractAttributeDefinitionComposite( Composite parent, ViewElement viewElement ) {
        super( parent, SWT.NONE );
        this.setLayout( new FillLayout() );
        this.viewElement = viewElement;
    }

    /**
     * Return the view element associated with this GUI element
     * 
     * @return the view element associated with this GUI element
     */
    public ViewElement getViewElement() {
        return viewElement;
    }

    /**
     * Bind the GUI element to the model element. This has to be implemented be subclasses.
     * 
     * <strong>Subclasses have to to call this method in case the ovveride it.</strong>
     */
    public void bind( SpecObject specObject, AttributeValue attributeValue, EditingDomain editingDomain ) {
        this.unbind();
    }

    /**
     * Unbind the GUI element from the model element.
     * 
     * <strong>Subclasses have to to call this method in case the ovveride it.</strong>
     */
    public void unbind() {
        if( this.binding != null ) {
            dbc.removeBinding( binding );
            binding.dispose();
        }
    }

    /** Get the control actually representing the AttributeDefinition */
    public abstract Control getControl();
}
