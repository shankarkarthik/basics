package org.basics.designpatterns.gof.creational_03.singleton.solution5;

/**
 * 
 * @author Shankar Karthik Vaithianathan
 *
 */
public class Singleton5 {
	
	private static Singleton5 instance;
	
	/**
	 * Double checked Locking
	 * @return
	 */
	public static Singleton5 getInstance(){
		if ( instance == null ) {
			synchronized( Singleton5.class ) {
				Singleton5 localInstance = instance;
				if ( localInstance == null ) {
					synchronized( Singleton5.class ) {
						localInstance = new Singleton5();
					}
					instance = localInstance;
				}
			}
		}
		return instance;
	}

}

