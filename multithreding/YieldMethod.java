package com.multithreding;

//if you want stop current executing thread & give a chance to other thread for execution then use yield() method 

//Thread provides the hint to the thread scheduler then it depend on thread scheduler to accept or ignore the hint.

class Demo extends Thread {

	@Override
	public void run() {
		Thread.yield();

		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
			
		}
		
	}
}

public class YieldMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo t=new Demo();
		t.start();

		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread-"+i);
			
		}
	}

}
