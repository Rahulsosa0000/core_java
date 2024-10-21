package com.temproryfile;

import java.io.File;
import java.io.IOException;

public class CreateTempFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File temp= File.createTempFile("myTemp", ".tmp");
			System.out.println("Create temp file:-"+temp.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
