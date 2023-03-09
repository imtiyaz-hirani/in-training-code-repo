package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.collections.model.Student;

public class LoginHashMapApp {
	public static void main(String[] args) {
		Map<String,Student> map = new HashMap<>();
		map.put("harryp", new Student(2,"harryp","harry potter","london"));
		map.put("ron", new Student(1,"ronw","ronald weasley","kent"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = sc.next();
		
		Student s = map.get(username);
		System.out.println(s == null? "Username Invalid": "Welcome " + s.getName());
	}
}
