package org.basics.java.javase.threads.deadlocks;

public class ResolveDeadLock {
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	
	public void foo(){
		synchronized( lock1 ) {
			System.out.println( "acquired lock1" );
			try {
				Thread.sleep( 1000 );
			} catch ( InterruptedException exInterrupted ) {
				return;
			}
			synchronized( lock2 ) {
				System.out.println( "acquired lock2" );
			}
		}
	}

	
	public void bar(){
		synchronized( lock1 ) {
			System.out.println( "acquired lock1" );
			try {
				Thread.sleep( 1000 );
			} catch ( InterruptedException exInterrupted ) {
				return;
			}
			synchronized( lock2 ) {
				System.out.println( "acquired lock2" );
			}
		}
	}
	
	public static void main( String[] args ) {
		final ResolveDeadLock deadLockCreator = new ResolveDeadLock();
		Thread thread1 = new Thread( new Runnable(){ 
			public void run(){
				deadLockCreator.foo();
			}
		});
		
		Thread thread2 = new Thread( new Runnable(){ 
			public void run(){
				deadLockCreator.bar();
			}
		});
		thread1.start();
		thread2.start();
	}
}
