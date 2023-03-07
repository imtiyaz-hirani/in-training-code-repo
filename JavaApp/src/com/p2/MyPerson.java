package com.p2;

import com.main.Person;

public class MyPerson extends Person{

	/* All the methods of super class(Person) come to sub class(MyPerson) */	
	/* Add a method in sub class*/
	
	public void myAge() {
		System.out.println("Age of Person");
	}
	
	/* changing existing functionality */
	public void display() { //Overriding
		System.out.println("display of my person- sub class");
	}
}
