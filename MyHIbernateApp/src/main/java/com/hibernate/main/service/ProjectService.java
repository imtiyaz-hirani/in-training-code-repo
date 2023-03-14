package com.hibernate.main.service;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.hibernate.main.model.Project;

public class ProjectService {
 
	private EntityManager entityManager;
	private Project project; 
	private Scanner sc;
	public ProjectService(EntityManager entityManager) {
		this.entityManager=entityManager;
		sc = new Scanner(System.in);
	}
	public void insertProject() {
		project = new Project();
		System.out.println("Enter Project Name: ");
		project.setName(sc.next());
		System.out.println("Enter Project Credits: ");
		project.setCredits(sc.nextInt());
		entityManager.persist(project);
	}
	public Project getProjectById(int pId) {
		return entityManager.find(Project.class, pId);
		 
	}

}
