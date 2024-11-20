package com.multithreding.interthread;

class TotalEarning  extends Thread{
	int total=0;
	@Override
	public void run() {
		synchronized (this) {
			
			for(int i=1;i<=10;i++) {
				total=total+100;
			}
			this.notify();   // this will lock release 
		}
	}
}


public class InterThreadCommunication {
	
	public static void main(String[] args) throws InterruptedException {
		
		TotalEarning t1=new TotalEarning();
		t1.start();
		//System.out.println("Total Earning:-"+t1.total);
		
		synchronized (t1) {
			t1.wait();
		}
		System.out.println("Total Earning:-"+t1.total);

		
	}
}
