package org.basics.java.javase.threads.interrupts;

import org.junit.Test;

public class InterruptHandlingThreadTests {

	@Test
	public void testGrandChildWithInheritableThreadLocals() {
		Thread parent = new Thread( new InterruptHandlingThread() );
		parent.start();
		parent.interrupt();
		Thread parent2 = new Thread( new InterruptHandlingThread() );
		parent2.start();
		parent2.interrupt();
	}

}
