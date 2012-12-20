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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getRepositoryID <em>Repository ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryyName <em>Categoryy Name</em>}</li>
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
public interface Repository extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getRepository_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Repository ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repository ID</em>' attribute.
   * @see #setRepositoryID(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getRepository_RepositoryID()
   * @model unique="false"
   * @generated
   */
  String getRepositoryID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getRepositoryID <em>Repository ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository ID</em>' attribute.
   * @see #getRepositoryID()
   * @generated
   */
  void setRepositoryID(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getRepository_Version()
   * @model unique="false"
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Categoryy Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Categoryy Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Categoryy Name</em>' attribute.
   * @see #setCategoryyName(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getRepository_CategoryyName()
   * @model unique="false"
   * @generated
   */
  String getCategoryyName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryyName <em>Categoryy Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Categoryy Name</em>' attribute.
   * @see #getCategoryyName()
   * @generated
   */
  void setCategoryyName(String value);

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
