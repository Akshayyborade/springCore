package spring.springCore.auto.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context
	= new ClassPathXmlApplicationContext("spring/springCore/auto/anotation/config.xml");
	Car car = context.getBean("car", Car.class);
	System.out.println(car);
}
}
