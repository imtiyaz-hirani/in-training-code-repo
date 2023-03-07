package com.p2;

import com.p1.Transaction;

/*When you enxed an abstract class you must override the abstract method */
public class TransactionV2 extends Transaction{

	@Override
	public void withdrawal() {
		 System.out.println("Withdrawal... ");
		
	}

}
