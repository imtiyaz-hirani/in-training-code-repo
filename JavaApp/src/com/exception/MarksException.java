package com.exception;

/* 
 TO make it unchecked extend it with RuntimeException
 TO make it checked extend it with Exception
 */
public class MarksException extends Exception{
	private static final long serialVersionUID = 1L;
	
	private String message; 
	
	public MarksException(String message) {
		 // super(message);
		this.message = message;
	}
	
	@Override
		public String getMessage() {
			return this.message;
		}
	
}
