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

import java.util.Arrays;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.CellEditorProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapCellLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableValueEditingSupport;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import era.foss.erf.ERF;
import era.foss.erf.provider.ErfEditPlugin;
import era.foss.ui.contrib.ComboBoxViewerCellEditorSp;

/**
 * This class provides methods for creating UI elements for Ecore models.
 */
public class Ui {

    // The editing domain
    /** The editing domain. */
    private EditingDomain editingDomain;

    // data binding context used for binding EMF elements to UI elements
    /** The data bind context. */
    private DataBindingContext dataBindContext;

    // The model we are in...
    /** The erf model. */
    private ERF erfModel = null;

    /**
     * Create Ui Please call the dispose method when an object of this type is not required anymore.
     * 
     * @param editingDomain used for binding the UI elements to
     * @param erfModel the erf model
     */
    public Ui( EditingDomain editingDomain, ERF erfModel ) {
        this.editingDomain = editingDomain;
        this.erfModel = erfModel;
        dataBindContext = new EMFDataBindingContext();
    }

    /**
     * Create a text field with a label The information about the element is retrieved from the Ecore model.
     * 
     * @param parent the parent
     * @param eAttribute the e attribute
     * @param master the master
     */
    public void createText( Composite parent, FeaturePath featurePath, IObservableValue master ) {
        //
        EStructuralFeature eStructuralFeature = featurePath.getFeaturePath()[featurePath.getFeaturePath().length - 1];

        // create label
        Label label = new Label( parent, SWT.NONE );
        label.setText( Ui.getUiName( eStructuralFeature ) );
        label.setLayoutData( new GridData( SWT.LEFT, SWT.DEFAULT, true, false ) );

        // create text field
        Text text = new Text( parent, SWT.BORDER );
        text.setLayoutData( new GridData( SWT.FILL, SWT.DEFAULT, true, false ) );

        // bind values
        dataBindContext.bindValue( WidgetProperties.text( SWT.Modify ).observeDelayed( 400, text ),
                                   EMFEditProperties.value( editingDomain, featurePath ).observeDetail( master ),
                                   new UnsettableEMFUpdateValueStrategy( eStructuralFeature ),
                                   new EMFUpdateValueStrategy() );
    }

    /**
     * Create a checkbox with a label The information about the element is retrieved from the Ecore model.
     * 
     * @param parent the parent
     * @param eAttribute the e attribute
     * @param master the master
     */
    public void createCheckbox( Composite parent, FeaturePath featurePath, IObservableValue master ) {
        // create label
        Label label = new Label( parent, SWT.NONE );
        label.setText( Ui.getUiName( featurePath.getFeaturePath()[featurePath.getFeaturePath().length - 1] ) );
        label.setLayoutData( new GridData( SWT.LEFT, SWT.DEFAULT, true, false ) );

        // create checkbox
        Button checkbox = new Button( parent, SWT.CHECK );
        checkbox.setLayoutData( new GridData( SWT.LEFT, SWT.DEFAULT, true, false ) );

        // bind values
        dataBindContext.bindValue( SWTObservables.observeSelection( checkbox ),
                                   EMFEditProperties.value( editingDomain, featurePath ).observeDetail( master ) );
    }

    /**
     * Dispose the data binding context created during initialization.
     */
    public void dispose() {
        dataBindContext.dispose();
    }

    /**
     * Get UI name for an eclass.
     * 
     * @param eClass to get the name for
     * @return the ui name
     */
    public static String getUiName( EClass eClass ) {
        String name = ErfEditPlugin.INSTANCE.getString( "_UI_" + eClass.getName() + "_type" );
        return (name == null) ? eClass.getName() : name;
    }

    /**
     * Get UI name for an eAttribute.
     * 
     * @param eStructuralFeature to get the name for
     * @return the ui name
     */
    public static String getUiName( EStructuralFeature eStructuralFeature ) {
        String name = ErfEditPlugin.INSTANCE.getString( "_UI_"
            + eStructuralFeature.getEContainingClass().getName()
            + "_"
            + eStructuralFeature.getName()
            + "_feature" );
        return (name == null) ? eStructuralFeature.getName() : name;
    }

    /**
     * Create a column with EMF databinding for a table viewer
     * 
     * <li>In case the top level structural feature is a reference display a combo box</li> <li>In case the top level
     * structural feature is a containment reference create element if it does not exist</li> <li>In case the structural
     * feature is a boolean show a checkbox</li> <li>Otherwise show a simple text field</li>.
     * 
     * @param tableViewer the table viewer
     * @param eStructuralFeatureList list to create a feature path from
     * @param minWidth the min width
     * @param weigth the weigth
     * @param resizable the resizable
     */
    public void bindColumn( TableViewerColumn column, EStructuralFeature[] eStructuralFeatureList ) {

        TableViewer tableViewer = (TableViewer)column.getViewer();
        ObservableListContentProvider cp = (ObservableListContentProvider)tableViewer.getContentProvider();

        // get the top level structural feature
        EStructuralFeature topStructuralFeature = eStructuralFeatureList[0];

        // set label provider
        IValueProperty elementProperty = EMFEditProperties.value( editingDomain,
                                                                  FeaturePath.fromList( eStructuralFeatureList ) );
        IObservableMap attributeMap = elementProperty.observeDetail( cp.getKnownElements() );
        column.setLabelProvider( new ObservableMapCellLabelProvider( attributeMap ) );

        EditingSupport editingSupport = null;

        // Reference
        if( topStructuralFeature instanceof EReference && (!((EReference)topStructuralFeature).isContainment()) ) {

            // get object and structural feature to observe to
            // get posssible targets for this reference
            String eStructuralFeatureStringList = ((EReference)topStructuralFeature).getEAnnotation( "UI" )
                                                                                    .getDetails()
                                                                                    .get( "ObservedStructuralFeature" );

            Object objectToObserve = erfModel;
            EStructuralFeature featureToObserve = null;
            for( String sfs : eStructuralFeatureStringList.split( ":" ) ) {
                if( objectToObserve instanceof EObject ) {
                    if( featureToObserve != null ) {
                        objectToObserve = ((EObject)objectToObserve).eGet( featureToObserve );
                    }
                    featureToObserve = ((EObject)objectToObserve).eClass().getEStructuralFeature( sfs );
                }
            }

            // ComboBox: Create combo box to select choices for the reference
            ComboBoxViewerCellEditor combo = new ComboBoxViewerCellEditorSp(
                (Composite)tableViewer.getControl(),
                SWT.READ_ONLY );
            // ComboBox: Set Content Provider
            ObservableListContentProvider comboContentProvider = new ObservableListContentProvider();
            combo.setContenProvider( comboContentProvider );
            // ComboBox: Set Label Provider
            // Show same information in Combo box as in label for the table cell
            FeaturePath featurePath = FeaturePath.fromList( Arrays.copyOfRange( eStructuralFeatureList,
                                                                                1,
                                                                                eStructuralFeatureList.length ) );
            IObservableMap comboAttributeMap = EMFProperties.value( featurePath )
                                                            .observeDetail( comboContentProvider.getKnownElements() );
            combo.setLabelProvider( new ObservableMapLabelProvider( comboAttributeMap ) );
            // Combo box: set input
            IEMFListProperty dataTypeDefinitions = EMFProperties.list( featureToObserve );
            combo.setInput( dataTypeDefinitions.observe( objectToObserve ) );

            // Set editing support of table cell
            IValueProperty editorElementProperty = EMFEditProperties.value( editingDomain, topStructuralFeature );
            IValueProperty cellEditorProperty = ViewerProperties.singleSelection();

            editingSupport = ObservableValueEditingSupport.create( tableViewer,
                                                                   dataBindContext,
                                                                   combo,
                                                                   cellEditorProperty,
                                                                   editorElementProperty );

        }
        // Containment Reference
        else if( topStructuralFeature instanceof EReference && (((EReference)topStructuralFeature).isContainment()) ) {
            IValueProperty cellEditorProperty = CellEditorProperties.control()
                                                                    .value( WidgetProperties.text( SWT.Modify ) );

            editingSupport = ObservableValueEditingSupport.create( tableViewer, dataBindContext, new TextCellEditor(
                tableViewer.getTable() ), cellEditorProperty, elementProperty );

        }
        // Simple text
        else {
            IValueProperty cellEditorProperty = CellEditorProperties.control()
                                                                    .value( WidgetProperties.text( SWT.Modify ) );

            editingSupport = ObservableValueEditingSupport.create( tableViewer, dataBindContext, new TextCellEditor(
                tableViewer.getTable() ), cellEditorProperty, elementProperty );
        }

        column.setEditingSupport( editingSupport );

    }

    static String getUIAnnotationDetail( EModelElement eModelElement, String detail ) {
        EAnnotation uiAnnotation = eModelElement.getEAnnotation( "UI" );
        if( (uiAnnotation != null) && (uiAnnotation.getDetails() != null) ) {
            return uiAnnotation.getDetails().get( detail );
        } else {
            return null;
        }
    }

    private class UnsettableEMFUpdateValueStrategy extends EMFUpdateValueStrategy {
        private EStructuralFeature eStructuralFeature;

        public UnsettableEMFUpdateValueStrategy( EStructuralFeature eStructuralFeature ) {
            super();
            this.eStructuralFeature = eStructuralFeature;
        }

        @Override
        public Object convert( Object value ) {
            if( ((String)value).isEmpty() && this.eStructuralFeature.isUnsettable() ) {
                return eStructuralFeature.getDefaultValue();
            }
            return super.convert( value );
        }
    }

}
