package org.basics.algorithms.arraylist.findduplicates;

public class FindDuplicatesMethod2 {

	static int[] array = {1,2,3,4,3,0};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int tortoise = array.length - 1;
		int hare = array.length - 1;
		System.out.println( "tortoise: " + tortoise );
		System.out.println( "hare: " + hare );		
		while ( true ){
			tortoise = array[tortoise];
			hare = array[array[hare]];
			System.out.println( "tortoise: " + tortoise );
			System.out.println( "hare: " + hare);
			if ( tortoise == hare )
				break;
		}
		int finder = array.length - 1;
		while ( true ){
			tortoise = array[tortoise];
			finder = array[finder];
			System.out.println( "tortoise: " + tortoise );
			System.out.println( "finder: " + finder );
			if ( tortoise == finder ) {
				System.out.println( "duplicate: " + tortoise );
				break;
			}
		}
	}

}
