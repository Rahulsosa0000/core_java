public class ObjectClonning implements Cloneable {
    String name;
    int age;

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClonning obj1=new ObjectClonning();
        obj1.name="rahul";
        obj1.age=23;

        System.out.println(obj1.name);
        System.out.println(obj1.age);

        ObjectClonning obj2=(ObjectClonning)obj1.clone();

            System.out.println("Copy one object to another object");
        System.out.println(obj2.name);
        System.out.println(obj2.age);

    }

   
    
}
