package com.ab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	private int studentId;
	
	private String studentName;
	
	@Autowired
	private Course course; // DI using a field injection
	
	public Course getCourse() {
		
		return this.course;
	}
	
	

}

