package org.basics.designpatterns.gof_2.behavioral.chainofresponsibility;

public abstract class Logger {

	private Logger logger;
	
	public void setNext( Logger logger ){
		this.logger = logger;
	}
	
	public void print( String message ){
		this.writeMessage(message);
		if ( logger != null )
			logger.writeMessage(message);
	}

	protected abstract void writeMessage( String message );
}
