package com.fileio;

import java.io.File;
import java.io.IOException;

public class FileExistCheck {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\check.txt");
		
		if(!f.exists()) {
			f.createNewFile();
			System.out.println("File created Successfully");
		}else {
			System.out.println("File already Exist!.......");
		}
		

	}

}
