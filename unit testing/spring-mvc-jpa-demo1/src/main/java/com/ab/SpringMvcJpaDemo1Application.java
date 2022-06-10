package com.ab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcJpaDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcJpaDemo1Application.class, args);
	
	
	   BankAccount currAct = new CurrentAccount(1, null, 500, 1000);
	   
	   BankAccount savAct = new SavingsAccount(1, null, 200);
	   
	   currAct.withdraw(100);
	   
	   System.out.println(currAct.getBankBalance());
	   
	   
	   
	   
	   
	
	}

}
