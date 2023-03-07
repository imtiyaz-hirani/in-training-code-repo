package com.service;

import com.model.Student;

public class StudentService {

	public int defineRating(final Student s1) {
		return s1.age < 16?1:2;
	}

}
