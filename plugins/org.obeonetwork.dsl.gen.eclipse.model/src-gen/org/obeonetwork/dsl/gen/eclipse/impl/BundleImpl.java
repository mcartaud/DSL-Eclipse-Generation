/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.gen.eclipse.Builder;
import org.obeonetwork.dsl.gen.eclipse.Bundle;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Extension;
import org.obeonetwork.dsl.gen.eclipse.Help;
import org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration;
import org.obeonetwork.dsl.gen.eclipse.Nature;
import org.obeonetwork.dsl.gen.eclipse.PartCategory;
import org.obeonetwork.dsl.gen.eclipse.Perspective;
import org.obeonetwork.dsl.gen.eclipse.ProvidedService;
import org.obeonetwork.dsl.gen.eclipse.RequiredService;
import org.obeonetwork.dsl.gen.eclipse.Wizard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getRequiredEnvironment <em>Required Environment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getProvidedServices <em>Provided Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getPartCategories <em>Part Categories</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getHelps <em>Helps</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getImportedPackageDeclarations <em>Imported Package Declarations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getNatures <em>Natures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getBuilders <em>Builders</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getWizards <em>Wizards</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getAllExportedPackages <em>All Exported Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleImpl extends ProjectImpl implements Bundle
{
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
   * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVendor()
   * @generated
   * @ordered
   */
  protected static final String VENDOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVendor()
   * @generated
   * @ordered
   */
  protected String vendor = VENDOR_EDEFAULT;

  /**
   * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasePackage()
   * @generated
   * @ordered
   */
  protected static final String BASE_PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasePackage()
   * @generated
   * @ordered
   */
  protected String basePackage = BASE_PACKAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getProvidedServices() <em>Provided Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvidedServices()
   * @generated
   * @ordered
   */
  protected EList<ProvidedService> providedServices;

  /**
   * The cached value of the '{@link #getRequiredServices() <em>Required Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredServices()
   * @generated
   * @ordered
   */
  protected EList<RequiredService> requiredServices;

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
   * The cached value of the '{@link #getImportedPackageDeclarations() <em>Imported Package Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedPackageDeclarations()
   * @generated
   * @ordered
   */
  protected EList<ImportedPackageDeclaration> importedPackageDeclarations;

  /**
   * The cached value of the '{@link #getNatures() <em>Natures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNatures()
   * @generated
   * @ordered
   */
  protected EList<Nature> natures;

  /**
   * The cached value of the '{@link #getBuilders() <em>Builders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuilders()
   * @generated
   * @ordered
   */
  protected EList<Builder> builders;

  /**
   * The cached value of the '{@link #getWizards() <em>Wizards</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWizards()
   * @generated
   * @ordered
   */
  protected EList<Wizard> wizards;

  /**
   * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensions()
   * @generated
   * @ordered
   */
  protected EList<Extension> extensions;

  /**
   * The cached value of the '{@link #getExportedPackages() <em>Exported Packages</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExportedPackages()
   * @generated
   * @ordered
   */
  protected EList<EPackage> exportedPackages;

  /**
   * The cached value of the '{@link #getOwnedPackages() <em>Owned Packages</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedPackages()
   * @generated
   * @ordered
   */
  protected EList<EPackage> ownedPackages;

  /**
   * The cached value of the '{@link #getAllExportedPackages() <em>All Exported Packages</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllExportedPackages()
   * @generated
   * @ordered
   */
  protected EList<EPackage> allExportedPackages;

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
    return EclipsePackage.Literals.BUNDLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.BUNDLE__VERSION, oldVersion, version));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.BUNDLE__REQUIRED_ENVIRONMENT, oldRequiredEnvironment, requiredEnvironment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVendor()
  {
    return vendor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVendor(String newVendor)
  {
    String oldVendor = vendor;
    vendor = newVendor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.BUNDLE__VENDOR, oldVendor, vendor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBasePackage()
  {
    return basePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasePackage(String newBasePackage)
  {
    String oldBasePackage = basePackage;
    basePackage = newBasePackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.BUNDLE__BASE_PACKAGE, oldBasePackage, basePackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProvidedService> getProvidedServices()
  {
    if (providedServices == null)
    {
      providedServices = new EObjectContainmentEList<ProvidedService>(ProvidedService.class, this, EclipsePackage.BUNDLE__PROVIDED_SERVICES);
    }
    return providedServices;
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
      requiredServices = new EObjectContainmentEList<RequiredService>(RequiredService.class, this, EclipsePackage.BUNDLE__REQUIRED_SERVICES);
    }
    return requiredServices;
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
      partCategories = new EObjectContainmentEList<PartCategory>(PartCategory.class, this, EclipsePackage.BUNDLE__PART_CATEGORIES);
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
      perspectives = new EObjectContainmentEList<Perspective>(Perspective.class, this, EclipsePackage.BUNDLE__PERSPECTIVES);
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
      helps = new EObjectContainmentEList<Help>(Help.class, this, EclipsePackage.BUNDLE__HELPS);
    }
    return helps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportedPackageDeclaration> getImportedPackageDeclarations()
  {
    if (importedPackageDeclarations == null)
    {
      importedPackageDeclarations = new EObjectContainmentEList<ImportedPackageDeclaration>(ImportedPackageDeclaration.class, this, EclipsePackage.BUNDLE__IMPORTED_PACKAGE_DECLARATIONS);
    }
    return importedPackageDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Nature> getNatures()
  {
    if (natures == null)
    {
      natures = new EObjectContainmentEList<Nature>(Nature.class, this, EclipsePackage.BUNDLE__NATURES);
    }
    return natures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Builder> getBuilders()
  {
    if (builders == null)
    {
      builders = new EObjectContainmentEList<Builder>(Builder.class, this, EclipsePackage.BUNDLE__BUILDERS);
    }
    return builders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Wizard> getWizards()
  {
    if (wizards == null)
    {
      wizards = new EObjectContainmentEList<Wizard>(Wizard.class, this, EclipsePackage.BUNDLE__WIZARDS);
    }
    return wizards;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Extension> getExtensions()
  {
    if (extensions == null)
    {
      extensions = new EObjectContainmentEList<Extension>(Extension.class, this, EclipsePackage.BUNDLE__EXTENSIONS);
    }
    return extensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EPackage> getExportedPackages()
  {
    if (exportedPackages == null)
    {
      exportedPackages = new EObjectResolvingEList<EPackage>(EPackage.class, this, EclipsePackage.BUNDLE__EXPORTED_PACKAGES);
    }
    return exportedPackages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EPackage> getOwnedPackages()
  {
    if (ownedPackages == null)
    {
      ownedPackages = new EObjectResolvingEList<EPackage>(EPackage.class, this, EclipsePackage.BUNDLE__OWNED_PACKAGES);
    }
    return ownedPackages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EPackage> getAllExportedPackages()
  {
    if (allExportedPackages == null)
    {
      allExportedPackages = new EObjectResolvingEList<EPackage>(EPackage.class, this, EclipsePackage.BUNDLE__ALL_EXPORTED_PACKAGES);
    }
    return allExportedPackages;
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
      case EclipsePackage.BUNDLE__PROVIDED_SERVICES:
        return ((InternalEList<?>)getProvidedServices()).basicRemove(otherEnd, msgs);
      case EclipsePackage.BUNDLE__REQUIRED_SERVICES:
        return ((InternalEList<?>)getRequiredServices()).basicRemove(otherEnd, msgs);
      case EclipsePackage.BUNDLE__PART_CATEGORIES:
        return ((InternalEList<?>)getPartCategories()).basicRemove(otherEnd, msgs);
      case EclipsePackage.BUNDLE__PERSPECTIVES:
        return ((InternalEList<?>)getPerspectives()).basicRemove(otherEnd, msgs);
      case EclipsePackage.BUNDLE__HELPS:
        return ((InternalEList<?>)getHelps()).basicRemove(otherEnd, msgs);
      case EclipsePackage.BUNDLE__IMPORTED_PACKAGE_DECLARATIONS:
        return ((InternalEList<?>)getImportedPackageDeclarations()).basicRemove(otherEnd, msgs);
      case EclipsePackage.BUNDLE__NATURES:
        return ((InternalEList<?>)getNatures()).basicRemove(otherEnd, msgs);
      case EclipsePackage.BUNDLE__BUILDERS:
        return ((InternalEList<?>)getBuilders()).basicRemove(otherEnd, msgs);
      case EclipsePackage.BUNDLE__WIZARDS:
        return ((InternalEList<?>)getWizards()).basicRemove(otherEnd, msgs);
      case EclipsePackage.BUNDLE__EXTENSIONS:
        return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
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
      case EclipsePackage.BUNDLE__VERSION:
        return getVersion();
      case EclipsePackage.BUNDLE__REQUIRED_ENVIRONMENT:
        return getRequiredEnvironment();
      case EclipsePackage.BUNDLE__VENDOR:
        return getVendor();
      case EclipsePackage.BUNDLE__BASE_PACKAGE:
        return getBasePackage();
      case EclipsePackage.BUNDLE__PROVIDED_SERVICES:
        return getProvidedServices();
      case EclipsePackage.BUNDLE__REQUIRED_SERVICES:
        return getRequiredServices();
      case EclipsePackage.BUNDLE__PART_CATEGORIES:
        return getPartCategories();
      case EclipsePackage.BUNDLE__PERSPECTIVES:
        return getPerspectives();
      case EclipsePackage.BUNDLE__HELPS:
        return getHelps();
      case EclipsePackage.BUNDLE__IMPORTED_PACKAGE_DECLARATIONS:
        return getImportedPackageDeclarations();
      case EclipsePackage.BUNDLE__NATURES:
        return getNatures();
      case EclipsePackage.BUNDLE__BUILDERS:
        return getBuilders();
      case EclipsePackage.BUNDLE__WIZARDS:
        return getWizards();
      case EclipsePackage.BUNDLE__EXTENSIONS:
        return getExtensions();
      case EclipsePackage.BUNDLE__EXPORTED_PACKAGES:
        return getExportedPackages();
      case EclipsePackage.BUNDLE__OWNED_PACKAGES:
        return getOwnedPackages();
      case EclipsePackage.BUNDLE__ALL_EXPORTED_PACKAGES:
        return getAllExportedPackages();
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
      case EclipsePackage.BUNDLE__VERSION:
        setVersion((String)newValue);
        return;
      case EclipsePackage.BUNDLE__REQUIRED_ENVIRONMENT:
        setRequiredEnvironment((String)newValue);
        return;
      case EclipsePackage.BUNDLE__VENDOR:
        setVendor((String)newValue);
        return;
      case EclipsePackage.BUNDLE__BASE_PACKAGE:
        setBasePackage((String)newValue);
        return;
      case EclipsePackage.BUNDLE__PROVIDED_SERVICES:
        getProvidedServices().clear();
        getProvidedServices().addAll((Collection<? extends ProvidedService>)newValue);
        return;
      case EclipsePackage.BUNDLE__REQUIRED_SERVICES:
        getRequiredServices().clear();
        getRequiredServices().addAll((Collection<? extends RequiredService>)newValue);
        return;
      case EclipsePackage.BUNDLE__PART_CATEGORIES:
        getPartCategories().clear();
        getPartCategories().addAll((Collection<? extends PartCategory>)newValue);
        return;
      case EclipsePackage.BUNDLE__PERSPECTIVES:
        getPerspectives().clear();
        getPerspectives().addAll((Collection<? extends Perspective>)newValue);
        return;
      case EclipsePackage.BUNDLE__HELPS:
        getHelps().clear();
        getHelps().addAll((Collection<? extends Help>)newValue);
        return;
      case EclipsePackage.BUNDLE__IMPORTED_PACKAGE_DECLARATIONS:
        getImportedPackageDeclarations().clear();
        getImportedPackageDeclarations().addAll((Collection<? extends ImportedPackageDeclaration>)newValue);
        return;
      case EclipsePackage.BUNDLE__NATURES:
        getNatures().clear();
        getNatures().addAll((Collection<? extends Nature>)newValue);
        return;
      case EclipsePackage.BUNDLE__BUILDERS:
        getBuilders().clear();
        getBuilders().addAll((Collection<? extends Builder>)newValue);
        return;
      case EclipsePackage.BUNDLE__WIZARDS:
        getWizards().clear();
        getWizards().addAll((Collection<? extends Wizard>)newValue);
        return;
      case EclipsePackage.BUNDLE__EXTENSIONS:
        getExtensions().clear();
        getExtensions().addAll((Collection<? extends Extension>)newValue);
        return;
      case EclipsePackage.BUNDLE__EXPORTED_PACKAGES:
        getExportedPackages().clear();
        getExportedPackages().addAll((Collection<? extends EPackage>)newValue);
        return;
      case EclipsePackage.BUNDLE__OWNED_PACKAGES:
        getOwnedPackages().clear();
        getOwnedPackages().addAll((Collection<? extends EPackage>)newValue);
        return;
      case EclipsePackage.BUNDLE__ALL_EXPORTED_PACKAGES:
        getAllExportedPackages().clear();
        getAllExportedPackages().addAll((Collection<? extends EPackage>)newValue);
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
      case EclipsePackage.BUNDLE__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case EclipsePackage.BUNDLE__REQUIRED_ENVIRONMENT:
        setRequiredEnvironment(REQUIRED_ENVIRONMENT_EDEFAULT);
        return;
      case EclipsePackage.BUNDLE__VENDOR:
        setVendor(VENDOR_EDEFAULT);
        return;
      case EclipsePackage.BUNDLE__BASE_PACKAGE:
        setBasePackage(BASE_PACKAGE_EDEFAULT);
        return;
      case EclipsePackage.BUNDLE__PROVIDED_SERVICES:
        getProvidedServices().clear();
        return;
      case EclipsePackage.BUNDLE__REQUIRED_SERVICES:
        getRequiredServices().clear();
        return;
      case EclipsePackage.BUNDLE__PART_CATEGORIES:
        getPartCategories().clear();
        return;
      case EclipsePackage.BUNDLE__PERSPECTIVES:
        getPerspectives().clear();
        return;
      case EclipsePackage.BUNDLE__HELPS:
        getHelps().clear();
        return;
      case EclipsePackage.BUNDLE__IMPORTED_PACKAGE_DECLARATIONS:
        getImportedPackageDeclarations().clear();
        return;
      case EclipsePackage.BUNDLE__NATURES:
        getNatures().clear();
        return;
      case EclipsePackage.BUNDLE__BUILDERS:
        getBuilders().clear();
        return;
      case EclipsePackage.BUNDLE__WIZARDS:
        getWizards().clear();
        return;
      case EclipsePackage.BUNDLE__EXTENSIONS:
        getExtensions().clear();
        return;
      case EclipsePackage.BUNDLE__EXPORTED_PACKAGES:
        getExportedPackages().clear();
        return;
      case EclipsePackage.BUNDLE__OWNED_PACKAGES:
        getOwnedPackages().clear();
        return;
      case EclipsePackage.BUNDLE__ALL_EXPORTED_PACKAGES:
        getAllExportedPackages().clear();
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
      case EclipsePackage.BUNDLE__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case EclipsePackage.BUNDLE__REQUIRED_ENVIRONMENT:
        return REQUIRED_ENVIRONMENT_EDEFAULT == null ? requiredEnvironment != null : !REQUIRED_ENVIRONMENT_EDEFAULT.equals(requiredEnvironment);
      case EclipsePackage.BUNDLE__VENDOR:
        return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
      case EclipsePackage.BUNDLE__BASE_PACKAGE:
        return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
      case EclipsePackage.BUNDLE__PROVIDED_SERVICES:
        return providedServices != null && !providedServices.isEmpty();
      case EclipsePackage.BUNDLE__REQUIRED_SERVICES:
        return requiredServices != null && !requiredServices.isEmpty();
      case EclipsePackage.BUNDLE__PART_CATEGORIES:
        return partCategories != null && !partCategories.isEmpty();
      case EclipsePackage.BUNDLE__PERSPECTIVES:
        return perspectives != null && !perspectives.isEmpty();
      case EclipsePackage.BUNDLE__HELPS:
        return helps != null && !helps.isEmpty();
      case EclipsePackage.BUNDLE__IMPORTED_PACKAGE_DECLARATIONS:
        return importedPackageDeclarations != null && !importedPackageDeclarations.isEmpty();
      case EclipsePackage.BUNDLE__NATURES:
        return natures != null && !natures.isEmpty();
      case EclipsePackage.BUNDLE__BUILDERS:
        return builders != null && !builders.isEmpty();
      case EclipsePackage.BUNDLE__WIZARDS:
        return wizards != null && !wizards.isEmpty();
      case EclipsePackage.BUNDLE__EXTENSIONS:
        return extensions != null && !extensions.isEmpty();
      case EclipsePackage.BUNDLE__EXPORTED_PACKAGES:
        return exportedPackages != null && !exportedPackages.isEmpty();
      case EclipsePackage.BUNDLE__OWNED_PACKAGES:
        return ownedPackages != null && !ownedPackages.isEmpty();
      case EclipsePackage.BUNDLE__ALL_EXPORTED_PACKAGES:
        return allExportedPackages != null && !allExportedPackages.isEmpty();
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
    result.append(" (version: ");
    result.append(version);
    result.append(", requiredEnvironment: ");
    result.append(requiredEnvironment);
    result.append(", vendor: ");
    result.append(vendor);
    result.append(", basePackage: ");
    result.append(basePackage);
    result.append(')');
    return result.toString();
  }

} //BundleImpl
