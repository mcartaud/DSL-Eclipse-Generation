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
import org.obeonetwork.dsl.gen.eclipse.Handler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.HandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.HandlerImpl#getMnemonic <em>Mnemonic</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.HandlerImpl#getDefaultCommand <em>Default Command</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.HandlerImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandlerImpl extends EObjectImpl implements Handler {
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
	protected static final char MNEMONIC_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getMnemonic() <em>Mnemonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMnemonic()
	 * @generated
	 * @ordered
	 */
	protected char mnemonic = MNEMONIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultCommand() <em>Default Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCommand()
	 * @generated
	 * @ordered
	 */
	protected Command defaultCommand;

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
	protected HandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.HANDLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.HANDLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getMnemonic() {
		return mnemonic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMnemonic(char newMnemonic) {
		char oldMnemonic = mnemonic;
		mnemonic = newMnemonic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.HANDLER__MNEMONIC, oldMnemonic, mnemonic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getDefaultCommand() {
		if (defaultCommand != null && defaultCommand.eIsProxy()) {
			InternalEObject oldDefaultCommand = (InternalEObject)defaultCommand;
			defaultCommand = (Command)eResolveProxy(oldDefaultCommand);
			if (defaultCommand != oldDefaultCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.HANDLER__DEFAULT_COMMAND, oldDefaultCommand, defaultCommand));
			}
		}
		return defaultCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetDefaultCommand() {
		return defaultCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultCommand(Command newDefaultCommand, NotificationChain msgs) {
		Command oldDefaultCommand = defaultCommand;
		defaultCommand = newDefaultCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.HANDLER__DEFAULT_COMMAND, oldDefaultCommand, newDefaultCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCommand(Command newDefaultCommand) {
		if (newDefaultCommand != defaultCommand) {
			NotificationChain msgs = null;
			if (defaultCommand != null)
				msgs = ((InternalEObject)defaultCommand).eInverseRemove(this, EclipsePackage.COMMAND__DEFAULT_HANDLER, Command.class, msgs);
			if (newDefaultCommand != null)
				msgs = ((InternalEObject)newDefaultCommand).eInverseAdd(this, EclipsePackage.COMMAND__DEFAULT_HANDLER, Command.class, msgs);
			msgs = basicSetDefaultCommand(newDefaultCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.HANDLER__DEFAULT_COMMAND, newDefaultCommand, newDefaultCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectWithInverseResolvingEList.ManyInverse<Command>(Command.class, this, EclipsePackage.HANDLER__COMMANDS, EclipsePackage.COMMAND__HANDLERS);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipsePackage.HANDLER__DEFAULT_COMMAND:
				if (defaultCommand != null)
					msgs = ((InternalEObject)defaultCommand).eInverseRemove(this, EclipsePackage.COMMAND__DEFAULT_HANDLER, Command.class, msgs);
				return basicSetDefaultCommand((Command)otherEnd, msgs);
			case EclipsePackage.HANDLER__COMMANDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommands()).basicAdd(otherEnd, msgs);
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
			case EclipsePackage.HANDLER__DEFAULT_COMMAND:
				return basicSetDefaultCommand(null, msgs);
			case EclipsePackage.HANDLER__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
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
			case EclipsePackage.HANDLER__NAME:
				return getName();
			case EclipsePackage.HANDLER__MNEMONIC:
				return getMnemonic();
			case EclipsePackage.HANDLER__DEFAULT_COMMAND:
				if (resolve) return getDefaultCommand();
				return basicGetDefaultCommand();
			case EclipsePackage.HANDLER__COMMANDS:
				return getCommands();
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
			case EclipsePackage.HANDLER__NAME:
				setName((String)newValue);
				return;
			case EclipsePackage.HANDLER__MNEMONIC:
				setMnemonic((Character)newValue);
				return;
			case EclipsePackage.HANDLER__DEFAULT_COMMAND:
				setDefaultCommand((Command)newValue);
				return;
			case EclipsePackage.HANDLER__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
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
			case EclipsePackage.HANDLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EclipsePackage.HANDLER__MNEMONIC:
				setMnemonic(MNEMONIC_EDEFAULT);
				return;
			case EclipsePackage.HANDLER__DEFAULT_COMMAND:
				setDefaultCommand((Command)null);
				return;
			case EclipsePackage.HANDLER__COMMANDS:
				getCommands().clear();
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
			case EclipsePackage.HANDLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EclipsePackage.HANDLER__MNEMONIC:
				return mnemonic != MNEMONIC_EDEFAULT;
			case EclipsePackage.HANDLER__DEFAULT_COMMAND:
				return defaultCommand != null;
			case EclipsePackage.HANDLER__COMMANDS:
				return commands != null && !commands.isEmpty();
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

} //HandlerImpl
