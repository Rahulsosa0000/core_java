package com.Generics.List;



import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(50);

		System.out.println("Integer List: " + intList);

		List<String> strList = new ArrayList<>();
		strList.add("Arav");
		strList.add("Badal");
		strList.add("Chinmay");
		strList.add("Dipak");
		strList.add("Eren");

		System.out.println("String List: " + strList);

		List<Double> doubleList = new ArrayList<>();
		doubleList.add(3.14);
		doubleList.add(1.618);
		
        System.out.println("Double List: " + doubleList);

        List<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('B');
        
        System.out.println("Character List: " + charList);
        
        List<Boolean> boolList = new ArrayList<>();
        boolList.add(true);
        boolList.add(false);
        
        System.out.println("Boolean List: " + boolList);
        
        List<Long> longList = new ArrayList<>();
        longList.add(10000000000L);
        longList.add(20000000000L);
        
        System.out.println("Long List: " + longList);
        
        
        // Using List with Custom Object (e.g., a class Person)
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Keyur", 25));
        personList.add(new Person("Meet", 30));
        System.out.println("Person List: " + personList);
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
        return "PersonName:-"+name + ", "+"Age:-"+ age +  " years old";
    }
}


