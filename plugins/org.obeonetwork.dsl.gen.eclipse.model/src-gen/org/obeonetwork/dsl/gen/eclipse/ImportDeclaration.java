/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ImportDeclaration#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ImportDeclaration#getPackageVersion <em>Package Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ImportDeclaration#getImportType <em>Import Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getImportDeclaration()
 * @model
 * @generated
 */
public interface ImportDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getImportDeclaration_PackageName()
	 * @model dataType="org.obeonetwork.dsl.gen.eclipse.Namespace" required="true"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ImportDeclaration#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Package Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Version</em>' attribute.
	 * @see #setPackageVersion(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getImportDeclaration_PackageVersion()
	 * @model dataType="org.obeonetwork.dsl.gen.eclipse.Version"
	 * @generated
	 */
	String getPackageVersion();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ImportDeclaration#getPackageVersion <em>Package Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Version</em>' attribute.
	 * @see #getPackageVersion()
	 * @generated
	 */
	void setPackageVersion(String value);

	/**
	 * Returns the value of the '<em><b>Import Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.gen.eclipse.ImportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Type</em>' attribute.
	 * @see org.obeonetwork.dsl.gen.eclipse.ImportType
	 * @see #setImportType(ImportType)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getImportDeclaration_ImportType()
	 * @model
	 * @generated
	 */
	ImportType getImportType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ImportDeclaration#getImportType <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Type</em>' attribute.
	 * @see org.obeonetwork.dsl.gen.eclipse.ImportType
	 * @see #getImportType()
	 * @generated
	 */
	void setImportType(ImportType value);

} // ImportDeclaration
