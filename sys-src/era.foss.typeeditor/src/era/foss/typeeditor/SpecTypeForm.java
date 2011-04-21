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

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.AttributeDefinitionSimple;
import era.foss.erf.AttributeValueSimple;
import era.foss.erf.DatatypeDefinition;
import era.foss.erf.ErfPackage;
import era.foss.erf.SpecType;
import era.foss.erf.impl.ErfFactoryImpl;

/**
 * A form for editing the {@link SpecType}.
 * <p>
 * At the moment there exists exactly one {@link SpecType} in an ERA ERF model. The form holds a reference to this
 * single {@link SpecType}.
 * <p>
 * Each {@link SpecType} essentially consists of list of {@link AttributeDefinition}s which have a
 * {@link DatatypeDefinition} as well as an optional defaultValue in form of an {@link AttributeValueSimple}.
 * <p>
 * From the perspective of presentation & editing, the three classes are visually merged into a three-column table.
 * <p>
 * The inner class {@link .AttributesAdapterFactoryContentProvider} is registered to the {@link AddDeleteTableViewer}
 * and extracts all {@link AttributeDefinition}s for a {@link SpecType} from the ERF model -- by the {@link SpecType}'s
 * reference named "specAttributes".
 * <p>
 * The inner class {@link .AttributesLabelProvider} is registered to the {@link AddDeleteTableViewer} and provides the
 * cell values from the {@link AttributeDefinition} element.
 * 
 * @see SpecType
 * @see AttributeDefinition
 * @see AttributeValueSimple
 */
public class SpecTypeForm extends AbstractErfTypesForm {

    // for now the one and only spec type
    /** The one and only spec type. */
    private SpecType theOneAndOnlySpecType;

    /** Table viewer holding the attributes of a spec type. */
    private AddDeleteTableViewer tableViewer;

    /** object for creating and binding ui elements. */
    private Ui ui;

    /**
     * Instantiates a new spec type form.
     * 
     * @param parent the parent
     * @param editor the editor
     */
    public SpecTypeForm( Composite parent, IEditorPart editor ) {
        super( parent, editor, SWT.NONE );

        ui = new Ui( editingDomain, erfModel );

        // check for and eventually initialize the sole SpecType
        theOneAndOnlySpecType = (SpecType)erfModel.getCoreContent().getSpecTypes().get( 0 );

        // set-up layout
        GridLayout gridLayout = new GridLayout( 2, true );
        this.setLayout( gridLayout );

        // set up table viewer for attribute definitions
        createTableViewer();

        // set up viewer for details
        createDetailViewer();

        // Context menu for creating Elements of default values
        createContextMenu();
    }

    /**
     * Create Table viewer showing attributes.
     */
    private void createTableViewer() {

        tableViewer = new AddDeleteTableViewer( this, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION );
        tableViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

        tableViewer.setEditingDomain( editingDomain );
        tableViewer.setAddCommandParameter( theOneAndOnlySpecType,
                                            ErfFactoryImpl.eINSTANCE.createAttributeDefinitionSimple().eClass() );

        ObservableListContentProvider cp = new ObservableListContentProvider();
        tableViewer.setContentProvider( cp );

        // set column data
        EStructuralFeature[][] colEStructuralFeatures = {
            {ErfPackage.Literals.IDENTIFIABLE__LONG_NAME},
            {ErfPackage.Literals.ATTRIBUTE_DEFINITION__TYPE, ErfPackage.Literals.IDENTIFIABLE__LONG_NAME},
            {
                ErfPackage.Literals.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                ErfPackage.Literals.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE}};

        int[] colMinWidth = {100, 100, 100};
        int[] colWeigth = {34, 33, 33};
        boolean[] colResize = {true, true, false};

        // create columns
        for( int colNr = 0; colNr < colEStructuralFeatures.length; colNr++ ) {
            TableColumnLayout columnLayout = (TableColumnLayout)tableViewer.getTable().getParent().getLayout();

            // column settings
            TableViewerColumn column = new TableViewerColumn( tableViewer, SWT.NONE );
            column.getColumn().setText( Ui.getUiName( colEStructuralFeatures[colNr][0] ) );
            column.getColumn().setResizable( colResize[colNr] );
            column.getColumn().setMoveable( false );
            columnLayout.setColumnData( column.getColumn(), new ColumnWeightData(
                colWeigth[colNr],
                colMinWidth[colNr] ) );
            ui.bindColumn( column, colEStructuralFeatures[colNr] );

        }

        // provide input for the table
        IEMFListProperty specAttributesProperty = EMFProperties.list( ErfPackage.Literals.SPEC_TYPE__SPEC_ATTRIBUTES );
        tableViewer.setInput( specAttributesProperty.observe( theOneAndOnlySpecType ) );

    }

    /**
     * create detailed viewer for selected element.
     */
    private void createDetailViewer() {
        // setup Data type properties viewer
        DetailViewer detailViewer = new DetailViewer(
            this,
            SWT.NONE,
            editingDomain,
            ViewerProperties.singleSelection().observe( tableViewer ) );
        detailViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );

    }

    /**
     * create context menu for -Adding and removing Dafatult values.
     */
    private void createContextMenu() {

        final class DefaultValueAction extends Action {
            /** remove Default value instead of adding */
            private AttributeDefinitionSimple attribute;

            @Override
            public void run() {
                if( attribute.getDefaultValue() == null )
                // add default value (-> empty string)
                {
                    addDefaultValue( attribute );
                } else
                // remove default value
                {
                    removeDefaultValue( attribute );
                }
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
                // pass the first element of the row, the attribute definition, to the handler
                AttributeDefinitionSimple attribute = getAttributeDefForColumn( selection,
                                                                                typeEditorActivator.getString( "_UI_AttributeDefinitionDefaultValue_label" ) );
                if( attribute == null ) {
                    return;
                }

                defaultValueAction.setAttribute( attribute );
                menuMgr.add( defaultValueAction );
            }
        } );
        // register menu at the table viewer
        tableViewer.getControl().setMenu( menuMgr.createContextMenu( tableViewer.getControl() ) );
    }

    /**
     * Add a default value for a simple Attribute Definition.
     * 
     * @param attribute Attribute definition for which the default value shall be added
     */
    private void addDefaultValue( AttributeDefinitionSimple attribute ) {
        BasicCommandStack basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();
        if( attribute.getDefaultValue() == null )
        // add default value (-> empty string)
        {
            AttributeValueSimple addCommandValue = ErfFactoryImpl.eINSTANCE.createAttributeValueSimple();
            addCommandValue.setTheValue( "" );
            addCommandValue.setDefinition( attribute );
            Command cmd = AddCommand.create( editingDomain,
                                             attribute,
                                             ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                                             addCommandValue );
            basicCommandStack.execute( cmd );
            tableViewer.refresh();
        }

    }

    /**
     * remove a default value from a simple attribute definition.
     * 
     * @param attribute AttributeDefintion from which the default value shall be removed
     */
    private void removeDefaultValue( AttributeDefinitionSimple attribute ) {
        BasicCommandStack basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();
        Command cmd = RemoveCommand.create( editingDomain, attribute.getDefaultValue() );
        basicCommandStack.execute( cmd );
        tableViewer.refresh();
    }

    /**
     * Get attribute definition in case the column for the default value is selected.
     * 
     * @param selection the selection
     * @param columnName the column name
     * @return the attribute def for column
     * @selection the selection of Attributes
     */
    private AttributeDefinitionSimple getAttributeDefForColumn( IStructuredSelection selection, String columnName ) {
        // Check if an element is selected and if we are in the column
        // for the default value
        if( selection.isEmpty()
            || !tableViewer.getTable().getColumn( tableViewer.getActiveColumn() ).getText().equals( columnName ) ) {
            return null;
        }

        // get first attribute definition of selection
        AttributeDefinitionSimple attributeDef = (AttributeDefinitionSimple)selection.getFirstElement();

        // check if the row type is correct (at the moment this is implicitly always true)
        if( !(selection.getFirstElement() instanceof AttributeDefinitionSimple) ) {
            return null;
        }

        return attributeDef;
    }

}
