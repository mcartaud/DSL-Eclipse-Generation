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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getApplicationID <em>Application ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getDefaultAuthor <em>Default Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getLicense <em>License</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getBaseNamespace <em>Base Namespace</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#isMavenCompilation <em>Maven Compilation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#isGenerateTestsBundle <em>Generate Tests Bundle</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Application#getGenerateCheckStyle <em>Generate Check Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
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
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Namespace" required="true"
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
	 * Returns the value of the '<em><b>Default Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Author</em>' attribute.
	 * @see #setDefaultAuthor(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_DefaultAuthor()
	 * @model unique="false"
	 * @generated
	 */
	String getDefaultAuthor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Application#getDefaultAuthor <em>Default Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Author</em>' attribute.
	 * @see #getDefaultAuthor()
	 * @generated
	 */
	void setDefaultAuthor(String value);

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
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_License()
	 * @model unique="false"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Application#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

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
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Version"
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
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Application#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Base Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Namespace</em>' attribute.
	 * @see #setBaseNamespace(String)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_BaseNamespace()
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Namespace" required="true"
	 * @generated
	 */
	String getBaseNamespace();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Application#getBaseNamespace <em>Base Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Namespace</em>' attribute.
	 * @see #getBaseNamespace()
	 * @generated
	 */
	void setBaseNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Maven Compilation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maven Compilation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maven Compilation</em>' attribute.
	 * @see #setMavenCompilation(boolean)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_MavenCompilation()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isMavenCompilation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Application#isMavenCompilation <em>Maven Compilation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maven Compilation</em>' attribute.
	 * @see #isMavenCompilation()
	 * @generated
	 */
	void setMavenCompilation(boolean value);

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Generate Tests Bundle</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Tests Bundle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Tests Bundle</em>' attribute.
	 * @see #setGenerateTestsBundle(boolean)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_GenerateTestsBundle()
	 * @model default="true"
	 * @generated
	 */
	boolean isGenerateTestsBundle();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Application#isGenerateTestsBundle <em>Generate Tests Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Tests Bundle</em>' attribute.
	 * @see #isGenerateTestsBundle()
	 * @generated
	 */
	void setGenerateTestsBundle(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Check Style</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Check Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Check Style</em>' attribute.
	 * @see #setGenerateCheckStyle(Boolean)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getApplication_GenerateCheckStyle()
	 * @model default="true"
	 * @generated
	 */
	Boolean getGenerateCheckStyle();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Application#getGenerateCheckStyle <em>Generate Check Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Check Style</em>' attribute.
	 * @see #getGenerateCheckStyle()
	 * @generated
	 */
	void setGenerateCheckStyle(Boolean value);

} // Application
