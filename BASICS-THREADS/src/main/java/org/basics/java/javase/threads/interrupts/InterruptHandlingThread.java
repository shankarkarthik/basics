package org.basics.java.javase.threads.interrupts;

public class InterruptHandlingThread implements Runnable {

	public void run() {
		System.out.println( "Going to Sleep" );
		try {
			Thread.sleep( 5000 );
		} catch ( InterruptedException exInterrupted ) {
			System.out.println( "Getting back from Interruption" );
			return;
		}
		System.out.println( "Woke up from Sleep" );
		
	}

}
