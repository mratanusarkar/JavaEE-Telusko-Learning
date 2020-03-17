package com.telusko;

public class ThreadLambda {
	
	public static void task0() {

	}
	
	public static void task1(int n, int  t) {
		for(int i=1; i<=n; i++) {
			System.out.println("Task 1");
			try {Thread.sleep(t); } catch(Exception e) {}
		}
	}
	
	public static void task2(int n, int  t) {
		for(int i=1; i<=n; i++) {
			System.out.println("Task 2");
			try {Thread.sleep(t); } catch(Exception e) {}
		}
	}
	
	public static void task3(int n, int  t) {
		for(int i=1; i<=n; i++) {
			System.out.println("Task 3");
			try {Thread.sleep(t); } catch(Exception e) {}
		}
	}
	
	public static void task4(int n, int  t) {
		for(int i=1; i<=n; i++) {
			System.out.println("Task 4");
			try {Thread.sleep(t); } catch(Exception e) {}
		}
	}
	
	public static void task5(int n, int  t) {
		for(int i=1; i<=n; i++) {
			System.out.println("Task 5");
			try {Thread.sleep(t); } catch(Exception e) {}
		}
	}
	
	public static void task6(int n, int  t) {
		for(int i=1; i<=n; i++) {
			System.out.println("Task 6");
			try {Thread.sleep(t); } catch(Exception e) {}
		}
	}
	
	
	/* main */
	public static void main(String[] args) throws Exception {
		
		int n = 10;		// n = length of each task, here no of iterations in for loop
		int t = 0;	// t = sleep time of each thread!
		
		/*// This is how it looks like without lambda!
		 * Thread t0 = new Thread(new Runnable() {
		 * 		@Override public void run() { 
		 * 			task0(); 
		 * 		} 
		 * });
		 */
		
		/*
		 *  make all the tasks as threads to run in parallel!
		 *  using lambda expression
		 *  https://www.youtube.com/watch?v=B-2ETnYOM_Q&list=PLsyeobzWxl7pFZoGT1NbZJpywedeyzyaf&index=56
		 *  
		 *  remember, main() is also a thread!!
		 *  ()-> is actually run() method inside a Runnable object!
		 */

		Thread t1 = new Thread(()->	{	task1(n,t);	}, "Task-1-Thread");
		Thread t2 = new Thread(()->	{	task2(n,t);	}, "Task-2-Thread");
		Thread t3 = new Thread(()->	{	task3(n,t);	}, "Task-3-Thread");
		Thread t4 = new Thread(()->	{	task4(n,t);	}, "Task-4-Thread");
		Thread t5 = new Thread(()->	{	task5(n,t);	}, "Task-5-Thread");
		Thread t6 = new Thread(()->	{	task6(n,t);	}, "Task-6-Thread");
		
		/* name of threads */
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		System.out.println(t4.getName());
		System.out.println(t5.getName());
		System.out.println(t6.getName());
		
		/* see priority of threads: (least) 1-10 (highest)*/
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		System.out.println(t4.getPriority());
		System.out.println(t5.getPriority());
		System.out.println(t6.getPriority());
		
		/* set priority */
		t3.setPriority(10);	// making task-3 as highest priority
		t5.setPriority(1);	// making task-5 as lowest priority
		
		/* start all threads!! */
		System.out.println("Starting all threads...");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start(); 
		
		/* wait for all threads to finish */
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		
		System.out.println("All job done! Ending main... Bye!");
		
		
	}
}
