/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getLabel <em>Label</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getFeatureID <em>Feature ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getBundles <em>Bundles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getFeature_Label()
   * @model unique="false"
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Feature ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature ID</em>' attribute.
   * @see #setFeatureID(String)
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getFeature_FeatureID()
   * @model unique="false"
   * @generated
   */
  String getFeatureID();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getFeatureID <em>Feature ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature ID</em>' attribute.
   * @see #getFeatureID()
   * @generated
   */
  void setFeatureID(String value);

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
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getFeature_Copyright()
   * @model unique="false"
   * @generated
   */
  String getCopyright();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getCopyright <em>Copyright</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Copyright</em>' attribute.
   * @see #getCopyright()
   * @generated
   */
  void setCopyright(String value);

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
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getFeature_Description()
   * @model unique="false"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getFeature_Version()
   * @model unique="false"
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Bundles</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bundles</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bundles</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelPackage#getFeature_Bundles()
   * @model
   * @generated
   */
  EList<Bundle> getBundles();

} // Feature
