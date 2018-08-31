package com.booker.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.booker.application.model.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

}
