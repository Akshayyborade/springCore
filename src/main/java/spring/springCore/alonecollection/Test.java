package spring.springCore.alonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/springCore/alonecollection/standalone.xml");
	Teacher teacher = context.getBean("t1", Teacher.class);
	System.out.println(teacher);
}
}
