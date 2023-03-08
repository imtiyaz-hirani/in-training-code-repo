package com.arrays.main;

import com.account.model.Customer;

public class ArrayObjectApp {
	public static void main(String[] args) {
		Customer c1 = new Customer("harry",5000);
		Customer c2 = new Customer("ronald",3000);
		Customer c3 = new Customer("hermione",7000);
		
		Customer[] carry = new Customer[] {c1,c2,c3}; //Array of Objects
		
		ArrayService service = new ArrayService(); 
		service.iterate(carry);
	}
}
