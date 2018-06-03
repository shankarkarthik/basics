package org.basics.java.javase.threads;

public class WorkerThread implements Runnable {

	private String name;
	
	public WorkerThread( String name ){
		this.name = name;
	}
	public void run() {
		System.out.println( "Worker Thread - " + this.name );

	}

}
