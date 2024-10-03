package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkeList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits after adding: " + fruits);

        fruits.addFirst("Mango");
        System.out.println("Fruits after adding Mango at the front: " + fruits);

        fruits.add(2, "Orange");
        System.out.println("Fruits after adding Orange in the middle: " + fruits);

        fruits.removeLast();
        System.out.println("Fruits after removing the last fruit: " + fruits);

        fruits.remove("Banana");
        System.out.println("Fruits after removing Banana: " + fruits);

        System.out.println("First fruit: " + fruits.getFirst());
        System.out.println("Last fruit: " + fruits.getLast());

        System.out.println("Iterating over the fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
            
            
            
        }
        System.out.println("_______________");

        Queue<String> name=new LinkedList<>();
        
        name.add("rahul");
        name.add("keyur");
        name.add("dilip");
        name.add("denny");
        System.out.println("Add name:"+name);
       
        name.peek();// it queue is empty return null
        
        System.out.println(name.poll());// first element remove 
        
        
        
        }
}

