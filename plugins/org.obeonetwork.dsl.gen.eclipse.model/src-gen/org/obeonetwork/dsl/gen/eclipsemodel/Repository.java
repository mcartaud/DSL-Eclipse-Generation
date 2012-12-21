/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryLabel <em>Category Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryDescription <em>Category Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends Project
{
  /**
   * Returns the value of the '<em><b>Category Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category Name</em>' attribute.
   * @see #setCategoryName(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getRepository_CategoryName()
   * @model unique="false"
   * @generated
   */
  String getCategoryName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryName <em>Category Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category Name</em>' attribute.
   * @see #getCategoryName()
   * @generated
   */
  void setCategoryName(String value);

  /**
   * Returns the value of the '<em><b>Category Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category Label</em>' attribute.
   * @see #setCategoryLabel(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getRepository_CategoryLabel()
   * @model unique="false"
   * @generated
   */
  String getCategoryLabel();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryLabel <em>Category Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category Label</em>' attribute.
   * @see #getCategoryLabel()
   * @generated
   */
  void setCategoryLabel(String value);

  /**
   * Returns the value of the '<em><b>Category Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category Description</em>' attribute.
   * @see #setCategoryDescription(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getRepository_CategoryDescription()
   * @model unique="false"
   * @generated
   */
  String getCategoryDescription();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryDescription <em>Category Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category Description</em>' attribute.
   * @see #getCategoryDescription()
   * @generated
   */
  void setCategoryDescription(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipsemodel.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getRepository_Features()
   * @model
   * @generated
   */
  EList<Feature> getFeatures();

  /**
   * Returns the value of the '<em><b>Bundles</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bundles</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bundles</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getRepository_Bundles()
   * @model
   * @generated
   */
  EList<Bundle> getBundles();

} // Repository
