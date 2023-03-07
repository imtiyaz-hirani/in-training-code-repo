package com.p1;

/* Cannot create the objet of an abstract class */
public abstract class Transaction {
	
	public void deposit() {
		System.out.println("deposit logic...");
	}
	
	public abstract void withdrawal(); 
}
