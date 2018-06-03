package org.basics.designpatterns.gof_2.behavioral.chainofresponsibility;

import org.junit.Test;

public class ChainOfResponsibilityTests {

	@Test
	public void testCalculator(){
		Logger logger = new StdOutLogger();
		logger.setNext( new EmailLogger() );
		
		logger.print( "test" );
	}
	
}
