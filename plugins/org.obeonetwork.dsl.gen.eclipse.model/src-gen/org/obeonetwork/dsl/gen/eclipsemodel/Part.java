/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel;

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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Part#getPartID <em>Part ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Part#getContextualHelp <em>Contextual Help</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Part#getPerspectives <em>Perspectives</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getPart()
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
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getPart_PartID()
   * @model unique="false"
   * @generated
   */
  String getPartID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Part#getPartID <em>Part ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part ID</em>' attribute.
   * @see #getPartID()
   * @generated
   */
  void setPartID(String value);

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
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getPart_ContextualHelp()
   * @model containment="true"
   * @generated
   */
  ContextualHelp getContextualHelp();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Part#getContextualHelp <em>Contextual Help</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contextual Help</em>' containment reference.
   * @see #getContextualHelp()
   * @generated
   */
  void setContextualHelp(ContextualHelp value);

  /**
   * Returns the value of the '<em><b>Perspectives</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective}.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Perspectives</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Perspectives</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getPart_Perspectives()
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getParts
   * @model opposite="parts"
   * @generated
   */
  EList<Perspective> getPerspectives();

} // Part
