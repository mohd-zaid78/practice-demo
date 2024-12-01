package com.zaid.thraed.mainclass;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.zaid.thraed.runnableclass.MyReader;
import com.zaid.thraed.runnableclass.MyWriter;

public class ThreadMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" thraead starts ");
		MyReader reader = new MyReader();
		MyWriter writer = new MyWriter();
		 
		Thread readerThread = new Thread(reader);
		readerThread.setName("reader thread");
		Thread WriterThread = new Thread(writer);
		WriterThread.setName("writer thread");
		readerThread.start();
		WriterThread.start();
		System.out.println( Thread.currentThread().getName() + " thraead ends");
		 
	
		
	}

}
