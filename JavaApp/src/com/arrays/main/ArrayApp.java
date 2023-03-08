package com.arrays.main;

import java.util.Arrays;

public class ArrayApp {
	public static void main(String[] args) {
		int x = 5; 
		/* Type 1: Assigning values while defining array*/
		String[] sarry = {"harry","ronald","hermione","draco" }; //pool 
		
		//Type 2: create the array and then assign the values 
		/* 
		double[] darry = {}; //darry has Zero elements and its not extendible
		System.out.println(darry.length); //0
		darry[0] = 3.0;
		*/
		double[] darry = new double[10]; //on every index JVM will assign 0.0 - Heap
		System.out.println(darry[6]); //0.0
		
		darry[0] = 3; 
		darry[1] = 4; 
		darry[5] = 7; 
		
		//Type 3: Combination of above 2 ways
		double[] darr = new double[] {3.0,1.0,2.0};
		
		/* Iteration */
		for( int i = 0; i<darr.length; i++) {
			System.out.print(darr[i] + " ");
		}
		System.out.println("\n--------------");
		for(double temp : darr) { //temp:3.0, 1.0, 2.0
			System.out.print(temp + " ");
		}
		
		/* Sorting */
		Arrays.sort(darr);
		System.out.println("\n--------------");
		for(double temp : darr) { //temp:1.0, 2.0, 3.0
			System.out.print(temp + " ");
		}
		
		/* Searching: Linear & Binary */
	 	Arrays.sort(sarry);
		System.out.println(Arrays.binarySearch(sarry, "harry")>0?"Found" : "Not Found"); 
	}
}








