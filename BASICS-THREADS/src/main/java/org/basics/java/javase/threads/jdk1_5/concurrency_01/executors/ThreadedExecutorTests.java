package org.basics.java.javase.threads.jdk1_5.concurrency_01.executors;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadedExecutorTests {

	public static void main( String[] args ){
		BlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
		Executor executor = new ThreadPoolExecutor( 10, 100, 1000, TimeUnit.MILLISECONDS, linkedBlockingQueue );
		//executor.

	}
}
