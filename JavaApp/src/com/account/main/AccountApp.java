package com.account.main;

import com.account.exception.InsufficientFundsException;
import com.account.exception.OverTheLimitException;
import com.account.exception.ZeroAmountException;
import com.account.model.Customer;
import com.account.service.AccountService;

public class AccountApp {
	public static void main(String[] args) {
		Customer c1 = new Customer("harry potter", 5000); 
		Customer c2 = new Customer("ronald weasley", 3000);
		
		
		AccountService service = new AccountService();
		try {
			service.deposit(c1, 1000);
		} catch (ZeroAmountException e) {
			 System.out.println(e.getMessage());
		}
		
		try {
			service.withdraw(c1, 2000);
		} catch (InsufficientFundsException | OverTheLimitException | ZeroAmountException e) {
			 System.out.println(e.getMessage());
		}
		
		System.out.println(c1); //4000
		
		try {
			service.deposit(c1, 0);
		} catch (ZeroAmountException e) {
			 System.out.println(e.getMessage());
		}
		
		try {
			service.withdraw(c1, 11000);
		} catch (InsufficientFundsException | OverTheLimitException | ZeroAmountException e) {
			 System.out.println(e.getMessage());
		}
		
		try {
			service.withdraw(c1, 0);
		} catch (InsufficientFundsException | OverTheLimitException | ZeroAmountException e) {
			 System.out.println(e.getMessage());
		}
	}
}
