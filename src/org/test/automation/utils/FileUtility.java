package org.test.automation.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileUtility {
	
	public static void cleanFolder(String folderName) throws IOException
	{
		File file = new File(folderName);
		FileUtils.cleanDirectory(file); 
		System.out.println("Done. Folder cleaned: "+folderName);
	}
	
	public static void copyFile(File srcFile,File destFile) throws IOException
	{
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("Done. file copied: "+srcFile);
	}
	

}