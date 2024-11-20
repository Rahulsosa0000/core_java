package com.multithreding;

public class ThreadLifeCycle extends Thread {
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("RUNNING");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThreadLifeCycle t=new ThreadLifeCycle();//new state
		System.out.println(t.getState());
		 
		t.start();// Runnable State
		System.out.println(t.getState());
		Thread.sleep(100);
		System.out.println(t.getState());
		t.join(); // first thread wait 
		System.out.println(t.getState());

	}

}
