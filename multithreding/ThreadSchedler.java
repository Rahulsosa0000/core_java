package com.multithreding;

public class ThreadSchedler extends Thread {
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=1000;i++) {
			System.out.println(Thread.currentThread().getName()+"- Priority: " + Thread.currentThread().getPriority() + " - Count: " + i);
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadSchedler t1=new ThreadSchedler();
		ThreadSchedler t2=new ThreadSchedler();
		ThreadSchedler t3=new ThreadSchedler();
		
		t1.setPriority(MIN_PRIORITY);  // Set to minimum priority (1)
		t2.setPriority(NORM_PRIORITY); // Set to normal priority (5)
		t3.setPriority(MAX_PRIORITY);  // Set to maximum priority (10)
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
