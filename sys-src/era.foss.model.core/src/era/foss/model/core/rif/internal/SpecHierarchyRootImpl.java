/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.SpecHierarchyRoot;
import era.foss.model.core.rif.SpecHierarchyRootChildren;
import era.foss.model.core.rif.SpecHierarchyRootType;
import era.foss.model.core.rif.SpecHierarchyRootValues;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Hierarchy Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyRootImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyRootImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyRootImpl#getCHILDREN <em>CHILDREN</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyRootImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyRootImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyRootImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecHierarchyRootImpl#getVALUES <em>VALUES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecHierarchyRootImpl extends EObjectImpl implements
		SpecHierarchyRoot {
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
	protected SpecHierarchyRootChildren cHILDREN;

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
	 * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE()
	 * @generated
	 * @ordered
	 */
	protected SpecHierarchyRootType tYPE;

	/**
	 * The cached value of the '{@link #getVALUES() <em>VALUES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVALUES()
	 * @generated
	 * @ordered
	 */
	protected SpecHierarchyRootValues vALUES;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecHierarchyRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.SPEC_HIERARCHY_ROOT;
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
					RifPackage.SPEC_HIERARCHY_ROOT__LONGNAME, oldLONGNAME,
					lONGNAME));
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
					RifPackage.SPEC_HIERARCHY_ROOT__DESC, oldDESC, dESC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecHierarchyRootChildren getCHILDREN() {
		return cHILDREN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCHILDREN(
			SpecHierarchyRootChildren newCHILDREN, NotificationChain msgs) {
		SpecHierarchyRootChildren oldCHILDREN = cHILDREN;
		cHILDREN = newCHILDREN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.SPEC_HIERARCHY_ROOT__CHILDREN,
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
	public void setCHILDREN(SpecHierarchyRootChildren newCHILDREN) {
		if (newCHILDREN != cHILDREN) {
			NotificationChain msgs = null;
			if (cHILDREN != null)
				msgs = ((InternalEObject) cHILDREN).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_HIERARCHY_ROOT__CHILDREN,
						null, msgs);
			if (newCHILDREN != null)
				msgs = ((InternalEObject) newCHILDREN).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_HIERARCHY_ROOT__CHILDREN,
						null, msgs);
			msgs = basicSetCHILDREN(newCHILDREN, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_HIERARCHY_ROOT__CHILDREN, newCHILDREN,
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
					RifPackage.SPEC_HIERARCHY_ROOT__IDENTIFIER, oldIDENTIFIER,
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
					RifPackage.SPEC_HIERARCHY_ROOT__LASTCHANGE, oldLASTCHANGE,
					lASTCHANGE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecHierarchyRootType getTYPE() {
		return tYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTYPE(SpecHierarchyRootType newTYPE,
			NotificationChain msgs) {
		SpecHierarchyRootType oldTYPE = tYPE;
		tYPE = newTYPE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.SPEC_HIERARCHY_ROOT__TYPE,
					oldTYPE, newTYPE);
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
	public void setTYPE(SpecHierarchyRootType newTYPE) {
		if (newTYPE != tYPE) {
			NotificationChain msgs = null;
			if (tYPE != null)
				msgs = ((InternalEObject) tYPE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_HIERARCHY_ROOT__TYPE, null,
						msgs);
			if (newTYPE != null)
				msgs = ((InternalEObject) newTYPE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_HIERARCHY_ROOT__TYPE, null,
						msgs);
			msgs = basicSetTYPE(newTYPE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_HIERARCHY_ROOT__TYPE, newTYPE, newTYPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecHierarchyRootValues getVALUES() {
		return vALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVALUES(SpecHierarchyRootValues newVALUES,
			NotificationChain msgs) {
		SpecHierarchyRootValues oldVALUES = vALUES;
		vALUES = newVALUES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.SPEC_HIERARCHY_ROOT__VALUES,
					oldVALUES, newVALUES);
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
	public void setVALUES(SpecHierarchyRootValues newVALUES) {
		if (newVALUES != vALUES) {
			NotificationChain msgs = null;
			if (vALUES != null)
				msgs = ((InternalEObject) vALUES).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_HIERARCHY_ROOT__VALUES, null,
						msgs);
			if (newVALUES != null)
				msgs = ((InternalEObject) newVALUES).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_HIERARCHY_ROOT__VALUES, null,
						msgs);
			msgs = basicSetVALUES(newVALUES, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_HIERARCHY_ROOT__VALUES, newVALUES,
					newVALUES));
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
		case RifPackage.SPEC_HIERARCHY_ROOT__CHILDREN:
			return basicSetCHILDREN(null, msgs);
		case RifPackage.SPEC_HIERARCHY_ROOT__TYPE:
			return basicSetTYPE(null, msgs);
		case RifPackage.SPEC_HIERARCHY_ROOT__VALUES:
			return basicSetVALUES(null, msgs);
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
		case RifPackage.SPEC_HIERARCHY_ROOT__LONGNAME:
			return getLONGNAME();
		case RifPackage.SPEC_HIERARCHY_ROOT__DESC:
			return getDESC();
		case RifPackage.SPEC_HIERARCHY_ROOT__CHILDREN:
			return getCHILDREN();
		case RifPackage.SPEC_HIERARCHY_ROOT__IDENTIFIER:
			return getIDENTIFIER();
		case RifPackage.SPEC_HIERARCHY_ROOT__LASTCHANGE:
			return getLASTCHANGE();
		case RifPackage.SPEC_HIERARCHY_ROOT__TYPE:
			return getTYPE();
		case RifPackage.SPEC_HIERARCHY_ROOT__VALUES:
			return getVALUES();
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
		case RifPackage.SPEC_HIERARCHY_ROOT__LONGNAME:
			setLONGNAME((String) newValue);
			return;
		case RifPackage.SPEC_HIERARCHY_ROOT__DESC:
			setDESC((String) newValue);
			return;
		case RifPackage.SPEC_HIERARCHY_ROOT__CHILDREN:
			setCHILDREN((SpecHierarchyRootChildren) newValue);
			return;
		case RifPackage.SPEC_HIERARCHY_ROOT__IDENTIFIER:
			setIDENTIFIER((String) newValue);
			return;
		case RifPackage.SPEC_HIERARCHY_ROOT__LASTCHANGE:
			setLASTCHANGE((String) newValue);
			return;
		case RifPackage.SPEC_HIERARCHY_ROOT__TYPE:
			setTYPE((SpecHierarchyRootType) newValue);
			return;
		case RifPackage.SPEC_HIERARCHY_ROOT__VALUES:
			setVALUES((SpecHierarchyRootValues) newValue);
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
		case RifPackage.SPEC_HIERARCHY_ROOT__LONGNAME:
			setLONGNAME(LONGNAME_EDEFAULT);
			return;
		case RifPackage.SPEC_HIERARCHY_ROOT__DESC:
			setDESC(DESC_EDEFAULT);
			return;
		case RifPackage.SPEC_HIERARCHY_ROOT__CHILDREN:
			setCHILDREN((SpecHierarchyRootChildren) null);
			return;
		case RifPackage.SPEC_HIERARCHY_ROOT__IDENTIFIER:
			setIDENTIFIER(IDENTIFIER_EDEFAULT);
			return;
		case RifPackage.SPEC_HIERARCHY_ROOT__LASTCHANGE:
			setLASTCHANGE(LASTCHANGE_EDEFAULT);
			return;
		case RifPackage.SPEC_HIERARCHY_ROOT__TYPE:
			setTYPE((SpecHierarchyRootType) null);
			return;
		case RifPackage.SPEC_HIERARCHY_ROOT__VALUES:
			setVALUES((SpecHierarchyRootValues) null);
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
		case RifPackage.SPEC_HIERARCHY_ROOT__LONGNAME:
			return LONGNAME_EDEFAULT == null ? lONGNAME != null
					: !LONGNAME_EDEFAULT.equals(lONGNAME);
		case RifPackage.SPEC_HIERARCHY_ROOT__DESC:
			return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT
					.equals(dESC);
		case RifPackage.SPEC_HIERARCHY_ROOT__CHILDREN:
			return cHILDREN != null;
		case RifPackage.SPEC_HIERARCHY_ROOT__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null
					: !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
		case RifPackage.SPEC_HIERARCHY_ROOT__LASTCHANGE:
			return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null
					: !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
		case RifPackage.SPEC_HIERARCHY_ROOT__TYPE:
			return tYPE != null;
		case RifPackage.SPEC_HIERARCHY_ROOT__VALUES:
			return vALUES != null;
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

} //SpecHierarchyRootImpl
