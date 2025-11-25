package com.patil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		
		Car car = (Car) app.getBean("car");
		
		Engine engine = (Engine) app.getBean("engine");
		
		car.carDisplay();
	}

}
