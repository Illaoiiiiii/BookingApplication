package com.booker.application.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.booker.application.repository.CustomerRepository;
import com.booker.application.repository.TravelPackageRepository;
import com.booker.application.repository.TravelServiceRepository;

@Configuration
public class TravelAgencyConfiguration {

	@Bean
	public CustomerService customerService(CustomerRepository customerRepository) {
		return new CustomerService(customerRepository);
	}
	@Bean
	public TravelService travelService (TravelServiceRepository travelServiceRepository) {
		return new TravelService(travelServiceRepository);
	}
	@Bean
	public TravelPackageService travelPackageService (TravelPackageRepository travelPackageRepository) {
		 return new TravelPackageService(travelPackageRepository);
	}

}
