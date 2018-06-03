package org.basics.designpatterns.gof_2.behavioral.state.gumballstates;

import org.basics.designpatterns.gof_2.behavioral.state.GumballHardwareDevice;

public class NoQuarterState implements GumballState {
	
	GumballHardwareDevice gumballHardwareDevice;
	public NoQuarterState( GumballHardwareDevice gumballHardwareDevice ){
		this.gumballHardwareDevice = gumballHardwareDevice;
	}
	public void insertQuarter(){
		
	}
	public void ejectQuarter(){
		
	}
	public void turnCrank(){
		
	}
	public void takeGumball(){
		
	}
	public void refill(){
		
	}
	
}
