/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.EmbeddedValue;
import era.foss.model.core.rif.Properties;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.PropertiesImpl#getEMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertiesImpl extends EObjectImpl implements Properties {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int booleans = 0;

	/**
	 * The cached value of the '{@link #getEMBEDDEDVALUE() <em>EMBEDDEDVALUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMBEDDEDVALUE()
	 * @generated
	 * @ordered
	 */
	protected EmbeddedValue eMBEDDEDVALUE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedValue getEMBEDDEDVALUE() {
		return eMBEDDEDVALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEMBEDDEDVALUE(
			EmbeddedValue newEMBEDDEDVALUE, NotificationChain msgs) {
		EmbeddedValue oldEMBEDDEDVALUE = eMBEDDEDVALUE;
		eMBEDDEDVALUE = newEMBEDDEDVALUE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.PROPERTIES__EMBEDDEDVALUE,
					oldEMBEDDEDVALUE, newEMBEDDEDVALUE);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEMBEDDEDVALUE(EmbeddedValue newEMBEDDEDVALUE) {
		if (newEMBEDDEDVALUE != eMBEDDEDVALUE) {
			NotificationChain msgs = null;
			if (eMBEDDEDVALUE != null)
				msgs = ((InternalEObject) eMBEDDEDVALUE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.PROPERTIES__EMBEDDEDVALUE, null,
						msgs);
			if (newEMBEDDEDVALUE != null)
				msgs = ((InternalEObject) newEMBEDDEDVALUE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.PROPERTIES__EMBEDDEDVALUE, null,
						msgs);
			msgs = basicSetEMBEDDEDVALUE(newEMBEDDEDVALUE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.PROPERTIES__EMBEDDEDVALUE, newEMBEDDEDVALUE,
					newEMBEDDEDVALUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RifPackage.PROPERTIES__EMBEDDEDVALUE:
			return basicSetEMBEDDEDVALUE(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RifPackage.PROPERTIES__EMBEDDEDVALUE:
			return getEMBEDDEDVALUE();
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
		case RifPackage.PROPERTIES__EMBEDDEDVALUE:
			setEMBEDDEDVALUE((EmbeddedValue) newValue);
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
		case RifPackage.PROPERTIES__EMBEDDEDVALUE:
			setEMBEDDEDVALUE((EmbeddedValue) null);
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
		case RifPackage.PROPERTIES__EMBEDDEDVALUE:
			return eMBEDDEDVALUE != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertiesImpl
