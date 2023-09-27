package spring.springJdbc.basicJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/springJdbc/basicJdbc/BeanConfig.xml");
	Student student=context.getBean("student", Student.class);
	System.out.println(student.toString());
	//spring Jdbc ---->>
	JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate", JdbcTemplate.class);
	//jdbc Query
	String query = "insert into student(id, name, city) value(?, ?, ?)";
	//fire Query using jdbcTemplete update method
	int result = jdbcTemplate.update(query,2,"Akshay","Neral");
	if(result!=0) {
	System.out.println("data inserted Sucessfully");
	}
	
	
	
}
}
