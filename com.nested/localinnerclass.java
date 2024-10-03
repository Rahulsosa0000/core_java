class OuterClass {
    void display() {
        class InnerClass {
            void show() {
                System.out.println("Hello from local inner class");
            }
        }

        InnerClass inner = new InnerClass();
        inner.show();
    }
}

public class localinnerclass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.display();
    }
}
