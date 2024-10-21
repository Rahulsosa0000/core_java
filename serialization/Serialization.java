package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student=new Student("Rahul","sosarahul000@gmail.com",22,"Diu");
		
		try {
			FileOutputStream fout =new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com\\serialization\\studentdata.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			
			oos.writeObject(student);
			oos.close();
			fout.close();
			System.out.println("Object store in file.......");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
