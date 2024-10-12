package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<ArrayList> set=new HashSet<>();
		
		
		
		ArrayList<Integer> list1=new ArrayList<>();

		ArrayList<Integer> list2=new ArrayList<>();
		
		list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set.add(list1);
        set.add(list2);
        
        System.out.println(set); // it rempve duplicate in list
        
        
        HashSet<String> h = new HashSet<String>();
        //hashset follow hashtable 

        // Adding elements into HashSet
        // using add() method
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
 
        // Add duplicate elements
        h.add("India");

        System.out.println(h);
        System.out.println("List contains India or not:" + h.contains("India"));

        h.remove("Australia");
        System.out.println("List after removing Australia:" + h);
       
        System.out.println("_____________");
        System.out.println("Iterate list");
        
        Iterator<String> iterator;
        
        iterator=h.iterator();
        
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }




	}

}
