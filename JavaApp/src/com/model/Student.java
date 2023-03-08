package com.model;

/* encapsulated Student class*/
public class Student extends Object{
	private String name;
	private int age;
	private int id;

	public Student() { }
	
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	
}
