package org.basics.algorithms.arraylist.findduplicates;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesMethod1 {

	static int[] array = {1,2,3,4,3,0};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		for ( Integer integer : array ) {
			if ( !hashSet.contains( integer ) ){
				hashSet.add( integer );
			}
			else {
				System.out.println( "duplicate : " + integer );
			}
		}
	}

}