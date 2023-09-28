package spring.springJdbc.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.springJdbc.DesignJdbc.dao.StudentDao;
import spring.springJdbc.DesignJdbc.entity.Student;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/springJdbc/Annotation/BeanConfig.xml");
	Student student=context.getBean("student", Student.class);
	System.out.println(student.toString());
	
	//spring Jdbc ---->>
   StudentDao dao = context.getBean("studentDaoImpl",StudentDao.class);
   //inserting data
  // int result = dao.insert(student);
   // change in data
   Student student1=context.getBean("student", Student.class);
   student1.setId(12);
   student1.setName("Rajesh");
   student1.setCity("kalamb pohi");
   int update = dao.update(student1);
   

	
	if(update!=0) {
	System.out.println("data inserted Sucessfully");
	}
	
	
	
}
}
