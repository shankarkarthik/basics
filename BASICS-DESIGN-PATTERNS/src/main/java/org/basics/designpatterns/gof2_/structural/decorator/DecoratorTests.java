package org.basics.designpatterns.gof2_.structural.decorator;

import org.basics.designpatterns.gof2_.structural.decorator.coffee.Coffee;
import org.basics.designpatterns.gof2_.structural.decorator.coffee.Espresso;
import org.basics.designpatterns.gof2_.structural.decorator.coffee.HouseBlend;
import org.basics.designpatterns.gof2_.structural.decorator.condiments.Milk;
import org.junit.Test;

public class DecoratorTests {

	@Test
	public void testHouseBlend(){
		Coffee espresso = new Espresso();
		Coffee houseBlend = new HouseBlend();
		houseBlend = new Milk( houseBlend );
		System.out.println( houseBlend.getCost() + ", " + houseBlend.getIngredients() );
	}
	
}
