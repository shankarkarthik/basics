package org.basics.designpatterns.gof.creational_03.singleton.solution4;

/**
 * 
 * @author Shankar Karthik Vaithianathan
 *
 */
public class Singleton4 {
	
	private static Singleton4 instance;
	
	/**
	 * Double checked Locking
	 * @return
	 */
	public static Singleton4 getInstance(){
		if ( instance == null ) {
			synchronized( Singleton4.class ) {
				if ( instance == null ) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}

}

