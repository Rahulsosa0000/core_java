package com.directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyDirectories {

	public static void main(String[] args) {
		
		Path sourcedir= Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com\\directory\\exampledir");
		Path targetdir=Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com\\directory\\copydir");
		
		try {
			Files.walk(sourcedir).forEach(sFile->{
				Path destPath = sFile.resolve(targetdir.relativize(sourcedir));
					try {
						Files.copy(sourcedir, destPath, StandardCopyOption.REPLACE_EXISTING);
					} catch (IOException e) {
						e.printStackTrace();
					}
				System.out.println(sFile.toAbsolutePath()); // traverse
			});
			
			
			System.out.println("success....");
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		
	}
}
