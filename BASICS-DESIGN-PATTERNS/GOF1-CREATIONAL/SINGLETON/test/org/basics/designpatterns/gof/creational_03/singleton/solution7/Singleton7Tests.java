package org.basics.designpatterns.gof.creational_03.singleton.solution7;

import static org.junit.Assert.assertNotNull;

import org.basics.designpatterns.gof.creational_03.singleton.solution6.Singleton7;
import org.junit.Test;

/**
 * 
 * @author Shankar Karthik Vaithianathan
 *
 */
public class Singleton7Tests {
	
	@Test
	public void testLazySingleton(){
		Singleton7.class.toString();
		assertNotNull( Singleton7.getInstance() );
	}

}
