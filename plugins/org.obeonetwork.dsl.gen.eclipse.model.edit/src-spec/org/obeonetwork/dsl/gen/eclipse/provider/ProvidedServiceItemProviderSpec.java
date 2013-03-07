package org.obeonetwork.dsl.gen.eclipse.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.obeonetwork.dsl.gen.eclipse.DeclarativeService;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;
import org.obeonetwork.dsl.gen.eclipse.ProvidedService;

public class ProvidedServiceItemProviderSpec extends ProvidedServiceItemProvider {

	public ProvidedServiceItemProviderSpec(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected void addInterfacePropertyDescriptor(Object object) {
		ItemPropertyDescriptor itemPropertyDescriptor = new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ProvidedService_interface_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ProvidedService_interface_feature",
						"_UI_ProvidedService_type"),
				EclipsePackage.Literals.PROVIDED_SERVICE__INTERFACE, true,
				false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {				
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				
				List<Object> newChoicesOfValues = new ArrayList<Object>();
				if (object instanceof ProvidedService) {
					ProvidedService providedService = (ProvidedService) object;
					EObject eContainer = providedService.eContainer();
					if (eContainer instanceof DeclarativeService) {
						DeclarativeService declarativeService = (DeclarativeService) eContainer;
						GenClass implentationClass = declarativeService.getDelegatorClass();
						
						for (Object anObject : choiceOfValues) {
							if (anObject instanceof GenClass
									&& implentationClass != null
									&& implentationClass.getEcoreClass().getEAllSuperTypes().contains(((GenClass)anObject).getEcoreClass())) {
								newChoicesOfValues.add(anObject);
							}
						}
						
						// We add the Genclass itself
						newChoicesOfValues.add(implentationClass);
						
						// We add null to reset the field
						newChoicesOfValues.add(null);
					}
				}
				return newChoicesOfValues;
			}
		};
		itemPropertyDescriptors.add(itemPropertyDescriptor);
	}
}
