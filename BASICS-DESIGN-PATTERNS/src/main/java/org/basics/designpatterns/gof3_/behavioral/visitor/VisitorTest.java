package org.basics.designpatterns.gof3_.behavioral.visitor;

import org.junit.Test;

public class VisitorTest {

	@Test
	public void testVisitor(){
		ModemVisitor modemVisitor = new UnixModemConfigurator();
		ModemA modemA = new ModemA();
		modemA.accept(modemVisitor);
	}
}
