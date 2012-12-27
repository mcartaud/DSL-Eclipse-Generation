/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.ProvidedService;
import org.obeonetwork.dsl.gen.eclipse.RequiredService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ProvidedServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ProvidedServiceImpl#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ProvidedServiceImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ProvidedServiceImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.ProvidedServiceImpl#getRequiredServices <em>Required Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidedServiceImpl extends MinimalEObjectImpl.Container implements ProvidedService
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
   * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementation()
   * @generated
   * @ordered
   */
  protected EClass implementation;

  /**
   * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected EClass interface_;

  /**
   * The cached value of the '{@link #getRequiredServices() <em>Required Services</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredServices()
   * @generated
   * @ordered
   */
  protected EList<RequiredService> requiredServices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvidedServiceImpl()
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
    return EclipsePackage.Literals.PROVIDED_SERVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.PROVIDED_SERVICE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.PROVIDED_SERVICE__SERVICE_ID, oldServiceID, serviceID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplementation()
  {
    if (implementation != null && implementation.eIsProxy())
    {
      InternalEObject oldImplementation = (InternalEObject)implementation;
      implementation = (EClass)eResolveProxy(oldImplementation);
      if (implementation != oldImplementation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.PROVIDED_SERVICE__IMPLEMENTATION, oldImplementation, implementation));
      }
    }
    return implementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetImplementation()
  {
    return implementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplementation(EClass newImplementation)
  {
    EClass oldImplementation = implementation;
    implementation = newImplementation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.PROVIDED_SERVICE__IMPLEMENTATION, oldImplementation, implementation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface()
  {
    if (interface_ != null && interface_.eIsProxy())
    {
      InternalEObject oldInterface = (InternalEObject)interface_;
      interface_ = (EClass)eResolveProxy(oldInterface);
      if (interface_ != oldInterface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.PROVIDED_SERVICE__INTERFACE, oldInterface, interface_));
      }
    }
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(EClass newInterface)
  {
    EClass oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.PROVIDED_SERVICE__INTERFACE, oldInterface, interface_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RequiredService> getRequiredServices()
  {
    if (requiredServices == null)
    {
      requiredServices = new EObjectResolvingEList<RequiredService>(RequiredService.class, this, EclipsePackage.PROVIDED_SERVICE__REQUIRED_SERVICES);
    }
    return requiredServices;
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
      case EclipsePackage.PROVIDED_SERVICE__NAME:
        return getName();
      case EclipsePackage.PROVIDED_SERVICE__SERVICE_ID:
        return getServiceID();
      case EclipsePackage.PROVIDED_SERVICE__IMPLEMENTATION:
        if (resolve) return getImplementation();
        return basicGetImplementation();
      case EclipsePackage.PROVIDED_SERVICE__INTERFACE:
        if (resolve) return getInterface();
        return basicGetInterface();
      case EclipsePackage.PROVIDED_SERVICE__REQUIRED_SERVICES:
        return getRequiredServices();
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
      case EclipsePackage.PROVIDED_SERVICE__NAME:
        setName((String)newValue);
        return;
      case EclipsePackage.PROVIDED_SERVICE__SERVICE_ID:
        setServiceID((String)newValue);
        return;
      case EclipsePackage.PROVIDED_SERVICE__IMPLEMENTATION:
        setImplementation((EClass)newValue);
        return;
      case EclipsePackage.PROVIDED_SERVICE__INTERFACE:
        setInterface((EClass)newValue);
        return;
      case EclipsePackage.PROVIDED_SERVICE__REQUIRED_SERVICES:
        getRequiredServices().clear();
        getRequiredServices().addAll((Collection<? extends RequiredService>)newValue);
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
      case EclipsePackage.PROVIDED_SERVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsePackage.PROVIDED_SERVICE__SERVICE_ID:
        setServiceID(SERVICE_ID_EDEFAULT);
        return;
      case EclipsePackage.PROVIDED_SERVICE__IMPLEMENTATION:
        setImplementation((EClass)null);
        return;
      case EclipsePackage.PROVIDED_SERVICE__INTERFACE:
        setInterface((EClass)null);
        return;
      case EclipsePackage.PROVIDED_SERVICE__REQUIRED_SERVICES:
        getRequiredServices().clear();
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
      case EclipsePackage.PROVIDED_SERVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsePackage.PROVIDED_SERVICE__SERVICE_ID:
        return SERVICE_ID_EDEFAULT == null ? serviceID != null : !SERVICE_ID_EDEFAULT.equals(serviceID);
      case EclipsePackage.PROVIDED_SERVICE__IMPLEMENTATION:
        return implementation != null;
      case EclipsePackage.PROVIDED_SERVICE__INTERFACE:
        return interface_ != null;
      case EclipsePackage.PROVIDED_SERVICE__REQUIRED_SERVICES:
        return requiredServices != null && !requiredServices.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ProvidedServiceImpl