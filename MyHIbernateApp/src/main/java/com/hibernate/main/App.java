package com.hibernate.main;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.main.model.Department;
import com.hibernate.main.model.Employee;
import com.hibernate.main.model.Project;
import com.hibernate.main.service.DepartmentService;
import com.hibernate.main.service.EmployeeProjectService;
import com.hibernate.main.service.EmployeeService;
import com.hibernate.main.service.ProjectService;
import com.hibernate.main.utility.AppUtility;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory factory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		/* Configuration */
		try {
			/*
			 * Create EntityManagerFactory: SessionFactory using Persistence class
			 */
			factory = Persistence.createEntityManagerFactory("myincedohibernatedb");

			// System.out.println(factory);//org.hibernate.internal.SessionFactoryImpl@51751e5f

			/*
			 * EntityManager helps us perform all DB operations hence create EntityManager
			 * object.
			 */
			entityManager = factory.createEntityManager();
			// System.out.println(entityManager); //SessionImpl(2140846441<open>)

			/*
			 * EntityTransaction keeps the DB operations atomic and consistent. hence create
			 * object of EntityTransaction
			 */
			entityTransaction = entityManager.getTransaction();
			// System.out.println(entityTransaction);
			// //org.hibernate.engine.transaction.internal.TransactionImpl@6c298dc
		} catch (Exception e) {
			e.printStackTrace();
		}

		DepartmentService departmentService = new DepartmentService(entityManager);
		EmployeeService employeeService = new EmployeeService(entityManager);
		ProjectService projectService = new ProjectService(entityManager);
		EmployeeProjectService eps = new EmployeeProjectService(entityManager);
		Scanner sc = new Scanner(System.in);
		while (true) {
			entityTransaction.begin();
			int input = AppUtility.displayMenu();
			if (input == 0) {
				System.out.println("exiting..");
				entityTransaction.commit();
				break;
			}

			switch (input) {
			case 1:
				try {
					departmentService.insertDepartment();
					System.out.println("Department added to db");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("Enter department ID");
					int deptId = sc.nextInt();
					Department department = departmentService.getDepartment(deptId);
					employeeService.insertEmployee(department);
					System.out.println("Employee added to db");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				/*
				 * Department department = entityManager.find(Department.class, id);
				 */
				break;
			case 3:
				List<Employee> list = employeeService.fetchAllEmployees();
				AppUtility.iterateEmployeeList(list);
			case 4:
				// Project insert
				try {
					projectService.insertProject();
					System.out.println("Project added to db");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 5:
				// read employee id : eid
				// fetch employee object using eid : employee
				// read project id: pid
				// fetch project object using pid : project
				// attach employee and project object to obj of EmployeeProject and assign
				// todays date
				// persist EmployeeProject object
				try {
					System.out.println("Enter Employee ID: ");
					int eid = sc.nextInt();
					Employee employee = employeeService.getEmployeeById(eid);
					if (employee == null) {
						System.out.println("employee not found!");
						break;
					}
					System.out.println("Enter Project ID: ");
					int pId = sc.nextInt();
					Project project = projectService.getProjectById(pId);
					if (project == null) {
						System.out.println("project not found!");
						break;
					}
					eps.insert(employee, project);
					System.out.println("Employee assigned to project");
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
			case 6:
				/* Read project ID and validate if it exists */
				System.out.println("Enter Project ID: ");
				int pid = sc.nextInt();
				Project project = projectService.getProjectById(pid);
				if (project == null) {
					System.out.println("project not found!");
					break;
				}
				/* go to service and fetch all employees for that project ID. 
				 write JPQL having where clause p.id=1 */
				list = eps.getEmployeeByProject(pid);
				AppUtility.iterateEmployeeList(list);
				break;
			case 7:
				Map<String,Integer> map = eps.getEmployeeForEachProject();
				AppUtility.displayMap(map);
			default:
				break;
			}
			entityTransaction.commit();
		}

	}
}
