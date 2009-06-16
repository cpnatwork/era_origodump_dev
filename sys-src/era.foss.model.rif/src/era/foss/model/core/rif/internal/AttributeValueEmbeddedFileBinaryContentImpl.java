/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.AttributeValueEmbeddedFileBinaryContent;
import era.foss.model.core.rif.BinaryContent;
import era.foss.model.core.rif.RifPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Embedded File Binary Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.AttributeValueEmbeddedFileBinaryContentImpl#getBINARYCONTENT <em>BINARYCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueEmbeddedFileBinaryContentImpl extends EObjectImpl
		implements AttributeValueEmbeddedFileBinaryContent {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int booleans = 0;

	/**
	 * The cached value of the '{@link #getBINARYCONTENT() <em>BINARYCONTENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBINARYCONTENT()
	 * @generated
	 * @ordered
	 */
	protected BinaryContent bINARYCONTENT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueEmbeddedFileBinaryContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryContent getBINARYCONTENT() {
		return bINARYCONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBINARYCONTENT(
			BinaryContent newBINARYCONTENT, NotificationChain msgs) {
		BinaryContent oldBINARYCONTENT = bINARYCONTENT;
		bINARYCONTENT = newBINARYCONTENT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT__BINARYCONTENT,
					oldBINARYCONTENT, newBINARYCONTENT);
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
	public void setBINARYCONTENT(BinaryContent newBINARYCONTENT) {
		if (newBINARYCONTENT != bINARYCONTENT) {
			NotificationChain msgs = null;
			if (bINARYCONTENT != null)
				msgs = ((InternalEObject) bINARYCONTENT)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT__BINARYCONTENT,
								null, msgs);
			if (newBINARYCONTENT != null)
				msgs = ((InternalEObject) newBINARYCONTENT)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT__BINARYCONTENT,
								null, msgs);
			msgs = basicSetBINARYCONTENT(newBINARYCONTENT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT__BINARYCONTENT,
					newBINARYCONTENT, newBINARYCONTENT));
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
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT__BINARYCONTENT:
			return basicSetBINARYCONTENT(null, msgs);
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
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT__BINARYCONTENT:
			return getBINARYCONTENT();
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
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT__BINARYCONTENT:
			setBINARYCONTENT((BinaryContent) newValue);
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
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT__BINARYCONTENT:
			setBINARYCONTENT((BinaryContent) null);
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
		case RifPackage.ATTRIBUTE_VALUE_EMBEDDED_FILE_BINARY_CONTENT__BINARYCONTENT:
			return bINARYCONTENT != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeValueEmbeddedFileBinaryContentImpl
