package gadget;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Mobile mobile = app.getBean(Mobile.class);
		mobile.display();
		
		System.out.println("-----------------");
		
		Person person = app.getBean(Person.class);
		person.display();
	}

}
