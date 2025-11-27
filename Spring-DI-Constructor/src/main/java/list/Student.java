package list;

import java.util.List;

public class Student {
	private String name;
	private int age;
	private List<String> subjects;
	
	public void display() {
		System.out.println("======Student======");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Subjects: "+subjects);
		
	}

	public Student(String name, int age, List<String> subjects) {
		super();
		this.name = name;
		this.age = age;
		this.subjects = subjects;
	}
	

}
