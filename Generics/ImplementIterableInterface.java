package com.Generics;

/*Iterable ka use aapke custom collections ko asaani se iterate karne mein madad karta hai,
 *  readability badhata hai aur Java ke collection utilities ke saath compatibility bhi provide karta hai.
 * 
 * Why use Iterable:
By implementing Iterable, you allow your custom collection to be used in the for-each loop, 
which makes the code cleaner and easier to read. Instead of manually managing the iteration, 
the for-each loop handles it for you.
 * 
 * Implementing this interface allows an object to be the target of the enhanced for statement 
 * (sometimes called the "for-each loop" statement).
 */

import java.util.Iterator;

class NumberCollection implements Iterable<Integer> {
    private int[] numbers;  // Array to hold integers

    // Constructor to initialize the numbers array
    public NumberCollection(int[] numbers) {
        this.numbers = numbers;
    }

    // Implementing iterator() method to return an iterator
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;  // Index to track the current position

            //hasNext(): Returns true if there are more numbers to iterate through, otherwise false.
            @Override
            public boolean hasNext() {
                return index < numbers.length;  // Check if there are more numbers
            }
            //next(): Returns the current number and then moves to the next index in the array.
            @Override
            public Integer next() {
                return numbers[index++];  // Return the current number and increment the index
            }
        };
    }
}

public class ImplementIterableInterface {
    public static void main(String[] args) {
        // Create an instance of NumberCollection with some numbers
        NumberCollection collection = new NumberCollection(new int[]{10, 20, 30, 40, 50});

        // Use for-each loop to iterate over the collection
        for (int num : collection) {
            System.out.println(num);  // Print each number
        }
    }
}

/*
 * First Iteration in For-Each Loop:

Step 1: The hasNext() method is called to check if there are more elements in the array:
Current index: 0
hasNext() returns true because index < numbers.length (0 < 5).
Step 2: The next() method is called to get the next element:
Current index: 0
The value 10 (at index 0) is returned.
The index is incremented to 1.
The output for this iteration is 10
 */

