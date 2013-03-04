/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProvidedService()
 * @model
 * @generated
 */
public interface ProvidedService extends EObject
{
  /**
   * Returns the value of the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' reference.
   * @see #setInterface(EClass)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProvidedService_Interface()
   * @model required="true"
   * @generated
   */
  EClass getInterface();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getInterface <em>Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' reference.
   * @see #getInterface()
   * @generated
   */
  void setInterface(EClass value);

} // ProvidedService
