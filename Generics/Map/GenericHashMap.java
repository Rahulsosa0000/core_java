package com.Generics.Map;

import java.util.*;
import java.util.stream.Collectors;

public class GenericHashMap {

    public static void main(String[] args) {
        // Create a HashMap to store Integer keys and String values (Indian names)
        HashMap<Integer, String> personMap = new HashMap<>();

        // Add key-value pairs (ID, Name)
        personMap.put(1, "Amit");
        personMap.put(2, "Ravi");
        personMap.put(3, "Priya");
        personMap.put(4, "Simran");
        personMap.put(5, "Ananya");
        personMap.put(6, "Vikram");

        
        // Print the map
        System.out.println("Original map:");
        System.out.println(personMap);

        // Get a value using the key (for example, key 2)
        System.out.println("\nValue for key 2: " + personMap.get(2));

        // Update value for a key (let's update the value for key 2)
        personMap.put(2, "Raj");
        System.out.println("\nAfter updating value for key 2:");
        System.out.println(personMap);

        // Sort the map by key
        Map<Integer, String> sortedByKey = personMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println("\nSorted by Key: " + sortedByKey);

        // Sort the map by value
        Map<Integer, String> sortedByValue = personMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println("\nSorted by Value: " + sortedByValue);

        // Filter by value (names lexicographically greater than "Priya")  // compare first char P=V 
        Map<Integer, String> filteredMap = personMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().compareTo("Priya") > 0)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
        System.out.println("\nFiltered by Value (greater than 'Priya'): " + filteredMap);

        // Get all keys
        System.out.println("\nAll keys: " + personMap.keySet());

        // Get all values
        System.out.println("All values: " + personMap.values());

        // Get the size of the map (number of key-value pairs)
        System.out.println("\nSize of the map: " + personMap.size());

        // Remove a key-value pair (for example, remove the pair with key 1)
        personMap.remove(1);
        System.out.println("\nAfter removing key 1:");
        System.out.println(personMap);

        // Clear the map
        personMap.clear();
        System.out.println("\nAfter clearing the map:");
        System.out.println(personMap);
    }
}

