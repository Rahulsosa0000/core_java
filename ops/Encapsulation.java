class a{
    private int value=0;
    
    public void setvalue(int x){
        value=x;
    }
    public int getvalue(){
        return value;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        a e=new a();
        e.setvalue(10000);
        System.out.println(e.getvalue());
    }
    
}
