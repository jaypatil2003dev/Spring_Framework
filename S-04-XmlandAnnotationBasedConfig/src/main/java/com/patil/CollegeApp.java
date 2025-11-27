package com.patil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class CollegeApp {
	
	private String name;
	private String address;
	
	
	
	public CollegeApp(@Value(value="KJ Somaiya") String name, @Value(value="Sion") String address) {
		this.name = name;
		this.address = address;
	}

	public void exams() {
		System.out.println("Conducting exams");
	}
	
	public void display() {
		System.out.println("=========College=========");
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
	}

}
