package org.basics.java.javase.threads.threadlocals;

import org.junit.Test;

public class InheritableThreadLocalTests {

	@Test
	public void testGrandChildWithInheritableThreadLocals() {
		ThreadLocalHolder.setUserName( "anita1" );
		Thread parent = new Thread( new GrandChildThreadSpawner() );
		parent.start();
		ThreadLocalHolder.setUserName( "anita2" );
		Thread parent2 = new Thread( new GrandChildThreadSpawner() );
		parent2.start();
	}

}
