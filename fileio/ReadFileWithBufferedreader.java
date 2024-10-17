package com.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithBufferedreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr=new FileReader("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\bw.txt");
			try (BufferedReader br = new BufferedReader(fr)) {
				String line="";
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}
             			
		} catch (IOException e) {
			System.err.println("An error occurred while reading the file: " + e.getMessage());
			e.printStackTrace();
		}
		

	}

}
