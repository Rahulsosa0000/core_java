public class Constructor {

    public Constructor(){
       System.out.println("This is Defualt Constructor");
    }

    public Constructor(int a,int b){
        System.out.println("This is parameterized Constructor");
    }

    public static void main(String[] args) {
        Constructor c=new Constructor();
        Constructor c1=new Constructor(10,20);

    }
    
}
