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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import org.eclipse.core.runtime.IPath;

/**
 * Copy a default icon for the ui elements in the model.
 * 
 * @author <a href="mailto:mathieu.cartaud@obeo.fr">Mathieu Cartaud</a>
 */
public class CreateIcons {

	private static IPath iPath;

	/**
	 * Copies the image located in the plugin into the given destination path.
	 * 
	 * @param bundlePath
	 *            the path of the generated bundle
	 * @param elementName
	 *            the name for the icon of the generated element
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public void copyImage(String bundlePath, String elementName)
			throws IOException, URISyntaxException {

		try {
			File targetFolder = new File(iPath + "/"
					+ bundlePath + "/icons");
			targetFolder.mkdirs();
			File targetFile = new File(targetFolder.getAbsolutePath() + "/"
					+ elementName);

			InputStream imageInputStream = this.getClass().getResourceAsStream(
					"defaultIcon.gif");

			copyFile(imageInputStream, targetFile);
			if (imageInputStream != null) {
				imageInputStream.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Copies the file described by the given sourceStream into the given
	 * destination file.
	 * 
	 * @param sourceStream
	 *            the input stream of the source file to copy
	 * @param destFile
	 *            the destination file
	 * @throws IOException
	 *             if files cannot be properly accessed
	 */
	private void copyFile(InputStream sourceStream, File destFile)
			throws IOException {

		if (!(destFile.exists())) {
			destFile.createNewFile();

			FileOutputStream outputStream = new FileOutputStream(destFile);
			try {
				byte[] buf = new byte[512];
				int len;
				while ((len = sourceStream.read(buf)) > 0)
					outputStream.write(buf, 0, len);
				sourceStream.close();
				outputStream.close();
			} finally {
				if (sourceStream != null)
					sourceStream.close();
			}
		}
	}

	/**
	 * retrieves the user project containing the model.
	 * 
	 * @param projectPath
	 */
	public static void setProjectPath(IPath iPath) {
		CreateIcons.iPath = iPath;
	}

}
