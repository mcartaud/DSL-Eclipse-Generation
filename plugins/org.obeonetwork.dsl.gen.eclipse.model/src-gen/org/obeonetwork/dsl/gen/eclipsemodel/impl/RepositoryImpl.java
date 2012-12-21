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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getCategoryLabel <em>Category Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getCategoryDescription <em>Category Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends ProjectImpl implements Repository
{
  /**
   * The default value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryName()
   * @generated
   * @ordered
   */
  protected static final String CATEGORY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryName()
   * @generated
   * @ordered
   */
  protected String categoryName = CATEGORY_NAME_EDEFAULT;

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
  public String getCategoryName()
  {
    return categoryName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategoryName(String newCategoryName)
  {
    String oldCategoryName = categoryName;
    categoryName = newCategoryName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsemodelPackage.REPOSITORY__CATEGORY_NAME, oldCategoryName, categoryName));
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
      case EclipsemodelPackage.REPOSITORY__CATEGORY_NAME:
        return getCategoryName();
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
      case EclipsemodelPackage.REPOSITORY__CATEGORY_NAME:
        setCategoryName((String)newValue);
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
      case EclipsemodelPackage.REPOSITORY__CATEGORY_NAME:
        setCategoryName(CATEGORY_NAME_EDEFAULT);
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
      case EclipsemodelPackage.REPOSITORY__CATEGORY_NAME:
        return CATEGORY_NAME_EDEFAULT == null ? categoryName != null : !CATEGORY_NAME_EDEFAULT.equals(categoryName);
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
    result.append(" (categoryName: ");
    result.append(categoryName);
    result.append(", categoryLabel: ");
    result.append(categoryLabel);
    result.append(", categoryDescription: ");
    result.append(categoryDescription);
    result.append(')');
    return result.toString();
  }

} //RepositoryImpl
