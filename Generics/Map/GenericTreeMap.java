package com.Generics.Map;

import java.util.TreeMap;

public class GenericTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> students = new TreeMap<>();

        students.put("Amit", 85);
        students.put("Sneha", 92);
        students.put("Rahul", 78);
        students.put("Priya", 89);
        
      //  System.out.println("Students from 'Amit' to 'Sneha': " + students.subMap("Amit", "Sneha")); last not contain 

        // Displaying the TreeMap
        System.out.println("Student Scores (Sorted): " + students);

        // Accessing a specific value by its key (get)
        System.out.println("Sneha's Score: " + students.get("Sneha"));

        // Checking if a key exists (containsKey)
        System.out.println("Is Amit in the list? " + students.containsKey("Amit"));

        // Checking if a value exists (containsValue)
        System.out.println("Is there a score of 78? " + students.containsValue(78));

        // Removing a key-value pair (remove)
        students.remove("Rahul");
        System.out.println("After removing Rahul: " + students);

        // Getting the first and last entry (firstEntry, lastEntry)
        System.out.println("First Entry: " + students.firstEntry());
        System.out.println("Last Entry: " + students.lastEntry());

        // Getting the first and last keys (firstKey, lastKey)
        System.out.println("First Student (Alphabetically): " + students.firstKey());
        System.out.println("Last Student (Alphabetically): " + students.lastKey());

        // Getting a part of the map (headMap, tailMap, subMap)
        System.out.println("Students up to 'Sneha': " + students.headMap("Sneha"));//whose keys are strictly less than toKey return
        System.out.println("Students from 'Amit': " + students.tailMap("Amit"));// whose keys are greater than or equal to fromKey
       //
        System.out.println("Students from 'Amit' to 'Sneha': " + students.subMap("Amit", "Sneha"));

        // Replacing a value (replace)
        students.replace("Sneha", 95);
        System.out.println("After updating Sneha's score: " + students);

        // Clearing the TreeMap (clear)
        students.clear();
        System.out.println("After clearing all entries: " + students);
    }
}
