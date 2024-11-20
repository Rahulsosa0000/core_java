package com.nested;

interface Age{
	int age=21;
	void  getage();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Age obj=new Age() {

			@Override
			public void getage() {
				System.out.println("Age is:-"+age);
			}
			
		};
		obj.getage();
		

	}

}
