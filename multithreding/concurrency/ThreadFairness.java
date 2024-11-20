package com.multithreding.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class FairTask implements Runnable {
    private static final Lock lock = new ReentrantLock(true); // Fair lock
    /*
     * Thread fairness in Java is about making sure all threads get a fair chance to access resources and complete their tasks.
     * In a fair system, no thread is left waiting for too long, and each thread eventually gets a turn,
     * avoiding issues like starvation, where some threads are blocked indefinitely.
     * 
     * 
     * Lock and ReentrantLock: These are Java classes used for handling locks. 
     * Locks are like keys that ensure only one thread can access a resource at a time. 
     * ReentrantLock is a type of lock that allows a thread to lock itself repeatedly if needed.
     */

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " is working...");
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
            }
        }
    }
}

public class ThreadFairness {
    public static void main(String[] args) {
        Thread t1 = new Thread(new FairTask(), "Thread-1");
        Thread t2 = new Thread(new FairTask(), "Thread-2");
        Thread t3 = new Thread(new FairTask(), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

