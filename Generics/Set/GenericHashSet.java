package com.Generics.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GenericHashSet<T extends Comparable<T>> {

    // Declare a generic HashSet
    private HashSet<T> set;

    // Constructor to initialize the HashSet
    public GenericHashSet() {
       this.set = new HashSet<>();
    }

    // Method to add an element
    public void addElement(T element) {
        set.add(element);
    }

    // Method to remove an element
    public void removeElement(T element) {
        set.remove(element);
    }

    // Method to check if the element exists in the set
    public boolean containsElement(T element) {
        return set.contains(element);
    }

    // Method to print all elements in the set
    public void showElements() {
        System.out.println("HashSet contains: " + set);
    }
    
    public void sortElements() {
        List<T> list = new ArrayList<>(set);  // Convert HashSet to List
        Collections.sort(list);               // Sort the list
        System.out.println("Sorted elements: " + list);
    }
    
    public void filterElements(T data) {
        Set<T> filteredSet = set.stream()
                .filter(element -> element.compareTo(data) > 0)  // Filter condition
                .collect(Collectors.toSet());                        // Collect to a set

        System.out.println("Filtered elements greater than " + data + ": " + filteredSet);
    }
    /*compare
     * 0 if element and data are equal
       A positive number if element is greater than data
       A negative number if element is less than data
     */

    public static void main(String[] args) {
        // Create a generic HashSet for Integer elements
        GenericHashSet<Integer> integerSet = new GenericHashSet<>();
        integerSet.addElement(100);
        integerSet.addElement(20);
        integerSet.addElement(240);
        integerSet.addElement(300);
        integerSet.addElement(200);

        // Display the elements in the set
        System.out.println("Integer HashSet:");

        integerSet.showElements();
        System.out.println("________________________________________");

        // Remove an element and display the set again
        integerSet.removeElement(200);
        System.out.println("After removing 200:");

        integerSet.showElements();
        System.out.println("________________________________________");

        // Check if the set contains an element
        System.out.println("Contains 100: " + integerSet.containsElement(100));
        System.out.println("Contains 200: " + integerSet.containsElement(200));
        
        System.out.println("________________________________________");
        
        integerSet.sortElements();
        integerSet.filterElements(90);

        // Create a generic HashSet for String elements
        GenericHashSet<String> stringSet = new GenericHashSet<>();
        stringSet.addElement("Apple");
        stringSet.addElement("Banana");

        // Display the string set
        System.out.println("String HashSet:");
        stringSet.showElements();
        System.out.println("________________________________________");
        stringSet.sortElements();


    }
}
