/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Context#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Context#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Context#getPerspective <em>Perspective</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Context#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getContext_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Context#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Context}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contexts</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getContext_Contexts()
   * @model containment="true"
   * @generated
   */
  EList<Context> getContexts();

  /**
   * Returns the value of the '<em><b>Perspective</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Perspective</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Perspective</em>' reference.
   * @see #setPerspective(Perspective)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getContext_Perspective()
   * @see org.obeonetwork.dsl.gen.eclipse.Perspective#getContext
   * @model opposite="context"
   * @generated
   */
  Perspective getPerspective();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Context#getPerspective <em>Perspective</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Perspective</em>' reference.
   * @see #getPerspective()
   * @generated
   */
  void setPerspective(Perspective value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Command}.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipse.Command#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getContext_Commands()
   * @see org.obeonetwork.dsl.gen.eclipse.Command#getContext
   * @model opposite="context"
   * @generated
   */
  EList<Command> getCommands();

} // Context
