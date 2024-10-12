package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Arraytolist {
	
	public static void main(String[] args) {
		
		String strarr[]= {"Akki","Raju","sanjay","Rajesh","Kishor"};
		
		List<String> stringlist=Arrays.asList(strarr); //convert arr to list
		
		System.out.println("List"+stringlist);
		
        Set<String> stringSet = new HashSet<>(stringlist);
        
        System.out.println("List to set:-"+stringSet);
        
     // Convert array to Set
        Set<String> strset = new HashSet<>(Arrays.asList(strarr));
        System.out.println("Set: " + strset);
        

        // Convert arrays to Map
        Map<String, Integer> map = new HashMap<>();
        String[] keys = {"Alice", "Bob", "Charlie"};
        Integer[] values = {1, 2, 3};
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

        System.out.println("Map: " + map);
        
        

        // Convert List to Array
        List<String> stringList = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
        String[] stringArray = stringList.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(stringArray));
        
        // Convert Set to Array
        Set<String> stringset = new HashSet<>(Set.of("Alice", "Bob", "Charlie"));
        String[] stringarray = stringset.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(stringarray));

	}

}
