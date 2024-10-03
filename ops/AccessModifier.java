class parent{
    public static String publicVar = "Public Variable";         // Accessible from anywhere
    private String privateVar = "Private Variable";      // Accessible only within Parent class
    protected String protectedVar = "Protected Variable";// Accessible within package and subclasses
    String defaultVar = "Default Variable";              // Accessible within the package

    public static void showpublic(){
        System.out.println("Public Method:-"+publicVar);
    }

    private void showprivate(){
        System.out.println("private method:-"+privateVar);
    }

   protected void showprotectedvar(){
    System.out.println("protected method:-"+protectedVar);
   }
   void defualtmethod(){
    System.out.println("defualt method:-"+defaultVar);
   }


}


class Child extends parent {
    public void accessParentMembers() {
        System.out.println(publicVar);     
        System.out.println(protectedVar);  
        System.out.println(defaultVar);    
        
        showpublic();     // Accessible
        // showPrivate(); // NOT accessible (private)
        showprotectedvar();  // Accessible
        defualtmethod();    // Accessible
    }

}



public class AccessModifier {
    public static void main(String[] args) {
        parent p=new parent();
        Child child = new Child();
        System.out.println(parent.publicVar);

        // System.out.println(parent.privateVar); // NOT accessible (private)
        // System.out.println(parent.protectedVar); // NOT accessible (protected, not subclass)
        // System.out.println(parent.defaultVar);   // NOT accessible (default)

        parent.showpublic();    // Accessible
        // parent.showPrivate(); // NOT accessible (private)
        // parent.showProtected(); // NOT accessible outside the package/subclass
        // parent.showDefault();   // NOT accessible (default)
        child.accessParentMembers(); // Will access Parent members through inheritance

    }
    
}


// 4 type of access modifier in java 
//1.private 2. protected 3. defualt 4. public