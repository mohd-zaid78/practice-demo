package com.concurrent.thraeds;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread_CallableInt_RealLifeExm {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService thread = Executors.newSingleThreadExecutor();
		Future<?> future = thread.submit(()->{
			System.out.println("call() method executes from Callable iterface ");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return 123;
		});
		while(!future.isDone()){
			System.out.println("waiting for few seconds");
			Thread.sleep(1000);
		}
		System.out.println("Otp is :"+future.get());

	}

}
