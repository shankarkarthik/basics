package org.basics.designpatterns.gof_2.behavioral.state;

import org.basics.designpatterns.gof_2.behavioral.state.gumballstates.GumballSoldState;
import org.basics.designpatterns.gof_2.behavioral.state.gumballstates.GumballState;
import org.basics.designpatterns.gof_2.behavioral.state.gumballstates.HasQuarterState;
import org.basics.designpatterns.gof_2.behavioral.state.gumballstates.NoQuarterState;
import org.basics.designpatterns.gof_2.behavioral.state.gumballstates.OutOfGumballsState;

public class GumballMachine {

	int count = 0;
	
	GumballHardwareDevice gumballHardwareDevice = null;
	
	GumballState soldState = null;
	GumballState hasQuarterState = null;
	GumballState noQuarterState = null;
	GumballState outOfGumballsState = null;
	
	GumballState currentState = null;
	
	public GumballMachine( int count, GumballHardwareDevice gumballHardwareDevice ){
		this.count = count;
		this.gumballHardwareDevice = gumballHardwareDevice;
		soldState = new GumballSoldState( gumballHardwareDevice );
		hasQuarterState = new HasQuarterState( gumballHardwareDevice );
		noQuarterState = new NoQuarterState( gumballHardwareDevice );
		outOfGumballsState = new OutOfGumballsState( gumballHardwareDevice );
		currentState = outOfGumballsState;
		if ( count > 0 )
			currentState = noQuarterState;
	}
	
	public void insertQuarter(){
		System.out.println( this.currentState );
		currentState.insertQuarter();
	}
	
	public void ejectQuarter(){
		currentState.ejectQuarter();
	}
	
	public void turnCrank(){
		currentState.turnCrank();
		currentState.takeGumball();
	}
	
	public void takeGumball(){
		if ( count != 0 ) count--;
	}
	
	public void refill(){
		
	}
}
