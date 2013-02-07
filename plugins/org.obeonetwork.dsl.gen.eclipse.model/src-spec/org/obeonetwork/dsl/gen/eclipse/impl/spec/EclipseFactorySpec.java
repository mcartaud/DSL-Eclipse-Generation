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

import org.obeonetwork.dsl.gen.eclipse.Bundle;
import org.obeonetwork.dsl.gen.eclipse.impl.BundleImpl;
import org.obeonetwork.dsl.gen.eclipse.impl.EclipseFactoryImpl;

/**
 * Specializes the EclipseFactoryImpl implementation.
 * 
 * @author Mathieu Cartaud
 */
public class EclipseFactorySpec extends EclipseFactoryImpl {
	
	/**
	 * Constructor.
	 */
	public EclipseFactorySpec() {
		super();
	}
	
	public Bundle createBundle(){
		BundleImpl bundle = new BundleSpec();
	    return bundle;
	}
	
}
