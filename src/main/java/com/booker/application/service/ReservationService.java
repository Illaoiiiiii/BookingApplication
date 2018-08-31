package com.booker.application.service;

import org.springframework.transaction.annotation.Transactional;

import com.booker.application.model.Reservation;
import com.booker.application.repository.ReservationRepository;

public class ReservationService {

	private ReservationRepository reservationRepository;
	private TravelPackageService travelPackageService;

	public ReservationService(ReservationRepository reservationRepository, TravelPackageService travelPackageService) {
		super();
		this.reservationRepository = reservationRepository;
		this.travelPackageService = travelPackageService;
	}

	@Transactional
	public Reservation reserve(Reservation reservation) {
		// check availed services if it's in a travel package first
		if (travelPackageService.validateReservation(reservation)) {
			return reservationRepository.save(reservation);
		} else {
			throw new Error("Availed services should be in a travel package");
		}
	}

	@Transactional
	public void deleteReservation(Reservation reservation) {
		reservationRepository.delete(reservation);
	}

	@Transactional
	public Reservation updateReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

}
