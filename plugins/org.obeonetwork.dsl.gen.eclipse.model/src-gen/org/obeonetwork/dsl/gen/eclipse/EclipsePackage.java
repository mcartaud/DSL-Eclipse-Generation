/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.gen.eclipse.EclipseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.obeonetwork.dsl.gen' editDirectory='/org.obeonetwork.dsl.gen.eclipse.model.edit/src-gen' editorDirectory='/org.obeonetwork.dsl.gen.eclipse.model.editor/src-gen'"
 * @generated
 */
public interface EclipsePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eclipse";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeonetwork.org/dsl/eclipse";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eclipse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EclipsePackage eINSTANCE = org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Application ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_ID = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COPYRIGHT = 2;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LICENSE = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Base Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__BASE_NAMESPACE = 6;

	/**
	 * The feature id for the '<em><b>Maven Compilation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MAVEN_COMPILATION = 7;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PROJECTS = 8;

	/**
	 * The feature id for the '<em><b>Generate Tests Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__GENERATE_TESTS_BUNDLE = 9;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.ProjectImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.RepositoryImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ID = PROJECT__ID;

	/**
	 * The feature id for the '<em><b>Repository Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REPOSITORY_CATEGORIES = PROJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.RepositoryCategoryImpl <em>Repository Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.RepositoryCategoryImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getRepositoryCategory()
	 * @generated
	 */
	int REPOSITORY_CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CATEGORY__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CATEGORY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CATEGORY__ID = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CATEGORY__FEATURES = 3;

	/**
	 * The number of structural features of the '<em>Repository Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = PROJECT__ID;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COPYRIGHT = PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = PROJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSION = PROJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LICENSE = PROJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROVIDER = PROJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BUNDLES = PROJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generate Sdk Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GENERATE_SDK_FEATURE = PROJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exclude Bundle For Sdk</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__EXCLUDE_BUNDLE_FOR_SDK = PROJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Included Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__INCLUDED_FEATURES = PROJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__NAME = PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ID = PROJECT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VERSION = PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__REQUIRED_ENVIRONMENT = PROJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VENDOR = PROJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Declarative Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__DECLARATIVE_SERVICES = PROJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Import Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__IMPORT_DECLARATIONS = PROJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Natures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__NATURES = PROJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__BUILDERS = PROJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Wizards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__WIZARDS = PROJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Extension Point Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__EXTENSION_POINT_PROVIDER = PROJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Extension Point Client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__EXTENSION_POINT_CLIENT = PROJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__DECORATORS = PROJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__MARKERS = PROJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__PERSPECTIVES = PROJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__EDITORS = PROJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VIEWS = PROJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Help Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__HELP_CONTENTS = PROJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__COMMANDS = PROJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__CONTEXTS = PROJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__CATEGORIES = PROJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__BINDINGS = PROJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Exported Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__EXPORTED_PACKAGES = PROJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Based On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__BASED_ON = PROJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Menu Contributions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__MENU_CONTRIBUTIONS = PROJECT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Toolbar Contributions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__TOOLBAR_CONTRIBUTIONS = PROJECT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Popup Menu Contributions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__POPUP_MENU_CONTRIBUTIONS = PROJECT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Contextual Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__CONTEXTUAL_HANDLERS = PROJECT_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 26;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.DeclarativeServiceImpl <em>Declarative Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.DeclarativeServiceImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getDeclarativeService()
	 * @generated
	 */
	int DECLARATIVE_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Service Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_SERVICE__SERVICE_CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Delegator Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_SERVICE__DELEGATOR_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Provided Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_SERVICE__PROVIDED_SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Required Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_SERVICE__REQUIRED_SERVICES = 3;

	/**
	 * The number of structural features of the '<em>Declarative Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_SERVICE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.ImportDeclarationImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getImportDeclaration()
	 * @generated
	 */
	int IMPORT_DECLARATION = 7;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION__PACKAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Package Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION__PACKAGE_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION__IMPORT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Import Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.ProvidedServiceImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getProvidedService()
	 * @generated
	 */
	int PROVIDED_SERVICE = 8;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Provided Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl <em>Required Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getRequiredService()
	 * @generated
	 */
	int REQUIRED_SERVICE = 9;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Required Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.BuilderImpl <em>Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.BuilderImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getBuilder()
	 * @generated
	 */
	int BUILDER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Natures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__NATURES = 1;

	/**
	 * The number of structural features of the '<em>Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.NatureImpl <em>Nature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.NatureImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getNature()
	 * @generated
	 */
	int NATURE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Toggle Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__HAS_TOGGLE_NATURE = 1;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE__BUILDERS = 2;

	/**
	 * The number of structural features of the '<em>Nature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.WizardImpl <em>Wizard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.WizardImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getWizard()
	 * @generated
	 */
	int WIZARD = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Is Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__IS_PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__CATEGORY = 4;

	/**
	 * The number of structural features of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ProjectWizardImpl <em>Project Wizard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.ProjectWizardImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getProjectWizard()
	 * @generated
	 */
	int PROJECT_WIZARD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WIZARD__NAME = WIZARD__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WIZARD__TITLE = WIZARD__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WIZARD__DESCRIPTION = WIZARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WIZARD__IS_PROJECT = WIZARD__IS_PROJECT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WIZARD__CATEGORY = WIZARD__CATEGORY;

	/**
	 * The feature id for the '<em><b>Natures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WIZARD__NATURES = WIZARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_WIZARD_FEATURE_COUNT = WIZARD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointProviderImpl <em>Extension Point Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointProviderImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getExtensionPointProvider()
	 * @generated
	 */
	int EXTENSION_POINT_PROVIDER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_PROVIDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_PROVIDER__CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>String Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_PROVIDER__STRING_ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Java Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_PROVIDER__JAVA_ATTRIBUTES = 3;

	/**
	 * The number of structural features of the '<em>Extension Point Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_PROVIDER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointClientImpl <em>Extension Point Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointClientImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getExtensionPointClient()
	 * @generated
	 */
	int EXTENSION_POINT_CLIENT = 15;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_CLIENT__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Sequence Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_CLIENT__SEQUENCE_ITERATION = 1;

	/**
	 * The number of structural features of the '<em>Extension Point Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_CLIENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.StringAttributeImpl <em>String Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.StringAttributeImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getStringAttribute()
	 * @generated
	 */
	int STRING_ATTRIBUTE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>String Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.JavaAttributeImpl <em>Java Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.JavaAttributeImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getJavaAttribute()
	 * @generated
	 */
	int JAVA_ATTRIBUTE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Non Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ATTRIBUTE__NON_QUALIFIED_NAME = 1;

	/**
	 * The number of structural features of the '<em>Java Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.DecoratorImpl <em>Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.DecoratorImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getDecorator()
	 * @generated
	 */
	int DECORATOR = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Lightweight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__IS_LIGHTWEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Is Adaptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__IS_ADAPTABLE = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__LOCATION = 3;

	/**
	 * The number of structural features of the '<em>Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.MarkerImpl <em>Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.MarkerImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getMarker()
	 * @generated
	 */
	int MARKER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Persistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__IS_PERSISTANT = 1;

	/**
	 * The number of structural features of the '<em>Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.ContextImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXTS = 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.PerspectiveImpl <em>Perspective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.PerspectiveImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getPerspective()
	 * @generated
	 */
	int PERSPECTIVE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Wizards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__WIZARDS = 1;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__VIEWS = 2;

	/**
	 * The number of structural features of the '<em>Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.CategoryImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__COMMANDS = 1;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__VIEWS = 2;

	/**
	 * The feature id for the '<em><b>Wizards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__WIZARDS = 3;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.PartImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getPart()
	 * @generated
	 */
	int PART = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dynamic Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__DYNAMIC_HELP = 1;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.ViewImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getView()
	 * @generated
	 */
	int VIEW = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>Dynamic Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DYNAMIC_HELP = PART__DYNAMIC_HELP;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__IS_VISIBLE = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PERSPECTIVES = PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CATEGORY = PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = PART_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.EditorImpl <em>Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EditorImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getEditor()
	 * @generated
	 */
	int EDITOR = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>Dynamic Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__DYNAMIC_HELP = PART__DYNAMIC_HELP;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__EXTENSION = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__EDITOR_TYPE = PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_FEATURE_COUNT = PART_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__TOOLTIP = 1;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__HANDLERS = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__BINDING = 4;

	/**
	 * The feature id for the '<em><b>Default Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DEFAULT_HANDLER = 5;

	/**
	 * The feature id for the '<em><b>Mnemonic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__MNEMONIC = 6;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuContributionImpl <em>Menu Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.MenuContributionImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getMenuContribution()
	 * @generated
	 */
	int MENU_CONTRIBUTION = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_CONTRIBUTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_CONTRIBUTION__COMMANDS = 1;

	/**
	 * The feature id for the '<em><b>Menu Contributions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_CONTRIBUTION__MENU_CONTRIBUTIONS = 2;

	/**
	 * The feature id for the '<em><b>Mnemonic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_CONTRIBUTION__MNEMONIC = 3;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_CONTRIBUTION__PERSPECTIVES = 4;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_CONTRIBUTION__VIEWS = 5;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_CONTRIBUTION__EDITORS = 6;

	/**
	 * The number of structural features of the '<em>Menu Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_CONTRIBUTION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ToolbarContributionImpl <em>Toolbar Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.ToolbarContributionImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getToolbarContribution()
	 * @generated
	 */
	int TOOLBAR_CONTRIBUTION = 28;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_CONTRIBUTION__COMMANDS = 0;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_CONTRIBUTION__PERSPECTIVES = 1;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_CONTRIBUTION__VIEWS = 2;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_CONTRIBUTION__EDITORS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_CONTRIBUTION__NAME = 4;

	/**
	 * The number of structural features of the '<em>Toolbar Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_CONTRIBUTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.PopupMenuContributionImpl <em>Popup Menu Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.PopupMenuContributionImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getPopupMenuContribution()
	 * @generated
	 */
	int POPUP_MENU_CONTRIBUTION = 29;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU_CONTRIBUTION__COMMANDS = 0;

	/**
	 * The feature id for the '<em><b>Menus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU_CONTRIBUTION__MENUS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU_CONTRIBUTION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU_CONTRIBUTION__VIEWS = 3;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU_CONTRIBUTION__EDITORS = 4;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU_CONTRIBUTION__PERSPECTIVES = 5;

	/**
	 * The feature id for the '<em><b>Activate With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU_CONTRIBUTION__ACTIVATE_WITH = 6;

	/**
	 * The number of structural features of the '<em>Popup Menu Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPUP_MENU_CONTRIBUTION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.HandlerImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getHandler()
	 * @generated
	 */
	int HANDLER = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.DefaultHandlerImpl <em>Default Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.DefaultHandlerImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getDefaultHandler()
	 * @generated
	 */
	int DEFAULT_HANDLER = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_HANDLER__NAME = HANDLER__NAME;

	/**
	 * The number of structural features of the '<em>Default Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_HANDLER_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextualHandlerImpl <em>Contextual Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.ContextualHandlerImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getContextualHandler()
	 * @generated
	 */
	int CONTEXTUAL_HANDLER = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_HANDLER__NAME = HANDLER__NAME;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_HANDLER__COMMANDS = HANDLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activate With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_HANDLER__ACTIVATE_WITH = HANDLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Associated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_HANDLER__ASSOCIATED_WITH = HANDLER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contextual Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_HANDLER_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.HelpContentsImpl <em>Help Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.HelpContentsImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getHelpContents()
	 * @generated
	 */
	int HELP_CONTENTS = 33;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CONTENTS__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CONTENTS__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Help Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CONTENTS__HELP_PAGES = 2;

	/**
	 * The feature id for the '<em><b>External Help Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CONTENTS__EXTERNAL_HELP_PAGES = 3;

	/**
	 * The number of structural features of the '<em>Help Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_CONTENTS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.HelpPageImpl <em>Help Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.HelpPageImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getHelpPage()
	 * @generated
	 */
	int HELP_PAGE = 34;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_PAGE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_PAGE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Help Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_PAGE__HELP_PAGES = 2;

	/**
	 * The feature id for the '<em><b>External Help Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_PAGE__EXTERNAL_HELP_PAGES = 3;

	/**
	 * The number of structural features of the '<em>Help Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_PAGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.DynamicHelpImpl <em>Dynamic Help</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.DynamicHelpImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getDynamicHelp()
	 * @generated
	 */
	int DYNAMIC_HELP = 35;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_HELP__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_HELP__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Help Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_HELP__HELP_PAGES = 2;

	/**
	 * The number of structural features of the '<em>Dynamic Help</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_HELP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.BindingImpl
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 36;

	/**
	 * The feature id for the '<em><b>Key Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__KEY_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__CONTEXTS = 2;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.EditorType <em>Editor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.EditorType
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getEditorType()
	 * @generated
	 */
	int EDITOR_TYPE = 37;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.BasedOn <em>Based On</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.BasedOn
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getBasedOn()
	 * @generated
	 */
	int BASED_ON = 38;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.ImportType <em>Import Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.ImportType
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getImportType()
	 * @generated
	 */
	int IMPORT_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.JavaVersion <em>Java Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.JavaVersion
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getJavaVersion()
	 * @generated
	 */
	int JAVA_VERSION = 40;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.Location <em>Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.gen.eclipse.Location
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 41;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 42;

	/**
	 * The meta object id for the '<em>Namespace</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 43;

	/**
	 * The meta object id for the '<em>Java Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getJavaName()
	 * @generated
	 */
	int JAVA_NAME = 44;

	/**
	 * The meta object id for the '<em>Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getName_()
	 * @generated
	 */
	int NAME = 45;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Application#getApplicationID <em>Application ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application ID</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Application#getApplicationID()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_ApplicationID();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Application#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Application#getProvider()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Application#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Application#getCopyright()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Copyright();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Application#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Application#getLicense()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_License();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Application#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Application#getVersion()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Application#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Application#getDescription()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Application#getBaseNamespace <em>Base Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Namespace</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Application#getBaseNamespace()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_BaseNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Application#isMavenCompilation <em>Maven Compilation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maven Compilation</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Application#isMavenCompilation()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_MavenCompilation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Application#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Application#getProjects()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Projects();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Application#isGenerateTestsBundle <em>Generate Tests Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Tests Bundle</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Application#isGenerateTestsBundle()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_GenerateTestsBundle();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Project#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Project#getID()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ID();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Repository#getRepositoryCategories <em>Repository Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repository Categories</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Repository#getRepositoryCategories()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_RepositoryCategories();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory <em>Repository Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Category</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.RepositoryCategory
	 * @generated
	 */
	EClass getRepositoryCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getLabel()
	 * @see #getRepositoryCategory()
	 * @generated
	 */
	EAttribute getRepositoryCategory_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getDescription()
	 * @see #getRepositoryCategory()
	 * @generated
	 */
	EAttribute getRepositoryCategory_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getID()
	 * @see #getRepositoryCategory()
	 * @generated
	 */
	EAttribute getRepositoryCategory_ID();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.RepositoryCategory#getFeatures()
	 * @see #getRepositoryCategory()
	 * @generated
	 */
	EReference getRepositoryCategory_Features();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Feature#getCopyright()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Copyright();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Feature#getVersion()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Feature#getLicense()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_License();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Feature#getProvider()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Provider();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bundles</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Feature#getBundles()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Bundles();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Feature#isGenerateSdkFeature <em>Generate Sdk Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Sdk Feature</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Feature#isGenerateSdkFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_GenerateSdkFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getExcludeBundleForSdk <em>Exclude Bundle For Sdk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclude Bundle For Sdk</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Feature#getExcludeBundleForSdk()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_ExcludeBundleForSdk();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getIncludedFeatures <em>Included Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Features</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Feature#getIncludedFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_IncludedFeatures();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getVersion()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getRequiredEnvironment <em>Required Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Environment</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getRequiredEnvironment()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_RequiredEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getVendor()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Vendor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getDeclarativeServices <em>Declarative Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarative Services</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getDeclarativeServices()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_DeclarativeServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getImportDeclarations <em>Import Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import Declarations</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getImportDeclarations()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_ImportDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getNatures <em>Natures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Natures</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getNatures()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Natures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getBuilders <em>Builders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Builders</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getBuilders()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Builders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getWizards <em>Wizards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wizards</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getWizards()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Wizards();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getExtensionPointProvider <em>Extension Point Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Point Provider</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getExtensionPointProvider()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_ExtensionPointProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getExtensionPointClient <em>Extension Point Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Point Client</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getExtensionPointClient()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_ExtensionPointClient();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getDecorators <em>Decorators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decorators</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getDecorators()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Decorators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getMarkers <em>Markers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Markers</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getMarkers()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Markers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getPerspectives <em>Perspectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perspectives</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getPerspectives()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Perspectives();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getEditors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editors</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getEditors()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Editors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getViews()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getHelpContents <em>Help Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Help Contents</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getHelpContents()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_HelpContents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getCommands()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getContexts()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getCategories()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getBindings()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Bindings();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getExportedPackages <em>Exported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exported Packages</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getExportedPackages()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_ExportedPackages();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getBasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Based On</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getBasedOn()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_BasedOn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getMenuContributions <em>Menu Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu Contributions</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getMenuContributions()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_MenuContributions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getToolbarContributions <em>Toolbar Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toolbar Contributions</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getToolbarContributions()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_ToolbarContributions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getPopupMenuContributions <em>Popup Menu Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Popup Menu Contributions</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getPopupMenuContributions()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_PopupMenuContributions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getContextualHandlers <em>Contextual Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contextual Handlers</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getContextualHandlers()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_ContextualHandlers();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService <em>Declarative Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarative Service</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.DeclarativeService
	 * @generated
	 */
	EClass getDeclarativeService();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getServiceClassName <em>Service Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Class Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getServiceClassName()
	 * @see #getDeclarativeService()
	 * @generated
	 */
	EAttribute getDeclarativeService_ServiceClassName();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getDelegatorClass <em>Delegator Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegator Class</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getDelegatorClass()
	 * @see #getDeclarativeService()
	 * @generated
	 */
	EReference getDeclarativeService_DelegatorClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getProvidedServices <em>Provided Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Services</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getProvidedServices()
	 * @see #getDeclarativeService()
	 * @generated
	 */
	EReference getDeclarativeService_ProvidedServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getRequiredServices <em>Required Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Services</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.DeclarativeService#getRequiredServices()
	 * @see #getDeclarativeService()
	 * @generated
	 */
	EReference getDeclarativeService_RequiredServices();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.ImportDeclaration <em>Import Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Declaration</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ImportDeclaration
	 * @generated
	 */
	EClass getImportDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ImportDeclaration#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ImportDeclaration#getPackageName()
	 * @see #getImportDeclaration()
	 * @generated
	 */
	EAttribute getImportDeclaration_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ImportDeclaration#getPackageVersion <em>Package Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Version</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ImportDeclaration#getPackageVersion()
	 * @see #getImportDeclaration()
	 * @generated
	 */
	EAttribute getImportDeclaration_PackageVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ImportDeclaration#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ImportDeclaration#getImportType()
	 * @see #getImportDeclaration()
	 * @generated
	 */
	EAttribute getImportDeclaration_ImportType();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService <em>Provided Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Service</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ProvidedService
	 * @generated
	 */
	EClass getProvidedService();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ProvidedService#getInterface()
	 * @see #getProvidedService()
	 * @generated
	 */
	EReference getProvidedService_Interface();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.RequiredService <em>Required Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Service</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.RequiredService
	 * @generated
	 */
	EClass getRequiredService();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.RequiredService#getReference()
	 * @see #getRequiredService()
	 * @generated
	 */
	EReference getRequiredService_Reference();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Builder <em>Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Builder
	 * @generated
	 */
	EClass getBuilder();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Builder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Builder#getName()
	 * @see #getBuilder()
	 * @generated
	 */
	EAttribute getBuilder_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Builder#getNatures <em>Natures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Natures</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Builder#getNatures()
	 * @see #getBuilder()
	 * @generated
	 */
	EReference getBuilder_Natures();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Nature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nature</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Nature
	 * @generated
	 */
	EClass getNature();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Nature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Nature#getName()
	 * @see #getNature()
	 * @generated
	 */
	EAttribute getNature_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Nature#isHasToggleNature <em>Has Toggle Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Toggle Nature</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Nature#isHasToggleNature()
	 * @see #getNature()
	 * @generated
	 */
	EAttribute getNature_HasToggleNature();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Nature#getBuilders <em>Builders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Builders</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Nature#getBuilders()
	 * @see #getNature()
	 * @generated
	 */
	EReference getNature_Builders();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Wizard
	 * @generated
	 */
	EClass getWizard();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Wizard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Wizard#getName()
	 * @see #getWizard()
	 * @generated
	 */
	EAttribute getWizard_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Wizard#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Wizard#getTitle()
	 * @see #getWizard()
	 * @generated
	 */
	EAttribute getWizard_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Wizard#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Wizard#getDescription()
	 * @see #getWizard()
	 * @generated
	 */
	EAttribute getWizard_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Wizard#isIsProject <em>Is Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Project</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Wizard#isIsProject()
	 * @see #getWizard()
	 * @generated
	 */
	EAttribute getWizard_IsProject();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.gen.eclipse.Wizard#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Wizard#getCategory()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_Category();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.ProjectWizard <em>Project Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Wizard</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ProjectWizard
	 * @generated
	 */
	EClass getProjectWizard();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.ProjectWizard#getNatures <em>Natures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Natures</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ProjectWizard#getNatures()
	 * @see #getProjectWizard()
	 * @generated
	 */
	EReference getProjectWizard_Natures();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider <em>Extension Point Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Point Provider</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider
	 * @generated
	 */
	EClass getExtensionPointProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider#getName()
	 * @see #getExtensionPointProvider()
	 * @generated
	 */
	EAttribute getExtensionPointProvider_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider#getClassName()
	 * @see #getExtensionPointProvider()
	 * @generated
	 */
	EAttribute getExtensionPointProvider_ClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider#getStringAttributes <em>String Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Attributes</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider#getStringAttributes()
	 * @see #getExtensionPointProvider()
	 * @generated
	 */
	EReference getExtensionPointProvider_StringAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider#getJavaAttributes <em>Java Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java Attributes</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ExtensionPointProvider#getJavaAttributes()
	 * @see #getExtensionPointProvider()
	 * @generated
	 */
	EReference getExtensionPointProvider_JavaAttributes();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointClient <em>Extension Point Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Point Client</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ExtensionPointClient
	 * @generated
	 */
	EClass getExtensionPointClient();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointClient#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ExtensionPointClient#getProvider()
	 * @see #getExtensionPointClient()
	 * @generated
	 */
	EReference getExtensionPointClient_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ExtensionPointClient#getSequenceIteration <em>Sequence Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Iteration</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ExtensionPointClient#getSequenceIteration()
	 * @see #getExtensionPointClient()
	 * @generated
	 */
	EAttribute getExtensionPointClient_SequenceIteration();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.StringAttribute <em>String Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Attribute</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.StringAttribute
	 * @generated
	 */
	EClass getStringAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.StringAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.StringAttribute#getName()
	 * @see #getStringAttribute()
	 * @generated
	 */
	EAttribute getStringAttribute_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.JavaAttribute <em>Java Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Attribute</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.JavaAttribute
	 * @generated
	 */
	EClass getJavaAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.JavaAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.JavaAttribute#getName()
	 * @see #getJavaAttribute()
	 * @generated
	 */
	EAttribute getJavaAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.JavaAttribute#getNonQualifiedName <em>Non Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Qualified Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.JavaAttribute#getNonQualifiedName()
	 * @see #getJavaAttribute()
	 * @generated
	 */
	EAttribute getJavaAttribute_NonQualifiedName();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Decorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decorator</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Decorator
	 * @generated
	 */
	EClass getDecorator();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Decorator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Decorator#getName()
	 * @see #getDecorator()
	 * @generated
	 */
	EAttribute getDecorator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Decorator#isIsLightweight <em>Is Lightweight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Lightweight</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Decorator#isIsLightweight()
	 * @see #getDecorator()
	 * @generated
	 */
	EAttribute getDecorator_IsLightweight();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Decorator#isIsAdaptable <em>Is Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Adaptable</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Decorator#isIsAdaptable()
	 * @see #getDecorator()
	 * @generated
	 */
	EAttribute getDecorator_IsAdaptable();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Decorator#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Decorator#getLocation()
	 * @see #getDecorator()
	 * @generated
	 */
	EAttribute getDecorator_Location();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Marker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marker</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Marker
	 * @generated
	 */
	EClass getMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Marker#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Marker#getName()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Marker#isIsPersistant <em>Is Persistant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Persistant</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Marker#isIsPersistant()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_IsPersistant();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Context#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Context#getName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Context#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Context#getDescription()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Context#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Context#getContexts()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Contexts();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Perspective <em>Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perspective</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Perspective
	 * @generated
	 */
	EClass getPerspective();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Perspective#getName()
	 * @see #getPerspective()
	 * @generated
	 */
	EAttribute getPerspective_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getWizards <em>Wizards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wizards</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Perspective#getWizards()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_Wizards();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Perspective#getViews()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_Views();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Category#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Category#getCommands()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Commands();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Category#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Category#getViews()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Views();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Category#getWizards <em>Wizards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wizards</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Category#getWizards()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Wizards();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Part#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Part#getName()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.gen.eclipse.Part#getDynamicHelp <em>Dynamic Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamic Help</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Part#getDynamicHelp()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_DynamicHelp();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.View#isIsVisible <em>Is Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Visible</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.View#isIsVisible()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_IsVisible();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.View#getPerspectives <em>Perspectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perspectives</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.View#getPerspectives()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Perspectives();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.gen.eclipse.View#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.View#getCategory()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Category();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Editor
	 * @generated
	 */
	EClass getEditor();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Editor#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Editor#getExtension()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Editor#getEditorType <em>Editor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor Type</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Editor#getEditorType()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_EditorType();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Command#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getTooltip()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Tooltip();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Command#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Handlers</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getHandlers()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Handlers();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.gen.eclipse.Command#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getCategory()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Category();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.gen.eclipse.Command#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getBinding()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Binding();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.gen.eclipse.Command#getDefaultHandler <em>Default Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Handler</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getDefaultHandler()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_DefaultHandler();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Command#getMnemonic <em>Mnemonic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mnemonic</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Command#getMnemonic()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Mnemonic();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.MenuContribution <em>Menu Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Contribution</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.MenuContribution
	 * @generated
	 */
	EClass getMenuContribution();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.MenuContribution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.MenuContribution#getName()
	 * @see #getMenuContribution()
	 * @generated
	 */
	EAttribute getMenuContribution_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.MenuContribution#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.MenuContribution#getCommands()
	 * @see #getMenuContribution()
	 * @generated
	 */
	EReference getMenuContribution_Commands();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.MenuContribution#getMenuContributions <em>Menu Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Menu Contributions</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.MenuContribution#getMenuContributions()
	 * @see #getMenuContribution()
	 * @generated
	 */
	EReference getMenuContribution_MenuContributions();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.MenuContribution#getMnemonic <em>Mnemonic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mnemonic</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.MenuContribution#getMnemonic()
	 * @see #getMenuContribution()
	 * @generated
	 */
	EAttribute getMenuContribution_Mnemonic();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.MenuContribution#getPerspectives <em>Perspectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perspectives</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.MenuContribution#getPerspectives()
	 * @see #getMenuContribution()
	 * @generated
	 */
	EReference getMenuContribution_Perspectives();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.MenuContribution#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.MenuContribution#getViews()
	 * @see #getMenuContribution()
	 * @generated
	 */
	EReference getMenuContribution_Views();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.MenuContribution#getEditors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Editors</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.MenuContribution#getEditors()
	 * @see #getMenuContribution()
	 * @generated
	 */
	EReference getMenuContribution_Editors();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.ToolbarContribution <em>Toolbar Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toolbar Contribution</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ToolbarContribution
	 * @generated
	 */
	EClass getToolbarContribution();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.ToolbarContribution#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ToolbarContribution#getCommands()
	 * @see #getToolbarContribution()
	 * @generated
	 */
	EReference getToolbarContribution_Commands();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.ToolbarContribution#getPerspectives <em>Perspectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perspectives</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ToolbarContribution#getPerspectives()
	 * @see #getToolbarContribution()
	 * @generated
	 */
	EReference getToolbarContribution_Perspectives();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.ToolbarContribution#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ToolbarContribution#getViews()
	 * @see #getToolbarContribution()
	 * @generated
	 */
	EReference getToolbarContribution_Views();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.ToolbarContribution#getEditors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Editors</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ToolbarContribution#getEditors()
	 * @see #getToolbarContribution()
	 * @generated
	 */
	EReference getToolbarContribution_Editors();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ToolbarContribution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ToolbarContribution#getName()
	 * @see #getToolbarContribution()
	 * @generated
	 */
	EAttribute getToolbarContribution_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution <em>Popup Menu Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Popup Menu Contribution</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution
	 * @generated
	 */
	EClass getPopupMenuContribution();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getCommands()
	 * @see #getPopupMenuContribution()
	 * @generated
	 */
	EReference getPopupMenuContribution_Commands();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getMenus <em>Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Menus</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getMenus()
	 * @see #getPopupMenuContribution()
	 * @generated
	 */
	EReference getPopupMenuContribution_Menus();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getName()
	 * @see #getPopupMenuContribution()
	 * @generated
	 */
	EAttribute getPopupMenuContribution_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getViews()
	 * @see #getPopupMenuContribution()
	 * @generated
	 */
	EReference getPopupMenuContribution_Views();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getEditors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Editors</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getEditors()
	 * @see #getPopupMenuContribution()
	 * @generated
	 */
	EReference getPopupMenuContribution_Editors();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getPerspectives <em>Perspectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perspectives</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getPerspectives()
	 * @see #getPopupMenuContribution()
	 * @generated
	 */
	EReference getPopupMenuContribution_Perspectives();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getActivateWith <em>Activate With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activate With</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.PopupMenuContribution#getActivateWith()
	 * @see #getPopupMenuContribution()
	 * @generated
	 */
	EAttribute getPopupMenuContribution_ActivateWith();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Handler
	 * @generated
	 */
	EClass getHandler();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Handler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Handler#getName()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.DefaultHandler <em>Default Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Handler</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.DefaultHandler
	 * @generated
	 */
	EClass getDefaultHandler();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.ContextualHandler <em>Contextual Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextual Handler</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ContextualHandler
	 * @generated
	 */
	EClass getContextualHandler();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.ContextualHandler#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ContextualHandler#getCommands()
	 * @see #getContextualHandler()
	 * @generated
	 */
	EReference getContextualHandler_Commands();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ContextualHandler#getActivateWith <em>Activate With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activate With</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ContextualHandler#getActivateWith()
	 * @see #getContextualHandler()
	 * @generated
	 */
	EAttribute getContextualHandler_ActivateWith();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.ContextualHandler#getAssociatedWith <em>Associated With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated With</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ContextualHandler#getAssociatedWith()
	 * @see #getContextualHandler()
	 * @generated
	 */
	EReference getContextualHandler_AssociatedWith();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.HelpContents <em>Help Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Help Contents</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.HelpContents
	 * @generated
	 */
	EClass getHelpContents();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.HelpContents#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.HelpContents#getLabel()
	 * @see #getHelpContents()
	 * @generated
	 */
	EAttribute getHelpContents_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.HelpContents#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.HelpContents#getDescription()
	 * @see #getHelpContents()
	 * @generated
	 */
	EAttribute getHelpContents_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.HelpContents#getHelpPages <em>Help Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Help Pages</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.HelpContents#getHelpPages()
	 * @see #getHelpContents()
	 * @generated
	 */
	EReference getHelpContents_HelpPages();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.HelpContents#getExternalHelpPages <em>External Help Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Help Pages</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.HelpContents#getExternalHelpPages()
	 * @see #getHelpContents()
	 * @generated
	 */
	EReference getHelpContents_ExternalHelpPages();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.HelpPage <em>Help Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Help Page</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.HelpPage
	 * @generated
	 */
	EClass getHelpPage();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.HelpPage#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.HelpPage#getLabel()
	 * @see #getHelpPage()
	 * @generated
	 */
	EAttribute getHelpPage_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.HelpPage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.HelpPage#getDescription()
	 * @see #getHelpPage()
	 * @generated
	 */
	EAttribute getHelpPage_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.HelpPage#getHelpPages <em>Help Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Help Pages</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.HelpPage#getHelpPages()
	 * @see #getHelpPage()
	 * @generated
	 */
	EReference getHelpPage_HelpPages();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.HelpPage#getExternalHelpPages <em>External Help Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Help Pages</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.HelpPage#getExternalHelpPages()
	 * @see #getHelpPage()
	 * @generated
	 */
	EReference getHelpPage_ExternalHelpPages();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp <em>Dynamic Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Help</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.DynamicHelp
	 * @generated
	 */
	EClass getDynamicHelp();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getLabel()
	 * @see #getDynamicHelp()
	 * @generated
	 */
	EAttribute getDynamicHelp_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getDescription()
	 * @see #getDynamicHelp()
	 * @generated
	 */
	EAttribute getDynamicHelp_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getHelpPages <em>Help Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Help Pages</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.DynamicHelp#getHelpPages()
	 * @see #getDynamicHelp()
	 * @generated
	 */
	EReference getDynamicHelp_HelpPages();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Binding#getKeySequence <em>Key Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Sequence</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Binding#getKeySequence()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_KeySequence();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.gen.eclipse.Binding#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Binding#getCommand()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Command();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Binding#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contexts</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Binding#getContexts()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Contexts();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.gen.eclipse.EditorType <em>Editor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Editor Type</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.EditorType
	 * @generated
	 */
	EEnum getEditorType();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.gen.eclipse.BasedOn <em>Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Based On</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.BasedOn
	 * @generated
	 */
	EEnum getBasedOn();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.gen.eclipse.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Import Type</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.ImportType
	 * @generated
	 */
	EEnum getImportType();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.gen.eclipse.JavaVersion <em>Java Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Java Version</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.JavaVersion
	 * @generated
	 */
	EEnum getJavaVersion();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.gen.eclipse.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location</em>'.
	 * @see org.obeonetwork.dsl.gen.eclipse.Location
	 * @generated
	 */
	EEnum getLocation();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Namespace</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getNamespace();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Java Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getJavaName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getName_();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EclipseFactory getEclipseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.ApplicationImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Application ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__APPLICATION_ID = eINSTANCE.getApplication_ApplicationID();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PROVIDER = eINSTANCE.getApplication_Provider();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__COPYRIGHT = eINSTANCE.getApplication_Copyright();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__LICENSE = eINSTANCE.getApplication_License();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__VERSION = eINSTANCE.getApplication_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__DESCRIPTION = eINSTANCE.getApplication_Description();

		/**
		 * The meta object literal for the '<em><b>Base Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__BASE_NAMESPACE = eINSTANCE.getApplication_BaseNamespace();

		/**
		 * The meta object literal for the '<em><b>Maven Compilation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__MAVEN_COMPILATION = eINSTANCE.getApplication_MavenCompilation();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PROJECTS = eINSTANCE.getApplication_Projects();

		/**
		 * The meta object literal for the '<em><b>Generate Tests Bundle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__GENERATE_TESTS_BUNDLE = eINSTANCE.getApplication_GenerateTestsBundle();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.ProjectImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ID = eINSTANCE.getProject_ID();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.RepositoryImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Repository Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__REPOSITORY_CATEGORIES = eINSTANCE.getRepository_RepositoryCategories();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.RepositoryCategoryImpl <em>Repository Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.RepositoryCategoryImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getRepositoryCategory()
		 * @generated
		 */
		EClass REPOSITORY_CATEGORY = eINSTANCE.getRepositoryCategory();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_CATEGORY__LABEL = eINSTANCE.getRepositoryCategory_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_CATEGORY__DESCRIPTION = eINSTANCE.getRepositoryCategory_Description();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_CATEGORY__ID = eINSTANCE.getRepositoryCategory_ID();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_CATEGORY__FEATURES = eINSTANCE.getRepositoryCategory_Features();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__COPYRIGHT = eINSTANCE.getFeature_Copyright();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VERSION = eINSTANCE.getFeature_Version();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__LICENSE = eINSTANCE.getFeature_License();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__PROVIDER = eINSTANCE.getFeature_Provider();

		/**
		 * The meta object literal for the '<em><b>Bundles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__BUNDLES = eINSTANCE.getFeature_Bundles();

		/**
		 * The meta object literal for the '<em><b>Generate Sdk Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__GENERATE_SDK_FEATURE = eINSTANCE.getFeature_GenerateSdkFeature();

		/**
		 * The meta object literal for the '<em><b>Exclude Bundle For Sdk</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__EXCLUDE_BUNDLE_FOR_SDK = eINSTANCE.getFeature_ExcludeBundleForSdk();

		/**
		 * The meta object literal for the '<em><b>Included Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__INCLUDED_FEATURES = eINSTANCE.getFeature_IncludedFeatures();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__VERSION = eINSTANCE.getBundle_Version();

		/**
		 * The meta object literal for the '<em><b>Required Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__REQUIRED_ENVIRONMENT = eINSTANCE.getBundle_RequiredEnvironment();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__VENDOR = eINSTANCE.getBundle_Vendor();

		/**
		 * The meta object literal for the '<em><b>Declarative Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__DECLARATIVE_SERVICES = eINSTANCE.getBundle_DeclarativeServices();

		/**
		 * The meta object literal for the '<em><b>Import Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__IMPORT_DECLARATIONS = eINSTANCE.getBundle_ImportDeclarations();

		/**
		 * The meta object literal for the '<em><b>Natures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__NATURES = eINSTANCE.getBundle_Natures();

		/**
		 * The meta object literal for the '<em><b>Builders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__BUILDERS = eINSTANCE.getBundle_Builders();

		/**
		 * The meta object literal for the '<em><b>Wizards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__WIZARDS = eINSTANCE.getBundle_Wizards();

		/**
		 * The meta object literal for the '<em><b>Extension Point Provider</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__EXTENSION_POINT_PROVIDER = eINSTANCE.getBundle_ExtensionPointProvider();

		/**
		 * The meta object literal for the '<em><b>Extension Point Client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__EXTENSION_POINT_CLIENT = eINSTANCE.getBundle_ExtensionPointClient();

		/**
		 * The meta object literal for the '<em><b>Decorators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__DECORATORS = eINSTANCE.getBundle_Decorators();

		/**
		 * The meta object literal for the '<em><b>Markers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__MARKERS = eINSTANCE.getBundle_Markers();

		/**
		 * The meta object literal for the '<em><b>Perspectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__PERSPECTIVES = eINSTANCE.getBundle_Perspectives();

		/**
		 * The meta object literal for the '<em><b>Editors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__EDITORS = eINSTANCE.getBundle_Editors();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__VIEWS = eINSTANCE.getBundle_Views();

		/**
		 * The meta object literal for the '<em><b>Help Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__HELP_CONTENTS = eINSTANCE.getBundle_HelpContents();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__COMMANDS = eINSTANCE.getBundle_Commands();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__CONTEXTS = eINSTANCE.getBundle_Contexts();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__CATEGORIES = eINSTANCE.getBundle_Categories();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__BINDINGS = eINSTANCE.getBundle_Bindings();

		/**
		 * The meta object literal for the '<em><b>Exported Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__EXPORTED_PACKAGES = eINSTANCE.getBundle_ExportedPackages();

		/**
		 * The meta object literal for the '<em><b>Based On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__BASED_ON = eINSTANCE.getBundle_BasedOn();

		/**
		 * The meta object literal for the '<em><b>Menu Contributions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__MENU_CONTRIBUTIONS = eINSTANCE.getBundle_MenuContributions();

		/**
		 * The meta object literal for the '<em><b>Toolbar Contributions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__TOOLBAR_CONTRIBUTIONS = eINSTANCE.getBundle_ToolbarContributions();

		/**
		 * The meta object literal for the '<em><b>Popup Menu Contributions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__POPUP_MENU_CONTRIBUTIONS = eINSTANCE.getBundle_PopupMenuContributions();

		/**
		 * The meta object literal for the '<em><b>Contextual Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__CONTEXTUAL_HANDLERS = eINSTANCE.getBundle_ContextualHandlers();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.DeclarativeServiceImpl <em>Declarative Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.DeclarativeServiceImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getDeclarativeService()
		 * @generated
		 */
		EClass DECLARATIVE_SERVICE = eINSTANCE.getDeclarativeService();

		/**
		 * The meta object literal for the '<em><b>Service Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATIVE_SERVICE__SERVICE_CLASS_NAME = eINSTANCE.getDeclarativeService_ServiceClassName();

		/**
		 * The meta object literal for the '<em><b>Delegator Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIVE_SERVICE__DELEGATOR_CLASS = eINSTANCE.getDeclarativeService_DelegatorClass();

		/**
		 * The meta object literal for the '<em><b>Provided Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIVE_SERVICE__PROVIDED_SERVICES = eINSTANCE.getDeclarativeService_ProvidedServices();

		/**
		 * The meta object literal for the '<em><b>Required Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATIVE_SERVICE__REQUIRED_SERVICES = eINSTANCE.getDeclarativeService_RequiredServices();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.ImportDeclarationImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getImportDeclaration()
		 * @generated
		 */
		EClass IMPORT_DECLARATION = eINSTANCE.getImportDeclaration();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DECLARATION__PACKAGE_NAME = eINSTANCE.getImportDeclaration_PackageName();

		/**
		 * The meta object literal for the '<em><b>Package Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DECLARATION__PACKAGE_VERSION = eINSTANCE.getImportDeclaration_PackageVersion();

		/**
		 * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DECLARATION__IMPORT_TYPE = eINSTANCE.getImportDeclaration_ImportType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.ProvidedServiceImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getProvidedService()
		 * @generated
		 */
		EClass PROVIDED_SERVICE = eINSTANCE.getProvidedService();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_SERVICE__INTERFACE = eINSTANCE.getProvidedService_Interface();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl <em>Required Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getRequiredService()
		 * @generated
		 */
		EClass REQUIRED_SERVICE = eINSTANCE.getRequiredService();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_SERVICE__REFERENCE = eINSTANCE.getRequiredService_Reference();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.BuilderImpl <em>Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.BuilderImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getBuilder()
		 * @generated
		 */
		EClass BUILDER = eINSTANCE.getBuilder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER__NAME = eINSTANCE.getBuilder_Name();

		/**
		 * The meta object literal for the '<em><b>Natures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER__NATURES = eINSTANCE.getBuilder_Natures();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.NatureImpl <em>Nature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.NatureImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getNature()
		 * @generated
		 */
		EClass NATURE = eINSTANCE.getNature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURE__NAME = eINSTANCE.getNature_Name();

		/**
		 * The meta object literal for the '<em><b>Has Toggle Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURE__HAS_TOGGLE_NATURE = eINSTANCE.getNature_HasToggleNature();

		/**
		 * The meta object literal for the '<em><b>Builders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURE__BUILDERS = eINSTANCE.getNature_Builders();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.WizardImpl <em>Wizard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.WizardImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getWizard()
		 * @generated
		 */
		EClass WIZARD = eINSTANCE.getWizard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD__NAME = eINSTANCE.getWizard_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD__TITLE = eINSTANCE.getWizard_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD__DESCRIPTION = eINSTANCE.getWizard_Description();

		/**
		 * The meta object literal for the '<em><b>Is Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD__IS_PROJECT = eINSTANCE.getWizard_IsProject();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__CATEGORY = eINSTANCE.getWizard_Category();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ProjectWizardImpl <em>Project Wizard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.ProjectWizardImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getProjectWizard()
		 * @generated
		 */
		EClass PROJECT_WIZARD = eINSTANCE.getProjectWizard();

		/**
		 * The meta object literal for the '<em><b>Natures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_WIZARD__NATURES = eINSTANCE.getProjectWizard_Natures();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointProviderImpl <em>Extension Point Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointProviderImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getExtensionPointProvider()
		 * @generated
		 */
		EClass EXTENSION_POINT_PROVIDER = eINSTANCE.getExtensionPointProvider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_POINT_PROVIDER__NAME = eINSTANCE.getExtensionPointProvider_Name();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_POINT_PROVIDER__CLASS_NAME = eINSTANCE.getExtensionPointProvider_ClassName();

		/**
		 * The meta object literal for the '<em><b>String Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_POINT_PROVIDER__STRING_ATTRIBUTES = eINSTANCE.getExtensionPointProvider_StringAttributes();

		/**
		 * The meta object literal for the '<em><b>Java Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_POINT_PROVIDER__JAVA_ATTRIBUTES = eINSTANCE.getExtensionPointProvider_JavaAttributes();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointClientImpl <em>Extension Point Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.ExtensionPointClientImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getExtensionPointClient()
		 * @generated
		 */
		EClass EXTENSION_POINT_CLIENT = eINSTANCE.getExtensionPointClient();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_POINT_CLIENT__PROVIDER = eINSTANCE.getExtensionPointClient_Provider();

		/**
		 * The meta object literal for the '<em><b>Sequence Iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_POINT_CLIENT__SEQUENCE_ITERATION = eINSTANCE.getExtensionPointClient_SequenceIteration();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.StringAttributeImpl <em>String Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.StringAttributeImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getStringAttribute()
		 * @generated
		 */
		EClass STRING_ATTRIBUTE = eINSTANCE.getStringAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ATTRIBUTE__NAME = eINSTANCE.getStringAttribute_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.JavaAttributeImpl <em>Java Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.JavaAttributeImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getJavaAttribute()
		 * @generated
		 */
		EClass JAVA_ATTRIBUTE = eINSTANCE.getJavaAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ATTRIBUTE__NAME = eINSTANCE.getJavaAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Non Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ATTRIBUTE__NON_QUALIFIED_NAME = eINSTANCE.getJavaAttribute_NonQualifiedName();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.DecoratorImpl <em>Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.DecoratorImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getDecorator()
		 * @generated
		 */
		EClass DECORATOR = eINSTANCE.getDecorator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR__NAME = eINSTANCE.getDecorator_Name();

		/**
		 * The meta object literal for the '<em><b>Is Lightweight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR__IS_LIGHTWEIGHT = eINSTANCE.getDecorator_IsLightweight();

		/**
		 * The meta object literal for the '<em><b>Is Adaptable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR__IS_ADAPTABLE = eINSTANCE.getDecorator_IsAdaptable();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR__LOCATION = eINSTANCE.getDecorator_Location();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.MarkerImpl <em>Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.MarkerImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getMarker()
		 * @generated
		 */
		EClass MARKER = eINSTANCE.getMarker();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__NAME = eINSTANCE.getMarker_Name();

		/**
		 * The meta object literal for the '<em><b>Is Persistant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__IS_PERSISTANT = eINSTANCE.getMarker_IsPersistant();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.ContextImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__DESCRIPTION = eINSTANCE.getContext_Description();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTEXTS = eINSTANCE.getContext_Contexts();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.PerspectiveImpl <em>Perspective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.PerspectiveImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getPerspective()
		 * @generated
		 */
		EClass PERSPECTIVE = eINSTANCE.getPerspective();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSPECTIVE__NAME = eINSTANCE.getPerspective_Name();

		/**
		 * The meta object literal for the '<em><b>Wizards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__WIZARDS = eINSTANCE.getPerspective_Wizards();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__VIEWS = eINSTANCE.getPerspective_Views();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.CategoryImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__COMMANDS = eINSTANCE.getCategory_Commands();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__VIEWS = eINSTANCE.getCategory_Views();

		/**
		 * The meta object literal for the '<em><b>Wizards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__WIZARDS = eINSTANCE.getCategory_Wizards();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.PartImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__NAME = eINSTANCE.getPart_Name();

		/**
		 * The meta object literal for the '<em><b>Dynamic Help</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__DYNAMIC_HELP = eINSTANCE.getPart_DynamicHelp();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.ViewImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Is Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__IS_VISIBLE = eINSTANCE.getView_IsVisible();

		/**
		 * The meta object literal for the '<em><b>Perspectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__PERSPECTIVES = eINSTANCE.getView_Perspectives();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__CATEGORY = eINSTANCE.getView_Category();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.EditorImpl <em>Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EditorImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getEditor()
		 * @generated
		 */
		EClass EDITOR = eINSTANCE.getEditor();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__EXTENSION = eINSTANCE.getEditor_Extension();

		/**
		 * The meta object literal for the '<em><b>Editor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__EDITOR_TYPE = eINSTANCE.getEditor_EditorType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.CommandImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__TOOLTIP = eINSTANCE.getCommand_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__HANDLERS = eINSTANCE.getCommand_Handlers();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__CATEGORY = eINSTANCE.getCommand_Category();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__BINDING = eINSTANCE.getCommand_Binding();

		/**
		 * The meta object literal for the '<em><b>Default Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__DEFAULT_HANDLER = eINSTANCE.getCommand_DefaultHandler();

		/**
		 * The meta object literal for the '<em><b>Mnemonic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__MNEMONIC = eINSTANCE.getCommand_Mnemonic();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuContributionImpl <em>Menu Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.MenuContributionImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getMenuContribution()
		 * @generated
		 */
		EClass MENU_CONTRIBUTION = eINSTANCE.getMenuContribution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_CONTRIBUTION__NAME = eINSTANCE.getMenuContribution_Name();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_CONTRIBUTION__COMMANDS = eINSTANCE.getMenuContribution_Commands();

		/**
		 * The meta object literal for the '<em><b>Menu Contributions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_CONTRIBUTION__MENU_CONTRIBUTIONS = eINSTANCE.getMenuContribution_MenuContributions();

		/**
		 * The meta object literal for the '<em><b>Mnemonic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_CONTRIBUTION__MNEMONIC = eINSTANCE.getMenuContribution_Mnemonic();

		/**
		 * The meta object literal for the '<em><b>Perspectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_CONTRIBUTION__PERSPECTIVES = eINSTANCE.getMenuContribution_Perspectives();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_CONTRIBUTION__VIEWS = eINSTANCE.getMenuContribution_Views();

		/**
		 * The meta object literal for the '<em><b>Editors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_CONTRIBUTION__EDITORS = eINSTANCE.getMenuContribution_Editors();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ToolbarContributionImpl <em>Toolbar Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.ToolbarContributionImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getToolbarContribution()
		 * @generated
		 */
		EClass TOOLBAR_CONTRIBUTION = eINSTANCE.getToolbarContribution();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLBAR_CONTRIBUTION__COMMANDS = eINSTANCE.getToolbarContribution_Commands();

		/**
		 * The meta object literal for the '<em><b>Perspectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLBAR_CONTRIBUTION__PERSPECTIVES = eINSTANCE.getToolbarContribution_Perspectives();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLBAR_CONTRIBUTION__VIEWS = eINSTANCE.getToolbarContribution_Views();

		/**
		 * The meta object literal for the '<em><b>Editors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLBAR_CONTRIBUTION__EDITORS = eINSTANCE.getToolbarContribution_Editors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLBAR_CONTRIBUTION__NAME = eINSTANCE.getToolbarContribution_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.PopupMenuContributionImpl <em>Popup Menu Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.PopupMenuContributionImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getPopupMenuContribution()
		 * @generated
		 */
		EClass POPUP_MENU_CONTRIBUTION = eINSTANCE.getPopupMenuContribution();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPUP_MENU_CONTRIBUTION__COMMANDS = eINSTANCE.getPopupMenuContribution_Commands();

		/**
		 * The meta object literal for the '<em><b>Menus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPUP_MENU_CONTRIBUTION__MENUS = eINSTANCE.getPopupMenuContribution_Menus();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPUP_MENU_CONTRIBUTION__NAME = eINSTANCE.getPopupMenuContribution_Name();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPUP_MENU_CONTRIBUTION__VIEWS = eINSTANCE.getPopupMenuContribution_Views();

		/**
		 * The meta object literal for the '<em><b>Editors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPUP_MENU_CONTRIBUTION__EDITORS = eINSTANCE.getPopupMenuContribution_Editors();

		/**
		 * The meta object literal for the '<em><b>Perspectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPUP_MENU_CONTRIBUTION__PERSPECTIVES = eINSTANCE.getPopupMenuContribution_Perspectives();

		/**
		 * The meta object literal for the '<em><b>Activate With</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPUP_MENU_CONTRIBUTION__ACTIVATE_WITH = eINSTANCE.getPopupMenuContribution_ActivateWith();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.HandlerImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getHandler()
		 * @generated
		 */
		EClass HANDLER = eINSTANCE.getHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__NAME = eINSTANCE.getHandler_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.DefaultHandlerImpl <em>Default Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.DefaultHandlerImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getDefaultHandler()
		 * @generated
		 */
		EClass DEFAULT_HANDLER = eINSTANCE.getDefaultHandler();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextualHandlerImpl <em>Contextual Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.ContextualHandlerImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getContextualHandler()
		 * @generated
		 */
		EClass CONTEXTUAL_HANDLER = eINSTANCE.getContextualHandler();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTUAL_HANDLER__COMMANDS = eINSTANCE.getContextualHandler_Commands();

		/**
		 * The meta object literal for the '<em><b>Activate With</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXTUAL_HANDLER__ACTIVATE_WITH = eINSTANCE.getContextualHandler_ActivateWith();

		/**
		 * The meta object literal for the '<em><b>Associated With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTUAL_HANDLER__ASSOCIATED_WITH = eINSTANCE.getContextualHandler_AssociatedWith();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.HelpContentsImpl <em>Help Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.HelpContentsImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getHelpContents()
		 * @generated
		 */
		EClass HELP_CONTENTS = eINSTANCE.getHelpContents();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_CONTENTS__LABEL = eINSTANCE.getHelpContents_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_CONTENTS__DESCRIPTION = eINSTANCE.getHelpContents_Description();

		/**
		 * The meta object literal for the '<em><b>Help Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELP_CONTENTS__HELP_PAGES = eINSTANCE.getHelpContents_HelpPages();

		/**
		 * The meta object literal for the '<em><b>External Help Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELP_CONTENTS__EXTERNAL_HELP_PAGES = eINSTANCE.getHelpContents_ExternalHelpPages();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.HelpPageImpl <em>Help Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.HelpPageImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getHelpPage()
		 * @generated
		 */
		EClass HELP_PAGE = eINSTANCE.getHelpPage();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_PAGE__LABEL = eINSTANCE.getHelpPage_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELP_PAGE__DESCRIPTION = eINSTANCE.getHelpPage_Description();

		/**
		 * The meta object literal for the '<em><b>Help Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELP_PAGE__HELP_PAGES = eINSTANCE.getHelpPage_HelpPages();

		/**
		 * The meta object literal for the '<em><b>External Help Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELP_PAGE__EXTERNAL_HELP_PAGES = eINSTANCE.getHelpPage_ExternalHelpPages();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.DynamicHelpImpl <em>Dynamic Help</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.DynamicHelpImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getDynamicHelp()
		 * @generated
		 */
		EClass DYNAMIC_HELP = eINSTANCE.getDynamicHelp();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_HELP__LABEL = eINSTANCE.getDynamicHelp_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_HELP__DESCRIPTION = eINSTANCE.getDynamicHelp_Description();

		/**
		 * The meta object literal for the '<em><b>Help Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_HELP__HELP_PAGES = eINSTANCE.getDynamicHelp_HelpPages();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.BindingImpl
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Key Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__KEY_SEQUENCE = eINSTANCE.getBinding_KeySequence();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__COMMAND = eINSTANCE.getBinding_Command();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__CONTEXTS = eINSTANCE.getBinding_Contexts();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.EditorType <em>Editor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.EditorType
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getEditorType()
		 * @generated
		 */
		EEnum EDITOR_TYPE = eINSTANCE.getEditorType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.BasedOn <em>Based On</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.BasedOn
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getBasedOn()
		 * @generated
		 */
		EEnum BASED_ON = eINSTANCE.getBasedOn();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.ImportType <em>Import Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.ImportType
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getImportType()
		 * @generated
		 */
		EEnum IMPORT_TYPE = eINSTANCE.getImportType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.JavaVersion <em>Java Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.JavaVersion
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getJavaVersion()
		 * @generated
		 */
		EEnum JAVA_VERSION = eINSTANCE.getJavaVersion();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.Location <em>Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.gen.eclipse.Location
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getLocation()
		 * @generated
		 */
		EEnum LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em>Namespace</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getNamespace()
		 * @generated
		 */
		EDataType NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em>Java Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getJavaName()
		 * @generated
		 */
		EDataType JAVA_NAME = eINSTANCE.getJavaName();

		/**
		 * The meta object literal for the '<em>Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getName_()
		 * @generated
		 */
		EDataType NAME = eINSTANCE.getName_();

	}

} //EclipsePackage
