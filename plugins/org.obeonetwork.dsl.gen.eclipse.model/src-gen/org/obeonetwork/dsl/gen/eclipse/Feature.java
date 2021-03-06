/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Feature#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Feature#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Feature#getLicense <em>License</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Feature#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Feature#getBundles <em>Bundles</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Feature#isGenerateSdkFeature <em>Generate Sdk Feature</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Feature#getExcludeBundleForSdk <em>Exclude Bundle For Sdk</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Feature#getIncludedFeatures <em>Included Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends Project {
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getFeature_Copyright()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getCopyright <em>Copyright</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getFeature_Description()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getDescription <em>Description</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getFeature_Version()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Version"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getFeature_License()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getFeature_Author()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Bundles</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Bundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundles</em>' reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getFeature_Bundles()
	 * @model required="true"
	 * @generated
	 */
	EList<Bundle> getBundles();

	/**
	 * Returns the value of the '<em><b>Generate Sdk Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Sdk Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Sdk Feature</em>' attribute.
	 * @see #setGenerateSdkFeature(boolean)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getFeature_GenerateSdkFeature()
	 * @model
	 * @generated
	 */
	boolean isGenerateSdkFeature();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Feature#isGenerateSdkFeature <em>Generate Sdk Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Sdk Feature</em>' attribute.
	 * @see #isGenerateSdkFeature()
	 * @generated
	 */
	void setGenerateSdkFeature(boolean value);

	/**
	 * Returns the value of the '<em><b>Exclude Bundle For Sdk</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Bundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Bundle For Sdk</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Bundle For Sdk</em>' reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getFeature_ExcludeBundleForSdk()
	 * @model
	 * @generated
	 */
	EList<Bundle> getExcludeBundleForSdk();

	/**
	 * Returns the value of the '<em><b>Included Features</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Features</em>' reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getFeature_IncludedFeatures()
	 * @model
	 * @generated
	 */
	EList<Feature> getIncludedFeatures();

} // Feature
