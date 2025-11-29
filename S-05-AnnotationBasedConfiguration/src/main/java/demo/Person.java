package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Field /variable injection

@Component
public class Person {
	
	@Value(value="Rohit")
	private String name;
	@Value(value="37")
	private int age;
	
	public void display() {
		System.out.println("========Person========");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
	
	public void sing() {
		System.out.println("Person is singing");
	}

}
