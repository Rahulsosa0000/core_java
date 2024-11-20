package com.reflection;

/*field reflection: - allows you to access and modify the fields (variables) of a class at runtime, 
 * even if you don't know the names or types of those fields at compile time. 
 * This is useful for cases where you need to inspect or manipulate an object's state dynamically. 
 */

import java.lang.reflect.Field;

class Car {
    private String make;
    private int year;

    // Constructor to initialize Car object
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    // Method to display the Car's details
    public void displayInfo() {
        System.out.println("Car Make: " + make + ", Year: " + year);
    }
}


public class ReflectionField {
    public static void main(String[] args) {
        try {
            // Step 1: Create a Car object
            Car car = new Car("Toyota", 2015);
            System.out.println("Before Reflection:");
            car.displayInfo(); // Output: Car Make: Toyota, Year: 2015

            // Step 2: Get the Class object for Car
            Class<?> carClass = car.getClass();

            // Step 3: Access the private field "make"
            Field makeField = carClass.getDeclaredField("make");// Dynamically call variable without to call directly
            makeField.setAccessible(true); // Allow access to private field

            // Step 4: Modify the "make" field
            makeField.set(car, "Honda");

            // Step 5: Access the private field "year"
            Field yearField = carClass.getDeclaredField("year");
            yearField.setAccessible(true); // Allow access to private field

            // Step 6: Modify the "year" field
            yearField.set(car, 2022);

            System.out.println("After Reflection:");
            car.displayInfo(); // Output: Car Make: Honda, Year: 2022

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
