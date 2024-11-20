package com.annotation;

// used to provide extra information about program.annotation provides metadata to class,methods,variable....

class A{
	
	public void show() {
		
		System.out.println("this is a class A");
	}
}

class B extends A{
	
	//@Override @Override: Tells the compiler that a method is overriding a method from the superclass. 
	//(same method not found in that case this is tell and give warnings) 
	
	public void show() {
		
	   System.out.println("This is  a class  B");
	}
	
	@Deprecated
	public void sum(int a,int b) {
		
		System.out.println(a+b);
	}
	
	
	
}
public class AnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b= new  B();
		b.show();
		
		b.sum(10, 20);
		
		
	}

}
