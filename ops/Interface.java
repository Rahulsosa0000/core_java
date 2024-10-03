interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    double div(int a, int b);
}

class SimpleCalculator implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        return a/b;
}
}

public class Interface {

    public static void main(String[] args) {
        Calculator calculator = new SimpleCalculator();
        
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.sub(10, 5));
        System.out.println("Multiplication: " + calculator.mul(10, 5));
        System.out.println("Division: " + calculator.div(10, 5));
    }
}

