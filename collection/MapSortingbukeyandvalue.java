package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSortingbukeyandvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Aarav", 10);
        ageMap.put("Vivaan", 12);
        ageMap.put("Aditya", 14);
        ageMap.put("Rohan", 9);

        // Sort the HashMap by keys using TreeMap
        TreeMap<String, Integer> sortedByKey = new TreeMap<>(ageMap);

        // Print the sorted map
        System.out.println("Map sorted by keys:");
        for (Map.Entry<String, Integer> entry : sortedByKey.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
