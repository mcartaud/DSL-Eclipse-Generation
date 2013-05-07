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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Handler;
import org.obeonetwork.dsl.gen.eclipse.Perspective;
import org.obeonetwork.dsl.gen.eclipse.View;
import org.obeonetwork.dsl.gen.eclipse.Wizard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PerspectiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PerspectiveImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PerspectiveImpl#getWizards <em>Wizards</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PerspectiveImpl#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerspectiveImpl extends EObjectImpl implements Perspective {
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
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<Handler> handlers;

	/**
	 * The cached value of the '{@link #getWizards() <em>Wizards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWizards()
	 * @generated
	 * @ordered
	 */
	protected EList<Wizard> wizards;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.PERSPECTIVE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.PERSPECTIVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Handler> getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList<Handler>(Handler.class, this, EclipsePackage.PERSPECTIVE__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wizard> getWizards() {
		if (wizards == null) {
			wizards = new EObjectContainmentEList<Wizard>(Wizard.class, this, EclipsePackage.PERSPECTIVE__WIZARDS);
		}
		return wizards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectWithInverseResolvingEList.ManyInverse<View>(View.class, this, EclipsePackage.PERSPECTIVE__VIEWS, EclipsePackage.VIEW__PERSPECTIVES);
		}
		return views;
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
			case EclipsePackage.PERSPECTIVE__VIEWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViews()).basicAdd(otherEnd, msgs);
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
			case EclipsePackage.PERSPECTIVE__HANDLERS:
				return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
			case EclipsePackage.PERSPECTIVE__WIZARDS:
				return ((InternalEList<?>)getWizards()).basicRemove(otherEnd, msgs);
			case EclipsePackage.PERSPECTIVE__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
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
			case EclipsePackage.PERSPECTIVE__NAME:
				return getName();
			case EclipsePackage.PERSPECTIVE__HANDLERS:
				return getHandlers();
			case EclipsePackage.PERSPECTIVE__WIZARDS:
				return getWizards();
			case EclipsePackage.PERSPECTIVE__VIEWS:
				return getViews();
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
			case EclipsePackage.PERSPECTIVE__NAME:
				setName((String)newValue);
				return;
			case EclipsePackage.PERSPECTIVE__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection<? extends Handler>)newValue);
				return;
			case EclipsePackage.PERSPECTIVE__WIZARDS:
				getWizards().clear();
				getWizards().addAll((Collection<? extends Wizard>)newValue);
				return;
			case EclipsePackage.PERSPECTIVE__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
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
			case EclipsePackage.PERSPECTIVE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EclipsePackage.PERSPECTIVE__HANDLERS:
				getHandlers().clear();
				return;
			case EclipsePackage.PERSPECTIVE__WIZARDS:
				getWizards().clear();
				return;
			case EclipsePackage.PERSPECTIVE__VIEWS:
				getViews().clear();
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
			case EclipsePackage.PERSPECTIVE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EclipsePackage.PERSPECTIVE__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case EclipsePackage.PERSPECTIVE__WIZARDS:
				return wizards != null && !wizards.isEmpty();
			case EclipsePackage.PERSPECTIVE__VIEWS:
				return views != null && !views.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PerspectiveImpl
