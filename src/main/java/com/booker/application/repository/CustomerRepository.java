package com.booker.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.booker.application.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
