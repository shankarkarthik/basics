package org.basics.designpatterns.gof3_.behavioral.visitor.example1;

public class ModemA implements Modem {

	String configuration = null;
	
	public void dial() {
		System.out.println( configuration );
	}

	public void send() {
	}

	public void handup() {
	}

	public void receive() {
	}

	public void accept( ModemVisitor modemVisitor ){
		modemVisitor.visit( this );
	}
}
