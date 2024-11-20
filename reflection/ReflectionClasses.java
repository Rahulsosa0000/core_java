package com.reflection;

/* java reflaction allows to manipulate classes,methods, interface, and fields at run(dynamically) time .
 * Reflection in Java provides the details of a class, its methods, fields, and constructors at runtime.
 * 
 */

import java.lang.reflect.Method;

class Perent{
	
}

class Employee extends Perent{
	
	public void show() {

	}
	
	public void display() {
		
	}
	
}

public class ReflectionClasses {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		Class c=  emp.getClass();
		System.out.println("Class Name: "+c.getName());
	
		Method[] methods=c.getDeclaredMethods();
		for(Method m: methods) {
			System.out.println("Method Name: "+m.getName());
		}
		
		Class superclass= c.getSuperclass();
		System.out.println("Super Class Name: "+superclass.getName());
		
		

	}

}

