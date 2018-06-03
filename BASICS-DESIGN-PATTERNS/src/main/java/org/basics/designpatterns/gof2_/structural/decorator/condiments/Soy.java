package org.basics.designpatterns.gof2_.structural.decorator.condiments;

import org.basics.designpatterns.gof2_.structural.decorator.coffee.Coffee;

public class Soy extends CondimentsDecorator {
	private Coffee decoratedCoffee = null;

	public Soy( Coffee coffee ){
		super( coffee );
		decoratedCoffee = coffee;
	}

	public double getCost() {
		return decoratedCoffee.getCost() + .15;
	}

	public String getIngredients() {
		return decoratedCoffee.getIngredients() + ", soy";
	}

}
