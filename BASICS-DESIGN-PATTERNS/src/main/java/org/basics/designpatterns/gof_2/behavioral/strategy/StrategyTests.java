package org.basics.designpatterns.gof_2.behavioral.strategy;

import org.junit.Test;

public class StrategyTests {

	@Test
	public void testCalculator(){
		CalculatorContext calculatorContext = new CalculatorContext( new Add() );
		System.out.println( calculatorContext.calculate( 1, 2 ) );

		calculatorContext = new CalculatorContext( new Subtract() );
		System.out.println( calculatorContext.calculate( 1, 2 ) );

	}
	
}
