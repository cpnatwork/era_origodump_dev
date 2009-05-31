/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeDefinitionEnumerationType;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionEnumerationTypeImpl#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionEnumerationTypeImpl extends EObjectImpl
		implements AttributeDefinitionEnumerationType {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int booleans = 0;

	/**
	 * The default value of the '{@link #getDATATYPEDEFINITIONENUMERATIONREF() <em>DATATYPEDEFINITIONENUMERATIONREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONENUMERATIONREF()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPEDEFINITIONENUMERATIONREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONENUMERATIONREF() <em>DATATYPEDEFINITIONENUMERATIONREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONENUMERATIONREF()
	 * @generated
	 * @ordered
	 */
	protected String dATATYPEDEFINITIONENUMERATIONREF = DATATYPEDEFINITIONENUMERATIONREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionEnumerationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTE_DEFINITION_ENUMERATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDATATYPEDEFINITIONENUMERATIONREF() {
		return dATATYPEDEFINITIONENUMERATIONREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONENUMERATIONREF(
			String newDATATYPEDEFINITIONENUMERATIONREF) {
		String oldDATATYPEDEFINITIONENUMERATIONREF = dATATYPEDEFINITIONENUMERATIONREF;
		dATATYPEDEFINITIONENUMERATIONREF = newDATATYPEDEFINITIONENUMERATIONREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_TYPE__DATATYPEDEFINITIONENUMERATIONREF,
					oldDATATYPEDEFINITIONENUMERATIONREF,
					dATATYPEDEFINITIONENUMERATIONREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_TYPE__DATATYPEDEFINITIONENUMERATIONREF:
			return getDATATYPEDEFINITIONENUMERATIONREF();
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_TYPE__DATATYPEDEFINITIONENUMERATIONREF:
			setDATATYPEDEFINITIONENUMERATIONREF((String) newValue);
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_TYPE__DATATYPEDEFINITIONENUMERATIONREF:
			setDATATYPEDEFINITIONENUMERATIONREF(DATATYPEDEFINITIONENUMERATIONREF_EDEFAULT);
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
		case RifPackage.ATTRIBUTE_DEFINITION_ENUMERATION_TYPE__DATATYPEDEFINITIONENUMERATIONREF:
			return DATATYPEDEFINITIONENUMERATIONREF_EDEFAULT == null ? dATATYPEDEFINITIONENUMERATIONREF != null
					: !DATATYPEDEFINITIONENUMERATIONREF_EDEFAULT
							.equals(dATATYPEDEFINITIONENUMERATIONREF);
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
		result.append(" (dATATYPEDEFINITIONENUMERATIONREF: "); //$NON-NLS-1$
		result.append(dATATYPEDEFINITIONENUMERATIONREF);
		result.append(')');
		return result.toString();
	}

} //AttributeDefinitionEnumerationTypeImpl
