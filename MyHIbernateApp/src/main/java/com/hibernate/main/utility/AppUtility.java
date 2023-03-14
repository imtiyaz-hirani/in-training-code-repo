package com.hibernate.main.utility;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.hibernate.main.model.Employee;

public class AppUtility {
	
	public static int displayMenu() {
			Scanner sc = new Scanner(System.in); 
		 	System.out.println("====hibernate operations=====");
			System.out.println("1. Insert Department");
			System.out.println("2. Insert Employee");
			System.out.println("3. Show all employees");
			System.out.println("4. Insert Project");
			System.out.println("5. Assign Employee to Project");
			System.out.println("6. Fetch all Employees by given project ID");
			System.out.println("7. Display number of employees for each project");
			System.out.println("0. To Exit");
			int input = sc.nextInt();
			return input;  
		}
	public static <T> void iterateEmployeeList(List<T> list) {
		list.stream().forEach(e-> System.out.println(e)  );
	}
	
	public static void displayMap(Map<String, Integer> map) {
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		
	}
}
