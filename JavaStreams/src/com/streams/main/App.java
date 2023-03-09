package com.streams.main;

import java.util.List;
import java.util.stream.Collectors;

import com.streams.model.Employee;
import com.streams.service.EmployeeService;

public class App {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		List<Employee> list =  service.getAllEmployee();
		
		/* Iterate over the list */
		list.stream().forEach(e->System.out.println(e));
		 
		System.out.println("======Filteration===========");
		/* Filteration */
		System.out.println("======Filteration by dept===========");
		
		List<Employee> filteredList  = service.filteredList(list,
							(Employee e)->e.getDepartment().equals("Dev"));
		
		filteredList.stream().forEach(e->System.out.println(e));
		System.out.println("======Filteration by city===========");
		filteredList = service.filteredList(list,
					(Employee e)->e.getCity().equals("kent"));
		
		filteredList.stream().forEach(e->System.out.println(e));
		
		/* Reducing the list : map */
		System.out.println("=========Map the city of employee===========");
		/* Display all cities of employees as a List: ignore duplicates */
		List<String> cities =  service.fetchAllCities(list);
		cities.stream().forEach(c->System.out.println(c));
		
		/* Sorting the list */
		System.out.println("=========Sorting by name===========");
		service.sortList(list,"name").forEach(e->System.out.println(e));
		
		System.out.println("=========Sorting by salary ASC===========");
		service.sortList(list,"salary").forEach(e->System.out.println(e));
		
		System.out.println("=========Sorting by salary DESC===========");
		service.sortList(list,"salary-desc").forEach(e->System.out.println(e));
		
	}
}






