package com.concurrent.thraeds;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicePoolThread {

	public static void main(String[] args) {
		ExecutorService thread = Executors.newFixedThreadPool(3);
			for (int i = 0; i <4; i++) {
				thread.execute(()->System.out.println(Thread.currentThread()+" is now executing no. "));
				
			}
		

	}

}
