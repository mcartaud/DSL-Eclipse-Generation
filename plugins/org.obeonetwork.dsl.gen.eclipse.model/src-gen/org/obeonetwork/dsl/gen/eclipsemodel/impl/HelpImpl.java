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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage;
import org.obeonetwork.dsl.gen.eclipsemodel.Help;
import org.obeonetwork.dsl.gen.eclipsemodel.Page;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Help</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.HelpImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.HelpImpl#getHelpID <em>Help ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.HelpImpl#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HelpImpl extends MinimalEObjectImpl.Container implements Help
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
   * The default value of the '{@link #getHelpID() <em>Help ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelpID()
   * @generated
   * @ordered
   */
  protected static final String HELP_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHelpID() <em>Help ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelpID()
   * @generated
   * @ordered
   */
  protected String helpID = HELP_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPages()
   * @generated
   * @ordered
   */
  protected EList<Page> pages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HelpImpl()
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
    return EclipsemodelPackage.Literals.HELP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.HELP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHelpID()
  {
    return helpID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHelpID(String newHelpID)
  {
    String oldHelpID = helpID;
    helpID = newHelpID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.HELP__HELP_ID, oldHelpID, helpID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Page> getPages()
  {
    if (pages == null)
    {
      pages = new EObjectContainmentEList<Page>(Page.class, this, EclipsemodelPackage.HELP__PAGES);
    }
    return pages;
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
      case EclipsemodelPackage.HELP__PAGES:
        return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
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
      case EclipsemodelPackage.HELP__NAME:
        return getName();
      case EclipsemodelPackage.HELP__HELP_ID:
        return getHelpID();
      case EclipsemodelPackage.HELP__PAGES:
        return getPages();
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
      case EclipsemodelPackage.HELP__NAME:
        setName((String)newValue);
        return;
      case EclipsemodelPackage.HELP__HELP_ID:
        setHelpID((String)newValue);
        return;
      case EclipsemodelPackage.HELP__PAGES:
        getPages().clear();
        getPages().addAll((Collection<? extends Page>)newValue);
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
      case EclipsemodelPackage.HELP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsemodelPackage.HELP__HELP_ID:
        setHelpID(HELP_ID_EDEFAULT);
        return;
      case EclipsemodelPackage.HELP__PAGES:
        getPages().clear();
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
      case EclipsemodelPackage.HELP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsemodelPackage.HELP__HELP_ID:
        return HELP_ID_EDEFAULT == null ? helpID != null : !HELP_ID_EDEFAULT.equals(helpID);
      case EclipsemodelPackage.HELP__PAGES:
        return pages != null && !pages.isEmpty();
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
    result.append(", helpID: ");
    result.append(helpID);
    result.append(')');
    return result.toString();
  }

} //HelpImpl
