/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Marker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MarkerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MarkerImpl#isIsPersistant <em>Is Persistant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarkerImpl extends EObjectImpl implements Marker {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPersistant() <em>Is Persistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersistant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERSISTANT_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isIsPersistant() <em>Is Persistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersistant()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_PERSISTANT_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.MARKER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPersistant() {
		return (eFlags & IS_PERSISTANT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPersistant(boolean newIsPersistant) {
		boolean oldIsPersistant = (eFlags & IS_PERSISTANT_EFLAG) != 0;
		if (newIsPersistant)
			eFlags |= IS_PERSISTANT_EFLAG;
		else
			eFlags &= ~IS_PERSISTANT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.MARKER__IS_PERSISTANT, oldIsPersistant,
					newIsPersistant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EclipsePackage.MARKER__NAME:
			return getName();
		case EclipsePackage.MARKER__IS_PERSISTANT:
			return isIsPersistant();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EclipsePackage.MARKER__NAME:
			setName((String) newValue);
			return;
		case EclipsePackage.MARKER__IS_PERSISTANT:
			setIsPersistant((Boolean) newValue);
			return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EclipsePackage.MARKER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EclipsePackage.MARKER__IS_PERSISTANT:
			setIsPersistant(IS_PERSISTANT_EDEFAULT);
			return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EclipsePackage.MARKER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case EclipsePackage.MARKER__IS_PERSISTANT:
			return ((eFlags & IS_PERSISTANT_EFLAG) != 0) != IS_PERSISTANT_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isPersistant: ");
		result.append((eFlags & IS_PERSISTANT_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //MarkerImpl
