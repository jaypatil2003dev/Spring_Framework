package listAndMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "listAndMap")
public class AppConfig {
	
	@Bean
	public List<String> getSubjects(){
		return Arrays.asList("Java", "Spring","Hibernate");
	}
	
	@Bean
	public Map<String , Double> getItems(){
		Map<String , Double> map= new HashMap<String, Double>();
		map.put("Mobile", (double) 77000);
		map.put("Phone", (double) 50000);
		map.put("Chair", (double) 700);
		return map;
		
		
	}

}
