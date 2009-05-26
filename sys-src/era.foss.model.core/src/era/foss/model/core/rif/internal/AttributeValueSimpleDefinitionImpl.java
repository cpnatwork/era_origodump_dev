/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValueSimpleDefinition;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Simple Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueSimpleDefinitionImpl#getATTRIBUTEDEFINITIONSIMPLEREF <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueSimpleDefinitionImpl extends EObjectImpl implements AttributeValueSimpleDefinition {
    /**
     * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected int booleans = 0;

    /**
     * The default value of the '{@link #getATTRIBUTEDEFINITIONSIMPLEREF() <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getATTRIBUTEDEFINITIONSIMPLEREF()
     * @generated
     * @ordered
     */
    protected static final String ATTRIBUTEDEFINITIONSIMPLEREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getATTRIBUTEDEFINITIONSIMPLEREF() <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getATTRIBUTEDEFINITIONSIMPLEREF()
     * @generated
     * @ordered
     */
    protected String aTTRIBUTEDEFINITIONSIMPLEREF = ATTRIBUTEDEFINITIONSIMPLEREF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeValueSimpleDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return RifPackage.Literals.ATTRIBUTE_VALUE_SIMPLE_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getATTRIBUTEDEFINITIONSIMPLEREF() {
        return aTTRIBUTEDEFINITIONSIMPLEREF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setATTRIBUTEDEFINITIONSIMPLEREF( String newATTRIBUTEDEFINITIONSIMPLEREF ) {
        String oldATTRIBUTEDEFINITIONSIMPLEREF = aTTRIBUTEDEFINITIONSIMPLEREF;
        aTTRIBUTEDEFINITIONSIMPLEREF = newATTRIBUTEDEFINITIONSIMPLEREF;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            RifPackage.ATTRIBUTE_VALUE_SIMPLE_DEFINITION__ATTRIBUTEDEFINITIONSIMPLEREF,
            oldATTRIBUTEDEFINITIONSIMPLEREF,
            aTTRIBUTEDEFINITIONSIMPLEREF ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_VALUE_SIMPLE_DEFINITION__ATTRIBUTEDEFINITIONSIMPLEREF:
            return getATTRIBUTEDEFINITIONSIMPLEREF();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_VALUE_SIMPLE_DEFINITION__ATTRIBUTEDEFINITIONSIMPLEREF:
            setATTRIBUTEDEFINITIONSIMPLEREF( (String)newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset( int featureID ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_VALUE_SIMPLE_DEFINITION__ATTRIBUTEDEFINITIONSIMPLEREF:
            setATTRIBUTEDEFINITIONSIMPLEREF( ATTRIBUTEDEFINITIONSIMPLEREF_EDEFAULT );
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet( int featureID ) {
        switch (featureID) {
        case RifPackage.ATTRIBUTE_VALUE_SIMPLE_DEFINITION__ATTRIBUTEDEFINITIONSIMPLEREF:
            return ATTRIBUTEDEFINITIONSIMPLEREF_EDEFAULT == null
                ? aTTRIBUTEDEFINITIONSIMPLEREF != null
                : !ATTRIBUTEDEFINITIONSIMPLEREF_EDEFAULT.equals( aTTRIBUTEDEFINITIONSIMPLEREF );
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (aTTRIBUTEDEFINITIONSIMPLEREF: " );
        result.append( aTTRIBUTEDEFINITIONSIMPLEREF );
        result.append( ')' );
        return result.toString();
    }

} //AttributeValueSimpleDefinitionImpl
