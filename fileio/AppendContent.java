package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class AppendContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String contentToAppend = "\n"+"This is the content to append.";

		
		try {
			FileWriter fw=new FileWriter("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\Ac.txt",true);
			fw.write(contentToAppend);
			
			System.out.println("Append Successfully");
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
