package spring.springCore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demomain {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
	Student student = context.getBean("getStudent",Student.class);
	student.study();
}
}
