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

import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Menu;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl#getMnemonic <em>Mnemonic</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl#isMenuContribution <em>Menu Contribution</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl#isToolbarContribution <em>Toolbar Contribution</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuImpl extends EObjectImpl implements Menu {
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
	 * The default value of the '{@link #isMenuContribution() <em>Menu Contribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMenuContribution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MENU_CONTRIBUTION_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isMenuContribution() <em>Menu Contribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMenuContribution()
	 * @generated
	 * @ordered
	 */
	protected static final int MENU_CONTRIBUTION_EFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #isToolbarContribution() <em>Toolbar Contribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToolbarContribution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOOLBAR_CONTRIBUTION_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isToolbarContribution() <em>Toolbar Contribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToolbarContribution()
	 * @generated
	 * @ordered
	 */
	protected static final int TOOLBAR_CONTRIBUTION_EFLAG = 1 << 9;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
		eFlags |= MENU_CONTRIBUTION_EFLAG;
		eFlags |= TOOLBAR_CONTRIBUTION_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.MENU;
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
					EclipsePackage.MENU__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.MENU__MNEMONIC, oldMnemonic, mnemonic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMenuContribution() {
		return (eFlags & MENU_CONTRIBUTION_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuContribution(boolean newMenuContribution) {
		boolean oldMenuContribution = (eFlags & MENU_CONTRIBUTION_EFLAG) != 0;
		if (newMenuContribution)
			eFlags |= MENU_CONTRIBUTION_EFLAG;
		else
			eFlags &= ~MENU_CONTRIBUTION_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.MENU__MENU_CONTRIBUTION,
					oldMenuContribution, newMenuContribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToolbarContribution() {
		return (eFlags & TOOLBAR_CONTRIBUTION_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolbarContribution(boolean newToolbarContribution) {
		boolean oldToolbarContribution = (eFlags & TOOLBAR_CONTRIBUTION_EFLAG) != 0;
		if (newToolbarContribution)
			eFlags |= TOOLBAR_CONTRIBUTION_EFLAG;
		else
			eFlags &= ~TOOLBAR_CONTRIBUTION_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EclipsePackage.MENU__TOOLBAR_CONTRIBUTION,
					oldToolbarContribution, newToolbarContribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectWithInverseResolvingEList<Command>(
					Command.class, this, EclipsePackage.MENU__COMMANDS,
					EclipsePackage.COMMAND__MENU);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EclipsePackage.MENU__COMMANDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCommands())
					.basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
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
		case EclipsePackage.MENU__COMMANDS:
			return ((InternalEList<?>) getCommands()).basicRemove(otherEnd,
					msgs);
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
		case EclipsePackage.MENU__NAME:
			return getName();
		case EclipsePackage.MENU__MNEMONIC:
			return getMnemonic();
		case EclipsePackage.MENU__MENU_CONTRIBUTION:
			return isMenuContribution();
		case EclipsePackage.MENU__TOOLBAR_CONTRIBUTION:
			return isToolbarContribution();
		case EclipsePackage.MENU__COMMANDS:
			return getCommands();
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
		case EclipsePackage.MENU__NAME:
			setName((String) newValue);
			return;
		case EclipsePackage.MENU__MNEMONIC:
			setMnemonic((String) newValue);
			return;
		case EclipsePackage.MENU__MENU_CONTRIBUTION:
			setMenuContribution((Boolean) newValue);
			return;
		case EclipsePackage.MENU__TOOLBAR_CONTRIBUTION:
			setToolbarContribution((Boolean) newValue);
			return;
		case EclipsePackage.MENU__COMMANDS:
			getCommands().clear();
			getCommands().addAll((Collection<? extends Command>) newValue);
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
		case EclipsePackage.MENU__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EclipsePackage.MENU__MNEMONIC:
			setMnemonic(MNEMONIC_EDEFAULT);
			return;
		case EclipsePackage.MENU__MENU_CONTRIBUTION:
			setMenuContribution(MENU_CONTRIBUTION_EDEFAULT);
			return;
		case EclipsePackage.MENU__TOOLBAR_CONTRIBUTION:
			setToolbarContribution(TOOLBAR_CONTRIBUTION_EDEFAULT);
			return;
		case EclipsePackage.MENU__COMMANDS:
			getCommands().clear();
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
		case EclipsePackage.MENU__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case EclipsePackage.MENU__MNEMONIC:
			return MNEMONIC_EDEFAULT == null ? mnemonic != null
					: !MNEMONIC_EDEFAULT.equals(mnemonic);
		case EclipsePackage.MENU__MENU_CONTRIBUTION:
			return ((eFlags & MENU_CONTRIBUTION_EFLAG) != 0) != MENU_CONTRIBUTION_EDEFAULT;
		case EclipsePackage.MENU__TOOLBAR_CONTRIBUTION:
			return ((eFlags & TOOLBAR_CONTRIBUTION_EFLAG) != 0) != TOOLBAR_CONTRIBUTION_EDEFAULT;
		case EclipsePackage.MENU__COMMANDS:
			return commands != null && !commands.isEmpty();
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
		result.append(", mnemonic: ");
		result.append(mnemonic);
		result.append(", menuContribution: ");
		result.append((eFlags & MENU_CONTRIBUTION_EFLAG) != 0);
		result.append(", toolbarContribution: ");
		result.append((eFlags & TOOLBAR_CONTRIBUTION_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

} //MenuImpl
