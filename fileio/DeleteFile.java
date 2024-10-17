package com.fileio;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		String path="C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\abc.txt";
		
		File f=new File(path);
		
		if(f.exists()) {
			if(f.delete())
			System.out.println("File deleted Successfully");
		}else {
			System.out.println("File not deleted successfully....");
		}
	}
}
