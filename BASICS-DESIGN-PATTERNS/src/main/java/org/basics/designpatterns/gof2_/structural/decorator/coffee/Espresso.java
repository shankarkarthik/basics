package org.basics.designpatterns.gof2_.structural.decorator.coffee;

public class Espresso implements Coffee {

	public double getCost(){
		return 1.99;
	}
	public String getIngredients(){
		return "expresso";
	}
}
