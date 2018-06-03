package org.basics.java.javase.threads.threadlocals;

public class GrandChildThreadSpawner implements Runnable {

	public void run() {
		System.out.println( ThreadLocalHolder.getUserName() );
		Thread childThread = new Thread( new Runnable() {
			public void run(){
				System.out.println( ThreadLocalHolder.getUserName() );
				Thread grandChildThread = new Thread( new Runnable() {
					public void run(){
						System.out.println( ThreadLocalHolder.getUserName() );		
					}
				} );
				System.out.println( "GrandChild spawning from " + ThreadLocalHolder.getUserName() );
				grandChildThread.start();
			}
		} );
		System.out.println( "Child spawning from " + ThreadLocalHolder.getUserName() );
		childThread.start();
	}

}
