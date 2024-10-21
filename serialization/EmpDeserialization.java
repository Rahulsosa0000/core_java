package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class EmpDeserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis =new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src"
					+ "\\com\\serialization\\employee.txt");
			ObjectInputStream ois=new  ObjectInputStream(fis);
	      ArrayList<Employee> obj =(ArrayList<Employee>)ois.readObject();
	      
	      System.out.println(obj.toString());
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
