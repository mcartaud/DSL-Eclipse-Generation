/**
 */
package org.obeonetwork.dsl.gen.eclipse.impl;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.gen.eclipse.BasedOn;
import org.obeonetwork.dsl.gen.eclipse.Binding;
import org.obeonetwork.dsl.gen.eclipse.Builder;
import org.obeonetwork.dsl.gen.eclipse.Bundle;
import org.obeonetwork.dsl.gen.eclipse.Category;
import org.obeonetwork.dsl.gen.eclipse.Command;
import org.obeonetwork.dsl.gen.eclipse.Context;
import org.obeonetwork.dsl.gen.eclipse.ContextualHandler;
import org.obeonetwork.dsl.gen.eclipse.DeclarativeService;
import org.obeonetwork.dsl.gen.eclipse.Decorator;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Editor;
import org.obeonetwork.dsl.gen.eclipse.ExtensionPoint;
import org.obeonetwork.dsl.gen.eclipse.HelpContents;
import org.obeonetwork.dsl.gen.eclipse.ImportDeclaration;
import org.obeonetwork.dsl.gen.eclipse.JavaVersion;
import org.obeonetwork.dsl.gen.eclipse.Marker;
import org.obeonetwork.dsl.gen.eclipse.MenuContribution;
import org.obeonetwork.dsl.gen.eclipse.Nature;
import org.obeonetwork.dsl.gen.eclipse.Perspective;
import org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution;
import org.obeonetwork.dsl.gen.eclipse.ToolbarContribution;
import org.obeonetwork.dsl.gen.eclipse.View;
import org.obeonetwork.dsl.gen.eclipse.Wizard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getRequiredEnvironment <em>Required Environment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getDeclarativeServices <em>Declarative Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getImportDeclarations <em>Import Declarations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getNatures <em>Natures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getBuilders <em>Builders</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getWizards <em>Wizards</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getDecorators <em>Decorators</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getEditors <em>Editors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getViews <em>Views</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getHelpContents <em>Help Contents</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getMenuContributions <em>Menu Contributions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getToolbarContributions <em>Toolbar Contributions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getPopupMenuContributions <em>Popup Menu Contributions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl#getContextualHandlers <em>Contextual Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleImpl extends ProjectImpl implements Bundle {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredEnvironment() <em>Required Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final JavaVersion REQUIRED_ENVIRONMENT_EDEFAULT = JavaVersion.JAVA_SE15;

	/**
	 * The cached value of the '{@link #getRequiredEnvironment() <em>Required Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredEnvironment()
	 * @generated
	 * @ordered
	 */
	protected JavaVersion requiredEnvironment = REQUIRED_ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclarativeServices() <em>Declarative Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarativeServices()
	 * @generated
	 * @ordered
	 */
	protected EList<DeclarativeService> declarativeServices;

	/**
	 * The cached value of the '{@link #getImportDeclarations() <em>Import Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportDeclaration> importDeclarations;

	/**
	 * The cached value of the '{@link #getNatures() <em>Natures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Nature> natures;

	/**
	 * The cached value of the '{@link #getBuilders() <em>Builders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilders()
	 * @generated
	 * @ordered
	 */
	protected EList<Builder> builders;

	/**
	 * The cached value of the '{@link #getWizards() <em>Wizards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWizards()
	 * @generated
	 * @ordered
	 */
	protected EList<Wizard> wizards;

	/**
	 * The cached value of the '{@link #getExtensionPoints() <em>Extension Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionPoint> extensionPoints;

	/**
	 * The cached value of the '{@link #getDecorators() <em>Decorators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorators()
	 * @generated
	 * @ordered
	 */
	protected EList<Decorator> decorators;

	/**
	 * The cached value of the '{@link #getMarkers() <em>Markers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkers()
	 * @generated
	 * @ordered
	 */
	protected EList<Marker> markers;

	/**
	 * The cached value of the '{@link #getPerspectives() <em>Perspectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Perspective> perspectives;

	/**
	 * The cached value of the '{@link #getEditors() <em>Editors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditors()
	 * @generated
	 * @ordered
	 */
	protected EList<Editor> editors;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The cached value of the '{@link #getHelpContents() <em>Help Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpContents()
	 * @generated
	 * @ordered
	 */
	protected EList<HelpContents> helpContents;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> contexts;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindings;

	/**
	 * The cached value of the '{@link #getExportedPackages() <em>Exported Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<GenPackage> exportedPackages;

	/**
	 * The default value of the '{@link #getBasedOn() <em>Based On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected static final BasedOn BASED_ON_EDEFAULT = BasedOn.ECORE;

	/**
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected BasedOn basedOn = BASED_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMenuContributions() <em>Menu Contributions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuContributions()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuContribution> menuContributions;

	/**
	 * The cached value of the '{@link #getToolbarContributions() <em>Toolbar Contributions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolbarContributions()
	 * @generated
	 * @ordered
	 */
	protected EList<ToolbarContribution> toolbarContributions;

	/**
	 * The cached value of the '{@link #getPopupMenuContributions() <em>Popup Menu Contributions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopupMenuContributions()
	 * @generated
	 * @ordered
	 */
	protected EList<PopupMenuContribution> popupMenuContributions;

	/**
	 * The cached value of the '{@link #getContextualHandlers() <em>Contextual Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextualHandler> contextualHandlers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipsePackage.Literals.BUNDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.BUNDLE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaVersion getRequiredEnvironment() {
		return requiredEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredEnvironment(JavaVersion newRequiredEnvironment) {
		JavaVersion oldRequiredEnvironment = requiredEnvironment;
		requiredEnvironment = newRequiredEnvironment == null ? REQUIRED_ENVIRONMENT_EDEFAULT : newRequiredEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.BUNDLE__REQUIRED_ENVIRONMENT, oldRequiredEnvironment, requiredEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.BUNDLE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclarativeService> getDeclarativeServices() {
		if (declarativeServices == null) {
			declarativeServices = new EObjectContainmentEList<DeclarativeService>(DeclarativeService.class, this, EclipsePackage.BUNDLE__DECLARATIVE_SERVICES);
		}
		return declarativeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportDeclaration> getImportDeclarations() {
		if (importDeclarations == null) {
			importDeclarations = new EObjectContainmentEList<ImportDeclaration>(ImportDeclaration.class, this, EclipsePackage.BUNDLE__IMPORT_DECLARATIONS);
		}
		return importDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nature> getNatures() {
		if (natures == null) {
			natures = new EObjectContainmentEList<Nature>(Nature.class, this, EclipsePackage.BUNDLE__NATURES);
		}
		return natures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Builder> getBuilders() {
		if (builders == null) {
			builders = new EObjectContainmentEList<Builder>(Builder.class, this, EclipsePackage.BUNDLE__BUILDERS);
		}
		return builders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wizard> getWizards() {
		if (wizards == null) {
			wizards = new EObjectContainmentEList<Wizard>(Wizard.class, this, EclipsePackage.BUNDLE__WIZARDS);
		}
		return wizards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionPoint> getExtensionPoints() {
		if (extensionPoints == null) {
			extensionPoints = new EObjectContainmentEList<ExtensionPoint>(ExtensionPoint.class, this, EclipsePackage.BUNDLE__EXTENSION_POINTS);
		}
		return extensionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decorator> getDecorators() {
		if (decorators == null) {
			decorators = new EObjectContainmentEList<Decorator>(Decorator.class, this, EclipsePackage.BUNDLE__DECORATORS);
		}
		return decorators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Marker> getMarkers() {
		if (markers == null) {
			markers = new EObjectContainmentEList<Marker>(Marker.class, this, EclipsePackage.BUNDLE__MARKERS);
		}
		return markers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Perspective> getPerspectives() {
		if (perspectives == null) {
			perspectives = new EObjectContainmentEList<Perspective>(Perspective.class, this, EclipsePackage.BUNDLE__PERSPECTIVES);
		}
		return perspectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Editor> getEditors() {
		if (editors == null) {
			editors = new EObjectContainmentEList<Editor>(Editor.class, this, EclipsePackage.BUNDLE__EDITORS);
		}
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<View>(View.class, this, EclipsePackage.BUNDLE__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HelpContents> getHelpContents() {
		if (helpContents == null) {
			helpContents = new EObjectContainmentEList<HelpContents>(HelpContents.class, this, EclipsePackage.BUNDLE__HELP_CONTENTS);
		}
		return helpContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<Command>(Command.class, this, EclipsePackage.BUNDLE__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<Context>(Context.class, this, EclipsePackage.BUNDLE__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Category>(Category.class, this, EclipsePackage.BUNDLE__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<Binding>(Binding.class, this, EclipsePackage.BUNDLE__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenPackage> getExportedPackages() {
		if (exportedPackages == null) {
			exportedPackages = new EObjectResolvingEList<GenPackage>(GenPackage.class, this, EclipsePackage.BUNDLE__EXPORTED_PACKAGES);
		}
		return exportedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasedOn getBasedOn() {
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedOn(BasedOn newBasedOn) {
		BasedOn oldBasedOn = basedOn;
		basedOn = newBasedOn == null ? BASED_ON_EDEFAULT : newBasedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipsePackage.BUNDLE__BASED_ON, oldBasedOn, basedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuContribution> getMenuContributions() {
		if (menuContributions == null) {
			menuContributions = new EObjectContainmentEList<MenuContribution>(MenuContribution.class, this, EclipsePackage.BUNDLE__MENU_CONTRIBUTIONS);
		}
		return menuContributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToolbarContribution> getToolbarContributions() {
		if (toolbarContributions == null) {
			toolbarContributions = new EObjectContainmentEList<ToolbarContribution>(ToolbarContribution.class, this, EclipsePackage.BUNDLE__TOOLBAR_CONTRIBUTIONS);
		}
		return toolbarContributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PopupMenuContribution> getPopupMenuContributions() {
		if (popupMenuContributions == null) {
			popupMenuContributions = new EObjectContainmentEList<PopupMenuContribution>(PopupMenuContribution.class, this, EclipsePackage.BUNDLE__POPUP_MENU_CONTRIBUTIONS);
		}
		return popupMenuContributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextualHandler> getContextualHandlers() {
		if (contextualHandlers == null) {
			contextualHandlers = new EObjectContainmentEList<ContextualHandler>(ContextualHandler.class, this, EclipsePackage.BUNDLE__CONTEXTUAL_HANDLERS);
		}
		return contextualHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EclipsePackage.BUNDLE__DECLARATIVE_SERVICES:
				return ((InternalEList<?>)getDeclarativeServices()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__IMPORT_DECLARATIONS:
				return ((InternalEList<?>)getImportDeclarations()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__NATURES:
				return ((InternalEList<?>)getNatures()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__BUILDERS:
				return ((InternalEList<?>)getBuilders()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__WIZARDS:
				return ((InternalEList<?>)getWizards()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__EXTENSION_POINTS:
				return ((InternalEList<?>)getExtensionPoints()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__DECORATORS:
				return ((InternalEList<?>)getDecorators()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__PERSPECTIVES:
				return ((InternalEList<?>)getPerspectives()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__EDITORS:
				return ((InternalEList<?>)getEditors()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__HELP_CONTENTS:
				return ((InternalEList<?>)getHelpContents()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__CONTEXTS:
				return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__MENU_CONTRIBUTIONS:
				return ((InternalEList<?>)getMenuContributions()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__TOOLBAR_CONTRIBUTIONS:
				return ((InternalEList<?>)getToolbarContributions()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__POPUP_MENU_CONTRIBUTIONS:
				return ((InternalEList<?>)getPopupMenuContributions()).basicRemove(otherEnd, msgs);
			case EclipsePackage.BUNDLE__CONTEXTUAL_HANDLERS:
				return ((InternalEList<?>)getContextualHandlers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EclipsePackage.BUNDLE__VERSION:
				return getVersion();
			case EclipsePackage.BUNDLE__REQUIRED_ENVIRONMENT:
				return getRequiredEnvironment();
			case EclipsePackage.BUNDLE__VENDOR:
				return getVendor();
			case EclipsePackage.BUNDLE__DECLARATIVE_SERVICES:
				return getDeclarativeServices();
			case EclipsePackage.BUNDLE__IMPORT_DECLARATIONS:
				return getImportDeclarations();
			case EclipsePackage.BUNDLE__NATURES:
				return getNatures();
			case EclipsePackage.BUNDLE__BUILDERS:
				return getBuilders();
			case EclipsePackage.BUNDLE__WIZARDS:
				return getWizards();
			case EclipsePackage.BUNDLE__EXTENSION_POINTS:
				return getExtensionPoints();
			case EclipsePackage.BUNDLE__DECORATORS:
				return getDecorators();
			case EclipsePackage.BUNDLE__MARKERS:
				return getMarkers();
			case EclipsePackage.BUNDLE__PERSPECTIVES:
				return getPerspectives();
			case EclipsePackage.BUNDLE__EDITORS:
				return getEditors();
			case EclipsePackage.BUNDLE__VIEWS:
				return getViews();
			case EclipsePackage.BUNDLE__HELP_CONTENTS:
				return getHelpContents();
			case EclipsePackage.BUNDLE__COMMANDS:
				return getCommands();
			case EclipsePackage.BUNDLE__CONTEXTS:
				return getContexts();
			case EclipsePackage.BUNDLE__CATEGORIES:
				return getCategories();
			case EclipsePackage.BUNDLE__BINDINGS:
				return getBindings();
			case EclipsePackage.BUNDLE__EXPORTED_PACKAGES:
				return getExportedPackages();
			case EclipsePackage.BUNDLE__BASED_ON:
				return getBasedOn();
			case EclipsePackage.BUNDLE__MENU_CONTRIBUTIONS:
				return getMenuContributions();
			case EclipsePackage.BUNDLE__TOOLBAR_CONTRIBUTIONS:
				return getToolbarContributions();
			case EclipsePackage.BUNDLE__POPUP_MENU_CONTRIBUTIONS:
				return getPopupMenuContributions();
			case EclipsePackage.BUNDLE__CONTEXTUAL_HANDLERS:
				return getContextualHandlers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EclipsePackage.BUNDLE__VERSION:
				setVersion((String)newValue);
				return;
			case EclipsePackage.BUNDLE__REQUIRED_ENVIRONMENT:
				setRequiredEnvironment((JavaVersion)newValue);
				return;
			case EclipsePackage.BUNDLE__VENDOR:
				setVendor((String)newValue);
				return;
			case EclipsePackage.BUNDLE__DECLARATIVE_SERVICES:
				getDeclarativeServices().clear();
				getDeclarativeServices().addAll((Collection<? extends DeclarativeService>)newValue);
				return;
			case EclipsePackage.BUNDLE__IMPORT_DECLARATIONS:
				getImportDeclarations().clear();
				getImportDeclarations().addAll((Collection<? extends ImportDeclaration>)newValue);
				return;
			case EclipsePackage.BUNDLE__NATURES:
				getNatures().clear();
				getNatures().addAll((Collection<? extends Nature>)newValue);
				return;
			case EclipsePackage.BUNDLE__BUILDERS:
				getBuilders().clear();
				getBuilders().addAll((Collection<? extends Builder>)newValue);
				return;
			case EclipsePackage.BUNDLE__WIZARDS:
				getWizards().clear();
				getWizards().addAll((Collection<? extends Wizard>)newValue);
				return;
			case EclipsePackage.BUNDLE__EXTENSION_POINTS:
				getExtensionPoints().clear();
				getExtensionPoints().addAll((Collection<? extends ExtensionPoint>)newValue);
				return;
			case EclipsePackage.BUNDLE__DECORATORS:
				getDecorators().clear();
				getDecorators().addAll((Collection<? extends Decorator>)newValue);
				return;
			case EclipsePackage.BUNDLE__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends Marker>)newValue);
				return;
			case EclipsePackage.BUNDLE__PERSPECTIVES:
				getPerspectives().clear();
				getPerspectives().addAll((Collection<? extends Perspective>)newValue);
				return;
			case EclipsePackage.BUNDLE__EDITORS:
				getEditors().clear();
				getEditors().addAll((Collection<? extends Editor>)newValue);
				return;
			case EclipsePackage.BUNDLE__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case EclipsePackage.BUNDLE__HELP_CONTENTS:
				getHelpContents().clear();
				getHelpContents().addAll((Collection<? extends HelpContents>)newValue);
				return;
			case EclipsePackage.BUNDLE__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
				return;
			case EclipsePackage.BUNDLE__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case EclipsePackage.BUNDLE__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case EclipsePackage.BUNDLE__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Binding>)newValue);
				return;
			case EclipsePackage.BUNDLE__EXPORTED_PACKAGES:
				getExportedPackages().clear();
				getExportedPackages().addAll((Collection<? extends GenPackage>)newValue);
				return;
			case EclipsePackage.BUNDLE__BASED_ON:
				setBasedOn((BasedOn)newValue);
				return;
			case EclipsePackage.BUNDLE__MENU_CONTRIBUTIONS:
				getMenuContributions().clear();
				getMenuContributions().addAll((Collection<? extends MenuContribution>)newValue);
				return;
			case EclipsePackage.BUNDLE__TOOLBAR_CONTRIBUTIONS:
				getToolbarContributions().clear();
				getToolbarContributions().addAll((Collection<? extends ToolbarContribution>)newValue);
				return;
			case EclipsePackage.BUNDLE__POPUP_MENU_CONTRIBUTIONS:
				getPopupMenuContributions().clear();
				getPopupMenuContributions().addAll((Collection<? extends PopupMenuContribution>)newValue);
				return;
			case EclipsePackage.BUNDLE__CONTEXTUAL_HANDLERS:
				getContextualHandlers().clear();
				getContextualHandlers().addAll((Collection<? extends ContextualHandler>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EclipsePackage.BUNDLE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EclipsePackage.BUNDLE__REQUIRED_ENVIRONMENT:
				setRequiredEnvironment(REQUIRED_ENVIRONMENT_EDEFAULT);
				return;
			case EclipsePackage.BUNDLE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case EclipsePackage.BUNDLE__DECLARATIVE_SERVICES:
				getDeclarativeServices().clear();
				return;
			case EclipsePackage.BUNDLE__IMPORT_DECLARATIONS:
				getImportDeclarations().clear();
				return;
			case EclipsePackage.BUNDLE__NATURES:
				getNatures().clear();
				return;
			case EclipsePackage.BUNDLE__BUILDERS:
				getBuilders().clear();
				return;
			case EclipsePackage.BUNDLE__WIZARDS:
				getWizards().clear();
				return;
			case EclipsePackage.BUNDLE__EXTENSION_POINTS:
				getExtensionPoints().clear();
				return;
			case EclipsePackage.BUNDLE__DECORATORS:
				getDecorators().clear();
				return;
			case EclipsePackage.BUNDLE__MARKERS:
				getMarkers().clear();
				return;
			case EclipsePackage.BUNDLE__PERSPECTIVES:
				getPerspectives().clear();
				return;
			case EclipsePackage.BUNDLE__EDITORS:
				getEditors().clear();
				return;
			case EclipsePackage.BUNDLE__VIEWS:
				getViews().clear();
				return;
			case EclipsePackage.BUNDLE__HELP_CONTENTS:
				getHelpContents().clear();
				return;
			case EclipsePackage.BUNDLE__COMMANDS:
				getCommands().clear();
				return;
			case EclipsePackage.BUNDLE__CONTEXTS:
				getContexts().clear();
				return;
			case EclipsePackage.BUNDLE__CATEGORIES:
				getCategories().clear();
				return;
			case EclipsePackage.BUNDLE__BINDINGS:
				getBindings().clear();
				return;
			case EclipsePackage.BUNDLE__EXPORTED_PACKAGES:
				getExportedPackages().clear();
				return;
			case EclipsePackage.BUNDLE__BASED_ON:
				setBasedOn(BASED_ON_EDEFAULT);
				return;
			case EclipsePackage.BUNDLE__MENU_CONTRIBUTIONS:
				getMenuContributions().clear();
				return;
			case EclipsePackage.BUNDLE__TOOLBAR_CONTRIBUTIONS:
				getToolbarContributions().clear();
				return;
			case EclipsePackage.BUNDLE__POPUP_MENU_CONTRIBUTIONS:
				getPopupMenuContributions().clear();
				return;
			case EclipsePackage.BUNDLE__CONTEXTUAL_HANDLERS:
				getContextualHandlers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EclipsePackage.BUNDLE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EclipsePackage.BUNDLE__REQUIRED_ENVIRONMENT:
				return requiredEnvironment != REQUIRED_ENVIRONMENT_EDEFAULT;
			case EclipsePackage.BUNDLE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case EclipsePackage.BUNDLE__DECLARATIVE_SERVICES:
				return declarativeServices != null && !declarativeServices.isEmpty();
			case EclipsePackage.BUNDLE__IMPORT_DECLARATIONS:
				return importDeclarations != null && !importDeclarations.isEmpty();
			case EclipsePackage.BUNDLE__NATURES:
				return natures != null && !natures.isEmpty();
			case EclipsePackage.BUNDLE__BUILDERS:
				return builders != null && !builders.isEmpty();
			case EclipsePackage.BUNDLE__WIZARDS:
				return wizards != null && !wizards.isEmpty();
			case EclipsePackage.BUNDLE__EXTENSION_POINTS:
				return extensionPoints != null && !extensionPoints.isEmpty();
			case EclipsePackage.BUNDLE__DECORATORS:
				return decorators != null && !decorators.isEmpty();
			case EclipsePackage.BUNDLE__MARKERS:
				return markers != null && !markers.isEmpty();
			case EclipsePackage.BUNDLE__PERSPECTIVES:
				return perspectives != null && !perspectives.isEmpty();
			case EclipsePackage.BUNDLE__EDITORS:
				return editors != null && !editors.isEmpty();
			case EclipsePackage.BUNDLE__VIEWS:
				return views != null && !views.isEmpty();
			case EclipsePackage.BUNDLE__HELP_CONTENTS:
				return helpContents != null && !helpContents.isEmpty();
			case EclipsePackage.BUNDLE__COMMANDS:
				return commands != null && !commands.isEmpty();
			case EclipsePackage.BUNDLE__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case EclipsePackage.BUNDLE__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case EclipsePackage.BUNDLE__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case EclipsePackage.BUNDLE__EXPORTED_PACKAGES:
				return exportedPackages != null && !exportedPackages.isEmpty();
			case EclipsePackage.BUNDLE__BASED_ON:
				return basedOn != BASED_ON_EDEFAULT;
			case EclipsePackage.BUNDLE__MENU_CONTRIBUTIONS:
				return menuContributions != null && !menuContributions.isEmpty();
			case EclipsePackage.BUNDLE__TOOLBAR_CONTRIBUTIONS:
				return toolbarContributions != null && !toolbarContributions.isEmpty();
			case EclipsePackage.BUNDLE__POPUP_MENU_CONTRIBUTIONS:
				return popupMenuContributions != null && !popupMenuContributions.isEmpty();
			case EclipsePackage.BUNDLE__CONTEXTUAL_HANDLERS:
				return contextualHandlers != null && !contextualHandlers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (version: ");
		result.append(version);
		result.append(", requiredEnvironment: ");
		result.append(requiredEnvironment);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", basedOn: ");
		result.append(basedOn);
		result.append(')');
		return result.toString();
	}

} //BundleImpl
