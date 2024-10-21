package com.directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path dirPath = Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com\\directory\\exampledir");
		
		try {
			Files.createDirectories(dirPath);
			System.out.println("Directory Created Successfully...."+dirPath);
			System.out.println(dirPath.getFileName());
			System.out.println(dirPath.getParent());
			System.out.println(dirPath.getRoot());
			
		} catch (IOException e) {
            System.out.println("Failed to create directory.");
			e.printStackTrace();
		}
		
	}

}
