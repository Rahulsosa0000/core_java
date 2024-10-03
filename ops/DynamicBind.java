class vehicle {
    void run() {
        System.out.println("Vehicle is runnning");
    }
}

class car extends vehicle {
    void run() {
        System.out.println("Car is running.....");
    }
}

public class DynamicBind {
    public static void main(String[] args) {

        vehicle v = new car(); // we can overrride by using animal class in dynamic bind
        v.run();

    }
}
