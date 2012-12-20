/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipsemodel.Action;
import org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage;
import org.obeonetwork.dsl.gen.eclipsemodel.Menu;
import org.obeonetwork.dsl.gen.eclipsemodel.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ViewImpl#getViewID <em>View ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ViewImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ViewImpl#getMenus <em>Menus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends PartImpl implements View
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
   * The default value of the '{@link #getViewID() <em>View ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewID()
   * @generated
   * @ordered
   */
  protected static final String VIEW_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getViewID() <em>View ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewID()
   * @generated
   * @ordered
   */
  protected String viewID = VIEW_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenus()
   * @generated
   * @ordered
   */
  protected EList<Menu> menus;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewImpl()
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
    return EclipsemodelPackage.Literals.VIEW;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.VIEW__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getViewID()
  {
    return viewID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewID(String newViewID)
  {
    String oldViewID = viewID;
    viewID = newViewID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.VIEW__VIEW_ID, oldViewID, viewID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, EclipsemodelPackage.VIEW__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Menu> getMenus()
  {
    if (menus == null)
    {
      menus = new EObjectContainmentEList<Menu>(Menu.class, this, EclipsemodelPackage.VIEW__MENUS);
    }
    return menus;
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
      case EclipsemodelPackage.VIEW__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case EclipsemodelPackage.VIEW__MENUS:
        return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
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
      case EclipsemodelPackage.VIEW__NAME:
        return getName();
      case EclipsemodelPackage.VIEW__VIEW_ID:
        return getViewID();
      case EclipsemodelPackage.VIEW__ACTIONS:
        return getActions();
      case EclipsemodelPackage.VIEW__MENUS:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EclipsemodelPackage.VIEW__NAME:
        setName((String)newValue);
        return;
      case EclipsemodelPackage.VIEW__VIEW_ID:
        setViewID((String)newValue);
        return;
      case EclipsemodelPackage.VIEW__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
        return;
      case EclipsemodelPackage.VIEW__MENUS:
        getMenus().clear();
        getMenus().addAll((Collection<? extends Menu>)newValue);
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
      case EclipsemodelPackage.VIEW__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsemodelPackage.VIEW__VIEW_ID:
        setViewID(VIEW_ID_EDEFAULT);
        return;
      case EclipsemodelPackage.VIEW__ACTIONS:
        getActions().clear();
        return;
      case EclipsemodelPackage.VIEW__MENUS:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EclipsemodelPackage.VIEW__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsemodelPackage.VIEW__VIEW_ID:
        return VIEW_ID_EDEFAULT == null ? viewID != null : !VIEW_ID_EDEFAULT.equals(viewID);
      case EclipsemodelPackage.VIEW__ACTIONS:
        return actions != null && !actions.isEmpty();
      case EclipsemodelPackage.VIEW__MENUS:
        return menus != null && !menus.isEmpty();
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
    result.append(", viewID: ");
    result.append(viewID);
    result.append(')');
    return result.toString();
  }

} //ViewImpl
