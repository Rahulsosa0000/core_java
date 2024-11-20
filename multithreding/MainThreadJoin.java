package com.multithreding;


public class MainThreadJoin extends Thread {
	
	static Thread t;
	
    public void run() {
    	try {
    		t.join();
    	for(int i=1;i<=5;i++) {
			 System.out.println(Thread.currentThread().getName()+"- Number: "+i);
			Thread.sleep(1000);
		 }
    	}catch(Exception e) {
    		
    	}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		 t=currentThread();
		
		MainThreadJoin t1=new MainThreadJoin();
		t1.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
