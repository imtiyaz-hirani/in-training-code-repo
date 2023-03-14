package com.hibernate.main.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.hibernate.main.model.Employee;
import com.hibernate.main.model.EmployeeProject;
import com.hibernate.main.model.Project;

public class EmployeeProjectService {

	private EntityManager entityManager; 
	
	public EmployeeProjectService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void insert(Employee employee, Project project) {
		EmployeeProject ep = new EmployeeProject();
		ep.setEmployee(employee);
		ep.setProject(project);
		ep.setAssignedDate(LocalDate.now());
		entityManager.persist(ep);
		
	}

	public List<Employee> getEmployeeByProject(int pid) {
		Query query = entityManager
				.createQuery("select ep.employee from EmployeeProject ep where ep.project.id=:pid", Employee.class);
		query.setParameter("pid", pid);
		return query.getResultList();
	}

	public Map<String, Integer> getEmployeeForEachProject() {
		Query query = entityManager
				.createQuery("select ep from EmployeeProject ep", EmployeeProject.class);
		List<EmployeeProject> list = query.getResultList(); 
		Map<Project,List<EmployeeProject>> map = list.stream()
				.collect(Collectors.groupingBy(EmployeeProject :: getProject));
		Map<String, Integer> resultMap = new HashMap<>();
		for(Map.Entry<Project,List<EmployeeProject>> entry:map.entrySet()) {
			resultMap.put(entry.getKey().getName(), entry.getValue().size());
		}
		return resultMap;
	}
	
	
}
