package spring.springCore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/springCore/spEL/config.xml");
	Person person = context.getBean("person", Person.class);
	System.out.println(person);
}
}
