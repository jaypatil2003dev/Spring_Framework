package readData;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "readData")
@PropertySource(value = "classpath:testdb.properties")
public class AppConfig {
	
	

}
