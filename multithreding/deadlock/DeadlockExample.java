package com.multithreding.deadlock;
/*
 * A deadlock is a situation in multithreading where two or more threads are waiting for each other’s resources,
 *  causing them to stop indefinitely and never finish their tasks.
 *  Deadlock ek aisi situation hai jo multithreading mein hoti hai jab do ya zyada threads ek dusre ke resources ka 
 *  intezar karte hain, aur is wajah se woh ruk jaate hain aur kabhi complete nahi hote.
 */

public class DeadlockExample {
    private static Object Lock1 = new Object();  // lock ordering follow to avoid deadlock 
    private static Object Lock2 = new Object();

    private static class ThreadDemo1 extends Thread {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                
                try { Thread.sleep(10); } catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for lock 2...");
                
                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 and lock 2...");
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                
                try { Thread.sleep(10); } catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for lock 1...");
                
                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding lock 2 and lock 1...");
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        T1.start();
        T2.start();
    }
}

