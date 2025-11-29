package demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person = (Person) app.getBean("person");
		person.display();
		
		Student student = app.getBean(Student.class);
		student.display();
		
		College college = app.getBean(College.class);
        college.display();
	}

}
