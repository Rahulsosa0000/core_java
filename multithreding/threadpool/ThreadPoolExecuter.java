package com.multithreding.threadpool;
/*Thread Pool Executor Java mein ek aisa mechanism hai jo threads ka ek group ya "pool" banata hai
 *  aur unhe tasks execute karne ke liye use karta hai. Matlab, baar-baar naye threads create karne ke bajaye,
 *   pehle se hi kuch threads ready rakhta hai aur unhe repeatedly use karta hai.
 * 
 */
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecuter {

	public static void main(String[] args) throws InterruptedException {
		
		 try (ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 5, 6,
	                TimeUnit.SECONDS, new ArrayBlockingQueue<>(2))) {
			// submit six tasks
			for (int i = 0; i < 7; i++) {
			    threadPoolExecutor.submit(new Runnable() {
			        @Override
			        public void run() {  
			            System.out.println("This is worker thread " + Thread.currentThread().getName() + " executing");
			            try {
			                // simulate work by sleeping for 1 second
			                Thread.sleep(1000);
			                System.out.println(Thread.currentThread().getName()+" Complated");
			            } catch (InterruptedException ie) {
			                // ignore for now
			            }
			        }
			    });
			}
//
			threadPoolExecutor.shutdown();
		}

	       
	            System.out.println("Done...");
	           
	          
	        
	}

}
