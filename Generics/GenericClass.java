package com.Generics;
/*Generics allow you to write a single class or method that can work with any type of data (like Integer,
 *String, or custom classes), but still ensure type safety, meaning errors will be caught at compile time rather than runtime.
 * 
 * Key Points:
   Type Safety: Ensures that you can only store the correct type in a collection or class.
   Reusability: You can use the same code with different types, avoiding code duplication.
   Placeholder for Types: You use a placeholder (like T, E, K, V) to specify that the class or method can work with any type.
 */

class Box<T>{
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}

public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Box<Integer> box1 = new Box<>();
	        box1.setValue(10);
	        System.out.println("Integer Box: " + box1.getValue());

	        // Using Box with String
	        Box<String> box2 = new Box<>();
	        box2.setValue("Welcome..");
	        System.out.println("String Box: " + box2.getValue());

	        // Using Box with Double
	        Box<Double> box3 = new Box<>();
	        box3.setValue(3.14);
	        System.out.println("Double Box: " + box3.getValue());

	        // Using Box with Character
	        Box<Character> box4 = new Box<>();
	        box4.setValue('A');
	        System.out.println("Character Box: " + box4.getValue());

	        // Using Box with Boolean
	        Box<Boolean> box5 = new Box<>();
	        box5.setValue(true);
	        System.out.println("Boolean Box: " + box5.getValue());
	        
	        Box<Float> box6 = new Box<>();
	        box6.setValue(3.144f); 
	        System.out.println("Float Box: " + box6.getValue());

	        // Using Box with Custom Class
	        Box<Person> box7 = new Box<>();
	        box7.setValue(new Person("Rahul", 23));
	        System.out.println("Person Box: " + box7.getValue());

	}

}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name:-"+name + ", "+"Age:-"+ age +  " years old";
    }
}
