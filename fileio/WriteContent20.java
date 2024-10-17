package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class WriteContent20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Writecontent="hello my name is rahul sosa";
		
		try {
			FileWriter	fw = new FileWriter("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\writecontent.txt");
			fw.write(Writecontent);
			System.out.println("Data is written to the file");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
