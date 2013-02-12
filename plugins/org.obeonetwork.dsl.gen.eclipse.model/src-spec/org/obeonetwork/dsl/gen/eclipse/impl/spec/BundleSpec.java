/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/

package org.obeonetwork.dsl.gen.eclipse.impl.spec;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.obeonetwork.dsl.gen.eclipse.ProvidedService;
import org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl;

/**
 * Specializes the BundleImpl implementation.
 * 
 * @author Mathieu Cartaud
 */
public class BundleSpec extends BundleImpl {

	@Override
	public EList<EPackage> getAllExportedPackages() {
		EList<EPackage> packages = new BasicEList<EPackage>();

		for (ProvidedService providedService : this.providedServices) {
			EClass anInterface = providedService.getInterface();
			EObject containingPackage = anInterface.eContainer();
			EPackage ePackage = null;
			if(containingPackage instanceof EPackage) {
				ePackage = (EPackage)containingPackage;

				EPackage ePackageTmp = ePackage;
				while(ePackageTmp != null) {
					if(ownedPackages.contains(ePackageTmp)) {
						packages.add(ePackage);
					}

					EObject containerTmp = ePackageTmp.eContainer();
					if (containerTmp instanceof EPackage) {
						ePackageTmp = (EPackage)containerTmp;
					} else {
						ePackageTmp = null;
					}
					packages.add(ePackageTmp);
				}
			}
		}
		return packages;
	}
}