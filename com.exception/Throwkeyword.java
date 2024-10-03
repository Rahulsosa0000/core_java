import java.util.Scanner;

public class Throwkeyword {

    public static void main(String[] args) {
        int age;
        System.out.println("Enter the age:-");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        if(age>=18){
            System.out.println("eligible for vote");
        }
        else{
            throw new ArithmeticException("not eligible for vote");
        }
        
    }
    
}
