package com.annotation;

/*The @SafeVarargs annotation can only be used with final, static, or private methods or constructors.
This is because these three types of methods or constructors cannot be overridden in a subclass.
This ensures that varargs (variable arguments) are used safely.
 * 
 */

public class Safevarargs {
    //@SafeVarargs
    @SafeVarargs
	private static <T> void printItems(T... items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        printItems("apple", "banana", "cherry");  // Output: apple banana cherry
    }
}
