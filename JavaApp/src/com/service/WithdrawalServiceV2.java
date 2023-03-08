package com.service;

import com.main.Withdrawal;

public class WithdrawalServiceV2 extends WithdrawalService{

	@Override
	public void validation() {
		System.out.println(Withdrawal.limit);
		System.out.println("validation..");
	}
	
	public void newTask() {
		System.out.println("new task...");
	}
	
	@Override
	public void process() {
		System.out.println("new process....");
	}

	@Override
	public void info() {
		System.out.println("codeline info");
		
	}
}
