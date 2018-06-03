package org.basics.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayConstruction {
	
    public static <T> void fill(T[] arr, T value){
        for(int i=0;i<arr.length;i++)
            arr[i]=value;
    } 
    public static <T,S extends T> void fill2(T[] arr, S value) {
    	for(int i=0;i<arr.length;i++)
            arr[i]=value;
    }
	
	public static void main( String[] pArgs ) {
		String[] strArr = new String[10];
		ArrayConstruction.fill2( strArr, 3);		
	}

}
