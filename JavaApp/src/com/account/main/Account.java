package com.account.main;

public interface Account {
	double limit = 5000; 
	void deposit(Customer c, double amount) 
			throws ZeroAmountException;
	void withdraw(Customer c, double amount) 
			throws  InsufficientFundsException, 
					OverTheLimitException, 
					ZeroAmountException;
}
