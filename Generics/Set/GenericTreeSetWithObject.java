package com.Generics.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Person {
	private String name;
	private int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Override toString() for easy display
	@Override
	public String toString() {
		return "Name:-" + name + ", " + "Age:-" + age;
	}
}

public class GenericTreeSetWithObject {

	public static void main(String[] args) {

		// Create a TreeSet with a custom comparator to sort Person objects by age
		Set<Person> personTreeSet = new TreeSet<>(Comparator.comparingInt(Person::getAge));

		// Add Person objects with Indian names to the TreeSet
		personTreeSet.add(new Person("Aarav", 32));
		personTreeSet.add(new Person("Ishaan", 25));
		personTreeSet.add(new Person("Ananya", 30));
		personTreeSet.add(new Person("Diya", 40));
		personTreeSet.add(new Person("Neha", 28));

		// Display elements in the TreeSet (sorted by age)
		System.out.println("TreeSet of Persons sorted by age: ");
		personTreeSet.forEach(System.out::println);

		// Remove a specific person from the TreeSet (removing "Ishaan")
		personTreeSet.remove(new Person("Ishaan", 25));
		System.out.println("\nAfter removing 'Ishaan': ");
		personTreeSet.forEach(System.out::println);

		// Find the first and last elements in the sorted TreeSet
		System.out.println("\nFirst person in the TreeSet: " + ((TreeSet<Person>) personTreeSet).first());
		System.out.println("Last person in the TreeSet: " + ((TreeSet<Person>) personTreeSet).last());

		// Check if a certain person is in the TreeSet
		boolean containsNeha = personTreeSet.contains(new Person("Neha", 28));
		System.out.println("\nDoes the set contain 'Neha'? " + containsNeha);

		// Filter persons older than 30 and display
		Set<Person> filteredSet = personTreeSet.stream().filter(person -> person.getAge() > 30)
				.collect(Collectors.toSet());

		System.out.println("\nFiltered (Persons older than 30): ");
		filteredSet.forEach(System.out::println);

		// Clear the entire TreeSet
		personTreeSet.clear();
		System.out.println("\nAfter clearing the TreeSet: ");
		personTreeSet.forEach(System.out::println); // This will print nothing since it's empty

		// Adding new elements after clearing
		personTreeSet.add(new Person("Rahul", 23));
		personTreeSet.add(new Person("Sanya", 26));

		System.out.println("\nNew TreeSet after clearing and adding new persons: ");
		personTreeSet.forEach(System.out::println);
	}
}
