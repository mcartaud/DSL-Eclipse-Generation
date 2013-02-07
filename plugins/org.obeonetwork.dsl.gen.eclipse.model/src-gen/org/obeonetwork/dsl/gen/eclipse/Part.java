/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Part#getPartID <em>Part ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Part#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Part#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Part#getActionSets <em>Action Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Part#getContextualHelp <em>Contextual Help</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPart()
 * @model abstract="true"
 * @generated
 */
public interface Part extends EObject
{
  /**
   * Returns the value of the '<em><b>Part ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part ID</em>' attribute.
   * @see #setPartID(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPart_PartID()
   * @model unique="false"
   * @generated
   */
  String getPartID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Part#getPartID <em>Part ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part ID</em>' attribute.
   * @see #getPartID()
   * @generated
   */
  void setPartID(String value);

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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPart_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Part#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPart_Description()
   * @model unique="false"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Part#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPart_ActionSets()
   * @model containment="true"
   * @generated
   */
  EList<ActionSet> getActionSets();

  /**
   * Returns the value of the '<em><b>Contextual Help</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contextual Help</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contextual Help</em>' containment reference.
   * @see #setContextualHelp(ContextualHelp)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getPart_ContextualHelp()
   * @model containment="true"
   * @generated
   */
  ContextualHelp getContextualHelp();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Part#getContextualHelp <em>Contextual Help</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contextual Help</em>' containment reference.
   * @see #getContextualHelp()
   * @generated
   */
  void setContextualHelp(ContextualHelp value);

} // Part
