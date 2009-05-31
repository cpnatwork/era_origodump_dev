/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.model.core.rif.internal;

import era.foss.model.core.rif.RelationGroup;
import era.foss.model.core.rif.RelationGroupSpecRelations;
import era.foss.model.core.rif.RelationType;
import era.foss.model.core.rif.RifPackage;
import era.foss.model.core.rif.TargetGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.model.core.rif.internal.RelationGroupImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RelationGroupImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RelationGroupImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RelationGroupImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RelationGroupImpl#getRELATIONTYPE <em>RELATIONTYPE</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RelationGroupImpl#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link era.foss.model.core.rif.internal.RelationGroupImpl#getTARGETGROUP <em>TARGETGROUP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationGroupImpl extends EObjectImpl implements RelationGroup {
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
	 * The cached value of the '{@link #getRELATIONTYPE() <em>RELATIONTYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRELATIONTYPE()
	 * @generated
	 * @ordered
	 */
	protected RelationType rELATIONTYPE;

	/**
	 * The cached value of the '{@link #getSPECRELATIONS() <em>SPECRELATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECRELATIONS()
	 * @generated
	 * @ordered
	 */
	protected RelationGroupSpecRelations sPECRELATIONS;

	/**
	 * The cached value of the '{@link #getTARGETGROUP() <em>TARGETGROUP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTARGETGROUP()
	 * @generated
	 * @ordered
	 */
	protected TargetGroup tARGETGROUP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.RELATION_GROUP;
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
					RifPackage.RELATION_GROUP__LONGNAME, oldLONGNAME, lONGNAME));
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
					RifPackage.RELATION_GROUP__DESC, oldDESC, dESC));
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
					RifPackage.RELATION_GROUP__IDENTIFIER, oldIDENTIFIER,
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
					RifPackage.RELATION_GROUP__LASTCHANGE, oldLASTCHANGE,
					lASTCHANGE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType getRELATIONTYPE() {
		return rELATIONTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRELATIONTYPE(RelationType newRELATIONTYPE,
			NotificationChain msgs) {
		RelationType oldRELATIONTYPE = rELATIONTYPE;
		rELATIONTYPE = newRELATIONTYPE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.RELATION_GROUP__RELATIONTYPE,
					oldRELATIONTYPE, newRELATIONTYPE);
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
	public void setRELATIONTYPE(RelationType newRELATIONTYPE) {
		if (newRELATIONTYPE != rELATIONTYPE) {
			NotificationChain msgs = null;
			if (rELATIONTYPE != null)
				msgs = ((InternalEObject) rELATIONTYPE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.RELATION_GROUP__RELATIONTYPE,
						null, msgs);
			if (newRELATIONTYPE != null)
				msgs = ((InternalEObject) newRELATIONTYPE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.RELATION_GROUP__RELATIONTYPE,
						null, msgs);
			msgs = basicSetRELATIONTYPE(newRELATIONTYPE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.RELATION_GROUP__RELATIONTYPE, newRELATIONTYPE,
					newRELATIONTYPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationGroupSpecRelations getSPECRELATIONS() {
		return sPECRELATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECRELATIONS(
			RelationGroupSpecRelations newSPECRELATIONS, NotificationChain msgs) {
		RelationGroupSpecRelations oldSPECRELATIONS = sPECRELATIONS;
		sPECRELATIONS = newSPECRELATIONS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.RELATION_GROUP__SPECRELATIONS,
					oldSPECRELATIONS, newSPECRELATIONS);
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
	public void setSPECRELATIONS(RelationGroupSpecRelations newSPECRELATIONS) {
		if (newSPECRELATIONS != sPECRELATIONS) {
			NotificationChain msgs = null;
			if (sPECRELATIONS != null)
				msgs = ((InternalEObject) sPECRELATIONS).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.RELATION_GROUP__SPECRELATIONS,
						null, msgs);
			if (newSPECRELATIONS != null)
				msgs = ((InternalEObject) newSPECRELATIONS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.RELATION_GROUP__SPECRELATIONS,
						null, msgs);
			msgs = basicSetSPECRELATIONS(newSPECRELATIONS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.RELATION_GROUP__SPECRELATIONS, newSPECRELATIONS,
					newSPECRELATIONS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetGroup getTARGETGROUP() {
		return tARGETGROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTARGETGROUP(TargetGroup newTARGETGROUP,
			NotificationChain msgs) {
		TargetGroup oldTARGETGROUP = tARGETGROUP;
		tARGETGROUP = newTARGETGROUP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, RifPackage.RELATION_GROUP__TARGETGROUP,
					oldTARGETGROUP, newTARGETGROUP);
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
	public void setTARGETGROUP(TargetGroup newTARGETGROUP) {
		if (newTARGETGROUP != tARGETGROUP) {
			NotificationChain msgs = null;
			if (tARGETGROUP != null)
				msgs = ((InternalEObject) tARGETGROUP).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.RELATION_GROUP__TARGETGROUP, null,
						msgs);
			if (newTARGETGROUP != null)
				msgs = ((InternalEObject) newTARGETGROUP).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RifPackage.RELATION_GROUP__TARGETGROUP, null,
						msgs);
			msgs = basicSetTARGETGROUP(newTARGETGROUP, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RifPackage.RELATION_GROUP__TARGETGROUP, newTARGETGROUP,
					newTARGETGROUP));
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
		case RifPackage.RELATION_GROUP__RELATIONTYPE:
			return basicSetRELATIONTYPE(null, msgs);
		case RifPackage.RELATION_GROUP__SPECRELATIONS:
			return basicSetSPECRELATIONS(null, msgs);
		case RifPackage.RELATION_GROUP__TARGETGROUP:
			return basicSetTARGETGROUP(null, msgs);
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
		case RifPackage.RELATION_GROUP__LONGNAME:
			return getLONGNAME();
		case RifPackage.RELATION_GROUP__DESC:
			return getDESC();
		case RifPackage.RELATION_GROUP__IDENTIFIER:
			return getIDENTIFIER();
		case RifPackage.RELATION_GROUP__LASTCHANGE:
			return getLASTCHANGE();
		case RifPackage.RELATION_GROUP__RELATIONTYPE:
			return getRELATIONTYPE();
		case RifPackage.RELATION_GROUP__SPECRELATIONS:
			return getSPECRELATIONS();
		case RifPackage.RELATION_GROUP__TARGETGROUP:
			return getTARGETGROUP();
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
		case RifPackage.RELATION_GROUP__LONGNAME:
			setLONGNAME((String) newValue);
			return;
		case RifPackage.RELATION_GROUP__DESC:
			setDESC((String) newValue);
			return;
		case RifPackage.RELATION_GROUP__IDENTIFIER:
			setIDENTIFIER((String) newValue);
			return;
		case RifPackage.RELATION_GROUP__LASTCHANGE:
			setLASTCHANGE((String) newValue);
			return;
		case RifPackage.RELATION_GROUP__RELATIONTYPE:
			setRELATIONTYPE((RelationType) newValue);
			return;
		case RifPackage.RELATION_GROUP__SPECRELATIONS:
			setSPECRELATIONS((RelationGroupSpecRelations) newValue);
			return;
		case RifPackage.RELATION_GROUP__TARGETGROUP:
			setTARGETGROUP((TargetGroup) newValue);
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
		case RifPackage.RELATION_GROUP__LONGNAME:
			setLONGNAME(LONGNAME_EDEFAULT);
			return;
		case RifPackage.RELATION_GROUP__DESC:
			setDESC(DESC_EDEFAULT);
			return;
		case RifPackage.RELATION_GROUP__IDENTIFIER:
			setIDENTIFIER(IDENTIFIER_EDEFAULT);
			return;
		case RifPackage.RELATION_GROUP__LASTCHANGE:
			setLASTCHANGE(LASTCHANGE_EDEFAULT);
			return;
		case RifPackage.RELATION_GROUP__RELATIONTYPE:
			setRELATIONTYPE((RelationType) null);
			return;
		case RifPackage.RELATION_GROUP__SPECRELATIONS:
			setSPECRELATIONS((RelationGroupSpecRelations) null);
			return;
		case RifPackage.RELATION_GROUP__TARGETGROUP:
			setTARGETGROUP((TargetGroup) null);
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
		case RifPackage.RELATION_GROUP__LONGNAME:
			return LONGNAME_EDEFAULT == null ? lONGNAME != null
					: !LONGNAME_EDEFAULT.equals(lONGNAME);
		case RifPackage.RELATION_GROUP__DESC:
			return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT
					.equals(dESC);
		case RifPackage.RELATION_GROUP__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null
					: !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
		case RifPackage.RELATION_GROUP__LASTCHANGE:
			return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null
					: !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
		case RifPackage.RELATION_GROUP__RELATIONTYPE:
			return rELATIONTYPE != null;
		case RifPackage.RELATION_GROUP__SPECRELATIONS:
			return sPECRELATIONS != null;
		case RifPackage.RELATION_GROUP__TARGETGROUP:
			return tARGETGROUP != null;
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

} //RelationGroupImpl
