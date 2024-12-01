package com.concurrent.thraeds;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Calling_Runnable_Thread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
			ExecutorService singleThread = Executors.newSingleThreadExecutor();
			Future<?> future1 = singleThread.submit(()->{
				System.out.println("Executing the task from calling the runnable run()");
			});
			System.out.println("getting the return value is "+future1.get());
			
			ExecutorService singleThread2 = Executors.newSingleThreadExecutor();
			Future<?> future2 = singleThread2.submit(()->{
				System.out.println("Executing the task from calling the callable call()");
				return "zaid's thread";
			});
			System.out.println("getting the return value is "+future2.get());
	}

}
