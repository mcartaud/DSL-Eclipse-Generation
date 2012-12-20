/**
 */
package org.obeonetwork.dsl.gen.eclipsemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.gen.eclipsemodel.EclipsemodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.obeonetwork.dsl.gen' editDirectory='/org.obeonetwork.dsl.gen.eclipse.model.edit/src-gen' editorDirectory='/org.obeonetwork.dsl.gen.eclipse.model.editor/src-gen'"
 * @generated
 */
public interface EclipsemodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eclipsemodel";

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
  EclipsemodelPackage eINSTANCE = org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.ApplicationImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getApplication()
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
   * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__REPOSITORIES = 5;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__FEATURES = 6;

  /**
   * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__BUNDLES = 7;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 8;

  /**
   * The number of operations of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl <em>Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getRepository()
   * @generated
   */
  int REPOSITORY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__NAME = 0;

  /**
   * The feature id for the '<em><b>Repository ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__REPOSITORY_ID = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__VERSION = 2;

  /**
   * The feature id for the '<em><b>Categoryy Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__CATEGORYY_NAME = 3;

  /**
   * The feature id for the '<em><b>Category Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__CATEGORY_LABEL = 4;

  /**
   * The feature id for the '<em><b>Category Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__CATEGORY_DESCRIPTION = 5;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__FEATURES = 6;

  /**
   * The feature id for the '<em><b>Bundles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__BUNDLES = 7;

  /**
   * The number of structural features of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FEATURE_COUNT = 8;

  /**
   * The number of operations of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.FeatureImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 2;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__LABEL = 0;

  /**
   * The feature id for the '<em><b>Feature ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__FEATURE_ID = 1;

  /**
   * The feature id for the '<em><b>Copyright</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__COPYRIGHT = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__VERSION = 4;

  /**
   * The feature id for the '<em><b>Bundles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__BUNDLES = 5;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.BundleImpl <em>Bundle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.BundleImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getBundle()
   * @generated
   */
  int BUNDLE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__SYMBOLIC_NAME = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__VERSION = 2;

  /**
   * The feature id for the '<em><b>Required Environment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__REQUIRED_ENVIRONMENT = 3;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__SERVICES = 4;

  /**
   * The feature id for the '<em><b>Part Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__PART_CATEGORIES = 5;

  /**
   * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__PERSPECTIVES = 6;

  /**
   * The feature id for the '<em><b>Helps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__HELPS = 7;

  /**
   * The number of structural features of the '<em>Bundle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_FEATURE_COUNT = 8;

  /**
   * The number of operations of the '<em>Bundle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ActionSetImpl <em>Action Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.ActionSetImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getActionSet()
   * @generated
   */
  int ACTION_SET = 4;

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
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.MenuImpl <em>Menu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.MenuImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getMenu()
   * @generated
   */
  int MENU = 5;

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
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.ActionImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getAction()
   * @generated
   */
  int ACTION = 6;

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
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PartCategoryImpl <em>Part Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.PartCategoryImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getPartCategory()
   * @generated
   */
  int PART_CATEGORY = 7;

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
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PartImpl <em>Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.PartImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getPart()
   * @generated
   */
  int PART = 8;

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
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.ViewImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getView()
   * @generated
   */
  int VIEW = 9;

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
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.EditorImpl <em>Editor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EditorImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getEditor()
   * @generated
   */
  int EDITOR = 10;

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
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PerspectiveImpl <em>Perspective</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.PerspectiveImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getPerspective()
   * @generated
   */
  int PERSPECTIVE = 11;

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
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.BindingImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 12;

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
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.HelpImpl <em>Help</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.HelpImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getHelp()
   * @generated
   */
  int HELP = 13;

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
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.PageImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getPage()
   * @generated
   */
  int PAGE = 14;

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
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ContextualHelpImpl <em>Contextual Help</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.ContextualHelpImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getContextualHelp()
   * @generated
   */
  int CONTEXTUAL_HELP = 15;

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
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.ServiceImpl
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getService()
   * @generated
   */
  int SERVICE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Service ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__SERVICE_ID = 1;

  /**
   * The feature id for the '<em><b>Service Kinds</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__SERVICE_KINDS = 2;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.ServiceKind <em>Service Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.gen.eclipsemodel.ServiceKind
   * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getServiceKind()
   * @generated
   */
  int SERVICE_KIND = 17;


  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Application#getApplicationID <em>Application ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Application ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Application#getApplicationID()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_ApplicationID();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Application#getProvider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Provider</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Application#getProvider()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Provider();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Application#getCopyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Copyright</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Application#getCopyright()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Copyright();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Application#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Application#getVersion()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Version();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Application#getRepositories <em>Repositories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Repositories</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Application#getRepositories()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Repositories();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Application#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Application#getFeatures()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Features();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Application#getBundles <em>Bundles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bundles</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Application#getBundles()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Bundles();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Repository
   * @generated
   */
  EClass getRepository();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Repository#getName()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getRepositoryID <em>Repository ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repository ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Repository#getRepositoryID()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_RepositoryID();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Repository#getVersion()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_Version();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryyName <em>Categoryy Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Categoryy Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryyName()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_CategoryyName();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryLabel <em>Category Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category Label</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryLabel()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_CategoryLabel();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryDescription <em>Category Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category Description</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Repository#getCategoryDescription()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_CategoryDescription();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Features</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Repository#getFeatures()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Features();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Repository#getBundles <em>Bundles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Bundles</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Repository#getBundles()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Bundles();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Feature#getLabel()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Label();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getFeatureID <em>Feature ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Feature#getFeatureID()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_FeatureID();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getCopyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Copyright</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Feature#getCopyright()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Copyright();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Feature#getDescription()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Description();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Feature#getVersion()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Version();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Feature#getBundles <em>Bundles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Bundles</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Feature#getBundles()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Bundles();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle <em>Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bundle</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Bundle
   * @generated
   */
  EClass getBundle();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getName()
   * @see #getBundle()
   * @generated
   */
  EAttribute getBundle_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getSymbolicName <em>Symbolic Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbolic Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getSymbolicName()
   * @see #getBundle()
   * @generated
   */
  EAttribute getBundle_SymbolicName();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getVersion()
   * @see #getBundle()
   * @generated
   */
  EAttribute getBundle_Version();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getRequiredEnvironment <em>Required Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required Environment</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getRequiredEnvironment()
   * @see #getBundle()
   * @generated
   */
  EAttribute getBundle_RequiredEnvironment();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getServices()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_Services();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getPartCategories <em>Part Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Part Categories</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getPartCategories()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_PartCategories();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getPerspectives <em>Perspectives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Perspectives</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getPerspectives()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_Perspectives();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getHelps <em>Helps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Helps</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Bundle#getHelps()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_Helps();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.ActionSet <em>Action Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Set</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.ActionSet
   * @generated
   */
  EClass getActionSet();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.ActionSet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.ActionSet#getName()
   * @see #getActionSet()
   * @generated
   */
  EAttribute getActionSet_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.ActionSet#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.ActionSet#getID()
   * @see #getActionSet()
   * @generated
   */
  EAttribute getActionSet_ID();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.ActionSet#getMenus <em>Menus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Menus</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.ActionSet#getMenus()
   * @see #getActionSet()
   * @generated
   */
  EReference getActionSet_Menus();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.ActionSet#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.ActionSet#getActions()
   * @see #getActionSet()
   * @generated
   */
  EReference getActionSet_Actions();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Menu <em>Menu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Menu</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Menu
   * @generated
   */
  EClass getMenu();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Menu#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Menu#getName()
   * @see #getMenu()
   * @generated
   */
  EAttribute getMenu_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.gen.eclipsemodel.Menu#getBinding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binding</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Menu#getBinding()
   * @see #getMenu()
   * @generated
   */
  EReference getMenu_Binding();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Menu#getMenus <em>Menus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Menus</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Menu#getMenus()
   * @see #getMenu()
   * @generated
   */
  EReference getMenu_Menus();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Menu#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Menu#getActions()
   * @see #getMenu()
   * @generated
   */
  EReference getMenu_Actions();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.gen.eclipsemodel.Action#getBinding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binding</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Action#getBinding()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Binding();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.PartCategory <em>Part Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part Category</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.PartCategory
   * @generated
   */
  EClass getPartCategory();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.PartCategory#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.PartCategory#getName()
   * @see #getPartCategory()
   * @generated
   */
  EAttribute getPartCategory_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.PartCategory#getPartCategoryID <em>Part Category ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Part Category ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.PartCategory#getPartCategoryID()
   * @see #getPartCategory()
   * @generated
   */
  EAttribute getPartCategory_PartCategoryID();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.PartCategory#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.PartCategory#getParts()
   * @see #getPartCategory()
   * @generated
   */
  EReference getPartCategory_Parts();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Part
   * @generated
   */
  EClass getPart();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Part#getPartID <em>Part ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Part ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Part#getPartID()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_PartID();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.gen.eclipsemodel.Part#getContextualHelp <em>Contextual Help</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contextual Help</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Part#getContextualHelp()
   * @see #getPart()
   * @generated
   */
  EReference getPart_ContextualHelp();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Part#getPerspectives <em>Perspectives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Perspectives</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Part#getPerspectives()
   * @see #getPart()
   * @generated
   */
  EReference getPart_Perspectives();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.View#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.View#getName()
   * @see #getView()
   * @generated
   */
  EAttribute getView_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.View#getViewID <em>View ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>View ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.View#getViewID()
   * @see #getView()
   * @generated
   */
  EAttribute getView_ViewID();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.View#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.View#getActions()
   * @see #getView()
   * @generated
   */
  EReference getView_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.View#getMenus <em>Menus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Menus</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.View#getMenus()
   * @see #getView()
   * @generated
   */
  EReference getView_Menus();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.View#getActionSets <em>Action Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action Sets</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.View#getActionSets()
   * @see #getView()
   * @generated
   */
  EReference getView_ActionSets();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Editor <em>Editor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Editor</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Editor
   * @generated
   */
  EClass getEditor();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Editor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Editor#getName()
   * @see #getEditor()
   * @generated
   */
  EAttribute getEditor_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Editor#getEditorID <em>Editor ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Editor ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Editor#getEditorID()
   * @see #getEditor()
   * @generated
   */
  EAttribute getEditor_EditorID();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Editor#getActionSets <em>Action Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action Sets</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Editor#getActionSets()
   * @see #getEditor()
   * @generated
   */
  EReference getEditor_ActionSets();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective <em>Perspective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Perspective</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Perspective
   * @generated
   */
  EClass getPerspective();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getName()
   * @see #getPerspective()
   * @generated
   */
  EAttribute getPerspective_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getPerspectiveID <em>Perspective ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Perspective ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getPerspectiveID()
   * @see #getPerspective()
   * @generated
   */
  EAttribute getPerspective_PerspectiveID();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getActionSets <em>Action Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action Sets</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getActionSets()
   * @see #getPerspective()
   * @generated
   */
  EReference getPerspective_ActionSets();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parts</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Perspective#getParts()
   * @see #getPerspective()
   * @generated
   */
  EReference getPerspective_Parts();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Binding#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Binding#getName()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Binding#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Binding#getKey()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Key();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Help <em>Help</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Help</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Help
   * @generated
   */
  EClass getHelp();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Help#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Help#getName()
   * @see #getHelp()
   * @generated
   */
  EAttribute getHelp_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Help#getHelpID <em>Help ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Help ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Help#getHelpID()
   * @see #getHelp()
   * @generated
   */
  EAttribute getHelp_HelpID();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Help#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Help#getPages()
   * @see #getHelp()
   * @generated
   */
  EReference getHelp_Pages();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Page#getPageID <em>Page ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Page ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Page#getPageID()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_PageID();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.ContextualHelp <em>Contextual Help</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contextual Help</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.ContextualHelp
   * @generated
   */
  EClass getContextualHelp();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.ContextualHelp#getContextualHelpID <em>Contextual Help ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contextual Help ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.ContextualHelp#getContextualHelpID()
   * @see #getContextualHelp()
   * @generated
   */
  EAttribute getContextualHelp_ContextualHelpID();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.gen.eclipsemodel.ContextualHelp#getPage <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Page</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.ContextualHelp#getPage()
   * @see #getContextualHelp()
   * @generated
   */
  EReference getContextualHelp_Page();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.gen.eclipsemodel.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.gen.eclipsemodel.Service#getServiceID <em>Service ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service ID</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Service#getServiceID()
   * @see #getService()
   * @generated
   */
  EAttribute getService_ServiceID();

  /**
   * Returns the meta object for the attribute list '{@link org.obeonetwork.dsl.gen.eclipsemodel.Service#getServiceKinds <em>Service Kinds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Service Kinds</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.Service#getServiceKinds()
   * @see #getService()
   * @generated
   */
  EAttribute getService_ServiceKinds();

  /**
   * Returns the meta object for enum '{@link org.obeonetwork.dsl.gen.eclipsemodel.ServiceKind <em>Service Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Service Kind</em>'.
   * @see org.obeonetwork.dsl.gen.eclipsemodel.ServiceKind
   * @generated
   */
  EEnum getServiceKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EclipsemodelFactory getEclipsemodelFactory();

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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.ApplicationImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getApplication()
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
     * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__REPOSITORIES = eINSTANCE.getApplication_Repositories();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__FEATURES = eINSTANCE.getApplication_Features();

    /**
     * The meta object literal for the '<em><b>Bundles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__BUNDLES = eINSTANCE.getApplication_Bundles();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.RepositoryImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getRepository()
     * @generated
     */
    EClass REPOSITORY = eINSTANCE.getRepository();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

    /**
     * The meta object literal for the '<em><b>Repository ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__REPOSITORY_ID = eINSTANCE.getRepository_RepositoryID();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__VERSION = eINSTANCE.getRepository_Version();

    /**
     * The meta object literal for the '<em><b>Categoryy Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__CATEGORYY_NAME = eINSTANCE.getRepository_CategoryyName();

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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.FeatureImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__LABEL = eINSTANCE.getFeature_Label();

    /**
     * The meta object literal for the '<em><b>Feature ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__FEATURE_ID = eINSTANCE.getFeature_FeatureID();

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
     * The meta object literal for the '<em><b>Bundles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__BUNDLES = eINSTANCE.getFeature_Bundles();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.BundleImpl <em>Bundle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.BundleImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getBundle()
     * @generated
     */
    EClass BUNDLE = eINSTANCE.getBundle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUNDLE__NAME = eINSTANCE.getBundle_Name();

    /**
     * The meta object literal for the '<em><b>Symbolic Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUNDLE__SYMBOLIC_NAME = eINSTANCE.getBundle_SymbolicName();

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
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__SERVICES = eINSTANCE.getBundle_Services();

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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ActionSetImpl <em>Action Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.ActionSetImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getActionSet()
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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.MenuImpl <em>Menu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.MenuImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getMenu()
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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.ActionImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getAction()
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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PartCategoryImpl <em>Part Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.PartCategoryImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getPartCategory()
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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PartImpl <em>Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.PartImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getPart()
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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.ViewImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getView()
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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.EditorImpl <em>Editor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EditorImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getEditor()
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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PerspectiveImpl <em>Perspective</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.PerspectiveImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getPerspective()
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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.BindingImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getBinding()
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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.HelpImpl <em>Help</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.HelpImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getHelp()
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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.PageImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getPage()
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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ContextualHelpImpl <em>Contextual Help</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.ContextualHelpImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getContextualHelp()
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
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.ServiceImpl
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Service ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__SERVICE_ID = eINSTANCE.getService_ServiceID();

    /**
     * The meta object literal for the '<em><b>Service Kinds</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__SERVICE_KINDS = eINSTANCE.getService_ServiceKinds();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.gen.eclipsemodel.ServiceKind <em>Service Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.gen.eclipsemodel.ServiceKind
     * @see org.obeonetwork.dsl.gen.eclipsemodel.impl.EclipsemodelPackageImpl#getServiceKind()
     * @generated
     */
    EEnum SERVICE_KIND = eINSTANCE.getServiceKind();

  }

} //EclipsemodelPackage
