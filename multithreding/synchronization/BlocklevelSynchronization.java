package com.multithreding.synchronization;

class PrintTable {
	void showtable(int a) { // Synchronized method

		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(a * i);
				try {
					Thread.sleep(1000); // Sleep to simulate delay
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("COMPLETE");
			
		}
	}
}

     class Thread1 extends Thread {
	   PrintTable t; 

	  public Thread1(PrintTable t) {
		this.t = t;
	  }

	   @Override
	     public void run() {
		   t.showtable(2);
	  }
  }

    class Thread2 extends Thread {
	PrintTable t;

	public Thread2(PrintTable t) {
		this.t = t;
	}

	  @Override
	      public void run() {
		t.showtable(3);
	  }
    }

public class BlocklevelSynchronization {
	public static void main(String[] args) {
		PrintTable p = new PrintTable();
		Thread1 t1 = new Thread1(p); // Use Thread1
		Thread2 t2 = new Thread2(p); // Use Thread2
		t1.start();
		t2.start();
	}
}
