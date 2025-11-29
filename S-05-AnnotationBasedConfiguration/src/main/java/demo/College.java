package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Setters Injection
@Component
public class College {
	
	private String name;
	private String address;
	
	@Value(value="KJ Somaiya")
	public void setName(String name) {
		this.name = name;
	}
	@Value(value="Sion")
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("=========College========");
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
	}
	

}
