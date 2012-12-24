/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getApplicationID <em>Application ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Application#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Application ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application ID</em>' attribute.
   * @see #setApplicationID(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_ApplicationID()
   * @model unique="false"
   * @generated
   */
  String getApplicationID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Application#getApplicationID <em>Application ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application ID</em>' attribute.
   * @see #getApplicationID()
   * @generated
   */
  void setApplicationID(String value);

  /**
   * Returns the value of the '<em><b>Provider</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provider</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provider</em>' attribute.
   * @see #setProvider(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_Provider()
   * @model unique="false"
   * @generated
   */
  String getProvider();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Application#getProvider <em>Provider</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provider</em>' attribute.
   * @see #getProvider()
   * @generated
   */
  void setProvider(String value);

  /**
   * Returns the value of the '<em><b>Copyright</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Copyright</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Copyright</em>' attribute.
   * @see #setCopyright(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_Copyright()
   * @model unique="false"
   * @generated
   */
  String getCopyright();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Application#getCopyright <em>Copyright</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Copyright</em>' attribute.
   * @see #getCopyright()
   * @generated
   */
  void setCopyright(String value);

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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_Version()
   * @model unique="false"
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Application#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Repository}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repositories</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_Repositories()
   * @model containment="true"
   * @generated
   */
  EList<Repository> getRepositories();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

  /**
   * Returns the value of the '<em><b>Bundles</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Bundle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bundles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bundles</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_Bundles()
   * @model containment="true"
   * @generated
   */
  EList<Bundle> getBundles();

} // Application
