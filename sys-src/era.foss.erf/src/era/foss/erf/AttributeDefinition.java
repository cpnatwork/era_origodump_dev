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
package era.foss.erf;

/**
 * @model abstract="true"
 * 
 */
public interface AttributeDefinition extends Identifiable {

    /**
     * @model lowerBound="1" annotation="UI ObservedStructuralFeature='coreContent:dataTypes'"
     * @Not generated
     * @return
     */
    public DatatypeDefinition getType();

    /**
     * The value assigned to this attribute definition is used as ID
     * 
     * @model unique="true" default="false" required="true" ordered="false" annotation="UI Detail='true'"
     * @Not generated
     */
    boolean isIdent();

    /**
     * The value assigned to this attribute definition must be unique
     * 
     * @model unique="false" default="false" required="true" ordered="false" annotation="UI Detail='true'"
     * @Not generated
     */
    boolean isUnique();

    /**
     * @model unique="false" default="true" required="true" ordered="false" annotation="UI Detail='true'"
     * @Not generated
     * @return
     */
    boolean isEditorShowLabel();

    /**
     * Sets the value of the '{@link era.foss.erf.AttributeDefinition#isEditorShowLabel <em>Editor Show Label</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Editor Show Label</em>' attribute.
     * @see #isEditorShowLabel()
     * @generated
     */
    void setEditorShowLabel( boolean value );

    /**
     * @model unique="false" default="1" lowerBound="1" upperBound="1" ordered="false" annotation="UI Detail='true'"
     * @Not generated
     * @return
     */
    int getEditorRowNumber();

    /**
     * Sets the value of the '{@link era.foss.erf.AttributeDefinition#getEditorRowNumber <em>Editor Row Number</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Editor Row Number</em>' attribute.
     * @see #getEditorRowNumber()
     * @generated
     */
    void setEditorRowNumber( int value );

    /**
     * @model unique="false" default="1" lowerBound="1" upperBound="1" ordered="false" annotation="UI Detail='true'"
     * @Not generated
     * @return
     */
    int getEditorColumnSpan();

    /**
     * Sets the value of the '{@link era.foss.erf.AttributeDefinition#getEditorColumnSpan <em>Editor Column Span</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Editor Column Span</em>' attribute.
     * @see #getEditorColumnSpan()
     * @generated
     */
    void setEditorColumnSpan( int value );

    /**
     * Sets the value of the '{@link era.foss.erf.AttributeDefinition#isUnique <em>Unique</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Unique</em>' attribute.
     * @see #isUnique()
     * @generated
     */
    void setUnique( boolean value );

    /**
     * Sets the value of the '{@link era.foss.erf.AttributeDefinition#isIdent <em>Ident</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Ident</em>' attribute.
     * @see #isIdent()
     * @generated
     */
    void setIdent( boolean value );

    /**
     * Sets the value of the '{@link era.foss.erf.AttributeDefinition#getType <em>Type</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType( DatatypeDefinition value );

}
