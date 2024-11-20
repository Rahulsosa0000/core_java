package com.multithreding;


 class NumberPrint  extends Thread{
	 @Override
	 public void run() {
		 for(char i='A';i<='E';i++) {
			 System.out.println(Thread.currentThread().getName()+"- Alpha: "+i);
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
 }
 	

 class AlphaPrint  extends Thread{
	 @Override
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
 }
 

 class MessagePrint  extends Thread{
	 @Override
	 public void run() {
		 for(int i=1;i<=5;i++) {
			 System.out.println(Thread.currentThread().getName()+"- Message: hello world");
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
 }

public class MultipleTaskUseMultithread {
	
	
	public static void main(String[] args) {
		NumberPrint t1=new NumberPrint();
		AlphaPrint t2=new AlphaPrint();
		MessagePrint t3=  new MessagePrint();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
