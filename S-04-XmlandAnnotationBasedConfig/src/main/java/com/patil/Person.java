package com.patil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String name;
	private int age;
	
	public void play() {
		System.out.println("Person is playing");
		
	}
	
	public void display() {
		System.out.println("========Person=========");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}

	@Value(value="Jenga")   //setter injection
	public void setName(String name) {
		this.name = name;
	}

	@Value(value="22")      //setter injection
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
