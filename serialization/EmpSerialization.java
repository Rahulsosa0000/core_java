package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmpSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee em1 = new Employee(1, "Keyur", "vadodara", 25000);
		Employee em2 = new Employee(2, "rahul", "diu", 50000);
		Employee em3 = new Employee(3, "dilip", "dholka", 15000);
		Employee em4 = new Employee(4, "jay", "mehsana", 40000);
		Employee em5 = new Employee(5, "raju", "kodinar", 30000);
		Employee em6 = new Employee(6, "munna", "somnath", 25000);
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(em1);
		list.add(em2);
		list.add(em3);
		list.add(em4);
		list.add(em5);
		list.add(em6);
		
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\javaproject\\src\\com"
					+ "\\serialization\\employee.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			oos.close();
			fos.close();
			
			System.out.println("Dynamic object write in file");
		} catch (IOException e) {
			System.out.println("due to some error");
			e.printStackTrace();
		}
		

	}

}
