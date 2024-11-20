package com.annotation;

@FunctionalInterface  //only have one abstract method in functional Interface 
interface Shape {
	void circle();
	//void triangle();
}

public class FuntionalInterface {
	public static void main(String[] args) {
		
		Shape s=new Shape() {

			@Override
			public void circle() {
				System.out.println("this is a circle shape");
				
			}
			
			
		};
		s.circle();
		
	}

}
