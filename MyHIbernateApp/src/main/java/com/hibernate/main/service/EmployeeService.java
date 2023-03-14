package com.hibernate.main.service;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.hibernate.main.model.Department;
import com.hibernate.main.model.Employee;

public class EmployeeService {

	private EntityManager entityManager; 
	private Scanner sc;
	
	public EmployeeService(EntityManager entityManager) {
		this.entityManager = entityManager;
		sc = new Scanner(System.in);
	}

	public void insertEmployee(Department department) {
		Employee employee = new Employee();
		System.out.println("Enter name");
		employee.setName(sc.next());
		
		System.out.println("Enter city");
		employee.setCity(sc.next());
		
		System.out.println("Enter salary");
		employee.setSalary(sc.nextDouble());
		
		employee.setDepartment(department);
		
		entityManager.persist(employee);
	}

	public List<Employee> fetchAllEmployees() {
		//Query query = entityManager.createNativeQuery("select * from employee", Employee.class);
		Query query = entityManager.createQuery("select e from Employee e", Employee.class);
		return query.getResultList();	 
	}

	public Employee getEmployeeById(int eid) {
		return entityManager.find(Employee.class, eid);
	}

}
