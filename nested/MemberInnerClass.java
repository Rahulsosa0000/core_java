package com.nested;

class OuterClass {
    private String outerField = "Hello from Outer Class"; //member(nested class)- inner class

    // Member Inner Class
    class InnerClass {
        void display() {
            // Accessing the outer class's field
            System.out.println(outerField);
        }
    }
}

public class MemberInnerClass {
    public static void main(String[] args) {
        // Creating an instance of OuterClass
        OuterClass outer = new OuterClass();
        
        // Creating an instance of InnerClass using the outer instance
        OuterClass.InnerClass inner = outer.new InnerClass();
        
        // Calling method of InnerClass
        inner.display();  // Output: Hello from Outer Class
    }
}
