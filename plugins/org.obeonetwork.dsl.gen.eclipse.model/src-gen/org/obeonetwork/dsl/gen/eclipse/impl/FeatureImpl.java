/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.gen.eclipse.Bundle;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Feature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends ProjectImpl implements Feature
{
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
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

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
   * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLicense()
   * @generated
   * @ordered
   */
  protected static final String LICENSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLicense()
   * @generated
   * @ordered
   */
  protected String license = LICENSE_EDEFAULT;

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
   * The cached value of the '{@link #getBundles() <em>Bundles</em>}' reference list.
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
  protected FeatureImpl()
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
    return EclipsePackage.Literals.FEATURE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.FEATURE__COPYRIGHT, oldCopyright, copyright));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.FEATURE__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.FEATURE__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLicense()
  {
    return license;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLicense(String newLicense)
  {
    String oldLicense = license;
    license = newLicense;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.FEATURE__LICENSE, oldLicense, license));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.FEATURE__PROVIDER, oldProvider, provider));
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
      bundles = new EObjectResolvingEList<Bundle>(Bundle.class, this, EclipsePackage.FEATURE__BUNDLES);
    }
    return bundles;
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
      case EclipsePackage.FEATURE__COPYRIGHT:
        return getCopyright();
      case EclipsePackage.FEATURE__DESCRIPTION:
        return getDescription();
      case EclipsePackage.FEATURE__VERSION:
        return getVersion();
      case EclipsePackage.FEATURE__LICENSE:
        return getLicense();
      case EclipsePackage.FEATURE__PROVIDER:
        return getProvider();
      case EclipsePackage.FEATURE__BUNDLES:
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
      case EclipsePackage.FEATURE__COPYRIGHT:
        setCopyright((String)newValue);
        return;
      case EclipsePackage.FEATURE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case EclipsePackage.FEATURE__VERSION:
        setVersion((String)newValue);
        return;
      case EclipsePackage.FEATURE__LICENSE:
        setLicense((String)newValue);
        return;
      case EclipsePackage.FEATURE__PROVIDER:
        setProvider((String)newValue);
        return;
      case EclipsePackage.FEATURE__BUNDLES:
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
      case EclipsePackage.FEATURE__COPYRIGHT:
        setCopyright(COPYRIGHT_EDEFAULT);
        return;
      case EclipsePackage.FEATURE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case EclipsePackage.FEATURE__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case EclipsePackage.FEATURE__LICENSE:
        setLicense(LICENSE_EDEFAULT);
        return;
      case EclipsePackage.FEATURE__PROVIDER:
        setProvider(PROVIDER_EDEFAULT);
        return;
      case EclipsePackage.FEATURE__BUNDLES:
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
      case EclipsePackage.FEATURE__COPYRIGHT:
        return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
      case EclipsePackage.FEATURE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case EclipsePackage.FEATURE__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case EclipsePackage.FEATURE__LICENSE:
        return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
      case EclipsePackage.FEATURE__PROVIDER:
        return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
      case EclipsePackage.FEATURE__BUNDLES:
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
    result.append(" (copyright: ");
    result.append(copyright);
    result.append(", description: ");
    result.append(description);
    result.append(", version: ");
    result.append(version);
    result.append(", license: ");
    result.append(license);
    result.append(", provider: ");
    result.append(provider);
    result.append(')');
    return result.toString();
  }

} //FeatureImpl
