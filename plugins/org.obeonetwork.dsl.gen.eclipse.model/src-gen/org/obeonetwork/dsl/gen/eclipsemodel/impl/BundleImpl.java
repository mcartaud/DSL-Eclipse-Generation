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

import org.obeonetwork.dsl.gen.eclipsemodel.Bundle;
import org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage;
import org.obeonetwork.dsl.gen.eclipsemodel.Help;
import org.obeonetwork.dsl.gen.eclipsemodel.PartCategory;
import org.obeonetwork.dsl.gen.eclipsemodel.Perspective;
import org.obeonetwork.dsl.gen.eclipsemodel.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.BundleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.BundleImpl#getSymbolicName <em>Symbolic Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.BundleImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.BundleImpl#getRequiredEnvironment <em>Required Environment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.BundleImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.BundleImpl#getPartCategories <em>Part Categories</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.BundleImpl#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.BundleImpl#getHelps <em>Helps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleImpl extends MinimalEObjectImpl.Container implements Bundle
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
   * The default value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolicName()
   * @generated
   * @ordered
   */
  protected static final String SYMBOLIC_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolicName()
   * @generated
   * @ordered
   */
  protected String symbolicName = SYMBOLIC_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getRequiredEnvironment() <em>Required Environment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredEnvironment()
   * @generated
   * @ordered
   */
  protected static final String REQUIRED_ENVIRONMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRequiredEnvironment() <em>Required Environment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredEnvironment()
   * @generated
   * @ordered
   */
  protected String requiredEnvironment = REQUIRED_ENVIRONMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServices()
   * @generated
   * @ordered
   */
  protected EList<Service> services;

  /**
   * The cached value of the '{@link #getPartCategories() <em>Part Categories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartCategories()
   * @generated
   * @ordered
   */
  protected EList<PartCategory> partCategories;

  /**
   * The cached value of the '{@link #getPerspectives() <em>Perspectives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerspectives()
   * @generated
   * @ordered
   */
  protected EList<Perspective> perspectives;

  /**
   * The cached value of the '{@link #getHelps() <em>Helps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelps()
   * @generated
   * @ordered
   */
  protected EList<Help> helps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BundleImpl()
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
    return EclipsemodelPackage.Literals.BUNDLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.BUNDLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSymbolicName()
  {
    return symbolicName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbolicName(String newSymbolicName)
  {
    String oldSymbolicName = symbolicName;
    symbolicName = newSymbolicName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.BUNDLE__SYMBOLIC_NAME, oldSymbolicName, symbolicName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.BUNDLE__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRequiredEnvironment()
  {
    return requiredEnvironment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequiredEnvironment(String newRequiredEnvironment)
  {
    String oldRequiredEnvironment = requiredEnvironment;
    requiredEnvironment = newRequiredEnvironment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.BUNDLE__REQUIRED_ENVIRONMENT, oldRequiredEnvironment, requiredEnvironment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Service> getServices()
  {
    if (services == null)
    {
      services = new EObjectContainmentEList<Service>(Service.class, this, EclipsemodelPackage.BUNDLE__SERVICES);
    }
    return services;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PartCategory> getPartCategories()
  {
    if (partCategories == null)
    {
      partCategories = new EObjectContainmentEList<PartCategory>(PartCategory.class, this, EclipsemodelPackage.BUNDLE__PART_CATEGORIES);
    }
    return partCategories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Perspective> getPerspectives()
  {
    if (perspectives == null)
    {
      perspectives = new EObjectContainmentEList<Perspective>(Perspective.class, this, EclipsemodelPackage.BUNDLE__PERSPECTIVES);
    }
    return perspectives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Help> getHelps()
  {
    if (helps == null)
    {
      helps = new EObjectContainmentEList<Help>(Help.class, this, EclipsemodelPackage.BUNDLE__HELPS);
    }
    return helps;
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
      case EclipsemodelPackage.BUNDLE__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
      case EclipsemodelPackage.BUNDLE__PART_CATEGORIES:
        return ((InternalEList<?>)getPartCategories()).basicRemove(otherEnd, msgs);
      case EclipsemodelPackage.BUNDLE__PERSPECTIVES:
        return ((InternalEList<?>)getPerspectives()).basicRemove(otherEnd, msgs);
      case EclipsemodelPackage.BUNDLE__HELPS:
        return ((InternalEList<?>)getHelps()).basicRemove(otherEnd, msgs);
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
      case EclipsemodelPackage.BUNDLE__NAME:
        return getName();
      case EclipsemodelPackage.BUNDLE__SYMBOLIC_NAME:
        return getSymbolicName();
      case EclipsemodelPackage.BUNDLE__VERSION:
        return getVersion();
      case EclipsemodelPackage.BUNDLE__REQUIRED_ENVIRONMENT:
        return getRequiredEnvironment();
      case EclipsemodelPackage.BUNDLE__SERVICES:
        return getServices();
      case EclipsemodelPackage.BUNDLE__PART_CATEGORIES:
        return getPartCategories();
      case EclipsemodelPackage.BUNDLE__PERSPECTIVES:
        return getPerspectives();
      case EclipsemodelPackage.BUNDLE__HELPS:
        return getHelps();
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
      case EclipsemodelPackage.BUNDLE__NAME:
        setName((String)newValue);
        return;
      case EclipsemodelPackage.BUNDLE__SYMBOLIC_NAME:
        setSymbolicName((String)newValue);
        return;
      case EclipsemodelPackage.BUNDLE__VERSION:
        setVersion((String)newValue);
        return;
      case EclipsemodelPackage.BUNDLE__REQUIRED_ENVIRONMENT:
        setRequiredEnvironment((String)newValue);
        return;
      case EclipsemodelPackage.BUNDLE__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends Service>)newValue);
        return;
      case EclipsemodelPackage.BUNDLE__PART_CATEGORIES:
        getPartCategories().clear();
        getPartCategories().addAll((Collection<? extends PartCategory>)newValue);
        return;
      case EclipsemodelPackage.BUNDLE__PERSPECTIVES:
        getPerspectives().clear();
        getPerspectives().addAll((Collection<? extends Perspective>)newValue);
        return;
      case EclipsemodelPackage.BUNDLE__HELPS:
        getHelps().clear();
        getHelps().addAll((Collection<? extends Help>)newValue);
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
      case EclipsemodelPackage.BUNDLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsemodelPackage.BUNDLE__SYMBOLIC_NAME:
        setSymbolicName(SYMBOLIC_NAME_EDEFAULT);
        return;
      case EclipsemodelPackage.BUNDLE__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case EclipsemodelPackage.BUNDLE__REQUIRED_ENVIRONMENT:
        setRequiredEnvironment(REQUIRED_ENVIRONMENT_EDEFAULT);
        return;
      case EclipsemodelPackage.BUNDLE__SERVICES:
        getServices().clear();
        return;
      case EclipsemodelPackage.BUNDLE__PART_CATEGORIES:
        getPartCategories().clear();
        return;
      case EclipsemodelPackage.BUNDLE__PERSPECTIVES:
        getPerspectives().clear();
        return;
      case EclipsemodelPackage.BUNDLE__HELPS:
        getHelps().clear();
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
      case EclipsemodelPackage.BUNDLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsemodelPackage.BUNDLE__SYMBOLIC_NAME:
        return SYMBOLIC_NAME_EDEFAULT == null ? symbolicName != null : !SYMBOLIC_NAME_EDEFAULT.equals(symbolicName);
      case EclipsemodelPackage.BUNDLE__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case EclipsemodelPackage.BUNDLE__REQUIRED_ENVIRONMENT:
        return REQUIRED_ENVIRONMENT_EDEFAULT == null ? requiredEnvironment != null : !REQUIRED_ENVIRONMENT_EDEFAULT.equals(requiredEnvironment);
      case EclipsemodelPackage.BUNDLE__SERVICES:
        return services != null && !services.isEmpty();
      case EclipsemodelPackage.BUNDLE__PART_CATEGORIES:
        return partCategories != null && !partCategories.isEmpty();
      case EclipsemodelPackage.BUNDLE__PERSPECTIVES:
        return perspectives != null && !perspectives.isEmpty();
      case EclipsemodelPackage.BUNDLE__HELPS:
        return helps != null && !helps.isEmpty();
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
    result.append(", symbolicName: ");
    result.append(symbolicName);
    result.append(", version: ");
    result.append(version);
    result.append(", requiredEnvironment: ");
    result.append(requiredEnvironment);
    result.append(')');
    return result.toString();
  }

} //BundleImpl
