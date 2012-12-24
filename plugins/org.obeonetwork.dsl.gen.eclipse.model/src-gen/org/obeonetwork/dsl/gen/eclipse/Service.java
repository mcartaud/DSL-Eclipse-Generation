/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Service#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Service#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Service#getServiceKinds <em>Service Kinds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getService_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Service#getName <em>Name</em>}' attribute.
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getService_ServiceID()
   * @model unique="false"
   * @generated
   */
  String getServiceID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Service#getServiceID <em>Service ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service ID</em>' attribute.
   * @see #getServiceID()
   * @generated
   */
  void setServiceID(String value);

  /**
   * Returns the value of the '<em><b>Service Kinds</b></em>' attribute list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.ServiceKind}.
   * The literals are from the enumeration {@link org.obeonetwork.dsl.gen.eclipse.ServiceKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Kinds</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Kinds</em>' attribute list.
   * @see org.obeonetwork.dsl.gen.eclipse.ServiceKind
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getService_ServiceKinds()
   * @model unique="false"
   * @generated
   */
  EList<ServiceKind> getServiceKinds();

} // Service
