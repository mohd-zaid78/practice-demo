package com.zaid.thraed.runnableclass;

public class MyWriter implements Runnable{

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		for (int i = 0; i <= 10; i++) {
			System.out.println("file writting line "+i+" by "+threadName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}

}
