class OuterClass {
    static String staticOuterField = "Static Outer Field";
    int a =5;
    static class StaticNestedClass {
        void display() {
            System.out.println("Accessing: " + staticOuterField);
            // System.out.println(a);  we can access only static member 
        }
    }
}

public class Staticnestedclass {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();  // Output: Accessing: Static Outer Field
    }
}
