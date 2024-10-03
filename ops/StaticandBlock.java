public class StaticandBlock {
    static String a;

    static {
        a = "This is Static variable assign";
        System.out.println("Static block execute:" + a);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed:" + a);
    }
}
