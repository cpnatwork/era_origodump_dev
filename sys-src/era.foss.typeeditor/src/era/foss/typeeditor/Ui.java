package era.foss.typeeditor;

import java.util.Arrays;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnWeightData;
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
import era.foss.erf.ErfPackage;
import era.foss.erf.provider.ErfEditPlugin;
import era.foss.ui.contrib.ComboBoxViewerCellEditorSp;

/**
 * This class provides methods for creating UI elements for Ecore models
 */
public class Ui {

    //The editing domain
    private EditingDomain editingDomain;
    
    // data binding context used for binding EMF elements to UI elements
    private DataBindingContext dataBindContext;
    
    // The model we are in...
    private ERF erfModel = null;
    
    /**
     * Create Ui
     * Please call the dispose method when an object of this type
     * is not required anymore 
     * 
     * @param editingDomain used for binding the UI elements to
     */
    public Ui(EditingDomain editingDomain,ERF erfModel)
    {
        this.editingDomain = editingDomain;
        this.erfModel = erfModel;
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
     * @param  eStructuralFeature to get the name for
     * @return
     */
    public static String getUiName(EStructuralFeature eStructuralFeature)
    {
        String name = ErfEditPlugin.INSTANCE.getString( "_UI_" + eStructuralFeature.getEContainingClass().getName()+"_"+eStructuralFeature.getName() + "_feature" );
        return (name == null) ?  eStructuralFeature.getName() : name;
    }

    /**
     * Create a column with EMF databinding for a table viewer
     * 
     * <li>In case the top level structural feature is a reference display a combo box</li>
     * <li>In case the top level structural feature is a containment reference create element if it does not exist</li>
     * <li>In case the structural feature is a boolean show a checkbox</li>
     * <li>Otherwise show a simple text field</li>
     * 
     * @param tableViewer
     * @param eStructuralFeatureList list to create a feature path from
     * @param minWidth
     * @param weigth
     * @param resizable
     */
    public void createColumn( TableViewer tableViewer,EStructuralFeature[] eStructuralFeatureList, int minWidth, int weigth, boolean resizable ) {
        
        
        TableColumnLayout columnLayout = (TableColumnLayout) tableViewer.getTable().getParent().getLayout();
        ObservableListContentProvider cp = (ObservableListContentProvider) tableViewer.getContentProvider();
        
        // get the top level structural feature
        EStructuralFeature topStructuralFeature = eStructuralFeatureList[0];

        // column settings
        TableViewerColumn column = new TableViewerColumn( tableViewer, SWT.NONE );
        column.getColumn().setText( Ui.getUiName( topStructuralFeature ) );
        column.getColumn().setResizable( resizable );
        column.getColumn().setMoveable( false );
        columnLayout.setColumnData( column.getColumn(), new ColumnWeightData(
            weigth,
            minWidth ) );
   
        
        
        // set label provider
        IValueProperty elementProperty = EMFEditProperties.value(editingDomain,  FeaturePath.fromList(eStructuralFeatureList));
        IObservableMap attributeMap = elementProperty.observeDetail( cp.getKnownElements() );
        column.setLabelProvider( new ObservableMapCellLabelProvider( attributeMap ) );
       
        
        
        EditingSupport editingSupport = null;
        
        // Reference 
        if( topStructuralFeature instanceof EReference && (!((EReference)topStructuralFeature).isContainment()) )
        {
          
            // Create combo box
            ComboBoxViewerCellEditor combo = new ComboBoxViewerCellEditorSp((Composite) tableViewer
                                         .getControl(), SWT.READ_ONLY);
            
            ObservableListContentProvider comboContentProvider = new ObservableListContentProvider();
            combo.setContenProvider(comboContentProvider);
            
            FeaturePath featurePath = FeaturePath.fromList(Arrays.copyOfRange(eStructuralFeatureList, 1, eStructuralFeatureList.length ));
            IObservableMap comboAttributeMap = EMFProperties.value(featurePath).observeDetail(comboContentProvider.getKnownElements());
            combo.setLabelProvider( new ObservableMapLabelProvider(comboAttributeMap));
            
            
            //String eStructuralFeatureString = eReference.getEAnnotation( "UI" ).getDetails().get( "ObservedStructuralFeature" );
            //ErfPackageImpl.eINSTANCE.getEClassifier( name );
            
            //TODO: Find generic solution for this
            IEMFListProperty dataTypeDefinitions = EMFProperties.list(ErfPackage.Literals.CONTENT__DATA_TYPES);
            combo.setInput(dataTypeDefinitions.observe(erfModel.getCoreContent()));
            
            
            //
            IValueProperty editorElementProperty = EMFEditProperties.value(editingDomain, topStructuralFeature);
            IValueProperty cellEditorProperty = ViewerProperties.singleSelection();
            
            editingSupport = ObservableValueEditingSupport.create( tableViewer,
                                                                   dataBindContext,
                                                                   combo,
                                                                   cellEditorProperty,
                                                                   editorElementProperty );

        } 
        else if( topStructuralFeature instanceof EReference && (!((EReference)topStructuralFeature).isContainment()) )
        {
          


        } 
        // Simple text
        else {
           IValueProperty cellEditorProperty = CellEditorProperties.control()
                                                                   .value( WidgetProperties.text( SWT.Modify ) );

            editingSupport = ObservableValueEditingSupport.create( tableViewer,
                                                                   dataBindContext,
                                                                   new TextCellEditor( tableViewer.getTable() ),
                                                                   cellEditorProperty,
                                                                   elementProperty );
        }
        
        column.setEditingSupport( editingSupport );
        
    }
    
    
    
}
