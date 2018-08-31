package com.booker.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.booker.application.model.Service;

@Repository
public interface TravelServiceRepository extends CrudRepository<Service, Integer> {
	
}
