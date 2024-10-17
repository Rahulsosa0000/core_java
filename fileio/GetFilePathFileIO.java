package com.fileio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetFilePathFileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path filepath=Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\copy.txt");
		
		String pathstring=filepath.toString();
		
        System.out.println("File path: " + pathstring);

        System.out.println("file name: "+filepath.getFileName());
        
        System.out.println("File root: "+filepath.getRoot());
        
        System.out.println("Perent Directory: "+filepath.getParent());
	}

}
