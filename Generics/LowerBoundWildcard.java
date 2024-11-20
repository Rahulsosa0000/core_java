package com.Generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcard {
	
	public static void addNumbers(List<? super Integer> list) {
	    list.add(1);
	    list.add(2);
	}

	public static void main(String[] args) {
	    List<Number> numList = new ArrayList<>();
	    addNumbers(numList);
	    
	    System.out.println(numList);
	    
	}


}
