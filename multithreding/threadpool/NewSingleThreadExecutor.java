package com.multithreding.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newSingleThreadExecutor();

		for (int i = 1; i <= 10; i++) {
			int taskId = i;

			executor.execute(() -> {

				System.out.println("Task " + taskId + " is running on: " + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
					System.out.println("Task "+ taskId +" Complated "+ Thread.currentThread().getName());
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			});
		}
		
        executor.shutdown(); 

	}

}
