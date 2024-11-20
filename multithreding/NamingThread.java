package com.multithreding;

public class NamingThread extends Thread {
	
	public void run() {
		try {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			Thread.sleep(1000);
		}
		}catch(Exception i) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamingThread t1=new NamingThread();
		NamingThread t2=new NamingThread();
		NamingThread t3=new  NamingThread();
		
		t1.setName("Thread-1 execute");
		t2.setName("Thread-2 execute");
		t3.setName("Thread-3 execute");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
