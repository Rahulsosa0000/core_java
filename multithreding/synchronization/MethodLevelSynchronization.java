package com.multithreding.synchronization;

class Bus implements Runnable{

	int available_seat=2;
    int passenger;
	Bus(int passenger){
		this.passenger=passenger;
	}
	@Override
	public synchronized void run() {
		if(available_seat>=passenger) {  //1>=1  
			System.out.println(Thread.currentThread().getName()+" Reserved Seat");
			available_seat=available_seat-passenger;
			System.out.println("Available Seat: "+available_seat);
		}else {
			System.out.println("Sorry Seat not Available..");
		}
		
	}
	
}

public class MethodLevelSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus b=new Bus(1);
		
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		Thread t3=new Thread(b);
		
		t1.setName("Raju");
		t2.setName("Shyam");
		t3.setName("Babu");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
