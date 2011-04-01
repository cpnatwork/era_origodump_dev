package era.foss.typeeditor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

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

    // Composite holding the controls for the attributes
    protected Composite attributeComposite;

    /**
     * Ui Annotation detail holding if the model element is displayed in the Detail Viewer
     */
    private static final String UI_ANNONTATION_DETAIL = "Detail";

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
        GridLayout gridLayout = new GridLayout( 1, true );
        this.setLayout( gridLayout );

        // create label for detail viewer
        Label label = new Label( this, SWT.NONE );
        label.setLayoutData( new GridData( SWT.LEFT, SWT.TOP, true, false, 1, 1 ) );
        label.setText( Activator.INSTANCE.getString( "_UI_DetailViewer_title" ) + ":" );

        // Create composite holding the UI elements of the
        attributeComposite = new Composite( this, SWT.BORDER );
        attributeComposite.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        attributeComposite.setLayout( new GridLayout( 2, false ) );

        // create UI elements for attributes
        this.createDetails();

        master.addValueChangeListener( new IValueChangeListener() {

            @Override
            public void handleValueChange( ValueChangeEvent event ) {
                // Redraw if the class of the master object is different
                // then we have different information
                Object newValue = event.diff.getNewValue();
                Object oldValue = event.diff.getOldValue();

                if( newValue != null
                    && newValue instanceof EObject
                    && (oldValue == null || (oldValue instanceof EObject && ((EObject)newValue).eClass()
                                                                                               .getClassifierID() != ((EObject)oldValue).eClass()
                                                                                                                                        .getClassifierID())) ) {

                    DetailViewer.this.disposeDetails();

                    // create new ui elements
                    DetailViewer.this.createDetails();

                    // redraw this composite
                    attributeComposite.redraw();
                    attributeComposite.layout();
                }
                if( newValue == null ) {
                    DetailViewer.this.disposeDetails();
                }
            }
        } );
    }

    /**
     * create UI elements according to the attributes of the master element
     */
    protected void createDetails() {

        if( master.getValue() != null ) {
            ui = new Ui( editingDomain, null );
            assert (master.getValue() instanceof EObject);
            EObject eObject = (EObject)master.getValue();

            createControls( attributeComposite, eObject.eClass() );
        }
    }

    void createControls( Composite parent, EClass eClass ) {
        createControls( parent, eClass, null );
    }

    void createControls( Composite parent, EClass eClass, FeaturePath featurePath ) {

        // search containments which contribute to elements to the DetailViewer
        // and create a tab for each containment
        TabFolder tabFolder = null;
        Composite generalComposite = null;
        for( EReference eContainmentRef : eClass.getEAllContainments() ) {
            String showDetail = Ui.getUIAnnotationDetail( eContainmentRef, UI_ANNONTATION_DETAIL );
            if( showDetail != null && showDetail.equals( "true" ) ) {

                // create tab folder if not yet existing
                if( tabFolder == null ) {
                    tabFolder = new TabFolder( parent, SWT.NONE );
                    tabFolder.setLayout( new FillLayout() );
                    tabFolder.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true, 2, 1 ) );

                    // in case this eClass has attributes create a 'General' tab to put them on
                    // create tab item for containment
                    if( !eClass.getEAllAttributes().isEmpty() ) {
                        TabItem tabItem = new TabItem( tabFolder, SWT.FILL );
                        tabItem.setText( "General" );
                        generalComposite = new Composite( tabFolder, SWT.FILL );
                        generalComposite.setLayout( parent.getLayout() );
                        tabItem.setControl( generalComposite );

                    }
                }

                // create tab item for containment
                TabItem tabItem = new TabItem( tabFolder, SWT.NONE );
                tabItem.setText( Ui.getUiName( eContainmentRef ) );
                Composite childComposite = new Composite( tabFolder, SWT.FILL );
                childComposite.setLayout( parent.getLayout() );
                tabItem.setControl( childComposite );
                EClass childEClass = eContainmentRef.getEReferenceType();

                // extend feature path
                List<EStructuralFeature> featureList = new ArrayList<EStructuralFeature>();
                if( featurePath != null ) {
                    featureList.addAll( Arrays.asList( featurePath.getFeaturePath() ) );
                }
                featureList.add( eContainmentRef );
                FeaturePath containmentFeaturePath = FeaturePath.fromList( featureList.toArray( new EStructuralFeature[featureList.size()] ) );

                // handle content of containment
                this.createControls( childComposite, childEClass, containmentFeaturePath );
            }
        }

        if( generalComposite != null ) {
            parent = generalComposite;
        }

        // create UI elements for all attributes
        for( EAttribute eAttribute : eClass.getEAllAttributes() ) {
            String showDetail = Ui.getUIAnnotationDetail( eAttribute, UI_ANNONTATION_DETAIL );

            if( showDetail != null && showDetail.equals( "true" ) ) {

                // extend feature path
                List<EStructuralFeature> featureList = new ArrayList<EStructuralFeature>();
                if( featurePath != null ) {
                    featureList.addAll( Arrays.asList( featurePath.getFeaturePath() ) );
                }
                featureList.add( eAttribute );
                FeaturePath attributeFeaturePath = FeaturePath.fromList( featureList.toArray( new EStructuralFeature[featureList.size()] ) );

                // switch according to data to be displayed
                switch (eAttribute.getEType().getClassifierID()) {

                case EcorePackage.EBOOLEAN:
                    ui.createCheckbox( parent, attributeFeaturePath, master );
                    break;

                default:
                    ui.createText( parent, attributeFeaturePath, master );
                }

            }
        }
    }

    /**
     * dispose controls created for attributes
     */
    protected void disposeDetails() {
        if( ui != null ) {
            ui.dispose();
        }

        for( Control control : attributeComposite.getChildren() ) {
            control.dispose();
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
        this.disposeDetails();
        master.dispose();
    }

}
