/**
 */
package org.obeonetwork.dsl.gen.eclipse;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.gen.eclipse.EclipseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.obeonetwork.dsl.gen' editDirectory='/org.obeonetwork.dsl.gen.eclipse.model.edit/src-gen' editorDirectory='/org.obeonetwork.dsl.gen.eclipse.model.editor/src-gen'"
 * @generated
 */
public interface EclipsePackage extends EPackage
{
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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Application ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__APPLICATION_ID = 1;

  /**
   * The feature id for the '<em><b>Provider</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__PROVIDER = 2;

  /**
   * The feature id for the '<em><b>Copyright</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__COPYRIGHT = 3;

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
   * The feature id for the '<em><b>Projects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__PROJECTS = 6;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_OPERATION_COUNT = 0;

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
   * The feature id for the '<em><b>Project ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PROJECT_ID = 0;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PROJECT_NAME = 1;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_OPERATION_COUNT = 0;

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
   * The feature id for the '<em><b>Project ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__PROJECT_ID = PROJECT__PROJECT_ID;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__PROJECT_NAME = PROJECT__PROJECT_NAME;

  /**
   * The feature id for the '<em><b>Category Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__CATEGORY_NAME = PROJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Category Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__CATEGORY_LABEL = PROJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Category Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__CATEGORY_DESCRIPTION = PROJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__FEATURES = PROJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Bundles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__BUNDLES = PROJECT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_OPERATION_COUNT = PROJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.FeatureImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 3;

  /**
   * The feature id for the '<em><b>Project ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__PROJECT_ID = PROJECT__PROJECT_ID;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__PROJECT_NAME = PROJECT__PROJECT_NAME;

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
   * The feature id for the '<em><b>Feature Provider</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__FEATURE_PROVIDER = PROJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Bundles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__BUNDLES = PROJECT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OPERATION_COUNT = PROJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl <em>Bundle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getBundle()
   * @generated
   */
  int BUNDLE = 4;

  /**
   * The feature id for the '<em><b>Project ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__PROJECT_ID = PROJECT__PROJECT_ID;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__PROJECT_NAME = PROJECT__PROJECT_NAME;

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
   * The feature id for the '<em><b>Provided Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__PROVIDED_SERVICES = PROJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Required Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__REQUIRED_SERVICES = PROJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Part Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__PART_CATEGORIES = PROJECT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__PERSPECTIVES = PROJECT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Helps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__HELPS = PROJECT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Imported Package Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__IMPORTED_PACKAGE_DECLARATIONS = PROJECT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Exported Packages</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__EXPORTED_PACKAGES = PROJECT_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Bundle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 10;

  /**
   * The number of operations of the '<em>Bundle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_OPERATION_COUNT = PROJECT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ImportedPackageDeclarationImpl <em>Imported Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.ImportedPackageDeclarationImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getImportedPackageDeclaration()
   * @generated
   */
  int IMPORTED_PACKAGE_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_PACKAGE_DECLARATION__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Package Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_PACKAGE_DECLARATION__PACKAGE_VERSION = 1;

  /**
   * The number of structural features of the '<em>Imported Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_PACKAGE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Imported Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTED_PACKAGE_DECLARATION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ActionSetImpl <em>Action Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.ActionSetImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getActionSet()
   * @generated
   */
  int ACTION_SET = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SET__NAME = 0;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SET__ID = 1;

  /**
   * The feature id for the '<em><b>Menus</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SET__MENUS = 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SET__ACTIONS = 3;

  /**
   * The number of structural features of the '<em>Action Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SET_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Action Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SET_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl <em>Menu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getMenu()
   * @generated
   */
  int MENU = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__NAME = 0;

  /**
   * The feature id for the '<em><b>Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__BINDING = 1;

  /**
   * The feature id for the '<em><b>Menus</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__MENUS = 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU__ACTIONS = 3;

  /**
   * The number of structural features of the '<em>Menu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Menu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.ActionImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getAction()
   * @generated
   */
  int ACTION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__BINDING = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.PartCategoryImpl <em>Part Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.PartCategoryImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getPartCategory()
   * @generated
   */
  int PART_CATEGORY = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_CATEGORY__NAME = 0;

  /**
   * The feature id for the '<em><b>Part Category ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_CATEGORY__PART_CATEGORY_ID = 1;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_CATEGORY__PARTS = 2;

  /**
   * The number of structural features of the '<em>Part Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_CATEGORY_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Part Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_CATEGORY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.PartImpl <em>Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.PartImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getPart()
   * @generated
   */
  int PART = 10;

  /**
   * The feature id for the '<em><b>Part ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__PART_ID = 0;

  /**
   * The feature id for the '<em><b>Contextual Help</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__CONTEXTUAL_HELP = 1;

  /**
   * The feature id for the '<em><b>Perspectives</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__PERSPECTIVES = 2;

  /**
   * The number of structural features of the '<em>Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.ViewImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getView()
   * @generated
   */
  int VIEW = 11;

  /**
   * The feature id for the '<em><b>Part ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__PART_ID = PART__PART_ID;

  /**
   * The feature id for the '<em><b>Contextual Help</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__CONTEXTUAL_HELP = PART__CONTEXTUAL_HELP;

  /**
   * The feature id for the '<em><b>Perspectives</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__PERSPECTIVES = PART__PERSPECTIVES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = PART_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>View ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__VIEW_ID = PART_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__ACTIONS = PART_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Menus</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__MENUS = PART_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Action Sets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__ACTION_SETS = PART_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = PART_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.EditorImpl <em>Editor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EditorImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getEditor()
   * @generated
   */
  int EDITOR = 12;

  /**
   * The feature id for the '<em><b>Part ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITOR__PART_ID = PART__PART_ID;

  /**
   * The feature id for the '<em><b>Contextual Help</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITOR__CONTEXTUAL_HELP = PART__CONTEXTUAL_HELP;

  /**
   * The feature id for the '<em><b>Perspectives</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITOR__PERSPECTIVES = PART__PERSPECTIVES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITOR__NAME = PART_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Editor ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITOR__EDITOR_ID = PART_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Action Sets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITOR__ACTION_SETS = PART_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Editor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITOR_FEATURE_COUNT = PART_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Editor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDITOR_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.PerspectiveImpl <em>Perspective</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.PerspectiveImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getPerspective()
   * @generated
   */
  int PERSPECTIVE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSPECTIVE__NAME = 0;

  /**
   * The feature id for the '<em><b>Perspective ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSPECTIVE__PERSPECTIVE_ID = 1;

  /**
   * The feature id for the '<em><b>Action Sets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSPECTIVE__ACTION_SETS = 2;

  /**
   * The feature id for the '<em><b>Parts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSPECTIVE__PARTS = 3;

  /**
   * The number of structural features of the '<em>Perspective</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSPECTIVE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Perspective</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSPECTIVE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.BindingImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getBinding()
   * @generated
   */
  int BINDING = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__NAME = 0;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__KEY = 1;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.HelpImpl <em>Help</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.HelpImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getHelp()
   * @generated
   */
  int HELP = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELP__NAME = 0;

  /**
   * The feature id for the '<em><b>Help ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELP__HELP_ID = 1;

  /**
   * The feature id for the '<em><b>Pages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELP__PAGES = 2;

  /**
   * The number of structural features of the '<em>Help</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELP_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Help</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELP_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.PageImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getPage()
   * @generated
   */
  int PAGE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Page ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__PAGE_ID = 1;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextualHelpImpl <em>Contextual Help</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.ContextualHelpImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getContextualHelp()
   * @generated
   */
  int CONTEXTUAL_HELP = 17;

  /**
   * The feature id for the '<em><b>Contextual Help ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTUAL_HELP__CONTEXTUAL_HELP_ID = 0;

  /**
   * The feature id for the '<em><b>Page</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTUAL_HELP__PAGE = 1;

  /**
   * The number of structural features of the '<em>Contextual Help</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTUAL_HELP_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Contextual Help</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTUAL_HELP_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.ProvidedServiceImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getProvidedService()
   * @generated
   */
  int PROVIDED_SERVICE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Service ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__SERVICE_ID = 1;

  /**
   * The feature id for the '<em><b>Implementation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__IMPLEMENTATION = 2;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__INTERFACE = 3;

  /**
   * The feature id for the '<em><b>Required Services</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE__REQUIRED_SERVICES = 4;

  /**
   * The number of structural features of the '<em>Provided Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Provided Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_SERVICE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl <em>Required Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipse.impl.RequiredServiceImpl
   * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getRequiredService()
   * @generated
   */
  int REQUIRED_SERVICE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Service ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__SERVICE_ID = 1;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__INTERFACE = 2;

  /**
   * The number of structural features of the '<em>Required Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Required Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE_OPERATION_COUNT = 0;


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
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

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
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Project#getProjectID <em>Project ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Project#getProjectID()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_ProjectID();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Project#getProjectName <em>Project Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Project#getProjectName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_ProjectName();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Repository#getCategoryName <em>Category Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Repository#getCategoryName()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_CategoryName();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Repository#getCategoryLabel <em>Category Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category Label</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Repository#getCategoryLabel()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_CategoryLabel();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Repository#getCategoryDescription <em>Category Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category Description</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Repository#getCategoryDescription()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_CategoryDescription();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Repository#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Features</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Repository#getFeatures()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Features();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Repository#getBundles <em>Bundles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Bundles</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Repository#getBundles()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Bundles();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Feature#getFeatureProvider <em>Feature Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature Provider</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Feature#getFeatureProvider()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_FeatureProvider();

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
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getProvidedServices <em>Provided Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provided Services</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getProvidedServices()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_ProvidedServices();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getRequiredServices <em>Required Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Required Services</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getRequiredServices()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_RequiredServices();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getPartCategories <em>Part Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Part Categories</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getPartCategories()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_PartCategories();

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
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getHelps <em>Helps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Helps</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getHelps()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_Helps();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Bundle#getImportedPackageDeclarations <em>Imported Package Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imported Package Declarations</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Bundle#getImportedPackageDeclarations()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_ImportedPackageDeclarations();

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
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration <em>Imported Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imported Package Declaration</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration
   * @generated
   */
  EClass getImportedPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration#getPackageName()
   * @see #getImportedPackageDeclaration()
   * @generated
   */
  EAttribute getImportedPackageDeclaration_PackageName();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration#getPackageVersion <em>Package Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Version</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ImportedPackageDeclaration#getPackageVersion()
   * @see #getImportedPackageDeclaration()
   * @generated
   */
  EAttribute getImportedPackageDeclaration_PackageVersion();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.ActionSet <em>Action Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Set</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ActionSet
   * @generated
   */
  EClass getActionSet();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ActionSet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ActionSet#getName()
   * @see #getActionSet()
   * @generated
   */
  EAttribute getActionSet_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ActionSet#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ActionSet#getID()
   * @see #getActionSet()
   * @generated
   */
  EAttribute getActionSet_ID();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.ActionSet#getMenus <em>Menus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Menus</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ActionSet#getMenus()
   * @see #getActionSet()
   * @generated
   */
  EReference getActionSet_Menus();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.ActionSet#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ActionSet#getActions()
   * @see #getActionSet()
   * @generated
   */
  EReference getActionSet_Actions();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Menu <em>Menu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Menu</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Menu
   * @generated
   */
  EClass getMenu();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Menu#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Menu#getName()
   * @see #getMenu()
   * @generated
   */
  EAttribute getMenu_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.gen.eclipse.Menu#getBinding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binding</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Menu#getBinding()
   * @see #getMenu()
   * @generated
   */
  EReference getMenu_Binding();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Menu#getMenus <em>Menus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Menus</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Menu#getMenus()
   * @see #getMenu()
   * @generated
   */
  EReference getMenu_Menus();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Menu#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Menu#getActions()
   * @see #getMenu()
   * @generated
   */
  EReference getMenu_Actions();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.gen.eclipse.Action#getBinding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binding</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Action#getBinding()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Binding();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.PartCategory <em>Part Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part Category</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.PartCategory
   * @generated
   */
  EClass getPartCategory();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.PartCategory#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.PartCategory#getName()
   * @see #getPartCategory()
   * @generated
   */
  EAttribute getPartCategory_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.PartCategory#getPartCategoryID <em>Part Category ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Part Category ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.PartCategory#getPartCategoryID()
   * @see #getPartCategory()
   * @generated
   */
  EAttribute getPartCategory_PartCategoryID();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.PartCategory#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.PartCategory#getParts()
   * @see #getPartCategory()
   * @generated
   */
  EReference getPartCategory_Parts();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Part#getPartID <em>Part ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Part ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Part#getPartID()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_PartID();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.gen.eclipse.Part#getContextualHelp <em>Contextual Help</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contextual Help</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Part#getContextualHelp()
   * @see #getPart()
   * @generated
   */
  EReference getPart_ContextualHelp();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Part#getPerspectives <em>Perspectives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Perspectives</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Part#getPerspectives()
   * @see #getPart()
   * @generated
   */
  EReference getPart_Perspectives();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.View#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.View#getName()
   * @see #getView()
   * @generated
   */
  EAttribute getView_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.View#getViewID <em>View ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>View ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.View#getViewID()
   * @see #getView()
   * @generated
   */
  EAttribute getView_ViewID();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.View#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.View#getActions()
   * @see #getView()
   * @generated
   */
  EReference getView_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.View#getMenus <em>Menus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Menus</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.View#getMenus()
   * @see #getView()
   * @generated
   */
  EReference getView_Menus();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.View#getActionSets <em>Action Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action Sets</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.View#getActionSets()
   * @see #getView()
   * @generated
   */
  EReference getView_ActionSets();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Editor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Editor#getName()
   * @see #getEditor()
   * @generated
   */
  EAttribute getEditor_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Editor#getEditorID <em>Editor ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Editor ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Editor#getEditorID()
   * @see #getEditor()
   * @generated
   */
  EAttribute getEditor_EditorID();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Editor#getActionSets <em>Action Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action Sets</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Editor#getActionSets()
   * @see #getEditor()
   * @generated
   */
  EReference getEditor_ActionSets();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getPerspectiveID <em>Perspective ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Perspective ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Perspective#getPerspectiveID()
   * @see #getPerspective()
   * @generated
   */
  EAttribute getPerspective_PerspectiveID();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getActionSets <em>Action Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action Sets</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Perspective#getActionSets()
   * @see #getPerspective()
   * @generated
   */
  EReference getPerspective_ActionSets();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.Perspective#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parts</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Perspective#getParts()
   * @see #getPerspective()
   * @generated
   */
  EReference getPerspective_Parts();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Binding#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Binding#getName()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Binding#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Binding#getKey()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Key();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Help <em>Help</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Help</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Help
   * @generated
   */
  EClass getHelp();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Help#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Help#getName()
   * @see #getHelp()
   * @generated
   */
  EAttribute getHelp_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Help#getHelpID <em>Help ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Help ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Help#getHelpID()
   * @see #getHelp()
   * @generated
   */
  EAttribute getHelp_HelpID();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipse.Help#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Help#getPages()
   * @see #getHelp()
   * @generated
   */
  EReference getHelp_Pages();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.Page#getPageID <em>Page ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Page ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.Page#getPageID()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_PageID();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipse.ContextualHelp <em>Contextual Help</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contextual Help</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ContextualHelp
   * @generated
   */
  EClass getContextualHelp();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ContextualHelp#getContextualHelpID <em>Contextual Help ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contextual Help ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ContextualHelp#getContextualHelpID()
   * @see #getContextualHelp()
   * @generated
   */
  EAttribute getContextualHelp_ContextualHelpID();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.gen.eclipse.ContextualHelp#getPage <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Page</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ContextualHelp#getPage()
   * @see #getContextualHelp()
   * @generated
   */
  EReference getContextualHelp_Page();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ProvidedService#getName()
   * @see #getProvidedService()
   * @generated
   */
  EAttribute getProvidedService_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getServiceID <em>Service ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ProvidedService#getServiceID()
   * @see #getProvidedService()
   * @generated
   */
  EAttribute getProvidedService_ServiceID();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getImplementation <em>Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Implementation</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ProvidedService#getImplementation()
   * @see #getProvidedService()
   * @generated
   */
  EReference getProvidedService_Implementation();

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
   * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipse.ProvidedService#getRequiredServices <em>Required Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Required Services</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.ProvidedService#getRequiredServices()
   * @see #getProvidedService()
   * @generated
   */
  EReference getProvidedService_RequiredServices();

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
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.RequiredService#getName()
   * @see #getRequiredService()
   * @generated
   */
  EAttribute getRequiredService_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getServiceID <em>Service ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.RequiredService#getServiceID()
   * @see #getRequiredService()
   * @generated
   */
  EAttribute getRequiredService_ServiceID();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.dsl.gen.eclipse.RequiredService#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interface</em>'.
   * @see org.obeonetwork.dsl.gen.eclipse.RequiredService#getInterface()
   * @see #getRequiredService()
   * @generated
   */
  EReference getRequiredService_Interface();

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
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

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
     * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__PROJECTS = eINSTANCE.getApplication_Projects();

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
     * The meta object literal for the '<em><b>Project ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__PROJECT_ID = eINSTANCE.getProject_ProjectID();

    /**
     * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__PROJECT_NAME = eINSTANCE.getProject_ProjectName();

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
     * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__CATEGORY_NAME = eINSTANCE.getRepository_CategoryName();

    /**
     * The meta object literal for the '<em><b>Category Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__CATEGORY_LABEL = eINSTANCE.getRepository_CategoryLabel();

    /**
     * The meta object literal for the '<em><b>Category Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__CATEGORY_DESCRIPTION = eINSTANCE.getRepository_CategoryDescription();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__FEATURES = eINSTANCE.getRepository_Features();

    /**
     * The meta object literal for the '<em><b>Bundles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__BUNDLES = eINSTANCE.getRepository_Bundles();

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
     * The meta object literal for the '<em><b>Feature Provider</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__FEATURE_PROVIDER = eINSTANCE.getFeature_FeatureProvider();

    /**
     * The meta object literal for the '<em><b>Bundles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__BUNDLES = eINSTANCE.getFeature_Bundles();

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
     * The meta object literal for the '<em><b>Provided Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__PROVIDED_SERVICES = eINSTANCE.getBundle_ProvidedServices();

    /**
     * The meta object literal for the '<em><b>Required Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__REQUIRED_SERVICES = eINSTANCE.getBundle_RequiredServices();

    /**
     * The meta object literal for the '<em><b>Part Categories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__PART_CATEGORIES = eINSTANCE.getBundle_PartCategories();

    /**
     * The meta object literal for the '<em><b>Perspectives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__PERSPECTIVES = eINSTANCE.getBundle_Perspectives();

    /**
     * The meta object literal for the '<em><b>Helps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__HELPS = eINSTANCE.getBundle_Helps();

    /**
     * The meta object literal for the '<em><b>Imported Package Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__IMPORTED_PACKAGE_DECLARATIONS = eINSTANCE.getBundle_ImportedPackageDeclarations();

    /**
     * The meta object literal for the '<em><b>Exported Packages</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__EXPORTED_PACKAGES = eINSTANCE.getBundle_ExportedPackages();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ImportedPackageDeclarationImpl <em>Imported Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipse.impl.ImportedPackageDeclarationImpl
     * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getImportedPackageDeclaration()
     * @generated
     */
    EClass IMPORTED_PACKAGE_DECLARATION = eINSTANCE.getImportedPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORTED_PACKAGE_DECLARATION__PACKAGE_NAME = eINSTANCE.getImportedPackageDeclaration_PackageName();

    /**
     * The meta object literal for the '<em><b>Package Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORTED_PACKAGE_DECLARATION__PACKAGE_VERSION = eINSTANCE.getImportedPackageDeclaration_PackageVersion();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ActionSetImpl <em>Action Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipse.impl.ActionSetImpl
     * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getActionSet()
     * @generated
     */
    EClass ACTION_SET = eINSTANCE.getActionSet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_SET__NAME = eINSTANCE.getActionSet_Name();

    /**
     * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_SET__ID = eINSTANCE.getActionSet_ID();

    /**
     * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_SET__MENUS = eINSTANCE.getActionSet_Menus();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_SET__ACTIONS = eINSTANCE.getActionSet_Actions();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl <em>Menu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipse.impl.MenuImpl
     * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getMenu()
     * @generated
     */
    EClass MENU = eINSTANCE.getMenu();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU__NAME = eINSTANCE.getMenu_Name();

    /**
     * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MENU__BINDING = eINSTANCE.getMenu_Binding();

    /**
     * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MENU__MENUS = eINSTANCE.getMenu_Menus();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MENU__ACTIONS = eINSTANCE.getMenu_Actions();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipse.impl.ActionImpl
     * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__BINDING = eINSTANCE.getAction_Binding();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.PartCategoryImpl <em>Part Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipse.impl.PartCategoryImpl
     * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getPartCategory()
     * @generated
     */
    EClass PART_CATEGORY = eINSTANCE.getPartCategory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART_CATEGORY__NAME = eINSTANCE.getPartCategory_Name();

    /**
     * The meta object literal for the '<em><b>Part Category ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART_CATEGORY__PART_CATEGORY_ID = eINSTANCE.getPartCategory_PartCategoryID();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART_CATEGORY__PARTS = eINSTANCE.getPartCategory_Parts();

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
     * The meta object literal for the '<em><b>Part ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__PART_ID = eINSTANCE.getPart_PartID();

    /**
     * The meta object literal for the '<em><b>Contextual Help</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART__CONTEXTUAL_HELP = eINSTANCE.getPart_ContextualHelp();

    /**
     * The meta object literal for the '<em><b>Perspectives</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART__PERSPECTIVES = eINSTANCE.getPart_Perspectives();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__NAME = eINSTANCE.getView_Name();

    /**
     * The meta object literal for the '<em><b>View ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__VIEW_ID = eINSTANCE.getView_ViewID();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__ACTIONS = eINSTANCE.getView_Actions();

    /**
     * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__MENUS = eINSTANCE.getView_Menus();

    /**
     * The meta object literal for the '<em><b>Action Sets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__ACTION_SETS = eINSTANCE.getView_ActionSets();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDITOR__NAME = eINSTANCE.getEditor_Name();

    /**
     * The meta object literal for the '<em><b>Editor ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDITOR__EDITOR_ID = eINSTANCE.getEditor_EditorID();

    /**
     * The meta object literal for the '<em><b>Action Sets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDITOR__ACTION_SETS = eINSTANCE.getEditor_ActionSets();

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
     * The meta object literal for the '<em><b>Perspective ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSPECTIVE__PERSPECTIVE_ID = eINSTANCE.getPerspective_PerspectiveID();

    /**
     * The meta object literal for the '<em><b>Action Sets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSPECTIVE__ACTION_SETS = eINSTANCE.getPerspective_ActionSets();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSPECTIVE__PARTS = eINSTANCE.getPerspective_Parts();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__NAME = eINSTANCE.getBinding_Name();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__KEY = eINSTANCE.getBinding_Key();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.HelpImpl <em>Help</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipse.impl.HelpImpl
     * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getHelp()
     * @generated
     */
    EClass HELP = eINSTANCE.getHelp();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELP__NAME = eINSTANCE.getHelp_Name();

    /**
     * The meta object literal for the '<em><b>Help ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELP__HELP_ID = eINSTANCE.getHelp_HelpID();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELP__PAGES = eINSTANCE.getHelp_Pages();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipse.impl.PageImpl
     * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

    /**
     * The meta object literal for the '<em><b>Page ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__PAGE_ID = eINSTANCE.getPage_PageID();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipse.impl.ContextualHelpImpl <em>Contextual Help</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipse.impl.ContextualHelpImpl
     * @see org.obeonetwork.dsl.gen.eclipse.impl.EclipsePackageImpl#getContextualHelp()
     * @generated
     */
    EClass CONTEXTUAL_HELP = eINSTANCE.getContextualHelp();

    /**
     * The meta object literal for the '<em><b>Contextual Help ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXTUAL_HELP__CONTEXTUAL_HELP_ID = eINSTANCE.getContextualHelp_ContextualHelpID();

    /**
     * The meta object literal for the '<em><b>Page</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXTUAL_HELP__PAGE = eINSTANCE.getContextualHelp_Page();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDED_SERVICE__NAME = eINSTANCE.getProvidedService_Name();

    /**
     * The meta object literal for the '<em><b>Service ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDED_SERVICE__SERVICE_ID = eINSTANCE.getProvidedService_ServiceID();

    /**
     * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_SERVICE__IMPLEMENTATION = eINSTANCE.getProvidedService_Implementation();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_SERVICE__INTERFACE = eINSTANCE.getProvidedService_Interface();

    /**
     * The meta object literal for the '<em><b>Required Services</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_SERVICE__REQUIRED_SERVICES = eINSTANCE.getProvidedService_RequiredServices();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_SERVICE__NAME = eINSTANCE.getRequiredService_Name();

    /**
     * The meta object literal for the '<em><b>Service ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_SERVICE__SERVICE_ID = eINSTANCE.getRequiredService_ServiceID();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_SERVICE__INTERFACE = eINSTANCE.getRequiredService_Interface();

  }

} //EclipsePackage
