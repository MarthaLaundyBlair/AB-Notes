package com.ab;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ab.beans.Order;
import com.ab.beans.Product;
import com.ab.configs.SpringConfig;

@SpringBootApplication
public class SpringBootDemo1Application implements CommandLineRunner{

	
//	@Autowired
//	private Employee employee;
//		
//	@Autowired
//	private Student student;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
//		System.out.println(employee.hashCode());
//		
//		System.out.println(student.hashCode());
//		
//		System.out.println(student.getCourse().hashCode());
		
		// Code to create an ApplicationContext 
		// With this step ApplicationContext gets a connection to SpringConfig.class
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Order order = (Order) context.getBean("order");
		
		System.out.println(order);
		
		
		Product p1 = (Product) context.getBean("product");
		
		System.out.println(p1);
		
		
        Product p2 = (Product) context.getBean("product");
		
		System.out.println(p2);
		
		
		p1.setProductTitle("Car");
		
		System.out.println(p1.getProductTitle()); // Car
		
		System.out.println(p2.getProductTitle()); // Car
		
		
		
		
		
		Order newOrder = (Order) context.getBean("newOrder");
		
		
		System.out.println(newOrder);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
