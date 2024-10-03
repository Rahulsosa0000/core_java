class abcd{
    public int sum(int a, int b){
        return a+b;
    }
}
public class ClassandObject{

    public static void main(String[] args) {
        abcd obj = new abcd();
        System.out.println(obj.sum(11,21));
        System.out.println("Hello");
    }
}