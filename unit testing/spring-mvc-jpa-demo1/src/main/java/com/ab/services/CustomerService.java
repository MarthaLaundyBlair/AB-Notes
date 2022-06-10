package com.ab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.entities.Customer;
import com.ab.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	// Write Business methods/logic
	
	public Customer saveCustomer(Customer customer) {
		
		Customer c  = this.customerRepository.save(customer);
		
		System.out.println(c);
		
		if(c!= null) {
		  return c;
	    }
		else {
			return null;
		}
		
	}
		
	public List<Customer> loadCustomers(){
		return this.customerRepository.findAll();
	}
	
	
	public List<Customer> loadCustomersByCustomerName(String customerName){
		return this.customerRepository.getCustomersByCustomerName(customerName);
	}
	
	
	
	
	
	
	

}
