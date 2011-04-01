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
package era.foss.typeeditor;


import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * Show attributes of ecore elements using EMF databinding.
 */
public class DetailViewer extends Composite {

    // The master element which attributes are shown
    /** The master. */
    private IObservableValue master;

    // the current editing domain
    /** The editing domain. */
    private EditingDomain editingDomain;

    // Ui provides methods for creating Ui elements
    /** The ui. */
    protected Ui ui;
    
    // Composite holding the controls for the attributes
    /** The attribute composite. */
    protected Composite attributeComposite;

    /**
     * Create Composite holding detailed information of a datatype definition.
     * 
     * @param parent the parent
     * @param style the style
     * @param editingDomain the editing domain
     * @param master the master
     */
    DetailViewer( Composite parent, int style, EditingDomain editingDomain, IObservableValue master ) {
        super( parent, style );
        this.editingDomain = editingDomain;
        this.master = master;
        

        // set-up layout
        GridLayout gridLayout = new GridLayout( 1, true );
        this.setLayout( gridLayout ); 
        
        
        // create label for detail viewer
        Label label= new Label (this,SWT.NONE);
        label.setLayoutData(new GridData(SWT.LEFT,SWT.TOP,true,false,1,1) );
        label.setText( Activator.INSTANCE.getString( "_UI_DetailViewer_title" )+":" );
        
        // Create composite holding the UI elements of the 
        attributeComposite = new Composite( this, SWT.BORDER );
        attributeComposite.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        attributeComposite.setLayout( new GridLayout(2,false) );
        
        // create UI elements for attributes
        this.createAttributeControls();

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

                    DetailViewer.this.disposeAttributeControls();
                   
                    // create new ui elements
                    DetailViewer.this.createAttributeControls();

                    // redraw this composite
                    attributeComposite.redraw();
                    attributeComposite.layout();
                }
                if (newValue == null)
                {
                    DetailViewer.this.disposeAttributeControls();
                }
            }
        } );
    }

    /**
     * create UI elements according to the attributes of the master element.
     */
    protected void createAttributeControls() {
        
        if( master.getValue() != null ) {
            ui = new Ui( editingDomain,null);
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
                            ui.createCheckbox( attributeComposite, eAttribute, master );
                            break;

                        default:
                            ui.createText( attributeComposite, eAttribute, master );
                        }
                    }

                }
            }
        }
    }
    
    /**
     * dispose controls created for attributes.
     */
    protected void disposeAttributeControls() {
        if( ui != null ) {
            ui.dispose();
        }
        
        for(Control control : attributeComposite.getChildren() ) {
            control.dispose();
        } 
    }

    /**
     * Dispose the ui instance and master observable.
     * 
     * @see org.eclipse.swt.widgets.Widget#dispose()
     * @see era.foss.typeeditor.Ui#dispose()
     */
    @Override
    public void dispose() {
        super.dispose();
        this.disposeAttributeControls();
        master.dispose();
    }

}
