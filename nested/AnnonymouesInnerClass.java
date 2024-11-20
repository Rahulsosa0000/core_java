package com.nested;
/*
 * 3. anonymous inner class: - An anonymous inner class in Java is a class without 
 * a name that is created on the spot to quickly provide a specific implementation of 
 * an interface or abstract class. It’s used when you need a one-time object with custom behavior,
 * typically in a single-use situation like an event listener. 
 */

interface Greeting {
    void sayHello();
}

public class AnnonymouesInnerClass {
    public static void main(String[] args) {
        // Creating an anonymous inner class implementing Greeting interface
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from an anonymous inner class!");
            }
        };
        
        // Calling the method of the anonymous inner class
        greet.sayHello();
    }
}
