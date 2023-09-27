package spring.springCore.javaConfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "spring.springCore.javaConfig")
public class BeanConfig {
	@Bean
	public Student getStudent() {
		return new Student();
	}

}
