package com.ab.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ab.entities.Customer;


// Test-case class
@SpringBootTest
public class CustomerServiceTest {
	
	@Autowired
	private CustomerService customerService;
	
	
	// Test-case methods - methods annotated with @Test
	
	@Test
	public void testSaveCustomerWithValidInput() {
		
		// Arrange - Create Fixtures - Input Data
		Customer c = new Customer(101,"New Customer","n@gmail.com","787979797");
		
		// Act - Call the actual method that needs to be test  
		
		Customer actualResult = customerService.saveCustomer(c);
		
		// Verify - the actual result with expected result
		
		// Use Assert methods
		
		assertNotNull(actualResult);
		
	}
	
	
	@Test
	public void testSaveCustomerWithDuplicatePKValue() {
		
		// Arrange - Create Fixtures - Input Data
		Customer c = new Customer(100,"New Customer",null,"787979797");
		
		// Act - Call the actual method that needs to be test  
		
		Customer actualResult = customerService.saveCustomer(c);
		
		// Verify - the actual result with expected result
		
		// Use Assert methods
		
		assertNull(actualResult);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
