/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getDeclarativeServices <em>Declarative Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getImportDeclarations <em>Import Declarations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getNatures <em>Natures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getBuilders <em>Builders</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getWizards <em>Wizards</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getExtensionPointProvider <em>Extension Point Provider</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getExtensionPointClient <em>Extension Point Client</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getDecorators <em>Decorators</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getMarkers <em>Markers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getEditors <em>Editors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getViews <em>Views</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getHelpContents <em>Help Contents</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getMenuContributions <em>Menu Contributions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getToolbarContributions <em>Toolbar Contributions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getPopupMenuContributions <em>Popup Menu Contributions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getContextualHandlers <em>Contextual Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle()
 * @model
 * @generated
 */
public interface Bundle extends Project {
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
	 * @model unique="false" dataType="org.obeonetwork.dsl.gen.eclipse.Version"
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
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.gen.eclipse.JavaVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Environment</em>' attribute.
	 * @see org.obeonetwork.dsl.gen.eclipse.JavaVersion
	 * @see #setRequiredEnvironment(JavaVersion)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_RequiredEnvironment()
	 * @model default="" unique="false"
	 * @generated
	 */
	JavaVersion getRequiredEnvironment();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getRequiredEnvironment <em>Required Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Environment</em>' attribute.
	 * @see org.obeonetwork.dsl.gen.eclipse.JavaVersion
	 * @see #getRequiredEnvironment()
	 * @generated
	 */
	void setRequiredEnvironment(JavaVersion value);

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
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Author()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Declarative Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarative Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarative Services</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_DeclarativeServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclarativeService> getDeclarativeServices();

	/**
	 * Returns the value of the '<em><b>Import Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.ImportDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Declarations</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_ImportDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportDeclaration> getImportDeclarations();

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
	 * Returns the value of the '<em><b>Extension Point Provider</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Point Provider</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Point Provider</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_ExtensionPointProvider()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtensionPointProvider> getExtensionPointProvider();

	/**
	 * Returns the value of the '<em><b>Extension Point Client</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Point Client</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Point Client</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_ExtensionPointClient()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtensionPointClient> getExtensionPointClient();

	/**
	 * Returns the value of the '<em><b>Decorators</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Decorator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decorators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorators</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Decorators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decorator> getDecorators();

	/**
	 * Returns the value of the '<em><b>Markers</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Marker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Markers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markers</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Markers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Marker> getMarkers();

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
	 * Returns the value of the '<em><b>Editors</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Editor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editors</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Editors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Editor> getEditors();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Help Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.HelpContents}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help Contents</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_HelpContents()
	 * @model containment="true"
	 * @generated
	 */
	EList<HelpContents> getHelpContents();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContexts();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Exported Packages</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.codegen.ecore.genmodel.GenPackage}.
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
	EList<GenPackage> getExportedPackages();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.gen.eclipse.BasedOn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' attribute.
	 * @see org.obeonetwork.dsl.gen.eclipse.BasedOn
	 * @see #setBasedOn(BasedOn)
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_BasedOn()
	 * @model
	 * @generated
	 */
	BasedOn getBasedOn();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getBasedOn <em>Based On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Based On</em>' attribute.
	 * @see org.obeonetwork.dsl.gen.eclipse.BasedOn
	 * @see #getBasedOn()
	 * @generated
	 */
	void setBasedOn(BasedOn value);

	/**
	 * Returns the value of the '<em><b>Menu Contributions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.MenuContribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Contributions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Contributions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_MenuContributions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuContribution> getMenuContributions();

	/**
	 * Returns the value of the '<em><b>Toolbar Contributions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.ToolbarContribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toolbar Contributions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolbar Contributions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_ToolbarContributions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToolbarContribution> getToolbarContributions();

	/**
	 * Returns the value of the '<em><b>Popup Menu Contributions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Popup Menu Contributions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Popup Menu Contributions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_PopupMenuContributions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PopupMenuContribution> getPopupMenuContributions();

	/**
	 * Returns the value of the '<em><b>Contextual Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.gen.eclipse.ContextualHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextual Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextual Handlers</em>' containment reference list.
	 * @see org.obeonetwork.dsl.gen.eclipse.EclipsePackage#getBundle_ContextualHandlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextualHandler> getContextualHandlers();

} // Bundle
