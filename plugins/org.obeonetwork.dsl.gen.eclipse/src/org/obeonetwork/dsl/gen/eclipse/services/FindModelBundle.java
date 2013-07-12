package org.obeonetwork.dsl.gen.eclipse.services;

import org.eclipse.core.resources.IProject;

public class FindModelBundle {

	private static IProject iProject;
	private String projectName;
	
	public String getTheBundleForModel() {
		projectName = iProject.getName();
		return projectName;
	}
	
	/**
	 * retrieves the user project containing the model
	 * 
	 * @param projectPath
	 */
	public static void setProject(IProject iProject) {
		FindModelBundle.iProject = iProject;
	}
	
}
