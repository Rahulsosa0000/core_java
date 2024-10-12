package com.collection;

import java.util.ArrayList;
import java.util.List;

public class MergingCollection {
	public static void main(String[] args) {
		
		


		        List<String> list1 = new ArrayList<>();
		        list1.add("Aarav");
		        list1.add("Vivaan");

		        List<String> list2 = new ArrayList<>();
		        list2.add("Aditya");
		        list2.add("Rohan");

		        // Merging list2 into list1
		        list1.addAll(list2);

		        // Print the merged list
		        System.out.println("Merged List: " + list1);
		    
		

	}

}
