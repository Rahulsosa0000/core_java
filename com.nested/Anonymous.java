interface Greeting {
    void sayHello();
}

public class Anonymous {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from the anonymous class!");
            }
        };

        // Calling the method of the anonymous class
        greeting.sayHello();  
    }
}
