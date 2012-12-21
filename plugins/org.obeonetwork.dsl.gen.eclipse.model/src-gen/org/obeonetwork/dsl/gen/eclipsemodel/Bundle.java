/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getRequiredEnvironment <em>Required Environment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getServices <em>Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getPartCategories <em>Part Categories</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getHelps <em>Helps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getBundle()
 * @model
 * @generated
 */
public interface Bundle extends Project
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getBundle_Version()
   * @model unique="false"
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Required Environment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Environment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Environment</em>' attribute.
   * @see #setRequiredEnvironment(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getBundle_RequiredEnvironment()
   * @model unique="false"
   * @generated
   */
  String getRequiredEnvironment();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getRequiredEnvironment <em>Required Environment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required Environment</em>' attribute.
   * @see #getRequiredEnvironment()
   * @generated
   */
  void setRequiredEnvironment(String value);

  /**
   * Returns the value of the '<em><b>Vendor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vendor</em>' attribute.
   * @see #setVendor(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getBundle_Vendor()
   * @model unique="false"
   * @generated
   */
  String getVendor();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getVendor <em>Vendor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vendor</em>' attribute.
   * @see #getVendor()
   * @generated
   */
  void setVendor(String value);

  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipsemodel.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getBundle_Services()
   * @model containment="true"
   * @generated
   */
  EList<Service> getServices();

  /**
   * Returns the value of the '<em><b>Part Categories</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipsemodel.PartCategory}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Categories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Categories</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getBundle_PartCategories()
   * @model containment="true"
   * @generated
   */
  EList<PartCategory> getPartCategories();

  /**
   * Returns the value of the '<em><b>Perspectives</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Perspectives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Perspectives</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getBundle_Perspectives()
   * @model containment="true"
   * @generated
   */
  EList<Perspective> getPerspectives();

  /**
   * Returns the value of the '<em><b>Helps</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipsemodel.Help}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Helps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Helps</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getBundle_Helps()
   * @model containment="true"
   * @generated
   */
  EList<Help> getHelps();

} // Bundle
