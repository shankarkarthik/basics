package org.basics.designpatterns.gof2_.structural.decorator.coffee;

public class HouseBlend implements Coffee {

	public double getCost(){
		return .89;
	}
	public String getIngredients(){
		return "houseblend";
	}
}
