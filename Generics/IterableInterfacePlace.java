package com.Generics;
/*
 * Iterable Interface: - The Iterable interface in Java is used to represent
 *  a collection of objects that can be iterated (traversed) one by one. By implementing the Iterable<T> interface, 
 * a class allows its objects to be used in a for-each loop (also known as the enhanced for loop). 
 * 
 * Why Use Iterable<T>? 
 *Simplifies Iteration: It allows your class to be used with the for-each loop. 
 *Customizable Iteration: You can provide your own iteration logic if needed. 
 *Standardized API: By implementing Iterable<T>, you follow a standard Java API that other developers will understand. 
 */
import java.util.Iterator;

class GenericCollection<T> implements Iterable<T> {
    private T[] items;  // Array to hold items of type T

    // Constructor to initialize the items array
    public GenericCollection(T[] items) {
        this.items = items;
    }

    // Implementing iterator() method to return an iterator
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;  // Index to track the current position

            // hasNext(): Returns true if there are more items to iterate through, otherwise false.
            @Override
            public boolean hasNext() {
                return index < items.length;  // Check if there are more items
            }

            // next(): Returns the current item and then moves to the next index in the array.
            @Override
            public T next() {
                return items[index++];  // Return the current item and increment the index
            }
        };
    }
}

public class IterableInterfacePlace {
    public static void main(String[] args) {
        // Create an instance of GenericCollection with Integer values
        GenericCollection<Integer> numberCollection = new GenericCollection<>(new Integer[]{10, 20, 30, 40, 50});

        // Use for-each loop to iterate over the collection
        System.out.println("Integer Collection:");
        for (int num : numberCollection) {
            System.out.println(num);
        }

        // Create an instance of GenericCollection with String values
        GenericCollection<String> stringCollection = new GenericCollection<>(new String[]{"Apple", "Banana", "Cherry"});

        // Use for-each loop to iterate over the collection
        System.out.println("\nString Collection:");
        for (String str : stringCollection) {
            System.out.println(str);
        }
    }
}
