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
 * $Id: DetailViewer.java 314 2011-04-05 22:28:39Z schorsch $
 *************************************************************************/
package era.foss.typeeditor;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.AttributeDefinitionSimple;
import era.foss.erf.AttributeValueSimple;
import era.foss.erf.ErfPackage;
import era.foss.erf.impl.ErfFactoryImpl;
import era.foss.typeeditor.ui.BindingCheckBox;
import era.foss.typeeditor.ui.BindingText;

/**
 * Create GUI elements for structural features of EMF model elements.A structural feature is only shown in case it has a
 * annotation 'UI' where the annotation detail key 'Detail' is set to 'true'
 * <p>
 * Currently following structural features are supported:
 * <li>Attributes holding a boolean or string value
 * <li>Containment references
 * 
 */
public class AttributeDefinitionDetailViewer extends AbstractDetailViewer {

    /**
     * @see AbstractDetailViewer#AbstractDetailViewer(Composite, int, EditingDomain, IObservableValue)
     */
    AttributeDefinitionDetailViewer( Composite parent, int style, EditingDomain editingDomain, IObservableValue master ) {
        super( parent, style, editingDomain, master );
        // TODO Auto-generated constructor stub
    }

    /**
     * create UI elements according to the type of the DatatypeDefition
     */
    protected void createDetails() {

        // In case no dataType definition has been selected
        if( master.getValue() == null ) {
            return;
        }

        // pick function for creating GUI elements according to type of DatatypeDefinition
        ui = new Ui( editingDomain );
        assert (master.getValue() instanceof AttributeDefinition);
        AttributeDefinition attributeDefintion = (AttributeDefinition)master.getValue();

        switch (attributeDefintion.eClass().getClassifierID()) {

        case ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE:
            createDetailsSimple();
            break;

        case ErfPackage.ATTRIBUTE_DEFINITION_ENUMERATION:
            createDetailsEnumeration();
            break;
        }
    }

    /**
     * Show UI elements for DatatypeDefintionInteger
     */
    private void createDetailsSimple() {
        assert (master.getValue() instanceof AttributeDefinitionSimple);
        final AttributeDefinitionSimple attributeDefinitionSimple = (AttributeDefinitionSimple)master.getValue();

        // label for enabling default value
        Label label = new Label( detailComposite, SWT.NONE );
        label.setText( "Use Default value" );
        label.setLayoutData( new GridData( SWT.LEFT, SWT.CENTER, true, false ) );

        // checkbox for enabling default value
        // when the checkbox is set a default value object will be created
        Button defaultValueCheckbox = new Button( detailComposite, SWT.CHECK );
        defaultValueCheckbox.setSelection( attributeDefinitionSimple.getDefaultValue() != null );
        defaultValueCheckbox.addListener( SWT.Selection, new Listener() {

            @Override
            public void handleEvent( Event event ) {
                Button defaultValueCheckbox = (Button)event.widget;
                AttributeValueSimple defaultValue = attributeDefinitionSimple.getDefaultValue();

                if( defaultValueCheckbox.getSelection() == false && defaultValue != null ) {
                    Command defaultValueRemoveCommand = RemoveCommand.create( editingDomain, defaultValue );;
                    editingDomain.getCommandStack().execute( defaultValueRemoveCommand );
                }
                if( defaultValueCheckbox.getSelection() == true && defaultValue == null ) {
                    AttributeValueSimple newDefaultValue = ErfFactoryImpl.eINSTANCE.createAttributeValueSimple();
                    newDefaultValue.setTheValue( "" );
                    newDefaultValue.setDefinition( attributeDefinitionSimple );
                    Command defaultValueAddCommand = AddCommand.create( editingDomain,
                                                                        attributeDefinitionSimple,
                                                                        ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
                                                                        newDefaultValue );
                    editingDomain.getCommandStack().execute( defaultValueAddCommand );
                }
            }
        } );

        // label for default value
        Label defaultValutLabel = new Label( detailComposite, SWT.NONE );
        defaultValutLabel.setText( Ui.getUiName( ErfPackage.Literals.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE ) );
        defaultValutLabel.setLayoutData( new GridData( SWT.LEFT, SWT.CENTER, true, false ) );

        // text field for default value
        EStructuralFeature[] defaultValueTextfield = {
            ErfPackage.Literals.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
            ErfPackage.Literals.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE};
        BindingText text = new BindingText( detailComposite, SWT.BORDER );
        text.bind( editingDomain, defaultValueTextfield, master );
        text.setLayoutData( new GridData( SWT.FILL, SWT.CENTER, true, false ) );

    }

    /**
     * Show UI elements for DatatypeDefintionEnumeration
     */
    private void createDetailsEnumeration() {
        // create label for multiValued property
        Label label = new Label( detailComposite, SWT.NONE );
        label.setText( Ui.getUiName( ErfPackage.Literals.ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED ) );
        label.setLayoutData( new GridData( SWT.LEFT, SWT.CENTER, true, false ) );

        // create checkbox for multiValued property
        EAttribute[] isMultiValued = {ErfPackage.Literals.ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED};
        BindingCheckBox multiValuedCheckbox = new BindingCheckBox( detailComposite, SWT.NONE );
        multiValuedCheckbox.setLayoutData( new GridData( SWT.LEFT, SWT.DEFAULT, true, false ) );
        multiValuedCheckbox.bind( editingDomain, isMultiValued, master );

        // create table for enumeration values
        // CheckboxTableViewer emumValuesSelectionsList = new CheckboxTableViewer(
        // new Table( detailComposite, SWT.CHECK ) );
        // checkboxTableViewer.
        // | SWT.V_SCROLL
        // | SWT.BORDER
        // | SWT.FULL_SELECTION |SWT.CHECK );
        // tableViewer.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true, 2, 1 ) );
        // tableViewer.setEditingDomain( editingDomain );
        // tableViewer.setAddCommandParameter( (EObject)this.master.getValue(), ErfPackage.Literals.ENUM_VALUE );
        //
        // ObservableListContentProvider cp = new ObservableListContentProvider();
        // tableViewer.setContentProvider( cp );
        //
        // TableColumnLayout columnLayout = (TableColumnLayout)tableViewer.getTable().getParent().getLayout();
        // // create column with name of the element
        // TableViewerColumn column = new TableViewerColumn( tableViewer, SWT.NONE );
        //
        // columnLayout.setColumnData( column.getColumn(), new ColumnWeightData( 20, 20 ) );
        // column.getColumn().setResizable( true );
        // column.getColumn().setMoveable( false );
        // column.getColumn().setText( Ui.getUiName( ErfPackage.Literals.IDENTIFIABLE__LONG_NAME ) );
        // EStructuralFeature[] structuralFeature = {ErfPackage.Literals.IDENTIFIABLE__LONG_NAME};
        // ui.bindColumn( column, structuralFeature );

        // IEMFListProperty enumerationProperty = EMFProperties.list(
        // ErfPackage.Literals.DATATYPE_DEFINITION_ENUMERATION__SPECIFIED_VALUES );
        // tableViewer.setInput( enumerationProperty.observe( master.getValue() ) );

    }
    // /**
    // * remove a default value from a simple attribute definition.
    // *
    // * @param attributeDefinition AttributeDefintion from which the default value shall be removed
    // */
    // private void removeDefaultValue( AttributeDefinition attributeDefinition ) {
    //
    // EObject objectToRemove = null;
    //
    // switch (attributeDefinition.eClass().getClassifierID()) {
    //
    // case ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE:
    // AttributeDefinitionSimple attributeDefinitionSimple = (AttributeDefinitionSimple)attributeDefinition;
    // objectToRemove = attributeDefinitionSimple.getDefaultValue();
    // break;
    //
    // case ErfPackage.ATTRIBUTE_DEFINITION_ENUMERATION:
    // AttributeDefinitionEnumeration attributeDefinitionEnum = (AttributeDefinitionEnumeration)attributeDefinition;
    // objectToRemove = attributeDefinitionEnum.getDefaultValue();
    // break;
    // }
    //
    // if( objectToRemove != null ) {
    // Command cmd = RemoveCommand.create( editingDomain, objectToRemove );;
    // editingDomain.getCommandStack().execute( cmd );
    // tableViewer.refresh();
    // }
    // }
    //
    // /**
    // * Add a default value for a simple Attribute Definition.
    // *
    // * @param attributeDefinition Attribute definition for which the default value shall be added
    // */
    // private void addDefaultValue( AttributeDefinition attributeDefinition ) {
    // BasicCommandStack basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();
    // Command addCommand = null;
    //
    // switch (attributeDefinition.eClass().getClassifierID()) {
    //
    // case ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE:
    // AttributeDefinitionSimple attributeDefinitionSimple = (AttributeDefinitionSimple)attributeDefinition;
    //
    // // In case no default value exists create one and set it to an empty string
    // if( attributeDefinitionSimple.getDefaultValue() == null ) {
    // AttributeValueSimple newDefaultValue = ErfFactoryImpl.eINSTANCE.createAttributeValueSimple();
    // newDefaultValue.setTheValue( "" );
    // newDefaultValue.setDefinition( attributeDefinitionSimple );
    // addCommand = AddCommand.create( editingDomain,
    // attributeDefinitionSimple,
    // ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
    // newDefaultValue );
    //
    // }
    // break;
    // case ErfPackage.ATTRIBUTE_DEFINITION_ENUMERATION:
    // AttributeDefinitionEnumeration attributeDefinitionEnum = (AttributeDefinitionEnumeration)attributeDefinition;
    //
    // // In case no default value exists create one and set it to an empty string
    // // if( attributeDefinitionEnum.getDefaultValue() == null ) {
    // // AttributeValueEnumeration newDefaultValue = ErfFactoryImpl.eINSTANCE.createAttributeValueEnumeration();
    // // newDefaultValue.newDefaultValue.setDefinition( attributeDefinitionEnum );
    // // addCommand = AddCommand.create( editingDomain,
    // // attributeDefinitionEnum,
    // // ErfPackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE,
    // // newDefaultValue );
    // //
    // // }
    // break;
    //
    // }
    //
    // if( addCommand != null ) {
    // basicCommandStack.execute( addCommand );
    // tableViewer.refresh();
    // }
    // }
}
