package com.fileio;

import java.io.File;
import java.io.IOException;

public class ReadOnlyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean check;
		
		try {
			File f=new File("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\readonly.txt");
			f.createNewFile();
		 check=	f.setReadOnly();
		System.out.println("File can Read only:-"+check);
		check=f.canWrite();
		System.out.println("File is writable:-"+check);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
