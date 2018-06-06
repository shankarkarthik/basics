package org.basics.java.javasefundamentals.callbyvalue;

import java.awt.Point;

public class TrickySwap {

	public static void trickySwap(Point pnt3, Point pnt4) {
	  pnt3.x = 100;
	  pnt3.y = 100;
	  Point temp = pnt3;
	  pnt3 = pnt4;
	  pnt4 = temp;
	}

	public static void main(String [] args) {
	  Point pnt1 = new Point(1,1);
	  Point pnt2 = new Point(2,2);
	  System.out.println("X: " + pnt1.x + " Y: " +pnt1.y); 
	  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
	  System.out.println(" ");
	  trickySwap(pnt1,pnt2);
	  System.out.println("X: " + pnt1.x + " Y:" + pnt1.y); 
	  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);  
	  String[] arra = new String[2];
	  arra[0] = null;
	  arra[1] = "str";
	  for ( String string : arra ) {
		  System.out.println( string );
	  }
	}
}

