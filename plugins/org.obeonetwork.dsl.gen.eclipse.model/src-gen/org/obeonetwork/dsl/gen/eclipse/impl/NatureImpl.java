/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipse.Builder;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Nature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.NatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.NatureImpl#isHasToggleNature <em>Has Toggle Nature</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.NatureImpl#getBuilders <em>Builders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NatureImpl extends EObjectImpl implements Nature {
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
	 * The default value of the '{@link #isHasToggleNature() <em>Has Toggle Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasToggleNature()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TOGGLE_NATURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasToggleNature() <em>Has Toggle Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasToggleNature()
	 * @generated
	 * @ordered
	 */
	protected boolean hasToggleNature = HAS_TOGGLE_NATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBuilders() <em>Builders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilders()
	 * @generated
	 * @ordered
	 */
	protected EList<Builder> builders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.NATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.NATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasToggleNature() {
		return hasToggleNature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasToggleNature(boolean newHasToggleNature) {
		boolean oldHasToggleNature = hasToggleNature;
		hasToggleNature = newHasToggleNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.NATURE__HAS_TOGGLE_NATURE, oldHasToggleNature, hasToggleNature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Builder> getBuilders() {
		if (builders == null) {
			builders = new EObjectWithInverseResolvingEList.ManyInverse<Builder>(Builder.class, this, EclipsePackage.NATURE__BUILDERS, EclipsePackage.BUILDER__NATURES);
		}
		return builders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipsePackage.NATURE__BUILDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBuilders()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipsePackage.NATURE__BUILDERS:
				return ((InternalEList<?>)getBuilders()).basicRemove(otherEnd, msgs);
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
			case EclipsePackage.NATURE__NAME:
				return getName();
			case EclipsePackage.NATURE__HAS_TOGGLE_NATURE:
				return isHasToggleNature();
			case EclipsePackage.NATURE__BUILDERS:
				return getBuilders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EclipsePackage.NATURE__NAME:
				setName((String)newValue);
				return;
			case EclipsePackage.NATURE__HAS_TOGGLE_NATURE:
				setHasToggleNature((Boolean)newValue);
				return;
			case EclipsePackage.NATURE__BUILDERS:
				getBuilders().clear();
				getBuilders().addAll((Collection<? extends Builder>)newValue);
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
			case EclipsePackage.NATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EclipsePackage.NATURE__HAS_TOGGLE_NATURE:
				setHasToggleNature(HAS_TOGGLE_NATURE_EDEFAULT);
				return;
			case EclipsePackage.NATURE__BUILDERS:
				getBuilders().clear();
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
			case EclipsePackage.NATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EclipsePackage.NATURE__HAS_TOGGLE_NATURE:
				return hasToggleNature != HAS_TOGGLE_NATURE_EDEFAULT;
			case EclipsePackage.NATURE__BUILDERS:
				return builders != null && !builders.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", hasToggleNature: ");
		result.append(hasToggleNature);
		result.append(')');
		return result.toString();
	}

} //NatureImpl
