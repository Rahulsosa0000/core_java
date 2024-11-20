package com.Generics.Methods;
/*
 * A generic method is a method that can work with any type of data, 
 * defined with a type parameter that allows you to specify the type when the method is called. 
 * This makes methods more flexible and reusable, without having to write the same code for different types.
 */

public class GenericMethod {

	public <T> void print(T element) {
		System.out.println("Elements:-" + element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericMethod gm = new GenericMethod();

		gm.print("Integer: " + 10);
		gm.print("String: " + "hii");
		gm.print("Double: " + 3.14);
		gm.print("Float: " + 3.14f);
		gm.print("Boolean: " + true);
		gm.print("Char: " + 'A');
	}

}
