package com.reflection;

import java.lang.reflect.Constructor;
import java.util.Scanner;

class Dog {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println(name + " says Woof!");
	}
}

class Cat {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println(name + " says Meow!");
	}
}

public class DynamicallyConstructorCallAtRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the full class name (com.reflection.Dog or com.reflection.Cat):");
			String animalType=sc.nextLine();
			
            Class<?> animalclass = Class.forName(animalType);
            
            Constructor<?> constructor= animalclass.getConstructor(String.class);
            
            Object animalObject = constructor.newInstance("Buddy");
            
            animalclass.getMethod("speak").invoke(animalObject);


		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
