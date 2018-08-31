package com.booker.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booker.application.model.TravelPackage;
import com.booker.application.service.TravelPackageService;

@RestController
@RequestMapping("/travel-packages")
public class TravelPackageController {

	private TravelPackageService travelPackageService;

	public TravelPackageController(TravelPackageService travelPackageService) {
		super();
		this.travelPackageService = travelPackageService;
	}

	// Request Mapping of the travel-packages inquiry (bulk)
	@GetMapping()
	public List<TravelPackage> getTravelPackages() {
		return travelPackageService.findAllTravelPackages();
	}

	//Inserting a travel package into the repository
	@PostMapping()
	public List<TravelPackage> saveTravelPackages(@RequestBody List<TravelPackage> travelPackage) {
		return travelPackageService.saveTravelPackage(travelPackage);
	}

	@PutMapping()
	public List<TravelPackage> updateTravelPackages(@RequestBody List<TravelPackage> travelPackage){
		return travelPackageService.saveTravelPackage(travelPackage);
	}
	
	// Request Mapping of the travel-package inquiry (single)
	@GetMapping("/{travelPackageId}")
	public Optional<TravelPackage> getTravelPackageById(@PathVariable("travelPackageId") Integer id) {
		return travelPackageService.findTravelPackageById(id);
	}

	//Deleting a travel package using its id
	@DeleteMapping("/{travelPackageId}")
	public void deleteTravelPackageById(@PathVariable() Integer id) {
		travelPackageService.deleteTravelPackageById(id);
	}

}
