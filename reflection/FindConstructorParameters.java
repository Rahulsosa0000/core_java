package com.reflection;

import java.lang.reflect.Constructor;

class Dogs {
    private String name;
    private int age;

    // Constructor with one parameter (String)
    public Dogs(String name) {
        this.name = name;
    }

    // Constructor with two parameters (String, int)
    public Dogs(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Cats{
    private String name;
    private int age;

    // Constructor with one parameter (String)
    public Cats(String name) {
        this.name = name;
    }

    // Constructor with two parameters (String, int)
    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class FindConstructorParameters {

    public static void main(String[] args) {
        try {
            // Load the class dynamically
            Class<?> clazz = Class.forName("com.reflection.Dogs");  // Or change it to Cat

            // Get all constructors of the class (including private and protected)
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();

            // Print each constructor and its parameters
            for (Constructor<?> constructor : constructors) {
                System.out.print("Constructor: ");
                
                // Get parameter types for the constructor
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                
                // Print the parameter types
                for (Class<?> paramType : parameterTypes) {
                    System.out.print(paramType.getSimpleName() + " "); //give simple name parameter
                }
                System.out.println();  // New line after each constructor
            }
            
            System.out.println("\n\nGetting parameter types of each constructor");
            for (Constructor<?> con : constructors) {
                Class<?>[] parameterTypes = con.getParameterTypes();

                for (Class<?> c1 : parameterTypes) {
                    System.out.print(c1.getName() + " ");
                }
                System.out.println();
                   
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
