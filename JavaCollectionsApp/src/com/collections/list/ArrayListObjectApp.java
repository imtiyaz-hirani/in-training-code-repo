package com.collections.list;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.collections.model.Employee;
import com.collections.service.EmployeeService;
import com.collections.utility.IdSortUtility;

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
		System.out.println("=====sorting ASC as per salary====");
		/* Sorting the list as per given criteria */
		Collections.sort(list); //e1 e2  => e1.compareTo(e2)
		for(Employee e : list) {
			System.out.println(e);
		}
		
		System.out.println("=====sorting ASC as per ID ====");
		 Collections.sort(list, new IdSortUtility("ASC"));
		 for(Employee e : list) {
				System.out.println(e);
		 }
		
		 System.out.println("=====sorting DESC as per ID ===="); 
		 Collections.sort(list, new IdSortUtility("DESC"));
		 for(Employee e : list) {
				System.out.println(e);
		 }
	}
}







