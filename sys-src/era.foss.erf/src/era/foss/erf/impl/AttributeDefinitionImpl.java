/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package era.foss.erf.impl;

import era.foss.erf.AttributeDefinition;
import era.foss.erf.DatatypeDefinition;
import era.foss.erf.ErfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionImpl#isIdent <em>Ident</em>}</li>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionImpl#isEditorShowLabel <em>Editor Show Label</em>}</li>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionImpl#getEditorRowNumber <em>Editor Row Number</em>}</li>
 *   <li>{@link era.foss.erf.impl.AttributeDefinitionImpl#getEditorColumnSpan <em>Editor Column Span</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AttributeDefinitionImpl extends IdentifiableImpl implements AttributeDefinition {

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected DatatypeDefinition type;

    /**
     * The default value of the '{@link #isIdent() <em>Ident</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIdent()
     * @generated
     * @ordered
     */
    protected static final boolean IDENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIdent() <em>Ident</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIdent()
     * @generated
     * @ordered
     */
    protected boolean ident = IDENT_EDEFAULT;

    /**
     * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUnique()
     * @generated
     * @ordered
     */
    protected static final boolean UNIQUE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUnique()
     * @generated
     * @ordered
     */
    protected boolean unique = UNIQUE_EDEFAULT;

    /**
     * The default value of the '{@link #isEditorShowLabel() <em>Editor Show Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEditorShowLabel()
     * @generated
     * @ordered
     */
    protected static final boolean EDITOR_SHOW_LABEL_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isEditorShowLabel() <em>Editor Show Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEditorShowLabel()
     * @generated
     * @ordered
     */
    protected boolean editorShowLabel = EDITOR_SHOW_LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getEditorRowNumber() <em>Editor Row Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditorRowNumber()
     * @generated
     * @ordered
     */
    protected static final int EDITOR_ROW_NUMBER_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getEditorRowNumber() <em>Editor Row Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditorRowNumber()
     * @generated
     * @ordered
     */
    protected int editorRowNumber = EDITOR_ROW_NUMBER_EDEFAULT;

    /**
     * The default value of the '{@link #getEditorColumnSpan() <em>Editor Column Span</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditorColumnSpan()
     * @generated
     * @ordered
     */
    protected static final int EDITOR_COLUMN_SPAN_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getEditorColumnSpan() <em>Editor Column Span</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditorColumnSpan()
     * @generated
     * @ordered
     */
    protected int editorColumnSpan = EDITOR_COLUMN_SPAN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ErfPackage.Literals.ATTRIBUTE_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinition getType() {
        if( type != null && type.eIsProxy() ) {
            InternalEObject oldType = (InternalEObject)type;
            type = (DatatypeDefinition)eResolveProxy( oldType );
            if( type != oldType ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl(
                    this,
                    Notification.RESOLVE,
                    ErfPackage.ATTRIBUTE_DEFINITION__TYPE,
                    oldType,
                    type ) );
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeDefinition basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType( DatatypeDefinition newType ) {
        DatatypeDefinition oldType = type;
        type = newType;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.ATTRIBUTE_DEFINITION__TYPE,
            oldType,
            type ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIdent() {
        return ident;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdent( boolean newIdent ) {
        boolean oldIdent = ident;
        ident = newIdent;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.ATTRIBUTE_DEFINITION__IDENT,
            oldIdent,
            ident ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUnique() {
        return unique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnique( boolean newUnique ) {
        boolean oldUnique = unique;
        unique = newUnique;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.ATTRIBUTE_DEFINITION__UNIQUE,
            oldUnique,
            unique ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isEditorShowLabel() {
        return editorShowLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEditorShowLabel( boolean newEditorShowLabel ) {
        boolean oldEditorShowLabel = editorShowLabel;
        editorShowLabel = newEditorShowLabel;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_SHOW_LABEL,
            oldEditorShowLabel,
            editorShowLabel ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getEditorRowNumber() {
        return editorRowNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEditorRowNumber( int newEditorRowNumber ) {
        int oldEditorRowNumber = editorRowNumber;
        editorRowNumber = newEditorRowNumber;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_ROW_NUMBER,
            oldEditorRowNumber,
            editorRowNumber ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getEditorColumnSpan() {
        return editorColumnSpan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEditorColumnSpan( int newEditorColumnSpan ) {
        int oldEditorColumnSpan = editorColumnSpan;
        editorColumnSpan = newEditorColumnSpan;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl(
            this,
            Notification.SET,
            ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_COLUMN_SPAN,
            oldEditorColumnSpan,
            editorColumnSpan ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION__TYPE:
            if( resolve ) return getType();
            return basicGetType();
        case ErfPackage.ATTRIBUTE_DEFINITION__IDENT:
            return isIdent();
        case ErfPackage.ATTRIBUTE_DEFINITION__UNIQUE:
            return isUnique();
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_SHOW_LABEL:
            return isEditorShowLabel();
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_ROW_NUMBER:
            return getEditorRowNumber();
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_COLUMN_SPAN:
            return getEditorColumnSpan();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION__TYPE:
            setType( (DatatypeDefinition)newValue );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__IDENT:
            setIdent( (Boolean)newValue );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__UNIQUE:
            setUnique( (Boolean)newValue );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_SHOW_LABEL:
            setEditorShowLabel( (Boolean)newValue );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_ROW_NUMBER:
            setEditorRowNumber( (Integer)newValue );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_COLUMN_SPAN:
            setEditorColumnSpan( (Integer)newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION__TYPE:
            setType( (DatatypeDefinition)null );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__IDENT:
            setIdent( IDENT_EDEFAULT );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__UNIQUE:
            setUnique( UNIQUE_EDEFAULT );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_SHOW_LABEL:
            setEditorShowLabel( EDITOR_SHOW_LABEL_EDEFAULT );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_ROW_NUMBER:
            setEditorRowNumber( EDITOR_ROW_NUMBER_EDEFAULT );
            return;
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_COLUMN_SPAN:
            setEditorColumnSpan( EDITOR_COLUMN_SPAN_EDEFAULT );
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch (featureID) {
        case ErfPackage.ATTRIBUTE_DEFINITION__TYPE:
            return type != null;
        case ErfPackage.ATTRIBUTE_DEFINITION__IDENT:
            return ident != IDENT_EDEFAULT;
        case ErfPackage.ATTRIBUTE_DEFINITION__UNIQUE:
            return unique != UNIQUE_EDEFAULT;
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_SHOW_LABEL:
            return editorShowLabel != EDITOR_SHOW_LABEL_EDEFAULT;
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_ROW_NUMBER:
            return editorRowNumber != EDITOR_ROW_NUMBER_EDEFAULT;
        case ErfPackage.ATTRIBUTE_DEFINITION__EDITOR_COLUMN_SPAN:
            return editorColumnSpan != EDITOR_COLUMN_SPAN_EDEFAULT;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (ident: " );
        result.append( ident );
        result.append( ", unique: " );
        result.append( unique );
        result.append( ", editorShowLabel: " );
        result.append( editorShowLabel );
        result.append( ", editorRowNumber: " );
        result.append( editorRowNumber );
        result.append( ", editorColumnSpan: " );
        result.append( editorColumnSpan );
        result.append( ')' );
        return result.toString();
    }

} //AttributeDefinitionImpl
