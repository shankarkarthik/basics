package org.basics.generics;

import java.util.ArrayList;
import java.util.List;

public class BoundsRestriction {
	
	public <T extends Number> void manipulate( List<T> list ){ 
		//list.add( new Integer( 2 ) );
		System.out.println( list.get( 0 ) );
		//list.add( new Integer( 2 ) );
	}
	
	public static void main( String[] pArgs ) {
		BoundsRestriction lBoundsRestriction = new BoundsRestriction();
		List<Integer> lIntegerList = new ArrayList<Integer>(); 
		lIntegerList.add( new Integer( 11 ) );
		lBoundsRestriction.manipulate(lIntegerList);
		
		List<Float> lFloatList = new ArrayList<Float>();
		lFloatList.add( new Float( 12.01 ) );
		lBoundsRestriction.manipulate( lFloatList );
		Integer[] lIntegerArray = new Integer[2];
		lIntegerArray[0] = 1;
		lIntegerArray[1] = 2;
		Number[] lNumberArray = lIntegerArray;
		System.out.println( lNumberArray[1] );
		lNumberArray[0] = new Float(2.01 );
		System.out.println( lNumberArray[0] );
		
		List<?>[] listArray = new List<?>[10]; 
		
	}
}
