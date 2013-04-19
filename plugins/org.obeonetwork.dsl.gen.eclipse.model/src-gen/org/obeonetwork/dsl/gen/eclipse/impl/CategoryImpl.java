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

import org.obeonetwork.dsl.gen.eclipse.Category;
import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.View;
import org.obeonetwork.dsl.gen.eclipse.Wizard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CategoryImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CategoryImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.CategoryImpl#getWizards <em>Wizards</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryImpl extends EObjectImpl implements Category {
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
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

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
	 * The cached value of the '{@link #getWizards() <em>Wizards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWizards()
	 * @generated
	 * @ordered
	 */
	protected EList<Wizard> wizards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.CATEGORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.CATEGORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectWithInverseResolvingEList<Command>(Command.class, this, EclipsePackage.CATEGORY__COMMANDS, EclipsePackage.COMMAND__CATEGORY);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectWithInverseResolvingEList<View>(View.class, this, EclipsePackage.CATEGORY__VIEWS, EclipsePackage.VIEW__CATEGORY);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wizard> getWizards() {
		if (wizards == null) {
			wizards = new EObjectWithInverseResolvingEList<Wizard>(Wizard.class, this, EclipsePackage.CATEGORY__WIZARDS, EclipsePackage.WIZARD__CATEGORY);
		}
		return wizards;
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
			case EclipsePackage.CATEGORY__COMMANDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommands()).basicAdd(otherEnd, msgs);
			case EclipsePackage.CATEGORY__VIEWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViews()).basicAdd(otherEnd, msgs);
			case EclipsePackage.CATEGORY__WIZARDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWizards()).basicAdd(otherEnd, msgs);
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
			case EclipsePackage.CATEGORY__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case EclipsePackage.CATEGORY__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case EclipsePackage.CATEGORY__WIZARDS:
				return ((InternalEList<?>)getWizards()).basicRemove(otherEnd, msgs);
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
			case EclipsePackage.CATEGORY__NAME:
				return getName();
			case EclipsePackage.CATEGORY__COMMANDS:
				return getCommands();
			case EclipsePackage.CATEGORY__VIEWS:
				return getViews();
			case EclipsePackage.CATEGORY__WIZARDS:
				return getWizards();
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
			case EclipsePackage.CATEGORY__NAME:
				setName((String)newValue);
				return;
			case EclipsePackage.CATEGORY__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
				return;
			case EclipsePackage.CATEGORY__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case EclipsePackage.CATEGORY__WIZARDS:
				getWizards().clear();
				getWizards().addAll((Collection<? extends Wizard>)newValue);
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
			case EclipsePackage.CATEGORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EclipsePackage.CATEGORY__COMMANDS:
				getCommands().clear();
				return;
			case EclipsePackage.CATEGORY__VIEWS:
				getViews().clear();
				return;
			case EclipsePackage.CATEGORY__WIZARDS:
				getWizards().clear();
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
			case EclipsePackage.CATEGORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EclipsePackage.CATEGORY__COMMANDS:
				return commands != null && !commands.isEmpty();
			case EclipsePackage.CATEGORY__VIEWS:
				return views != null && !views.isEmpty();
			case EclipsePackage.CATEGORY__WIZARDS:
				return wizards != null && !wizards.isEmpty();
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

} //CategoryImpl
