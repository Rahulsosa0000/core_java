package com.annotation;

 class Deprecatads {

    // Marking this method as deprecated
    @Deprecated
    public void oldMethod() {
        System.out.println("This is an old method.");
    }

    public void newMethod() {
        System.out.println("This is a new method.");
    }
 }
  public class DeprecatadAndSurpress {

    @SuppressWarnings("deprecation")  // Suppresses deprecation warning for the entire main method
    public static void main(String[] args) {
        Deprecatads example = new Deprecatads();

        // Using the deprecated method
        example.oldMethod();  // No compile-time warning here now due to SuppressWarnings

        // Using the new method (no warnings)
        example.newMethod();
    }
}
