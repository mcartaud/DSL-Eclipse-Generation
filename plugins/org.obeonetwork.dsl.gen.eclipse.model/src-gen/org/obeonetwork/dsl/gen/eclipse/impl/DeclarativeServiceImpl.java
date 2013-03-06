/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipse.DeclarativeService;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.ProvidedService;
import org.obeonetwork.dsl.gen.eclipse.RequiredService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declarative Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DeclarativeServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DeclarativeServiceImpl#getImplentationClass <em>Implentation Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DeclarativeServiceImpl#getProvidedServices <em>Provided Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DeclarativeServiceImpl#getRequiredServices <em>Required Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarativeServiceImpl extends EObjectImpl implements
		DeclarativeService {
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
	 * The cached value of the '{@link #getImplentationClass() <em>Implentation Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplentationClass()
	 * @generated
	 * @ordered
	 */
	protected GenClass implentationClass;

	/**
	 * The cached value of the '{@link #getProvidedServices() <em>Provided Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedService> providedServices;

	/**
	 * The cached value of the '{@link #getRequiredServices() <em>Required Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredServices()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredService> requiredServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarativeServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.DECLARATIVE_SERVICE;
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
					EclipsePackage.DECLARATIVE_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass getImplentationClass() {
		if (implentationClass != null && implentationClass.eIsProxy()) {
			InternalEObject oldImplentationClass = (InternalEObject) implentationClass;
			implentationClass = (GenClass) eResolveProxy(oldImplentationClass);
			if (implentationClass != oldImplentationClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							EclipsePackage.DECLARATIVE_SERVICE__IMPLENTATION_CLASS,
							oldImplentationClass, implentationClass));
			}
		}
		return implentationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClass basicGetImplentationClass() {
		return implentationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplentationClass(GenClass newImplentationClass) {
		GenClass oldImplentationClass = implentationClass;
		implentationClass = newImplentationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.DECLARATIVE_SERVICE__IMPLENTATION_CLASS,
					oldImplentationClass, implentationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedService> getProvidedServices() {
		if (providedServices == null) {
			providedServices = new EObjectContainmentEList<ProvidedService>(
					ProvidedService.class, this,
					EclipsePackage.DECLARATIVE_SERVICE__PROVIDED_SERVICES);
		}
		return providedServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredService> getRequiredServices() {
		if (requiredServices == null) {
			requiredServices = new EObjectContainmentEList<RequiredService>(
					RequiredService.class, this,
					EclipsePackage.DECLARATIVE_SERVICE__REQUIRED_SERVICES);
		}
		return requiredServices;
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
		case EclipsePackage.DECLARATIVE_SERVICE__PROVIDED_SERVICES:
			return ((InternalEList<?>) getProvidedServices()).basicRemove(
					otherEnd, msgs);
		case EclipsePackage.DECLARATIVE_SERVICE__REQUIRED_SERVICES:
			return ((InternalEList<?>) getRequiredServices()).basicRemove(
					otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EclipsePackage.DECLARATIVE_SERVICE__NAME:
			return getName();
		case EclipsePackage.DECLARATIVE_SERVICE__IMPLENTATION_CLASS:
			if (resolve)
				return getImplentationClass();
			return basicGetImplentationClass();
		case EclipsePackage.DECLARATIVE_SERVICE__PROVIDED_SERVICES:
			return getProvidedServices();
		case EclipsePackage.DECLARATIVE_SERVICE__REQUIRED_SERVICES:
			return getRequiredServices();
		}
		return eDynamicGet(featureID, resolve, coreType);
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
		case EclipsePackage.DECLARATIVE_SERVICE__NAME:
			setName((String) newValue);
			return;
		case EclipsePackage.DECLARATIVE_SERVICE__IMPLENTATION_CLASS:
			setImplentationClass((GenClass) newValue);
			return;
		case EclipsePackage.DECLARATIVE_SERVICE__PROVIDED_SERVICES:
			getProvidedServices().clear();
			getProvidedServices().addAll(
					(Collection<? extends ProvidedService>) newValue);
			return;
		case EclipsePackage.DECLARATIVE_SERVICE__REQUIRED_SERVICES:
			getRequiredServices().clear();
			getRequiredServices().addAll(
					(Collection<? extends RequiredService>) newValue);
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
		case EclipsePackage.DECLARATIVE_SERVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EclipsePackage.DECLARATIVE_SERVICE__IMPLENTATION_CLASS:
			setImplentationClass((GenClass) null);
			return;
		case EclipsePackage.DECLARATIVE_SERVICE__PROVIDED_SERVICES:
			getProvidedServices().clear();
			return;
		case EclipsePackage.DECLARATIVE_SERVICE__REQUIRED_SERVICES:
			getRequiredServices().clear();
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
		case EclipsePackage.DECLARATIVE_SERVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case EclipsePackage.DECLARATIVE_SERVICE__IMPLENTATION_CLASS:
			return implentationClass != null;
		case EclipsePackage.DECLARATIVE_SERVICE__PROVIDED_SERVICES:
			return providedServices != null && !providedServices.isEmpty();
		case EclipsePackage.DECLARATIVE_SERVICE__REQUIRED_SERVICES:
			return requiredServices != null && !requiredServices.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DeclarativeServiceImpl
