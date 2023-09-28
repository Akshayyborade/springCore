package spring.springJdbc.Annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import spring.springJdbc.Annotation.entity.Student;
@Component
public class StudentDaoImpl implements StudentDao {
    @Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public StudentDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(Student student) {
		//inserting into database
		String query = "insert into student(id, name, city) value(?, ?, ?)";
		int result = this.jdbcTemplate.update(query, student.getId(),student.getName(),student.getCity());
		return result;
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		String query= "update student set name=?, city=? where id=?";
		int update = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		
		return update;
	}

}
