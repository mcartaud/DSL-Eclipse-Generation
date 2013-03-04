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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.Context;
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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.HandlerImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.HandlerImpl#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandlerImpl extends MinimalEObjectImpl.Container implements Handler
{
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
  protected HandlerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EclipsePackage.Literals.HANDLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
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
  public String getMnemonic()
  {
    return mnemonic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMnemonic(String newMnemonic)
  {
    String oldMnemonic = mnemonic;
    mnemonic = newMnemonic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.HANDLER__MNEMONIC, oldMnemonic, mnemonic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command getCommand()
  {
    if (command != null && command.eIsProxy())
    {
      InternalEObject oldCommand = (InternalEObject)command;
      command = (Command)eResolveProxy(oldCommand);
      if (command != oldCommand)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.HANDLER__COMMAND, oldCommand, command));
      }
    }
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command basicGetCommand()
  {
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommand(Command newCommand, NotificationChain msgs)
  {
    Command oldCommand = command;
    command = newCommand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.HANDLER__COMMAND, oldCommand, newCommand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommand(Command newCommand)
  {
    if (newCommand != command)
    {
      NotificationChain msgs = null;
      if (command != null)
        msgs = ((InternalEObject)command).eInverseRemove(this, EclipsePackage.COMMAND__HANDLER, Command.class, msgs);
      if (newCommand != null)
        msgs = ((InternalEObject)newCommand).eInverseAdd(this, EclipsePackage.COMMAND__HANDLER, Command.class, msgs);
      msgs = basicSetCommand(newCommand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.HANDLER__COMMAND, newCommand, newCommand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Context> getContexts()
  {
    if (contexts == null)
    {
      contexts = new EObjectResolvingEList<Context>(Context.class, this, EclipsePackage.HANDLER__CONTEXTS);
    }
    return contexts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EclipsePackage.HANDLER__COMMAND:
        if (command != null)
          msgs = ((InternalEObject)command).eInverseRemove(this, EclipsePackage.COMMAND__HANDLER, Command.class, msgs);
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
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EclipsePackage.HANDLER__COMMAND:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EclipsePackage.HANDLER__NAME:
        return getName();
      case EclipsePackage.HANDLER__MNEMONIC:
        return getMnemonic();
      case EclipsePackage.HANDLER__COMMAND:
        if (resolve) return getCommand();
        return basicGetCommand();
      case EclipsePackage.HANDLER__CONTEXTS:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EclipsePackage.HANDLER__NAME:
        setName((String)newValue);
        return;
      case EclipsePackage.HANDLER__MNEMONIC:
        setMnemonic((String)newValue);
        return;
      case EclipsePackage.HANDLER__COMMAND:
        setCommand((Command)newValue);
        return;
      case EclipsePackage.HANDLER__CONTEXTS:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EclipsePackage.HANDLER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsePackage.HANDLER__MNEMONIC:
        setMnemonic(MNEMONIC_EDEFAULT);
        return;
      case EclipsePackage.HANDLER__COMMAND:
        setCommand((Command)null);
        return;
      case EclipsePackage.HANDLER__CONTEXTS:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EclipsePackage.HANDLER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsePackage.HANDLER__MNEMONIC:
        return MNEMONIC_EDEFAULT == null ? mnemonic != null : !MNEMONIC_EDEFAULT.equals(mnemonic);
      case EclipsePackage.HANDLER__COMMAND:
        return command != null;
      case EclipsePackage.HANDLER__CONTEXTS:
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
  public String toString()
  {
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
