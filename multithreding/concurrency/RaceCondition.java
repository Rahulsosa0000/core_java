package com.multithreding.concurrency;

/*
 * A race condition occurs when two or more threads access shared data and they try to change it at the same time. 
 */

class Counter{
	int count;
	public  void increment() { // synchronized
		count++;
	}
	
}

public class RaceCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c=new Counter();

		Runnable obj1=()->{
			for(int i=1;i<=10000;i++) {
				c.increment();
			}
		};

		Runnable obj2=()->{
			for(int i=1;i<=10000;i++) {
				c.increment();
			}
		};

		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
		 try {
	            t1.join();  // Waits for t1 to die (finish execution)
	            t2.join();  // Waits for t2 to die (finish execution)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println(c.count); 
	
		
		

	}

}
