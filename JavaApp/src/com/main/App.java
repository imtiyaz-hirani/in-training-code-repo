package com.main;

import com.p1.A;
import com.p2.B;
import com.p2.MyPerson;
import com.p2.StringOps;
import com.p2.TransactionV2;

public class App {  //controller class
	public static void main(String[] args) { //main [ctrl + space]
		 A a=new A(); 
		 a.display();
		 
		 B b=new B();
		 b.display();
		 
		 a.sum(10,20);
		 
		 System.out.println("square is " + a.computeSquare(5));
		 
		 a.save(20,20);
		 System.out.println(a.mulitply());
		 
		 MyPerson mypObj = new MyPerson();
		 mypObj.display();
		 mypObj.address();
		 mypObj.myAge();
		 
		// Transaction transaction = new Transaction(); : Transaction class is abstract
		 
		 TransactionV2 tv2 = new TransactionV2();
		 tv2.deposit();
		 tv2.withdrawal();
		 
		 /* String OP */
		 StringOps sop = new StringOps();
		 System.out.println(sop.editString("harry potter,hogwards"));
	}
	
	
}

//import A - since it is coming from outside the package com.main. : ctrl+shft+o