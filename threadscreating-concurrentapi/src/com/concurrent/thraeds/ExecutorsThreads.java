package com.concurrent.thraeds;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsThreads {

	public static void main(String[] args) {
		Executor executorsThread = Executors.newSingleThreadExecutor();
		executorsThread.execute(()->{
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread()+" is executing now "+i);
				}
			((ExecutorService) executorsThread).shutdown(); //this will killed the thread
		}
	);
		
	//==========================using the ExecutorService Interface========================
		ExecutorService executorsThread2 = Executors.newSingleThreadExecutor();
		executorsThread2.execute(()->{
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread()+" is executing with executorservcie now "+i);
				}
		 executorsThread2.shutdown(); //this will killed the thread
		}
	);

	}

}
