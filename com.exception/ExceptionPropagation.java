public class ExceptionPropagation {
    public static void main(String[] args) {
        
        ExceptionPropagation ep=new ExceptionPropagation();
        ep.meth3();
        System.out.println("Exception find");


    }
    public void meth3(){
        meth1();
        meth2();
    }

    public void meth2(){
        try{
            String str=null;
            System.out.println(str.toLowerCase());
        }catch(NullPointerException n){
            System.out.println(n.getMessage());
        }
    }

    public void meth1(){
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }catch(ArithmeticException a){
            System.out.println(a.getMessage());
        }

    }
    
}
