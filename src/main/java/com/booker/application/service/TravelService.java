package com.booker.application.service;

import org.springframework.stereotype.Service;

import com.booker.application.repository.TravelServiceRepository;

@Service
public class TravelService {
	
	private TravelServiceRepository travelServiceRepository;

	public TravelService(TravelServiceRepository travelServiceRepository) {
		super();
		this.travelServiceRepository = travelServiceRepository;
	}
	
}
