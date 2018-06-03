package org.basics.designpatterns.gof2_.structural.decorator.condiments;

import org.basics.designpatterns.gof2_.structural.decorator.coffee.Coffee;

public class Mocha extends CondimentsDecorator {
	private Coffee decoratedCoffee = null;

	public Mocha( Coffee coffee ){
		super( coffee );
		decoratedCoffee = coffee;
	}

	public double getCost() {
		return decoratedCoffee.getCost() + .20;
	}

	public String getIngredients() {
		return decoratedCoffee.getIngredients() + ", mocha";
	}

}
