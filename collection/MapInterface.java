package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> fruits=new HashMap<>();
		fruits.put(1, "Apple");
		fruits.put(2, "Banana");
		fruits.put(3, "Mango");
		fruits.put(3, "Mango");// duplicate key is not allowed 
		fruits.put(4, "Mango");//value dupplicate is allowed

		
		System.out.println("fruits:"+fruits);
		
		System.out.println(fruits.containsKey(1)); // key is contain it return boolean value
		
		System.out.println(fruits.containsValue("Apple")); // value is contain it return boolean value
		
	    System.out.println(fruits.isEmpty()); // if empty it return boolean value
	    
	    System.out.println(fruits.remove(4));
	    

		

	}

}
