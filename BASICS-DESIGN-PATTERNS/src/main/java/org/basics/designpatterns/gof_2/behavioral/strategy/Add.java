package org.basics.designpatterns.gof_2.behavioral.strategy;

public class Add implements Calculator {

	public int execute( int a, int b){
		return a+b;
	}
}
