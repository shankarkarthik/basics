package org.basics.designpatterns.gof2_.structural.decorator.coffee;

public class Decaf implements Coffee {

	public double getCost(){
		return 1.05;
	}
	public String getIngredients(){
		return "decaf";
	}
}
