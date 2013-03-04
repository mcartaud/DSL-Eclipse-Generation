/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getID <em>ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRepositoryCategory()
 * @model
 * @generated
 */
public interface RepositoryCategory extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRepositoryCategory_Label()
   * @model unique="false" required="true"
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRepositoryCategory_Description()
   * @model unique="false"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ID</em>' attribute.
   * @see #setID(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRepositoryCategory_ID()
   * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Namespace" required="true"
   * @generated
   */
  String getID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getID <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ID</em>' attribute.
   * @see #getID()
   * @generated
   */
  void setID(String value);

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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getRepositoryCategory_Features()
   * @model required="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // RepositoryCategory
