package era.foss.typeeditor;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
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

        master.addValueChangeListener( new IValueChangeListener() {

            @Override
            public void handleValueChange( ValueChangeEvent event ) {
                // Redraw if the class of the master object is different
                // then we have different information
                Object newValue = event.diff.getNewValue();
                Object oldValue = event.diff.getOldValue();
                if( newValue != null
                    && newValue instanceof EObject
                    && ( oldValue == null 
                         || ( oldValue instanceof EObject 
                              && ((EObject)newValue).eClass().getClassifierID() != ((EObject)oldValue).eClass().getClassifierID())) ) {

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
     * Dispose the ui instance and master observable
     * 
     * @see org.eclipse.swt.widgets.Widget#dispose()
     * @see era.foss.typeeditor.Ui#dispose()
     */
    @Override
    public void dispose() {
        super.dispose();
        ui.dispose();
        master.dispose();
    }

}
