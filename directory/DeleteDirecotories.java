package com.directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteDirecotories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path deldir= Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com\\directory\\exampledir");
		
		try {
			Files.delete(deldir);
			 System.out.println("Delete directories Sucessully ........");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
