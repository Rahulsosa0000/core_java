package com.multithreding.threadpool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledTask implements Runnable {
	private String taskName;
    private static final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");


	public ScheduledTask(String name) {
		this.taskName = name;
	}

	@Override
	public void run() {
//		System.out.println(taskName + " executed at: " + System.currentTimeMillis());
//		System.out.println(taskName + " executed at: " + new Date());
        System.out.println(taskName + " executed at: " + timeFormat.format(new Date()));


	}
}

public class ScheduledExecutorServiceExample {
	public static void main(String[] args) {

		// Create a ScheduledExecutorService with a pool of 1 thread
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

		// Task 1: Run once after a delay of 2 seconds
		scheduler.schedule(new ScheduledTask("One-time Task"), 5, TimeUnit.SECONDS); // 5 second delay after run 
		/*
		 * schedule() takes: new ScheduledTask("One-time Task"): the task to be
		 * executed. 2: the delay time before execution, in this case, 2 seconds.
		 * TimeUnit.SECONDS: specifies that the delay is in seconds.
		 */

		// Task 2: Run every 3 seconds with a fixed rate (from start to start)
		scheduler.scheduleAtFixedRate(new ScheduledTask("Fixed Rate Task"), 1, 4, TimeUnit.SECONDS); 
		
		// 1 sec after run and 4 sec delay  after run all take 4 sec delay 
		
		/*
		 * scheduleAtFixedRate() parameters: new ScheduledTask("Fixed Rate Task"): the
		 * task to be executed. 1: the initial delay before the first execution (1
		 * second). 3: the fixed rate interval between each start of the task (3
		 * seconds). TimeUnit.SECONDS: specifies seconds as the time unit.
		 * 
		 */

		// Task 3: Run repeatedly with a 2-second delay between the end of one run and
		// the start of the next
		scheduler.scheduleWithFixedDelay(new ScheduledTask("Fixed Delay Task"), 1, 2, TimeUnit.SECONDS); 
		// 1 sec after run and 2 sec delay after run all take 2 sec delay 

		/*
		 * scheduleWithFixedDelay() parameters: new ScheduledTask("Fixed Delay Task"):
		 * the task to be executed. 1: the initial delay before the first execution (1
		 * second). 2: the delay between each end of execution and the start of the next
		 * (2 seconds). TimeUnit.SECONDS: specifies seconds as the time unit.
		 */

		// Let the tasks run for 10 seconds before shutting down the scheduler
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/*
		 * long timestamp = 1731041351557L; Date date = new Date(timestamp);
		 * System.out.println("Execution Time: " + date);
		 */

		// Shut down the scheduler gracefully
		scheduler.shutdown();
	}
}
