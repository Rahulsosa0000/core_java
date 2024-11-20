package com.multithreding.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor=Executors.newFixedThreadPool(5); // creating Thread Pool 
		
/* Executors Method

		  Executors.newFixedThreadPool(5); 
		  Executors.newCachedThreadPool();
		  Executors.newSingleThreadExecutor();
		  
*/
		
		for(int i=1;i<=100;i++) {  // Thread 5 first complete after 5 complete
			
			executor.execute(() ->{
				System.out.println("Task Executed By: "+Thread.currentThread().getName());
				try {
					Thread.sleep(3000);
					System.out.println("Task Completed:-"+Thread.currentThread().getName());

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}

		executor.shutdown();

	}

}
