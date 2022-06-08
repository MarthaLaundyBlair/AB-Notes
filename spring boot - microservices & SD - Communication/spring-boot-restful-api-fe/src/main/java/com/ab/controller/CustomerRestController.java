package com.ab.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ab.models.Customer;

@RestController
public class CustomerRestController
{

	@Autowired
	RestTemplate restTemplate;
	
		
	@GetMapping("/template/customers")
	public String getCustomers()
	{

		HttpHeaders headers = new HttpHeaders();
		
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<String> responseEntity = restTemplate
				.exchange("http://spring-boot-restful-api/customers", HttpMethod.GET, entity, String.class);
		
		return responseEntity.getBody();
	}
	
	
	
	@GetMapping("/template/customers/{id}")
	public String getCustomer(@PathVariable("id") int id)
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<String> responseEntity = restTemplate
				.exchange("http://spring-boot-restful-api/customers/"+id, HttpMethod.GET, entity, String.class);
				
		return responseEntity.getBody();
	}

	

	@PostMapping("/template/customers")
	public String createCustomer(@RequestBody Customer customer)
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Customer> entity = new HttpEntity<Customer>(customer, headers);

		ResponseEntity<String> responseEntity =  restTemplate
				.exchange("http://spring-boot-restful-api/customers", HttpMethod.POST, entity, String.class);
		return responseEntity.getBody();
				
	}
	
	

	@PutMapping("/template/customers")
	public String updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer)
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Customer> entity = new HttpEntity<Customer>(customer, headers);

		ResponseEntity<String> responseEntity = restTemplate.exchange("http://spring-boot-restful-api/customers/" + id, HttpMethod.PUT,
				entity, String.class);
		return responseEntity.getBody();
	}

	

	@RequestMapping(value = "/template/customers/{id}", method = RequestMethod.DELETE)
	public String deleteCustomer(@PathVariable("id") int id)
	{

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Customer> entity = new HttpEntity<Customer>(headers);

		ResponseEntity<String> responseEntity = restTemplate.exchange("http://spring-boot-restful-api/customers/" + id, HttpMethod.DELETE,
				entity, String.class);
		return responseEntity.getBody();	
	}

}
