/**
 */
package org.obeonetwork.dsl.gen.eclipse.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.gen.eclipse.Application;
import org.obeonetwork.dsl.gen.eclipse.EclipseFactory;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.gen.eclipse.Application} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addApplicationIDPropertyDescriptor(object);
			addProviderPropertyDescriptor(object);
			addCopyrightPropertyDescriptor(object);
			addLicensePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addBaseNamespacePropertyDescriptor(object);
			addMavenCompilationPropertyDescriptor(object);
			addGenerateTestsBundlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Application ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_applicationID_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_applicationID_feature",
						"_UI_Application_type"),
				EclipsePackage.Literals.APPLICATION__APPLICATION_ID, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Provider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProviderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_provider_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_provider_feature",
						"_UI_Application_type"),
				EclipsePackage.Literals.APPLICATION__PROVIDER, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Copyright feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyrightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_copyright_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_copyright_feature",
						"_UI_Application_type"),
				EclipsePackage.Literals.APPLICATION__COPYRIGHT, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the License feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLicensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_license_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_license_feature",
						"_UI_Application_type"),
				EclipsePackage.Literals.APPLICATION__LICENSE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_version_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_version_feature",
						"_UI_Application_type"),
				EclipsePackage.Literals.APPLICATION__VERSION, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_description_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_description_feature",
						"_UI_Application_type"),
				EclipsePackage.Literals.APPLICATION__DESCRIPTION, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Base Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_baseNamespace_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_baseNamespace_feature",
						"_UI_Application_type"),
				EclipsePackage.Literals.APPLICATION__BASE_NAMESPACE, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Maven Compilation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMavenCompilationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_mavenCompilation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_mavenCompilation_feature",
						"_UI_Application_type"),
				EclipsePackage.Literals.APPLICATION__MAVEN_COMPILATION, true,
				false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Generate Tests Bundle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateTestsBundlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Application_generateTestsBundle_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Application_generateTestsBundle_feature",
						"_UI_Application_type"),
				EclipsePackage.Literals.APPLICATION__GENERATE_TESTS_BUNDLE,
				true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EclipsePackage.Literals.APPLICATION__PROJECTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Application.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Application"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated-NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Application) object).getApplicationID();
		return label == null || label.length() == 0 ? getString("_UI_Application_type")
				: getString("_UI_Application_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Application.class)) {
		case EclipsePackage.APPLICATION__APPLICATION_ID:
		case EclipsePackage.APPLICATION__PROVIDER:
		case EclipsePackage.APPLICATION__COPYRIGHT:
		case EclipsePackage.APPLICATION__LICENSE:
		case EclipsePackage.APPLICATION__VERSION:
		case EclipsePackage.APPLICATION__DESCRIPTION:
		case EclipsePackage.APPLICATION__BASE_NAMESPACE:
		case EclipsePackage.APPLICATION__MAVEN_COMPILATION:
		case EclipsePackage.APPLICATION__GENERATE_TESTS_BUNDLE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case EclipsePackage.APPLICATION__PROJECTS:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				EclipsePackage.Literals.APPLICATION__PROJECTS,
				EclipseFactory.eINSTANCE.createRepository()));

		newChildDescriptors.add(createChildParameter(
				EclipsePackage.Literals.APPLICATION__PROJECTS,
				EclipseFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add(createChildParameter(
				EclipsePackage.Literals.APPLICATION__PROJECTS,
				EclipseFactory.eINSTANCE.createBundle()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EclipseEditPlugin.INSTANCE;
	}

}
