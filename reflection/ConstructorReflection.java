package com.reflection;

import java.lang.reflect.Constructor;

class Person{
	
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		System.out.println("Name: "+name+ ", Age:" +age);
	}
	
}

public class ConstructorReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class<?> personclass= Person.class;
		
		Constructor<?> constructor= personclass.getConstructor(String.class,int.class);
		
		Person person= (Person) constructor.newInstance("Rahul",22);
		Person person2= (Person) constructor.newInstance("Sanjay",25);

		
		person.display();
		person2.display();

		
		}catch (Exception e) {
		 System.out.println(e);
		}

	}

}
