package com.nested;
class OClass {
    // Nested interface inside OuterClass
    interface NestedInterface {
        void display();
    }
}

public class Nestediinterface {
    public static void main(String[] args) {
        // Creating an anonymous class implementing the nested interface
    	OClass.NestedInterface obj = new OClass.NestedInterface() {
            @Override
            public void display() {
                System.out.println("Hello from the nested interface!");
            }
        };
        
        obj.display();  // Output: Hello from the nested interface!
    }
}

