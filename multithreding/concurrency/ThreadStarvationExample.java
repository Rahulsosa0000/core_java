package com.multithreding.concurrency;
/*
 * **Thread starvation** happens when a thread keeps waiting because other threads are always using the resources it needs. 
 * This makes the thread "starve," as it can’t finish its task because it never gets a turn.
 * 
 * Example Scenario in Java
   Suppose there are three threads:

Thread A and Thread B are high-priority threads that keep running.
Thread C is a low-priority thread that rarely gets a chance to run.
 * 
 */
class HighPriorityThread extends Thread {
    public HighPriorityThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY); // Set maximum priority
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(getName() + " is running");
            try {
                Thread.sleep(2000); // Short sleep to simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class LowPriorityThread extends Thread {
    public LowPriorityThread(String name) {
        super(name);
        setPriority(Thread.MIN_PRIORITY); // Set minimum priority
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(getName() + " is running (trying to get a chance)");
            try {
                Thread.sleep(2000); // Short sleep to simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadStarvationExample {
    public static void main(String[] args) {
        // Create two high-priority threads
        Thread highPriority1 = new HighPriorityThread("HighPriorityThread-1");
        Thread highPriority2 = new HighPriorityThread("HighPriorityThread-2");

        // Create one low-priority thread
        Thread lowPriority = new LowPriorityThread("LowPriorityThread");

        // Start all threads
        highPriority1.start();
        highPriority2.start();
        lowPriority.start();
    }
}
