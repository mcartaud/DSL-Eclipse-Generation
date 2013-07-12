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
package org.obeonetwork.dsl.gen.eclipse.ui.common;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.obeonetwork.dsl.gen.eclipse.ui.Activator;
import org.osgi.framework.Bundle;

/**
 * Main entry point of the 'Eclipse' generation module.
 */
public class GenerateAll {

	/**
	 * The model URI.
	 */
	private URI modelURI;

	/**
	 * The output folder.
	 * @generatedNot
	 */
	private IPath targetPath;

	/**
	 * The other arguments.
	 */
	List<? extends Object> arguments;

	/**
	 * Selected model files.
	 * 
	 * @generatedNOT
	 */
	List<IFile> files;

	/**
	 * Constructor.
	 * 
	 * @param modelURI
	 *            is the URI of the model.
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generatedNOT
	 */
	public GenerateAll(URI modelURI, IPath targetPath, 
			List<? extends Object> arguments, List<IFile> files) {
		this.modelURI = modelURI;
		this.targetPath = targetPath;
		this.arguments = arguments;
		this.files = files;
	}

	/**
	 * find the generated projects.
	 * 
	 * @param projectFolders
	 * @param currentRoot
	 * @generatedNot
	 */
	public static void findEclipseProjectsInFolder(List<File> projectFolders,
			File currentRoot) {
		for (File file : currentRoot.listFiles()) {
			if (file.isDirectory()) {
				findEclipseProjectsInFolder(projectFolders, file); // Calls same
																	// method
																	// again.
			} else {
				if (".project".equals(file.getName())) {
					projectFolders.add(file);
				}
			}
		}
	}

	/**
	 * Launches the generation.
	 * 
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @throws CoreException
	 * @generatedNOT
	 */
	public void doGenerate(IProgressMonitor monitor) throws IOException,
			CoreException {

		if (!targetPath.toFile().exists()) {
			targetPath.toFile().mkdirs();
		}

		monitor.subTask("Loading...");

		// Generate Local Code
		org.obeonetwork.dsl.gen.eclipse.main.Dsl2Eclipse gen0 = new org.obeonetwork.dsl.gen.eclipse.main.Dsl2Eclipse(
				modelURI, targetPath.toFile(), arguments);
		monitor.worked(1);
		String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil
				.computeUIProjectID("org.obeonetwork.dsl.gen.eclipse",
						"org.obeonetwork.dsl.gen.eclipse.main.Dsl2Eclipse",
						modelURI.toString(), targetPath.toString(),
						new ArrayList<String>());
		gen0.setGenerationID(generationID);
		gen0.doGenerate(BasicMonitor.toMonitor(monitor));

		// Refresh workspace
		// currentProject.getParent().refreshLocal(IResource.DEPTH_INFINITE,
		// null);

		Iterator<IFile> filesIt = files.iterator();
		while (filesIt.hasNext()) {
			IFile model = (IFile) filesIt.next();
			model.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
			final List<File> generatedProjects = new ArrayList<File>();
			File rootFolder = new File(targetPath.toOSString());

			findEclipseProjectsInFolder(generatedProjects, rootFolder);

			for (File projectFolder : generatedProjects) {
				IPath path = new Path(projectFolder.getAbsolutePath());
				IProjectDescription description = ResourcesPlugin
						.getWorkspace().loadProjectDescription(path);
				IProject project = ResourcesPlugin.getWorkspace().getRoot()
						.getProject(description.getName());
				if (!project.exists()) {
					project.create(description, null);
					project.open(null);
				} else {
					if (!project.getLocation().toOSString().equals(projectFolder.getParent())) {
						Activator
								.getDefault()
								.getLog()
								.log(new Status(
										IStatus.WARNING,
										Activator.PLUGIN_ID,
										"A project "
												+ project.getName()
												+ " already exists in the workspace with a different location"));
					}
					project.refreshLocal(IResource.DEPTH_INFINITE, null);
				}
			}
		}

		// Generate Model Code
		org.obeonetwork.dsl.gen.eclipse.main.GenModelGeneration gen1 = new org.obeonetwork.dsl.gen.eclipse.main.GenModelGeneration(
				modelURI, targetPath.toFile(), arguments);
		monitor.worked(1);
		generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil
				.computeUIProjectID(
						"org.obeonetwork.dsl.gen.eclipse",
						"org.obeonetwork.dsl.gen.eclipse.main.GenModelGeneration",
						modelURI.toString(), targetPath.toString(),
						new ArrayList<String>());
		gen1.setGenerationID(generationID);
		gen1.doGenerate(BasicMonitor.toMonitor(monitor));

	}

	/**
	 * Finds the template in the plug-in. Returns the template plug-in URI.
	 * 
	 * @param bundleID
	 *            is the plug-in ID
	 * @param relativePath
	 *            is the relative path of the template in the plug-in
	 * @return the template URI
	 * @throws IOException
	 * @generated
	 */
	@SuppressWarnings({ "unused" })
	private URI getTemplateURI(String bundleID, IPath relativePath)
			throws IOException {
		Bundle bundle = Platform.getBundle(bundleID);
		if (bundle == null) {
			// no need to go any further
			return URI.createPlatformResourceURI(
					new Path(bundleID).append(relativePath).toString(), false);
		}
		URL url = bundle.getEntry(relativePath.toString());
		if (url == null && relativePath.segmentCount() > 1) {
			Enumeration<URL> entries = bundle.findEntries("/", "*.emtl", true);
			if (entries != null) {
				String[] segmentsRelativePath = relativePath.segments();
				while (url == null && entries.hasMoreElements()) {
					URL entry = entries.nextElement();
					IPath path = new Path(entry.getPath());
					if (path.segmentCount() > relativePath.segmentCount()) {
						path = path.removeFirstSegments(path.segmentCount()
								- relativePath.segmentCount());
					}
					String[] segmentsPath = path.segments();
					boolean equals = segmentsPath.length == segmentsRelativePath.length;
					for (int i = 0; equals && i < segmentsPath.length; i++) {
						equals = segmentsPath[i]
								.equals(segmentsRelativePath[i]);
					}
					if (equals) {
						url = bundle.getEntry(entry.getPath());
					}
				}
			}
		}
		URI result;
		if (url != null) {
			result = URI.createPlatformPluginURI(
					new Path(bundleID).append(new Path(url.getPath()))
							.toString(), false);
		} else {
			result = URI.createPlatformResourceURI(
					new Path(bundleID).append(relativePath).toString(), false);
		}
		return result;
	}

}
