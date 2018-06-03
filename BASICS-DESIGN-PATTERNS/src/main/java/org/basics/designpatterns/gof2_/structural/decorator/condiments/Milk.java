package org.basics.designpatterns.gof2_.structural.decorator.condiments;

import org.basics.designpatterns.gof2_.structural.decorator.coffee.Coffee;

public class Milk extends CondimentsDecorator {
	
	private Coffee decoratedCoffee = null;

	public Milk( Coffee coffee ){
		super( coffee );
		decoratedCoffee = coffee;
	}

	public double getCost() {
		return decoratedCoffee.getCost() + .10;
	}

	public String getIngredients() {
		return decoratedCoffee.getIngredients() + ", milk";
	}

}
