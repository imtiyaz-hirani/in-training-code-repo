package com.main;

import com.model.Student;
import com.service.StudentService;
import com.service.WithdrawalServiceV2;

public class Main {
	public static void main(String[] args) {
		final Student s1 = new Student("harry potter",15,1); 
		
		StudentService service = new StudentService();
		int rating  = service.defineRating(s1);
		System.out.println(rating);
		
		Withdrawal wservice = new WithdrawalServiceV2(); //super ref = sub obj : polymorphic
		wservice.validation();
		wservice.process();
		wservice.op();
		Withdrawal.op1();
		// wservice.newTask(); - not defined in super interface
	}
}
