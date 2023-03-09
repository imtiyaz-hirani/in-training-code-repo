package com.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.collections.model.Employee;
import com.collections.service.EmployeeService;

public class TreeSetObjectAPp {
	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		List<Employee> list = employeeService.getAllEmployee();
		
		Set<Employee> set = new TreeSet<>(list);
		
		for(Employee e : set) {
			System.out.println(e);
		}
	}
}
