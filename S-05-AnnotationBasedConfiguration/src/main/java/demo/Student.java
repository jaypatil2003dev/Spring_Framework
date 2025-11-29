package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Constructor injection
@Component
public class Student {
	
	private String name;
	private String std;
	
	
	public Student(@Value(value="Om") String name, @Value(value="12th") String std) {
		this.name = name;
		this.std = std;
	}
	
	public void display() {
		System.out.println("========Student========");
		System.out.println("Name :"+name);
		System.out.println("Std :"+name);
	}
    
	public void study() {
		System.out.println("Student is studing");
	}
	

}
