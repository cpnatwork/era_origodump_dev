/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValueEmbeddedDocument;
import era.foss.model.core.rif.DefaultValue3;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Value3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.DefaultValue3Impl#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultValue3Impl extends EObjectImpl implements DefaultValue3 {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int booleans = 0;

	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUEEMBEDDEDDOCUMENT() <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @generated
	 * @ordered
	 */
	protected AttributeValueEmbeddedDocument aTTRIBUTEVALUEEMBEDDEDDOCUMENT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultValue3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.DEFAULT_VALUE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueEmbeddedDocument getATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
		return aTTRIBUTEVALUEEMBEDDEDDOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUEEMBEDDEDDOCUMENT(
			AttributeValueEmbeddedDocument newATTRIBUTEVALUEEMBEDDEDDOCUMENT,
			NotificationChain msgs) {
		AttributeValueEmbeddedDocument oldATTRIBUTEVALUEEMBEDDEDDOCUMENT = aTTRIBUTEVALUEEMBEDDEDDOCUMENT;
		aTTRIBUTEVALUEEMBEDDEDDOCUMENT = newATTRIBUTEVALUEEMBEDDEDDOCUMENT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					RifPackage.DEFAULT_VALUE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT,
					oldATTRIBUTEVALUEEMBEDDEDDOCUMENT,
					newATTRIBUTEVALUEEMBEDDEDDOCUMENT);
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
	public void setATTRIBUTEVALUEEMBEDDEDDOCUMENT(
			AttributeValueEmbeddedDocument newATTRIBUTEVALUEEMBEDDEDDOCUMENT) {
		if (newATTRIBUTEVALUEEMBEDDEDDOCUMENT != aTTRIBUTEVALUEEMBEDDEDDOCUMENT) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUEEMBEDDEDDOCUMENT != null)
				msgs = ((InternalEObject) aTTRIBUTEVALUEEMBEDDEDDOCUMENT)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.DEFAULT_VALUE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT,
								null, msgs);
			if (newATTRIBUTEVALUEEMBEDDEDDOCUMENT != null)
				msgs = ((InternalEObject) newATTRIBUTEVALUEEMBEDDEDDOCUMENT)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.DEFAULT_VALUE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT,
								null, msgs);
			msgs = basicSetATTRIBUTEVALUEEMBEDDEDDOCUMENT(
					newATTRIBUTEVALUEEMBEDDEDDOCUMENT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.DEFAULT_VALUE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT,
					newATTRIBUTEVALUEEMBEDDEDDOCUMENT,
					newATTRIBUTEVALUEEMBEDDEDDOCUMENT));
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
		case RifPackage.DEFAULT_VALUE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
			return basicSetATTRIBUTEVALUEEMBEDDEDDOCUMENT(null, msgs);
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
		case RifPackage.DEFAULT_VALUE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
			return getATTRIBUTEVALUEEMBEDDEDDOCUMENT();
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
		case RifPackage.DEFAULT_VALUE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
			setATTRIBUTEVALUEEMBEDDEDDOCUMENT((AttributeValueEmbeddedDocument) newValue);
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
		case RifPackage.DEFAULT_VALUE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
			setATTRIBUTEVALUEEMBEDDEDDOCUMENT((AttributeValueEmbeddedDocument) null);
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
		case RifPackage.DEFAULT_VALUE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
			return aTTRIBUTEVALUEEMBEDDEDDOCUMENT != null;
		}
		return super.eIsSet(featureID);
	}

} //DefaultValue3Impl
