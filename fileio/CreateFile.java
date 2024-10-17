package com.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File myfile = new File("D:\\File Handling\\createfile.txt");

		if (myfile.exists()) {
			System.out.println("File Already Exists");
		} else {
			try {
				System.out.println(myfile.createNewFile());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// File Write 
		
		try {
			FileWriter 	fw = new FileWriter("D:\\File Handling\\createfile.txt");

			
			fw.write("Create a new File");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
