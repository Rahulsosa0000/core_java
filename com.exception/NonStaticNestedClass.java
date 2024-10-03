class outerclass{
    private String outerfield="outerfield";

    class innerclass{
        void show(){
            System.out.println("Accessing:-"+outerfield);
        }
    }
}

public class NonStaticNestedClass {
    public static void main(String[] args) {
        outerclass oc=new outerclass();
        outerclass.innerclass inner=oc.new innerclass();
        inner.show();

        
    }
}
