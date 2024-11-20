package com.multithreding;

public class ThredExample_1 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println("thread_1"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThredExample_1 t = new ThredExample_1();
		t.setName("Thread-1");
		t.start();
		
 		System.out.println("Main THREAD:"+Thread.currentThread().getName());

	}

}
