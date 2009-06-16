/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.SpecHierarchy;
import era.foss.model.core.rif.SpecHierarchyChildren;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyImpl#getCHILDREN <em>CHILDREN</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyImpl#getOBJECT <em>OBJECT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecHierarchyImpl extends EObjectImpl implements SpecHierarchy {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int booleans = 0;

	/**
	 * The default value of the '{@link #getLONGNAME() <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLONGNAME()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLONGNAME() <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLONGNAME()
	 * @generated
	 * @ordered
	 */
	protected String lONGNAME = LONGNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDESC() <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDESC()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDESC() <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDESC()
	 * @generated
	 * @ordered
	 */
	protected String dESC = DESC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCHILDREN() <em>CHILDREN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCHILDREN()
	 * @generated
	 * @ordered
	 */
	protected SpecHierarchyChildren cHILDREN;

	/**
	 * The default value of the '{@link #getIDENTIFIER() <em>IDENTIFIER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDENTIFIER()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIDENTIFIER() <em>IDENTIFIER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDENTIFIER()
	 * @generated
	 * @ordered
	 */
	protected String iDENTIFIER = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLASTCHANGE() <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLASTCHANGE()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTCHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLASTCHANGE() <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLASTCHANGE()
	 * @generated
	 * @ordered
	 */
	protected String lASTCHANGE = LASTCHANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOBJECT() <em>OBJECT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBJECT()
	 * @generated
	 * @ordered
	 */
	protected era.foss.model.core.rif.Object oBJECT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecHierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.SPEC_HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLONGNAME() {
		return lONGNAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLONGNAME(String newLONGNAME) {
		String oldLONGNAME = lONGNAME;
		lONGNAME = newLONGNAME;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_HIERARCHY__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDESC() {
		return dESC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDESC(String newDESC) {
		String oldDESC = dESC;
		dESC = newDESC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_HIERARCHY__DESC, oldDESC, dESC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecHierarchyChildren getCHILDREN() {
		return cHILDREN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCHILDREN(
			SpecHierarchyChildren newCHILDREN, NotificationChain msgs) {
		SpecHierarchyChildren oldCHILDREN = cHILDREN;
		cHILDREN = newCHILDREN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.SPEC_HIERARCHY__CHILDREN,
					oldCHILDREN, newCHILDREN);
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
	public void setCHILDREN(SpecHierarchyChildren newCHILDREN) {
		if (newCHILDREN != cHILDREN) {
			NotificationChain msgs = null;
			if (cHILDREN != null)
				msgs = ((InternalEObject) cHILDREN).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_HIERARCHY__CHILDREN, null,
						msgs);
			if (newCHILDREN != null)
				msgs = ((InternalEObject) newCHILDREN).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_HIERARCHY__CHILDREN, null,
						msgs);
			msgs = basicSetCHILDREN(newCHILDREN, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_HIERARCHY__CHILDREN, newCHILDREN,
					newCHILDREN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIDENTIFIER() {
		return iDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIDENTIFIER(String newIDENTIFIER) {
		String oldIDENTIFIER = iDENTIFIER;
		iDENTIFIER = newIDENTIFIER;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_HIERARCHY__IDENTIFIER, oldIDENTIFIER,
					iDENTIFIER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLASTCHANGE() {
		return lASTCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLASTCHANGE(String newLASTCHANGE) {
		String oldLASTCHANGE = lASTCHANGE;
		lASTCHANGE = newLASTCHANGE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_HIERARCHY__LASTCHANGE, oldLASTCHANGE,
					lASTCHANGE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public era.foss.model.core.rif.Object getOBJECT() {
		return oBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBJECT(
			era.foss.model.core.rif.Object newOBJECT, NotificationChain msgs) {
		era.foss.model.core.rif.Object oldOBJECT = oBJECT;
		oBJECT = newOBJECT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.SPEC_HIERARCHY__OBJECT,
					oldOBJECT, newOBJECT);
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
	public void setOBJECT(era.foss.model.core.rif.Object newOBJECT) {
		if (newOBJECT != oBJECT) {
			NotificationChain msgs = null;
			if (oBJECT != null)
				msgs = ((InternalEObject) oBJECT)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_HIERARCHY__OBJECT, null, msgs);
			if (newOBJECT != null)
				msgs = ((InternalEObject) newOBJECT)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_HIERARCHY__OBJECT, null, msgs);
			msgs = basicSetOBJECT(newOBJECT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_HIERARCHY__OBJECT, newOBJECT, newOBJECT));
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
		case RifPackage.SPEC_HIERARCHY__CHILDREN:
			return basicSetCHILDREN(null, msgs);
		case RifPackage.SPEC_HIERARCHY__OBJECT:
			return basicSetOBJECT(null, msgs);
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
		case RifPackage.SPEC_HIERARCHY__LONGNAME:
			return getLONGNAME();
		case RifPackage.SPEC_HIERARCHY__DESC:
			return getDESC();
		case RifPackage.SPEC_HIERARCHY__CHILDREN:
			return getCHILDREN();
		case RifPackage.SPEC_HIERARCHY__IDENTIFIER:
			return getIDENTIFIER();
		case RifPackage.SPEC_HIERARCHY__LASTCHANGE:
			return getLASTCHANGE();
		case RifPackage.SPEC_HIERARCHY__OBJECT:
			return getOBJECT();
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
		case RifPackage.SPEC_HIERARCHY__LONGNAME:
			setLONGNAME((String) newValue);
			return;
		case RifPackage.SPEC_HIERARCHY__DESC:
			setDESC((String) newValue);
			return;
		case RifPackage.SPEC_HIERARCHY__CHILDREN:
			setCHILDREN((SpecHierarchyChildren) newValue);
			return;
		case RifPackage.SPEC_HIERARCHY__IDENTIFIER:
			setIDENTIFIER((String) newValue);
			return;
		case RifPackage.SPEC_HIERARCHY__LASTCHANGE:
			setLASTCHANGE((String) newValue);
			return;
		case RifPackage.SPEC_HIERARCHY__OBJECT:
			setOBJECT((era.foss.model.core.rif.Object) newValue);
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
		case RifPackage.SPEC_HIERARCHY__LONGNAME:
			setLONGNAME(LONGNAME_EDEFAULT);
			return;
		case RifPackage.SPEC_HIERARCHY__DESC:
			setDESC(DESC_EDEFAULT);
			return;
		case RifPackage.SPEC_HIERARCHY__CHILDREN:
			setCHILDREN((SpecHierarchyChildren) null);
			return;
		case RifPackage.SPEC_HIERARCHY__IDENTIFIER:
			setIDENTIFIER(IDENTIFIER_EDEFAULT);
			return;
		case RifPackage.SPEC_HIERARCHY__LASTCHANGE:
			setLASTCHANGE(LASTCHANGE_EDEFAULT);
			return;
		case RifPackage.SPEC_HIERARCHY__OBJECT:
			setOBJECT((era.foss.model.core.rif.Object) null);
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
		case RifPackage.SPEC_HIERARCHY__LONGNAME:
			return LONGNAME_EDEFAULT == null ? lONGNAME != null
					: !LONGNAME_EDEFAULT.equals(lONGNAME);
		case RifPackage.SPEC_HIERARCHY__DESC:
			return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT
					.equals(dESC);
		case RifPackage.SPEC_HIERARCHY__CHILDREN:
			return cHILDREN != null;
		case RifPackage.SPEC_HIERARCHY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null
					: !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
		case RifPackage.SPEC_HIERARCHY__LASTCHANGE:
			return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null
					: !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
		case RifPackage.SPEC_HIERARCHY__OBJECT:
			return oBJECT != null;
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
		result.append(" (lONGNAME: "); //$NON-NLS-1$
		result.append(lONGNAME);
		result.append(", dESC: "); //$NON-NLS-1$
		result.append(dESC);
		result.append(", iDENTIFIER: "); //$NON-NLS-1$
		result.append(iDENTIFIER);
		result.append(", lASTCHANGE: "); //$NON-NLS-1$
		result.append(lASTCHANGE);
		result.append(')');
		return result.toString();
	}

} //SpecHierarchyImpl
