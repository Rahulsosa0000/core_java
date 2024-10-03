public class Throwskeyword {

    public static void main(String[] args) {
try{        int ans =divideNumbers(10, 0);
        System.out.println(ans);
        
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    try{

        String str=printStringLength(null);
        System.out.println(str);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }

    }
        

    static int divideNumbers(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Not divisable  y 0");
        }
        int result = a / b;
        return result;
    }

    static String printStringLength(String str) throws NullPointerException {
        if(str.equals(null)){
            throw new NullPointerException("NULL poite eocceu");
        }
        
        String result=str.toLowerCase();
        return result;
    }
}
