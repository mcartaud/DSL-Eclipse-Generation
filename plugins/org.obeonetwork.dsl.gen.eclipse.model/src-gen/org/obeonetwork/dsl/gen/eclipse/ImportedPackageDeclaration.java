/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration#getPackageVersion <em>Package Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getImportedPackageDeclaration()
 * @model
 * @generated
 */
public interface ImportedPackageDeclaration extends EObject
{
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getImportedPackageDeclaration_PackageName()
   * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Namespace" required="true"
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration#getPackageName <em>Package Name</em>}' attribute.
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getImportedPackageDeclaration_PackageVersion()
   * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Version"
   * @generated
   */
  String getPackageVersion();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration#getPackageVersion <em>Package Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Version</em>' attribute.
   * @see #getPackageVersion()
   * @generated
   */
  void setPackageVersion(String value);

} // ImportedPackageDeclaration
