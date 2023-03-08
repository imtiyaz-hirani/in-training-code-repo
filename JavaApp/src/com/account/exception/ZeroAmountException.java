package com.account.exception;

public class ZeroAmountException extends Exception{
 
	private static final long serialVersionUID = 1L;

	public ZeroAmountException(String message) {
		 super(message);
	}
}
