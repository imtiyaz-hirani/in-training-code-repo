package com.exception;

public class Main {
	public static void main(String[] args) {
		MyService service = new MyService();
		try {
			System.out.println("Percent is " + service.computePercentSelfException(350,300));
		} catch (MarksException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("thanx");
	}
}
