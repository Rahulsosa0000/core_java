public class Callvalue {
    public static void main(String[] args) {
        int num=10;
        chagevalue(num);
        System.out.println("actual value:-"+num);
    }

    static void chagevalue(int n){
        n=20;
        System.out.println("change value:-"+n);
    }
}
