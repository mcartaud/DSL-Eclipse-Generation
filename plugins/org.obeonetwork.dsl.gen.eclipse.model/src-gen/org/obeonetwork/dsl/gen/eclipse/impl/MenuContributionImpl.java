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
import org.obeonetwork.dsl.gen.eclipse.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuContributionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuContributionImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuContributionImpl#getMenuContributions <em>Menu Contributions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuContributionImpl#getMnemonic <em>Mnemonic</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuContributionImpl#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuContributionImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuContributionImpl#getEditors <em>Editors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuContributionImpl extends EObjectImpl implements MenuContribution {
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
	 * The cached value of the '{@link #getMenuContributions() <em>Menu Contributions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuContributions()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuContribution> menuContributions;

	/**
	 * The default value of the '{@link #getMnemonic() <em>Mnemonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMnemonic()
	 * @generated
	 * @ordered
	 */
	protected static final String MNEMONIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMnemonic() <em>Mnemonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMnemonic()
	 * @generated
	 * @ordered
	 */
	protected String mnemonic = MNEMONIC_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuContributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.MENU_CONTRIBUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.MENU_CONTRIBUTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectResolvingEList<Command>(Command.class, this, EclipsePackage.MENU_CONTRIBUTION__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuContribution> getMenuContributions() {
		if (menuContributions == null) {
			menuContributions = new EObjectResolvingEList<MenuContribution>(MenuContribution.class, this, EclipsePackage.MENU_CONTRIBUTION__MENU_CONTRIBUTIONS);
		}
		return menuContributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMnemonic() {
		return mnemonic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMnemonic(String newMnemonic) {
		String oldMnemonic = mnemonic;
		mnemonic = newMnemonic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.MENU_CONTRIBUTION__MNEMONIC, oldMnemonic, mnemonic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Perspective> getPerspectives() {
		if (perspectives == null) {
			perspectives = new EObjectResolvingEList<Perspective>(Perspective.class, this, EclipsePackage.MENU_CONTRIBUTION__PERSPECTIVES);
		}
		return perspectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectResolvingEList<View>(View.class, this, EclipsePackage.MENU_CONTRIBUTION__VIEWS);
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
			editors = new EObjectResolvingEList<Editor>(Editor.class, this, EclipsePackage.MENU_CONTRIBUTION__EDITORS);
		}
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EclipsePackage.MENU_CONTRIBUTION__NAME:
				return getName();
			case EclipsePackage.MENU_CONTRIBUTION__COMMANDS:
				return getCommands();
			case EclipsePackage.MENU_CONTRIBUTION__MENU_CONTRIBUTIONS:
				return getMenuContributions();
			case EclipsePackage.MENU_CONTRIBUTION__MNEMONIC:
				return getMnemonic();
			case EclipsePackage.MENU_CONTRIBUTION__PERSPECTIVES:
				return getPerspectives();
			case EclipsePackage.MENU_CONTRIBUTION__VIEWS:
				return getViews();
			case EclipsePackage.MENU_CONTRIBUTION__EDITORS:
				return getEditors();
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
			case EclipsePackage.MENU_CONTRIBUTION__NAME:
				setName((String)newValue);
				return;
			case EclipsePackage.MENU_CONTRIBUTION__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
				return;
			case EclipsePackage.MENU_CONTRIBUTION__MENU_CONTRIBUTIONS:
				getMenuContributions().clear();
				getMenuContributions().addAll((Collection<? extends MenuContribution>)newValue);
				return;
			case EclipsePackage.MENU_CONTRIBUTION__MNEMONIC:
				setMnemonic((String)newValue);
				return;
			case EclipsePackage.MENU_CONTRIBUTION__PERSPECTIVES:
				getPerspectives().clear();
				getPerspectives().addAll((Collection<? extends Perspective>)newValue);
				return;
			case EclipsePackage.MENU_CONTRIBUTION__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case EclipsePackage.MENU_CONTRIBUTION__EDITORS:
				getEditors().clear();
				getEditors().addAll((Collection<? extends Editor>)newValue);
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
			case EclipsePackage.MENU_CONTRIBUTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EclipsePackage.MENU_CONTRIBUTION__COMMANDS:
				getCommands().clear();
				return;
			case EclipsePackage.MENU_CONTRIBUTION__MENU_CONTRIBUTIONS:
				getMenuContributions().clear();
				return;
			case EclipsePackage.MENU_CONTRIBUTION__MNEMONIC:
				setMnemonic(MNEMONIC_EDEFAULT);
				return;
			case EclipsePackage.MENU_CONTRIBUTION__PERSPECTIVES:
				getPerspectives().clear();
				return;
			case EclipsePackage.MENU_CONTRIBUTION__VIEWS:
				getViews().clear();
				return;
			case EclipsePackage.MENU_CONTRIBUTION__EDITORS:
				getEditors().clear();
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
			case EclipsePackage.MENU_CONTRIBUTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EclipsePackage.MENU_CONTRIBUTION__COMMANDS:
				return commands != null && !commands.isEmpty();
			case EclipsePackage.MENU_CONTRIBUTION__MENU_CONTRIBUTIONS:
				return menuContributions != null && !menuContributions.isEmpty();
			case EclipsePackage.MENU_CONTRIBUTION__MNEMONIC:
				return MNEMONIC_EDEFAULT == null ? mnemonic != null : !MNEMONIC_EDEFAULT.equals(mnemonic);
			case EclipsePackage.MENU_CONTRIBUTION__PERSPECTIVES:
				return perspectives != null && !perspectives.isEmpty();
			case EclipsePackage.MENU_CONTRIBUTION__VIEWS:
				return views != null && !views.isEmpty();
			case EclipsePackage.MENU_CONTRIBUTION__EDITORS:
				return editors != null && !editors.isEmpty();
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
		result.append(", mnemonic: ");
		result.append(mnemonic);
		result.append(')');
		return result.toString();
	}

} //MenuContributionImpl
