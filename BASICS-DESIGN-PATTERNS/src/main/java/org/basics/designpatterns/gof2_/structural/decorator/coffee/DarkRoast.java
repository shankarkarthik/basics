package org.basics.designpatterns.gof2_.structural.decorator.coffee;

public class DarkRoast implements Coffee {

	public double getCost(){
		return .99;
	}
	public String getIngredients(){
		return "darkroast";
	}
}
