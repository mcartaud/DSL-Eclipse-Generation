/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getRequiredServices <em>Required Services</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProvidedService_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Service ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service ID</em>' attribute.
   * @see #setServiceID(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProvidedService_ServiceID()
   * @model unique="false"
   * @generated
   */
  String getServiceID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getServiceID <em>Service ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service ID</em>' attribute.
   * @see #getServiceID()
   * @generated
   */
  void setServiceID(String value);

  /**
   * Returns the value of the '<em><b>Implementation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implementation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implementation</em>' reference.
   * @see #setImplementation(EClass)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProvidedService_Implementation()
   * @model
   * @generated
   */
  EClass getImplementation();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getImplementation <em>Implementation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implementation</em>' reference.
   * @see #getImplementation()
   * @generated
   */
  void setImplementation(EClass value);

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
   * @model
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

  /**
   * Returns the value of the '<em><b>Required Services</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.RequiredService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Services</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Services</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getProvidedService_RequiredServices()
   * @model
   * @generated
   */
  EList<RequiredService> getRequiredServices();

} // ProvidedService
