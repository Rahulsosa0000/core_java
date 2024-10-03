
class shape {
    void draw(){
        System.out.println("Drawing a shape");
    }
}

class circle extends shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}

class rectangle extends shape{
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}

public class MethodOverride {

    public static void main(String[] args) {

        shape shape1=new circle();
        shape1.draw();
        shape shape2=new rectangle();
        shape2.draw();
        
    }
    
}
