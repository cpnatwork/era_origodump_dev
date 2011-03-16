package era.foss.typeeditor;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import era.foss.erf.provider.ErfEditPlugin;

/**
 * This class provides methods for creating UI elements for Ecore models
 */
public class Ui {

    //The editing domain
    private EditingDomain editingDomain;
    
    // data binding context used for binding EMF elements to UI elements
    private DataBindingContext dataBindContext;
    
    /**
     * Create Ui
     * Please call the dispose method when an object of this type
     * is not required anymore 
     * 
     * @param editingDomain used for binding the UI elements to
     */
    public Ui(EditingDomain editingDomain)
    {
        this.editingDomain = editingDomain;
        dataBindContext = new EMFDataBindingContext();
    }

    /** 
     * Create a text field with a label
     * The information about the element is retrieved from the Ecore model
     */
    public void createText(Composite parent, EAttribute eAttribute, IObservableValue master)
    {
        //create label
        Label label = new Label(parent,SWT.NONE);
        label.setText(Ui.getUiName( eAttribute ));
        label.setLayoutData( new GridData( SWT.LEFT, SWT.DEFAULT, true, false ) );
        
        // create text field
        Text text = new Text(parent,SWT.BORDER);
        text.setLayoutData( new GridData( SWT.FILL, SWT.DEFAULT, true, false ) );  
        
        // bind values
        dataBindContext.bindValue(WidgetProperties.text( SWT.Modify ).observeDelayed( 400, text ),
                                   EMFEditProperties.value( editingDomain,eAttribute ).observeDetail( master ) );
    }

    /**
     * Create a checkbox with a label
     * The information about the element is retrieved from the Ecore model
     */
    public void createCheckbox( Composite parent, EAttribute eAttribute, IObservableValue master ) {
        //create label
        Label label = new Label(parent,SWT.NONE);
        label.setText(Ui.getUiName( eAttribute ));
        label.setLayoutData( new GridData( SWT.LEFT, SWT.DEFAULT, true, false ) );
        
        // create checkbox
        Button checkbox = new Button(parent,SWT.CHECK);
        checkbox.setLayoutData( new GridData( SWT.LEFT, SWT.DEFAULT, true, false ) );  
        
        // bind values
        dataBindContext.bindValue( SWTObservables.observeSelection( checkbox ),
                                   EMFEditProperties.value( editingDomain,eAttribute ).observeDetail( master ) );
    }

    /**
     * Dispose the data binding context created during initialization 
     */
    public void dispose()
    {
        dataBindContext.dispose();
    }
    
    /**
     * Get UI name for an eclass
     * 
     * @param eClass to get the name for
     * @return
     */
    public static String getUiName(EClass eClass)
    {
        String name = ErfEditPlugin.INSTANCE.getString( "_UI_" + eClass.getName() + "_type" );
        return (name == null) ? eClass.getName() : name;
    }
    
    /**
     * Get UI name for an eAttribute
     * 
     * @param  eAttribute to get the name for
     * @return
     */
    public static String getUiName(EAttribute eAttribute)
    {
        String name = ErfEditPlugin.INSTANCE.getString( "_UI_" + eAttribute.getEContainingClass().getName()+"_"+eAttribute.getName() + "_feature" );
        return (name == null) ?  eAttribute.getName() : name;
    }
}
