package spring.springCore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/springCore/auto/wire/autoConfig.xml");
	Samosa samosa= context.getBean("samosa",Samosa.class);
	System.out.println(samosa);
}
}
