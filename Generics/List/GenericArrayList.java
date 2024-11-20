package com.Generics.List;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList<T> {
    // Declare a generic list
    private List<T> list;

    // Constructor to initialize the list
    public GenericArrayList() {
        this.list = new ArrayList<>();
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

    // Main method to test the GenericArrayList
    public static void main(String[] args) {
        // Create a GenericArrayList for Integer type
        GenericArrayList<Integer> intList = new GenericArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        // Print the list
        System.out.println("Integer List:");
        intList.printList();

        // Remove an element and print the list again
        intList.remove(20);
        System.out.println("After removing 20:");
        intList.printList();

        // Get an element and print it
        System.out.println("Element at index 1: " + intList.get(1));

        // Check if the list contains an element
        System.out.println("Contains 10: " + intList.contains(10));

        // Get the size of the list
        System.out.println("Size of the list: " + intList.size());

        // Clear the list and print the result
        intList.clear();
        System.out.println("After clearing the list:");
        intList.printList();

        // Create a GenericArrayList for String type
        GenericArrayList<String> strList = new GenericArrayList<>();
        strList.add("Hello");
        strList.add("World");
        
        // Print the string list
        System.out.println("String List:");
        strList.printList();
    }
}
