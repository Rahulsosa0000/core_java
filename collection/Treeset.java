package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();//Comparator.reverseOrder() descending order

        // Adding elements to the TreeSet
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        
        // for each through iterate 
        for( String fruit: fruits) {
        	System.out.print(fruit+" "+"\n");
        }
 
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
        
        
        System.out.println("Iterate treeset");
        Iterator <String> itr =fruits.iterator();
        
        
        
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
       
    }
}


