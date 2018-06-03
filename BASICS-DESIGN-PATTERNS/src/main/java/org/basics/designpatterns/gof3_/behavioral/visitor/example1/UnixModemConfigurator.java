package org.basics.designpatterns.gof3_.behavioral.visitor.example1;

public class UnixModemConfigurator implements ModemVisitor {

	public void visit(ModemA modemA) {
		modemA.configuration = "abc";
		
	}

	public void visit(ModemB modemB) {
		modemB.configuration = 123;
	}

}
