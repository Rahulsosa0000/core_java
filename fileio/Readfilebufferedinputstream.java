package com.fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Readfilebufferedinputstream {
	public static void main(String[] args) {
		
		try {
			FileInputStream fi=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\bw.txt");
			// convert byte from to char 
			BufferedInputStream bi=new BufferedInputStream(fi);
			System.out.println("Number of remaining bytes:" + 
                    bi.available()); 
			int line;
			while ((line=bi.read()) != -1) {
				System.out.print((char)line);
				
			}
			
			
		} catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());

			e.printStackTrace();
		}
		
	}

}
