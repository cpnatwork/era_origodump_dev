/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.Source;
import era.foss.model.core.rif.SpecRelation;
import era.foss.model.core.rif.SpecRelationType;
import era.foss.model.core.rif.SpecRelationValues;
import era.foss.model.core.rif.Target;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationImpl#getSOURCE <em>SOURCE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationImpl#getTARGET <em>TARGET</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.SpecRelationImpl#getVALUES <em>VALUES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecRelationImpl extends EObjectImpl implements SpecRelation {
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
	 * The cached value of the '{@link #getSOURCE() <em>SOURCE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOURCE()
	 * @generated
	 * @ordered
	 */
	protected Source sOURCE;

	/**
	 * The cached value of the '{@link #getTARGET() <em>TARGET</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTARGET()
	 * @generated
	 * @ordered
	 */
	protected Target tARGET;

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
	protected SpecRelationType tYPE;

	/**
	 * The cached value of the '{@link #getVALUES() <em>VALUES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVALUES()
	 * @generated
	 * @ordered
	 */
	protected SpecRelationValues vALUES;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.SPEC_RELATION;
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
					RifPackage.SPEC_RELATION__LONGNAME, oldLONGNAME, lONGNAME));
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
					RifPackage.SPEC_RELATION__DESC, oldDESC, dESC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSOURCE() {
		return sOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSOURCE(Source newSOURCE,
			NotificationChain msgs) {
		Source oldSOURCE = sOURCE;
		sOURCE = newSOURCE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.SPEC_RELATION__SOURCE,
					oldSOURCE, newSOURCE);
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
	public void setSOURCE(Source newSOURCE) {
		if (newSOURCE != sOURCE) {
			NotificationChain msgs = null;
			if (sOURCE != null)
				msgs = ((InternalEObject) sOURCE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_RELATION__SOURCE, null, msgs);
			if (newSOURCE != null)
				msgs = ((InternalEObject) newSOURCE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_RELATION__SOURCE, null, msgs);
			msgs = basicSetSOURCE(newSOURCE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_RELATION__SOURCE, newSOURCE, newSOURCE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target getTARGET() {
		return tARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTARGET(Target newTARGET,
			NotificationChain msgs) {
		Target oldTARGET = tARGET;
		tARGET = newTARGET;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.SPEC_RELATION__TARGET,
					oldTARGET, newTARGET);
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
	public void setTARGET(Target newTARGET) {
		if (newTARGET != tARGET) {
			NotificationChain msgs = null;
			if (tARGET != null)
				msgs = ((InternalEObject) tARGET).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_RELATION__TARGET, null, msgs);
			if (newTARGET != null)
				msgs = ((InternalEObject) newTARGET).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_RELATION__TARGET, null, msgs);
			msgs = basicSetTARGET(newTARGET, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_RELATION__TARGET, newTARGET, newTARGET));
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
					RifPackage.SPEC_RELATION__IDENTIFIER, oldIDENTIFIER,
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
					RifPackage.SPEC_RELATION__LASTCHANGE, oldLASTCHANGE,
					lASTCHANGE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecRelationType getTYPE() {
		return tYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTYPE(SpecRelationType newTYPE,
			NotificationChain msgs) {
		SpecRelationType oldTYPE = tYPE;
		tYPE = newTYPE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.SPEC_RELATION__TYPE, oldTYPE,
					newTYPE);
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
	public void setTYPE(SpecRelationType newTYPE) {
		if (newTYPE != tYPE) {
			NotificationChain msgs = null;
			if (tYPE != null)
				msgs = ((InternalEObject) tYPE)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_RELATION__TYPE, null, msgs);
			if (newTYPE != null)
				msgs = ((InternalEObject) newTYPE)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_RELATION__TYPE, null, msgs);
			msgs = basicSetTYPE(newTYPE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_RELATION__TYPE, newTYPE, newTYPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecRelationValues getVALUES() {
		return vALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVALUES(SpecRelationValues newVALUES,
			NotificationChain msgs) {
		SpecRelationValues oldVALUES = vALUES;
		vALUES = newVALUES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.SPEC_RELATION__VALUES,
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
	public void setVALUES(SpecRelationValues newVALUES) {
		if (newVALUES != vALUES) {
			NotificationChain msgs = null;
			if (vALUES != null)
				msgs = ((InternalEObject) vALUES).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_RELATION__VALUES, null, msgs);
			if (newVALUES != null)
				msgs = ((InternalEObject) newVALUES).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.SPEC_RELATION__VALUES, null, msgs);
			msgs = basicSetVALUES(newVALUES, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.SPEC_RELATION__VALUES, newVALUES, newVALUES));
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
		case RifPackage.SPEC_RELATION__SOURCE:
			return basicSetSOURCE(null, msgs);
		case RifPackage.SPEC_RELATION__TARGET:
			return basicSetTARGET(null, msgs);
		case RifPackage.SPEC_RELATION__TYPE:
			return basicSetTYPE(null, msgs);
		case RifPackage.SPEC_RELATION__VALUES:
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
		case RifPackage.SPEC_RELATION__LONGNAME:
			return getLONGNAME();
		case RifPackage.SPEC_RELATION__DESC:
			return getDESC();
		case RifPackage.SPEC_RELATION__SOURCE:
			return getSOURCE();
		case RifPackage.SPEC_RELATION__TARGET:
			return getTARGET();
		case RifPackage.SPEC_RELATION__IDENTIFIER:
			return getIDENTIFIER();
		case RifPackage.SPEC_RELATION__LASTCHANGE:
			return getLASTCHANGE();
		case RifPackage.SPEC_RELATION__TYPE:
			return getTYPE();
		case RifPackage.SPEC_RELATION__VALUES:
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
		case RifPackage.SPEC_RELATION__LONGNAME:
			setLONGNAME((String) newValue);
			return;
		case RifPackage.SPEC_RELATION__DESC:
			setDESC((String) newValue);
			return;
		case RifPackage.SPEC_RELATION__SOURCE:
			setSOURCE((Source) newValue);
			return;
		case RifPackage.SPEC_RELATION__TARGET:
			setTARGET((Target) newValue);
			return;
		case RifPackage.SPEC_RELATION__IDENTIFIER:
			setIDENTIFIER((String) newValue);
			return;
		case RifPackage.SPEC_RELATION__LASTCHANGE:
			setLASTCHANGE((String) newValue);
			return;
		case RifPackage.SPEC_RELATION__TYPE:
			setTYPE((SpecRelationType) newValue);
			return;
		case RifPackage.SPEC_RELATION__VALUES:
			setVALUES((SpecRelationValues) newValue);
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
		case RifPackage.SPEC_RELATION__LONGNAME:
			setLONGNAME(LONGNAME_EDEFAULT);
			return;
		case RifPackage.SPEC_RELATION__DESC:
			setDESC(DESC_EDEFAULT);
			return;
		case RifPackage.SPEC_RELATION__SOURCE:
			setSOURCE((Source) null);
			return;
		case RifPackage.SPEC_RELATION__TARGET:
			setTARGET((Target) null);
			return;
		case RifPackage.SPEC_RELATION__IDENTIFIER:
			setIDENTIFIER(IDENTIFIER_EDEFAULT);
			return;
		case RifPackage.SPEC_RELATION__LASTCHANGE:
			setLASTCHANGE(LASTCHANGE_EDEFAULT);
			return;
		case RifPackage.SPEC_RELATION__TYPE:
			setTYPE((SpecRelationType) null);
			return;
		case RifPackage.SPEC_RELATION__VALUES:
			setVALUES((SpecRelationValues) null);
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
		case RifPackage.SPEC_RELATION__LONGNAME:
			return LONGNAME_EDEFAULT == null ? lONGNAME != null
					: !LONGNAME_EDEFAULT.equals(lONGNAME);
		case RifPackage.SPEC_RELATION__DESC:
			return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT
					.equals(dESC);
		case RifPackage.SPEC_RELATION__SOURCE:
			return sOURCE != null;
		case RifPackage.SPEC_RELATION__TARGET:
			return tARGET != null;
		case RifPackage.SPEC_RELATION__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null
					: !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
		case RifPackage.SPEC_RELATION__LASTCHANGE:
			return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null
					: !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
		case RifPackage.SPEC_RELATION__TYPE:
			return tYPE != null;
		case RifPackage.SPEC_RELATION__VALUES:
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

} //SpecRelationImpl
