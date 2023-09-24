package spring.springCore.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefrenceInjection {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/springCore/refrence/config.xml");
	A a = (A) context.getBean("aref");
	System.out.println(a);
}
}
