package com.patil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value(value="Rushi")   //Field Injection
	private String name;
	
	@Value(value="rushi@gmail.com")   //Field Injection
	private String email;
	
	public void study() {
		System.out.println("Student is studing");
	}
	
	public void display() {
		System.out.println("=======Student========");
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
	}
}
