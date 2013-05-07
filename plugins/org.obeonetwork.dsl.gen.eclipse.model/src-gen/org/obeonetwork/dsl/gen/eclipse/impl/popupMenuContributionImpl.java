/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.MenuContribution;
import org.obeonetwork.dsl.gen.eclipse.popupMenuContribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>popup Menu Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.popupMenuContributionImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.popupMenuContributionImpl#getMenus <em>Menus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class popupMenuContributionImpl extends EObjectImpl implements popupMenuContribution {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected popupMenuContributionImpl() {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__COMMANDS:
				return getCommands();
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__MENUS:
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
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
				return;
			case EclipsePackage.POPUP_MENU_CONTRIBUTION__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends MenuContribution>)newValue);
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
		}
		return super.eIsSet(featureID);
	}

} //popupMenuContributionImpl
