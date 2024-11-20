package com.multithreding;
/*if any thread is in sleeping state or blocked state then we can easily interrupt the execution of thread.
 * 
 */

class Test extends Thread {
	
	@Override
	public void run() {
	
		try {
		for (int i = 1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+i);
			
				Thread.sleep(1000);
			} 
		}catch (Exception e) {
			System.out.println("Thread is terminate!");
		}
		
	}
}

public class InterruptedMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1=new Test();
		
		t1.start();
		t1.interrupt();

	}

}
