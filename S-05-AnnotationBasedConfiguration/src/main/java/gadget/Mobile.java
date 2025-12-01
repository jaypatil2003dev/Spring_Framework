package gadget;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Value(value="Samsung")
	private String brand;
	
	@Value(value = "700000")
	private double price;
	
	public void display() {
		System.out.println("Brand :"+brand);
		System.out.println("Price :"+price);
	}
	
	public String ring() {
		return "Mobile Ringing!!!!!!";
	}

}
