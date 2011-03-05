package era.foss.typeeditor;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * Show attributes of ecore elements using EMF databinding
 */
public class DetailViewer extends Composite {

    // The master element which attributes are shown
    private IObservableValue master;

    // the current editing domain
    private EditingDomain editingDomain;

    // Ui provides methods for creating Ui elements
    protected Ui ui;

    int masterClassId;

    /**
     * Create Composite holding detailed information of a datatype definition
     * 
     * @param parent
     * @param editingDomain
     * @param tableViewer
     * @param style
     */
    DetailViewer( Composite parent, int style, EditingDomain editingDomain, IObservableValue master ) {
        super( parent, style );
        this.editingDomain = editingDomain;
        this.master = master;

        // set-up layout
        GridLayout gridLayout = new GridLayout( 2, true );
        this.setLayout( gridLayout );

        // create UI elements
        this.createControls();

        masterClassId = -1;

        master.addChangeListener( new IChangeListener() {

            @Override
            public void handleChange( ChangeEvent event ) {
                // Redraw if the class of the master object is different 
                // then we have different information
                Object masterValue = DetailViewer.this.master.getValue();
                if( masterValue != null
                    && masterValue instanceof EObject
                    && ((EObject)masterValue).eClass().getClassifierID() != DetailViewer.this.masterClassId ) {

                    // set new Eclass of master object 
                    DetailViewer.this.masterClassId = ((EObject)masterValue).eClass().getClassifierID();
                    if( ui != null ) {
                        ui.dispose();
                    }
                    
                    // Dispose all old UI elements 
                    for( Control control : DetailViewer.this.getChildren() ) {
                        control.dispose();
                    }
                    // create new ui elements
                    DetailViewer.this.createControls();
                    
                    // redraw this composite
                    DetailViewer.this.redraw();
                    DetailViewer.this.layout();
                }
            }
        } );
    }

    
    /**
     * create UI elements according to the attributes of the master element
     */
    protected void createControls() {
        if( master.getValue() != null ) {
            ui = new Ui( editingDomain );
            assert (master.getValue() instanceof EObject);
            EObject eObject = (EObject)master.getValue();

            // create UI elements for all attributes
            for( EAttribute eAttribute : eObject.eClass().getEAllAttributes() ) {
                EAnnotation uiAnnotation = eAttribute.getEAnnotation( "UI" );
                if( uiAnnotation != null
                    && uiAnnotation.getDetails() != null
                    && uiAnnotation.getDetails().get( "Detail" ) != null
                    && uiAnnotation.getDetails().get( "Detail" ).equals( "true" ) ) {

                    {
                        switch (eAttribute.getEAttributeType().getClassifierID()) {

                        case EcorePackage.EBOOLEAN:
                            ui.createCheckbox( this, eAttribute, master );
                            break;

                        default:
                            ui.createText( this, eAttribute, master );
                        }
                    }

                }
            }
        }
    }
    

    /**
     * Dispose the ui instance
     * 
     * @see org.eclipse.swt.widgets.Widget#dispose()
     * @see era.foss.typeeditor.Ui#dispose()
     */
    @Override
    public void dispose() {
        ui.dispose();
        super.dispose();
    }

}
