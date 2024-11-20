package com.multithreding;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MultipleTaskUseAnnonymoesImpleRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable countdowntask = new Runnable() {
			
			@Override
			public void run() { // one method (functional Interface)
				
				for(int i=10;i>0;i--) {
					System.out.println(Thread.currentThread().getName()+"- Countdown: "+i);
					try {
						Thread.sleep(1000);
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
                System.out.println("Countdown complete");
			}
		};
		
		Runnable TimeDisplayTask =new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
				for(int i=0;i<=10;i++) {
					Date date=new Date();
					System.out.println(Thread.currentThread().getName()+"- Current Time: "+sdf.format(date));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		
		Runnable alaramTask = new  Runnable() {
			
			public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println(Thread.currentThread().getName() + " - Alarm: Wake up!");
                    try {
                        Thread.sleep(3000); // Pause for 3 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
		};
		
		Thread t1=new Thread(countdowntask);
		Thread t2=new Thread(TimeDisplayTask);
		Thread t3=new Thread(alaramTask);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
