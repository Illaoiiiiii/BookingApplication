package com.booker.application.service;

import com.booker.application.repository.ServiceFeeRepository;

public class ServiceFeeService {

	private ServiceFeeRepository serviceFeeRepository;

	public ServiceFeeService (ServiceFeeRepository serviceFeeRepository) {
		super();
		this.serviceFeeRepository = serviceFeeRepository;
	}
	
}
