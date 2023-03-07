package com.main;

import com.model.Student;
import com.service.StudentService;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(); 
		s1.name="harry potter";
		s1.id=1;
		s1.age=15; 
		
		StudentService service = new StudentService();
		int rating  = service.defineRating(s1);
		System.out.println(rating);
	}
}
