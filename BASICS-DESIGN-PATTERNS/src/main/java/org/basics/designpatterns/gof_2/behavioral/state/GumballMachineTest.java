package org.basics.designpatterns.gof_2.behavioral.state;

import org.junit.Before;
import org.junit.Test;

public class GumballMachineTest {
	GumballHardwareDevice gumballHardwareDevice = null;
	GumballMachine gumballMachine = null;
	
	@Before
	public void setup(){
		gumballHardwareDevice = new TestDevice();
		gumballMachine = new GumballMachine( 0, gumballHardwareDevice );
	}
	
	@Test
	public void initialConditionsEmptyMachineShouldShowSoldOut(){
		gumballMachine.insertQuarter();
	}
}
