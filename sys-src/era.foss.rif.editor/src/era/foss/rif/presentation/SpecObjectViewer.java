package era.foss.rif.presentation;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TableViewerEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import era.foss.rif.AttributeDefinition;
import era.foss.rif.AttributeDefinitionSimple;
import era.foss.rif.AttributeValue;
import era.foss.rif.AttributeValueSimple;
import era.foss.rif.DatatypeDefinition;
import era.foss.rif.RIF;
import era.foss.rif.RifPackage;
import era.foss.rif.SpecObject;
import era.foss.rif.SpecType;
import era.foss.rif.impl.RifFactoryImpl;

public class SpecObjectViewer extends TableViewer {

    final static String SPEC_ATTRIBUTE_COLUMN_DATA = "Spec Attribute";

    private RifEditor rifEditor = null;
    protected AdapterFactoryEditingDomain editingDomain = null;
    protected Resource rifResource = null;
    protected RIF rifModel = null;
    protected EraCommandStack eraCommandStack = null;
    protected AdapterFactory adapterFactory = null;

    public SpecObjectViewer( Composite parent, RifEditor rifEditor ) {
        super( parent, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION );
        this.rifEditor = rifEditor;
        this.editingDomain = (AdapterFactoryEditingDomain)rifEditor.getEditingDomain();
        this.adapterFactory = rifEditor.getAdapterFactory();
        this.rifResource = (XMIResource)editingDomain.getResourceSet()
                                                     .getResource( EditUIUtil.getURI( rifEditor.getEditorInput() ),
                                                                   true );
        this.rifModel = (RIF)(rifResource).getContents().get( 0 );
    }

    private void setupTableViewer() {

        Table table = this.getTable();
        TableLayout layout = new TableLayout();
        table.setLayout( layout );
        table.setHeaderVisible( true );
        table.setLinesVisible( true );

        // prepare the activation strategy for setting the behavior when editing table cells
        ColumnViewerEditorActivationStrategy actStrategy = new ColumnViewerEditorActivationStrategy( this ) {
            protected boolean isEditorActivationEvent( ColumnViewerEditorActivationEvent event ) {
                return event.eventType == ColumnViewerEditorActivationEvent.TRAVERSAL
                    || event.eventType == ColumnViewerEditorActivationEvent.MOUSE_DOUBLE_CLICK_SELECTION
                    || event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC;
            }
        };

        // create table viewer editor (*?*)
        TableViewerEditor.create( this, actStrategy, ColumnViewerEditor.TABBING_HORIZONTAL
            | ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
            | ColumnViewerEditor.TABBING_VERTICAL
            | ColumnViewerEditor.KEYBOARD_ACTIVATION );

        // create columns
        create_columns();

        this.setContentProvider( new SpecObjectContentProvider( rifEditor.getAdapterFactory() ) );

        // FIXME: Is this really the right place to adapt ALL elements ???
        rifModel.getCoreContent().eAdapters().add( new ViewerRefreshEContentAdapter() );

        this.setInput( rifModel.getCoreContent().getSpecObjects() );
    }

    /**
     * Create columns for the spec Object viewer
     */
    private void create_columns() {
        
    	// in case we don't have a spec type don't create columns
    	if (rifModel.getCoreContent().getSpecTypes().isEmpty())
    	{
    		return;
    	}
    	
    	// get attributes for the spec object
        // Remark: currently we only have one specType
        SpecType specType = rifModel.getCoreContent().getSpecTypes().get( 0 );
        EList<AttributeDefinition> specAttributeList = specType.getSpecAttributes();

        for( AttributeDefinition attribute : specAttributeList ) {
            TableViewerColumn column = new TableViewerColumn( this, SWT.NONE );
            column.getColumn().setText( attribute.getLongName() );
            column.getColumn().setResizable( true );
            column.getColumn().setMoveable( true );
            column.getColumn().setWidth( 100 );
            column.getColumn().setData( SPEC_ATTRIBUTE_COLUMN_DATA, attribute );
            column.setEditingSupport( new SpecObjectEditingSupport( this, attribute ) );
            column.setLabelProvider( new SpecObjectLabelProvider( attribute ) );
        }

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
        
        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );

//            PopupFactory factory = PopupFactory.getSharedInstance();
//            JTextArea jtext = new JTextArea();
//            jtext.append( this.getClass().getCanonicalName()+ ": \n" );
//            jtext.append( notification.toString() );
//            Popup popup = factory.getPopup(null, jtext , 0, 0);
//            popup.show();
//            popup.hide();
            
            System.out.println("== " + this.getClass().getCanonicalName());
            System.out.println(notification.toString() );
//            
//            handleInstanceLevel( notification );
//            handleTypeLevel( notification );
        }

    }

    /**
     * An Adapter that triggers viewer refreshs.
     * <p>
     * It is derived from EContentAdapter that auto-adapts all new objects
     * 
     * @author cpn
     */
    public class ViewerRefreshEContentAdapter extends EContentAdapter {

        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );

            // We need the ViewerRefreshEContentAdapter (VRCA) because 
            // the SpecObjectContentProvider (SOCP) will only be notified based on
            // ViewerNotifications. These are wrappers around the original Notification.
            // Yet, more important, they will only be fired if the EObject has already
            // been selected in the Viewer once (the ItemProvider will only then be 
            // adapted to the EObject. 
            
            System.out.println("== " + this.getClass().getCanonicalName());
            System.out.println(notification.toString() );
            
            handleInstanceLevel( notification );
            handleTypeLevel( notification );
        }

        
        /**
         * Handle CUD (Create, Update, Delete) of model type level, like DatatypeDefinition or AttributeDefinition.
         * 
         * @param notification
         */
        private void handleTypeLevel( Notification notification ) {
            // FIXME: Should this really be done here? ... ideally this should be done once after the Type Dialog has
            // been closed BUT ONLY in case there are changes. We probably need to introduce a new interface for the
            // editor here
            if( (notification.getNotifier() instanceof DatatypeDefinition)
                || (notification.getNewValue() instanceof DatatypeDefinition)
                || (notification.getOldValue() instanceof DatatypeDefinition)
                || (notification.getNotifier() instanceof AttributeDefinition)
                || (notification.getNewValue() instanceof AttributeDefinition)
                || (notification.getOldValue() instanceof AttributeDefinition) ) {
                // any type change disposes the viewer and creates it anew
                for( TableColumn column : SpecObjectViewer.this.getTable().getColumns() ) {
                    column.dispose();
                }
                SpecObjectViewer.this.create_columns();
            }
        }

        /**
         * Handle CUD (Create, Update, Delete) of model instance level, like a SpecObject or an AttributeValue.
         * 
         * @param notification
         */
        private void handleInstanceLevel( Notification notification ) {
            if( (notification.getNotifier() instanceof SpecObject)
                || (notification.getNewValue() instanceof SpecObject)
                || (notification.getOldValue() instanceof SpecObject)
                || (notification.getNotifier() instanceof AttributeValue)
                || (notification.getNewValue() instanceof AttributeValue)
                || (notification.getOldValue() instanceof AttributeValue) ) {
                // FIXME: Be more clever and don't refresh the whole viewer
                // if only a single element is changed
                SpecObjectViewer.this.refresh();
            }
        }

    }

    /**
     * Provide label for data of table containing SpecTypes
     */
    public class SpecObjectLabelProvider extends ColumnLabelProvider {

        /**
         * The attribute defintion for this label provider * Required for getting the defatult value in case no value is
         * defined
         */
        private AttributeDefinition attributeDefinition;

        public SpecObjectLabelProvider( AttributeDefinition attributeDefinition ) {
            this.attributeDefinition = attributeDefinition;
        }

        @Override
        public String getText( Object element ) {

            // current element is a spec object
            SpecObject specObject = (SpecObject)element;

            return SpecObjectViewer.this.getSpecObjectAttributeValue( specObject, attributeDefinition );
        }

        /**
         * get the attribute definition for this column
         * 
         * @return
         */
        public AttributeDefinition getAttributeDefinition() {
            return attributeDefinition;
        }

    }

    /**
     * Editing support for Table holding the attribute definitions
     * 
     * @param viewer
     * @param column
     */
    public class SpecObjectEditingSupport extends EditingSupport {
        private CellEditor cellEditor;
        private BasicCommandStack basicCommandStack;

        /** Attribute defintion shown in this column */
        AttributeDefinition attributeDefinition;

        public SpecObjectEditingSupport( ColumnViewer viewer, AttributeDefinition attributeDefinition ) {
            super( viewer );
            this.attributeDefinition = attributeDefinition;
            basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();

            // create cell editor according to AttributeDefinition types
            if( attributeDefinition instanceof AttributeDefinitionSimple ) {
                this.cellEditor = new TextCellEditor( ((TableViewer)viewer).getTable() );
            }
        }

        @Override
        protected boolean canEdit( Object element ) {
            return true;
        }

        @Override
        protected CellEditor getCellEditor( Object element ) {
            return this.cellEditor;
        }

        @Override
        protected Object getValue( Object element ) {
            SpecObject specObject = (SpecObject)element;
            return SpecObjectViewer.this.getSpecObjectAttributeValue( specObject, attributeDefinition );
        }

        @Override
        protected void setValue( Object element, Object value ) {
            SpecObject specObject = (SpecObject)element;

            if( attributeDefinition instanceof AttributeDefinitionSimple ) {
                setValueAttributeDefintionSimple( specObject, value );
            }

        }

        private void setValueAttributeDefintionSimple( SpecObject specObject, Object editorValue ) {

            AttributeDefinitionSimple attributeDefinition = (AttributeDefinitionSimple)this.attributeDefinition;
            AttributeValueSimple attributeValue = null;

            // check if the spec object provides a value for this column/attribute
            for( AttributeValue attributeValueIter : specObject.getValues() ) {
                if( attributeValueIter instanceof AttributeValueSimple ) {
                    if( attributeDefinition.equals( ((AttributeValueSimple)attributeValueIter).getDefinition() ) ) {
                        attributeValue = (AttributeValueSimple)attributeValueIter;
                    }
                }
            }

            // SpecObject has no Attribute Value for this Attribute Definition
            if( attributeValue == null ) {
                if( editorValue == attributeDefinition.getDefaultValue()
                    && editorValue == attributeDefinition.getDefaultValue().getTheValue() ) {
                    // don't update the model
                    // if the value is identical to the default value of the attribute definition
                    return;
                } else {
                    // create an Attribute Value
                    attributeValue = RifFactoryImpl.eINSTANCE.createAttributeValueSimple();

                    // set reference to the respecitive Attrubute Definition
                    attributeValue.setDefinition( attributeDefinition );

                    // set value to default in case the attribute definition provides a
                    // default value
                    if( attributeDefinition.getDefaultValue() != null ) {
                        attributeValue.setTheValue( attributeDefinition.getDefaultValue().getTheValue() );
                    }
                    // create new Attribute value in the model
                    Command cmd = AddCommand.create( editingDomain,
                                                     specObject,
                                                     RifPackage.SPEC_OBJECT__VALUES,
                                                     attributeValue );

                    basicCommandStack.execute( cmd );
                    SpecObjectViewer.this.update( specObject, null );
                }
            }

            // // don't update the model
            // // if the value is identical to current value of the spec object
            if( editorValue == attributeValue.getTheValue() ) {
                return;
            } else {
                // The value in the editor and the model differ: set value in the model

                // The set command does not work when the object is created via the
                // create() method. Reason: Due to a bug the 'feature Id' is not passed
                // to the command. Therefore the execution fails.
                Command cmd = new SetCommand(
                    editingDomain,
                    attributeValue,
                    attributeValue.eClass().getEStructuralFeature( RifPackage.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE ),
                    editorValue );

                basicCommandStack.execute( cmd );
                SpecObjectViewer.this.update( specObject, null );
            }
        }
    }

    // Helper for using the SpecObjectViewer from a viewer pane
    // FIXME: Create our own editor (and then remove this) 
    public void setup() {
        setupTableViewer();
    }

    /**
     * get the value show in a column of a spec object according to the attribute Definition
     * 
     * @param specObject of which the attribute value is taken
     * @param attributeDefinition of which the value is taken
     * @return
     */
    public String getSpecObjectAttributeValue( SpecObject specObject, AttributeDefinition attributeDefinition ) {

        // the value
        // return an empty string in case we find no value nor default value
        String valueString = "";

        // check if the spec object provides a value for this column/attribute
        for( AttributeValue value : specObject.getValues() ) {
            if( value instanceof AttributeValueSimple ) {
                if( attributeDefinition.equals( ((AttributeValueSimple)value).getDefinition() ) ) {
                    valueString = ((AttributeValueSimple)value).getTheValue();
                }
            }
        }

        // if return value is not set try to show default value if it is defined
        if( valueString == "" ) {
            if( attributeDefinition instanceof AttributeDefinitionSimple ) {
                AttributeValueSimple defaultValue = ((AttributeDefinitionSimple)attributeDefinition).getDefaultValue();
                if( defaultValue != null ) {
                    valueString = defaultValue.getTheValue();
                }
            }
        }

        return valueString;
    }

}
