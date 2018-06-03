package org.basics.designpatterns.gof_1.creational_04.proxy;

/**
 * 
 * @author Shankar Karthik Vaithianathan
 *
 */
public interface IProxied {

	public void ping();
	
	static class NestedStatic {
		
		private void printMe(){
			System.out.println( "printMe" );
		}
	}
}
