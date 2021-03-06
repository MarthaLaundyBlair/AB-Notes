package com.ab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ab.entities.Customer;

import com.ab.services.CustomerService;

@Controller
public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService;
	
	// Http Request Mapping methods
	
	
	//@GetMapping("/reg_form")
	@RequestMapping(value="/",method = RequestMethod.GET )
	public String registerForm() {
		return "register";
	}
	
	
	@PostMapping("/register")
	public String registerProcess(@ModelAttribute Customer customer) {
		
		Customer registeredCustomer = this.customerService.saveCustomer(customer);
		
		if(registeredCustomer != null) {
			return "reg_success";
		}
		else {
			return "reg_failure";
		}
	}
	
	
	
	@GetMapping("/customers")
	public ModelAndView getAllStudents() {
		
		List<Customer> customers = customerService.loadCustomers();
		
		ModelAndView mv = new ModelAndView();
		
		// This is similar to setAttribute() in session object
		mv.addObject("customerList", customers);
		
		mv.setViewName("customer_list");
		
		return mv;
		
	}
}
