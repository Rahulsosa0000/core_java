package com.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
//			FileWriter fw=new FileWriter("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\bw.txt");
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\bw.txt"));
			bw.write("Welcome to the java programming...."+"\n");
			bw.write("hello everyone"+"\n");
			bw.write("my name is rahul sosa");
			System.out.println("Write Successfully..............");
			
			bw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
