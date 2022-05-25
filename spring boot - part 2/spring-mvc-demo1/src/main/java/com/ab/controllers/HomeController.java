package com.ab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ab.models.Student;
import com.ab.services.StudentService;

@Controller
public class HomeController {
	
	
	@Autowired
	private StudentService studentService;
	
	// Write Http Request Mapping methods
	
	@GetMapping("/")
	public String home() {
		
		return "home"; // This string represents the name of JSP file without
	}
	
	
	@GetMapping("/greeting")
	public String sayHello() {
		
		return "hello"; // This string represents the name of JSP file without
	}
	
	@GetMapping("/register")
	public String register() {
		
		return "register"; // This string represents the name of JSP file without
	}
	
	
	
	@PostMapping("/registration_process")
	public String regSuccess(@RequestParam("firstname") String firstname,
							 @RequestParam("lastname") String lastname,
							 @RequestParam("username") String username,
							 @RequestParam("password") String password) {
		
		
		Student s = new Student(firstname, lastname,username, password);
		
		int i = studentService.registerStudent(s);
		
		if(i > 0)
		{
			return "reg_success";
		}
		else {
			return "register";
		}
		
	}
	
	
	
	@GetMapping("/students")
	public ModelAndView getAllStudents() {
		
		List<Student> students = studentService.findAllStudents();
		
		ModelAndView mv = new ModelAndView();
		
		// This is similar to setAttribute() in session object
		mv.addObject("studentList", students);
		
		mv.setViewName("student_list");
		
		return mv;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
