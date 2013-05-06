package org.obeonetwork.dsl.gen.eclipse.provider;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.Feature;

public class FeatureItemProviderSpec extends FeatureItemProvider {

	public FeatureItemProviderSpec(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	protected void addExcludeBundleForSdkPropertyDescriptor(Object object) {
		ItemPropertyDescriptor itemPropertyDescriptor = new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Feature_excludeBundleForSdk_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Feature_excludeBundleForSdk_feature",
						"_UI_Feature_type"),
				EclipsePackage.Literals.FEATURE__EXCLUDE_BUNDLE_FOR_SDK, true,
				false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Feature feat = (Feature) object;
				Set<Object> newChoicesOfValues = new LinkedHashSet<Object>();
				for (Feature importedFeat : feat.getIncludedFeatures()) {
					newChoicesOfValues.addAll(importedFeat.getBundles());
				}
				newChoicesOfValues.addAll(feat.getBundles());
				return newChoicesOfValues;
			}
		};
		itemPropertyDescriptors.add(itemPropertyDescriptor);
	}
}
