/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.TargetGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.TargetGroupImpl#getSPECGROUPREF <em>SPECGROUPREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetGroupImpl extends EObjectImpl implements TargetGroup {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int booleans = 0;

	/**
	 * The default value of the '{@link #getSPECGROUPREF() <em>SPECGROUPREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECGROUPREF()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECGROUPREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPECGROUPREF() <em>SPECGROUPREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECGROUPREF()
	 * @generated
	 * @ordered
	 */
	protected String sPECGROUPREF = SPECGROUPREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.TARGET_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSPECGROUPREF() {
		return sPECGROUPREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECGROUPREF(String newSPECGROUPREF) {
		String oldSPECGROUPREF = sPECGROUPREF;
		sPECGROUPREF = newSPECGROUPREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.TARGET_GROUP__SPECGROUPREF, oldSPECGROUPREF,
					sPECGROUPREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RifPackage.TARGET_GROUP__SPECGROUPREF:
			return getSPECGROUPREF();
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
		case RifPackage.TARGET_GROUP__SPECGROUPREF:
			setSPECGROUPREF((String) newValue);
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
		case RifPackage.TARGET_GROUP__SPECGROUPREF:
			setSPECGROUPREF(SPECGROUPREF_EDEFAULT);
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
		case RifPackage.TARGET_GROUP__SPECGROUPREF:
			return SPECGROUPREF_EDEFAULT == null ? sPECGROUPREF != null
					: !SPECGROUPREF_EDEFAULT.equals(sPECGROUPREF);
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
		result.append(" (sPECGROUPREF: "); //$NON-NLS-1$
		result.append(sPECGROUPREF);
		result.append(')');
		return result.toString();
	}

} //TargetGroupImpl
