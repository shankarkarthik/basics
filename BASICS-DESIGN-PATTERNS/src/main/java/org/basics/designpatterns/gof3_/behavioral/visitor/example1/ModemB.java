package org.basics.designpatterns.gof3_.behavioral.visitor.example1;

public class ModemB implements Modem {

	int configuration = 0;
	
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
