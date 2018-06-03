package org.basics.generics;

public class EnhancedForLoop {

	public static void main( String[] pArgs ){
		String[] stringArray = new String[2];
		stringArray[0] = "One";
		stringArray[1] = "Two";
		for ( String lString : stringArray ) {
			System.out.println( lString );
		}
		
	}
}
