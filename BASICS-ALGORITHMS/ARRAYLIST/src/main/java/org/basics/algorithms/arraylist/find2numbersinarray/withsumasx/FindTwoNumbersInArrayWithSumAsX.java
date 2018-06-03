package org.basics.algorithms.arraylist.find2numbersinarray.withsumasx;

import java.util.HashMap;
import java.util.Map;

public class FindTwoNumbersInArrayWithSumAsX {

	static int[] array = {1,2,6,10,3,14,4,5,3,0};

	static int sum = 4;
	/**
	 * @param args
	 */
	public static void main( String[] args ) {
		Map<Integer,Integer> matched = new HashMap<Integer,Integer>();
		for ( int i=0; i < array.length; i++ ){
			int diffValue = sum - array[i];
			System.out.println( "array[i] = " + array[i] + ", diffValue = " + diffValue );
			if ( !matched.containsKey( diffValue ) ){
				matched.put( array[i], i );
				System.out.println( "Adding to hashSet = " + matched.toString() );
			} else {
				System.out.println( "Matching Pair for Sum : " + array[i] + "," +  diffValue );
			} 
			System.out.println( "----------------------" );
		}
	}

}
