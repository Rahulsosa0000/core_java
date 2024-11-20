package com.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
   @interface MyCustomAnnotation{
	String value();
}

public class CustomeAnnotation {
	
	@MyCustomAnnotation(value = "Test Annotation")
	
	public void show() {
		System.out.println("Method with Custom Annotation");
	}
	
	public static void main(String[] args) {
		try {
			MyCustomAnnotation annotation = CustomeAnnotation.class.getMethod("show")
					.getAnnotation(MyCustomAnnotation.class);
	        System.out.println("Annotation value: " + annotation.value());  

//	        Class<?> c= CustomeAnnotation.class;
//	        //Method[] methods=    c.getMethods();
//	        Method[] methods=    c.getDeclaredMethods();
//
//	        for(Method m: methods) {
//				System.out.println("Method Name: "+m.getName());
//			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
