package com.reflection;
/*Getters and Setters Reflection: - reflection can be used to dynamically call getter and setter methods. 
 * This can be particularly useful when we don’t know the exact fields or 
 * methods of a class in advance but want to access or modify properties at runtime. 
 * 
 * Reflection lets us work with objects dynamically, so we can call getters and setters without needing to know the field
 * names in advance. This is helpful if we’re working with many different types of objects or need to access unknown fields.
 * 
 *  reflection allows you to modify object properties dynamically, 
 *  even when you don’t know the exact fields and methods in advance.
 */
import java.lang.reflect.Method;

class Student{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

public class GetterSetterReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Student student=new Student("Keyur", 23);
			
			System.out.println("Name and age before changes: -"+student.toString());
			
			Class<?> studentClass= student.getClass();
			
			Method setnameMethod=studentClass.getMethod("setName", String.class); //dynamically call without direct call
			setnameMethod.invoke(student, "Rahul");
			
			Method getnameMethod = studentClass.getMethod("getName");
			String name= (String) getnameMethod.invoke(student);
			System.out.println("Name after Change: "+name);
			
			Method setageMethod= studentClass.getMethod("setAge", int.class);
			setageMethod.invoke(student, 22);
			
			Method getageMethod= studentClass.getMethod("getAge");
			int age= (int) getageMethod.invoke(student);
			System.out.println("Age after change: "+age);	
			
			
			
		}catch (Exception e) {
		   System.out.println(e);
		}

	}

}
