package com.service;

import com.model.Student;

public class StudentService {

	public int defineRating(final Student s1) {
		System.out.println(s1); //memory location
		return s1.getAge() < 16?1:2;
	}

}
