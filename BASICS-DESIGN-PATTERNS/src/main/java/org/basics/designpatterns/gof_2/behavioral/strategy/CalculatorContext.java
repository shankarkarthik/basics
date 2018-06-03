package org.basics.designpatterns.gof_2.behavioral.strategy;

public class CalculatorContext {
	Calculator calculator;
	
	public CalculatorContext( Calculator calculator ){
		this.calculator = calculator;
	}
	
	public int calculate( int a, int b ){
		return calculator.execute(a, b);
	}
}
