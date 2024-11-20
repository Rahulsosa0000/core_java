package com.Generics.Methods;

import java.util.Arrays;
import java.util.List;

public class GenericMethod2 {
	
	public  static <T> void printlist(List<T> list) {
		for(T element: list) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		
		// List of Integers
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        System.out.println("Integer List:");
        printlist(intList);

        // List of Strings
        List<String> stringList = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println("\nString List:");
        printlist(stringList);

        // List of Doubles
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);	
        System.out.println("\nDouble List:");
        printlist(doubleList);
	}

}
