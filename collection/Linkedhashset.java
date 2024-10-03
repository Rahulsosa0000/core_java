package com.collection;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");

		// as A already exists
		lhs.add("A");
		lhs.add("E");

		System.out.println("Size of LinkedHashSet = " + lhs.size());

		System.out.println("Original LinkedHashSet:" + lhs);

		System.out.println("Removing D from LinkedHashSet: " + lhs.remove("D"));

		System.out.println("Remove Z which is not present: " + lhs.remove("Z"));

		System.out.println("Checking if A is present=" + lhs.contains("A"));

		System.out.println("Updated LinkedHashSet: " + lhs);
	}
}
