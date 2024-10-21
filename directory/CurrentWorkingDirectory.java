package com.directory;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentWorkingDirectory {
	
	public static void main(String[] args) {
		
		String currentworkingdir= System.getProperty("user.dir");
		
		System.out.println("Current working Directory:-"+currentworkingdir);
		
		Path currentDirectory = Paths.get("").toAbsolutePath();

        System.out.println("Current working directory: " + currentDirectory);
        
	}

}
