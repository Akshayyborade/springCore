package spring.springCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/springCore/stereotype/config.xml");
	Task task = context.getBean("task",Task.class);
	System.out.println(task);
}
}
