package com.collections.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.collections.model.Employee;

public class EmployeeService {

	public List<Employee> getAllEmployee() {
		
		return populateEmployee();
	}
	
	private List<Employee> populateEmployee() {
		Employee e1 = new Employee(1,"harry potter","london", 85000, "Dev");
		Employee e2 = new Employee(37,"ronald weasley","kent", 75000, "Testing");
		Employee e3 = new Employee(7,"hermione granger","london", 95000, "Dev");
		Employee e4 = new Employee(22,"draco malfoy","manchester", 80000, "Analyst");
		
		/* 
		List<Employee> list = new ArrayList<>();
		list.add(e1); 
		*/
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4);
		return list; 
	}

	public List<Employee> filterListByCity(List<Employee> list, String city) {
		/* Use traditional for/while/if-else/switch-case statements */
		List<Employee> filteredList = new ArrayList<>();
		for(Employee e : list) { //e1 e2 e2 e4
			if(e.getCity().equals(city)) { //if true then this obj shd be part of the list
				filteredList.add(e);
			}
		}
		/* Use Parellel Programming with Streams and Lambda expressions */
		
		return filteredList;
	}

}
