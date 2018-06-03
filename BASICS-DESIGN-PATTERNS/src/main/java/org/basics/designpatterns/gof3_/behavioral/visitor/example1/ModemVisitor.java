package org.basics.designpatterns.gof3_.behavioral.visitor.example1;

public interface ModemVisitor {
	public void visit( ModemA modemA );
	
	public void visit( ModemB modemB );
}
