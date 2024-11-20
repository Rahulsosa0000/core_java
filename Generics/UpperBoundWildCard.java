package com.Generics;

import java.util.List;

public class UpperBoundWildCard {
	
	public static void printNumbers(List<? extends Number> list) { // Number
	    for (Number num : list) {
	        System.out.println(num);
	    }
	}

	public static void main(String[] args) {
	    List<Integer> intList = List.of(1, 2, 3);
	    //List<Double> doubleList = List.of(1.1, 2.2, 3.3);
	    
	    printNumbers(intList);    // Works with Integer list
	    //printNumbers(doubleList);  // Works with Double list
	}


}
