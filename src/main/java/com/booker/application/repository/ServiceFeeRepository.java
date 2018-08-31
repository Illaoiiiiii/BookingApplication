package com.booker.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.booker.application.model.ServiceFee;

@Repository
public interface ServiceFeeRepository extends CrudRepository<ServiceFee, Integer> {

}
