/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeDefinitionSimpleType;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionSimpleTypeImpl#getDATATYPEDEFINITIONBOOLEANREF <em>DATATYPEDEFINITIONBOOLEANREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionSimpleTypeImpl#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionSimpleTypeImpl#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeDefinitionSimpleTypeImpl#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionSimpleTypeImpl extends EObjectImpl implements
		AttributeDefinitionSimpleType {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int booleans = 0;

	/**
	 * The default value of the '{@link #getDATATYPEDEFINITIONBOOLEANREF() <em>DATATYPEDEFINITIONBOOLEANREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONBOOLEANREF()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPEDEFINITIONBOOLEANREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONBOOLEANREF() <em>DATATYPEDEFINITIONBOOLEANREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONBOOLEANREF()
	 * @generated
	 * @ordered
	 */
	protected String dATATYPEDEFINITIONBOOLEANREF = DATATYPEDEFINITIONBOOLEANREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDATATYPEDEFINITIONINTEGERREF() <em>DATATYPEDEFINITIONINTEGERREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONINTEGERREF()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPEDEFINITIONINTEGERREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONINTEGERREF() <em>DATATYPEDEFINITIONINTEGERREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONINTEGERREF()
	 * @generated
	 * @ordered
	 */
	protected String dATATYPEDEFINITIONINTEGERREF = DATATYPEDEFINITIONINTEGERREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDATATYPEDEFINITIONREALREF() <em>DATATYPEDEFINITIONREALREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONREALREF()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPEDEFINITIONREALREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONREALREF() <em>DATATYPEDEFINITIONREALREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONREALREF()
	 * @generated
	 * @ordered
	 */
	protected String dATATYPEDEFINITIONREALREF = DATATYPEDEFINITIONREALREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDATATYPEDEFINITIONSTRINGREF() <em>DATATYPEDEFINITIONSTRINGREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONSTRINGREF()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPEDEFINITIONSTRINGREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONSTRINGREF() <em>DATATYPEDEFINITIONSTRINGREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONSTRINGREF()
	 * @generated
	 * @ordered
	 */
	protected String dATATYPEDEFINITIONSTRINGREF = DATATYPEDEFINITIONSTRINGREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionSimpleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTE_DEFINITION_SIMPLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDATATYPEDEFINITIONBOOLEANREF() {
		return dATATYPEDEFINITIONBOOLEANREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONBOOLEANREF(
			String newDATATYPEDEFINITIONBOOLEANREF) {
		String oldDATATYPEDEFINITIONBOOLEANREF = dATATYPEDEFINITIONBOOLEANREF;
		dATATYPEDEFINITIONBOOLEANREF = newDATATYPEDEFINITIONBOOLEANREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONBOOLEANREF,
					oldDATATYPEDEFINITIONBOOLEANREF,
					dATATYPEDEFINITIONBOOLEANREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDATATYPEDEFINITIONINTEGERREF() {
		return dATATYPEDEFINITIONINTEGERREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONINTEGERREF(
			String newDATATYPEDEFINITIONINTEGERREF) {
		String oldDATATYPEDEFINITIONINTEGERREF = dATATYPEDEFINITIONINTEGERREF;
		dATATYPEDEFINITIONINTEGERREF = newDATATYPEDEFINITIONINTEGERREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONINTEGERREF,
					oldDATATYPEDEFINITIONINTEGERREF,
					dATATYPEDEFINITIONINTEGERREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDATATYPEDEFINITIONREALREF() {
		return dATATYPEDEFINITIONREALREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONREALREF(String newDATATYPEDEFINITIONREALREF) {
		String oldDATATYPEDEFINITIONREALREF = dATATYPEDEFINITIONREALREF;
		dATATYPEDEFINITIONREALREF = newDATATYPEDEFINITIONREALREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONREALREF,
					oldDATATYPEDEFINITIONREALREF, dATATYPEDEFINITIONREALREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDATATYPEDEFINITIONSTRINGREF() {
		return dATATYPEDEFINITIONSTRINGREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONSTRINGREF(
			String newDATATYPEDEFINITIONSTRINGREF) {
		String oldDATATYPEDEFINITIONSTRINGREF = dATATYPEDEFINITIONSTRINGREF;
		dATATYPEDEFINITIONSTRINGREF = newDATATYPEDEFINITIONSTRINGREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONSTRINGREF,
					oldDATATYPEDEFINITIONSTRINGREF, dATATYPEDEFINITIONSTRINGREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONBOOLEANREF:
			return getDATATYPEDEFINITIONBOOLEANREF();
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONINTEGERREF:
			return getDATATYPEDEFINITIONINTEGERREF();
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONREALREF:
			return getDATATYPEDEFINITIONREALREF();
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONSTRINGREF:
			return getDATATYPEDEFINITIONSTRINGREF();
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
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONBOOLEANREF:
			setDATATYPEDEFINITIONBOOLEANREF((String) newValue);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONINTEGERREF:
			setDATATYPEDEFINITIONINTEGERREF((String) newValue);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONREALREF:
			setDATATYPEDEFINITIONREALREF((String) newValue);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONSTRINGREF:
			setDATATYPEDEFINITIONSTRINGREF((String) newValue);
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
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONBOOLEANREF:
			setDATATYPEDEFINITIONBOOLEANREF(DATATYPEDEFINITIONBOOLEANREF_EDEFAULT);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONINTEGERREF:
			setDATATYPEDEFINITIONINTEGERREF(DATATYPEDEFINITIONINTEGERREF_EDEFAULT);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONREALREF:
			setDATATYPEDEFINITIONREALREF(DATATYPEDEFINITIONREALREF_EDEFAULT);
			return;
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONSTRINGREF:
			setDATATYPEDEFINITIONSTRINGREF(DATATYPEDEFINITIONSTRINGREF_EDEFAULT);
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
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONBOOLEANREF:
			return DATATYPEDEFINITIONBOOLEANREF_EDEFAULT == null ? dATATYPEDEFINITIONBOOLEANREF != null
					: !DATATYPEDEFINITIONBOOLEANREF_EDEFAULT
							.equals(dATATYPEDEFINITIONBOOLEANREF);
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONINTEGERREF:
			return DATATYPEDEFINITIONINTEGERREF_EDEFAULT == null ? dATATYPEDEFINITIONINTEGERREF != null
					: !DATATYPEDEFINITIONINTEGERREF_EDEFAULT
							.equals(dATATYPEDEFINITIONINTEGERREF);
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONREALREF:
			return DATATYPEDEFINITIONREALREF_EDEFAULT == null ? dATATYPEDEFINITIONREALREF != null
					: !DATATYPEDEFINITIONREALREF_EDEFAULT
							.equals(dATATYPEDEFINITIONREALREF);
		case RifPackage.ATTRIBUTE_DEFINITION_SIMPLE_TYPE__DATATYPEDEFINITIONSTRINGREF:
			return DATATYPEDEFINITIONSTRINGREF_EDEFAULT == null ? dATATYPEDEFINITIONSTRINGREF != null
					: !DATATYPEDEFINITIONSTRINGREF_EDEFAULT
							.equals(dATATYPEDEFINITIONSTRINGREF);
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
		result.append(" (dATATYPEDEFINITIONBOOLEANREF: "); //$NON-NLS-1$
		result.append(dATATYPEDEFINITIONBOOLEANREF);
		result.append(", dATATYPEDEFINITIONINTEGERREF: "); //$NON-NLS-1$
		result.append(dATATYPEDEFINITIONINTEGERREF);
		result.append(", dATATYPEDEFINITIONREALREF: "); //$NON-NLS-1$
		result.append(dATATYPEDEFINITIONREALREF);
		result.append(", dATATYPEDEFINITIONSTRINGREF: "); //$NON-NLS-1$
		result.append(dATATYPEDEFINITIONSTRINGREF);
		result.append(')');
		return result.toString();
	}

} //AttributeDefinitionSimpleTypeImpl
