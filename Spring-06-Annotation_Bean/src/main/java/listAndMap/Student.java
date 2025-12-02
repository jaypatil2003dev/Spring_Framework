package listAndMap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value(value="Om")
	private String name;
	
	@Autowired
	private List<String> subjects;
	
	public void display() {
		System.out.println("========Student Details=========");
		System.out.println("Name :"+name);
		System.out.println("Subjects: "+subjects);
	}

}
