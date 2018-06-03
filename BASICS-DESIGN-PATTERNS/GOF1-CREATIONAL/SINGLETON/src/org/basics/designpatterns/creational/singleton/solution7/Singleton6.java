package org.basics.designpatterns.creational.singleton.solution7;

/**
 * 
 * @author Shankar Karthik Vaithianathan
 *
 */
public class Singleton6 {
	private Singleton6(){
		
	}
	
	private static Singleton6 instance = new Singleton6();
	
	
	public static Singleton6 getInstance(){
		return instance;
	}

}

