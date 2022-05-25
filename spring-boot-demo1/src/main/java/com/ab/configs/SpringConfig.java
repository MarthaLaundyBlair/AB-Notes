package com.ab.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ab.beans.Order;
import com.ab.beans.Product;

// Spring configuration classes are annotated with an annotation called @Configuration
@Configuration
public class SpringConfig {
	
	// Bean Definitions
	
	// Bean Definitions are nothing but Java methods with @Bean annotation
	
	// Write a bean definition for Product class
	@Bean
	//@Scope("singleton")
	@Scope("prototype")
	public Product product() {
		
		Product product = new Product(1,"TV");
		return product;
		
	}
	
	
	@Bean
	public Product product2() {
		
		Product p1 = new Product(2,"iPhone");
		return p1;
		
	}
	
	// Write a bean definition for Order class
	
	@Bean
	public Order order() {
		
	  Order order1 = new Order(1,product());
	  return order1;
	
	}
	
	
	
	
	
	@Bean
	public Order newOrder() {
		// We are setting only orderId but Spring will inject Product object automatically 
		// Because there is an annotation @Autowired at field level
		
	  Order order1 = new Order(1000); 
	  return order1;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
