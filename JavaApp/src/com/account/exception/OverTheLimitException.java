package com.account.exception;

public class OverTheLimitException extends Exception{
	 
		private static final long serialVersionUID = 1L;

		public OverTheLimitException(String message) {
			 super(message);
		}

}
