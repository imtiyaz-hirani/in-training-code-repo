package com.collections.model;

public class Student {
	private int id; 
	private String username; 
	private String name; 
	private String city;
	
	public Student(int id, String username, String name, String city) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", name=" + name + ", city=" + city + "]";
	} 
	
	
}
