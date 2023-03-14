package com.hibernate.main.service;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.hibernate.main.model.Department;

public class DepartmentService {

	private EntityManager manager;
	private Scanner sc; 
	
	public DepartmentService(EntityManager manager) {
		this.manager = manager;
		sc = new Scanner(System.in);
	}

	public void insertDepartment() {
		System.out.println("Enter department name");
		Department department = new Department(); 
		department.setName(sc.next());
		manager.persist(department);
	}

	public Department getDepartment(int deptId) {
		return manager.find(Department.class, deptId);
	}
}
