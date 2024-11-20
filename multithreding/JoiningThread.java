package com.multithreding;

//if a thread wants to wait for another thread to  it task we should use join() method.  



public class JoiningThread extends Thread {
	
    public void run() {
    	
    	for(int i=1;i<=5;i++) {
			 System.out.println(Thread.currentThread().getName()+"- Number: "+i);
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t=currentThread();
		
		JoiningThread t1=new JoiningThread();
		t1.start();
		t1.join();

		
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
