package com.multithreding;

/*which run in background of another thread 
 * example :- Garbage Collector, Word Spell Checker 
 * when another thread id dead , daemon thread is dead	
 */

public class DaemonThread {

	public static void main(String[] args) {

		Thread dt = new Thread() {
			public void run() { 

				try {
					while (true) {
						System.out.println("Daemon Thread is Running...");
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		};
		
		dt.setDaemon(true);
		dt.start();
		
		try {
			System.out.println("Main Thread is Running...");
			Thread.sleep(5000);
			System.out.println("Main Thread Finished..");
			//System.out.println(dt.isDaemon());
		}catch(InterruptedException i) {
			System.out.println(i);
		}
	}

}
