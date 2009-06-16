/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValueEnumerationDefinition;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Enumeration Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEnumerationDefinitionImpl#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueEnumerationDefinitionImpl extends EObjectImpl
		implements AttributeValueEnumerationDefinition {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int booleans = 0;

	/**
	 * The default value of the '{@link #getATTRIBUTEDEFINITIONENUMERATIONREF() <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTEDEFINITIONENUMERATIONREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONENUMERATIONREF() <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @generated
	 * @ordered
	 */
	protected String aTTRIBUTEDEFINITIONENUMERATIONREF = ATTRIBUTEDEFINITIONENUMERATIONREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueEnumerationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTE_VALUE_ENUMERATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getATTRIBUTEDEFINITIONENUMERATIONREF() {
		return aTTRIBUTEDEFINITIONENUMERATIONREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONENUMERATIONREF(
			String newATTRIBUTEDEFINITIONENUMERATIONREF) {
		String oldATTRIBUTEDEFINITIONENUMERATIONREF = aTTRIBUTEDEFINITIONENUMERATIONREF;
		aTTRIBUTEDEFINITIONENUMERATIONREF = newATTRIBUTEDEFINITIONENUMERATIONREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_VALUE_ENUMERATION_DEFINITION__ATTRIBUTEDEFINITIONENUMERATIONREF,
					oldATTRIBUTEDEFINITIONENUMERATIONREF,
					aTTRIBUTEDEFINITIONENUMERATIONREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_VALUE_ENUMERATION_DEFINITION__ATTRIBUTEDEFINITIONENUMERATIONREF:
			return getATTRIBUTEDEFINITIONENUMERATIONREF();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_VALUE_ENUMERATION_DEFINITION__ATTRIBUTEDEFINITIONENUMERATIONREF:
			setATTRIBUTEDEFINITIONENUMERATIONREF((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_VALUE_ENUMERATION_DEFINITION__ATTRIBUTEDEFINITIONENUMERATIONREF:
			setATTRIBUTEDEFINITIONENUMERATIONREF(ATTRIBUTEDEFINITIONENUMERATIONREF_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_VALUE_ENUMERATION_DEFINITION__ATTRIBUTEDEFINITIONENUMERATIONREF:
			return ATTRIBUTEDEFINITIONENUMERATIONREF_EDEFAULT == null ? aTTRIBUTEDEFINITIONENUMERATIONREF != null
					: !ATTRIBUTEDEFINITIONENUMERATIONREF_EDEFAULT
							.equals(aTTRIBUTEDEFINITIONENUMERATIONREF);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (aTTRIBUTEDEFINITIONENUMERATIONREF: "); //$NON-NLS-1$
		result.append(aTTRIBUTEDEFINITIONENUMERATIONREF);
		result.append(')');
		return result.toString();
	}

} //AttributeValueEnumerationDefinitionImpl
