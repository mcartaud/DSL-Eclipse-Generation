/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perspective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getActionSets <em>Action Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPerspective()
 * @model
 * @generated
 */
public interface Perspective extends EObject
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPerspective_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icon</em>' attribute.
   * @see #setIcon(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPerspective_Icon()
   * @model unique="false"
   * @generated
   */
  String getIcon();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getIcon <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon</em>' attribute.
   * @see #getIcon()
   * @generated
   */
  void setIcon(String value);

  /**
   * Returns the value of the '<em><b>Action Sets</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.ActionSet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Sets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Sets</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPerspective_ActionSets()
   * @model containment="true"
   * @generated
   */
  EList<ActionSet> getActionSets();

  /**
   * Returns the value of the '<em><b>Views</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.View}.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.View#getPerspectives <em>Perspectives</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Views</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPerspective_Views()
   * @see org.obeonetwork.dsl.gen.eclipse.View#getPerspectives
   * @model opposite="perspectives"
   * @generated
   */
  EList<View> getViews();

} // Perspective
