package com.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class FindElementinCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<>();
		HashSet<String> uniqueNames = new HashSet<>();

		names.add("Aarav");
		names.add("Vivaan");
		names.add("Aditya");

		String searchName = "Vivaan";
		// Using the predefined method to find the element
		System.out.println(searchName
				+ (findElement(names, searchName) ? " is found in the ArrayList." : " is not found in the ArrayList."));

		uniqueNames.add("Aarav");
		uniqueNames.add("Vivaan");
		uniqueNames.add("Aditya");

		String searchhassetName = "Aditya";
		// Using the predefined method to find the element
		System.out.println(searchhassetName + (findElement(uniqueNames, searchhassetName) ? " is found in the HashSet."
				: " is not found in the HashSet."));

	}

	public static boolean findElement(HashSet<String> set, String element) {
		return set.contains(element); // Predefined method
	}

	public static boolean findElement(ArrayList<String> list, String element) {
		return list.contains(element); // Predefined method
	}
}
