package com.p1;

public class A { //service

	//instance variables
	int no1; //0(JVM gave the value)
	int no2= 4; //4(programmer initialized it)
	
	/* Display the name of the class */
	public void display() {
		System.out.println("class A"); //sysout [ctrl + space]
	}
	
	/* read 2 nos(int) and display the sum of the numbers */
	public void sum(int no1,int no2) { //
		int sum = no1+no2;
		System.out.println("Sum is " + sum);
	}
	
	/* Read 1 no(double), compute square of that number and return the value */
	public double computeSquare(double num) {
		return num * num; 
	}
	
	/* Read 2 nos(int) and save it in the class for later use. */
	public void save(int no1,int no2) { //local variables: scope limited to method
		//save no1,no2
		this.no1=no1;  //instance = local
		this.no2=no2;
	}
	
	/* compute multiplication of the numbers given earlier and return the result*/
	public int mulitply() {
		return this.no1*this.no2; 
	}
}

/* instance variables: */







