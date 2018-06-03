package org.basics.designpatterns.gof_1.creational_03.singleton.solution3;

/**
 * 
 * @author Shankar Karthik Vaithianathan
 *
 */
public class Singleton3 {
	
	private static Singleton3 instance;
	
	/**
	 * Improves scalability
	 * @return
	 */
	public static Singleton3 getInstance(){
		if ( instance == null ) {
			synchronized( Singleton3.class ) {
				instance = new Singleton3();
			}
		}
		return instance;
	}

}

