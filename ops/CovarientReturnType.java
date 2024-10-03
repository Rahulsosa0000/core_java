class  vehicle{
    String name;
    vehicle(String name){
        this.name=name;
    }
    vehicle getVehicle(){
        System.out.println("return vehicle.."+name);
        return new vehicle(name);
    }
}
class car extends vehicle{
    int price;
   public car (int price,String name){
        super(name);
        this.price=price;
    }
    car getVehicle(){
        System.out.println("Price:-"+price+" "+"carname:-" +name);
        return new car(price,name);
    }
}
public class CovarientReturnType {
    public static void main(String[] args) {
        car c=new car(100000,"tatanano");    
        c.getVehicle();
    }
    
}
