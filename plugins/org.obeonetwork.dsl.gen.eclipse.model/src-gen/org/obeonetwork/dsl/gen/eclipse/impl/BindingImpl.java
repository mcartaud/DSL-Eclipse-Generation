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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.gen.eclipse.Binding;
import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.Context;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BindingImpl#getKeySequence <em>Key Sequence</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BindingImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BindingImpl#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends EObjectImpl implements Binding {
	/**
	 * The default value of the '{@link #getKeySequence() <em>Key Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySequence()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeySequence() <em>Key Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySequence()
	 * @generated
	 * @ordered
	 */
	protected String keySequence = KEY_SEQUENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected Command command;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> contexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeySequence() {
		return keySequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeySequence(String newKeySequence) {
		String oldKeySequence = keySequence;
		keySequence = newKeySequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.BINDING__KEY_SEQUENCE, oldKeySequence, keySequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getCommand() {
		if (command != null && command.eIsProxy()) {
			InternalEObject oldCommand = (InternalEObject)command;
			command = (Command)eResolveProxy(oldCommand);
			if (command != oldCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.BINDING__COMMAND, oldCommand, command));
			}
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(Command newCommand, NotificationChain msgs) {
		Command oldCommand = command;
		command = newCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.BINDING__COMMAND, oldCommand, newCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(Command newCommand) {
		if (newCommand != command) {
			NotificationChain msgs = null;
			if (command != null)
				msgs = ((InternalEObject)command).eInverseRemove(this, EclipsePackage.COMMAND__BINDING, Command.class, msgs);
			if (newCommand != null)
				msgs = ((InternalEObject)newCommand).eInverseAdd(this, EclipsePackage.COMMAND__BINDING, Command.class, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.BINDING__COMMAND, newCommand, newCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getContexts() {
		if (contexts == null) {
			contexts = new EObjectResolvingEList<Context>(Context.class, this, EclipsePackage.BINDING__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipsePackage.BINDING__COMMAND:
				if (command != null)
					msgs = ((InternalEObject)command).eInverseRemove(this, EclipsePackage.COMMAND__BINDING, Command.class, msgs);
				return basicSetCommand((Command)otherEnd, msgs);
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
			case EclipsePackage.BINDING__COMMAND:
				return basicSetCommand(null, msgs);
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
			case EclipsePackage.BINDING__KEY_SEQUENCE:
				return getKeySequence();
			case EclipsePackage.BINDING__COMMAND:
				if (resolve) return getCommand();
				return basicGetCommand();
			case EclipsePackage.BINDING__CONTEXTS:
				return getContexts();
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
			case EclipsePackage.BINDING__KEY_SEQUENCE:
				setKeySequence((String)newValue);
				return;
			case EclipsePackage.BINDING__COMMAND:
				setCommand((Command)newValue);
				return;
			case EclipsePackage.BINDING__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends Context>)newValue);
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
			case EclipsePackage.BINDING__KEY_SEQUENCE:
				setKeySequence(KEY_SEQUENCE_EDEFAULT);
				return;
			case EclipsePackage.BINDING__COMMAND:
				setCommand((Command)null);
				return;
			case EclipsePackage.BINDING__CONTEXTS:
				getContexts().clear();
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
			case EclipsePackage.BINDING__KEY_SEQUENCE:
				return KEY_SEQUENCE_EDEFAULT == null ? keySequence != null : !KEY_SEQUENCE_EDEFAULT.equals(keySequence);
			case EclipsePackage.BINDING__COMMAND:
				return command != null;
			case EclipsePackage.BINDING__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
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
		result.append(" (keySequence: ");
		result.append(keySequence);
		result.append(')');
		return result.toString();
	}

} //BindingImpl
