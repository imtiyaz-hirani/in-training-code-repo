package com.strings;

import com.account.model.Customer;

public class App {
	public static void main(String[] args) {
		String s1 = "harry potter"; //string literal : goes in the pool 
		String s2 = new String("harry potter"); //string object : goes in the heap 
		String s3 = new String("harry potter");
		 
		/* Compare String objects */
		System.out.println(s2  == s3); //false : never use == operator for String comparision as it compares locations
		
		//use equals method instead : it compares values 
		System.out.println(s1.equals(s3)); //true
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //true
		
		s2 = "Harry Potter";
		System.out.println(s2); //Harry Potter
		
		/* Since manipulating String is expensive and memory intensive, We must use 
		   StringBuilder class for manipulation  */
		
		StringBuilder sb1 = new StringBuilder(s3); 
		sb1.append(" hogwards"); 
		System.out.println(sb1);
		
		/* Note : Never use StringBUilder for comparision as both 
		 == operator and equals method in SB compares locations */
		
		StringBuilder sb3 = new StringBuilder("harry"); //500X:harry
		StringBuilder sb4 = new StringBuilder("harry"); //600X:harry
		
		System.out.println(sb3 == sb4); //false
		System.out.println(sb3.equals(sb4)); //false
		
		System.out.println(sb3.toString().equals(sb4.toString())); //true
		
		/* Object Comparision */
		Customer c1 = new Customer("harry",5000);
		Customer c2 = new Customer("harry",5000);
		
		System.out.println(c1 == c2); //false
		System.out.println(c1.equals(c2)); //true
		
	}
}









