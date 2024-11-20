package com.Generics;

import java.util.List;

public class UnBounWildcard {
	
	public static void printList(List<?> list) {
	    for (Object item : list) {
	        System.out.println(item);
	    }
	}

	public static void main(String[] args) {
	    List<Integer> intList = List.of(1, 2, 3);
	    List<String> strList = List.of("Hello", "World");
	    
	    printList(intList);  // Works with Integer list
	    printList(strList);  // Works with String list
	}


}
