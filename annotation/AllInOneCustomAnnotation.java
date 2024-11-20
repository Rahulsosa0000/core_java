package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) // this annotation tells our annotation is present at runtime 
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@interface Info{
	String author() default  "unknown" ;
	String date();
	String descrption() default "No description";
}

@Info(author = "Keyur",date = "12-08-24",descrption = "Product class holding product information") // class level annotation
public class AllInOneCustomAnnotation {

	 @Info(author = "Dilip", date = "22-10-24", descrption = "Product name") // Field level Annotation
	    private String name;
	 
	 @Info( date = "1-1-24", descrption = "Sets the product name")// Method level Annotation
	    public void setName(String name) {
	       this.name = name;
	    }
	 

	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            // Access the annotation on the class level
            Class<?> clazz = AllInOneCustomAnnotation.class;
            
            if (clazz.isAnnotationPresent(Info.class)) {
                Info classInfo = clazz.getAnnotation(Info.class);
                System.out.println("Class Annotation:");
                System.out.println("Author: " + classInfo.author());
                System.out.println("Date: " + classInfo.date());
                System.out.println("Description: " + classInfo.descrption());
                System.out.println();
            }
		
         // Access the annotation on the field level
            Field nameField = clazz.getDeclaredField("name");
            if (nameField.isAnnotationPresent(Info.class)) {
                Info fieldInfo = nameField.getAnnotation(Info.class);
                System.out.println("Field Annotation:");
                System.out.println("Author: " + fieldInfo.author());
                System.out.println("Date: " + fieldInfo.date());
                System.out.println("Description: " + fieldInfo.descrption());
                System.out.println();
            }

            // Access the annotation on the method level
            Method setNameMethod = clazz.getMethod("setName", String.class);
            if (setNameMethod.isAnnotationPresent(Info.class)) {
                Info methodInfo = setNameMethod.getAnnotation(Info.class);
                System.out.println("Method Annotation:");
                System.out.println("Author: " + methodInfo.author());
                System.out.println("Date: " + methodInfo.date());
                System.out.println("Description: " + methodInfo.descrption());
            }
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            e.printStackTrace();
        }

	}

}
