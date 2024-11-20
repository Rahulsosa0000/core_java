package com.multithreding.concurrency;
/*
Locks in Java are tools used in multithreading to control access to shared resources. 
They ensure that only one thread can access a particular resource at a time, 
which prevents issues like data inconsistency and race conditions.
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counters {
    private int count = 0;
    private final Lock lock=new ReentrantLock();
    
    public void increment() {
    	lock.lock(); // Acquire the lock
    	try {
    		count++;
            System.out.println("Count: " + count); // Print the updated count

    	}finally {
    		lock.unlock();
    	} // lock always released
    }
 
}

public class ThreadLocks {
    public static void main(String[] args) {
    	Counters c=new Counters();
    	
    	Thread t1 = new Thread(c::increment); //call
        Thread t2 = new Thread(c::increment);
        
        t1.start();
        t2.start();
    	
    }
}
