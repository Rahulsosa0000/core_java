package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> fruits=new HashMap<>();
		
		// map store sccrdding key -value pair and does not maintain order
		//map underline datastructure is hashtable 
		fruits.put(1, "Apple");
		fruits.put(2, "Banana");
		fruits.put(3, "Mango");
		fruits.put(3, "Mango");// duplicate key is not allowed 
		fruits.put(4, "Mango");//value dupplicate is allowed
		fruits.put(42, "Mango");
		fruits.put(14, "Mango");
		fruits.put(44, "Mango");
		fruits.put(45, "Mango");
		fruits.put(64, "Mango");
		fruits.put(64, "Mango");
		fruits.put(42, "Mango");
		
		System.out.println(fruits);// not follow order or unorder
		
		
		
		for(Map.Entry<Integer, String> me: fruits.entrySet()) {
	    	System.out.println("Key:-"+me.getKey()+ " "+"Value:-"+me.getValue());

		}

		
		System.out.println("fruits:"+fruits);
		
		System.out.println(fruits.containsKey(1)); // key is contain it return boolean value
		
		System.out.println(fruits.containsValue("Apple")); // value is contain it return boolean value
		
	    System.out.println(fruits.isEmpty()); // if empty it return boolean value
	    
	    System.out.println(fruits.remove(4));// remove acording key in map
	    
	    
	    // using iterator
	    System.out.println("Iterate Map........");
	    Iterator<Map.Entry<Integer,String>> itr;
	    
	    itr=fruits.entrySet().iterator();
	    
	    while(itr.hasNext()) {
	    	Map.Entry<Integer, String> entry=itr.next();
	    	System.out.println("Key:-"+entry.getKey()+ " "+"Value:-"+entry.getValue());
	    }
	    

		

	}

}
