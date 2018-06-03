package org.basics.designpatterns.gof_1.creational_03.singleton.solution2;

/**
 * 
 * @author Shankar Karthik Vaithianathan
 *
 */
public class Singleton2 {
	
	private static Singleton2 instance;
	
	/**
	 * Thread safe but has scalability issues
	 * @return
	 */
	public static Singleton2 getInstance(){
		if ( instance == null )
			instance = new Singleton2();
		return instance;
	}

}
