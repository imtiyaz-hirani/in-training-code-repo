package com.streams.main;

import java.util.function.Predicate;

public class LambdaApp {
	public static void main(String[] args) {
		Inter i = ()->{
			System.out.println("display of Inter");
		}; 
		
		new Temp().m1(()->{
			System.out.println("display of Inter");
		});
		
		Account a =   ()->{
			return "transaction impl..";
		};
		
		System.out.println(new Temp().m2(()->{
			return "transaction impl..";
		}));
		
		Student s = (double percent)-> {
			 return percent > 75? "Grade A":"Grade B";
		};
		
		System.out.println(new Temp().m3(s));
		
		PredicateClone p = (String str) -> {
			return str.length()>5?true:false;
		};
		
		Predicate<String> p1 = (str) -> {
			return str.length()>5?true:false;
		};
	}
}

interface Inter { //functional interfaces 
	void display();
	//void display1();
}

class Temp{
	void m1(Inter i ) {
		i.display();
	}
	
	String m2(Account a) {
		return a.transaction();
	}
	
	String m3(Student s){
		return s.computeGrade(70);
	}
	
	
}


interface Account{
	String transaction();
}

interface Student{
	String computeGrade(double percent);
}
interface PredicateClone{
	boolean test(String str);
}

/* Predicate interface 
 boolean test(boolean b); 
 */



