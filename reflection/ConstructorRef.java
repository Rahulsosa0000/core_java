package com.reflection;

/*Accessing Constructors: 

With reflection, you can get the constructor of any class, even if it’s private, protected, or public. 

Creating Objects Dynamically: 

Reflection allows you to create objects using constructors at runtime,
 without explicitly calling the constructor in your code. 
 * 
 */
import java.lang.reflect.*;

class Employees {
	int empno;
	String name;
	String address;

	public Employees(int empno, String name, String address) {
		this.empno = empno;
		this.name = name;
		this.address = address;
	}

	public Employees(int empno, String name) {
		this.empno = empno;
		this.name = name;
	}

	private Employees(String address) {
		this.address = address;
	}

	protected Employees(int empno) {
		this.empno = empno;
	}
}

public class ConstructorRef {
	public static void main(String args[]) {

		// Employees emp=new Employees("sghdgd");

		Class<?> c = Employees.class;

		System.out.println("All public constructors are:");
		Constructor<?>[] cons = c.getConstructors();

		for (Constructor<?> con : cons) {
			System.out.print(con.getName() + " ");
		}
		
		System.out.println("\n\nAll constructors irrespective of access modifiers");
		cons = c.getDeclaredConstructors();

		for (Constructor<?> con : cons) {
			System.out.print(con.getName() + " ");
		}
		
		System.out.println("\n\nAccess modifiers of each constructor");
		for (Constructor<?> con : cons) {
			System.out.print(Modifier.toString(con.getModifiers()) + " ");
		}
		
		System.out.println("\n\nGetting parameter types of each constructor");
		for (Constructor<?> con : cons) {
			Class<?>[] parameterTypes = con.getParameterTypes();

			for (Class<?> c1 : parameterTypes) {
				System.out.print(c1.getName() + " ");
			}
			System.out.println();

		}
		
		try {
			// access private constructor
			Constructor<?> privateConstructor = c.getDeclaredConstructor(String.class);
			privateConstructor.setAccessible(true); // Allows access to private constructor
			Employees emp = (Employees) privateConstructor.newInstance("Bob");

			System.out.println("private to access: " + emp.address);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
