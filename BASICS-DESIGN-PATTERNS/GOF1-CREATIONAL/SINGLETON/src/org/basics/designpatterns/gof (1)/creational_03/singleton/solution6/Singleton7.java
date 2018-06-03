package org.basics.designpatterns.gof.creational_03.singleton.solution6;

/**
 * 
 * @author Shankar Karthik Vaithianathan
 *
 */
public class Singleton7 {
	private Singleton7(){
		
	}
	
	private static class Singleton7Holder {
		
		public static final Singleton7 instance = new Singleton7();
	}
	
	
	public static Singleton7 getInstance(){
		System.out.println( "Static class or Any class is not loaded until they are referenced." );
		return Singleton7Holder.instance;
	}

}

