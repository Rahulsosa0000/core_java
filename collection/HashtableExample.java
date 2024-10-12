package com.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
	public static void main(String[] args) {

		// Create a Hashtable
		Hashtable<Integer, String> students = new Hashtable<>();
		// hashtable does not follow insertion or sorting order
		// we can add value duplicate but key is unique

		// Adding key-value pairs to the Hashtable
		students.put(10, "Anjali");
		students.put(1, "Anjali");
		students.put(13, "Anjali");
		students.put(14, "Anjali");
		students.put(11, "Anjali");
		students.put(101, "Rahul");
		students.put(102, "Priya");
		students.put(103, "Aarav");
		students.put(104, "Anjali");
		students.put(105, "Anjali");
		students.put(107, "Anjali");
		students.put(108, "Anjali");
		students.put(109, "Anjali");

		// Display the Hashtable contents
		System.out.println("Students Hashtable: " + students);

		// Retrieve a value based on a key
		String studentName = students.get(102);
		System.out.println("Student with ID 102: " + studentName);

		// Check if a particular key exists
		if (students.containsKey(104)) {
			System.out.println("Student with ID 104 exists.");
		}

		// Check if a particular value exists
		if (students.containsValue("Priya")) {
			System.out.println("Student named Priya exists.");
		}

		// Removing a key-value pair
		students.remove(103);
		System.out.println("After removing student with ID 103: " + students);

		// Iterate over Hashtable entries
		System.out.println("Iterating over Hashtable:");
		for (Map.Entry<Integer, String> entry : students.entrySet()) {

			System.out.println("Keys:-" + entry.getKey() + " " + "Values:-" + entry.getValue());
		}
	}
}
