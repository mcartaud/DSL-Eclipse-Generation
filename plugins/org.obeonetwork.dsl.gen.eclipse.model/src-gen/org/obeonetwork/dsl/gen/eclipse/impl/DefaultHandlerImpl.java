/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.DefaultHandler;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.DefaultHandlerImpl#getDefaultCommand <em>Default Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultHandlerImpl extends HandlerImpl implements DefaultHandler {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.DEFAULT_HANDLER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.DEFAULT_HANDLER__DEFAULT_COMMAND, oldDefaultCommand, defaultCommand));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.DEFAULT_HANDLER__DEFAULT_COMMAND, oldDefaultCommand, newDefaultCommand);
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
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.DEFAULT_HANDLER__DEFAULT_COMMAND, newDefaultCommand, newDefaultCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipsePackage.DEFAULT_HANDLER__DEFAULT_COMMAND:
				if (defaultCommand != null)
					msgs = ((InternalEObject)defaultCommand).eInverseRemove(this, EclipsePackage.COMMAND__DEFAULT_HANDLER, Command.class, msgs);
				return basicSetDefaultCommand((Command)otherEnd, msgs);
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
			case EclipsePackage.DEFAULT_HANDLER__DEFAULT_COMMAND:
				return basicSetDefaultCommand(null, msgs);
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
			case EclipsePackage.DEFAULT_HANDLER__DEFAULT_COMMAND:
				if (resolve) return getDefaultCommand();
				return basicGetDefaultCommand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EclipsePackage.DEFAULT_HANDLER__DEFAULT_COMMAND:
				setDefaultCommand((Command)newValue);
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
			case EclipsePackage.DEFAULT_HANDLER__DEFAULT_COMMAND:
				setDefaultCommand((Command)null);
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
			case EclipsePackage.DEFAULT_HANDLER__DEFAULT_COMMAND:
				return defaultCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //DefaultHandlerImpl
