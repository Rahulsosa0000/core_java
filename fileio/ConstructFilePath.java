package com.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConstructFilePath {
	public static void main(String[] args) {
		
		try {
		Path directorypath= Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\filehandling");
		
		Files.createDirectories(directorypath);
		
		Path filepath=directorypath.resolve("abcd.txt");
		
		Files.createFile(filepath);
		
		System.out.println("Folder is created..."+directorypath);
		
		System.out.println("File is created..."+filepath);
		
		}catch(IOException e) {
			 System.out.println("An error occurred during file or directory creation.");
	         e.printStackTrace();
		}

	}
}
