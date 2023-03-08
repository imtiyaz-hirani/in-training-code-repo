package com.account.service;

import com.account.exception.InsufficientFundsException;
import com.account.exception.OverTheLimitException;
import com.account.exception.ZeroAmountException;
import com.account.main.Account;
import com.account.model.Customer;

public class AccountService implements Account{

	@Override
	public void deposit(Customer c, double amount) throws ZeroAmountException {
		if(amount == 0)
			throw new ZeroAmountException("amount == 0");
		
		c.setBalance(c.getBalance() + amount);
		
	}

	@Override
	public void withdraw(Customer c, double amount)
			throws InsufficientFundsException, OverTheLimitException, ZeroAmountException {
		if(amount > c.getBalance())
			throw new InsufficientFundsException("amount > balance");
		if(amount > Account.limit)
			throw new OverTheLimitException("amount > limit");
		if(amount == 0)
			throw new ZeroAmountException("amount == 0");
		c.setBalance(c.getBalance() - amount);
	}

}
