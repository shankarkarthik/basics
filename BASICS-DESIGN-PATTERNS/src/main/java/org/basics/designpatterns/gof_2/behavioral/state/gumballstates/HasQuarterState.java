package org.basics.designpatterns.gof_2.behavioral.state.gumballstates;

import org.basics.designpatterns.gof_2.behavioral.state.GumballHardwareDevice;

public class HasQuarterState implements GumballState  {
	
	GumballHardwareDevice gumballHardwareDevice;
	public HasQuarterState( GumballHardwareDevice gumballHardwareDevice ){
		this.gumballHardwareDevice = gumballHardwareDevice;
	}
	public void insertQuarter(){
		this.gumballHardwareDevice.displayLine( "You can't insert another quarter" );
	}
	public void ejectQuarter(){
		this.gumballHardwareDevice.displayLine( "Please pick up your quarter from the tray" );
	}
	public void turnCrank(){
		
	}
	public void takeGumball(){
		
	}
	public void refill(){
		
	}
	
}
