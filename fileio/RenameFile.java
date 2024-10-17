package com.fileio;

import java.io.File;

public class RenameFile {
	
	public static void main(String[] args) {
		
		File oldfile=new File("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\abcd.txt");
		
		File newfile=new File("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\renamefile.txt");
		
		if(oldfile.renameTo(newfile)) {
			System.out.println("File Renamed Success");
		}else {
			System.out.println("File is not renamed");
		}
	}

}
