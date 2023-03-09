package com.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.collections.model.Employee;
import com.collections.service.EmployeeService;

public class ListMapApp {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		List<Employee> list = employeeService.getAllEmployee(); 
		
		List<String> cities = employeeService.getDistinctCities(list);
		
		Map<String,List<Employee>> map = new HashMap<>();
		
		for(String city : cities) {
			map.put(city, employeeService.filterListByCity(list, city));
		}
		
		System.out.println(map);
	}
}
