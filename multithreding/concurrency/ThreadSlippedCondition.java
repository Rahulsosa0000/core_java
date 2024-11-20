package com.multithreding.concurrency;

/*
 * A slipped condition occurs in multithreading when a thread checks a condition, but before it can act on it, 
 * another thread changes the condition. This causes the first thread to act on outdated information,
 * leading to unexpected or incorrect behavior.
 *  
 *  Example:-Thread A checks if the counter is 0 and plans to do some work based on that. 
 *  But just as it’s about to start, Thread B changes the counter to 1. 
 *  Now, Thread A’s plan is based on the old state (0), but the counter is actually 1, 
 *  so its work doesn’t turn out correctly.
 *  
 *  to avoid this use Synchronization block 
 */


class Bus implements Runnable {

    int available_seat = 2;
    int passenger;

    Bus(int passenger) {
        this.passenger = passenger;
    }

    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName() + " trying to reserve " + passenger + " seat");
        if (available_seat >= passenger) {
            System.out.println(Thread.currentThread().getName() + " reserved seat");
            available_seat = available_seat - passenger;
            System.out.println("Available seats after reservation: " + available_seat);
        } else {
            System.out.println("Sorry, not enough seats available for " + Thread.currentThread().getName());
        }
        
        try { Thread.sleep(50); 
        } 
        catch (InterruptedException e) {
        	}
    }
}

public class ThreadSlippedCondition {

    public static void main(String[] args) {

        Bus b = new Bus(1);

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);

        t1.setName("Raju");
        t2.setName("Shyam");
        t3.setName("Babu");

        t1.start();
        t2.start();
        t3.start();
    }
}
