package org.obeonetwork.dsl.gen.eclipse.provider;

import org.eclipse.emf.common.notify.Adapter;

public class EclipseItemProviderAdapterFactorySpec extends EclipseItemProviderAdapterFactory {
	@Override
	public Adapter createProvidedServiceAdapter() {
		if (providedServiceItemProvider == null) {
			providedServiceItemProvider = new ProvidedServiceItemProviderSpec(this);
		}

		return providedServiceItemProvider;
	}
	
	@Override
	public Adapter createDeclarativeServiceAdapter() {
		if (declarativeServiceItemProvider == null) {
			declarativeServiceItemProvider = new DeclarativeServiceItemProviderSpec(this);
		}

		return declarativeServiceItemProvider;
	}
	
	@Override
	public Adapter createFeatureAdapter() {
		if (featureItemProvider == null) {
			featureItemProvider = new FeatureItemProviderSpec(this);
		}

		return featureItemProvider;
	}
}
