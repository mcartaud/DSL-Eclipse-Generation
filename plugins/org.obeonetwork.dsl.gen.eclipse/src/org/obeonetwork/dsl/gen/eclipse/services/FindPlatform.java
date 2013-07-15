/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mathieu Cartaud (Obeo) - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.gen.eclipse.services;

/**
 * Return OS type.
 * 
 * @author <a href="mailto:mathieu.cartaud@obeo.fr">Mathieu Cartaud</a>
 */
public class FindPlatform {

	/**
	 * find the platform's type
	 * 
	 * @return the platform kind
	 */
	public String findPlatform() {
		return (String) System.getProperties().get("os.name");
	}

}
