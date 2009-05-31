/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValueFileReferenceDefinition;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value File Reference Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueFileReferenceDefinitionImpl#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueFileReferenceDefinitionImpl extends EObjectImpl
		implements AttributeValueFileReferenceDefinition {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int booleans = 0;

	/**
	 * The default value of the '{@link #getATTRIBUTEDEFINITIONCOMPLEXREF() <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTEDEFINITIONCOMPLEXREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONCOMPLEXREF() <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @generated
	 * @ordered
	 */
	protected String aTTRIBUTEDEFINITIONCOMPLEXREF = ATTRIBUTEDEFINITIONCOMPLEXREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueFileReferenceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getATTRIBUTEDEFINITIONCOMPLEXREF() {
		return aTTRIBUTEDEFINITIONCOMPLEXREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONCOMPLEXREF(
			String newATTRIBUTEDEFINITIONCOMPLEXREF) {
		String oldATTRIBUTEDEFINITIONCOMPLEXREF = aTTRIBUTEDEFINITIONCOMPLEXREF;
		aTTRIBUTEDEFINITIONCOMPLEXREF = newATTRIBUTEDEFINITIONCOMPLEXREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF,
					oldATTRIBUTEDEFINITIONCOMPLEXREF,
					aTTRIBUTEDEFINITIONCOMPLEXREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RifPackage.ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF:
			return getATTRIBUTEDEFINITIONCOMPLEXREF();
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
		case RifPackage.ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF:
			setATTRIBUTEDEFINITIONCOMPLEXREF((String) newValue);
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
		case RifPackage.ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF:
			setATTRIBUTEDEFINITIONCOMPLEXREF(ATTRIBUTEDEFINITIONCOMPLEXREF_EDEFAULT);
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
		case RifPackage.ATTRIBUTE_VALUE_FILE_REFERENCE_DEFINITION__ATTRIBUTEDEFINITIONCOMPLEXREF:
			return ATTRIBUTEDEFINITIONCOMPLEXREF_EDEFAULT == null ? aTTRIBUTEDEFINITIONCOMPLEXREF != null
					: !ATTRIBUTEDEFINITIONCOMPLEXREF_EDEFAULT
							.equals(aTTRIBUTEDEFINITIONCOMPLEXREF);
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
		result.append(" (aTTRIBUTEDEFINITIONCOMPLEXREF: "); //$NON-NLS-1$
		result.append(aTTRIBUTEDEFINITIONCOMPLEXREF);
		result.append(')');
		return result.toString();
	}

} //AttributeValueFileReferenceDefinitionImpl
