package com.patil;

public class Person {
	
	private String name;
	private int age;
	
	public void display() {
		System.out.println("=====Person data=====");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	
	public Person() {
		System.out.println("Person Object is Created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
