/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.gen.eclipsemodel.Bundle;
import org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage;
import org.obeonetwork.dsl.gen.eclipsemodel.Feature;
import org.obeonetwork.dsl.gen.eclipsemodel.Repository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getRepositoryID <em>Repository ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getCategoryyName <em>Categoryy Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getCategoryLabel <em>Category Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getCategoryDescription <em>Category Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository
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
   * The default value of the '{@link #getRepositoryID() <em>Repository ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositoryID()
   * @generated
   * @ordered
   */
  protected static final String REPOSITORY_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRepositoryID() <em>Repository ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositoryID()
   * @generated
   * @ordered
   */
  protected String repositoryID = REPOSITORY_ID_EDEFAULT;

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
   * The default value of the '{@link #getCategoryyName() <em>Categoryy Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryyName()
   * @generated
   * @ordered
   */
  protected static final String CATEGORYY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCategoryyName() <em>Categoryy Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryyName()
   * @generated
   * @ordered
   */
  protected String categoryyName = CATEGORYY_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getCategoryLabel() <em>Category Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryLabel()
   * @generated
   * @ordered
   */
  protected static final String CATEGORY_LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCategoryLabel() <em>Category Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryLabel()
   * @generated
   * @ordered
   */
  protected String categoryLabel = CATEGORY_LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getCategoryDescription() <em>Category Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryDescription()
   * @generated
   * @ordered
   */
  protected static final String CATEGORY_DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCategoryDescription() <em>Category Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryDescription()
   * @generated
   * @ordered
   */
  protected String categoryDescription = CATEGORY_DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature> features;

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
  protected RepositoryImpl()
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
    return EclipsemodelPackage.Literals.REPOSITORY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.REPOSITORY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRepositoryID()
  {
    return repositoryID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepositoryID(String newRepositoryID)
  {
    String oldRepositoryID = repositoryID;
    repositoryID = newRepositoryID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.REPOSITORY__REPOSITORY_ID, oldRepositoryID, repositoryID));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.REPOSITORY__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCategoryyName()
  {
    return categoryyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategoryyName(String newCategoryyName)
  {
    String oldCategoryyName = categoryyName;
    categoryyName = newCategoryyName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.REPOSITORY__CATEGORYY_NAME, oldCategoryyName, categoryyName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCategoryLabel()
  {
    return categoryLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategoryLabel(String newCategoryLabel)
  {
    String oldCategoryLabel = categoryLabel;
    categoryLabel = newCategoryLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.REPOSITORY__CATEGORY_LABEL, oldCategoryLabel, categoryLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCategoryDescription()
  {
    return categoryDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategoryDescription(String newCategoryDescription)
  {
    String oldCategoryDescription = categoryDescription;
    categoryDescription = newCategoryDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.REPOSITORY__CATEGORY_DESCRIPTION, oldCategoryDescription, categoryDescription));
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
      features = new EObjectResolvingEList<Feature>(Feature.class, this, EclipsemodelPackage.REPOSITORY__FEATURES);
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
      bundles = new EObjectResolvingEList<Bundle>(Bundle.class, this, EclipsemodelPackage.REPOSITORY__BUNDLES);
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
      case EclipsemodelPackage.REPOSITORY__NAME:
        return getName();
      case EclipsemodelPackage.REPOSITORY__REPOSITORY_ID:
        return getRepositoryID();
      case EclipsemodelPackage.REPOSITORY__VERSION:
        return getVersion();
      case EclipsemodelPackage.REPOSITORY__CATEGORYY_NAME:
        return getCategoryyName();
      case EclipsemodelPackage.REPOSITORY__CATEGORY_LABEL:
        return getCategoryLabel();
      case EclipsemodelPackage.REPOSITORY__CATEGORY_DESCRIPTION:
        return getCategoryDescription();
      case EclipsemodelPackage.REPOSITORY__FEATURES:
        return getFeatures();
      case EclipsemodelPackage.REPOSITORY__BUNDLES:
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
      case EclipsemodelPackage.REPOSITORY__NAME:
        setName((String)newValue);
        return;
      case EclipsemodelPackage.REPOSITORY__REPOSITORY_ID:
        setRepositoryID((String)newValue);
        return;
      case EclipsemodelPackage.REPOSITORY__VERSION:
        setVersion((String)newValue);
        return;
      case EclipsemodelPackage.REPOSITORY__CATEGORYY_NAME:
        setCategoryyName((String)newValue);
        return;
      case EclipsemodelPackage.REPOSITORY__CATEGORY_LABEL:
        setCategoryLabel((String)newValue);
        return;
      case EclipsemodelPackage.REPOSITORY__CATEGORY_DESCRIPTION:
        setCategoryDescription((String)newValue);
        return;
      case EclipsemodelPackage.REPOSITORY__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
        return;
      case EclipsemodelPackage.REPOSITORY__BUNDLES:
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
      case EclipsemodelPackage.REPOSITORY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EclipsemodelPackage.REPOSITORY__REPOSITORY_ID:
        setRepositoryID(REPOSITORY_ID_EDEFAULT);
        return;
      case EclipsemodelPackage.REPOSITORY__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case EclipsemodelPackage.REPOSITORY__CATEGORYY_NAME:
        setCategoryyName(CATEGORYY_NAME_EDEFAULT);
        return;
      case EclipsemodelPackage.REPOSITORY__CATEGORY_LABEL:
        setCategoryLabel(CATEGORY_LABEL_EDEFAULT);
        return;
      case EclipsemodelPackage.REPOSITORY__CATEGORY_DESCRIPTION:
        setCategoryDescription(CATEGORY_DESCRIPTION_EDEFAULT);
        return;
      case EclipsemodelPackage.REPOSITORY__FEATURES:
        getFeatures().clear();
        return;
      case EclipsemodelPackage.REPOSITORY__BUNDLES:
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
      case EclipsemodelPackage.REPOSITORY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EclipsemodelPackage.REPOSITORY__REPOSITORY_ID:
        return REPOSITORY_ID_EDEFAULT == null ? repositoryID != null : !REPOSITORY_ID_EDEFAULT.equals(repositoryID);
      case EclipsemodelPackage.REPOSITORY__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case EclipsemodelPackage.REPOSITORY__CATEGORYY_NAME:
        return CATEGORYY_NAME_EDEFAULT == null ? categoryyName != null : !CATEGORYY_NAME_EDEFAULT.equals(categoryyName);
      case EclipsemodelPackage.REPOSITORY__CATEGORY_LABEL:
        return CATEGORY_LABEL_EDEFAULT == null ? categoryLabel != null : !CATEGORY_LABEL_EDEFAULT.equals(categoryLabel);
      case EclipsemodelPackage.REPOSITORY__CATEGORY_DESCRIPTION:
        return CATEGORY_DESCRIPTION_EDEFAULT == null ? categoryDescription != null : !CATEGORY_DESCRIPTION_EDEFAULT.equals(categoryDescription);
      case EclipsemodelPackage.REPOSITORY__FEATURES:
        return features != null && !features.isEmpty();
      case EclipsemodelPackage.REPOSITORY__BUNDLES:
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
    result.append(", repositoryID: ");
    result.append(repositoryID);
    result.append(", version: ");
    result.append(version);
    result.append(", categoryyName: ");
    result.append(categoryyName);
    result.append(", categoryLabel: ");
    result.append(categoryLabel);
    result.append(", categoryDescription: ");
    result.append(categoryDescription);
    result.append(')');
    return result.toString();
  }

} //RepositoryImpl
