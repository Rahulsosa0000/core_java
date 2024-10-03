public class MultiCatchBlock {

    public static void main(String[] args) {

        try {
            int arr[] = {10, 20, 30, 40};

            // This will throw arrayIndexOutOfBoundsException
            System.out.println(arr[4]);  //  index 4 is out of bounds for length 4

            // This will throw arithmeticException
            int a = 10;
            int b = 0;
            int c = a / b;  // can not Division by zero
            System.out.println(c);

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Array index Out of bound Exception: " + a);
            
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        }
    }
}
