package com.collection;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        // Adding elements to the TreeSet
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        

        // TreeSet automatically sorts the elements
        System.out.println("Fruits in sorted order: " + fruits);

        // Trying to add a duplicate element
        fruits.add("Apple");  // Duplicate, will be ignored

        // Displaying the TreeSet again after trying to add a duplicate
        System.out.println("After add duplicate: " + fruits);

        // Accessing first and last elements
        System.out.println("First fruit: " + fruits.first());
        System.out.println("Last fruit: " + fruits.last());
        
        System.out.println(fruits.remove("Banana")); // if banana present in list it will be remove 
        System.out.println("After remove:-"+fruits);
        
       
    }
}


