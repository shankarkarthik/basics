package org.basics.designpatterns.gof_2.behavioral.chainofresponsibility;

public class EmailLogger extends Logger {

	public void writeMessage( String message ){
		System.out.println( "email" + message);
	}
}
