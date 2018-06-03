package org.basics.java.ood;

/**
 * 
 * @author Shankar Karthik Vaithianathan
 *
 */
public class OneTwo implements IOne, ITwo{

	@Override
	public void overrideMe() {
		System.out.println( "Demo for a class that implements two interfaces and implementing same method" );
	}

	
	public static void main( String[] pArgs ) {
		new OneTwo().overrideMe();
	}
	
	
}
