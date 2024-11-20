package com.multithreding.concurrency;

class CounterExample {
    private int counter = 0; // Shared counter variable

    public synchronized void checkAndWork(String threadName) {
        // Thread checks if counter is 0
        if (counter == 0) {
            System.out.println(threadName + " counter is 0.");
            try {
                // Simulate some delay (slipped condition can happen here)
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
            // After delay, Thread A assumes counter is still 0 and tries to work
            System.out.println(threadName + " is now working with counter = " + counter);
        } else {
            System.out.println(threadName + " sees counter is not 0, it's " + counter + ". So it won't proceed.");
        }
    }

    public synchronized void changeCounter(String threadName) {  // synchronized avoid slipped condition 
        counter = 1; // Thread B changes the counter
        System.out.println(threadName + " changed counter to 1.");
    }
}

public class SlippedConditionExample {
    public static void main(String[] args) {
        CounterExample counterExample = new CounterExample();

        // Thread A checks the counter and works if it's 0
        Thread threadA = new Thread(() -> counterExample.checkAndWork("Thread A"));

        // Thread B changes the counter to 1
        Thread threadB = new Thread(() -> counterExample.changeCounter("Thread B"));

        // Start both threads
        threadA.start();
        threadB.start();
    }
}
