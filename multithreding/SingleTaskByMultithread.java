package com.multithreding;

public class SingleTaskByMultithread implements Runnable{
	
	 int start;
	 int end;

	public SingleTaskByMultithread(int start, int end) {
		this.start = start;
        this.end = end;
	}
	
	@Override
	public void run() {
		for(int i=start;i<=end;i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);

		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1=new Thread(new SingleTaskByMultithread(1, 10));
		Thread t2=new Thread(new SingleTaskByMultithread(11, 20));
		Thread t3=new Thread(new SingleTaskByMultithread(21, 30));
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");

		t1.start();
		t2.start();
		t3.start();

	}

	

}
