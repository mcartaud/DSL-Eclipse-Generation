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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Editor;
import org.obeonetwork.dsl.gen.eclipse.Handler;
import org.obeonetwork.dsl.gen.eclipse.Menu;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.EditorImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.EditorImpl#isDynamicMenu <em>Dynamic Menu</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.EditorImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.EditorImpl#getMenus <em>Menus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditorImpl extends PartImpl implements Editor {
	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDynamicMenu() <em>Dynamic Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicMenu()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYNAMIC_MENU_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDynamicMenu() <em>Dynamic Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicMenu()
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicMenu = DYNAMIC_MENU_EDEFAULT;

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
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> menus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.EDITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.EDITOR__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDynamicMenu() {
		return dynamicMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicMenu(boolean newDynamicMenu) {
		boolean oldDynamicMenu = dynamicMenu;
		dynamicMenu = newDynamicMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.EDITOR__DYNAMIC_MENU, oldDynamicMenu, dynamicMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Handler> getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList<Handler>(Handler.class, this, EclipsePackage.EDITOR__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getMenus() {
		if (menus == null) {
			menus = new EObjectContainmentEList<Menu>(Menu.class, this, EclipsePackage.EDITOR__MENUS);
		}
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipsePackage.EDITOR__HANDLERS:
				return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
			case EclipsePackage.EDITOR__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
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
			case EclipsePackage.EDITOR__EXTENSION:
				return getExtension();
			case EclipsePackage.EDITOR__DYNAMIC_MENU:
				return isDynamicMenu();
			case EclipsePackage.EDITOR__HANDLERS:
				return getHandlers();
			case EclipsePackage.EDITOR__MENUS:
				return getMenus();
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
			case EclipsePackage.EDITOR__EXTENSION:
				setExtension((String)newValue);
				return;
			case EclipsePackage.EDITOR__DYNAMIC_MENU:
				setDynamicMenu((Boolean)newValue);
				return;
			case EclipsePackage.EDITOR__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection<? extends Handler>)newValue);
				return;
			case EclipsePackage.EDITOR__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends Menu>)newValue);
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
			case EclipsePackage.EDITOR__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case EclipsePackage.EDITOR__DYNAMIC_MENU:
				setDynamicMenu(DYNAMIC_MENU_EDEFAULT);
				return;
			case EclipsePackage.EDITOR__HANDLERS:
				getHandlers().clear();
				return;
			case EclipsePackage.EDITOR__MENUS:
				getMenus().clear();
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
			case EclipsePackage.EDITOR__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case EclipsePackage.EDITOR__DYNAMIC_MENU:
				return dynamicMenu != DYNAMIC_MENU_EDEFAULT;
			case EclipsePackage.EDITOR__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case EclipsePackage.EDITOR__MENUS:
				return menus != null && !menus.isEmpty();
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
		result.append(" (extension: ");
		result.append(extension);
		result.append(", dynamicMenu: ");
		result.append(dynamicMenu);
		result.append(')');
		return result.toString();
	}

} //EditorImpl
