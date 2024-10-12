package com.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class ReversHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(3, "Black");
		hash_map.put(2, "Green");
		hash_map.put(5, "Blue");
		hash_map.put(4, "White");
		hash_map.put(8, "White");

		hash_map.put(22, "White");

		hash_map.put(88, "White");

		// print the map
		System.out.println("The Original map: " + hash_map);
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(Comparator.reverseOrder());
		tm.putAll(hash_map);

		System.out.println("ReverseOrder:-"+tm);

	}

}
