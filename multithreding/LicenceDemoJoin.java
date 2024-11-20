package com.multithreding;


class MedicalTest extends Thread {
	public void run() {
		
		try {
			System.out.println("Medical Started..");
			Thread.sleep(2000);
			System.out.println("Medical Completed");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}

class Drivingtest extends Thread {
	public void run() {
		
		try {
			System.out.println("Divingtest Started..");
			Thread.sleep(2000);
			System.out.println("Divingtest Completed");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}

class OfficerSign extends Thread {
	public void run() {
		
		try {
			System.out.println("Officer sign..");
			Thread.sleep(2000);
			System.out.println("Officer Completed");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}




public class LicenceDemoJoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MedicalTest t1=new MedicalTest();
		t1.start();
		t1.join();
		
		Drivingtest t2=new Drivingtest();
		t2.start();
		t2.join();
		
		OfficerSign t3=new OfficerSign();
		t3.start();
		t3.join();

		
		
		
		

	}

}
