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
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipse.ActionSet;
import org.obeonetwork.dsl.gen.eclipse.DynamicHelp;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl#getActionSets <em>Action Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl#getDynamicHelp <em>Dynamic Help</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PartImpl extends MinimalEObjectImpl.Container implements Part
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
   * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected static final String ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected String icon = ICON_EDEFAULT;

  /**
   * The cached value of the '{@link #getActionSets() <em>Action Sets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionSets()
   * @generated
   * @ordered
   */
  protected EList<ActionSet> actionSets;

  /**
   * The cached value of the '{@link #getDynamicHelp() <em>Dynamic Help</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDynamicHelp()
   * @generated
   * @ordered
   */
  protected DynamicHelp dynamicHelp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PartImpl()
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
    return EclipsePackage.Literals.PART;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.PART__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIcon()
  {
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcon(String newIcon)
  {
    String oldIcon = icon;
    icon = newIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.PART__ICON, oldIcon, icon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionSet> getActionSets()
  {
    if (actionSets == null)
    {
      actionSets = new EObjectContainmentEList<ActionSet>(ActionSet.class, this, EclipsePackage.PART__ACTION_SETS);
    }
    return actionSets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicHelp getDynamicHelp()
  {
    return dynamicHelp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDynamicHelp(DynamicHelp newDynamicHelp, NotificationChain msgs)
  {
    DynamicHelp oldDynamicHelp = dynamicHelp;
    dynamicHelp = newDynamicHelp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipsePackage.PART__DYNAMIC_HELP, oldDynamicHelp, newDynamicHelp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDynamicHelp(DynamicHelp newDynamicHelp)
  {
    if (newDynamicHelp != dynamicHelp)
    {
      NotificationChain msgs = null;
      if (dynamicHelp != null)
        msgs = ((InternalEObject)dynamicHelp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclipsePackage.PART__DYNAMIC_HELP, null, msgs);
      if (newDynamicHelp != null)
        msgs = ((InternalEObject)newDynamicHelp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclipsePackage.PART__DYNAMIC_HELP, null, msgs);
      msgs = basicSetDynamicHelp(newDynamicHelp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.PART__DYNAMIC_HELP, newDynamicHelp, newDynamicHelp));
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
      case EclipsePackage.PART__ACTION_SETS:
        return ((InternalEList<?>)getActionSets()).basicRemove(otherEnd, msgs);
      case EclipsePackage.PART__DYNAMIC_HELP:
        return basicSetDynamicHelp(null, msgs);
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
      case EclipsePackage.PART__NAME:
        return getName();
      case EclipsePackage.PART__ICON:
        return getIcon();
      case EclipsePackage.PART__ACTION_SETS:
        return getActionSets();
      case EclipsePackage.PART__DYNAMIC_HELP:
        return getDynamicHelp();
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
      case EclipsePackage.PART__NAME:
        setName((String)newValue);
        return;
      case EclipsePackage.PART__ICON:
        setIcon((String)newValue);
        return;
      case EclipsePackage.PART__ACTION_SETS:
        getActionSets().clear();
        getActionSets().addAll((Collection<? extends ActionSet>)newValue);
        return;
      case EclipsePackage.PART__DYNAMIC_HELP:
        setDynamicHelp((DynamicHelp)newValue);
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
      case EclipsePackage.PART__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsePackage.PART__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case EclipsePackage.PART__ACTION_SETS:
        getActionSets().clear();
        return;
      case EclipsePackage.PART__DYNAMIC_HELP:
        setDynamicHelp((DynamicHelp)null);
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
      case EclipsePackage.PART__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsePackage.PART__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case EclipsePackage.PART__ACTION_SETS:
        return actionSets != null && !actionSets.isEmpty();
      case EclipsePackage.PART__DYNAMIC_HELP:
        return dynamicHelp != null;
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
    result.append(", icon: ");
    result.append(icon);
    result.append(')');
    return result.toString();
  }

} //PartImpl
