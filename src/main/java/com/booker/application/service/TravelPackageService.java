package com.booker.application.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.booker.application.model.TravelPackage;
import com.booker.application.repository.TravelPackageRepository;

@Service
public class TravelPackageService {

	private TravelPackageRepository travelPackageRepository;

	public TravelPackageService(TravelPackageRepository travelPackageRepository) {
		super();
		this.travelPackageRepository = travelPackageRepository;
	}

	//Finding all the travel packages in the repository
	public List<TravelPackage> findAllTravelPackages() {
		return (List<TravelPackage>) travelPackageRepository.findAll();
	}

	//Finding a single travel package
	public Optional<TravelPackage> findTravelPackageById(Integer id) {
		return travelPackageRepository.findById(id);
	}

	//Updating a travel package
	@Transactional
	public TravelPackage updateTravelPackages(TravelPackage travelPackage) {
		if (travelPackage.getTravelPackageId() != null) {
			Optional<TravelPackage> updatedTravelPackage = findTravelPackageById(travelPackage.getTravelPackageId());
			updatedTravelPackage.get().setTravelPackageId(travelPackage.getTravelPackageId());
			updatedTravelPackage.get().setAvailableServiceList(travelPackage.getAvailableServiceList());
			updatedTravelPackage.get().setDescription(travelPackage.getDescription());
			updatedTravelPackage.get().setImages(travelPackage.getImages());
			updatedTravelPackage.get().setPackageName(travelPackage.getPackageName());
			return travelPackageRepository.save(updatedTravelPackage.get());
		}
		return travelPackageRepository.save(travelPackage);
	}

	public void deleteTravelPackageById(Integer id) {
		travelPackageRepository.deleteById(id);
	}
	
	//Saving a travel package
	public TravelPackage saveTravelPackage (TravelPackage travelPackage) {
		return travelPackageRepository.save(travelPackage);
	}
}
