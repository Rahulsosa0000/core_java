package com.fileio;

import java.io.File;
import java.io.FilenameFilter;

public class FindFileWithextension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String extension = ".txt";
		File fileditrectory = new File("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh");

		FilenameFilter filter = (dir, name) -> name.endsWith(extension);

		File files[] = fileditrectory.listFiles(filter);
		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					System.out.println("Found file: " + file.getName());

				}
			}
		} else {
			System.out.println("No files found or directory does not exist.");

		}

	}

}
