package com.Generics.List;

import java.util.LinkedList;
import java.util.List;

public class GenericLinkedlist<T> {
    // Declare a generic LinkedList
    private List<T> list;

    // Constructor to initialize the list
    public GenericLinkedlist() {
        this.list = new LinkedList<>(); // which type to created that specify 
    }

    // Add an element to the list
    public void add(T element) {
        list.add(element);
    }

    // Remove an element from the list
    public void remove(T element) {
        list.remove(element);
    }

    // Get an element at a specific index
    public T get(int index) {
        return list.get(index);
    }

    // Get the size of the list
    public int size() {
        return list.size();
    }

    // Check if the list contains a specific element
    public boolean contains(T element) {
        return list.contains(element);
    }

    // Print the list
    public void printList() {
        System.out.println(list);
    }

    // Clear the list
    public void clear() {
        list.clear();
    }

    // Main method to test the GenericLinkedList
    public static void main(String[] args) {
        // Create a GenericLinkedList for Integer type
        GenericLinkedlist<Integer> intList = new GenericLinkedlist<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        // Print the list
        System.out.println("Integer List:");
        intList.printList();  // Output: [10, 20, 30]

        // Remove an element and print the list again
        intList.remove(20);
        System.out.println("After removing 20:");
        intList.printList();  // Output: [10, 30]

        // Get an element and print it
        System.out.println("Element at index 1: " + intList.get(1));  // Output: 30

        // Check if the list contains an element
        System.out.println("Contains 10: " + intList.contains(10));  // Output: true

        // Get the size of the list
        System.out.println("Size of the list: " + intList.size());  // Output: 2

        // Clear the list and print the result
        intList.clear();
        System.out.println("After clearing the list:");
        intList.printList();  // Output: []

        // Create a GenericLinkedList for String type
        GenericLinkedlist<String> strList = new GenericLinkedlist<>();
        strList.add("Hello");
        strList.add("World");

        // Print the string list
        System.out.println("String List:");
        strList.printList();  // Output: [Hello, World]
    }
}
