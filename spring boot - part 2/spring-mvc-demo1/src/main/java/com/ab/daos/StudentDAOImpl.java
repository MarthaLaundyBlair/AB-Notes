package com.ab.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ab.models.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	
	@Override
	public int register(Student s) {
		
		String sql = "INSERT into student(firstname,lastname,username,password) VALUES(?,?,?,?)";

		return jdbcTemplate.update(sql,
									new Object[] {
												s.getFirstName(),
												s.getLastName(),
												s.getUsername(),
												s.getPassword()
												}	
												
									);
		
		}
	
	@Override
	public Student login(String username, String password) {
		return null;
	}

	@Override
	public List<Student> loadRegisteredStudents() {
		return jdbcTemplate.query("SELECT * from student", new StudentRowMapper());
		
	}
	
	
	private class StudentRowMapper implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Student s1 = new Student(rs.getInt(1),
									 rs.getString(2),
									 rs.getString(3),
									 rs.getString(4),
									 rs.getString("password")
									 );
			return s1;
		}
		
	}
	
	
	
	
}
