package spring.springCore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/springCore/constructorInjection/config.xml");
	Person person = (Person) context.getBean("p1");
	System.out.println(person);
}
}
