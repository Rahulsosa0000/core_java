abstract class animal{
    abstract void sound();
}
 class lion extends animal{
    void sound(){
  System.out.println("Lion is Roaring..");
    }
 }
class dog extends animal{
    void sound(){
        System.out.println("dog is barking..");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        lion l=new lion();
        l.sound();
        dog d=new dog();
        d.sound();
        
    }
    
}
