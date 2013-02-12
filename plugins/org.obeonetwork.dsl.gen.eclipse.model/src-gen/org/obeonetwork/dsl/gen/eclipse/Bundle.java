/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getRequiredEnvironment <em>Required Environment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getProvidedServices <em>Provided Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getRequiredServices <em>Required Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getPartCategories <em>Part Categories</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getHelps <em>Helps</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getImportedPackageDeclarations <em>Imported Package Declarations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getNatures <em>Natures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getBuilders <em>Builders</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getWizards <em>Wizards</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getAllExportedPackages <em>All Exported Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle()
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Version()
   * @model unique="false"
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getVersion <em>Version</em>}' attribute.
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_RequiredEnvironment()
   * @model unique="false"
   * @generated
   */
  String getRequiredEnvironment();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getRequiredEnvironment <em>Required Environment</em>}' attribute.
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
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Vendor()
   * @model unique="false"
   * @generated
   */
  String getVendor();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getVendor <em>Vendor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vendor</em>' attribute.
   * @see #getVendor()
   * @generated
   */
  void setVendor(String value);

  /**
   * Returns the value of the '<em><b>Base Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Package</em>' attribute.
   * @see #setBasePackage(String)
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_BasePackage()
   * @model unique="false"
   * @generated
   */
  String getBasePackage();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getBasePackage <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Package</em>' attribute.
   * @see #getBasePackage()
   * @generated
   */
  void setBasePackage(String value);

  /**
   * Returns the value of the '<em><b>Provided Services</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.ProvidedService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provided Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provided Services</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_ProvidedServices()
   * @model containment="true"
   * @generated
   */
  EList<ProvidedService> getProvidedServices();

  /**
   * Returns the value of the '<em><b>Required Services</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.RequiredService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Services</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_RequiredServices()
   * @model containment="true"
   * @generated
   */
  EList<RequiredService> getRequiredServices();

  /**
   * Returns the value of the '<em><b>Part Categories</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.PartCategory}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Categories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Categories</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_PartCategories()
   * @model containment="true"
   * @generated
   */
  EList<PartCategory> getPartCategories();

  /**
   * Returns the value of the '<em><b>Perspectives</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Perspective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Perspectives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Perspectives</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Perspectives()
   * @model containment="true"
   * @generated
   */
  EList<Perspective> getPerspectives();

  /**
   * Returns the value of the '<em><b>Helps</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Help}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Helps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Helps</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Helps()
   * @model containment="true"
   * @generated
   */
  EList<Help> getHelps();

  /**
   * Returns the value of the '<em><b>Imported Package Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Package Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Package Declarations</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_ImportedPackageDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<ImportedPackageDeclaration> getImportedPackageDeclarations();

  /**
   * Returns the value of the '<em><b>Natures</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Nature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Natures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Natures</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Natures()
   * @model containment="true"
   * @generated
   */
  EList<Nature> getNatures();

  /**
   * Returns the value of the '<em><b>Builders</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Builder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builders</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Builders()
   * @model containment="true"
   * @generated
   */
  EList<Builder> getBuilders();

  /**
   * Returns the value of the '<em><b>Wizards</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Wizard}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wizards</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wizards</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Wizards()
   * @model containment="true"
   * @generated
   */
  EList<Wizard> getWizards();

  /**
   * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Extension}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extensions</em>' containment reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Extensions()
   * @model containment="true"
   * @generated
   */
  EList<Extension> getExtensions();

  /**
   * Returns the value of the '<em><b>Exported Packages</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exported Packages</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exported Packages</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_ExportedPackages()
   * @model
   * @generated
   */
  EList<EPackage> getExportedPackages();

  /**
   * Returns the value of the '<em><b>Owned Packages</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Packages</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Packages</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_OwnedPackages()
   * @model
   * @generated
   */
  EList<EPackage> getOwnedPackages();

  /**
   * Returns the value of the '<em><b>All Exported Packages</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Exported Packages</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Exported Packages</em>' reference list.
   * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_AllExportedPackages()
   * @model derived="true"
   * @generated
   */
  EList<EPackage> getAllExportedPackages();

} // Bundle
