package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class FruitListIteratorExample {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");

		ListIterator<String> iterator;

		iterator = fruits.listIterator();

		System.out.println("Forward diraction..");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("backward diraction..");
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		System.out.println("add fruts...");
		 iterator = fruits.listIterator();
	        while (iterator.hasNext()) {
	            String fruit = iterator.next();
	            if (fruit.equals("Banana")) {
	                iterator.add("Orange");
	            }
	        }
	        System.out.println("add after banana."+fruits);
	        
	        System.out.println("Remove chery");
			 iterator = fruits.listIterator();

	        while(iterator.hasNext()) {
	        	String fruit=iterator.next();
	        	if(fruit.equals("Cherry")) {
	        		iterator.remove();
	        	}
	        }
	        System.out.println("After remove cherry..."+fruits);
	        
	        System.out.println("Update element");
	        iterator = fruits.listIterator();
	        while (iterator.hasNext()) {
	            String fruit = iterator.next();
	            if (fruit.equals("Date")) {
	                iterator.set("Dragonfruit");
	            }
	        }
	        System.out.println("List after updating Date: " + fruits);

	}
}
