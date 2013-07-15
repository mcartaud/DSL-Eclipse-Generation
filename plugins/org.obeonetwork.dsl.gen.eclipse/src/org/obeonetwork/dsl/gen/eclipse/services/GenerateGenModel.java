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

import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.common.util.BasicMonitor;

/**
 * Service class to launch genModel generation.
 * 
 * @author <a href="mailto:mathieu.cartaud@obeo.fr">Mathieu Cartaud</a>
 */
public class GenerateGenModel {

	private Generator generator;
	private BasicMonitor basicMonitor;
	
	/**
	 * Launch GenModel generation if the required field are feed.
	 * 
	 * @param genModel the genModel associate with the eclipse model
	 */
	public void generate(GenModel genModel) {
		basicMonitor = new BasicMonitor();
		
		genModel.reconcile();
		genModel.setCanGenerate(true);
		generator = GenModelUtil.createGenerator(genModel);
		
		generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, basicMonitor);
		if (genModel.getEditDirectory() != null) {
			generator.generate(genModel, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE, basicMonitor);
		}
		if (genModel.getEditorDirectory() != null) {
			generator.generate(genModel, GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE, basicMonitor);
		}
	}
}
