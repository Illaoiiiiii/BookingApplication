package com.booker.application.service;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.booker.application.model.TravelService;
import com.booker.application.model.Reservation;
import com.booker.application.model.TravelPackage;
import com.booker.application.repository.TravelPackageRepository;

@Service
public class TravelPackageService {

	private TravelPackageRepository travelPackageRepository;

	public TravelPackageService(TravelPackageRepository travelPackageRepository) {
		super();
		this.travelPackageRepository = travelPackageRepository;
	}

	public boolean validateReservation(Reservation reservation) {
		List<TravelPackage> travelPackageList = (List<TravelPackage>) travelPackageRepository.findAll();

		List<TravelService> availedServiceList = reservation.getAvailedServiceList();
		int totalAvailed = availedServiceList.size();
		int inPackageCtr = 0;
		for (TravelPackage travelPackage : travelPackageList) {
			inPackageCtr = 0;
			for (TravelService travelService : travelPackage.getAvailableServiceList()) {
				for (TravelService availedService : availedServiceList) {
					if (travelService.getServiceId() == availedService.getServiceId()) {
						inPackageCtr++;
					}
				}
			}
			if (inPackageCtr == totalAvailed) {
				return true;
			}
		}
		return false;
	}

	// Finding all the travel packages in the repository
	@Transactional
	public List<TravelPackage> findAllTravelPackages() {
		return (List<TravelPackage>) travelPackageRepository.findAll();
	}

	// Finding a single travel package
	@Transactional(readOnly=true)
	public Optional<TravelPackage> findTravelPackageById(Integer id) {
		return travelPackageRepository.findById(id);
	}

	// Updating a travel package
	@Transactional
	public TravelPackage updateTravelPackages(TravelPackage travelPackage) {
		if (travelPackage.getTravelPackageId() != null) {
			return travelPackageRepository.save(travelPackage);

		}
		return travelPackageRepository.save(travelPackage);
	}
	@Transactional
	public void deleteTravelPackageById(Integer id) {
		travelPackageRepository.deleteById(id);
	}

	// Saving a travel package
	@Transactional 
	public TravelPackage saveTravelPackage(TravelPackage travelPackage) {
		return travelPackageRepository.save(travelPackage);
	}
}
