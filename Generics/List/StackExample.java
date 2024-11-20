package com.Generics.List;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Stack to store Character type objects
        Stack<Character> stack = new Stack<>();

        // Pushing elements into the Stack
        stack.push('A');
        stack.push('B');
        stack.push('C');

        // Accessing elements using pop (LIFO)
        System.out.println("Top element: " + stack.pop()); // C
        System.out.println("Next element: " + stack.pop()); // B
        
        

    }
}
