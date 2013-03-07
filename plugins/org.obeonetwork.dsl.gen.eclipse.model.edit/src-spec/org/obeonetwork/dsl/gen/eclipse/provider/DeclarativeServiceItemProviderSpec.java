package org.obeonetwork.dsl.gen.eclipse.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.obeonetwork.dsl.gen.eclipse.EclipsePackage;

public class DeclarativeServiceItemProviderSpec extends DeclarativeServiceItemProvider {

	public DeclarativeServiceItemProviderSpec(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	protected void addDelegatorClassPropertyDescriptor(Object object) {
		ItemPropertyDescriptor itemPropertyDescriptor = new ItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_DeclarativeService_delegatorClass_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DeclarativeService_delegatorClass_feature",
								"_UI_DeclarativeService_type"),
						EclipsePackage.Literals.DECLARATIVE_SERVICE__DELEGATOR_CLASS,
						true, false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {				
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				
				List<Object> newChoicesOfValues = new ArrayList<Object>();	
					for (Object anObject : choiceOfValues) {
						if (anObject instanceof GenClass
								&& !(((GenClass)anObject).isInterface())
								&& !(((GenClass)anObject).isAbstract())) {
							newChoicesOfValues.add(anObject);
						}
						
					// We add null to reset the field
				}
				newChoicesOfValues.add(null);
				return newChoicesOfValues;
			}
		};
		itemPropertyDescriptors.add(itemPropertyDescriptor);		
	}
}