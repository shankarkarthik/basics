package org.basics.designpatterns.gof_2.behavioral.chainofresponsibility;

public class StdOutLogger extends Logger {

	public void writeMessage( String message ){
		System.out.println( "stdout" + message );
	}
}
