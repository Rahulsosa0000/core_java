package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreams {



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\fh\\abcd.txt");
		
//		String write="hello my name is rahul sosa";
//		
//        byte[] dataBytes = write.getBytes();//converts String to bytes
//        
//        fout.write(dataBytes);
//        
//        System.out.println("Data write Successfully....");
//        
        String str="Hello world";
        
        char ch[]=str.toCharArray();
        
         for (int i = 0; i < ch.length; i++) {
        	 
			fout.write(ch[i]);
		}
         System.out.println("Data write succesfully");


		
		
	}

}
