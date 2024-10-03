  class animal {
     void sound(){
        System.out.println("animal sound....");
    }
  }

  class dog extends animal{
     void sound(){
        System.out.println("Dog is barking");
    }
  }

  class cat extends animal{
     void sound(){
        System.out.println("cat is meow");
    }
  }

public class InheritenceIsa {
    
    public static void main(String[] args) {
        animal d=new dog();
        animal c=new cat();
        d.sound();
        c.sound();   
    }
    
    
}
