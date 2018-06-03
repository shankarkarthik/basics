package org.basics.designpatterns.gof_2.behavioral.state;

public class TestDevice implements GumballHardwareDevice {

	public void displayLine(String display) {
		System.out.println( display );
	}

	public boolean releaseGumball() {
		return false;
	}

	public void releaseQuarter() {
	
	}

	public String getLine(){
		return "";
	}

	public boolean hasEjected(){
		return false;
	}
	public int getCount(){
		return 0;
	}
	
	public void addGumballs( int count ){
		
	}
}
