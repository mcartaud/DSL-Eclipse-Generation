/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Editor;
import org.obeonetwork.dsl.gen.eclipse.MenuContribution;
import org.obeonetwork.dsl.gen.eclipse.Perspective;
import org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution;
import org.obeonetwork.dsl.gen.eclipse.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Popup Menu Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PopupMenuContributionImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PopupMenuContributionImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PopupMenuContributionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PopupMenuContributionImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PopupMenuContributionImpl#getEditors <em>Editors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PopupMenuContributionImpl#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PopupMenuContributionImpl#getActivateWith <em>Activate With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PopupMenuContributionImpl extends EObjectImpl implements PopupMenuContribution {
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
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuContribution> menus;

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
	 * The cached value of the '{@link #getViews() <em>Views</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The cached value of the '{@link #getEditors() <em>Editors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditors()
	 * @generated
	 * @ordered
	 */
	protected EList<Editor> editors;

	/**
	 * The cached value of the '{@link #getPerspectives() <em>Perspectives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Perspective> perspectives;

	/**
	 * The default value of the '{@link #getActivateWith() <em>Activate With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivateWith()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATE_WITH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivateWith() <em>Activate With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivateWith()
	 * @generated
	 * @ordered
	 */
	protected String activateWith = ACTIVATE_WITH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopupMenuContributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.POPUP_MENU_CONTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectResolvingEList<Command>(Command.class, this, EclipsePackage.POPUP_MENU_CONTRIBUTION__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuContribution> getMenus() {
		if (menus == null) {
			menus = new EObjectResolvingEList<MenuContribution>(MenuContribution.class, this, EclipsePackage.POPUP_MENU_CONTRIBUTION__MENUS);
		}
		return menus;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.POPUP_MENU_CONTRIBUTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectResolvingEList<View>(View.class, this, EclipsePackage.POPUP_MENU_CONTRIBUTION__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Editor> getEditors() {
		if (editors == null) {
			editors = new EObjectResolvingEList<Editor>(Editor.class, this, EclipsePackage.POPUP_MENU_CONTRIBUTION__EDITORS);
		}
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Perspective> getPerspectives() {
		if (perspectives == null) {
			perspectives = new EObjectResolvingEList<Perspective>(Perspective.class, this, EclipsePackage.POPUP_MENU_CONTRIBUTION__PERSPECTIVES);
		}
		return perspectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivateWith() {
		return activateWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivateWith(String newActivateWith) {
		String oldActivateWith = activateWith;
		activateWith = newActivateWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.POPUP_MENU_CONTRIBUTION__ACTIVATE_WITH, oldActivateWith, activateWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__COMMANDS:
				return getCommands();
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__MENUS:
				return getMenus();
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__NAME:
				return getName();
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__VIEWS:
				return getViews();
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__EDITORS:
				return getEditors();
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__PERSPECTIVES:
				return getPerspectives();
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__ACTIVATE_WITH:
				return getActivateWith();
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
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends MenuContribution>)newValue);
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__NAME:
				setName((String)newValue);
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__EDITORS:
				getEditors().clear();
				getEditors().addAll((Collection<? extends Editor>)newValue);
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__PERSPECTIVES:
				getPerspectives().clear();
				getPerspectives().addAll((Collection<? extends Perspective>)newValue);
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__ACTIVATE_WITH:
				setActivateWith((String)newValue);
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
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__COMMANDS:
				getCommands().clear();
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__MENUS:
				getMenus().clear();
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__VIEWS:
				getViews().clear();
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__EDITORS:
				getEditors().clear();
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__PERSPECTIVES:
				getPerspectives().clear();
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__ACTIVATE_WITH:
				setActivateWith(ACTIVATE_WITH_EDEFAULT);
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
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__COMMANDS:
				return commands != null && !commands.isEmpty();
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__MENUS:
				return menus != null && !menus.isEmpty();
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__VIEWS:
				return views != null && !views.isEmpty();
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__EDITORS:
				return editors != null && !editors.isEmpty();
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__PERSPECTIVES:
				return perspectives != null && !perspectives.isEmpty();
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__ACTIVATE_WITH:
				return ACTIVATE_WITH_EDEFAULT == null ? activateWith != null : !ACTIVATE_WITH_EDEFAULT.equals(activateWith);
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
		result.append(", activateWith: ");
		result.append(activateWith);
		result.append(')');
		return result.toString();
	}

} //PopupMenuContributionImpl
