package com.service;

import com.main.Withdrawal;

public abstract class WithdrawalService implements Withdrawal{
	@Override
	public void process() {
		System.out.println("withdrawal process...");		
	}
}
