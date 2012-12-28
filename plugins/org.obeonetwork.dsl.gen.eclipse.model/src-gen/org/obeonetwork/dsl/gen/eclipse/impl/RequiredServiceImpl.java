/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.RequiredService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl#getBindedReference <em>Binded Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredServiceImpl extends MinimalEObjectImpl.Container implements RequiredService
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
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected static final Integer LOWER_BOUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected Integer lowerBound = LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected static final Integer UPPER_BOUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected Integer upperBound = UPPER_BOUND_EDEFAULT;

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
   * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementation()
   * @generated
   * @ordered
   */
  protected EClass implementation;

  /**
   * The cached value of the '{@link #getBindedReference() <em>Binded Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindedReference()
   * @generated
   * @ordered
   */
  protected EReference bindedReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequiredServiceImpl()
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
    return EclipsePackage.Literals.REQUIRED_SERVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.REQUIRED_SERVICE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.REQUIRED_SERVICE__SERVICE_ID, oldServiceID, serviceID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(Integer newLowerBound)
  {
    Integer oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.REQUIRED_SERVICE__LOWER_BOUND, oldLowerBound, lowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getUpperBound()
  {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBound(Integer newUpperBound)
  {
    Integer oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.REQUIRED_SERVICE__UPPER_BOUND, oldUpperBound, upperBound));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.REQUIRED_SERVICE__INTERFACE, oldInterface, interface_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.REQUIRED_SERVICE__INTERFACE, oldInterface, interface_));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.REQUIRED_SERVICE__IMPLEMENTATION, oldImplementation, implementation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.REQUIRED_SERVICE__IMPLEMENTATION, oldImplementation, implementation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindedReference()
  {
    if (bindedReference != null && bindedReference.eIsProxy())
    {
      InternalEObject oldBindedReference = (InternalEObject)bindedReference;
      bindedReference = (EReference)eResolveProxy(oldBindedReference);
      if (bindedReference != oldBindedReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EclipsePackage.REQUIRED_SERVICE__BINDED_REFERENCE, oldBindedReference, bindedReference));
      }
    }
    return bindedReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetBindedReference()
  {
    return bindedReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBindedReference(EReference newBindedReference)
  {
    EReference oldBindedReference = bindedReference;
    bindedReference = newBindedReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.REQUIRED_SERVICE__BINDED_REFERENCE, oldBindedReference, bindedReference));
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
      case EclipsePackage.REQUIRED_SERVICE__NAME:
        return getName();
      case EclipsePackage.REQUIRED_SERVICE__SERVICE_ID:
        return getServiceID();
      case EclipsePackage.REQUIRED_SERVICE__LOWER_BOUND:
        return getLowerBound();
      case EclipsePackage.REQUIRED_SERVICE__UPPER_BOUND:
        return getUpperBound();
      case EclipsePackage.REQUIRED_SERVICE__INTERFACE:
        if (resolve) return getInterface();
        return basicGetInterface();
      case EclipsePackage.REQUIRED_SERVICE__IMPLEMENTATION:
        if (resolve) return getImplementation();
        return basicGetImplementation();
      case EclipsePackage.REQUIRED_SERVICE__BINDED_REFERENCE:
        if (resolve) return getBindedReference();
        return basicGetBindedReference();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EclipsePackage.REQUIRED_SERVICE__NAME:
        setName((String)newValue);
        return;
      case EclipsePackage.REQUIRED_SERVICE__SERVICE_ID:
        setServiceID((String)newValue);
        return;
      case EclipsePackage.REQUIRED_SERVICE__LOWER_BOUND:
        setLowerBound((Integer)newValue);
        return;
      case EclipsePackage.REQUIRED_SERVICE__UPPER_BOUND:
        setUpperBound((Integer)newValue);
        return;
      case EclipsePackage.REQUIRED_SERVICE__INTERFACE:
        setInterface((EClass)newValue);
        return;
      case EclipsePackage.REQUIRED_SERVICE__IMPLEMENTATION:
        setImplementation((EClass)newValue);
        return;
      case EclipsePackage.REQUIRED_SERVICE__BINDED_REFERENCE:
        setBindedReference((EReference)newValue);
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
      case EclipsePackage.REQUIRED_SERVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsePackage.REQUIRED_SERVICE__SERVICE_ID:
        setServiceID(SERVICE_ID_EDEFAULT);
        return;
      case EclipsePackage.REQUIRED_SERVICE__LOWER_BOUND:
        setLowerBound(LOWER_BOUND_EDEFAULT);
        return;
      case EclipsePackage.REQUIRED_SERVICE__UPPER_BOUND:
        setUpperBound(UPPER_BOUND_EDEFAULT);
        return;
      case EclipsePackage.REQUIRED_SERVICE__INTERFACE:
        setInterface((EClass)null);
        return;
      case EclipsePackage.REQUIRED_SERVICE__IMPLEMENTATION:
        setImplementation((EClass)null);
        return;
      case EclipsePackage.REQUIRED_SERVICE__BINDED_REFERENCE:
        setBindedReference((EReference)null);
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
      case EclipsePackage.REQUIRED_SERVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsePackage.REQUIRED_SERVICE__SERVICE_ID:
        return SERVICE_ID_EDEFAULT == null ? serviceID != null : !SERVICE_ID_EDEFAULT.equals(serviceID);
      case EclipsePackage.REQUIRED_SERVICE__LOWER_BOUND:
        return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
      case EclipsePackage.REQUIRED_SERVICE__UPPER_BOUND:
        return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
      case EclipsePackage.REQUIRED_SERVICE__INTERFACE:
        return interface_ != null;
      case EclipsePackage.REQUIRED_SERVICE__IMPLEMENTATION:
        return implementation != null;
      case EclipsePackage.REQUIRED_SERVICE__BINDED_REFERENCE:
        return bindedReference != null;
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
    result.append(", lowerBound: ");
    result.append(lowerBound);
    result.append(", upperBound: ");
    result.append(upperBound);
    result.append(')');
    return result.toString();
  }

} //RequiredServiceImpl
