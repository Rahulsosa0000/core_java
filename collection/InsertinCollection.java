package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class InsertinCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> ageMap = new HashMap<>();

        // Add key-value pairs (name and age)
        ageMap.put("Aarav", 10);
        ageMap.put("Vivaan", 12);
        ageMap.put("Aditya", 14);
        ageMap.put("Diya", 9);

        System.out.println("HashMap: " + ageMap); 
        
        ArrayList<String> names = new ArrayList<>();

        // Add Indian names to the ArrayList
        names.add("Aarav");
        names.add("Vivaan");
        names.add("Aditya");
        names.add("Diya"); // Add to the end of the list
        names.add(2, "Kabir"); // Insert "Kabir" at index 2

        // Print the ArrayList
        System.out.println("ArrayList: " + names);
        
        HashSet<String> uniqueNames = new HashSet<>();

        // Add Indian names to the HashSet
        uniqueNames.add("Aarav");
        uniqueNames.add("Vivaan");
        uniqueNames.add("Aditya");
        uniqueNames.add("Aarav"); // Duplicate entry; will be ignored

        // Print the HashSet
        System.out.println("HashSet: " + uniqueNames);
        
        LinkedList<String> linkedList = new LinkedList<>();

        // Add Indian names to the LinkedList
        linkedList.add("Aarav"); // Add to the end
        linkedList.add("Vivaan");
        linkedList.addFirst("Kabir"); // Add "Kabir" at the beginning
        linkedList.addLast("Diya"); // Add "Diya" at the end

        // Print the LinkedList
        System.out.println("LinkedList: " + linkedList); 
        
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Rahul");
        ts.add("keyur");
        ts.add("karan");
        ts.add("vihan");
        
        System.out.println("Treeset:-"+ts);
	}

}
