package org.obeonetwork.dsl.gen.eclipse.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IContainer;

public class CreateIcons {

	private static IContainer projectPath;

	/**
	 * Copies the image located in the plugin into the given destination path
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
			File targetFolder = new File(projectPath.getLocation() + "/"
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
		}
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

	/**
	 * retrieves the user project containing the model
	 * 
	 * @param projectPath
	 */
	public static void setProjectPath(IContainer projectPath) {
		CreateIcons.projectPath = projectPath;
	}

}
