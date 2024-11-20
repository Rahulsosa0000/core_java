package com.Generics.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Custom class for demonstration
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (age " + age + ")";
    }
}

// Functional interface for the filter condition
interface Condition<T> {
    boolean test(T item);
}

// Utility class with a generic method
class FilterUtils {
    // Generic method to filter a list of items based on a condition using Stream API
    public static <T> List<T> filterItems(List<T> items, Condition<T> condition) {
        // Stream approach to filter and collect items that match the condition
        return items.stream()
                .filter(condition::test)  // Apply the condition to each item
                .collect(Collectors.toList());  // Collect matched items into a new list
        
//        List<T> result = new ArrayList<>();
//        for (T item : items) {
//            if (condition.test(item)) { // Apply the condition to each item
//                result.add(item);
//            }
//            
//        }
//		return result;
    }
    
    
}

public class GenericFilterExample {
    public static void main(String[] args) {
        // Example 1: Filter integers (find even numbers)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = FilterUtils.filterItems(numbers, n -> n % 2 == 0);
        System.out.println("Even numbers: " + evenNumbers);

        // Example 2: Filter strings (find strings starting with 'A')
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");
        List<String> aWords = FilterUtils.filterItems(words, word -> word.startsWith("A"));
        System.out.println("Words starting with 'A': " + aWords);

        // Example 3: Filter custom objects (find employees older than 30)
        List<Employee> employees = Arrays.asList(
                new Employee("Keyur", 28),
                new Employee("Jignesh", 32),
                new Employee("Deepak", 25),
                new Employee("Simran", 34)
        );
        List<Employee> seniorEmployees = FilterUtils.filterItems(employees, emp -> emp.getAge() > 30);
        System.out.println("Employees older than 30: " + seniorEmployees);
    }
}
