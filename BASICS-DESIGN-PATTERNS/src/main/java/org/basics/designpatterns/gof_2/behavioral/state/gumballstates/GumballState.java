package org.basics.designpatterns.gof_2.behavioral.state.gumballstates;

public interface GumballState {

	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void takeGumball();
	public void refill();
	
}
