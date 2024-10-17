package com.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.nio.file.attribute.FileTime;

public class LastModifiedDateFileIO {

	public static void main(String[] args) {

		Path p = Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\bw.txt");

		if (!Files.exists(p)) {
			System.out.println("The file does not exist: " + p);
			return;
		}

		try {
			BasicFileAttributes bfa = Files.readAttributes(p, BasicFileAttributes.class);
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

			// Get and format creation time
			FileTime creationTime = bfa.creationTime();
			String LCT = df.format(creationTime.toMillis());  // last creation time
			System.out.println("Creation time: " + LCT);

			// Get and format last modified time
			FileTime lastModifiedTime = bfa.lastModifiedTime();
			String LMT = df.format(lastModifiedTime.toMillis());
			
			System.out.println("Last modified time: " + LMT);  // last modified time 
			
			

		} catch (IOException e) {
			System.out.println("Unable to retrieve file attributes.");
			e.printStackTrace();
		}
	}
}
