package com.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyFile {
public static void main(String[] args) throws IOException {
	try {
		
		Files.copy(Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\ac.txt"),
				Paths.get("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\copy.txt"));
	}catch(Exception e) {
		
	}
	
	FileInputStream r=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\ac.txt");
	FileOutputStream w=new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\copies.txt");
	
	int i;
	
	while((i=r.read())!=-1) {
		w.write((char)i);
	}
	System.out.println("Data copy Successfully.....");
}
}
