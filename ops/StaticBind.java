class animal
{
    static void sound(){
        System.out.println("Animal making Sound...");
    }
}
class dog extends animal{
    static void sound(){
        System.out.println("Dog is Barking..");
    }
}
public class StaticBind {

    public static void main(String[] args) {
        animal a=new dog();
        a.sound();  // we can not override dog class in static binding
        dog d=new dog();
        d.sound();
    }
    
}
