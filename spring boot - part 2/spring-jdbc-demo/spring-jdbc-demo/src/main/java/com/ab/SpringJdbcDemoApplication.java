package com.ab;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ab.models.Student;

@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String sql = "INSERT into student(firstname,lastname,username,password) VALUES(?,?,?,?)";
		
		// update() can be used for executing INSERT, UPDATE and DELETE command
		int i = jdbcTemplate.update(sql,new Object[] {"Tom","T","t","2222"});
		
		System.out.println(i+" record created succcessfully");
		
		
		loadStudentRecordsAndPrint(); // 
	
	}
		
	public void loadStudentRecordsAndPrint() {
		
		// The below statement uses StudentRowMapper class which converts all rows into objects
		System.out.println(jdbcTemplate.query("SELECT * from student", new StudentRowMapper()));
	}
	
	
	// To convert a ResultSet into a List of objects Spring provides "RowMapper" interface
	// This inner class implements RowMapper interface and overrides mapRow() method
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
