package com.generic;

import java.util.List;

import com.collections.model.Employee;
import com.collections.service.EmployeeService;

public class App {
	public static void main(String[] args) {
		List<Employee> list = new EmployeeService().getAllEmployee();
		new MyService().iterateList(list);
		
		
	}
}
