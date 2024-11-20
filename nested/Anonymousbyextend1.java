package com.nested;

public class Anonymousbyextend1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=new Thread() {
			
			public void run() {
				System.out.println("This is child Thread");
			}
			
		};
		t.start();
		
		
		System.out.println("This main Thread");

	}

}
