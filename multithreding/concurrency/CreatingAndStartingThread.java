package com.multithreding.concurrency;

public class CreatingAndStartingThread implements Runnable {
	
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000); // Pause for 1 second
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("Thread finished: " + Thread.currentThread().getName());
    }
    

    public static void main(String[] args) {
        CreatingAndStartingThread myRunnable = new CreatingAndStartingThread();
        Thread thread = new Thread(myRunnable);
        thread.start(); // Start the thread, which will call the run method of MyRunnable
    }
}
