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

import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IEditorPart;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.DatatypeDefinition;
import era.foss.erf.ERF;
import era.foss.erf.ErfPackage;
import era.foss.erf.SpecType;
import era.foss.erf.impl.ErfFactoryImpl;
import era.foss.objecteditor.EraCommandStack;

/**
 * An abstract form, that contains members and constructor code that is common to all editing forms for ERA types.
 * <p>
 * Contains a reference to the {@link ERF} model.
 * <p>
 * Contains a reference to the {@link EraCommandStack}.
 * 
 * @author cpn
 */
public abstract class AbstractErfTypesForm extends Composite {

    /** The editor. */
    protected IEditorPart editor = null;

    /** The editing domain. */
    protected AdapterFactoryEditingDomain editingDomain = null;

    /** The erf resource. */
    protected Resource erfResource = null;

    /** The erf model. */
    protected ERF erfModel = null;

    /** The era command stack. */
    protected EraCommandStack eraCommandStack = null;

    /** The adapter factory. */
    protected AdapterFactory adapterFactory = null;

    /** The type editor activator. */
    protected Activator typeEditorActivator = null;

    // for now the one and only spec type
    /** The one and only spec type. */
    protected SpecType theOneAndOnlySpecType;

    /**
     * Constructs a new instance of this class - defaulting the style to {@link SWT#NONE}.
     * 
     * @param parent a widget which will be the parent of the new instance (cannot be null)
     * @param editor the editor from which the and {@link CommandStack} can be derived
     * 
     * @see #AbstractErfTypesForm(Composite, IEditorPart, int)
     */
    public AbstractErfTypesForm( Composite parent, IEditorPart editor ) {
        this( parent, editor, SWT.NONE );
    }

    /**
     * Constructs a new instance of this class given its parent, the editor and a style value describing its behavior
     * and appearance.
     * 
     * @param parent a widget which will be the parent of the new instance (cannot be null)
     * @param editor the editor from which the and {@link CommandStack} can be derived
     * @param style the style of widget to construct
     * 
     * @see Widget#getStyle
     */
    public AbstractErfTypesForm( Composite parent, IEditorPart editor, int style ) {
        super( parent, style );

        this.editor = editor;
        this.editingDomain = (AdapterFactoryEditingDomain)((IEditingDomainProvider)editor).getEditingDomain();
        this.erfResource = (XMIResource)editingDomain.getResourceSet()
                                                     .getResource( EditUIUtil.getURI( editor.getEditorInput() ), true );
        this.erfModel = (ERF)(erfResource).getContents().get( 0 );

        this.eraCommandStack = (EraCommandStack)editingDomain.getCommandStack();
        this.adapterFactory = ((AdapterFactoryEditingDomain)editingDomain).getAdapterFactory();

        this.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
        this.typeEditorActivator = era.foss.typeeditor.Activator.INSTANCE;

        // get the one and only SpecType
        theOneAndOnlySpecType = (SpecType)erfModel.getCoreContent().getSpecTypes().get( 0 );
    }

    /**
     * Adapt attribute definition according to datatypeDefintion it is refering to
     */
    AttributeDefinition adaptAttributeDefintion( AttributeDefinition attributeDefinition ) {

        DatatypeDefinition datatypeDefinition = attributeDefinition.getType();

        if( datatypeDefinition == null ) {
            return attributeDefinition;
        }

        // EClass of new AttributeDefinition
        EClass newAttributeDefintionEClass = ErfPackage.Literals.ATTRIBUTE_DEFINITION_SIMPLE;

        // determine the respective AttributeDefinition according to selected DatatypeDefinition
        if( datatypeDefinition.eClass().getClassifierID() == ErfPackage.DATATYPE_DEFINITION_ENUMERATION ) {
            newAttributeDefintionEClass = ErfPackage.Literals.ATTRIBUTE_DEFINITION_ENUMERATION;
        }

        // in case the new AttributeDefinition has the same type as the old one
        // we are done now
        if( attributeDefinition.eClass().getClassifierID() == newAttributeDefintionEClass.getClassifierID() ) {
            return attributeDefinition;
        }

        // The current AttributeDefitinion does not match the selected DatatypeDefintion.
        // Therefore we have to create a new AttributeDefition
        AttributeDefinition newAttributeDefinition = (AttributeDefinition)ErfFactoryImpl.eINSTANCE.create( newAttributeDefintionEClass );

        attributeDefinition.setType( null );

        // copy all properties common for all subclasses of AttributeDefintion
        for( EStructuralFeature eStrcuEStructuralFeature : ErfPackage.Literals.ATTRIBUTE_DEFINITION.getEAllStructuralFeatures() ) {
            if( eStrcuEStructuralFeature.isChangeable() == true ) {
                newAttributeDefinition.eSet( eStrcuEStructuralFeature,
                                             attributeDefinition.eGet( eStrcuEStructuralFeature ) );
            }
        }
        newAttributeDefinition.setType( datatypeDefinition );

        // perform the REPLACE
        // remark: the ReplaceCommand issues an REMOVE and ADD notification
        Command replaceCommand = ReplaceCommand.create( editingDomain,
                                                        theOneAndOnlySpecType,
                                                        ErfPackage.Literals.SPEC_TYPE__SPEC_ATTRIBUTES,
                                                        attributeDefinition,
                                                        Collections.singleton( newAttributeDefinition ) );
        editingDomain.getCommandStack().execute( replaceCommand );
        return newAttributeDefinition;
    }
}
