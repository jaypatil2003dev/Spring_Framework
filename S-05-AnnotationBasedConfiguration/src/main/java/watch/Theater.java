package watch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Theater {
	
	@Value(value = "IMAX")
	private String name;
	
	@Value(value = "Thane")
	private String address;
	
	@Autowired
	private Movie movie;
	
	public void playMovie() {
		System.out.println("In theater "+name+" movie with story below is playing");
		movie.story();
	}
	
	

}
