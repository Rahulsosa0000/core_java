

import java.util.Scanner;

class InvalidbalException extends Exception {
    InvalidbalException(String msg) {
        super(msg);
    }  
}

public class CustomeException {
    public static void main(String[] args) throws InvalidbalException {
        System.out.println("Enter the Balance");
        int AvailableBal = 5000;
        int bal = 0;

        Scanner sc = new Scanner(System.in);
        bal = sc.nextInt();  // This line can throw InputMismatchException
        
        if (AvailableBal < bal) {
            throw new InvalidbalException("Insufficient balance in account.");
        } else {
            bal=AvailableBal-bal;
            System.out.println(bal);
            System.out.println("Balance is withdrawn.");
        }

        
    }
}

