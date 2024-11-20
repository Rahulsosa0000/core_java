package com.Generics.Map;

import java.util.*;
import java.util.stream.Collectors;

public class GenericLinkedHashMap<K extends Comparable<K>, V extends Comparable<V>> {// compare by key and value 

    // Declare a LinkedHashMap with generic key and value types
    private Map<K, V> map;

    // Constructor to initialize the LinkedHashMap
    public GenericLinkedHashMap() {
        map = new LinkedHashMap<>();
    }

    // Method to add a key-value pair to the map
    public void add(K key, V value) {
        map.put(key, value);
    }

    // Method to remove a key-value pair from the map
    public void remove(K key) {
        map.remove(key);
    }

    // Method to get a value for a given key
    public V get(K key) {
        return map.get(key);
    }

    // Method to check if the map contains a specific key
    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    // Method to display the map content
    public void showMap() {
        System.out.println(map);
    }

    // Method to sort the map by key
    public void sortByKey() {
        Map<K, V> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println("Sorted by Key:");
        System.out.println(sortedMap);
    }

    // Method to sort the map by value
    public void sortByValue() {
        Map<K, V> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println("Sorted by Value:");
        System.out.println(sortedMap);
    }

    // Method to filter the map by value (greater than a threshold)
    public void filterByValue(V threshold) {
        Map<K, V> filteredMap = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(threshold))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
        System.out.println("Filtered by Value (greater than " + threshold + "):");
        System.out.println(filteredMap);
    }
    
    public void filterByKey(K threshold) {
        Map<K, V> filteredMap = map.entrySet()
                .stream()
                .filter(entry -> entry.getKey().compareTo(threshold) > 0)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
        System.out.println("Filtered by Key (greater than " + threshold + "):");
        System.out.println(filteredMap);
    }

    public static void main(String[] args) {
        // Create a GenericLinkedHashMap for Integer keys and String values
        GenericLinkedHashMap<Integer, String> personMap = new GenericLinkedHashMap<>();
        
        // Add some key-value pairs to the map
        personMap.add(1, "Amit");
        personMap.add(2, "Ravi");
        personMap.add(3, "Priya");
        personMap.add(4, "Simran");
        personMap.add(5, "Ananya");

        // Display the map (insertion order will be maintained)
        System.out.println("Original Map:");
        personMap.showMap();

        // Get and display a value for a specific key
        System.out.println("\nValue for key 2: " + personMap.get(2));

        // Remove a key-value pair
        personMap.remove(3);
        System.out.println("\nAfter removing key 3:");
        personMap.showMap();

        // Check if a key exists
        System.out.println("\nContains key 4: " + personMap.containsKey(4));

        // Sort by Key
        personMap.sortByKey();

        // Sort by Value
        personMap.sortByValue();

        // Filter by value (names lexicographically greater than "Priya")
        personMap.filterByValue("Ananya");
        
        personMap.filterByKey(2);
        
        System.out.println("__________________________________________________________");
        GenericLinkedHashMap<Integer, Student> studentMap = new GenericLinkedHashMap<>();

        studentMap.add(1, new Student(1, "Ajay", 20));
        studentMap.add(2, new Student(2, "Jay", 22));
        studentMap.add(3, new Student(3, "Chinmay", 21));
        studentMap.add(4, new Student(4, "Dilip", 23));
        studentMap.add(5, new Student(5, "Ram", 20));
        
        System.out.println("Original Map:");
        studentMap.showMap();

        System.out.println("\nValue for key 2: " + studentMap.get(2));

        studentMap.remove(3);
        System.out.println("\nAfter removing key 3:");
        studentMap.showMap();

        System.out.println("\nContains key 4: " + studentMap.containsKey(4));

        studentMap.sortByKey();
        studentMap.sortByValue();

        System.out.println("\nFilter by Value (Student with ID 5):");
        studentMap.filterByValue(new Student(5, "Ram", 20));

        System.out.println("\nFilter by Key (ID greater than 2):");
        studentMap.filterByKey(2);

    }
}
