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
import org.obeonetwork.dsl.gen.eclipse.Repository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RepositoryImpl#getCategoryLabel <em>Category Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RepositoryImpl#getCategoryID <em>Category ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RepositoryImpl#getCategoryDescription <em>Category Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RepositoryImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.RepositoryImpl#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends ProjectImpl implements Repository
{
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
   * The default value of the '{@link #getCategoryID() <em>Category ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryID()
   * @generated
   * @ordered
   */
  protected static final String CATEGORY_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCategoryID() <em>Category ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryID()
   * @generated
   * @ordered
   */
  protected String categoryID = CATEGORY_ID_EDEFAULT;

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
    return EclipsePackage.Literals.REPOSITORY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.REPOSITORY__CATEGORY_LABEL, oldCategoryLabel, categoryLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCategoryID()
  {
    return categoryID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategoryID(String newCategoryID)
  {
    String oldCategoryID = categoryID;
    categoryID = newCategoryID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.REPOSITORY__CATEGORY_ID, oldCategoryID, categoryID));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.REPOSITORY__CATEGORY_DESCRIPTION, oldCategoryDescription, categoryDescription));
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
      features = new EObjectResolvingEList<Feature>(Feature.class, this, EclipsePackage.REPOSITORY__FEATURES);
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
      bundles = new EObjectResolvingEList<Bundle>(Bundle.class, this, EclipsePackage.REPOSITORY__BUNDLES);
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
      case EclipsePackage.REPOSITORY__CATEGORY_LABEL:
        return getCategoryLabel();
      case EclipsePackage.REPOSITORY__CATEGORY_ID:
        return getCategoryID();
      case EclipsePackage.REPOSITORY__CATEGORY_DESCRIPTION:
        return getCategoryDescription();
      case EclipsePackage.REPOSITORY__FEATURES:
        return getFeatures();
      case EclipsePackage.REPOSITORY__BUNDLES:
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
      case EclipsePackage.REPOSITORY__CATEGORY_LABEL:
        setCategoryLabel((String)newValue);
        return;
      case EclipsePackage.REPOSITORY__CATEGORY_ID:
        setCategoryID((String)newValue);
        return;
      case EclipsePackage.REPOSITORY__CATEGORY_DESCRIPTION:
        setCategoryDescription((String)newValue);
        return;
      case EclipsePackage.REPOSITORY__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
        return;
      case EclipsePackage.REPOSITORY__BUNDLES:
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
      case EclipsePackage.REPOSITORY__CATEGORY_LABEL:
        setCategoryLabel(CATEGORY_LABEL_EDEFAULT);
        return;
      case EclipsePackage.REPOSITORY__CATEGORY_ID:
        setCategoryID(CATEGORY_ID_EDEFAULT);
        return;
      case EclipsePackage.REPOSITORY__CATEGORY_DESCRIPTION:
        setCategoryDescription(CATEGORY_DESCRIPTION_EDEFAULT);
        return;
      case EclipsePackage.REPOSITORY__FEATURES:
        getFeatures().clear();
        return;
      case EclipsePackage.REPOSITORY__BUNDLES:
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
      case EclipsePackage.REPOSITORY__CATEGORY_LABEL:
        return CATEGORY_LABEL_EDEFAULT == null ? categoryLabel != null : !CATEGORY_LABEL_EDEFAULT.equals(categoryLabel);
      case EclipsePackage.REPOSITORY__CATEGORY_ID:
        return CATEGORY_ID_EDEFAULT == null ? categoryID != null : !CATEGORY_ID_EDEFAULT.equals(categoryID);
      case EclipsePackage.REPOSITORY__CATEGORY_DESCRIPTION:
        return CATEGORY_DESCRIPTION_EDEFAULT == null ? categoryDescription != null : !CATEGORY_DESCRIPTION_EDEFAULT.equals(categoryDescription);
      case EclipsePackage.REPOSITORY__FEATURES:
        return features != null && !features.isEmpty();
      case EclipsePackage.REPOSITORY__BUNDLES:
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
    result.append(" (categoryLabel: ");
    result.append(categoryLabel);
    result.append(", categoryID: ");
    result.append(categoryID);
    result.append(", categoryDescription: ");
    result.append(categoryDescription);
    result.append(')');
    return result.toString();
  }

} //RepositoryImpl
