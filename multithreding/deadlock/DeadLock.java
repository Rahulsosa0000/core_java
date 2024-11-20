package com.multithreding.deadlock;

/*
 * synchronized keyword is used to make the class or method thread-safe 
 * which means only one thread can have the lock of the synchronized method and use it,
 *  other threads have to wait till the lock releases and anyone of them acquire that lock. 
 */



public class DeadLock {
	
	/*
	 * These lines define two static objects,resource1 and resource2.
	 * These objects act as locks or resources that threads will try to acquire. 
	 * Being static, they belong to the class and are shared among all instances.
	 * 
	 */

	public static Object resource1 = new Object();
	public static Object resource2 = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(() -> {

			synchronized (resource1) {
				System.out.println("Thread 1: Locked Resource 1");
				
				/*
				 * The synchronized block locks resource1. //Only this thread (t1) can access
				 * the inside of this block while it holds the lock on resource1. //
				 */		
				
				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}

				synchronized (resource2) {
					System.out.println("Thread 1: Locked Resource 2");
				}

			}

		});

		Thread t2 = new Thread(() -> {
			synchronized (resource2) {
				System.out.println("Thread 2: Locked Resource 2");

				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}

				synchronized (resource1) {
					System.out.println("Thread 2: Locked Resource 1");
				}
			}
		});

		t1.start();
		t2.start();
		
		/*
		 * "Thread 1 needs resource2, which is locked by Thread 2,
		 *  and Thread 2 needs resource1, which is locked by Thread 1. We call this situation a deadlock."
		 */

	}

}
