/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Project#getProjectID <em>Project ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Project#getProjectName <em>Project Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProject()
 * @model abstract="true"
 * @generated
 */
public interface Project extends EObject
{
  /**
   * Returns the value of the '<em><b>Project ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project ID</em>' attribute.
   * @see #setProjectID(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProject_ProjectID()
   * @model unique="false"
   * @generated
   */
  String getProjectID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Project#getProjectID <em>Project ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project ID</em>' attribute.
   * @see #getProjectID()
   * @generated
   */
  void setProjectID(String value);

  /**
   * Returns the value of the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Name</em>' attribute.
   * @see #setProjectName(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProject_ProjectName()
   * @model unique="false"
   * @generated
   */
  String getProjectName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Project#getProjectName <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Name</em>' attribute.
   * @see #getProjectName()
   * @generated
   */
  void setProjectName(String value);

} // Project
