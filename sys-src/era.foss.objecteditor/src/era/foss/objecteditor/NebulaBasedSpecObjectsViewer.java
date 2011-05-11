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
package era.foss.objecteditor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.nebula.widgets.compositetable.CompositeTable;
import org.eclipse.swt.nebula.widgets.compositetable.IRowContentProvider;
import org.eclipse.swt.nebula.widgets.compositetable.RowFocusAdapter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.AttributeDefinitionSimple;
import era.foss.erf.AttributeValue;
import era.foss.erf.AttributeValueSimple;
import era.foss.erf.ERF;
import era.foss.erf.ErfPackage;
import era.foss.erf.SpecObject;
import era.foss.erf.SpecType;
import era.foss.erf.impl.ErfFactoryImpl;

/**
 * FIXME (cpn) rename to NebulaBasedSpecObjectsComposite.
 */
public class NebulaBasedSpecObjectsViewer extends Composite {

    /** EditingDomain, being required for the Command creation. */
    protected AdapterFactoryEditingDomain editingDomain = null;

    /** The erf model. */
    protected ERF erfModel = null;
    /** The erf model. */
    protected SpecType theOneAndOnlySpecType = null;

    /** The composite table. */
    protected CompositeTable compositeTable = null;

    /** The basic command stack. */
    protected BasicCommandStack basicCommandStack;

    /** The specobj list. */
    EList<SpecObject> specobjList = null;

    /**
     * Instantiates a new nebula based spec objects viewer.
     * 
     * @param parent
     *            the parent
     * @param editingDomain
     *            the editing domain
     * @param erfModel
     *            the erf model
     */
    public NebulaBasedSpecObjectsViewer( Composite parent, IEditorPart erfObjectEditor ) {
        this( parent,
              (AdapterFactoryEditingDomain)( (IEditingDomainProvider)erfObjectEditor ).getEditingDomain(),
              (ERF)(XMIResource)( (IEditingDomainProvider)erfObjectEditor ).getEditingDomain().getResourceSet()
                      .getResource( EditUIUtil.getURI( erfObjectEditor.getEditorInput() ), true ).getContents().get( 0 ) );
    }

    /**
     * Instantiates a new nebula based spec objects viewer.
     * 
     * @param parent
     *            the parent
     * @param editingDomain
     *            the editing domain
     * @param erfModel
     *            the erf model
     */
    public NebulaBasedSpecObjectsViewer( Composite parent, AdapterFactoryEditingDomain editingDomain, ERF erfModel ) {
        super( parent, SWT.NULL | SWT.NO_SCROLL );

        // super( parent, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER |
        // SWT.FULL_SELECTION );
        this.editingDomain = editingDomain;
        this.erfModel = (ERF)erfModel;
        this.theOneAndOnlySpecType = this.erfModel.getCoreContent().getSpecTypes().get( 0 );

        // CPN: use casts to avoid direct dependencies to the generated
        // Erf*Editor class(es)
        this.basicCommandStack = (BasicCommandStack)editingDomain.getCommandStack();

        /* ***************************************** */
        /* create CompositeTable */
        /* ***************************************** */

        this.setLayout( new FillLayout() );
        this.compositeTable = new CompositeTable( this, SWT.NULL | SWT.NO_SCROLL );

        /* ***************************************** */
        /* create NebulaDemandedSpecObjectEditor */
        /* ***************************************** */
        new NebulaDemandedSpecObjectRowControl( compositeTable, SWT.NULL );

        compositeTable.setRunTime( true );

        this.specobjList = getElements();
        // FIXME (cpn) this is kinda static - the array of SpecObjects
        compositeTable.setNumRowsInCollection( specobjList.toArray().length );

        // Note the JFace-like virtual table API
        compositeTable.addRowContentProvider( new IRowContentProvider() {

            public void refresh( CompositeTable sender, int currentObjectOffset, Control rowControl ) {
                assert ( rowControl instanceof NebulaDemandedSpecObjectRowControl );
                NebulaDemandedSpecObjectRowControl row = (NebulaDemandedSpecObjectRowControl)rowControl;

                /* ***************************************** */
                /* iterate AttributeDefinitions */
                /* ***************************************** */
                EList<AttributeDefinition> specAttributeList = theOneAndOnlySpecType.getSpecAttributes();
                int textFieldIdx = 0;
                for( AttributeDefinition attrDef : specAttributeList ) {
                    String currentObjectString = getValue( NebulaBasedSpecObjectsViewer.this.specobjList
                            .get( currentObjectOffset ), attrDef );
                    // TODO: change into Listener-based / Type-switched
                    // evaluation
                    Text textField = (Text)row.dataFields.get( attrDef.getID() );
                    textField.setText( currentObjectString );
                    textFieldIdx++;
                }
            }
        } );
        compositeTable.addRowFocusListener( new RowFocusAdapter() {

            public void depart( CompositeTable sender, int currentObjectOffset, Control rowControl ) {
                assert ( rowControl instanceof NebulaDemandedSpecObjectRowControl );
                NebulaDemandedSpecObjectRowControl row = (NebulaDemandedSpecObjectRowControl)rowControl;

                /* ***************************************** */
                /* iterate AttributeDefinitions */
                /* ***************************************** */
                EList<AttributeDefinition> specAttributeList = theOneAndOnlySpecType.getSpecAttributes();
                int textFieldIdx = 0;
                for( AttributeDefinition attrDef : specAttributeList ) {
                    // TODO: change into Listener-based / Type-switched
                    // evaluation
                    Text textField = (Text)row.dataFields.get( attrDef.getID() );
                    String currentTextFieldSting = textField.getText();
                    setValue( NebulaBasedSpecObjectsViewer.this.specobjList.get( currentObjectOffset ),
                              attrDef,
                              currentTextFieldSting );
                    textFieldIdx++;
                }
            }
        } );

    }

    /**
     * Gets the elements.
     * 
     * @return the elements
     */
    @SuppressWarnings( "unchecked" )
    protected EList<SpecObject> getElements() {

        EList<SpecObject> specObjects = null;
        try {
            specObjects = erfModel.getCoreContent().getSpecObjects();
        } catch( NullPointerException e ) {
            specObjects = (EList<SpecObject>)ECollections.EMPTY_ELIST;
        }
        return specObjects;
    }

    /**
     * Gets the value.
     * 
     * @param specObject
     *            the spec object
     * @param attributeDefinition
     *            the attribute definition
     * @return the value
     */
    protected String getValue( SpecObject specObject, AttributeDefinition attributeDefinition ) {
        AttributeValue value = getSpecObjectValue( specObject, attributeDefinition );
        return getSpecObjectValueString( value, attributeDefinition );
    }

    /**
     * Sets the value.
     * 
     * @param specObject
     *            the spec object
     * @param attributeDefinition
     *            the attribute definition
     * @param editorValue
     *            the editor value
     */
    protected void setValue( SpecObject specObject, AttributeDefinition attributeDefinition, String editorValue ) {
        if( attributeDefinition instanceof AttributeDefinitionSimple ) {
            setValueAttributeDefintionSimple( specObject, (AttributeDefinitionSimple)attributeDefinition, editorValue );
        }
    }

    /**
     * Sets the value attribute defintion simple.
     * 
     * @param specObject
     *            the spec object
     * @param attributeDefinition
     *            the attribute definition
     * @param editorValue
     *            the editor value
     */
    private void setValueAttributeDefintionSimple( SpecObject specObject,
                                                   AttributeDefinitionSimple attributeDefinition,
                                                   String editorValue ) {

        AttributeValueSimple attributeValue = null;

        // check if the spec object provides a value for this column/attribute
        for( AttributeValue attributeValueIter : specObject.getValues() ) {
            if( attributeValueIter instanceof AttributeValueSimple ) {
                if( attributeDefinition.equals( ( (AttributeValueSimple)attributeValueIter ).getDefinition() ) ) {
                    attributeValue = (AttributeValueSimple)attributeValueIter;
                }
            }
        }

        // SpecObject has no Attribute Value for this Attribute Definition
        if( attributeValue == null ) {
            // create an Attribute Value
            attributeValue = ErfFactoryImpl.eINSTANCE.createAttributeValueSimple();

            // set reference to the respecitive Attribute Definition
            attributeValue.setDefinition( attributeDefinition );
            // set value of attribute definition
            attributeValue.setTheValue( (String)editorValue );

            // create new Attribute value in the model
            Command cmd = AddCommand.create( editingDomain, specObject, ErfPackage.SPEC_OBJECT__VALUES, attributeValue );
            basicCommandStack.execute( cmd );
        }

        // don't update the model
        // if the value is identical to current value of the spec object
        else if( editorValue.equals( attributeValue.getTheValue() ) ) {
            return;
        }

        // The value in the editor and the model differ: set value in the model
        else {
            // The set command does not work when the object is created via the
            // create() method. Reason: Due to a bug the 'feature Id' is not
            // passed
            // to the command. Therefore the execution fails.
            Command cmd = new SetCommand( editingDomain, attributeValue, attributeValue.eClass()
                    .getEStructuralFeature( ErfPackage.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE ), editorValue );

            basicCommandStack.execute( cmd );
        }
    }

    /**
     * get the string representation of a spec object for a certain attribute
     * Definition
     * 
     * in case no attribute value has been set search for the default value
     * given for the attribute definition
     * 
     * in case no default value is specified return the empty string.
     * 
     * @param value
     *            the value
     * @param attributeDefinition
     *            of which the value is taken
     * @return String holding the value of spec object
     */
    private String getSpecObjectValueString( AttributeValue value, AttributeDefinition attributeDefinition ) {

        // return an empty string in case we find no value nor default value
        String valueString = "";

        // Handle simple attribute values
        if( attributeDefinition instanceof AttributeDefinitionSimple ) {
            // get attribute value according to the attribute definition

            // if value is not set try to use default value (if available)
            if( value == null ) {
                value = ( (AttributeDefinitionSimple)attributeDefinition ).getDefaultValue();
            }

            // get string if value object is defined
            if( value != null ) {
                valueString = ( (AttributeValueSimple)value ).getTheValue();
            }
        }

        return valueString;
    }

    /**
     * Find the attribte value object of SpecObject for a certain attribute
     * definition.
     * 
     * @param specObject
     *            the spec object
     * @param attributeDefinition
     *            the attribute definition
     * @return <ul>
     *         <li>attribute value</li>
     *         <li><code>null</code> in case on attribute value has been found</li>
     */
    private AttributeValue getSpecObjectValue( SpecObject specObject, AttributeDefinition attributeDefinition ) {

        AttributeValue value = null;
        // check if the spec object provides a value for this column/attribute
        for( AttributeValue valueIter : specObject.getValues() ) {
            if( valueIter instanceof AttributeValueSimple ) {
                if( attributeDefinition.equals( ( (AttributeValueSimple)valueIter ).getDefinition() ) ) {
                    value = valueIter;
                }
            }
        }
        return value;
    }

    /**
     * The Class NebulaDemandedSpecObjectRowControl.
     */
    private static class NebulaDemandedSpecObjectRowControl extends Composite {

        /** The one and only spec type. */
        protected SpecType theOneAndOnlySpecType = null;

        /** The text fields. */
        public HashMap<String, Control> dataFields = new HashMap<String, Control>();

        /**
         * Instantiates a new nebula demanded spec object row control.
         * 
         * @param parent
         *            the parent
         * @param style
         *            the style
         */
        public NebulaDemandedSpecObjectRowControl( Composite parent, int style ) {
            super( parent, style | SWT.BORDER );

            /* ***************************************** */
            /* initialize viewer-based members */
            /* ***************************************** */

            // search hierachy for the ancestor that is a
            // NebulaBasedSpecObjectsViewer
            assert ( parent instanceof CompositeTable );
            Composite ancestor = parent;
            for( ; ( ancestor != null ) && !( ancestor instanceof NebulaBasedSpecObjectsViewer ); ancestor = ancestor
                    .getParent() )
                ;
            assert ( ancestor != null );
            NebulaBasedSpecObjectsViewer myViewer = (NebulaBasedSpecObjectsViewer)ancestor;

            // initialize members
            this.theOneAndOnlySpecType = myViewer.theOneAndOnlySpecType;

            // helper reference
            EList<AttributeDefinition> specAttributeList = theOneAndOnlySpecType.getSpecAttributes();

            if( specAttributeList.size() == 0 ) return;

            // Sort attribs in visual order
            final List<AttributeDefinition> visAttributes = new ArrayList<AttributeDefinition>();
            visAttributes.addAll( specAttributeList );
            Collections.sort( visAttributes, new Comparator<AttributeDefinition>() {

                @Override
                public int compare( AttributeDefinition o1, AttributeDefinition o2 ) {
                    int row1 = o1.getUiProperties().getEditorRowNumber();
                    int row2 = o2.getUiProperties().getEditorRowNumber();
                    return row1 != row2 ? row1 - row2 : visAttributes.indexOf( o1 ) - visAttributes.indexOf( o2 );
                }
            } );
            
            // calc maxColumnSpan
            int maxColumnSpan = 0;
            int curRow = 0;
            int curSpan = 0;
            for( AttributeDefinition a : visAttributes ) {
                int r = a.getUiProperties().getEditorRowNumber();
                if( curRow != r ) {
                    if( maxColumnSpan < curSpan ) maxColumnSpan = curSpan;
                    curRow = r;
                    curSpan = 0;
                }
                curSpan += a.getUiProperties().getEditorColumnSpan()
                        + ( a.getUiProperties().isEditorShowLabel() ? 1 : 0 );
            }            
            
            this.dataFields = new HashMap<String, Control>( specAttributeList.size() );
            
            setLayout( new GridLayout( maxColumnSpan, false ) );

            curRow = 0;
            curSpan = 0;
            for( AttributeDefinition attrDef : visAttributes ) {
                final int r = attrDef.getUiProperties().getEditorRowNumber();
                if( r > curRow ) curRow = 0; 
                final int c = attrDef.getUiProperties().getEditorColumnSpan();
                curSpan += c;

                // initialize label
                if( attrDef.getUiProperties().isEditorShowLabel() ) {
                    curSpan++;
                    Label labelLongName = new Label( this, SWT.NULL );
                    labelLongName.setText( attrDef.getLongName() + ":" );
                    labelLongName.setLayoutData( new GridData( SWT.LEFT, SWT.CENTER, false, false, 1, 1 ) );
                }

                Control currentControl = null;
                switch( attrDef.getType().eClass().getClassifierID() ) {
                    case ErfPackage.DATATYPE_DEFINITION_INTEGER:
                    case ErfPackage.DATATYPE_DEFINITION_STRING:
                        currentControl = new Text( this, SWT.BORDER );
                        // taddListener(new Listener(a))
                        break;
                    default:
                        throw new IllegalStateException( "not implemented" );
                }
                assert ( currentControl != null );

                currentControl.setLayoutData( new GridData( SWT.FILL, SWT.CENTER, true, false, c, 1 ) );

                dataFields.put( attrDef.getID(), currentControl );
                
                // TODO: Add row end and empty line padding
            }

            int paddingColumnSpan = maxColumnSpan - curSpan;
            if( paddingColumnSpan > 0 ) {
                Label labelLongName = new Label( this, SWT.NULL );
                labelLongName.setText( "" );
                labelLongName.setLayoutData( new GridData( SWT.FILL, SWT.CENTER, false, false, paddingColumnSpan, 1 ) );
            }

        }
    }

}
