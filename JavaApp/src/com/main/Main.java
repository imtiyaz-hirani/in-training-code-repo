package com.main;

import com.model.Student;
import com.service.StudentService;

public class Main {
	public static void main(String[] args) {
		final Student s1 = new Student("harry potter",15,1); 
		
		StudentService service = new StudentService();
		int rating  = service.defineRating(s1);
		System.out.println(rating);
		
		
	}
}
