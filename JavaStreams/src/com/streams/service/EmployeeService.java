package com.streams.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.streams.model.Employee;

 
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

	 

	public List<String> fetchAllCities(List<Employee> list) {
		return list.stream()
				.map(e->e.getCity())
				.distinct()
				.collect(Collectors.toList());
	}

	public List<Employee> sortList(List<Employee> list, String field) {
		if(field.equalsIgnoreCase("name"))
			return list.stream() 
					.sorted(Comparator.comparing(e-> e.getName()))
					.collect(Collectors.toList());
		
		if(field.equalsIgnoreCase("salary"))
			return list.stream() 
					.sorted(Comparator.comparingDouble(Employee :: getSalary))
					.collect(Collectors.toList());
		
		if(field.equalsIgnoreCase("salary-desc"))
			return list.stream() 
					.sorted(Comparator.comparingDouble(Employee :: getSalary).reversed()) 
					.collect(Collectors.toList());
		
		return list;
		 
	}

	public List<Employee> filteredList(List<Employee> list, Predicate<Employee> p) { 
		return list.stream()
				.filter(p)
				.collect(Collectors.toList());
	}

 
	
	
}
