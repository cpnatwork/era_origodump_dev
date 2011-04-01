/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.erf.impl;

import era.foss.erf.AttributeDefinitionUiProperties;
import era.foss.erf.ErfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition Ui Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionUiPropertiesImpl#isEditorShowLabel <em>Editor Show Label</em>}</li>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionUiPropertiesImpl#getEditorRowNumber <em>Editor Row Number</em>}</li>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionUiPropertiesImpl#getEditorColumnSpan <em>Editor Column Span</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionUiPropertiesImpl extends EObjectImpl implements AttributeDefinitionUiProperties {
    /**
     * The default value of the '{@link #isEditorShowLabel() <em>Editor Show Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEditorShowLabel()
     * @generated
     * @ordered
     */
    protected static final boolean EDITOR_SHOW_LABEL_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isEditorShowLabel() <em>Editor Show Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEditorShowLabel()
     * @generated
     * @ordered
     */
    protected boolean editorShowLabel = EDITOR_SHOW_LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getEditorRowNumber() <em>Editor Row Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditorRowNumber()
     * @generated
     * @ordered
     */
    protected static final int EDITOR_ROW_NUMBER_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getEditorRowNumber() <em>Editor Row Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditorRowNumber()
     * @generated
     * @ordered
     */
    protected int editorRowNumber = EDITOR_ROW_NUMBER_EDEFAULT;

    /**
     * The default value of the '{@link #getEditorColumnSpan() <em>Editor Column Span</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditorColumnSpan()
     * @generated
     * @ordered
     */
    protected static final int EDITOR_COLUMN_SPAN_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getEditorColumnSpan() <em>Editor Column Span</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditorColumnSpan()
     * @generated
     * @ordered
     */
    protected int editorColumnSpan = EDITOR_COLUMN_SPAN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeDefinitionUiPropertiesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ErfPackage.Literals.ATTRIBUTE_DEFINITION_UI_PROPERTIES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isEditorShowLabel() {
        return editorShowLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEditorShowLabel( boolean newEditorShowLabel ) {
        boolean oldEditorShowLabel = editorShowLabel;
        editorShowLabel = newEditorShowLabel;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_SHOW_LABEL,
            oldEditorShowLabel,
            editorShowLabel ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getEditorRowNumber() {
        return editorRowNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEditorRowNumber( int newEditorRowNumber ) {
        int oldEditorRowNumber = editorRowNumber;
        editorRowNumber = newEditorRowNumber;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_ROW_NUMBER,
            oldEditorRowNumber,
            editorRowNumber ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getEditorColumnSpan() {
        return editorColumnSpan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEditorColumnSpan( int newEditorColumnSpan ) {
        int oldEditorColumnSpan = editorColumnSpan;
        editorColumnSpan = newEditorColumnSpan;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_COLUMN_SPAN,
            oldEditorColumnSpan,
            editorColumnSpan ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_SHOW_LABEL:
            return isEditorShowLabel();
        case ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_ROW_NUMBER:
            return getEditorRowNumber();
        case ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_COLUMN_SPAN:
            return getEditorColumnSpan();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_SHOW_LABEL:
            setEditorShowLabel( (Boolean)newValue );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_ROW_NUMBER:
            setEditorRowNumber( (Integer)newValue );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_COLUMN_SPAN:
            setEditorColumnSpan( (Integer)newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_SHOW_LABEL:
            setEditorShowLabel( EDITOR_SHOW_LABEL_EDEFAULT );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_ROW_NUMBER:
            setEditorRowNumber( EDITOR_ROW_NUMBER_EDEFAULT );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_COLUMN_SPAN:
            setEditorColumnSpan( EDITOR_COLUMN_SPAN_EDEFAULT );
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_SHOW_LABEL:
            return editorShowLabel != EDITOR_SHOW_LABEL_EDEFAULT;
        case ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_ROW_NUMBER:
            return editorRowNumber != EDITOR_ROW_NUMBER_EDEFAULT;
        case ErfPackage.ATTRIBUTE_DEFINITION_UI_PROPERTIES__EDITOR_COLUMN_SPAN:
            return editorColumnSpan != EDITOR_COLUMN_SPAN_EDEFAULT;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (editorShowLabel: " );
        result.append( editorShowLabel );
        result.append( ", editorRowNumber: " );
        result.append( editorRowNumber );
        result.append( ", editorColumnSpan: " );
        result.append( editorColumnSpan );
        result.append( ')' );
        return result.toString();
    }

} //AttributeDefinitionUiPropertiesImpl
