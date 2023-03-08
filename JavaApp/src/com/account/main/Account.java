package com.account.main;

import com.account.exception.InsufficientFundsException;
import com.account.exception.OverTheLimitException;
import com.account.exception.ZeroAmountException;
import com.account.model.Customer;

public interface Account {
	double limit = 5000; 
	
	void deposit(Customer c, double amount) throws ZeroAmountException;
	
	void withdraw(Customer c, double amount) 
			throws  InsufficientFundsException, 
					OverTheLimitException, 
					ZeroAmountException;
}
