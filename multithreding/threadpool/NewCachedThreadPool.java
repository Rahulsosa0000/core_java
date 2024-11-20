package com.multithreding.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor=Executors.newCachedThreadPool();

		for (int i = 1; i<=100; i++) {
			
			int requestid=i;
			executor.execute(()->{
				System.out.println("- Request Handling: "+requestid +" on " +Thread.currentThread().getName());
				
				try {
					//long processtime= (long)(Math.random()*1000);
					
					Thread.sleep(2000);
					
					System.out.println("- Request: "+requestid + " Completed By "+Thread.currentThread().getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			});
			
		}
		
		executor.shutdown(); // Initiates an orderly shutdown
        System.out.println("Submitted all requests.");
		
	}

}
