package com.p1;

public class Circle {
	
	final static double pi = 3.14; 
	
	public void computeArea(final double radius) {
		System.out.println("Area is " + (this.pi * radius * radius)); 
	}
	
	public void computeCircumference(final double radius) {
		//this.pi = 3.1414; final variable cannot be assigned a value
		System.out.println("Area is " + (2 * this.pi * radius)); 
	}
}
