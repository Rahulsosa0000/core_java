class Animal {
    void sound() throws Exception {
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog is barking");
        throw new NullPointerException("Dog sound is null");
    }
}

class Cat extends Animal {
    void sound() throws Exception {
        System.out.println("Cat is meowing");
        throw new Exception("Cat sound exception");
    }
}

public class ExceptionwithMethodoverride {

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        try {
            myDog.sound();
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            myCat.sound();
        } catch (Exception a) {
            System.out.println("Caught exception: " + a.getMessage());
        }
    }
}
