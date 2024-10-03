class car{
    String name;
    int price;
    {
        name="Kia";
        price=800000;
        System.out.println("Instance Block executed");

    }
    car(){
        System.out.println("Constructor execute");
    }

    void display(){
        System.out.println("Car name:-"+name);
        System.out.println("Car Price:-"+price);
    }
}

public class instance {
    public static void main(String[] args) {
        car c=new car();
        c.display();
    }
    
}
