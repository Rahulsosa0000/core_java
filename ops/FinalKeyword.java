class Vehicle {
    final int speed = 120;
    
    final void displaySpeed() {
        System.out.println("Speed Limit: " + speed);
    }
}

class Car extends Vehicle {
    void carType() {
        System.out.println("This is a car.");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        Car car = new Car();
        car.displaySpeed();
        car.carType();
    }
}
