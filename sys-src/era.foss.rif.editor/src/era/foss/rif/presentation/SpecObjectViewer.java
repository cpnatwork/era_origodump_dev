package era.foss.rif.presentation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import era.foss.rif.AttributeDefinition;
import era.foss.rif.SpecObject;
import era.foss.rif.AttributeDefinitionSimple;
import era.foss.rif.AttributeValue;
import era.foss.rif.AttributeValueSimple;
import era.foss.rif.DatatypeDefinition;
import era.foss.rif.RIF;
import era.foss.rif.SpecObject;
import era.foss.rif.SpecType;


public class SpecObjectViewer extends TableViewer {
    
    final static String SPEC_ATTRIBUTE_COLUMN_DATA="Spec Attribute"; 
    
    
   private RifEditor rifEditor = null;
   protected AdapterFactoryEditingDomain editingDomain = null;
   protected Resource rifResource = null;
   protected RIF rifModel = null;
   protected EraCommandStack eraCommandStack = null;
   protected AdapterFactory adapterFactory = null;
   
    
    public SpecObjectViewer( Composite parent,RifEditor rifEditor) {
        super( parent);
        this.rifEditor = rifEditor;
        this.editingDomain = (AdapterFactoryEditingDomain)rifEditor.getEditingDomain();
        this.adapterFactory = rifEditor.getAdapterFactory();
        this.rifResource = (XMIResource)editingDomain.getResourceSet()
        .getResource( EditUIUtil.getURI( rifEditor.getEditorInput() ), true );
        this.rifModel = (RIF)(rifResource).getContents().get( 0 );  
    }
   
    
    private void setupTableViewer(){

        Table table = this.getTable();
        TableLayout layout = new TableLayout();
        table.setLayout( layout );
        table.setHeaderVisible( true );
        table.setLinesVisible( true );
        
        // get attributes for the spec object
        
        //currently we only have one specType
        SpecType specType = rifModel.getCoreContent().getSpecTypes().get( 0 );
        EList<AttributeDefinition> specAttributeList = specType.getSpecAttributes();
        
        for (AttributeDefinition attribute : specAttributeList){
            TableColumn objectColumn = new TableColumn( table, SWT.NONE );
            layout.addColumnData( new ColumnWeightData( 1, 100, true ) );
            objectColumn.setText( attribute.getLongName());
            objectColumn.setData(SPEC_ATTRIBUTE_COLUMN_DATA, attribute );
            objectColumn.setResizable( true );
        }

        this.setContentProvider( new SpecObjectContentProvider( rifEditor.getAdapterFactory() ) );
        this.setLabelProvider( new SpecObjectLabelProvider() );
    }
    
    /**
     * Provide data for table containing spec objects
     */
    public class SpecObjectContentProvider extends AdapterFactoryContentProvider {
        public SpecObjectContentProvider( AdapterFactory adapterFactory ) {
            super( adapterFactory );
        }

        // get elements shown in the table viewer holding S
        public Object[] getElements( Object object ) {

            SpecObject[] objects;
            try {
                objects = (SpecObject[])rifModel.getCoreContent().getSpecObjects().toArray();
            } catch( NullPointerException e ) {
                objects = new SpecObject[0];
            }
            return objects;
        }
        
        // listen on changes of Spec Object
        // THIS IS FOR DEBUGGING ONLY as the this functionality is not
        // required later
        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );

            // handle changes of a data type definition
            if( (notification.getNotifier() instanceof SpecObject)
                || (notification.getNewValue() instanceof SpecObject)
                || (notification.getOldValue() instanceof SpecObject)
                || (notification.getNotifier() instanceof AttributeValue)
                || (notification.getNewValue() instanceof AttributeValue)
                || (notification.getOldValue() instanceof AttributeValue)    
            ) {
                SpecObjectViewer.this.refresh();
            }
        }
    }
    
    /**
     * Provide label for data of table containing SpecTypes
     */
    public class SpecObjectLabelProvider extends LabelProvider implements ITableLabelProvider {

        @Override
        public String getColumnText( Object element, int columnIndex ) {
            
            // current element is a spec object
            SpecObject specObject = (SpecObject)element;
            
            // get attribute definition displayed in this column
            AttributeDefinition attributeDefinition = (AttributeDefinition) SpecObjectViewer.this.getTable().getColumn( columnIndex ).getData( SPEC_ATTRIBUTE_COLUMN_DATA);
            String retVal = null;
            

            // check if the spec object provides a value for this column/attribute
            for (AttributeValue value : specObject.getValues())
            {
                if (value instanceof AttributeValueSimple){
                   if (attributeDefinition.equals(((AttributeValueSimple) value).getDefinition())){
                       retVal = ((AttributeValueSimple) value).getTheValue();
                   }
                }
            }
            
            // if return value is not set try to show default value if it is defined
            if (retVal == null){
                if (attributeDefinition instanceof AttributeDefinitionSimple){
                    AttributeValueSimple defaultValue = ((AttributeDefinitionSimple) attributeDefinition).getDefaultValue();
                    if (defaultValue != null){
                        retVal = defaultValue.getTheValue();
                    }
                 }
            }
                
            return retVal;
        }

        @Override
        public Image getColumnImage( Object element, int columnIndex ) {
            // no icons (yet)
            return null;
        }
    }
    
    
    // Helper for using the SpecObjectViewer from a viewer pane
    public void setup()
    {
        setupTableViewer();
    }
}
