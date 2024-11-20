package com.multithreding;

public class SleepingThread extends Thread{
	
	public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle interruption if it occurs
            }
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepingThread t=new SleepingThread();
		t.start();
		
	}

}
