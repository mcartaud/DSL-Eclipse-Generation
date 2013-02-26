/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Repository#getCategoryLabel <em>Category Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Repository#getCategoryID <em>Category ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Repository#getCategoryDescription <em>Category Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Repository#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends Project
{
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRepository_CategoryLabel()
   * @model unique="false"
   * @generated
   */
  String getCategoryLabel();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Repository#getCategoryLabel <em>Category Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category Label</em>' attribute.
   * @see #getCategoryLabel()
   * @generated
   */
  void setCategoryLabel(String value);

  /**
   * Returns the value of the '<em><b>Category ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category ID</em>' attribute.
   * @see #setCategoryID(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRepository_CategoryID()
   * @model unique="false"
   * @generated
   */
  String getCategoryID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Repository#getCategoryID <em>Category ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category ID</em>' attribute.
   * @see #getCategoryID()
   * @generated
   */
  void setCategoryID(String value);

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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRepository_CategoryDescription()
   * @model unique="false"
   * @generated
   */
  String getCategoryDescription();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Repository#getCategoryDescription <em>Category Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category Description</em>' attribute.
   * @see #getCategoryDescription()
   * @generated
   */
  void setCategoryDescription(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRepository_Features()
   * @model
   * @generated
   */
  EList<Feature> getFeatures();

} // Repository
