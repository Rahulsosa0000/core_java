public class Methodoverloading {

    
    int c=0;

    public int cal(int a,int b){
        return c=a+b;
    }

    public int cal(int a,int b,int c){
        return c=a+b+c;
    }
     public float cal(float a, float b){
        return a+b;
     }

    public static void main(String[] args) {
        Methodoverloading mo=new Methodoverloading();
        System.out.println(mo.cal(10, 20));
       System.out.println( mo.cal(10, 20, 30));
       System.out.println(mo.cal(10.20f, 20.10f));

    }
    
}
