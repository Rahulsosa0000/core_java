public class Nestedtry {
    public static void main(String[] args) {
        
    

    try{
        int a=10;
        int b=0;

        

        try{
            int arr[] = {1, 2, 3, 4};
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException arr){
            System.out.println("ArrayindexBoundexception"+a);

           
        }
        try{
            String nullString = null;
            System.out.println(nullString.length());
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
                int c=a/b;
                System.out.println(c);
                
    }catch(NullPointerException n){
        System.out.println(n.getMessage());
    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
    finally{
        System.out.println("finally always run");
    }
    
}
}