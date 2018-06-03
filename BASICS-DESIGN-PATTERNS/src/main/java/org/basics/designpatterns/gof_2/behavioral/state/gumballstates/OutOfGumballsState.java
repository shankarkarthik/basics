package org.basics.designpatterns.gof_2.behavioral.state.gumballstates;

import org.basics.designpatterns.gof_2.behavioral.state.GumballHardwareDevice;

public class OutOfGumballsState implements GumballState {
	
	GumballHardwareDevice gumballHardwareDevice;
	
	public OutOfGumballsState( GumballHardwareDevice gumballHardwareDevice ){
		this.gumballHardwareDevice = gumballHardwareDevice;
	}
	public void insertQuarter(){
		this.gumballHardwareDevice.displayLine( "sold out" );
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
