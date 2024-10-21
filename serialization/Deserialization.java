package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try {
	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\javaproject"
			+ "\\src\\com\\serialization\\studentdata.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	
	Student student=(Student) ois.readObject();
	
	System.out.println(student.getName());
	System.out.println(student.getEmail());
	System.out.println(student.getAge());
	System.out.println(student.getAddress());
	
} catch (IOException | ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		

	}

}
