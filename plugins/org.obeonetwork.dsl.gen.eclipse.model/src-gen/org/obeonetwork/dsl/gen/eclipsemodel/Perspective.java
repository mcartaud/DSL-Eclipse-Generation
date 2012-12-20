/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel;

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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getPerspectiveID <em>Perspective ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getActionSets <em>Action Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getPerspective()
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
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getPerspective_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Perspective ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Perspective ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Perspective ID</em>' attribute.
   * @see #setPerspectiveID(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getPerspective_PerspectiveID()
   * @model unique="false"
   * @generated
   */
  String getPerspectiveID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getPerspectiveID <em>Perspective ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Perspective ID</em>' attribute.
   * @see #getPerspectiveID()
   * @generated
   */
  void setPerspectiveID(String value);

  /**
   * Returns the value of the '<em><b>Action Sets</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipsemodel.ActionSet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Sets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Sets</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getPerspective_ActionSets()
   * @model containment="true"
   * @generated
   */
  EList<ActionSet> getActionSets();

  /**
   * Returns the value of the '<em><b>Parts</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipsemodel.Part}.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipsemodel.Part#getPerspectives <em>Perspectives</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parts</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getPerspective_Parts()
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Part#getPerspectives
   * @model opposite="perspectives"
   * @generated
   */
  EList<Part> getParts();

} // Perspective
