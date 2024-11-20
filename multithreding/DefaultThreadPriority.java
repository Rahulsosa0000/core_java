package com.multithreding;

public class DefaultThreadPriority {
    public static void main(String[] args) {
        // Create a new thread
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running..."+Thread.currentThread().getPriority() );
        });

        // Display the default priority of the new thread
       // thread.setPriority(10);
        System.out.println("Default priority of the thread: " + thread.getPriority()); // Should print 5 default (NORM_PRIORITY).

        // Start the thread
        thread.start();
    }
}
