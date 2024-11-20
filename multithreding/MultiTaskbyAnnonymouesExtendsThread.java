package com.multithreding;

public class MultiTaskbyAnnonymouesExtendsThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// FIRST TASK
		Thread number = new Thread() {
			public void run() {

				for (int i = 1; i <= 50; i++) {
					System.out.println(Thread.currentThread().getName() + "-Number: " + i);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		};

		// second task

		Thread Message = new Thread() {

			public void run() {
				for (int i = 1; i <= 50; i++) {
					System.out.println(Thread.currentThread().getName() + "- Message: Hello world...");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		};

		number.start();
		Message.start();

	}

}
