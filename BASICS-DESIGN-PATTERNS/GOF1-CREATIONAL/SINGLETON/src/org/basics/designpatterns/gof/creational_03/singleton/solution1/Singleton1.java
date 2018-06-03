package org.basics.designpatterns.creational.singleton.solution1;

/**
 * 
 * @author Shankar Karthik Vaithianathan
 *
 */
public class Singleton1 {
	
	private static Singleton1 instance;
	
	/**
	 * Not thread safe.
	 * @return
	 */
	public static Singleton1 getInstance(){
		if ( instance == null )
			instance = new Singleton1();
		return instance;
	}

}
