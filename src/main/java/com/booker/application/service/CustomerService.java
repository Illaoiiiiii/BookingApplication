package com.booker.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.booker.application.model.Customer;
import com.booker.application.repository.CustomerRepository;

@Service
public class CustomerService {

	private CustomerRepository customerRepository;

	public CustomerService (CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> findAllCustomer(){
		return (List<Customer>) customerRepository.findAll();
	}
	public Optional<Customer> findCustomerById(int id) {
		return customerRepository.findById(id);
	}
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	public Customer updateCustomer(Customer customer) {
		if(customer.getCustomerId() != null) {
		return customerRepository.save(customer);
		}
		return customerRepository.save(customer);
		
	}
	public void deleteCustomers(List<Integer> id) {
		for(Integer customerId : id ) {
			Optional<Customer> customerToDelete = customerRepository.findById(customerId);
			customerRepository.delete(customerToDelete.get());
		}
	}
	
}
