package com.exception;

public class App {
	public static void main(String[] args) { //main
		MyService service = new MyService();
		try {
			System.out.println(service.divide(3.0,1.0));
			System.out.println(service.divide(3,1));
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thanx");
	}
}
