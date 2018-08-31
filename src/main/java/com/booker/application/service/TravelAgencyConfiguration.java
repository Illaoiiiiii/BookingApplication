package com.booker.application.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.booker.application.model.TravelService;
import com.booker.application.repository.CustomerRepository;
import com.booker.application.repository.FeedbackRepository;
import com.booker.application.repository.ImageRepository;
import com.booker.application.repository.ReservationRepository;
import com.booker.application.repository.ServiceFeeRepository;
import com.booker.application.repository.TravelPackageRepository;
import com.booker.application.repository.TravelServiceRepository;

@Configuration
public class TravelAgencyConfiguration {

	@Bean
	public CustomerService customerService(CustomerRepository customerRepository) {
		return new CustomerService(customerRepository);
	}
	@Bean
	public TravelServiceService travelServiceService (TravelServiceRepository travelServiceRepository) {
		return new TravelServiceService(travelServiceRepository);
	}
	@Bean
	public TravelPackageService travelPackageService (TravelPackageRepository travelPackageRepository,TravelServiceService travelServiceService, ImageService imageService) {
		 return new TravelPackageService(travelPackageRepository,travelServiceService,imageService);
	}
	@Bean
	public ImageService imageService (ImageRepository imageRepository) {
		return new ImageService(imageRepository);
	}
	@Bean
	public FeedbackService feedbackService (FeedbackRepository feedbackRepository) {
		return new FeedbackService(feedbackRepository);
	}
	@Bean
	public ReservationService reservationService (ReservationRepository reservationRepository, TravelPackageService travelPackageService) {
		return new ReservationService(reservationRepository, travelPackageService);
	}
	@Bean
	public ServiceFeeService serviceFeeService (ServiceFeeRepository serviceFeeRepository) {
		return new ServiceFeeService(serviceFeeRepository);
	}
	

}
