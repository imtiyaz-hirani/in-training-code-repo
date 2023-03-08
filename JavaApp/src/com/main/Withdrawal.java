package com.main;

public abstract interface Withdrawal extends BaseInterface {
	double limit = 10000; //public final static double limit = 10000
	void validation(); //public abstract void validation()
	void process(); 
	
	default void op() {
		System.out.println("op...");
	}
	
	static void op1() {
		System.out.println("op1..");
	}
}

//java 7 : java 8 