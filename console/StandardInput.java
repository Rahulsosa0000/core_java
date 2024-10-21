package com.console;

import java.util.Scanner;

public class StandardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name:-");
		
		String name=sc.nextLine();
		
		System.out.println("Hello"+" "+name);
		
		sc.close();

	}

}
