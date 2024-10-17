package com.filecompression;

import java.io.*;
import java.util.zip.*;

public class DeCompressZipFile {

	// Method to unzip the ZIP file
	public static void unzip(String zipFilePath, String destDirectory) throws IOException {
		File destDir = new File(destDirectory);
		if (!destDir.exists()) {
			destDir.mkdir(); // Create the destination directory if it doesn't exist
		}

		// Buffer to hold data during extraction
		byte[] buffer = new byte[1024];

		// Open the ZIP file
		try {
			ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath));
			ZipEntry entry = zipIn.getNextEntry();
			System.out.println("Entry Name is :- " + entry.getName());

			// Loop through all the files in the ZIP
			while (entry != null) {
				String filePath = destDirectory + File.separator + entry.getName();
				System.out.println("file seprator:-" + File.separator + "File Path :- " + filePath + " is directory = "
						+ entry.isDirectory());

				if (!entry.isDirectory()) {
					// If it's a file, extract it
					BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
					int bytesRead;
					// Read the data from the ZIP and write it to the output file
					while ((bytesRead = zipIn.read(buffer)) != -1) {
						bos.write(buffer, 0, bytesRead);
					}

				} else {
					// If it's a folder, create the folder
					new File(filePath).mkdirs();
				}

				zipIn.closeEntry();
				entry = zipIn.getNextEntry(); // Go to the next file in the ZIP
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {

		String zipFilePath = "C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com\\filecompression\\myFolder.zip";

		String destDirectory = "D:\\New folder\\File Handling"; // Replace with where you want to extract the files

		try {
			unzip(zipFilePath, destDirectory);
			System.out.println("Unzip completed successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}