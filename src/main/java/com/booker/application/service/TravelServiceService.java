package com.booker.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.booker.application.model.TravelService;
import com.booker.application.repository.TravelServiceRepository;

public class TravelServiceService {
	
	private TravelServiceRepository travelServiceRepository;

	public TravelServiceService(TravelServiceRepository travelServiceRepository) {
		super();
		this.travelServiceRepository = travelServiceRepository;
	}
	
	@Transactional(readOnly=true)
	public List<TravelService> findAll() {
		return (List<TravelService>) travelServiceRepository.findAll();
	}
	@Transactional
	public Optional<TravelService> findById(Integer serviceId) {
		return travelServiceRepository.findById(serviceId);
	}
	@Transactional
	public TravelService saveService(TravelService travelService) {
		return travelServiceRepository.save(travelService);
	}
	@Transactional
	public void deleteService(TravelService travelService) {
		travelServiceRepository.delete(travelService);
	}

	@Transactional
	public void saveAll(List<TravelService> availableServiceList) {
		travelServiceRepository.saveAll(availableServiceList);	
	}
	
}
