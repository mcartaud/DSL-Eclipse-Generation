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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.Context;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Perspective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextImpl#getPerspective <em>Perspective</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context
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
   * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContexts()
   * @generated
   * @ordered
   */
  protected EList<Context> contexts;

  /**
   * The cached value of the '{@link #getPerspective() <em>Perspective</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerspective()
   * @generated
   * @ordered
   */
  protected Perspective perspective;

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
  protected ContextImpl()
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
    return EclipsePackage.Literals.CONTEXT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.CONTEXT__NAME, oldName, name));
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
      contexts = new EObjectContainmentEList<Context>(Context.class, this, EclipsePackage.CONTEXT__CONTEXTS);
    }
    return contexts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Perspective getPerspective()
  {
    if (perspective != null && perspective.eIsProxy())
    {
      InternalEObject oldPerspective = (InternalEObject)perspective;
      perspective = (Perspective)eResolveProxy(oldPerspective);
      if (perspective != oldPerspective)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.CONTEXT__PERSPECTIVE, oldPerspective, perspective));
      }
    }
    return perspective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Perspective basicGetPerspective()
  {
    return perspective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPerspective(Perspective newPerspective, NotificationChain msgs)
  {
    Perspective oldPerspective = perspective;
    perspective = newPerspective;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.CONTEXT__PERSPECTIVE, oldPerspective, newPerspective);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPerspective(Perspective newPerspective)
  {
    if (newPerspective != perspective)
    {
      NotificationChain msgs = null;
      if (perspective != null)
        msgs = ((InternalEObject)perspective).eInverseRemove(this, EclipsePackage.PERSPECTIVE__CONTEXT, Perspective.class, msgs);
      if (newPerspective != null)
        msgs = ((InternalEObject)newPerspective).eInverseAdd(this, EclipsePackage.PERSPECTIVE__CONTEXT, Perspective.class, msgs);
      msgs = basicSetPerspective(newPerspective, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.CONTEXT__PERSPECTIVE, newPerspective, newPerspective));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectWithInverseResolvingEList<Command>(Command.class, this, EclipsePackage.CONTEXT__COMMANDS, EclipsePackage.COMMAND__CONTEXT);
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
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EclipsePackage.CONTEXT__PERSPECTIVE:
        if (perspective != null)
          msgs = ((InternalEObject)perspective).eInverseRemove(this, EclipsePackage.PERSPECTIVE__CONTEXT, Perspective.class, msgs);
        return basicSetPerspective((Perspective)otherEnd, msgs);
      case EclipsePackage.CONTEXT__COMMANDS:
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
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EclipsePackage.CONTEXT__CONTEXTS:
        return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
      case EclipsePackage.CONTEXT__PERSPECTIVE:
        return basicSetPerspective(null, msgs);
      case EclipsePackage.CONTEXT__COMMANDS:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EclipsePackage.CONTEXT__NAME:
        return getName();
      case EclipsePackage.CONTEXT__CONTEXTS:
        return getContexts();
      case EclipsePackage.CONTEXT__PERSPECTIVE:
        if (resolve) return getPerspective();
        return basicGetPerspective();
      case EclipsePackage.CONTEXT__COMMANDS:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EclipsePackage.CONTEXT__NAME:
        setName((String)newValue);
        return;
      case EclipsePackage.CONTEXT__CONTEXTS:
        getContexts().clear();
        getContexts().addAll((Collection<? extends Context>)newValue);
        return;
      case EclipsePackage.CONTEXT__PERSPECTIVE:
        setPerspective((Perspective)newValue);
        return;
      case EclipsePackage.CONTEXT__COMMANDS:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EclipsePackage.CONTEXT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsePackage.CONTEXT__CONTEXTS:
        getContexts().clear();
        return;
      case EclipsePackage.CONTEXT__PERSPECTIVE:
        setPerspective((Perspective)null);
        return;
      case EclipsePackage.CONTEXT__COMMANDS:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EclipsePackage.CONTEXT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsePackage.CONTEXT__CONTEXTS:
        return contexts != null && !contexts.isEmpty();
      case EclipsePackage.CONTEXT__PERSPECTIVE:
        return perspective != null;
      case EclipsePackage.CONTEXT__COMMANDS:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ContextImpl
