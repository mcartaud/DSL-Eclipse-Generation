/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage;
import org.obeonetwork.dsl.gen.eclipsemodel.Service;
import org.obeonetwork.dsl.gen.eclipsemodel.ServiceKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ServiceImpl#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ServiceImpl#getServiceKinds <em>Service Kinds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service
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
   * The default value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceID()
   * @generated
   * @ordered
   */
  protected static final String SERVICE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceID()
   * @generated
   * @ordered
   */
  protected String serviceID = SERVICE_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getServiceKinds() <em>Service Kinds</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceKinds()
   * @generated
   * @ordered
   */
  protected EList<ServiceKind> serviceKinds;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceImpl()
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
    return EclipsemodelPackage.Literals.SERVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.SERVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServiceID()
  {
    return serviceID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceID(String newServiceID)
  {
    String oldServiceID = serviceID;
    serviceID = newServiceID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.SERVICE__SERVICE_ID, oldServiceID, serviceID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceKind> getServiceKinds()
  {
    if (serviceKinds == null)
    {
      serviceKinds = new EDataTypeEList<ServiceKind>(ServiceKind.class, this, EclipsemodelPackage.SERVICE__SERVICE_KINDS);
    }
    return serviceKinds;
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
      case EclipsemodelPackage.SERVICE__NAME:
        return getName();
      case EclipsemodelPackage.SERVICE__SERVICE_ID:
        return getServiceID();
      case EclipsemodelPackage.SERVICE__SERVICE_KINDS:
        return getServiceKinds();
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
      case EclipsemodelPackage.SERVICE__NAME:
        setName((String)newValue);
        return;
      case EclipsemodelPackage.SERVICE__SERVICE_ID:
        setServiceID((String)newValue);
        return;
      case EclipsemodelPackage.SERVICE__SERVICE_KINDS:
        getServiceKinds().clear();
        getServiceKinds().addAll((Collection<? extends ServiceKind>)newValue);
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
      case EclipsemodelPackage.SERVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsemodelPackage.SERVICE__SERVICE_ID:
        setServiceID(SERVICE_ID_EDEFAULT);
        return;
      case EclipsemodelPackage.SERVICE__SERVICE_KINDS:
        getServiceKinds().clear();
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
      case EclipsemodelPackage.SERVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsemodelPackage.SERVICE__SERVICE_ID:
        return SERVICE_ID_EDEFAULT == null ? serviceID != null : !SERVICE_ID_EDEFAULT.equals(serviceID);
      case EclipsemodelPackage.SERVICE__SERVICE_KINDS:
        return serviceKinds != null && !serviceKinds.isEmpty();
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
    result.append(", serviceID: ");
    result.append(serviceID);
    result.append(", serviceKinds: ");
    result.append(serviceKinds);
    result.append(')');
    return result.toString();
  }

} //ServiceImpl
