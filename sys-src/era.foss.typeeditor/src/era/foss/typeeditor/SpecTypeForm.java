/*
 * NAME: era.foss.typeeditor.SpecTypeForm
 */

package era.foss.typeeditor;

import java.util.LinkedList;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;

import era.foss.rif.AttributeDefinition;
import era.foss.rif.AttributeDefinitionSimple;
import era.foss.rif.AttributeValue;
import era.foss.rif.AttributeValueSimple;
import era.foss.rif.DatatypeDefinition;
import era.foss.rif.RifPackage;
import era.foss.rif.SpecObject;
import era.foss.rif.SpecType;
import era.foss.rif.impl.RifFactoryImpl;

/**
 * A form for editing the {@link SpecType}.
 * <p>
 * At the moment there exists exactly one {@link SpecType} in an ERA RIF model. The form holds a reference to this
 * single {@link SpecType}.
 * <p>
 * Each {@link SpecType} essentially consists of list of {@link AttributeDefinition}s which have a
 * {@link DatatypeDefinition} as well as an optional defaultValue in form of an {@link AttributeValueSimple}.
 * <p>
 * From the perspective of presentation & editing, the three classes are visually merged into a three-column table.
 * <p>
 * The inner class {@link .AttributesAdapterFactoryContentProvider} is registered to the {@link AddDeleteTableViewer}
 * and extracts all {@link AttributeDefinition}s for a {@link SpecType} from the RIF model -- by the {@link SpecType}'s
 * reference named "specAttributes".
 * <p>
 * The inner class {@link .AttributesLabelProvider} is registered to the {@link AddDeleteTableViewer} and provides the
 * cell values from the {@link AttributeDefinition} element.
 * 
 * @author cpn
 * 
 * @see SpecType
 * @see AttributeDefinition
 * @see AttributeValueSimple
 */
public class SpecTypeForm extends AbstractErfTypesForm {

    // for now the one and only spec type
    private SpecType theOneAndOnlySpecType;

    /**
     * Table viewer holding the attributes of a spec type
     */
    private AddDeleteTableViewer tableViewer;

    public SpecTypeForm( Composite parent, IEditorPart editor ) {
        super( parent, editor, SWT.NONE );

        // check for and eventually initialize the sole SpecType
        if( rifModel.getCoreContent().getSpecTypes().size() == 0 ) {
            Command addCommand = AddCommand.create( editingDomain,
                                                    rifModel.getCoreContent(),
                                                    null,
                                                    RifFactoryImpl.eINSTANCE.createSpecType() );
            eraCommandStack.execute( addCommand );
        }
        theOneAndOnlySpecType = (SpecType)rifModel.getCoreContent().getSpecTypes().get( 0 );

        // set-up layout
        GridLayout gridLayout = new GridLayout( 1, true );
        this.setLayout( gridLayout );

        // set up table viewer for attribute definitions
        createTableViewer();

        // Context menu for creating Elements of default values
        createContextMenu();
    }

    /**
     * Provide data for table which contains {@link AttributeDefinition} elements of the {@link SpecType}.
     */
    public class AttributeDefinitionContentProvider extends AdapterFactoryContentProvider {
        public AttributeDefinitionContentProvider( AdapterFactory adapterFactory ) {
            super( adapterFactory );
        }

        // get elements shown in the table viewer holding Attribute defintions
        public Object[] getElements( Object object ) {

            AttributeDefinition[] objects;
            try {
                objects = (AttributeDefinition[])theOneAndOnlySpecType.getSpecAttributes().toArray();
            } catch( NullPointerException e ) {
                objects = new AttributeDefinition[0];
            }
            return objects;
        }

        private DatatypeDefinition rememberedDatatypeDefinitionInCaseOfReplace = null;

        // handle changes relevant to the table (not the combo box)
        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );

            // SYNCHRONIZE/LISTEN TO CHANGE FROM THE DatytypeDefinitionForm !!

            // CASE: a changed DatatypeDefinition (caused in DatatypeDefinitionForm)
            if( (notification.getNotifier() instanceof DatatypeDefinition)
                && (notification.getEventType() == Notification.SET) ) {
                // refresh the tableViewer (e.g. the name of the datatypye definition has changed => all rows must
                // update)
                super.viewer.refresh();

                // any SET indicates that this has nothing to do with _replace_
                if( rememberedDatatypeDefinitionInCaseOfReplace != null ) rememberedDatatypeDefinitionInCaseOfReplace = null;
            }

            // CASE: a plain new available DatatypeDefinition
            // CASE: a type-changed DatatypeDefinition (because ReplaceCommand also triggers ADD as its 2nd step)
            if( (notification.getNewValue() instanceof DatatypeDefinition)
                && (notification.getEventType() == Notification.ADD) ) {

                if( rememberedDatatypeDefinitionInCaseOfReplace != null ) {
                    DatatypeDefinition addedDatatypeDefinition = (DatatypeDefinition)notification.getNewValue();

                    // check if the LongName matches the remembered one (the _replace_ is atmomic in its REMOVE/ADD and
                    // the LongName will not change in between
                    if( rememberedDatatypeDefinitionInCaseOfReplace.getLongName()
                                                                   .equals( addedDatatypeDefinition.getLongName() ) ) {
                        // assume the add as the second phase in a _replace_
                        DatatypeDefinition removedDatatypeDefinition = rememberedDatatypeDefinitionInCaseOfReplace;
                        for( AttributeDefinition attributeDefinition : theOneAndOnlySpecType.getSpecAttributes() ) {
                            if( !(attributeDefinition.getType() == removedDatatypeDefinition) ) continue;
                            // this AttributeDefinition is affected by the _replace_
                            Command cmd = new SetCommand(
                                editingDomain,
                                attributeDefinition,
                                attributeDefinition.eClass()
                                                   .getEStructuralFeature( RifPackage.ATTRIBUTE_DEFINITION__TYPE ),
                                addedDatatypeDefinition );
                            eraCommandStack.execute( cmd );
                        }
                        // conclude the _replace_
                        rememberedDatatypeDefinitionInCaseOfReplace = null;
                    } else {
                        // FIXME: all this is very shitty! (the ReplaceCommand should have its own notification type)
                        // a REMOVE had been indicated, but we waited for an ADD ...
                        // so now we have to redo the REMOVE: delete references
                    }

                    // any other ADD indicates that this has nothing to do with _replace_
                    rememberedDatatypeDefinitionInCaseOfReplace = null;
                }
                // refresh the table
                super.viewer.refresh();
            }

            // CASE: a deleted DatatypeDefinition
            // CASE: a type-changed DatatypeDefinition (because ReplaceCommand also triggers REMOVE as its 1st step)
            if( (notification.getOldValue() instanceof DatatypeDefinition)
                && (notification.getEventType() == Notification.REMOVE) ) {

                DatatypeDefinition removedDatatypeDefinition = (DatatypeDefinition)notification.getOldValue();

                // remember! probably this is a _replace_
                this.rememberedDatatypeDefinitionInCaseOfReplace = removedDatatypeDefinition;

                // search for affected AttributeDefinitions
                for( AttributeDefinition attributeDefinition : theOneAndOnlySpecType.getSpecAttributes() ) {
                    if( (attributeDefinition.getType() != removedDatatypeDefinition) ) continue;

                    // this AttributeDefinition is Affected by the removal of its type (DatatypeDefinition)
                    // => erase all AttributeValues from all SpecObjects of this affected AttributeDefinition
                    LinkedList<AttributeValue> attributeValuesToRemove = new LinkedList<AttributeValue>();
                    // look at every SpecObject
                    for( SpecObject specObject : rifModel.getCoreContent().getSpecObjects() ) {
                        // look at every AttributeValue
                        for( AttributeValue attributeValue : specObject.getValues() ) {
                            assert (attributeValue instanceof AttributeValueSimple);
                            // search for an affected AttributeValue
                            if( ((AttributeValueSimple)attributeValue).getDefinition().getID() != attributeDefinition.getID() ) continue;
                            // this AttributeValue is of the type of the affected AttributeDefinition: remember it for
                            // deletion
                            attributeValuesToRemove.add( attributeValue );
                        }
                    }
                    // now remove all these selected AttributeValues
                    if( !attributeValuesToRemove.isEmpty() ) {
                        Command removeCommand = RemoveCommand.create( editingDomain, attributeValuesToRemove );
                        editingDomain.getCommandStack().execute( removeCommand );
                    }

                    // FIXME: under normal circumstances we would now set the AttributeDefition's type to null, BUT ...
                    // see the "all this is very shitty" comment!?!!?!
                }

                // refresh the table (probably this is not necessary)
                super.viewer.refresh();
            }

            // SYNCHRONIZE/LISTEN TO CHANGE FROM THE SpecTypeForm ITSELF !!
            // FIXME: probably all the SpecObjects clean-up cases should be factored out
            // into a separate EContentProvider!?

            // CASE: a removed AttributeDefinition (from this.theOneAndOnlySpecType) (caused in this form)
            // clean-up the spec objects (as the instances of the spec type) => remove according AttributeValues
            if( (notification.getOldValue() instanceof AttributeDefinition)
                && (notification.getEventType() == Notification.REMOVE) ) {

                // this AttributeDefinition has just now been removed from theOneAndOnlySpecType
                AttributeDefinition removedAttributeDefinition = (AttributeDefinition)notification.getOldValue();

                LinkedList<AttributeValue> attributeValuesToRemove = new LinkedList<AttributeValue>();
                // look at every SpecObject
                for( SpecObject specObject : rifModel.getCoreContent().getSpecObjects() ) {
                    // look at every AttributeValue
                    for( AttributeValue attributeValue : specObject.getValues() ) {
                        assert (attributeValue instanceof AttributeValueSimple);
                        // search for an affected AttributeValue
                        if( ((AttributeValueSimple)attributeValue).getDefinition().getID() != removedAttributeDefinition.getID() ) continue;
                        // this AttributeValue is of the type of the removed AttributeDefinition: remember it for
                        // deletion
                        attributeValuesToRemove.add( attributeValue );
                    }
                }
                // now remove all these selected AttributeValues
                if( !attributeValuesToRemove.isEmpty() ) {
                    Command removeCommand = RemoveCommand.create( editingDomain, attributeValuesToRemove );
                    editingDomain.getCommandStack().execute( removeCommand );
                }
            }

            // CASE: the type (= DatatypeDefinition) of an AttributeDefinition has changed
            // clean-up the spec objects (as the instances of the spec type) => remove according AttributeValues
            if( (notification.getNewValue() instanceof AttributeDefinition)
                && (notification.getEventType() == Notification.SET) ) {

                // this AttributeDefinition has just now been removed from theOneAndOnlySpecType
                AttributeDefinition setAttributeDefinition = (AttributeDefinition)notification.getNewValue();

                LinkedList<AttributeValue> attributeValuesToRemove = new LinkedList<AttributeValue>();
                // look at every SpecObject
                for( SpecObject specObject : rifModel.getCoreContent().getSpecObjects() ) {
                    // look at every AttributeValue
                    for( AttributeValue attributeValue : specObject.getValues() ) {
                        assert (attributeValue instanceof AttributeValueSimple);
                        // search for an affected AttributeValue
                        if( ((AttributeValueSimple)attributeValue).getDefinition().getID() != setAttributeDefinition.getID() ) continue;
                        // this AttributeValue is of the type of the removed AttributeDefinition: remember it for
                        // deletion
                        attributeValuesToRemove.add( attributeValue );
                    }
                }
                // now remove all these selected AttributeValues
                if( !attributeValuesToRemove.isEmpty() ) {
                    Command removeCommand = RemoveCommand.create( editingDomain, attributeValuesToRemove );
                    editingDomain.getCommandStack().execute( removeCommand );
                }
            }

            // CASE: the removed AttributeDefinition is the _last_ one
            /*
             * purge all SpecObjects, because if then again new AttributeDefinitions are created, there still exists the
             * pointless old list of empty SpecObjects with generated internal IDs
             */
            if( (notification.getOldValue() instanceof AttributeDefinition)
                && (notification.getEventType() == Notification.REMOVE)
                && rifModel.getCoreContent().getSpecTypes().get( 0 ).getSpecAttributes().isEmpty() ) {
                // remove all SpecObjects
                Command removeCommand = RemoveCommand.create( editingDomain, rifModel.getCoreContent()
                                                                                     .getSpecObjects() );
                editingDomain.getCommandStack().execute( removeCommand );
            }

            // CURRENTLY NO OTHER CASE
        }
    }

    /**
     * Provide label for data of table containing SpecTypes
     */
    public class AttributeDefinitionLabelProvider extends LabelProvider implements ITableLabelProvider {

        @Override
        public String getColumnText( Object element, int columnIndex ) {
            AttributeDefinition attribute = (AttributeDefinition)element;
            String retVal = "";
            switch (columnIndex) {
            case 0:
                retVal = attribute.getLongName();
                break;
            case 1:
                DatatypeDefinition type = attribute.getType();
                // special action for "fresh & uninitialized": show nothing
                if( type == null ) break;
                // main action: show long name
                retVal = type.getLongName();
                break;
            case 2:
                retVal = "n/a";
                assert (attribute instanceof AttributeDefinitionSimple);
                AttributeValueSimple defaultValue = ((AttributeDefinitionSimple)attribute).getDefaultValue();
                // special action for "undeclared": show nothing
                if( defaultValue == null ) break;
                // main action: show default value
                retVal = defaultValue.getTheValue();
                break;

            default:
                throw new RuntimeException( "Should not happen" );
            }
            return retVal;
        }

        @Override
        public Image getColumnImage( Object element, int columnIndex ) {
            // no icons (yet)
            return null;
        }
    }

    /**
     * Content provider for the combo box
     */
    public class DatatypesComboContentProvider extends AdapterFactoryContentProvider {

        public DatatypesComboContentProvider( AdapterFactory adapterFactory, Viewer viewer ) {
            super( adapterFactory );
            this.viewer = viewer;
        }

        // get elements which are show in the combobox
        public Object[] getElements( Object object ) {

            DatatypeDefinition[] dataTypes;
            try {
                dataTypes = (DatatypeDefinition[])rifModel.getCoreContent().getDataTypes().toArray();
            } catch( NullPointerException e ) {
                dataTypes = new DatatypeDefinition[0];
            }
            return dataTypes;
        }

        // handle changes relevant to the combo box (not the table)
        @Override
        public void notifyChanged( Notification notification ) {
            super.notifyChanged( notification );

            // SYNCHRONIZE/LISTEN TO CHANGE FROM THE DatytypeDefinitionForm !!

            // CASE: a changed DatatypeDefinition (caused in DatatypeDefinitionForm)
            if( (notification.getNotifier() instanceof DatatypeDefinition)
                && (notification.getEventType() == Notification.SET) ) {
                // refresh this combo box [there is only one instance of the Combo Box (and this, its Content Provider)
                // namely for the column]
                super.viewer.refresh();
            }

            // CASE: a plain new available DatatypeDefinition
            // CASE: a type-changed DatatypeDefinition (because ReplaceCommand also triggers ADD)
            if( (notification.getNewValue() instanceof DatatypeDefinition)
                && (notification.getEventType() == Notification.ADD) ) {
                // refresh the table (probably this is not necessary)
                super.viewer.refresh();
            }

            // CASE: a deleted DatatypeDefinition
            // CASE: a type-changed DatatypeDefinition (because ReplaceCommand also triggers REMOVE)
            if( (notification.getOldValue() instanceof DatatypeDefinition)
                && (notification.getEventType() == Notification.REMOVE) ) {
                // refresh the table (probably this is not necessary)
                super.viewer.refresh();
            }

        }

    }

    /**
     * Label provider for the Combo box
     */
    public class DatatypesComboLabelProvider extends LabelProvider implements IBaseLabelProvider {

        @Override
        public String getText( Object element ) {
            return ((DatatypeDefinition)element).getLongName();
        }
    }

    /**
     * Editing support for Table holding the attribute definitions
     * 
     * @param viewer
     * @param column
     */
    public class AttributeDefinitionEditingSupport extends EditingSupport {
        private CellEditor cellEditor;
        private int column;

        public AttributeDefinitionEditingSupport( ColumnViewer viewer, int column ) {
            super( viewer );
            this.column = column;

            // Create the correct editor based on the column index
            switch (column) {
            case 0:
                this.cellEditor = new TextCellEditor( ((TableViewer)viewer).getTable() );
                break;
            case 1:
                ComboBoxViewerCellEditor comboCellEditor = new ComboBoxViewerCellEditor(
                    ((TableViewer)viewer).getTable(), SWT.READ_ONLY );
                comboCellEditor.setContenProvider( new DatatypesComboContentProvider(
                    adapterFactory,
                    comboCellEditor.getViewer() ) );

                comboCellEditor.setLabelProvider( new DatatypesComboLabelProvider() );
                comboCellEditor.setInput( editingDomain.getResourceSet() );
                this.cellEditor = comboCellEditor;
                break;
            case 2:
                this.cellEditor = new TextCellEditor( ((TableViewer)viewer).getTable() );
                break;
            default:
                this.cellEditor = null;
            }
        }

        @Override
        protected boolean canEdit( Object element ) {
            boolean retVal = true;

            AttributeDefinition attribute = (AttributeDefinition)element;

            if( (this.column == 2)
                && ((!(attribute instanceof AttributeDefinitionSimple)) || ((AttributeDefinitionSimple)attribute).getDefaultValue() == null) ) {
                retVal = false;
            }
            return retVal;
        }

        @Override
        protected CellEditor getCellEditor( Object element ) {
            return this.cellEditor;
        }

        @Override
        protected Object getValue( Object element ) {
            AttributeDefinition attribute = (AttributeDefinition)element;
            Object retVal = null;

            switch (this.column) {
            case 0:
                retVal = attribute.getLongName();
                break;
            case 1:
                retVal = attribute.getType();
                break;
            case 2:
                retVal = ((AttributeDefinitionSimple)attribute).getDefaultValue().getTheValue();
                break;
            default:
                break;
            }
            return retVal;
        }

        @Override
        protected void setValue( Object element, Object value ) {
            AttributeDefinition attribute = (AttributeDefinition)element;

            Command cmd = null;
            switch (this.column) {
            case 0:
                // only update data model in case the value has changed
                if( attribute.getLongName().equals( value ) ) break;
                // set longname to new value (using a command)
                cmd = new SetCommand(
                    editingDomain,
                    attribute,
                    attribute.eClass().getEStructuralFeature( RifPackage.ATTRIBUTE_DEFINITION__LONG_NAME ),
                    (String)value );
                eraCommandStack.execute( cmd );
                super.getViewer().update( attribute, null );
                break;
            case 1:
                assert (value != null);
                // set reference to datatype definition (using a command)
                cmd = new SetCommand(
                    editingDomain,
                    attribute,
                    attribute.eClass().getEStructuralFeature( RifPackage.ATTRIBUTE_DEFINITION__TYPE ),
                    (DatatypeDefinition)value );
                eraCommandStack.execute( cmd );
                super.getViewer().refresh();
                break;
            case 2:
                // only update data model in case the value has changed
                AttributeValueSimple defaultValue = ((AttributeDefinitionSimple)attribute).getDefaultValue();
                if( defaultValue.getTheValue().equals( value ) ) break;
                // set TheValue of the attribute's DefaultValue to the new value (using a command)
                cmd = new SetCommand(
                    editingDomain,
                    defaultValue,
                    defaultValue.eClass().getEStructuralFeature( RifPackage.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE ),
                    (String)value );
                eraCommandStack.execute( cmd );
                super.getViewer().update( element, null );
                break;
            default:
                break;
            }
        }
    }

    /**
     * Create Table viewer showing attributes
     */
    private void createTableViewer() {

        tableViewer = new AddDeleteTableViewer( this, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION );
        tableViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

        tableViewer.setEditingDomain( editingDomain );
        tableViewer.setAddCommandParameter( theOneAndOnlySpecType,
                                            RifFactoryImpl.eINSTANCE.createAttributeDefinitionSimple().eClass() );
        TableColumnLayout columnLayout = tableViewer.getTableColumnLayout();
        String[] colTitles = {
            typeEditorActivator.getString( "_UI_AttributeDefinitionName_label" ),
            typeEditorActivator.getString( "_UI_AttributeDefinitionType_label" ),
            typeEditorActivator.getString( "_UI_AttributeDefinitionDefaultValue_label" )};
        int[] colMinWidth = {100, 100, 100};
        int[] colWeigth = {34, 33, 33};
        boolean[] colResize = {true, true, false};
        for( int colNr = 0; colNr < colTitles.length; colNr++ ) {

            TableViewerColumn column = new TableViewerColumn( tableViewer, SWT.NONE );
            column.getColumn().setText( colTitles[colNr] );
            column.getColumn().setResizable( colResize[colNr] );
            column.getColumn().setMoveable( false );

            columnLayout.setColumnData( column.getColumn(), new ColumnWeightData(
                colWeigth[colNr],
                colMinWidth[colNr] ) );

            column.setEditingSupport( new AttributeDefinitionEditingSupport( tableViewer, colNr ) );
        }

        tableViewer.setContentProvider( new AttributeDefinitionContentProvider( adapterFactory ) );
        tableViewer.setLabelProvider( new AttributeDefinitionLabelProvider() );

        tableViewer.setInput( editingDomain.getResourceSet() );

    }

    /**
     * create context menu for -Adding and removing Dafatult values
     */
    private void createContextMenu() {

        // FIXME: provide double click as legitimate insert trigger for adding default values
        // (requires knowledge about which column is affected by click)

        final class DefaultValueAction extends Action {
            /** remove Default value instead of adding */
            private AttributeDefinitionSimple attribute;

            @Override
            public void run() {
                BasicCommandStack basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();
                Command cmd = null;
                if( attribute.getDefaultValue() == null ) {
                    AttributeValueSimple addCommandValue = RifFactoryImpl.eINSTANCE.createAttributeValueSimple();
                    addCommandValue.setTheValue( "" );
                    cmd = AddCommand.create( editingDomain,
                                             attribute,
                                             RifPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                                             addCommandValue );
                } else {
                    cmd = RemoveCommand.create( editingDomain, attribute.getDefaultValue() );
                }
                basicCommandStack.execute( cmd );
                tableViewer.refresh();
            }

            public void setAttribute( AttributeDefinitionSimple attribute ) {
                this.attribute = attribute;
                if( attribute.getDefaultValue() == null ) {
                    this.setText( "Add Default Value" );
                } else {
                    this.setText( "Remove Default Value" );
                }
            }
        }

        final DefaultValueAction defaultValueAction = new DefaultValueAction();

        final MenuManager menuMgr = new MenuManager();
        menuMgr.setRemoveAllWhenShown( true );

        menuMgr.addMenuListener( new IMenuListener() {

            /*
             * (non-Javadoc)
             * 
             * @see org.eclipse.jface.action.IMenuListener#menuAboutToShow(org.eclipse.jface.action.IMenuManager)
             */
            public void menuAboutToShow( IMenuManager manager ) {
                IStructuredSelection selection = (IStructuredSelection)tableViewer.getSelection();
                // after a delete there is no selection
                if( selection.isEmpty() ) return;
                // check if the row type is correct (at the moment this is implicitly always true)
                if( !(selection.getFirstElement() instanceof AttributeDefinitionSimple) ) return;
                // pass the first element of the row, the attribute definition, to the handler
                AttributeDefinitionSimple attribute = (AttributeDefinitionSimple)selection.getFirstElement();
                defaultValueAction.setAttribute( attribute );
                menuMgr.add( defaultValueAction );
            }
        } );
        // register menu at the table viewer
        tableViewer.getControl().setMenu( menuMgr.createContextMenu( tableViewer.getControl() ) );
    }

}
