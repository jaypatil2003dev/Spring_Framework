package gadget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
//	@Value(value = "Sujal")
	private String name;
	
//	@Autowired   //Field/variable 
	private Mobile mobile;

	
	public void display() {
		System.out.println(name+" got a call!!!"+ mobile.ring());
	}
	
//	@Autowired // setter injection
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
//	@Autowired // Constructor Injection
	public Person(@Value(value = "Sujal") String name, @Autowired Mobile mobile) {
		this.name=name;
		this.mobile=mobile;
	}
	
	
}
