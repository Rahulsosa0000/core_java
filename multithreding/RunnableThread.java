package com.multithreding;
//Cleaner code separation,
//Using Runnable separates the task from thread management, allowing for better reusability and flexibility. 
//It also integrates easily with thread pools, improving resource efficiency and performance.

class Num implements  Runnable {
	
	public void run() {
		try {
		for (int i = 1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+i);
			Thread.sleep(1000);
		}
		}catch(Exception e) {
			
		}
	}
}

public class RunnableThread {
	public static void main(String[] args) {
		Num n=new Num();
		Thread t1=new Thread(n);
		t1.start();
		
	}

}
