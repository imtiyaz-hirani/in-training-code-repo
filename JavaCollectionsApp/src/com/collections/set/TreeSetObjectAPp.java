package com.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.collections.model.Employee;
import com.collections.service.EmployeeService;

public class TreeSetObjectAPp {
	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		List<Employee> list = employeeService.getAllEmployee();
		
		Set<Employee> set = new HashSet<>(list);
		
		for(Employee e : set) {
			System.out.println(e);
		}
	}
}
