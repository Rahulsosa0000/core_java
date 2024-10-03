package com.collection;

import java.util.ArrayList;

public class Arrarylist {

	public static void main(String[] args) {
		// TODO Auto-generated method  
		
		ArrayList<Integer> list=new ArrayList<>();// arraylist best use case for searching by index
		
		list.add(10);
		list.add(20);
		list.add(30);  // add element in arraylist
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		list.remove(1); // remove 1 index number in list 
		
		System.out.println(list);
		
		
		System.out.println(list.get(1)); //get number in arraylist indexwise 
		
		System.out.println(list.isEmpty()); // it return boolean value check list is empty or not 
		
		System.out.println(list.size()); // it return size of arraylist in list
		
		System.out.println(list.getFirst()); // it return first value in list
		
		System.out.println(list.getLast());  // it will return last value in list
		
		System.out.println(list.removeFirst());// remove first in list 
		
		System.out.println(list.removeLast());  // remove last element in list
		
		System.out.println("_______");
		for(int i: list) {
			System.out.println(i);
		}
		
		
		
		

	}

}
