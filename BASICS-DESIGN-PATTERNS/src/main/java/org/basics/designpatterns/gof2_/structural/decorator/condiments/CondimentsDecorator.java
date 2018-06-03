package org.basics.designpatterns.gof2_.structural.decorator.condiments;

import org.basics.designpatterns.gof2_.structural.decorator.coffee.Coffee;

public abstract class CondimentsDecorator implements Coffee {
	
	private Coffee decoratedCoffee = null;

	public CondimentsDecorator( Coffee coffee ){
		this.decoratedCoffee = coffee;
	}


}
