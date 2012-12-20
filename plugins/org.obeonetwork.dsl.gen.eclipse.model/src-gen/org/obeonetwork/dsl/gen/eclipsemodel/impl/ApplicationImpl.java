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

import org.obeonetwork.dsl.gen.eclipsemodel.Application;
import org.obeonetwork.dsl.gen.eclipsemodel.Bundle;
import org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage;
import org.obeonetwork.dsl.gen.eclipsemodel.Feature;
import org.obeonetwork.dsl.gen.eclipsemodel.Repository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ApplicationImpl#getApplicationID <em>Application ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ApplicationImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ApplicationImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ApplicationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ApplicationImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ApplicationImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ApplicationImpl#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application
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
   * The default value of the '{@link #getApplicationID() <em>Application ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicationID()
   * @generated
   * @ordered
   */
  protected static final String APPLICATION_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getApplicationID() <em>Application ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicationID()
   * @generated
   * @ordered
   */
  protected String applicationID = APPLICATION_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvider()
   * @generated
   * @ordered
   */
  protected static final String PROVIDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvider()
   * @generated
   * @ordered
   */
  protected String provider = PROVIDER_EDEFAULT;

  /**
   * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCopyright()
   * @generated
   * @ordered
   */
  protected static final String COPYRIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCopyright()
   * @generated
   * @ordered
   */
  protected String copyright = COPYRIGHT_EDEFAULT;

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
   * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositories()
   * @generated
   * @ordered
   */
  protected EList<Repository> repositories;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature> features;

  /**
   * The cached value of the '{@link #getBundles() <em>Bundles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBundles()
   * @generated
   * @ordered
   */
  protected EList<Bundle> bundles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationImpl()
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
    return EclipsemodelPackage.Literals.APPLICATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.APPLICATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getApplicationID()
  {
    return applicationID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplicationID(String newApplicationID)
  {
    String oldApplicationID = applicationID;
    applicationID = newApplicationID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.APPLICATION__APPLICATION_ID, oldApplicationID, applicationID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProvider()
  {
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvider(String newProvider)
  {
    String oldProvider = provider;
    provider = newProvider;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.APPLICATION__PROVIDER, oldProvider, provider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCopyright()
  {
    return copyright;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCopyright(String newCopyright)
  {
    String oldCopyright = copyright;
    copyright = newCopyright;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.APPLICATION__COPYRIGHT, oldCopyright, copyright));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.APPLICATION__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Repository> getRepositories()
  {
    if (repositories == null)
    {
      repositories = new EObjectContainmentEList<Repository>(Repository.class, this, EclipsemodelPackage.APPLICATION__REPOSITORIES);
    }
    return repositories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<Feature>(Feature.class, this, EclipsemodelPackage.APPLICATION__FEATURES);
    }
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Bundle> getBundles()
  {
    if (bundles == null)
    {
      bundles = new EObjectContainmentEList<Bundle>(Bundle.class, this, EclipsemodelPackage.APPLICATION__BUNDLES);
    }
    return bundles;
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
      case EclipsemodelPackage.APPLICATION__REPOSITORIES:
        return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
      case EclipsemodelPackage.APPLICATION__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
      case EclipsemodelPackage.APPLICATION__BUNDLES:
        return ((InternalEList<?>)getBundles()).basicRemove(otherEnd, msgs);
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
      case EclipsemodelPackage.APPLICATION__NAME:
        return getName();
      case EclipsemodelPackage.APPLICATION__APPLICATION_ID:
        return getApplicationID();
      case EclipsemodelPackage.APPLICATION__PROVIDER:
        return getProvider();
      case EclipsemodelPackage.APPLICATION__COPYRIGHT:
        return getCopyright();
      case EclipsemodelPackage.APPLICATION__VERSION:
        return getVersion();
      case EclipsemodelPackage.APPLICATION__REPOSITORIES:
        return getRepositories();
      case EclipsemodelPackage.APPLICATION__FEATURES:
        return getFeatures();
      case EclipsemodelPackage.APPLICATION__BUNDLES:
        return getBundles();
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
      case EclipsemodelPackage.APPLICATION__NAME:
        setName((String)newValue);
        return;
      case EclipsemodelPackage.APPLICATION__APPLICATION_ID:
        setApplicationID((String)newValue);
        return;
      case EclipsemodelPackage.APPLICATION__PROVIDER:
        setProvider((String)newValue);
        return;
      case EclipsemodelPackage.APPLICATION__COPYRIGHT:
        setCopyright((String)newValue);
        return;
      case EclipsemodelPackage.APPLICATION__VERSION:
        setVersion((String)newValue);
        return;
      case EclipsemodelPackage.APPLICATION__REPOSITORIES:
        getRepositories().clear();
        getRepositories().addAll((Collection<? extends Repository>)newValue);
        return;
      case EclipsemodelPackage.APPLICATION__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
        return;
      case EclipsemodelPackage.APPLICATION__BUNDLES:
        getBundles().clear();
        getBundles().addAll((Collection<? extends Bundle>)newValue);
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
      case EclipsemodelPackage.APPLICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsemodelPackage.APPLICATION__APPLICATION_ID:
        setApplicationID(APPLICATION_ID_EDEFAULT);
        return;
      case EclipsemodelPackage.APPLICATION__PROVIDER:
        setProvider(PROVIDER_EDEFAULT);
        return;
      case EclipsemodelPackage.APPLICATION__COPYRIGHT:
        setCopyright(COPYRIGHT_EDEFAULT);
        return;
      case EclipsemodelPackage.APPLICATION__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case EclipsemodelPackage.APPLICATION__REPOSITORIES:
        getRepositories().clear();
        return;
      case EclipsemodelPackage.APPLICATION__FEATURES:
        getFeatures().clear();
        return;
      case EclipsemodelPackage.APPLICATION__BUNDLES:
        getBundles().clear();
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
      case EclipsemodelPackage.APPLICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsemodelPackage.APPLICATION__APPLICATION_ID:
        return APPLICATION_ID_EDEFAULT == null ? applicationID != null : !APPLICATION_ID_EDEFAULT.equals(applicationID);
      case EclipsemodelPackage.APPLICATION__PROVIDER:
        return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
      case EclipsemodelPackage.APPLICATION__COPYRIGHT:
        return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
      case EclipsemodelPackage.APPLICATION__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case EclipsemodelPackage.APPLICATION__REPOSITORIES:
        return repositories != null && !repositories.isEmpty();
      case EclipsemodelPackage.APPLICATION__FEATURES:
        return features != null && !features.isEmpty();
      case EclipsemodelPackage.APPLICATION__BUNDLES:
        return bundles != null && !bundles.isEmpty();
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
    result.append(", applicationID: ");
    result.append(applicationID);
    result.append(", provider: ");
    result.append(provider);
    result.append(", copyright: ");
    result.append(copyright);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //ApplicationImpl
