package com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.collections.model.Employee;
import com.collections.service.EmployeeService;

public class ArrayListObjectApp { //controller
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		List<Employee> list = employeeService.getAllEmployee(); 
		
		for(Employee e : list) {
			System.out.println(e);
		}
		
		/* Filter the list on the basis of city */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city");
		String city = sc.next();
		
		List<Employee> filteredlistByCity = employeeService.filterListByCity(list,city);
		System.out.println("========filter by city========");
		if(filteredlistByCity.size() == 0)
			System.out.println("No employee from city: " + city);
		else
		for(Employee e : filteredlistByCity) {
			System.out.println(e);
		}
		
	}
}
