package com.multithreding.synchronization;

class Bank extends Thread{   // class level lock 
	
	 static int bal=50000;
	  static int withdraw;
	
	Bank(int withdraw){
		this.withdraw=withdraw;
	}
	
	public static synchronized void Withdraw() {
		if(withdraw<=bal) {
			System.out.println(Thread.currentThread().getName()+" Withdraw Money.");
			bal=bal-withdraw;
		}else { 
			System.out.println("Insufficient Balance..!"+" "+Thread.currentThread().getName());
		}
	}
	
	@Override
	public void run() {
		Withdraw();
	}

}

public class StaticSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank(50000);  // one lock
		
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		
		t1.setName("Rakesh");
		t2.setName("Ravi");
		
         Bank b2=new Bank(50000);  // one lock
		
		Thread t3=new Thread(b2);
		Thread t4=new Thread(b2);
		
		t3.setName("Nirav");
		t4.setName("Nayan");
         
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		


	}

}
