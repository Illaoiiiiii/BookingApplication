package com.booker.application.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.booker.application.service.CustomerService;
import com.booker.application.model.Customer;

@RestController
@RequestMapping("/customers")
public class CustomersController {
	
	private CustomerService customerService;
	
	public CustomersController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping()
	public List<Customer> findAllCustomers(){
		return customerService.findAllCustomer();
	}
	@PostMapping
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	@PutMapping
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
	@DeleteMapping("/delete-customer")
	public void deleteCustomer(@RequestParam("ids")List<Integer> id) {
		customerService.deleteCustomers(id);
	}
	
}
